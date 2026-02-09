package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.workaround.CorrectVideoTimeByTimebase;
import androidx.camera.video.internal.workaround.EncoderFinder;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class EncoderImpl implements Encoder {
    private static final boolean DEBUG = false;
    private static final long NO_LIMIT_LONG = Long.MAX_VALUE;
    private static final Range<Long> NO_RANGE = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    private static final long STOP_TIMEOUT_MS = 1000;
    private static final long TIMESTAMP_ANY = -1;
    private final Queue<CallbackToFutureAdapter.Completer<InputBuffer>> mAcquisitionQueue = new ArrayDeque();
    final Deque<Range<Long>> mActivePauseResumeTimeRanges = new ArrayDeque();
    final Set<EncodedDataImpl> mEncodedDataSet = new HashSet();
    EncoderCallback mEncoderCallback = EncoderCallback.EMPTY;
    Executor mEncoderCallbackExecutor = CameraXExecutors.directExecutor();
    final Executor mEncoderExecutor;
    final EncoderFinder mEncoderFinder;
    final Encoder.EncoderInput mEncoderInput;
    final Queue<Integer> mFreeInputBufferIndexQueue = new ArrayDeque();
    private final Set<InputBuffer> mInputBufferSet = new HashSet();
    private boolean mIsFlushedAfterEndOfStream = false;
    final boolean mIsVideoEncoder;
    Long mLastDataStopTimestamp = null;
    final Object mLock = new Object();
    final MediaCodec mMediaCodec;
    private final MediaFormat mMediaFormat;
    boolean mPendingCodecStop = false;
    private boolean mSourceStoppedSignalled = false;
    Range<Long> mStartStopTimeRangeUs = NO_RANGE;
    InternalState mState;
    Future<?> mStopTimeoutFuture = null;
    final String mTag;
    long mTotalPausedDurationUs = 0;

    enum InternalState {
        CONFIGURED,
        STARTED,
        PAUSED,
        STOPPING,
        PENDING_START,
        PENDING_START_PAUSED,
        PENDING_RELEASE,
        ERROR,
        RELEASED
    }

    public EncoderImpl(Executor executor, EncoderConfig encoderConfig) throws InvalidConfigException {
        EncoderFinder encoderFinder = new EncoderFinder();
        this.mEncoderFinder = encoderFinder;
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(encoderConfig);
        this.mEncoderExecutor = CameraXExecutors.newSequentialExecutor(executor);
        if (encoderConfig instanceof AudioEncoderConfig) {
            this.mTag = "AudioEncoder";
            this.mIsVideoEncoder = false;
            this.mEncoderInput = new ByteBufferInput();
        } else if (encoderConfig instanceof VideoEncoderConfig) {
            this.mTag = "VideoEncoder";
            this.mIsVideoEncoder = true;
            this.mEncoderInput = new SurfaceInput();
        } else {
            throw new InvalidConfigException("Unknown encoder config type");
        }
        MediaFormat mediaFormat = encoderConfig.toMediaFormat();
        this.mMediaFormat = mediaFormat;
        Logger.d(this.mTag, "mMediaFormat = " + mediaFormat);
        MediaCodec findEncoder = encoderFinder.findEncoder(mediaFormat, new MediaCodecList(1));
        this.mMediaCodec = findEncoder;
        Logger.i(this.mTag, "Selected encoder: " + findEncoder.getName());
        try {
            reset();
            setState(InternalState.CONFIGURED);
        } catch (MediaCodec.CodecException e) {
            throw new InvalidConfigException((Throwable) e);
        }
    }

    private void reset() {
        this.mStartStopTimeRangeUs = NO_RANGE;
        this.mTotalPausedDurationUs = 0;
        this.mActivePauseResumeTimeRanges.clear();
        this.mFreeInputBufferIndexQueue.clear();
        for (CallbackToFutureAdapter.Completer cancelled : this.mAcquisitionQueue) {
            cancelled.setCancelled();
        }
        this.mAcquisitionQueue.clear();
        this.mMediaCodec.reset();
        this.mIsFlushedAfterEndOfStream = false;
        this.mSourceStoppedSignalled = false;
        this.mPendingCodecStop = false;
        Future<?> future = this.mStopTimeoutFuture;
        if (future != null) {
            future.cancel(true);
            this.mStopTimeoutFuture = null;
        }
        this.mMediaCodec.setCallback(new MediaCodecCallback());
        this.mMediaCodec.configure(this.mMediaFormat, (Surface) null, (MediaCrypto) null, 1);
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).resetSurface();
        }
    }

    public Encoder.EncoderInput getInput() {
        return this.mEncoderInput;
    }

    public void start() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$start$0$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m217lambda$start$0$androidxcameravideointernalencoderEncoderImpl() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
                this.mLastDataStopTimestamp = null;
                long generatePresentationTimeUs = generatePresentationTimeUs();
                Logger.d(this.mTag, "Start on " + DebugUtils.readableUs(generatePresentationTimeUs));
                try {
                    if (this.mIsFlushedAfterEndOfStream) {
                        reset();
                    }
                    this.mStartStopTimeRangeUs = Range.create(Long.valueOf(generatePresentationTimeUs), Long.MAX_VALUE);
                    this.mMediaCodec.start();
                    Encoder.EncoderInput encoderInput = this.mEncoderInput;
                    if (encoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput).setActive(true);
                    }
                    setState(InternalState.STARTED);
                    return;
                } catch (MediaCodec.CodecException e) {
                    handleEncodeError(e);
                    return;
                }
            case 2:
            case 6:
            case 8:
                return;
            case 3:
                this.mLastDataStopTimestamp = null;
                Range removeLast = this.mActivePauseResumeTimeRanges.removeLast();
                Preconditions.checkState(removeLast != null && ((Long) removeLast.getUpper()).longValue() == Long.MAX_VALUE, "There should be a \"pause\" before \"resume\"");
                long longValue = ((Long) removeLast.getLower()).longValue();
                long generatePresentationTimeUs2 = generatePresentationTimeUs();
                this.mActivePauseResumeTimeRanges.addLast(Range.create(Long.valueOf(longValue), Long.valueOf(generatePresentationTimeUs2)));
                Logger.d(this.mTag, "Resume on " + DebugUtils.readableUs(generatePresentationTimeUs2) + "\nPaused duration = " + DebugUtils.readableUs(generatePresentationTimeUs2 - longValue));
                if ((this.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!this.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null)) {
                    setMediaCodecPaused(false);
                    Encoder.EncoderInput encoderInput2 = this.mEncoderInput;
                    if (encoderInput2 instanceof ByteBufferInput) {
                        ((ByteBufferInput) encoderInput2).setActive(true);
                    }
                }
                if (this.mIsVideoEncoder) {
                    requestKeyFrameToMediaCodec();
                }
                setState(InternalState.STARTED);
                return;
            case 4:
            case 5:
                setState(InternalState.PENDING_START);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    public void stop() {
        stop(-1);
    }

    public void stop(long j) {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda6(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$stop$3$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m220lambda$stop$3$androidxcameravideointernalencoderEncoderImpl(long j) {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return;
            case 2:
            case 3:
                InternalState internalState = this.mState;
                setState(InternalState.STOPPING);
                long longValue = this.mStartStopTimeRangeUs.getLower().longValue();
                if (longValue != Long.MAX_VALUE) {
                    if (j == -1) {
                        j = generatePresentationTimeUs();
                    } else if (j < longValue) {
                        Logger.w(this.mTag, "The expected stop time is less than the start time. Use current time as stop time.");
                        j = generatePresentationTimeUs();
                    }
                    if (j >= longValue) {
                        this.mStartStopTimeRangeUs = Range.create(Long.valueOf(longValue), Long.valueOf(j));
                        Logger.d(this.mTag, "Stop on " + DebugUtils.readableUs(j));
                        if (internalState != InternalState.PAUSED || this.mLastDataStopTimestamp == null) {
                            this.mPendingCodecStop = true;
                            this.mStopTimeoutFuture = CameraXExecutors.mainThreadExecutor().schedule(new EncoderImpl$$ExternalSyntheticLambda12(this), 1000, TimeUnit.MILLISECONDS);
                            return;
                        }
                        signalCodecStop();
                        return;
                    }
                    throw new AssertionError("The start time should be before the stop time.");
                }
                throw new AssertionError("There should be a \"start\" before \"stop\"");
            case 5:
            case 6:
                setState(InternalState.CONFIGURED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$stop$2$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m219lambda$stop$2$androidxcameravideointernalencoderEncoderImpl() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda14(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$stop$1$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m218lambda$stop$1$androidxcameravideointernalencoderEncoderImpl() {
        if (this.mPendingCodecStop) {
            Logger.w(this.mTag, "The data didn't reach the expected timestamp before timeout, stop the codec.");
            this.mLastDataStopTimestamp = null;
            signalCodecStop();
            this.mPendingCodecStop = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void signalCodecStop() {
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof ByteBufferInput) {
            ((ByteBufferInput) encoderInput).setActive(false);
            ArrayList arrayList = new ArrayList();
            for (InputBuffer terminationFuture : this.mInputBufferSet) {
                arrayList.add(terminationFuture.getTerminationFuture());
            }
            Futures.successfulAsList(arrayList).addListener(new EncoderImpl$$ExternalSyntheticLambda8(this), this.mEncoderExecutor);
        } else if (encoderInput instanceof SurfaceInput) {
            try {
                this.mMediaCodec.signalEndOfInputStream();
            } catch (MediaCodec.CodecException e) {
                handleEncodeError(e);
            }
        }
    }

    public void pause() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$pause$4$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m213lambda$pause$4$androidxcameravideointernalencoderEncoderImpl() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 8:
                return;
            case 2:
                long generatePresentationTimeUs = generatePresentationTimeUs();
                Logger.d(this.mTag, "Pause on " + DebugUtils.readableUs(generatePresentationTimeUs));
                this.mActivePauseResumeTimeRanges.addLast(Range.create(Long.valueOf(generatePresentationTimeUs), Long.MAX_VALUE));
                setState(InternalState.PAUSED);
                return;
            case 6:
                setState(InternalState.PENDING_START_PAUSED);
                return;
            case 7:
            case 9:
                throw new IllegalStateException("Encoder is released");
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    public void release() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda4(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$release$5$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m214lambda$release$5$androidxcameravideointernalencoderEncoderImpl() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                releaseInternal();
                return;
            case 4:
            case 5:
            case 6:
                setState(InternalState.PENDING_RELEASE);
                return;
            case 7:
            case 9:
                return;
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    public void signalSourceStopped() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda13(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$signalSourceStopped$6$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m216lambda$signalSourceStopped$6$androidxcameravideointernalencoderEncoderImpl() {
        this.mSourceStoppedSignalled = true;
        if (this.mIsFlushedAfterEndOfStream) {
            this.mMediaCodec.stop();
            reset();
        }
    }

    private void releaseInternal() {
        if (this.mIsFlushedAfterEndOfStream) {
            this.mMediaCodec.stop();
            this.mIsFlushedAfterEndOfStream = false;
        }
        this.mMediaCodec.release();
        Encoder.EncoderInput encoderInput = this.mEncoderInput;
        if (encoderInput instanceof SurfaceInput) {
            ((SurfaceInput) encoderInput).releaseSurface();
        }
        setState(InternalState.RELEASED);
    }

    public void setEncoderCallback(EncoderCallback encoderCallback, Executor executor) {
        synchronized (this.mLock) {
            this.mEncoderCallback = encoderCallback;
            this.mEncoderCallbackExecutor = executor;
        }
    }

    public void requestKeyFrame() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$requestKeyFrame$7$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m215lambda$requestKeyFrame$7$androidxcameravideointernalencoderEncoderImpl() {
        int i = AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()];
        if (i == 2) {
            requestKeyFrameToMediaCodec();
        } else if (i == 7 || i == 9) {
            throw new IllegalStateException("Encoder is released");
        }
    }

    private void setState(InternalState internalState) {
        if (this.mState != internalState) {
            Logger.d(this.mTag, "Transitioning encoder internal state: " + this.mState + " --> " + internalState);
            this.mState = internalState;
        }
    }

    /* access modifiers changed from: package-private */
    public void setMediaCodecPaused(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        this.mMediaCodec.setParameters(bundle);
    }

    /* access modifiers changed from: package-private */
    public void requestKeyFrameToMediaCodec() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        this.mMediaCodec.setParameters(bundle);
    }

    /* access modifiers changed from: private */
    public void signalEndOfInputStream() {
        Futures.addCallback(acquireInputBuffer(), new FutureCallback<InputBuffer>() {
            public void onSuccess(InputBuffer inputBuffer) {
                inputBuffer.setPresentationTimeUs(EncoderImpl.generatePresentationTimeUs());
                inputBuffer.setEndOfStream(true);
                inputBuffer.submit();
                Futures.addCallback(inputBuffer.getTerminationFuture(), new FutureCallback<Void>() {
                    public void onSuccess(Void voidR) {
                    }

                    public void onFailure(Throwable th) {
                        if (th instanceof MediaCodec.CodecException) {
                            EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th);
                        } else {
                            EncoderImpl.this.handleEncodeError(0, th.getMessage(), th);
                        }
                    }
                }, EncoderImpl.this.mEncoderExecutor);
            }

            public void onFailure(Throwable th) {
                EncoderImpl.this.handleEncodeError(0, "Unable to acquire InputBuffer.", th);
            }
        }, this.mEncoderExecutor);
    }

    /* access modifiers changed from: package-private */
    public void handleEncodeError(MediaCodec.CodecException codecException) {
        handleEncodeError(1, codecException.getMessage(), codecException);
    }

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState[] r0 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState = r0
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.CONFIGURED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.STOPPING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START_PAUSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.PENDING_RELEASE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.ERROR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.camera.video.internal.encoder.EncoderImpl$InternalState r1 = androidx.camera.video.internal.encoder.EncoderImpl.InternalState.RELEASED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.encoder.EncoderImpl.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public void handleEncodeError(int i, String str, Throwable th) {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
                m211lambda$handleEncodeError$8$androidxcameravideointernalencoderEncoderImpl(i, str, th);
                reset();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                setState(InternalState.ERROR);
                stopMediaCodec(new EncoderImpl$$ExternalSyntheticLambda2(this, i, str, th));
                return;
            case 8:
                Logger.w(this.mTag, "Get more than one error: " + str + "(" + i + ")", th);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: notifyError */
    public void m211lambda$handleEncodeError$8$androidxcameravideointernalencoderEncoderImpl(int i, String str, Throwable th) {
        EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.mLock) {
            encoderCallback = this.mEncoderCallback;
            executor = this.mEncoderCallbackExecutor;
        }
        try {
            executor.execute(new EncoderImpl$$ExternalSyntheticLambda5(encoderCallback, i, str, th));
        } catch (RejectedExecutionException e) {
            Logger.e(this.mTag, "Unable to post to the supplied executor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void stopMediaCodec(Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        for (EncodedDataImpl closedFuture : this.mEncodedDataSet) {
            arrayList.add(closedFuture.getClosedFuture());
        }
        for (InputBuffer terminationFuture : this.mInputBufferSet) {
            arrayList.add(terminationFuture.getTerminationFuture());
        }
        Futures.successfulAsList(arrayList).addListener(new EncoderImpl$$ExternalSyntheticLambda9(this, runnable), this.mEncoderExecutor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$stopMediaCodec$10$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m221lambda$stopMediaCodec$10$androidxcameravideointernalencoderEncoderImpl(Runnable runnable) {
        if (!(this.mEncoderInput instanceof SurfaceInput) || this.mSourceStoppedSignalled) {
            this.mMediaCodec.stop();
        } else {
            this.mMediaCodec.flush();
            this.mIsFlushedAfterEndOfStream = true;
        }
        if (runnable != null) {
            runnable.run();
        }
        handleStopped();
    }

    /* access modifiers changed from: package-private */
    public void handleStopped() {
        if (this.mState == InternalState.PENDING_RELEASE) {
            releaseInternal();
            return;
        }
        InternalState internalState = this.mState;
        if (!this.mIsFlushedAfterEndOfStream) {
            reset();
        }
        setState(InternalState.CONFIGURED);
        if (internalState == InternalState.PENDING_START || internalState == InternalState.PENDING_START_PAUSED) {
            start();
            if (internalState == InternalState.PENDING_START_PAUSED) {
                pause();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateTotalPausedDuration(long j) {
        while (!this.mActivePauseResumeTimeRanges.isEmpty()) {
            Range first = this.mActivePauseResumeTimeRanges.getFirst();
            if (j > ((Long) first.getUpper()).longValue()) {
                this.mActivePauseResumeTimeRanges.removeFirst();
                this.mTotalPausedDurationUs += ((Long) first.getUpper()).longValue() - ((Long) first.getLower()).longValue();
                Logger.d(this.mTag, "Total paused duration = " + DebugUtils.readableUs(this.mTotalPausedDurationUs));
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isInPauseRange(long j) {
        for (Range next : this.mActivePauseResumeTimeRanges) {
            if (!next.contains(Long.valueOf(j))) {
                if (j < ((Long) next.getLower()).longValue()) {
                    break;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public ListenableFuture<InputBuffer> acquireInputBuffer() {
        switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[this.mState.ordinal()]) {
            case 1:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is not started yet."));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                AtomicReference atomicReference = new AtomicReference();
                ListenableFuture<InputBuffer> future = CallbackToFutureAdapter.getFuture(new EncoderImpl$$ExternalSyntheticLambda10(atomicReference));
                CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
                this.mAcquisitionQueue.offer(completer);
                completer.addCancellationListener(new EncoderImpl$$ExternalSyntheticLambda11(this, completer), this.mEncoderExecutor);
                matchAcquisitionsAndFreeBufferIndexes();
                return future;
            case 8:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is in error state."));
            case 9:
                return Futures.immediateFailedFuture(new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: " + this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$acquireInputBuffer$12$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m210lambda$acquireInputBuffer$12$androidxcameravideointernalencoderEncoderImpl(CallbackToFutureAdapter.Completer completer) {
        this.mAcquisitionQueue.remove(completer);
    }

    /* access modifiers changed from: package-private */
    public void matchAcquisitionsAndFreeBufferIndexes() {
        while (!this.mAcquisitionQueue.isEmpty() && !this.mFreeInputBufferIndexQueue.isEmpty()) {
            CallbackToFutureAdapter.Completer poll = this.mAcquisitionQueue.poll();
            try {
                InputBufferImpl inputBufferImpl = new InputBufferImpl(this.mMediaCodec, this.mFreeInputBufferIndexQueue.poll().intValue());
                if (poll.set(inputBufferImpl)) {
                    this.mInputBufferSet.add(inputBufferImpl);
                    inputBufferImpl.getTerminationFuture().addListener(new EncoderImpl$$ExternalSyntheticLambda7(this, inputBufferImpl), this.mEncoderExecutor);
                } else {
                    inputBufferImpl.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                handleEncodeError(e);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$matchAcquisitionsAndFreeBufferIndexes$13$androidx-camera-video-internal-encoder-EncoderImpl  reason: not valid java name */
    public /* synthetic */ void m212lambda$matchAcquisitionsAndFreeBufferIndexes$13$androidxcameravideointernalencoderEncoderImpl(InputBufferImpl inputBufferImpl) {
        this.mInputBufferSet.remove(inputBufferImpl);
    }

    static long generatePresentationTimeUs() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    static boolean isKeyFrame(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    static boolean isEndOfStream(MediaCodec.BufferInfo bufferInfo) {
        return (bufferInfo.flags & 4) != 0;
    }

    class MediaCodecCallback extends MediaCodec.Callback {
        private final CorrectVideoTimeByTimebase mCorrectVideoTimestamp;
        private boolean mHasEndData = false;
        private boolean mHasFirstData = false;
        private boolean mHasSendStartCallback = false;
        private boolean mIsOutputBufferInPauseState = false;
        private long mLastPresentationTimeUs = 0;
        private long mLastSentPresentationTimeUs = 0;

        static /* synthetic */ MediaFormat lambda$onOutputFormatChanged$5(MediaFormat mediaFormat) {
            return mediaFormat;
        }

        MediaCodecCallback() {
            if (!EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.get(CameraUseInconsistentTimebaseQuirk.class) == null) {
                this.mCorrectVideoTimestamp = null;
            } else {
                this.mCorrectVideoTimestamp = new CorrectVideoTimeByTimebase();
            }
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda8(this, i));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onInputBufferAvailable$0$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m230lambda$onInputBufferAvailable$0$androidxcameravideointernalencoderEncoderImpl$MediaCodecCallback(int i) {
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    EncoderImpl.this.mFreeInputBufferIndexQueue.offer(Integer.valueOf(i));
                    EncoderImpl.this.matchAcquisitionsAndFreeBufferIndexes();
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda5(this, bufferInfo, mediaCodec, i));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onOutputBufferAvailable$2$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m232lambda$onOutputBufferAvailable$2$androidxcameravideointernalencoderEncoderImpl$MediaCodecCallback(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
            EncoderCallback encoderCallback;
            Executor executor;
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (EncoderImpl.this.mLock) {
                        encoderCallback = EncoderImpl.this.mEncoderCallback;
                        executor = EncoderImpl.this.mEncoderCallbackExecutor;
                    }
                    CorrectVideoTimeByTimebase correctVideoTimeByTimebase = this.mCorrectVideoTimestamp;
                    if (correctVideoTimeByTimebase != null) {
                        correctVideoTimeByTimebase.correctTimestamp(bufferInfo);
                    }
                    if (!this.mHasSendStartCallback) {
                        this.mHasSendStartCallback = true;
                        try {
                            Objects.requireNonNull(encoderCallback);
                            executor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda6(encoderCallback));
                        } catch (RejectedExecutionException e) {
                            Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                        }
                    }
                    if (!checkBufferInfo(bufferInfo)) {
                        if (!this.mHasFirstData) {
                            this.mHasFirstData = true;
                        }
                        if (EncoderImpl.this.mTotalPausedDurationUs > 0) {
                            bufferInfo.presentationTimeUs -= EncoderImpl.this.mTotalPausedDurationUs;
                        }
                        this.mLastSentPresentationTimeUs = bufferInfo.presentationTimeUs;
                        try {
                            sendEncodedData(new EncodedDataImpl(mediaCodec, i, bufferInfo), encoderCallback, executor);
                        } catch (MediaCodec.CodecException e2) {
                            EncoderImpl.this.handleEncodeError(e2);
                            return;
                        }
                    } else {
                        try {
                            EncoderImpl.this.mMediaCodec.releaseOutputBuffer(i, false);
                        } catch (MediaCodec.CodecException e3) {
                            EncoderImpl.this.handleEncodeError(e3);
                            return;
                        }
                    }
                    if (!this.mHasEndData && EncoderImpl.isEndOfStream(bufferInfo)) {
                        this.mHasEndData = true;
                        EncoderImpl.this.stopMediaCodec(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda7(this, executor, encoderCallback));
                        return;
                    }
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onOutputBufferAvailable$1$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m231lambda$onOutputBufferAvailable$1$androidxcameravideointernalencoderEncoderImpl$MediaCodecCallback(Executor executor, EncoderCallback encoderCallback) {
            if (EncoderImpl.this.mState != InternalState.ERROR) {
                try {
                    Objects.requireNonNull(encoderCallback);
                    executor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda9(encoderCallback));
                } catch (RejectedExecutionException e) {
                    Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                }
            }
        }

        private void sendEncodedData(final EncodedDataImpl encodedDataImpl, EncoderCallback encoderCallback, Executor executor) {
            EncoderImpl.this.mEncodedDataSet.add(encodedDataImpl);
            Futures.addCallback(encodedDataImpl.getClosedFuture(), new FutureCallback<Void>() {
                public void onSuccess(Void voidR) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                }

                public void onFailure(Throwable th) {
                    EncoderImpl.this.mEncodedDataSet.remove(encodedDataImpl);
                    if (th instanceof MediaCodec.CodecException) {
                        EncoderImpl.this.handleEncodeError((MediaCodec.CodecException) th);
                    } else {
                        EncoderImpl.this.handleEncodeError(0, th.getMessage(), th);
                    }
                }
            }, EncoderImpl.this.mEncoderExecutor);
            try {
                executor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda10(encoderCallback, encodedDataImpl));
            } catch (RejectedExecutionException e) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                encodedDataImpl.close();
            }
        }

        private boolean checkBufferInfo(MediaCodec.BufferInfo bufferInfo) {
            if (this.mHasEndData) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by already reach end of stream.");
                return true;
            } else if (bufferInfo.size <= 0) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by invalid buffer size.");
                return true;
            } else if ((bufferInfo.flags & 2) != 0) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by codec config.");
                return true;
            } else if (bufferInfo.presentationTimeUs <= this.mLastPresentationTimeUs) {
                Logger.d(EncoderImpl.this.mTag, "Drop buffer by out of order buffer from MediaCodec.");
                return true;
            } else {
                this.mLastPresentationTimeUs = bufferInfo.presentationTimeUs;
                if (!EncoderImpl.this.mStartStopTimeRangeUs.contains(Long.valueOf(bufferInfo.presentationTimeUs))) {
                    Logger.d(EncoderImpl.this.mTag, "Drop buffer by not in start-stop range.");
                    if (EncoderImpl.this.mPendingCodecStop && bufferInfo.presentationTimeUs >= EncoderImpl.this.mStartStopTimeRangeUs.getUpper().longValue()) {
                        if (EncoderImpl.this.mStopTimeoutFuture != null) {
                            EncoderImpl.this.mStopTimeoutFuture.cancel(true);
                        }
                        EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                        EncoderImpl.this.signalCodecStop();
                        EncoderImpl.this.mPendingCodecStop = false;
                    }
                    return true;
                } else if (updatePauseRangeStateAndCheckIfBufferPaused(bufferInfo)) {
                    Logger.d(EncoderImpl.this.mTag, "Drop buffer by pause.");
                    return true;
                } else if (this.mHasFirstData || !EncoderImpl.this.mIsVideoEncoder || EncoderImpl.isKeyFrame(bufferInfo)) {
                    return false;
                } else {
                    Logger.d(EncoderImpl.this.mTag, "Drop buffer by first video frame is not key frame.");
                    EncoderImpl.this.requestKeyFrameToMediaCodec();
                    return true;
                }
            }
        }

        private boolean updatePauseRangeStateAndCheckIfBufferPaused(MediaCodec.BufferInfo bufferInfo) {
            Executor executor;
            EncoderCallback encoderCallback;
            EncoderImpl.this.updateTotalPausedDuration(bufferInfo.presentationTimeUs);
            boolean isInPauseRange = EncoderImpl.this.isInPauseRange(bufferInfo.presentationTimeUs);
            boolean z = this.mIsOutputBufferInPauseState;
            if (!z && isInPauseRange) {
                Logger.d(EncoderImpl.this.mTag, "Switch to pause state");
                this.mIsOutputBufferInPauseState = true;
                synchronized (EncoderImpl.this.mLock) {
                    executor = EncoderImpl.this.mEncoderCallbackExecutor;
                    encoderCallback = EncoderImpl.this.mEncoderCallback;
                }
                Objects.requireNonNull(encoderCallback);
                executor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda0(encoderCallback));
                if (EncoderImpl.this.mState == InternalState.PAUSED && ((EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                    if (EncoderImpl.this.mEncoderInput instanceof ByteBufferInput) {
                        ((ByteBufferInput) EncoderImpl.this.mEncoderInput).setActive(false);
                    }
                    EncoderImpl.this.setMediaCodecPaused(true);
                }
                EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo.presentationTimeUs);
                if (EncoderImpl.this.mPendingCodecStop) {
                    if (EncoderImpl.this.mStopTimeoutFuture != null) {
                        EncoderImpl.this.mStopTimeoutFuture.cancel(true);
                    }
                    EncoderImpl.this.signalCodecStop();
                    EncoderImpl.this.mPendingCodecStop = false;
                }
            } else if (z && !isInPauseRange) {
                if (EncoderImpl.this.mIsVideoEncoder && !EncoderImpl.isKeyFrame(bufferInfo)) {
                    Logger.d(EncoderImpl.this.mTag, "Not a key frame, don't switch to resume state.");
                    EncoderImpl.this.requestKeyFrameToMediaCodec();
                } else if (bufferInfo.presentationTimeUs - EncoderImpl.this.mTotalPausedDurationUs > this.mLastSentPresentationTimeUs) {
                    Logger.d(EncoderImpl.this.mTag, "Switch to resume state");
                    this.mIsOutputBufferInPauseState = false;
                } else {
                    Logger.d(EncoderImpl.this.mTag, "Adjusted time by pause duration is invalid.");
                }
            }
            return this.mIsOutputBufferInPauseState;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda2(this, codecException));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onError$4$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m229lambda$onError$4$androidxcameravideointernalencoderEncoderImpl$MediaCodecCallback(MediaCodec.CodecException codecException) {
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    EncoderImpl.this.handleEncodeError(codecException);
                    return;
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda1(this, mediaFormat));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onOutputFormatChanged$7$androidx-camera-video-internal-encoder-EncoderImpl$MediaCodecCallback  reason: not valid java name */
        public /* synthetic */ void m233lambda$onOutputFormatChanged$7$androidxcameravideointernalencoderEncoderImpl$MediaCodecCallback(MediaFormat mediaFormat) {
            EncoderCallback encoderCallback;
            Executor executor;
            switch (AnonymousClass2.$SwitchMap$androidx$camera$video$internal$encoder$EncoderImpl$InternalState[EncoderImpl.this.mState.ordinal()]) {
                case 1:
                case 8:
                case 9:
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    synchronized (EncoderImpl.this.mLock) {
                        encoderCallback = EncoderImpl.this.mEncoderCallback;
                        executor = EncoderImpl.this.mEncoderCallbackExecutor;
                    }
                    try {
                        executor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda3(encoderCallback, mediaFormat));
                        return;
                    } catch (RejectedExecutionException e) {
                        Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                        return;
                    }
                default:
                    throw new IllegalStateException("Unknown state: " + EncoderImpl.this.mState);
            }
        }
    }

    class SurfaceInput implements Encoder.SurfaceInput {
        private final Object mLock = new Object();
        private final Set<Surface> mObsoleteSurfaces = new HashSet();
        private Surface mSurface;
        private Executor mSurfaceUpdateExecutor;
        private Encoder.SurfaceInput.OnSurfaceUpdateListener mSurfaceUpdateListener;

        SurfaceInput() {
        }

        public void setOnSurfaceUpdateListener(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener) {
            Surface surface;
            synchronized (this.mLock) {
                this.mSurfaceUpdateListener = (Encoder.SurfaceInput.OnSurfaceUpdateListener) Preconditions.checkNotNull(onSurfaceUpdateListener);
                this.mSurfaceUpdateExecutor = (Executor) Preconditions.checkNotNull(executor);
                surface = this.mSurface;
            }
            if (surface != null) {
                notifySurfaceUpdate(executor, onSurfaceUpdateListener, surface);
            }
        }

        /* access modifiers changed from: package-private */
        public void resetSurface() {
            Surface surface;
            Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener;
            Executor executor;
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (this.mLock) {
                if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                    if (this.mSurface == null) {
                        surface = Api23Impl.createPersistentInputSurface();
                        this.mSurface = surface;
                    } else {
                        surface = null;
                    }
                    Api23Impl.setInputSurface(EncoderImpl.this.mMediaCodec, this.mSurface);
                } else {
                    Surface surface2 = this.mSurface;
                    if (surface2 != null) {
                        this.mObsoleteSurfaces.add(surface2);
                    }
                    surface = EncoderImpl.this.mMediaCodec.createInputSurface();
                    this.mSurface = surface;
                }
                onSurfaceUpdateListener = this.mSurfaceUpdateListener;
                executor = this.mSurfaceUpdateExecutor;
            }
            if (surface != null && onSurfaceUpdateListener != null && executor != null) {
                notifySurfaceUpdate(executor, onSurfaceUpdateListener, surface);
            }
        }

        /* access modifiers changed from: package-private */
        public void releaseSurface() {
            Surface surface;
            HashSet<Surface> hashSet;
            synchronized (this.mLock) {
                surface = this.mSurface;
                this.mSurface = null;
                hashSet = new HashSet<>(this.mObsoleteSurfaces);
                this.mObsoleteSurfaces.clear();
            }
            if (surface != null) {
                surface.release();
            }
            for (Surface release : hashSet) {
                release.release();
            }
        }

        private void notifySurfaceUpdate(Executor executor, Encoder.SurfaceInput.OnSurfaceUpdateListener onSurfaceUpdateListener, Surface surface) {
            try {
                executor.execute(new EncoderImpl$SurfaceInput$$ExternalSyntheticLambda0(onSurfaceUpdateListener, surface));
            } catch (RejectedExecutionException e) {
                Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
            }
        }
    }

    class ByteBufferInput implements Encoder.ByteBufferInput {
        private final List<ListenableFuture<InputBuffer>> mAcquisitionList = new ArrayList();
        private BufferProvider.State mBufferProviderState = BufferProvider.State.INACTIVE;
        private final Map<Observable.Observer<? super BufferProvider.State>, Executor> mStateObservers = new LinkedHashMap();

        ByteBufferInput() {
        }

        public ListenableFuture<BufferProvider.State> fetchData() {
            return CallbackToFutureAdapter.getFuture(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda8(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$fetchData$0$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m226lambda$fetchData$0$androidxcameravideointernalencoderEncoderImpl$ByteBufferInput(CallbackToFutureAdapter.Completer completer) {
            completer.set(this.mBufferProviderState);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$fetchData$1$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ Object m227lambda$fetchData$1$androidxcameravideointernalencoderEncoderImpl$ByteBufferInput(CallbackToFutureAdapter.Completer completer) throws Exception {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda4(this, completer));
            return "fetchData";
        }

        public ListenableFuture<InputBuffer> acquireBuffer() {
            return CallbackToFutureAdapter.getFuture(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda3(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$acquireBuffer$5$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ Object m224lambda$acquireBuffer$5$androidxcameravideointernalencoderEncoderImpl$ByteBufferInput(CallbackToFutureAdapter.Completer completer) throws Exception {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda1(this, completer));
            return "acquireBuffer";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$acquireBuffer$4$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m223lambda$acquireBuffer$4$androidxcameravideointernalencoderEncoderImpl$ByteBufferInput(CallbackToFutureAdapter.Completer completer) {
            if (this.mBufferProviderState == BufferProvider.State.ACTIVE) {
                ListenableFuture<InputBuffer> acquireInputBuffer = EncoderImpl.this.acquireInputBuffer();
                Futures.propagate(acquireInputBuffer, completer);
                completer.addCancellationListener(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda5(acquireInputBuffer), CameraXExecutors.directExecutor());
                this.mAcquisitionList.add(acquireInputBuffer);
                acquireInputBuffer.addListener(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda6(this, acquireInputBuffer), EncoderImpl.this.mEncoderExecutor);
            } else if (this.mBufferProviderState == BufferProvider.State.INACTIVE) {
                completer.setException(new IllegalStateException("BufferProvider is not active."));
            } else {
                completer.setException(new IllegalStateException("Unknown state: " + this.mBufferProviderState));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$acquireBuffer$3$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m222lambda$acquireBuffer$3$androidxcameravideointernalencoderEncoderImpl$ByteBufferInput(ListenableFuture listenableFuture) {
            this.mAcquisitionList.remove(listenableFuture);
        }

        public void addObserver(Executor executor, Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda9(this, observer, executor));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$addObserver$7$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m225lambda$addObserver$7$androidxcameravideointernalencoderEncoderImpl$ByteBufferInput(Observable.Observer observer, Executor executor) {
            this.mStateObservers.put((Observable.Observer) Preconditions.checkNotNull(observer), (Executor) Preconditions.checkNotNull(executor));
            executor.execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2(observer, this.mBufferProviderState));
        }

        public void removeObserver(Observable.Observer<? super BufferProvider.State> observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda7(this, observer));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$removeObserver$8$androidx-camera-video-internal-encoder-EncoderImpl$ByteBufferInput  reason: not valid java name */
        public /* synthetic */ void m228lambda$removeObserver$8$androidxcameravideointernalencoderEncoderImpl$ByteBufferInput(Observable.Observer observer) {
            this.mStateObservers.remove(Preconditions.checkNotNull(observer));
        }

        /* access modifiers changed from: package-private */
        public void setActive(boolean z) {
            BufferProvider.State state = z ? BufferProvider.State.ACTIVE : BufferProvider.State.INACTIVE;
            if (this.mBufferProviderState != state) {
                this.mBufferProviderState = state;
                if (state == BufferProvider.State.INACTIVE) {
                    for (ListenableFuture<InputBuffer> cancel : this.mAcquisitionList) {
                        cancel.cancel(true);
                    }
                    this.mAcquisitionList.clear();
                }
                for (Map.Entry next : this.mStateObservers.entrySet()) {
                    try {
                        ((Executor) next.getValue()).execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda0(next, state));
                    } catch (RejectedExecutionException e) {
                        Logger.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                    }
                }
            }
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static Surface createPersistentInputSurface() {
            return MediaCodec.createPersistentInputSurface();
        }

        static void setInputSurface(MediaCodec mediaCodec, Surface surface) {
            mediaCodec.setInputSurface(surface);
        }
    }
}
