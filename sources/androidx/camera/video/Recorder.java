package androidx.camera.video;

import android.content.ContentValues;
import android.content.Context;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CamcorderProfileProxy;
import androidx.camera.core.impl.MutableStateObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.StateObservable;
import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.internal.AudioSource;
import androidx.camera.video.internal.AudioSourceAccessException;
import androidx.camera.video.internal.ResourceCreationException;
import androidx.camera.video.internal.compat.Api26Impl;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.config.AudioSourceSettingsCamcorderProfileResolver;
import androidx.camera.video.internal.config.AudioSourceSettingsDefaultResolver;
import androidx.camera.video.internal.config.MimeInfo;
import androidx.camera.video.internal.config.VideoEncoderConfigCamcorderProfileResolver;
import androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.OutputConfig;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.utils.OutputUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class Recorder implements VideoOutput {
    static final EncoderFactory DEFAULT_ENCODER_FACTORY = new Recorder$$ExternalSyntheticLambda15();
    public static final QualitySelector DEFAULT_QUALITY_SELECTOR;
    private static final String MEDIA_COLUMN = "_data";
    private static final MediaSpec MEDIA_SPEC_DEFAULT;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final Exception PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE = new RuntimeException("The video frame producer became inactive before any data was received.");
    private static final Set<State> PENDING_STATES = Collections.unmodifiableSet(EnumSet.of(State.PENDING_RECORDING, State.PENDING_PAUSED));
    private static final long SOURCE_NON_STREAMING_TIMEOUT_MS = 1000;
    private static final String TAG = "Recorder";
    private static final Set<State> VALID_NON_PENDING_STATES_WHILE_PENDING = Collections.unmodifiableSet(EnumSet.of(State.INITIALIZING, State.IDLING, State.RESETTING, State.STOPPING, State.ERROR));
    private static final VideoSpec VIDEO_SPEC_DEFAULT;
    RecordingRecord mActiveRecordingRecord = null;
    Surface mActiveSurface = null;
    Encoder mAudioEncoder = null;
    private final EncoderFactory mAudioEncoderFactory;
    Throwable mAudioErrorCause = null;
    OutputConfig mAudioOutputConfig = null;
    AudioSource mAudioSource = null;
    AudioState mAudioState = AudioState.INITIALIZING;
    Integer mAudioTrackIndex = null;
    final List<ListenableFuture<Void>> mEncodingFutures = new ArrayList();
    private final Executor mExecutor;
    long mFileSizeLimitInBytes = 0;
    long mFirstRecordingVideoDataTimeUs = 0;
    private RecordingRecord mInProgressRecording = null;
    boolean mInProgressRecordingStopping = false;
    boolean mIsAudioSourceSilenced = false;
    private long mLastGeneratedRecordingId = 0;
    Surface mLatestSurface = null;
    private final Object mLock = new Object();
    MediaMuxer mMediaMuxer = null;
    final MutableStateObservable<MediaSpec> mMediaSpec;
    private State mNonPendingState = null;
    Uri mOutputUri = Uri.EMPTY;
    EncodedData mPendingFirstAudioData = null;
    EncodedData mPendingFirstVideoData = null;
    RecordingRecord mPendingRecordingRecord = null;
    long mRecordingBytes = 0;
    long mRecordingDurationNs = 0;
    int mRecordingStopError = 1;
    Throwable mRecordingStopErrorCause = null;
    private CamcorderProfileProxy mResolvedCamcorderProfile = null;
    final Executor mSequentialExecutor;
    private boolean mShouldWaitForNewSurface;
    private ScheduledFuture<?> mSourceNonStreamingTimeout = null;
    VideoOutput.SourceState mSourceState = VideoOutput.SourceState.INACTIVE;
    private State mState = State.INITIALIZING;
    int mStreamId = 0;
    private final MutableStateObservable<StreamInfo> mStreamInfo;
    SurfaceRequest mSurfaceRequest;
    private SurfaceRequest.TransformationInfo mSurfaceTransformationInfo = null;
    private final Executor mUserProvidedExecutor;
    Encoder mVideoEncoder = null;
    private final EncoderFactory mVideoEncoderFactory;
    OutputConfig mVideoOutputConfig = null;
    Integer mVideoTrackIndex = null;

    enum AudioState {
        INITIALIZING,
        IDLING,
        DISABLED,
        ACTIVE,
        ERROR
    }

    enum State {
        INITIALIZING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        QualitySelector fromOrderedList = QualitySelector.fromOrderedList(Arrays.asList(new Quality[]{Quality.FHD, Quality.HD, Quality.SD}), FallbackStrategy.higherQualityOrLowerThan(Quality.FHD));
        DEFAULT_QUALITY_SELECTOR = fromOrderedList;
        VideoSpec build = VideoSpec.builder().setQualitySelector(fromOrderedList).setAspectRatio(1).build();
        VIDEO_SPEC_DEFAULT = build;
        MEDIA_SPEC_DEFAULT = MediaSpec.builder().setOutputFormat(-1).setVideoSpec(build).build();
    }

    Recorder(Executor executor, MediaSpec mediaSpec, EncoderFactory encoderFactory, EncoderFactory encoderFactory2) {
        this.mUserProvidedExecutor = executor;
        executor = executor == null ? CameraXExecutors.ioExecutor() : executor;
        this.mExecutor = executor;
        this.mSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
        this.mMediaSpec = MutableStateObservable.withInitialState(composeRecorderMediaSpec(mediaSpec));
        this.mStreamInfo = MutableStateObservable.withInitialState(StreamInfo.of(this.mStreamId, internalStateToStreamState(this.mState)));
        this.mVideoEncoderFactory = encoderFactory;
        this.mAudioEncoderFactory = encoderFactory2;
    }

    public void onSurfaceRequested(SurfaceRequest surfaceRequest) {
        synchronized (this.mLock) {
            Logger.d(TAG, "Surface is requested in state: " + this.mState + ", Current surface: " + this.mStreamId);
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.mSequentialExecutor.execute(new Recorder$$ExternalSyntheticLambda16(this, surfaceRequest));
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Surface was requested when the Recorder had been initialized with state " + this.mState);
                case 9:
                    Logger.w(TAG, "Surface was requested when the Recorder had encountered error.");
                    setState(State.INITIALIZING);
                    this.mSequentialExecutor.execute(new Recorder$$ExternalSyntheticLambda17(this, surfaceRequest));
                    break;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onSurfaceRequested$0$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m182lambda$onSurfaceRequested$0$androidxcameravideoRecorder(SurfaceRequest surfaceRequest) {
        this.mSurfaceRequest = surfaceRequest;
        initializeInternal(surfaceRequest);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onSurfaceRequested$1$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m183lambda$onSurfaceRequested$1$androidxcameravideoRecorder(SurfaceRequest surfaceRequest) {
        SurfaceRequest surfaceRequest2 = this.mSurfaceRequest;
        if (surfaceRequest2 != null) {
            surfaceRequest2.willNotProvideSurface();
        }
        this.mSurfaceRequest = surfaceRequest;
        initializeInternal(surfaceRequest);
    }

    public Observable<MediaSpec> getMediaSpec() {
        return this.mMediaSpec;
    }

    public Observable<StreamInfo> getStreamInfo() {
        return this.mStreamInfo;
    }

    public void onSourceStateChanged(VideoOutput.SourceState sourceState) {
        this.mSequentialExecutor.execute(new Recorder$$ExternalSyntheticLambda9(this, sourceState));
    }

    public PendingRecording prepareRecording(Context context, FileOutputOptions fileOutputOptions) {
        return prepareRecordingInternal(context, fileOutputOptions);
    }

    public PendingRecording prepareRecording(Context context, FileDescriptorOutputOptions fileDescriptorOutputOptions) {
        if (Build.VERSION.SDK_INT >= 26) {
            return prepareRecordingInternal(context, fileDescriptorOutputOptions);
        }
        throw new UnsupportedOperationException("File descriptors as output destinations are not supported on pre-Android O (API 26) devices.");
    }

    public PendingRecording prepareRecording(Context context, MediaStoreOutputOptions mediaStoreOutputOptions) {
        return prepareRecordingInternal(context, mediaStoreOutputOptions);
    }

    private PendingRecording prepareRecordingInternal(Context context, OutputOptions outputOptions) {
        Preconditions.checkNotNull(outputOptions, "The OutputOptions cannot be null.");
        return new PendingRecording(context, this, outputOptions);
    }

    public QualitySelector getQualitySelector() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getQualitySelector();
    }

    /* access modifiers changed from: package-private */
    public int getAudioSource() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getSource();
    }

    public Executor getExecutor() {
        return this.mUserProvidedExecutor;
    }

    /* access modifiers changed from: package-private */
    public int getAspectRatio() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getVideoSpec().getAspectRatio();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        r4 = r3;
        r3 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.video.Recording start(androidx.camera.video.PendingRecording r9) {
        /*
            r8 = this;
            java.lang.String r0 = "The given PendingRecording cannot be null."
            androidx.core.util.Preconditions.checkNotNull(r9, r0)
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            long r1 = r8.mLastGeneratedRecordingId     // Catch:{ all -> 0x00ba }
            r3 = 1
            long r1 = r1 + r3
            r8.mLastGeneratedRecordingId = r1     // Catch:{ all -> 0x00ba }
            int[] r3 = androidx.camera.video.Recorder.AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ all -> 0x00ba }
            androidx.camera.video.Recorder$State r4 = r8.mState     // Catch:{ all -> 0x00ba }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x00ba }
            r3 = r3[r4]     // Catch:{ all -> 0x00ba }
            r4 = 0
            r5 = 0
            switch(r3) {
                case 1: goto L_0x002f;
                case 2: goto L_0x002f;
                case 3: goto L_0x0026;
                case 4: goto L_0x0026;
                case 5: goto L_0x002f;
                case 6: goto L_0x002f;
                case 7: goto L_0x0020;
                case 8: goto L_0x0020;
                case 9: goto L_0x002f;
                default: goto L_0x001e;
            }     // Catch:{ all -> 0x00ba }
        L_0x001e:
            goto L_0x0087
        L_0x0020:
            androidx.camera.video.Recorder$RecordingRecord r3 = r8.mActiveRecordingRecord     // Catch:{ all -> 0x00ba }
        L_0x0022:
            r7 = r4
            r4 = r3
            r3 = r7
            goto L_0x0088
        L_0x0026:
            androidx.camera.video.Recorder$RecordingRecord r3 = r8.mPendingRecordingRecord     // Catch:{ all -> 0x00ba }
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x00ba }
            androidx.camera.video.Recorder$RecordingRecord r3 = (androidx.camera.video.Recorder.RecordingRecord) r3     // Catch:{ all -> 0x00ba }
            goto L_0x0022
        L_0x002f:
            androidx.camera.video.Recorder$State r3 = r8.mState     // Catch:{ all -> 0x00ba }
            androidx.camera.video.Recorder$State r6 = androidx.camera.video.Recorder.State.IDLING     // Catch:{ all -> 0x00ba }
            if (r3 != r6) goto L_0x0045
            androidx.camera.video.Recorder$RecordingRecord r3 = r8.mActiveRecordingRecord     // Catch:{ all -> 0x00ba }
            if (r3 != 0) goto L_0x003f
            androidx.camera.video.Recorder$RecordingRecord r3 = r8.mPendingRecordingRecord     // Catch:{ all -> 0x00ba }
            if (r3 != 0) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = r5
        L_0x0040:
            java.lang.String r6 = "Expected recorder to be idle but a recording is either pending or in progress."
            androidx.core.util.Preconditions.checkState(r3, r6)     // Catch:{ all -> 0x00ba }
        L_0x0045:
            androidx.camera.video.Recorder$RecordingRecord r3 = androidx.camera.video.Recorder.RecordingRecord.from(r9, r1)     // Catch:{ IOException -> 0x0084 }
            android.content.Context r6 = r9.getApplicationContext()     // Catch:{ IOException -> 0x0084 }
            r3.initializeRecording(r6)     // Catch:{ IOException -> 0x0084 }
            r8.mPendingRecordingRecord = r3     // Catch:{ IOException -> 0x0084 }
            androidx.camera.video.Recorder$State r3 = r8.mState     // Catch:{ IOException -> 0x0084 }
            androidx.camera.video.Recorder$State r6 = androidx.camera.video.Recorder.State.IDLING     // Catch:{ IOException -> 0x0084 }
            if (r3 != r6) goto L_0x0068
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch:{ IOException -> 0x0084 }
            r8.setState(r3)     // Catch:{ IOException -> 0x0084 }
            java.util.concurrent.Executor r3 = r8.mSequentialExecutor     // Catch:{ IOException -> 0x0084 }
            androidx.camera.video.Recorder$$ExternalSyntheticLambda13 r6 = new androidx.camera.video.Recorder$$ExternalSyntheticLambda13     // Catch:{ IOException -> 0x0084 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0084 }
            r3.execute(r6)     // Catch:{ IOException -> 0x0084 }
            goto L_0x0087
        L_0x0068:
            androidx.camera.video.Recorder$State r3 = r8.mState     // Catch:{ IOException -> 0x0084 }
            androidx.camera.video.Recorder$State r6 = androidx.camera.video.Recorder.State.ERROR     // Catch:{ IOException -> 0x0084 }
            if (r3 != r6) goto L_0x007e
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch:{ IOException -> 0x0084 }
            r8.setState(r3)     // Catch:{ IOException -> 0x0084 }
            java.util.concurrent.Executor r3 = r8.mSequentialExecutor     // Catch:{ IOException -> 0x0084 }
            androidx.camera.video.Recorder$$ExternalSyntheticLambda14 r6 = new androidx.camera.video.Recorder$$ExternalSyntheticLambda14     // Catch:{ IOException -> 0x0084 }
            r6.<init>(r8)     // Catch:{ IOException -> 0x0084 }
            r3.execute(r6)     // Catch:{ IOException -> 0x0084 }
            goto L_0x0087
        L_0x007e:
            androidx.camera.video.Recorder$State r3 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch:{ IOException -> 0x0084 }
            r8.setState(r3)     // Catch:{ IOException -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r3 = move-exception
            r5 = 5
            goto L_0x0088
        L_0x0087:
            r3 = r4
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            if (r4 != 0) goto L_0x00b2
            if (r5 == 0) goto L_0x00ad
            java.lang.String r0 = "Recorder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Recording was started when the Recorder had encountered error "
            r4.<init>(r6)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            androidx.camera.core.Logger.e(r0, r4)
            androidx.camera.video.Recorder$RecordingRecord r0 = androidx.camera.video.Recorder.RecordingRecord.from(r9, r1)
            r8.finalizePendingRecording(r0, r5, r3)
            androidx.camera.video.Recording r9 = androidx.camera.video.Recording.createFinalizedFrom(r9, r1)
            return r9
        L_0x00ad:
            androidx.camera.video.Recording r9 = androidx.camera.video.Recording.from(r9, r1)
            return r9
        L_0x00b2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."
            r9.<init>(r0)
            throw r9
        L_0x00ba:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.start(androidx.camera.video.PendingRecording):androidx.camera.video.Recording");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$start$3$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m188lambda$start$3$androidxcameravideoRecorder() {
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        if (surfaceRequest != null) {
            initializeInternal(surfaceRequest);
            return;
        }
        throw new AssertionError("surface request is required to retry initialization.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pause(androidx.camera.video.Recording r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Called pause() from invalid state: "
            java.lang.String r1 = "pause() called on a recording that is no longer active: "
            java.lang.Object r2 = r4.mLock
            monitor-enter(r2)
            androidx.camera.video.Recorder$RecordingRecord r3 = r4.mPendingRecordingRecord     // Catch:{ all -> 0x0074 }
            boolean r3 = isSameRecording(r5, r3)     // Catch:{ all -> 0x0074 }
            if (r3 != 0) goto L_0x002f
            androidx.camera.video.Recorder$RecordingRecord r3 = r4.mActiveRecordingRecord     // Catch:{ all -> 0x0074 }
            boolean r3 = isSameRecording(r5, r3)     // Catch:{ all -> 0x0074 }
            if (r3 != 0) goto L_0x002f
            java.lang.String r0 = "Recorder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r3.<init>(r1)     // Catch:{ all -> 0x0074 }
            androidx.camera.video.OutputOptions r5 = r5.getOutputOptions()     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0074 }
            androidx.camera.core.Logger.d(r0, r5)     // Catch:{ all -> 0x0074 }
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            return
        L_0x002f:
            int[] r5 = androidx.camera.video.Recorder.AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ all -> 0x0074 }
            androidx.camera.video.Recorder$State r1 = r4.mState     // Catch:{ all -> 0x0074 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0074 }
            r5 = r5[r1]     // Catch:{ all -> 0x0074 }
            r1 = 3
            if (r5 == r1) goto L_0x006d
            r1 = 5
            if (r5 == r1) goto L_0x0058
            r1 = 6
            if (r5 == r1) goto L_0x0058
            r0 = 7
            if (r5 == r0) goto L_0x0046
            goto L_0x0072
        L_0x0046:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.PAUSED     // Catch:{ all -> 0x0074 }
            r4.setState(r5)     // Catch:{ all -> 0x0074 }
            androidx.camera.video.Recorder$RecordingRecord r5 = r4.mActiveRecordingRecord     // Catch:{ all -> 0x0074 }
            java.util.concurrent.Executor r0 = r4.mSequentialExecutor     // Catch:{ all -> 0x0074 }
            androidx.camera.video.Recorder$$ExternalSyntheticLambda12 r1 = new androidx.camera.video.Recorder$$ExternalSyntheticLambda12     // Catch:{ all -> 0x0074 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0074 }
            r0.execute(r1)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x0058:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r1.<init>(r0)     // Catch:{ all -> 0x0074 }
            androidx.camera.video.Recorder$State r0 = r4.mState     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0074 }
            r5.<init>(r0)     // Catch:{ all -> 0x0074 }
            throw r5     // Catch:{ all -> 0x0074 }
        L_0x006d:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.PENDING_PAUSED     // Catch:{ all -> 0x0074 }
            r4.setState(r5)     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0074 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.pause(androidx.camera.video.Recording):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resume(androidx.camera.video.Recording r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Called resume() from invalid state: "
            java.lang.String r1 = "resume() called on a recording that is no longer active: "
            java.lang.Object r2 = r4.mLock
            monitor-enter(r2)
            androidx.camera.video.Recorder$RecordingRecord r3 = r4.mPendingRecordingRecord     // Catch:{ all -> 0x0075 }
            boolean r3 = isSameRecording(r5, r3)     // Catch:{ all -> 0x0075 }
            if (r3 != 0) goto L_0x002f
            androidx.camera.video.Recorder$RecordingRecord r3 = r4.mActiveRecordingRecord     // Catch:{ all -> 0x0075 }
            boolean r3 = isSameRecording(r5, r3)     // Catch:{ all -> 0x0075 }
            if (r3 != 0) goto L_0x002f
            java.lang.String r0 = "Recorder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r3.<init>(r1)     // Catch:{ all -> 0x0075 }
            androidx.camera.video.OutputOptions r5 = r5.getOutputOptions()     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r5 = r3.append(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0075 }
            androidx.camera.core.Logger.d(r0, r5)     // Catch:{ all -> 0x0075 }
            monitor-exit(r2)     // Catch:{ all -> 0x0075 }
            return
        L_0x002f:
            int[] r5 = androidx.camera.video.Recorder.AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ all -> 0x0075 }
            androidx.camera.video.Recorder$State r1 = r4.mState     // Catch:{ all -> 0x0075 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0075 }
            r5 = r5[r1]     // Catch:{ all -> 0x0075 }
            r1 = 4
            if (r5 == r1) goto L_0x006e
            r1 = 5
            if (r5 == r1) goto L_0x0059
            r1 = 6
            if (r5 == r1) goto L_0x0059
            r0 = 8
            if (r5 == r0) goto L_0x0047
            goto L_0x0073
        L_0x0047:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.RECORDING     // Catch:{ all -> 0x0075 }
            r4.setState(r5)     // Catch:{ all -> 0x0075 }
            androidx.camera.video.Recorder$RecordingRecord r5 = r4.mActiveRecordingRecord     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r0 = r4.mSequentialExecutor     // Catch:{ all -> 0x0075 }
            androidx.camera.video.Recorder$$ExternalSyntheticLambda0 r1 = new androidx.camera.video.Recorder$$ExternalSyntheticLambda0     // Catch:{ all -> 0x0075 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0075 }
            r0.execute(r1)     // Catch:{ all -> 0x0075 }
            goto L_0x0073
        L_0x0059:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>(r0)     // Catch:{ all -> 0x0075 }
            androidx.camera.video.Recorder$State r0 = r4.mState     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0075 }
            r5.<init>(r0)     // Catch:{ all -> 0x0075 }
            throw r5     // Catch:{ all -> 0x0075 }
        L_0x006e:
            androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch:{ all -> 0x0075 }
            r4.setState(r5)     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r2)     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0075 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.resume(androidx.camera.video.Recording):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        finalizePendingRecording(r2, 8, new java.lang.RuntimeException("Recording was stopped before any data could be produced."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop(androidx.camera.video.Recording r7) {
        /*
            r6 = this;
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            java.lang.Object r1 = r6.mLock
            monitor-enter(r1)
            androidx.camera.video.Recorder$RecordingRecord r2 = r6.mPendingRecordingRecord     // Catch:{ all -> 0x008b }
            boolean r2 = isSameRecording(r7, r2)     // Catch:{ all -> 0x008b }
            if (r2 != 0) goto L_0x002d
            androidx.camera.video.Recorder$RecordingRecord r2 = r6.mActiveRecordingRecord     // Catch:{ all -> 0x008b }
            boolean r2 = isSameRecording(r7, r2)     // Catch:{ all -> 0x008b }
            if (r2 != 0) goto L_0x002d
            java.lang.String r2 = "Recorder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r3.<init>(r0)     // Catch:{ all -> 0x008b }
            androidx.camera.video.OutputOptions r7 = r7.getOutputOptions()     // Catch:{ all -> 0x008b }
            java.lang.StringBuilder r7 = r3.append(r7)     // Catch:{ all -> 0x008b }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x008b }
            androidx.camera.core.Logger.d(r2, r7)     // Catch:{ all -> 0x008b }
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            return
        L_0x002d:
            int[] r0 = androidx.camera.video.Recorder.AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ all -> 0x008b }
            androidx.camera.video.Recorder$State r2 = r6.mState     // Catch:{ all -> 0x008b }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x008b }
            r0 = r0[r2]     // Catch:{ all -> 0x008b }
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0072;
                case 3: goto L_0x0060;
                case 4: goto L_0x0060;
                case 5: goto L_0x0058;
                case 6: goto L_0x0058;
                case 7: goto L_0x003c;
                case 8: goto L_0x003c;
                default: goto L_0x003b;
            }     // Catch:{ all -> 0x008b }
        L_0x003b:
            goto L_0x007b
        L_0x003c:
            androidx.camera.video.Recorder$State r7 = androidx.camera.video.Recorder.State.STOPPING     // Catch:{ all -> 0x008b }
            r6.setState(r7)     // Catch:{ all -> 0x008b }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x008b }
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x008b }
            long r3 = r7.toMicros(r3)     // Catch:{ all -> 0x008b }
            androidx.camera.video.Recorder$RecordingRecord r7 = r6.mActiveRecordingRecord     // Catch:{ all -> 0x008b }
            java.util.concurrent.Executor r0 = r6.mSequentialExecutor     // Catch:{ all -> 0x008b }
            androidx.camera.video.Recorder$$ExternalSyntheticLambda4 r5 = new androidx.camera.video.Recorder$$ExternalSyntheticLambda4     // Catch:{ all -> 0x008b }
            r5.<init>(r6, r7, r3)     // Catch:{ all -> 0x008b }
            r0.execute(r5)     // Catch:{ all -> 0x008b }
            goto L_0x007b
        L_0x0058:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "Calling stop() while idling or initializing is invalid."
            r7.<init>(r0)     // Catch:{ all -> 0x008b }
            throw r7     // Catch:{ all -> 0x008b }
        L_0x0060:
            androidx.camera.video.Recorder$RecordingRecord r0 = r6.mPendingRecordingRecord     // Catch:{ all -> 0x008b }
            boolean r7 = isSameRecording(r7, r0)     // Catch:{ all -> 0x008b }
            androidx.core.util.Preconditions.checkState(r7)     // Catch:{ all -> 0x008b }
            androidx.camera.video.Recorder$RecordingRecord r7 = r6.mPendingRecordingRecord     // Catch:{ all -> 0x008b }
            r6.mPendingRecordingRecord = r2     // Catch:{ all -> 0x008b }
            r6.restoreNonPendingState()     // Catch:{ all -> 0x008b }
            r2 = r7
            goto L_0x007b
        L_0x0072:
            androidx.camera.video.Recorder$RecordingRecord r0 = r6.mActiveRecordingRecord     // Catch:{ all -> 0x008b }
            boolean r7 = isSameRecording(r7, r0)     // Catch:{ all -> 0x008b }
            androidx.core.util.Preconditions.checkState(r7)     // Catch:{ all -> 0x008b }
        L_0x007b:
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x008a
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Recording was stopped before any data could be produced."
            r7.<init>(r0)
            r0 = 8
            r6.finalizePendingRecording(r2, r0, r7)
        L_0x008a:
            return
        L_0x008b:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.stop(androidx.camera.video.Recording):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$stop$6$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m189lambda$stop$6$androidxcameravideoRecorder(RecordingRecord recordingRecord, long j) {
        stopInternal(recordingRecord, Long.valueOf(j), 0, (Throwable) null);
    }

    private void finalizePendingRecording(RecordingRecord recordingRecord, int i, Throwable th) {
        recordingRecord.finalizeRecording(Uri.EMPTY);
        recordingRecord.updateVideoRecordEvent(VideoRecordEvent.finalizeWithError(recordingRecord.getOutputOptions(), RecordingStats.of(0, 0, AudioStats.of(1, this.mAudioErrorCause)), OutputResults.of(Uri.EMPTY), i, th));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: onSourceStateChangedInternal */
    public void m181lambda$onSourceStateChanged$2$androidxcameravideoRecorder(VideoOutput.SourceState sourceState) {
        ScheduledFuture<?> scheduledFuture;
        Encoder encoder;
        VideoOutput.SourceState sourceState2 = this.mSourceState;
        this.mSourceState = sourceState;
        if (sourceState2 != sourceState) {
            Logger.d(TAG, "Video source has transitioned to state: " + sourceState);
            if (sourceState == VideoOutput.SourceState.INACTIVE) {
                if (this.mActiveSurface == null) {
                    reset(4, (Throwable) null);
                    setLatestSurface((Surface) null);
                    return;
                }
                RecordingRecord recordingRecord = this.mInProgressRecording;
                if (recordingRecord != null) {
                    onInProgressRecordingInternalError(recordingRecord, 4, (Throwable) null);
                }
            } else if (sourceState == VideoOutput.SourceState.ACTIVE_NON_STREAMING && (scheduledFuture = this.mSourceNonStreamingTimeout) != null && scheduledFuture.cancel(false) && (encoder = this.mVideoEncoder) != null) {
                notifyEncoderSourceStopped(encoder);
            }
        } else {
            Logger.d(TAG, "Video source transitions to the same state: " + sourceState);
        }
    }

    /* access modifiers changed from: package-private */
    public void reset(int i, Throwable th) {
        boolean z;
        boolean z2;
        synchronized (this.mLock) {
            z = true;
            z2 = false;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                    setState(State.RESETTING);
                    break;
                case 3:
                case 4:
                    updateNonPendingState(State.RESETTING);
                    break;
                case 5:
                    break;
                case 6:
                case 9:
                    setState(State.INITIALIZING);
                    break;
                case 7:
                case 8:
                    if (this.mActiveRecordingRecord == this.mInProgressRecording) {
                        setState(State.RESETTING);
                        z2 = true;
                        z = false;
                        break;
                    } else {
                        throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                    }
            }
            z = false;
        }
        if (z) {
            resetInternal();
        } else if (z2) {
            stopInternal(this.mInProgressRecording, (Long) null, i, th);
        }
    }

    private void initializeInternal(SurfaceRequest surfaceRequest) {
        Surface surface = this.mLatestSurface;
        if (surface != null) {
            this.mActiveSurface = surface;
            surfaceRequest.provideSurface(surface, this.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda10(this));
            onInitialized();
            return;
        }
        surfaceRequest.setTransformationInfoListener(this.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda11(this));
        Size resolution = surfaceRequest.getResolution();
        VideoCapabilities from = VideoCapabilities.from(surfaceRequest.getCamera().getCameraInfo());
        Quality findHighestSupportedQualityFor = from.findHighestSupportedQualityFor(resolution);
        Logger.d(TAG, "Using supported quality of " + findHighestSupportedQualityFor + " for surface size " + resolution);
        if (findHighestSupportedQualityFor != Quality.NONE) {
            CamcorderProfileProxy profile = from.getProfile(findHighestSupportedQualityFor);
            this.mResolvedCamcorderProfile = profile;
            if (profile == null) {
                throw new AssertionError("Camera advertised available quality but did not produce CamcorderProfile for advertised quality.");
            }
        }
        setupVideo(surfaceRequest);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$initializeInternal$7$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m180lambda$initializeInternal$7$androidxcameravideoRecorder(SurfaceRequest.TransformationInfo transformationInfo) {
        this.mSurfaceTransformationInfo = transformationInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.camera.video.Recorder$RecordingRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: androidx.camera.video.Recorder$RecordingRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: androidx.camera.video.Recorder$RecordingRecord} */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r6.mActiveRecordingRecord == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r2 = null;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r6.mSourceState != androidx.camera.video.VideoOutput.SourceState.INACTIVE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r2 = r6.mPendingRecordingRecord;
        r6.mPendingRecordingRecord = null;
        restoreNonPendingState();
        r4 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
        r5 = 4;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r5 = 0;
        r4 = null;
        r3 = makePendingRecordingActiveLocked(r6.mState);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r2 = null;
        r0 = false;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r4 = r2;
        r2 = r2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onInitialized() {
        /*
            r6 = this;
            java.lang.String r0 = "Incorrectly invoke onInitialized() in state "
            java.lang.Object r1 = r6.mLock
            monitor-enter(r1)
            int[] r2 = androidx.camera.video.Recorder.AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ all -> 0x007e }
            androidx.camera.video.Recorder$State r3 = r6.mState     // Catch:{ all -> 0x007e }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x007e }
            r2 = r2[r3]     // Catch:{ all -> 0x007e }
            r3 = 0
            r4 = 0
            switch(r2) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0049;
                case 3: goto L_0x0025;
                case 4: goto L_0x0023;
                case 5: goto L_0x001d;
                case 6: goto L_0x0049;
                case 7: goto L_0x0049;
                case 8: goto L_0x0049;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }     // Catch:{ all -> 0x007e }
        L_0x0014:
            goto L_0x006d
        L_0x0015:
            java.lang.String r0 = "Recorder"
            java.lang.String r2 = "onInitialized() was invoked when the Recorder had encountered error"
            androidx.camera.core.Logger.e(r0, r2)     // Catch:{ all -> 0x007e }
            goto L_0x006d
        L_0x001d:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.IDLING     // Catch:{ all -> 0x007e }
            r6.setState(r0)     // Catch:{ all -> 0x007e }
            goto L_0x006d
        L_0x0023:
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = r4
        L_0x0026:
            androidx.camera.video.Recorder$RecordingRecord r2 = r6.mActiveRecordingRecord     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x002d
            r2 = r3
            r5 = r4
            goto L_0x0070
        L_0x002d:
            androidx.camera.video.VideoOutput$SourceState r2 = r6.mSourceState     // Catch:{ all -> 0x007e }
            androidx.camera.video.VideoOutput$SourceState r5 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch:{ all -> 0x007e }
            if (r2 != r5) goto L_0x003e
            androidx.camera.video.Recorder$RecordingRecord r2 = r6.mPendingRecordingRecord     // Catch:{ all -> 0x007e }
            r6.mPendingRecordingRecord = r3     // Catch:{ all -> 0x007e }
            r6.restoreNonPendingState()     // Catch:{ all -> 0x007e }
            java.lang.Exception r4 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch:{ all -> 0x007e }
            r5 = 4
            goto L_0x0071
        L_0x003e:
            androidx.camera.video.Recorder$State r2 = r6.mState     // Catch:{ all -> 0x007e }
            androidx.camera.video.Recorder$RecordingRecord r2 = r6.makePendingRecordingActiveLocked(r2)     // Catch:{ all -> 0x007e }
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x0071
        L_0x0049:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r3.<init>(r0)     // Catch:{ all -> 0x007e }
            androidx.camera.video.Recorder$State r0 = r6.mState     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x007e }
            r2.<init>(r0)     // Catch:{ all -> 0x007e }
            throw r2     // Catch:{ all -> 0x007e }
        L_0x005e:
            boolean r0 = r6.mShouldWaitForNewSurface     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0065
            r6.mShouldWaitForNewSurface = r4     // Catch:{ all -> 0x007e }
            goto L_0x006d
        L_0x0065:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x007e }
            java.lang.String r2 = "Unexpectedly invoke onInitialized() in a STOPPING state when it's not waiting for a new surface."
            r0.<init>(r2)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x006d:
            r2 = r3
            r0 = r4
            r5 = r0
        L_0x0070:
            r4 = r2
        L_0x0071:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x0078
            r6.startRecording(r3, r0)
            goto L_0x007d
        L_0x0078:
            if (r2 == 0) goto L_0x007d
            r6.finalizePendingRecording(r2, r5, r4)
        L_0x007d:
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onInitialized():void");
    }

    private MediaSpec composeRecorderMediaSpec(MediaSpec mediaSpec) {
        MediaSpec.Builder builder = mediaSpec.toBuilder();
        if (mediaSpec.getVideoSpec().getAspectRatio() == -1) {
            builder.configureVideo(new Recorder$$ExternalSyntheticLambda1());
        }
        return builder.build();
    }

    private static boolean isSameRecording(Recording recording, RecordingRecord recordingRecord) {
        return recordingRecord != null && recording.getRecordingId() == recordingRecord.getRecordingId();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.camera.video.internal.config.MimeInfo resolveAudioMimeInfo(androidx.camera.video.MediaSpec r10) {
        /*
            r9 = this;
            int r0 = r10.getOutputFormat()
            java.lang.String r0 = androidx.camera.video.MediaSpec.outputFormatToAudioMime(r0)
            int r1 = r10.getOutputFormat()
            int r1 = androidx.camera.video.MediaSpec.outputFormatToAudioProfile(r1)
            androidx.camera.core.impl.CamcorderProfileProxy r2 = r9.mResolvedCamcorderProfile
            if (r2 == 0) goto L_0x00c6
            java.lang.String r2 = r2.getAudioCodecMimeType()
            androidx.camera.core.impl.CamcorderProfileProxy r3 = r9.mResolvedCamcorderProfile
            int r3 = r3.getRequiredAudioProfile()
            java.lang.String r4 = ")]"
            java.lang.String r5 = "Recorder"
            java.lang.String r6 = "(profile: "
            if (r2 != 0) goto L_0x0046
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "CamcorderProfile contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            r10.<init>(r2)
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r6)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.Logger.d(r5, r10)
            goto L_0x00c6
        L_0x0046:
            int r10 = r10.getOutputFormat()
            r7 = -1
            r8 = 1
            if (r10 != r7) goto L_0x006f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive AUDIO settings [mime type: "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.StringBuilder r10 = r10.append(r6)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.Logger.d(r5, r10)
        L_0x006c:
            r0 = r2
            r1 = r3
            goto L_0x00c7
        L_0x006f:
            boolean r10 = java.util.Objects.equals(r0, r2)
            if (r10 == 0) goto L_0x0096
            if (r1 != r3) goto L_0x0096
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "MediaSpec audio mime/profile matches CamcorderProfile. Using CamcorderProfile to derive AUDIO settings [mime type: "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.StringBuilder r10 = r10.append(r6)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.Logger.d(r5, r10)
            goto L_0x006c
        L_0x0096:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r7 = "MediaSpec audio mime or profile does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive AUDIO settings [CamcorderProfile mime type: "
            r10.<init>(r7)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.StringBuilder r10 = r10.append(r6)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.String r2 = "), chosen mime type: "
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r10 = r10.append(r6)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r10 = r10.toString()
            androidx.camera.core.Logger.d(r5, r10)
        L_0x00c6:
            r8 = 0
        L_0x00c7:
            androidx.camera.video.internal.config.MimeInfo$Builder r10 = androidx.camera.video.internal.config.MimeInfo.builder(r0)
            androidx.camera.video.internal.config.MimeInfo$Builder r10 = r10.setProfile(r1)
            if (r8 == 0) goto L_0x00d6
            androidx.camera.core.impl.CamcorderProfileProxy r0 = r9.mResolvedCamcorderProfile
            r10.setCompatibleCamcorderProfile(r0)
        L_0x00d6:
            androidx.camera.video.internal.config.MimeInfo r10 = r10.build()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.resolveAudioMimeInfo(androidx.camera.video.MediaSpec):androidx.camera.video.internal.config.MimeInfo");
    }

    private MimeInfo resolveVideoMimeInfo(MediaSpec mediaSpec) {
        String outputFormatToVideoMime = MediaSpec.outputFormatToVideoMime(mediaSpec.getOutputFormat());
        CamcorderProfileProxy camcorderProfileProxy = this.mResolvedCamcorderProfile;
        boolean z = false;
        if (camcorderProfileProxy != null) {
            String videoCodecMimeType = camcorderProfileProxy.getVideoCodecMimeType();
            if (videoCodecMimeType == null) {
                Logger.d(TAG, "CamcorderProfile contains undefined VIDEO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + outputFormatToVideoMime + "]");
            } else {
                if (mediaSpec.getOutputFormat() == -1) {
                    Logger.d(TAG, "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + videoCodecMimeType + "]");
                } else if (Objects.equals(outputFormatToVideoMime, videoCodecMimeType)) {
                    Logger.d(TAG, "MediaSpec video mime matches CamcorderProfile. Using CamcorderProfile to derive VIDEO settings [mime type: " + videoCodecMimeType + "]");
                } else {
                    Logger.d(TAG, "MediaSpec video mime does not match CamcorderProfile, so CamcorderProfile settings cannot be used. May rely on fallback defaults to derive VIDEO settings [CamcorderProfile mime type: " + videoCodecMimeType + ", chosen mime type: " + outputFormatToVideoMime + "]");
                }
                outputFormatToVideoMime = videoCodecMimeType;
                z = true;
            }
        } else {
            Logger.d(TAG, "No CamcorderProfile present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + outputFormatToVideoMime + "]");
        }
        MimeInfo.Builder builder = MimeInfo.builder(outputFormatToVideoMime);
        if (z) {
            builder.setCompatibleCamcorderProfile(this.mResolvedCamcorderProfile);
        }
        return builder.build();
    }

    private static AudioSource.Settings resolveAudioSourceSettings(MimeInfo mimeInfo, AudioSpec audioSpec) {
        Supplier supplier;
        if (mimeInfo.getCompatibleCamcorderProfile() != null) {
            supplier = new AudioSourceSettingsCamcorderProfileResolver(audioSpec, mimeInfo.getCompatibleCamcorderProfile());
        } else {
            supplier = new AudioSourceSettingsDefaultResolver(audioSpec);
        }
        return (AudioSource.Settings) supplier.get();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.camera.video.internal.config.AudioEncoderConfigCamcorderProfileResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: androidx.camera.video.internal.config.AudioEncoderConfigDefaultResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: androidx.camera.video.internal.config.AudioEncoderConfigCamcorderProfileResolver} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.camera.video.internal.config.AudioEncoderConfigCamcorderProfileResolver} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.camera.video.internal.encoder.AudioEncoderConfig resolveAudioEncoderConfig(androidx.camera.video.internal.config.MimeInfo r7, androidx.camera.video.internal.AudioSource.Settings r8, androidx.camera.video.AudioSpec r9) {
        /*
            androidx.camera.core.impl.CamcorderProfileProxy r0 = r7.getCompatibleCamcorderProfile()
            if (r0 == 0) goto L_0x001b
            androidx.camera.video.internal.config.AudioEncoderConfigCamcorderProfileResolver r0 = new androidx.camera.video.internal.config.AudioEncoderConfigCamcorderProfileResolver
            java.lang.String r2 = r7.getMimeType()
            int r3 = r7.getProfile()
            androidx.camera.core.impl.CamcorderProfileProxy r6 = r7.getCompatibleCamcorderProfile()
            r1 = r0
            r4 = r9
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0028
        L_0x001b:
            androidx.camera.video.internal.config.AudioEncoderConfigDefaultResolver r0 = new androidx.camera.video.internal.config.AudioEncoderConfigDefaultResolver
            java.lang.String r1 = r7.getMimeType()
            int r7 = r7.getProfile()
            r0.<init>(r1, r7, r9, r8)
        L_0x0028:
            java.lang.Object r7 = r0.get()
            androidx.camera.video.internal.encoder.AudioEncoderConfig r7 = (androidx.camera.video.internal.encoder.AudioEncoderConfig) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.resolveAudioEncoderConfig(androidx.camera.video.internal.config.MimeInfo, androidx.camera.video.internal.AudioSource$Settings, androidx.camera.video.AudioSpec):androidx.camera.video.internal.encoder.AudioEncoderConfig");
    }

    private static VideoEncoderConfig resolveVideoEncoderConfig(MimeInfo mimeInfo, VideoSpec videoSpec, Size size) {
        Supplier supplier;
        if (mimeInfo.getCompatibleCamcorderProfile() != null) {
            supplier = new VideoEncoderConfigCamcorderProfileResolver(mimeInfo.getMimeType(), videoSpec, size, mimeInfo.getCompatibleCamcorderProfile());
        } else {
            supplier = new VideoEncoderConfigDefaultResolver(mimeInfo.getMimeType(), videoSpec, size);
        }
        return (VideoEncoderConfig) supplier.get();
    }

    private void setupAudio(RecordingRecord recordingRecord) throws ResourceCreationException {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        MimeInfo resolveAudioMimeInfo = resolveAudioMimeInfo(mediaSpec);
        AudioSource.Settings resolveAudioSourceSettings = resolveAudioSourceSettings(resolveAudioMimeInfo, mediaSpec.getAudioSpec());
        try {
            this.mAudioSource = setupAudioSource(recordingRecord, resolveAudioSourceSettings);
            try {
                Encoder createEncoder = this.mAudioEncoderFactory.createEncoder(this.mExecutor, resolveAudioEncoderConfig(resolveAudioMimeInfo, resolveAudioSourceSettings, mediaSpec.getAudioSpec()));
                this.mAudioEncoder = createEncoder;
                Encoder.EncoderInput input = createEncoder.getInput();
                if (input instanceof Encoder.ByteBufferInput) {
                    this.mAudioSource.setBufferProvider((Encoder.ByteBufferInput) input);
                    return;
                }
                throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
            } catch (InvalidConfigException e) {
                throw new ResourceCreationException((Throwable) e);
            }
        } catch (AudioSourceAccessException e2) {
            throw new ResourceCreationException((Throwable) e2);
        }
    }

    private AudioSource setupAudioSource(RecordingRecord recordingRecord, AudioSource.Settings settings) throws AudioSourceAccessException {
        AudioSource performOneTimeAudioSourceCreation = recordingRecord.performOneTimeAudioSourceCreation(settings, CameraXExecutors.ioExecutor());
        performOneTimeAudioSourceCreation.setAudioSourceCallback(this.mSequentialExecutor, new AudioSource.AudioSourceCallback() {
            public void onSilenced(boolean z) {
                if (Recorder.this.mIsAudioSourceSilenced != z) {
                    Recorder.this.mIsAudioSourceSilenced = z;
                    Recorder.this.mAudioErrorCause = z ? new IllegalStateException("The audio source has been silenced.") : null;
                    Recorder.this.updateInProgressStatusEvent();
                    return;
                }
                Logger.w(Recorder.TAG, "Audio source silenced transitions to the same state " + z);
            }

            public void onError(Throwable th) {
                if (th instanceof AudioSourceAccessException) {
                    Recorder.this.setAudioState(AudioState.DISABLED);
                    Recorder.this.updateInProgressStatusEvent();
                }
            }
        });
        return performOneTimeAudioSourceCreation;
    }

    private void setupVideo(SurfaceRequest surfaceRequest) {
        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
        try {
            Encoder createEncoder = this.mVideoEncoderFactory.createEncoder(this.mExecutor, resolveVideoEncoderConfig(resolveVideoMimeInfo(mediaSpec), mediaSpec.getVideoSpec(), surfaceRequest.getResolution()));
            this.mVideoEncoder = createEncoder;
            Encoder.EncoderInput input = createEncoder.getInput();
            if (input instanceof Encoder.SurfaceInput) {
                ((Encoder.SurfaceInput) input).setOnSurfaceUpdateListener(this.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda5(this, surfaceRequest));
                return;
            }
            throw new AssertionError("The EncoderInput of video isn't a SurfaceInput.");
        } catch (InvalidConfigException e) {
            Logger.e(TAG, "Unable to initialize video encoder.", e);
            onEncoderSetupError(new ResourceCreationException((Throwable) e));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setupVideo$9$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m187lambda$setupVideo$9$androidxcameravideoRecorder(SurfaceRequest surfaceRequest, Surface surface) {
        synchronized (this.mLock) {
            Logger.d(TAG, "Encoder surface updated: " + surface.hashCode() + ", Current surface: " + this.mStreamId);
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                    onEncoderSurfaceUpdated(surface, surfaceRequest);
                    break;
                case 7:
                case 8:
                    throw new AssertionError("Unexpected state on update of encoder surface " + this.mState);
            }
        }
    }

    private void onEncoderSurfaceUpdated(Surface surface, SurfaceRequest surfaceRequest) {
        Surface surface2 = this.mLatestSurface;
        if (surface2 != surface) {
            setLatestSurface(surface);
            if (surface2 == null) {
                this.mActiveSurface = surface;
                surfaceRequest.provideSurface(surface, this.mSequentialExecutor, new Recorder$$ExternalSyntheticLambda10(this));
                onInitialized();
                return;
            }
            return;
        }
        Logger.d(TAG, "Video encoder provides the same surface.");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSurfaceRequestComplete(androidx.camera.core.SurfaceRequest.Result r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Surface closed: "
            r0.<init>(r1)
            android.view.Surface r1 = r5.getSurface()
            int r1 = r1.hashCode()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            androidx.camera.core.Logger.d(r1, r0)
            android.view.Surface r5 = r5.getSurface()
            android.view.Surface r0 = r4.mActiveSurface
            if (r5 != r0) goto L_0x005d
            java.util.concurrent.ScheduledFuture<?> r5 = r4.mSourceNonStreamingTimeout
            r0 = 0
            if (r5 == 0) goto L_0x0036
            boolean r5 = r5.cancel(r0)
            if (r5 == 0) goto L_0x0036
            androidx.camera.video.internal.encoder.Encoder r5 = r4.mVideoEncoder
            if (r5 == 0) goto L_0x0036
            notifyEncoderSourceStopped(r5)
        L_0x0036:
            androidx.camera.video.VideoOutput$SourceState r5 = r4.mSourceState
            androidx.camera.video.VideoOutput$SourceState r2 = androidx.camera.video.VideoOutput.SourceState.INACTIVE
            r3 = 1
            if (r5 != r2) goto L_0x0044
            java.lang.String r5 = "Latest active surface no longer in use and source state is INACTIVE. Resetting recorder..."
            androidx.camera.core.Logger.d(r1, r5)
        L_0x0042:
            r0 = r3
            goto L_0x0050
        L_0x0044:
            android.view.Surface r5 = r4.mActiveSurface
            android.view.Surface r2 = r4.mLatestSurface
            if (r5 != r2) goto L_0x0050
            java.lang.String r5 = "Source has stopped producing frames into active surface, yet source state is still active. Stopping any in-progress recordings and resetting encoders in case a new surface is required."
            androidx.camera.core.Logger.w(r1, r5)
            goto L_0x0042
        L_0x0050:
            r5 = 0
            r4.mActiveSurface = r5
            if (r0 == 0) goto L_0x0060
            r0 = 4
            r4.reset(r0, r5)
            r4.setLatestSurface(r5)
            goto L_0x0060
        L_0x005d:
            r5.release()
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onSurfaceRequestComplete(androidx.camera.core.SurfaceRequest$Result):void");
    }

    private void onEncoderSetupError(Throwable th) {
        RecordingRecord recordingRecord;
        synchronized (this.mLock) {
            recordingRecord = null;
            switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                case 1:
                case 2:
                case 6:
                case 7:
                case 8:
                    throw new AssertionError("Encountered encoder setup error while in unexpected state " + this.mState + ": " + th);
                case 3:
                case 4:
                    RecordingRecord recordingRecord2 = this.mPendingRecordingRecord;
                    this.mPendingRecordingRecord = null;
                    recordingRecord = recordingRecord2;
                    break;
                case 5:
                    break;
            }
            setStreamId(-1);
            setState(State.ERROR);
        }
        if (recordingRecord != null) {
            finalizePendingRecording(recordingRecord, 7, th);
        }
    }

    /* access modifiers changed from: package-private */
    public void setupAndStartMediaMuxer(RecordingRecord recordingRecord) {
        EncodedData encodedData;
        int i;
        if (this.mMediaMuxer != null) {
            throw new AssertionError("Unable to set up media muxer when one already exists.");
        } else if (!isAudioEnabled() || this.mPendingFirstAudioData != null) {
            EncodedData encodedData2 = this.mPendingFirstVideoData;
            if (encodedData2 != null) {
                try {
                    encodedData = this.mPendingFirstAudioData;
                    this.mPendingFirstVideoData = null;
                    this.mPendingFirstAudioData = null;
                    long size = encodedData2.size();
                    if (encodedData != null) {
                        size += encodedData.size();
                    }
                    long j = this.mFileSizeLimitInBytes;
                    if (j == 0 || size <= j) {
                        MediaSpec mediaSpec = (MediaSpec) getObservableData(this.mMediaSpec);
                        if (mediaSpec.getOutputFormat() == -1) {
                            i = supportedMuxerFormatOrDefaultFrom(this.mResolvedCamcorderProfile, MediaSpec.outputFormatToMuxerFormat(MEDIA_SPEC_DEFAULT.getOutputFormat()));
                        } else {
                            i = MediaSpec.outputFormatToMuxerFormat(mediaSpec.getOutputFormat());
                        }
                        MediaMuxer performOneTimeMediaMuxerCreation = recordingRecord.performOneTimeMediaMuxerCreation(i, new Recorder$$ExternalSyntheticLambda8(this));
                        this.mMediaMuxer = performOneTimeMediaMuxerCreation;
                        SurfaceRequest.TransformationInfo transformationInfo = this.mSurfaceTransformationInfo;
                        if (transformationInfo != null) {
                            performOneTimeMediaMuxerCreation.setOrientationHint(transformationInfo.getRotationDegrees());
                        }
                        this.mVideoTrackIndex = Integer.valueOf(this.mMediaMuxer.addTrack(this.mVideoOutputConfig.getMediaFormat()));
                        if (isAudioEnabled()) {
                            this.mAudioTrackIndex = Integer.valueOf(this.mMediaMuxer.addTrack(this.mAudioOutputConfig.getMediaFormat()));
                        }
                        this.mMediaMuxer.start();
                        writeVideoData(encodedData2, recordingRecord);
                        if (encodedData != null) {
                            writeAudioData(encodedData, recordingRecord);
                        }
                        if (encodedData != null) {
                            encodedData.close();
                        }
                        if (encodedData2 != null) {
                            encodedData2.close();
                            return;
                        }
                        return;
                    }
                    Logger.d(TAG, String.format("Initial data exceeds file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)}));
                    onInProgressRecordingInternalError(recordingRecord, 2, (Throwable) null);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                    if (encodedData2 != null) {
                        encodedData2.close();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    onInProgressRecordingInternalError(recordingRecord, 5, e);
                    if (encodedData != null) {
                        encodedData.close();
                    }
                    if (encodedData2 != null) {
                        encodedData2.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (encodedData2 != null) {
                        try {
                            encodedData2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                throw new AssertionError("Media muxer cannot be started without an encoded video frame.");
            }
        } else {
            throw new AssertionError("Audio is enabled but no audio sample is ready. Cannot start media muxer.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setupAndStartMediaMuxer$10$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m186lambda$setupAndStartMediaMuxer$10$androidxcameravideoRecorder(Uri uri) {
        this.mOutputUri = uri;
    }

    private void startInternal(RecordingRecord recordingRecord) {
        AudioState audioState;
        if (this.mInProgressRecording == null) {
            if (recordingRecord.getOutputOptions().getFileSizeLimit() > 0) {
                this.mFileSizeLimitInBytes = Math.round(((double) recordingRecord.getOutputOptions().getFileSizeLimit()) * 0.95d);
                Logger.d(TAG, "File size limit in bytes: " + this.mFileSizeLimitInBytes);
            } else {
                this.mFileSizeLimitInBytes = 0;
            }
            this.mInProgressRecording = recordingRecord;
            int i = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$AudioState[this.mAudioState.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                throw new AssertionError("Incorrectly invoke startInternal in audio state " + this.mAudioState);
            }
            if (i == 4) {
                if (recordingRecord.hasAudioEnabled()) {
                    audioState = AudioState.ACTIVE;
                } else {
                    audioState = AudioState.DISABLED;
                }
                setAudioState(audioState);
            } else if (i == 5 && recordingRecord.hasAudioEnabled()) {
                if (isAudioSupported()) {
                    try {
                        setupAudio(recordingRecord);
                        setAudioState(AudioState.ACTIVE);
                    } catch (ResourceCreationException e) {
                        Logger.e(TAG, "Unable to create audio resource with error: ", e);
                        setAudioState(AudioState.ERROR);
                        this.mAudioErrorCause = e;
                    }
                } else {
                    throw new AssertionError("The Recorder doesn't support recording with audio");
                }
            }
            initEncoderCallbacks(recordingRecord);
            if (isAudioEnabled()) {
                this.mAudioSource.start();
                this.mAudioEncoder.start();
            }
            this.mVideoEncoder.start();
            RecordingRecord recordingRecord2 = this.mInProgressRecording;
            recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.start(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
            return;
        }
        throw new AssertionError("Attempted to start a new recording while another was in progress.");
    }

    /* renamed from: androidx.camera.video.Recorder$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$Recorder$AudioState;
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$Recorder$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        static {
            /*
                androidx.camera.video.Recorder$AudioState[] r0 = androidx.camera.video.Recorder.AudioState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$video$Recorder$AudioState = r0
                r1 = 1
                androidx.camera.video.Recorder$AudioState r2 = androidx.camera.video.Recorder.AudioState.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.video.Recorder$AudioState r3 = androidx.camera.video.Recorder.AudioState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.video.Recorder$AudioState r4 = androidx.camera.video.Recorder.AudioState.DISABLED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.video.Recorder$AudioState r5 = androidx.camera.video.Recorder.AudioState.IDLING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$androidx$camera$video$Recorder$AudioState     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.video.Recorder$AudioState r6 = androidx.camera.video.Recorder.AudioState.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.camera.video.Recorder$State[] r5 = androidx.camera.video.Recorder.State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$androidx$camera$video$Recorder$State = r5
                androidx.camera.video.Recorder$State r6 = androidx.camera.video.Recorder.State.STOPPING     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.camera.video.Recorder$State r5 = androidx.camera.video.Recorder.State.RESETTING     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PENDING_RECORDING     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PENDING_PAUSED     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.IDLING     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.RECORDING     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x0099 }
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.PAUSED     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = $SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ NoSuchFieldError -> 0x00a5 }
                androidx.camera.video.Recorder$State r1 = androidx.camera.video.Recorder.State.ERROR     // Catch:{ NoSuchFieldError -> 0x00a5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a5 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a5 }
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.AnonymousClass5.<clinit>():void");
        }
    }

    private void initEncoderCallbacks(RecordingRecord recordingRecord) {
        this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new Recorder$$ExternalSyntheticLambda2(this, recordingRecord)));
        if (isAudioEnabled()) {
            this.mEncodingFutures.add(CallbackToFutureAdapter.getFuture(new Recorder$$ExternalSyntheticLambda3(this, recordingRecord)));
        }
        Futures.addCallback(Futures.allAsList(this.mEncodingFutures), new FutureCallback<List<Void>>() {
            public void onSuccess(List<Void> list) {
                Logger.d(Recorder.TAG, "Encodings end successfully.");
                Recorder recorder = Recorder.this;
                recorder.finalizeInProgressRecording(recorder.mRecordingStopError, Recorder.this.mRecordingStopErrorCause);
            }

            public void onFailure(Throwable th) {
                Logger.d(Recorder.TAG, "Encodings end with error: " + th);
                Recorder.this.finalizeInProgressRecording(6, th);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$initEncoderCallbacks$11$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ Object m178lambda$initEncoderCallbacks$11$androidxcameravideoRecorder(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mVideoEncoder.setEncoderCallback(new EncoderCallback() {
            public void onEncodeStart() {
            }

            public void onEncodeStop() {
                completer.set(null);
            }

            public void onEncodeError(EncodeException encodeException) {
                completer.setException(encodeException);
            }

            public void onEncodedData(EncodedData encodedData) {
                boolean z;
                if (Recorder.this.mMediaMuxer != null) {
                    try {
                        Recorder.this.writeVideoData(encodedData, recordingRecord);
                        if (encodedData != null) {
                            encodedData.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else if (!Recorder.this.mInProgressRecordingStopping) {
                    if (Recorder.this.mPendingFirstVideoData != null) {
                        Recorder.this.mPendingFirstVideoData.close();
                        Recorder.this.mPendingFirstVideoData = null;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (encodedData.isKeyFrame()) {
                        Recorder.this.mPendingFirstVideoData = encodedData;
                        if (!Recorder.this.isAudioEnabled() || Recorder.this.mPendingFirstAudioData != null) {
                            Logger.d(Recorder.TAG, "Received video keyframe. Starting muxer...");
                            Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                            return;
                        } else if (z) {
                            Logger.d(Recorder.TAG, "Replaced cached video keyframe with newer keyframe.");
                            return;
                        } else {
                            Logger.d(Recorder.TAG, "Cached video keyframe while we wait for first audio sample before starting muxer.");
                            return;
                        }
                    } else {
                        if (z) {
                            Logger.d(Recorder.TAG, "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                        }
                        Logger.d(Recorder.TAG, "Dropped video data since muxer has not yet started and data is not a keyframe.");
                        Recorder.this.mVideoEncoder.requestKeyFrame();
                        encodedData.close();
                        return;
                    }
                } else {
                    Logger.d(Recorder.TAG, "Drop video data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                throw th;
            }

            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mVideoOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "videoEncodingFuture";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$initEncoderCallbacks$12$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ Object m179lambda$initEncoderCallbacks$12$androidxcameravideoRecorder(final RecordingRecord recordingRecord, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mAudioEncoder.setEncoderCallback(new EncoderCallback() {
            public void onEncodeStart() {
            }

            public void onEncodeStop() {
                completer.set(null);
            }

            public void onEncodeError(EncodeException encodeException) {
                Recorder.this.setAudioState(AudioState.ERROR);
                Recorder.this.mAudioErrorCause = encodeException;
                Recorder.this.updateInProgressStatusEvent();
                completer.set(null);
            }

            public void onEncodedData(EncodedData encodedData) {
                boolean z;
                if (Recorder.this.mAudioState == AudioState.DISABLED) {
                    throw new AssertionError("Audio is not enabled but audio encoded data is produced.");
                } else if (Recorder.this.mMediaMuxer != null) {
                    try {
                        Recorder.this.writeAudioData(encodedData, recordingRecord);
                        if (encodedData != null) {
                            encodedData.close();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else if (!Recorder.this.mInProgressRecordingStopping) {
                    if (Recorder.this.mPendingFirstAudioData != null) {
                        Recorder.this.mPendingFirstAudioData.close();
                        Recorder.this.mPendingFirstAudioData = null;
                        z = true;
                    } else {
                        z = false;
                    }
                    Recorder.this.mPendingFirstAudioData = encodedData;
                    if (Recorder.this.mPendingFirstVideoData != null) {
                        Logger.d(Recorder.TAG, "Received audio data. Starting muxer...");
                        Recorder.this.setupAndStartMediaMuxer(recordingRecord);
                        return;
                    } else if (z) {
                        Logger.d(Recorder.TAG, "Replaced cached audio data with newer data.");
                        return;
                    } else {
                        Logger.d(Recorder.TAG, "Cached audio data while we wait for video keyframe before starting muxer.");
                        return;
                    }
                } else {
                    Logger.d(Recorder.TAG, "Drop audio data since recording is stopping.");
                    encodedData.close();
                    return;
                }
                throw th;
            }

            public void onOutputConfigUpdate(OutputConfig outputConfig) {
                Recorder.this.mAudioOutputConfig = outputConfig;
            }
        }, this.mSequentialExecutor);
        return "audioEncodingFuture";
    }

    /* access modifiers changed from: package-private */
    public void writeVideoData(EncodedData encodedData, RecordingRecord recordingRecord) {
        if (this.mVideoTrackIndex != null) {
            long size = this.mRecordingBytes + encodedData.size();
            long j = this.mFileSizeLimitInBytes;
            if (j == 0 || size <= j) {
                this.mMediaMuxer.writeSampleData(this.mVideoTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
                this.mRecordingBytes = size;
                if (this.mFirstRecordingVideoDataTimeUs == 0) {
                    this.mFirstRecordingVideoDataTimeUs = encodedData.getPresentationTimeUs();
                }
                this.mRecordingDurationNs = TimeUnit.MICROSECONDS.toNanos(encodedData.getPresentationTimeUs() - this.mFirstRecordingVideoDataTimeUs);
                updateInProgressStatusEvent();
                return;
            }
            Logger.d(TAG, String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)}));
            onInProgressRecordingInternalError(recordingRecord, 2, (Throwable) null);
            return;
        }
        throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
    }

    /* access modifiers changed from: package-private */
    public void writeAudioData(EncodedData encodedData, RecordingRecord recordingRecord) {
        long size = this.mRecordingBytes + encodedData.size();
        long j = this.mFileSizeLimitInBytes;
        if (j == 0 || size <= j) {
            this.mMediaMuxer.writeSampleData(this.mAudioTrackIndex.intValue(), encodedData.getByteBuffer(), encodedData.getBufferInfo());
            this.mRecordingBytes = size;
            return;
        }
        Logger.d(TAG, String.format("Reach file size limit %d > %d", new Object[]{Long.valueOf(size), Long.valueOf(this.mFileSizeLimitInBytes)}));
        onInProgressRecordingInternalError(recordingRecord, 2, (Throwable) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: pauseInternal */
    public void m184lambda$pause$4$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording == recordingRecord && !this.mInProgressRecordingStopping) {
            if (isAudioEnabled()) {
                this.mAudioEncoder.pause();
            }
            this.mVideoEncoder.pause();
            RecordingRecord recordingRecord2 = this.mInProgressRecording;
            recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.pause(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: resumeInternal */
    public void m185lambda$resume$5$androidxcameravideoRecorder(RecordingRecord recordingRecord) {
        if (this.mInProgressRecording == recordingRecord && !this.mInProgressRecordingStopping) {
            if (isAudioEnabled()) {
                this.mAudioEncoder.start();
            }
            this.mVideoEncoder.start();
            RecordingRecord recordingRecord2 = this.mInProgressRecording;
            recordingRecord2.updateVideoRecordEvent(VideoRecordEvent.resume(recordingRecord2.getOutputOptions(), getInProgressRecordingStats()));
        }
    }

    /* access modifiers changed from: package-private */
    public void stopInternal(RecordingRecord recordingRecord, Long l, int i, Throwable th) {
        if (this.mInProgressRecording == recordingRecord && !this.mInProgressRecordingStopping) {
            this.mShouldWaitForNewSurface = DeviceQuirks.get(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
            this.mInProgressRecordingStopping = true;
            this.mRecordingStopError = i;
            this.mRecordingStopErrorCause = th;
            if (isAudioEnabled()) {
                EncodedData encodedData = this.mPendingFirstAudioData;
                if (encodedData != null) {
                    encodedData.close();
                    this.mPendingFirstAudioData = null;
                }
                if (l == null) {
                    this.mAudioEncoder.stop();
                } else {
                    this.mAudioEncoder.stop(l.longValue());
                }
            }
            EncodedData encodedData2 = this.mPendingFirstVideoData;
            if (encodedData2 != null) {
                encodedData2.close();
                this.mPendingFirstVideoData = null;
            }
            if (this.mSourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING) {
                this.mSourceNonStreamingTimeout = CameraXExecutors.mainThreadExecutor().schedule(new Recorder$$ExternalSyntheticLambda7(this, this.mVideoEncoder), 1000, TimeUnit.MILLISECONDS);
            } else {
                notifyEncoderSourceStopped(this.mVideoEncoder);
            }
            if (l == null) {
                this.mVideoEncoder.stop();
            } else {
                this.mVideoEncoder.stop(l.longValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$stopInternal$14$androidx-camera-video-Recorder  reason: not valid java name */
    public /* synthetic */ void m190lambda$stopInternal$14$androidxcameravideoRecorder(Encoder encoder) {
        this.mSequentialExecutor.execute(new Recorder$$ExternalSyntheticLambda6(encoder));
    }

    static /* synthetic */ void lambda$stopInternal$13(Encoder encoder) {
        Logger.d(TAG, "The source didn't become non-streaming before timeout. Waited 1000ms");
        if (DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class) != null) {
            notifyEncoderSourceStopped(encoder);
        }
    }

    private static void notifyEncoderSourceStopped(Encoder encoder) {
        if (encoder instanceof EncoderImpl) {
            ((EncoderImpl) encoder).signalSourceStopped();
        }
    }

    private void resetInternal() {
        if (this.mAudioEncoder != null) {
            Logger.d(TAG, "Releasing audio encoder.");
            this.mAudioEncoder.release();
            this.mAudioEncoder = null;
            this.mAudioOutputConfig = null;
        }
        if (this.mVideoEncoder != null) {
            Logger.d(TAG, "Releasing video encoder.");
            this.mVideoEncoder.release();
            this.mVideoEncoder = null;
            this.mVideoOutputConfig = null;
        }
        if (this.mAudioSource != null) {
            Logger.d(TAG, "Releasing audio source.");
            this.mAudioSource.release();
            this.mAudioSource = null;
        }
        setAudioState(AudioState.INITIALIZING);
    }

    private int internalAudioStateToAudioStatsState(AudioState audioState) {
        int i = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$AudioState[audioState.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            if (i == 3 || i == 5) {
                return 1;
            }
            throw new AssertionError("Invalid internal audio state: " + audioState);
        } else if (this.mIsAudioSourceSilenced) {
            return 2;
        } else {
            return 0;
        }
    }

    private StreamInfo.StreamState internalStateToStreamState(State state) {
        return (state == State.RECORDING || (state == State.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) DeviceQuirks.get(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? StreamInfo.StreamState.ACTIVE : StreamInfo.StreamState.INACTIVE;
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioEnabled() {
        return this.mAudioState == AudioState.ACTIVE;
    }

    /* access modifiers changed from: package-private */
    public void finalizeInProgressRecording(int i, Throwable th) {
        VideoRecordEvent.Finalize finalize;
        if (this.mInProgressRecording != null) {
            MediaMuxer mediaMuxer = this.mMediaMuxer;
            if (mediaMuxer != null) {
                try {
                    mediaMuxer.stop();
                    this.mMediaMuxer.release();
                } catch (IllegalStateException e) {
                    Logger.e(TAG, "MediaMuxer failed to stop or release with error: " + e.getMessage());
                    if (i == 0) {
                        i = 1;
                    }
                }
                this.mMediaMuxer = null;
            } else if (i == 0) {
                i = 8;
            }
            this.mInProgressRecording.finalizeRecording(this.mOutputUri);
            OutputOptions outputOptions = this.mInProgressRecording.getOutputOptions();
            RecordingStats inProgressRecordingStats = getInProgressRecordingStats();
            OutputResults of = OutputResults.of(this.mOutputUri);
            RecordingRecord recordingRecord = this.mInProgressRecording;
            if (i == 0) {
                finalize = VideoRecordEvent.finalize(outputOptions, inProgressRecordingStats, of);
            } else {
                finalize = VideoRecordEvent.finalizeWithError(outputOptions, inProgressRecordingStats, of, i, th);
            }
            recordingRecord.updateVideoRecordEvent(finalize);
            RecordingRecord recordingRecord2 = this.mInProgressRecording;
            this.mInProgressRecording = null;
            this.mInProgressRecordingStopping = false;
            this.mAudioTrackIndex = null;
            this.mVideoTrackIndex = null;
            this.mEncodingFutures.clear();
            this.mOutputUri = Uri.EMPTY;
            this.mRecordingBytes = 0;
            this.mRecordingDurationNs = 0;
            this.mFirstRecordingVideoDataTimeUs = 0;
            this.mRecordingStopError = 1;
            this.mRecordingStopErrorCause = null;
            this.mAudioErrorCause = null;
            int i2 = AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$AudioState[this.mAudioState.ordinal()];
            if (i2 == 1) {
                setAudioState(AudioState.INITIALIZING);
            } else if (i2 == 2 || i2 == 3) {
                setAudioState(AudioState.IDLING);
            } else if (i2 == 4) {
                throw new AssertionError("Incorrectly finalize recording when audio state is IDLING");
            }
            onRecordingFinalized(recordingRecord2);
            return;
        }
        throw new AssertionError("Attempted to finalize in-progress recording, but no recording is in progress.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r7.mSourceState != androidx.camera.video.VideoOutput.SourceState.INACTIVE) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r0 = r7.mPendingRecordingRecord;
        r7.mPendingRecordingRecord = null;
        setState(androidx.camera.video.Recorder.State.INITIALIZING);
        r2 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE;
        r5 = r3;
        r3 = false;
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r7.mShouldWaitForNewSurface == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        updateNonPendingState(androidx.camera.video.Recorder.State.INITIALIZING);
        r0 = null;
        r2 = null;
        r5 = r3;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r2 = null;
        r5 = r3;
        r3 = false;
        r8 = makePendingRecordingActiveLocked(r7.mState);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r0 = null;
        r2 = null;
        r3 = false;
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onRecordingFinalized(androidx.camera.video.Recorder.RecordingRecord r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unexpected state on finalize of recording: "
            java.lang.Object r1 = r7.mLock
            monitor-enter(r1)
            androidx.camera.video.Recorder$RecordingRecord r2 = r7.mActiveRecordingRecord     // Catch:{ all -> 0x00a7 }
            if (r2 != r8) goto L_0x009f
            r8 = 0
            r7.mActiveRecordingRecord = r8     // Catch:{ all -> 0x00a7 }
            int[] r2 = androidx.camera.video.Recorder.AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ all -> 0x00a7 }
            androidx.camera.video.Recorder$State r3 = r7.mState     // Catch:{ all -> 0x00a7 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x00a7 }
            r2 = r2[r3]     // Catch:{ all -> 0x00a7 }
            r3 = 1
            r4 = 0
            switch(r2) {
                case 1: goto L_0x006d;
                case 2: goto L_0x0064;
                case 3: goto L_0x0032;
                case 4: goto L_0x0033;
                case 5: goto L_0x001d;
                case 6: goto L_0x001d;
                case 7: goto L_0x006d;
                case 8: goto L_0x006d;
                default: goto L_0x001b;
            }     // Catch:{ all -> 0x00a7 }
        L_0x001b:
            goto L_0x007c
        L_0x001d:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a7 }
            androidx.camera.video.Recorder$State r0 = r7.mState     // Catch:{ all -> 0x00a7 }
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a7 }
            r8.<init>(r0)     // Catch:{ all -> 0x00a7 }
            throw r8     // Catch:{ all -> 0x00a7 }
        L_0x0032:
            r3 = r4
        L_0x0033:
            androidx.camera.video.VideoOutput$SourceState r0 = r7.mSourceState     // Catch:{ all -> 0x00a7 }
            androidx.camera.video.VideoOutput$SourceState r2 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch:{ all -> 0x00a7 }
            if (r0 != r2) goto L_0x004a
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.mPendingRecordingRecord     // Catch:{ all -> 0x00a7 }
            r7.mPendingRecordingRecord = r8     // Catch:{ all -> 0x00a7 }
            androidx.camera.video.Recorder$State r2 = androidx.camera.video.Recorder.State.INITIALIZING     // Catch:{ all -> 0x00a7 }
            r7.setState(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.Exception r2 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch:{ all -> 0x00a7 }
            r5 = 4
            r6 = r5
            r5 = r3
            r3 = r4
            r4 = r6
            goto L_0x0080
        L_0x004a:
            boolean r0 = r7.mShouldWaitForNewSurface     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0058
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.INITIALIZING     // Catch:{ all -> 0x00a7 }
            r7.updateNonPendingState(r0)     // Catch:{ all -> 0x00a7 }
            r0 = r8
            r2 = r0
            r5 = r3
            r3 = r4
            goto L_0x0080
        L_0x0058:
            androidx.camera.video.Recorder$State r0 = r7.mState     // Catch:{ all -> 0x00a7 }
            androidx.camera.video.Recorder$RecordingRecord r0 = r7.makePendingRecordingActiveLocked(r0)     // Catch:{ all -> 0x00a7 }
            r2 = r8
            r5 = r3
            r3 = r4
            r8 = r0
            r0 = r2
            goto L_0x0080
        L_0x0064:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.INITIALIZING     // Catch:{ all -> 0x00a7 }
            r7.setState(r0)     // Catch:{ all -> 0x00a7 }
            r0 = r8
            r2 = r0
            r5 = r4
            goto L_0x0080
        L_0x006d:
            boolean r0 = r7.mShouldWaitForNewSurface     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0077
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.INITIALIZING     // Catch:{ all -> 0x00a7 }
            r7.setState(r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x007c
        L_0x0077:
            androidx.camera.video.Recorder$State r0 = androidx.camera.video.Recorder.State.IDLING     // Catch:{ all -> 0x00a7 }
            r7.setState(r0)     // Catch:{ all -> 0x00a7 }
        L_0x007c:
            r0 = r8
            r2 = r0
            r3 = r4
            r5 = r3
        L_0x0080:
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x0087
            r7.resetInternal()
            goto L_0x009e
        L_0x0087:
            if (r8 == 0) goto L_0x0099
            boolean r0 = r7.mShouldWaitForNewSurface
            if (r0 != 0) goto L_0x0091
            r7.startRecording(r8, r5)
            goto L_0x009e
        L_0x0091:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r0 = "Attempt to start a pending recording while the Recorder is waiting for a new surface request."
            r8.<init>(r0)
            throw r8
        L_0x0099:
            if (r0 == 0) goto L_0x009e
            r7.finalizePendingRecording(r0, r4, r2)
        L_0x009e:
            return
        L_0x009f:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "Active recording did not match finalized recording on finalize."
            r8.<init>(r0)     // Catch:{ all -> 0x00a7 }
            throw r8     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a7 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.onRecordingFinalized(androidx.camera.video.Recorder$RecordingRecord):void");
    }

    /* access modifiers changed from: package-private */
    public void onInProgressRecordingInternalError(RecordingRecord recordingRecord, int i, Throwable th) {
        boolean z;
        if (recordingRecord == this.mInProgressRecording) {
            synchronized (this.mLock) {
                z = false;
                switch (AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State[this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    case 5:
                    case 6:
                    case 9:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.mState);
                    case 7:
                    case 8:
                        setState(State.STOPPING);
                        z = true;
                        break;
                }
                if (recordingRecord != this.mActiveRecordingRecord) {
                    throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                }
            }
            if (z) {
                stopInternal(recordingRecord, (Long) null, i, th);
                return;
            }
            return;
        }
        throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Exception} */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void tryServicePendingRecording() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.mLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.video.Recorder.AnonymousClass5.$SwitchMap$androidx$camera$video$Recorder$State     // Catch:{ all -> 0x0050 }
            androidx.camera.video.Recorder$State r2 = r8.mState     // Catch:{ all -> 0x0050 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0050 }
            r1 = r1[r2]     // Catch:{ all -> 0x0050 }
            r2 = 3
            r3 = 4
            r4 = 0
            r5 = 0
            if (r1 == r2) goto L_0x001b
            if (r1 == r3) goto L_0x0019
            r3 = r4
            r1 = r5
        L_0x0017:
            r2 = r1
            goto L_0x0043
        L_0x0019:
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = r4
        L_0x001c:
            androidx.camera.video.Recorder$RecordingRecord r2 = r8.mActiveRecordingRecord     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0025
            r3 = r4
            r2 = r5
            r4 = r1
            r1 = r2
            goto L_0x0043
        L_0x0025:
            androidx.camera.video.VideoOutput$SourceState r2 = r8.mSourceState     // Catch:{ all -> 0x0050 }
            androidx.camera.video.VideoOutput$SourceState r6 = androidx.camera.video.VideoOutput.SourceState.INACTIVE     // Catch:{ all -> 0x0050 }
            if (r2 != r6) goto L_0x0038
            androidx.camera.video.Recorder$RecordingRecord r2 = r8.mPendingRecordingRecord     // Catch:{ all -> 0x0050 }
            r8.mPendingRecordingRecord = r5     // Catch:{ all -> 0x0050 }
            r8.restoreNonPendingState()     // Catch:{ all -> 0x0050 }
            java.lang.Exception r4 = PENDING_RECORDING_ERROR_CAUSE_SOURCE_INACTIVE     // Catch:{ all -> 0x0050 }
            r7 = r4
            r4 = r1
            r1 = r7
            goto L_0x0043
        L_0x0038:
            androidx.camera.video.Recorder$State r2 = r8.mState     // Catch:{ all -> 0x0050 }
            androidx.camera.video.Recorder$RecordingRecord r2 = r8.makePendingRecordingActiveLocked(r2)     // Catch:{ all -> 0x0050 }
            r3 = r4
            r4 = r1
            r1 = r5
            r5 = r2
            goto L_0x0017
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x004a
            r8.startRecording(r5, r4)
            goto L_0x004f
        L_0x004a:
            if (r2 == 0) goto L_0x004f
            r8.finalizePendingRecording(r2, r3, r1)
        L_0x004f:
            return
        L_0x0050:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.Recorder.tryServicePendingRecording():void");
    }

    private RecordingRecord makePendingRecordingActiveLocked(State state) {
        boolean z;
        if (state == State.PENDING_PAUSED) {
            z = true;
        } else if (state == State.PENDING_RECORDING) {
            z = false;
        } else {
            throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
        }
        if (this.mActiveRecordingRecord == null) {
            RecordingRecord recordingRecord = this.mPendingRecordingRecord;
            if (recordingRecord != null) {
                this.mActiveRecordingRecord = recordingRecord;
                this.mPendingRecordingRecord = null;
                if (z) {
                    setState(State.PAUSED);
                } else {
                    setState(State.RECORDING);
                }
                return recordingRecord;
            }
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        throw new AssertionError("Cannot make pending recording active because another recording is already active.");
    }

    private void startRecording(RecordingRecord recordingRecord, boolean z) {
        startInternal(recordingRecord);
        if (z) {
            m184lambda$pause$4$androidxcameravideoRecorder(recordingRecord);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateInProgressStatusEvent() {
        RecordingRecord recordingRecord = this.mInProgressRecording;
        if (recordingRecord != null) {
            recordingRecord.updateVideoRecordEvent(VideoRecordEvent.status(recordingRecord.getOutputOptions(), getInProgressRecordingStats()));
        }
    }

    /* access modifiers changed from: package-private */
    public RecordingStats getInProgressRecordingStats() {
        return RecordingStats.of(this.mRecordingDurationNs, this.mRecordingBytes, AudioStats.of(internalAudioStateToAudioStatsState(this.mAudioState), this.mAudioErrorCause));
    }

    /* access modifiers changed from: package-private */
    public <T> T getObservableData(StateObservable<T> stateObservable) {
        try {
            return stateObservable.fetchData().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAudioSupported() {
        return ((MediaSpec) getObservableData(this.mMediaSpec)).getAudioSpec().getChannelCount() != 0;
    }

    /* access modifiers changed from: package-private */
    public void setState(State state) {
        if (this.mState != state) {
            Logger.d(TAG, "Transitioning Recorder internal state: " + this.mState + " --> " + state);
            Set<State> set = PENDING_STATES;
            StreamInfo.StreamState streamState = null;
            if (set.contains(state)) {
                if (!set.contains(this.mState)) {
                    if (VALID_NON_PENDING_STATES_WHILE_PENDING.contains(this.mState)) {
                        State state2 = this.mState;
                        this.mNonPendingState = state2;
                        streamState = internalStateToStreamState(state2);
                    } else {
                        throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.mState);
                    }
                }
            } else if (this.mNonPendingState != null) {
                this.mNonPendingState = null;
            }
            this.mState = state;
            if (streamState == null) {
                streamState = internalStateToStreamState(state);
            }
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, streamState));
            return;
        }
        throw new AssertionError("Attempted to transition to state " + state + ", but Recorder is already in state " + state);
    }

    private void setLatestSurface(Surface surface) {
        int i;
        if (this.mLatestSurface != surface) {
            this.mLatestSurface = surface;
            synchronized (this.mLock) {
                if (surface != null) {
                    try {
                        i = surface.hashCode();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    i = 0;
                }
                setStreamId(i);
            }
        }
    }

    private void setStreamId(int i) {
        if (this.mStreamId != i) {
            Logger.d(TAG, "Transitioning streamId: " + this.mStreamId + " --> " + i);
            this.mStreamId = i;
            this.mStreamInfo.setState(StreamInfo.of(i, internalStateToStreamState(this.mState)));
        }
    }

    private void updateNonPendingState(State state) {
        if (!PENDING_STATES.contains(this.mState)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.mState);
        } else if (!VALID_NON_PENDING_STATES_WHILE_PENDING.contains(state)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + state);
        } else if (this.mNonPendingState != state) {
            this.mNonPendingState = state;
            this.mStreamInfo.setState(StreamInfo.of(this.mStreamId, internalStateToStreamState(state)));
        }
    }

    private void restoreNonPendingState() {
        if (PENDING_STATES.contains(this.mState)) {
            setState(this.mNonPendingState);
            return;
        }
        throw new AssertionError("Cannot restore non-pending state when in state " + this.mState);
    }

    /* access modifiers changed from: package-private */
    public void setAudioState(AudioState audioState) {
        Logger.d(TAG, "Transitioning audio state: " + this.mAudioState + " --> " + audioState);
        this.mAudioState = audioState;
    }

    private static int supportedMuxerFormatOrDefaultFrom(CamcorderProfileProxy camcorderProfileProxy, int i) {
        if (camcorderProfileProxy != null) {
            int fileFormat = camcorderProfileProxy.getFileFormat();
            if (fileFormat == 1) {
                return Build.VERSION.SDK_INT < 26 ? 0 : 2;
            }
            if (fileFormat == 2) {
                return 0;
            }
            if (fileFormat != 9) {
                return i;
            }
            return 1;
        }
        return i;
    }

    static abstract class RecordingRecord implements AutoCloseable {
        private final AtomicReference<AudioSourceSupplier> mAudioSourceSupplier = new AtomicReference<>((Object) null);
        private final CloseGuardHelper mCloseGuard = CloseGuardHelper.create();
        private final AtomicBoolean mInitialized = new AtomicBoolean(false);
        private final AtomicReference<MediaMuxerSupplier> mMediaMuxerSupplier = new AtomicReference<>((Object) null);
        private final AtomicReference<Consumer<Uri>> mRecordingFinalizer = new AtomicReference<>(new Recorder$RecordingRecord$$ExternalSyntheticLambda6());

        private interface AudioSourceSupplier {
            AudioSource get(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException;
        }

        private interface MediaMuxerSupplier {
            MediaMuxer get(int i, Consumer<Uri> consumer) throws IOException;
        }

        static /* synthetic */ void lambda$new$0(Uri uri) {
        }

        /* access modifiers changed from: package-private */
        public abstract Executor getCallbackExecutor();

        /* access modifiers changed from: package-private */
        public abstract Consumer<VideoRecordEvent> getEventListener();

        /* access modifiers changed from: package-private */
        public abstract OutputOptions getOutputOptions();

        /* access modifiers changed from: package-private */
        public abstract long getRecordingId();

        /* access modifiers changed from: package-private */
        public abstract boolean hasAudioEnabled();

        RecordingRecord() {
        }

        static RecordingRecord from(PendingRecording pendingRecording, long j) {
            return new AutoValue_Recorder_RecordingRecord(pendingRecording.getOutputOptions(), pendingRecording.getListenerExecutor(), pendingRecording.getEventListener(), pendingRecording.isAudioEnabled(), j);
        }

        /* access modifiers changed from: package-private */
        public void initializeRecording(final Context context) throws IOException {
            if (!this.mInitialized.getAndSet(true)) {
                OutputOptions outputOptions = getOutputOptions();
                boolean z = outputOptions instanceof FileDescriptorOutputOptions;
                Consumer consumer = null;
                ParcelFileDescriptor dup = z ? ((FileDescriptorOutputOptions) outputOptions).getParcelFileDescriptor().dup() : null;
                this.mCloseGuard.open("finalizeRecording");
                this.mMediaMuxerSupplier.set(new Recorder$RecordingRecord$$ExternalSyntheticLambda0(outputOptions, dup));
                if (hasAudioEnabled()) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        this.mAudioSourceSupplier.set(new AudioSourceSupplier() {
                            public AudioSource get(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException {
                                return new AudioSource(settings, executor, context);
                            }
                        });
                    } else {
                        this.mAudioSourceSupplier.set(new AudioSourceSupplier() {
                            public AudioSource get(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException {
                                return new AudioSource(settings, executor, (Context) null);
                            }
                        });
                    }
                }
                if (outputOptions instanceof MediaStoreOutputOptions) {
                    MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                    if (Build.VERSION.SDK_INT >= 29) {
                        consumer = new Recorder$RecordingRecord$$ExternalSyntheticLambda1(mediaStoreOutputOptions);
                    } else {
                        consumer = new Recorder$RecordingRecord$$ExternalSyntheticLambda2(mediaStoreOutputOptions, context);
                    }
                } else if (z) {
                    consumer = new Recorder$RecordingRecord$$ExternalSyntheticLambda3(dup);
                }
                if (consumer != null) {
                    this.mRecordingFinalizer.set(consumer);
                    return;
                }
                return;
            }
            throw new AssertionError("Recording " + this + " has already been initialized");
        }

        static /* synthetic */ MediaMuxer lambda$initializeRecording$1(OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor, int i, Consumer consumer) throws IOException {
            MediaMuxer mediaMuxer;
            Uri uri = Uri.EMPTY;
            if (outputOptions instanceof FileOutputOptions) {
                File file = ((FileOutputOptions) outputOptions).getFile();
                if (!OutputUtil.createParentFolder(file)) {
                    Logger.w(Recorder.TAG, "Failed to create folder for " + file.getAbsolutePath());
                }
                mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
                uri = Uri.fromFile(file);
            } else if (outputOptions instanceof FileDescriptorOutputOptions) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaMuxer = Api26Impl.createMediaMuxer(parcelFileDescriptor.getFileDescriptor(), i);
                } else {
                    throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                }
            } else if (outputOptions instanceof MediaStoreOutputOptions) {
                MediaStoreOutputOptions mediaStoreOutputOptions = (MediaStoreOutputOptions) outputOptions;
                ContentValues contentValues = new ContentValues(mediaStoreOutputOptions.getContentValues());
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("is_pending", 1);
                }
                uri = mediaStoreOutputOptions.getContentResolver().insert(mediaStoreOutputOptions.getCollectionUri(), contentValues);
                if (uri == null) {
                    throw new IOException("Unable to create MediaStore entry.");
                } else if (Build.VERSION.SDK_INT < 26) {
                    String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
                    if (absolutePathFromUri != null) {
                        if (!OutputUtil.createParentFolder(new File(absolutePathFromUri))) {
                            Logger.w(Recorder.TAG, "Failed to create folder for " + absolutePathFromUri);
                        }
                        mediaMuxer = new MediaMuxer(absolutePathFromUri, i);
                    } else {
                        throw new IOException("Unable to get path from uri " + uri);
                    }
                } else {
                    ParcelFileDescriptor openFileDescriptor = mediaStoreOutputOptions.getContentResolver().openFileDescriptor(uri, "rw");
                    mediaMuxer = Api26Impl.createMediaMuxer(openFileDescriptor.getFileDescriptor(), i);
                    openFileDescriptor.close();
                }
            } else {
                throw new AssertionError("Invalid output options type: " + outputOptions.getClass().getSimpleName());
            }
            consumer.accept(uri);
            return mediaMuxer;
        }

        static /* synthetic */ void lambda$initializeRecording$2(MediaStoreOutputOptions mediaStoreOutputOptions, Uri uri) {
            if (!uri.equals(Uri.EMPTY)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_pending", 0);
                mediaStoreOutputOptions.getContentResolver().update(uri, contentValues, (String) null, (String[]) null);
            }
        }

        static /* synthetic */ void lambda$initializeRecording$4(MediaStoreOutputOptions mediaStoreOutputOptions, Context context, Uri uri) {
            if (!uri.equals(Uri.EMPTY)) {
                String absolutePathFromUri = OutputUtil.getAbsolutePathFromUri(mediaStoreOutputOptions.getContentResolver(), uri, Recorder.MEDIA_COLUMN);
                if (absolutePathFromUri != null) {
                    MediaScannerConnection.scanFile(context, new String[]{absolutePathFromUri}, (String[]) null, new Recorder$RecordingRecord$$ExternalSyntheticLambda4());
                    return;
                }
                Logger.d(Recorder.TAG, "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
            }
        }

        static /* synthetic */ void lambda$initializeRecording$3(String str, Uri uri) {
            if (uri == null) {
                Logger.e(Recorder.TAG, String.format("File scanning operation failed [path: %s]", new Object[]{str}));
                return;
            }
            Logger.d(Recorder.TAG, String.format("File scan completed successfully [path: %s, URI: %s]", new Object[]{str, uri}));
        }

        static /* synthetic */ void lambda$initializeRecording$5(ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                Logger.e(Recorder.TAG, "Failed to close dup'd ParcelFileDescriptor", e);
            }
        }

        /* access modifiers changed from: package-private */
        public void updateVideoRecordEvent(VideoRecordEvent videoRecordEvent) {
            if (Objects.equals(videoRecordEvent.getOutputOptions(), getOutputOptions())) {
                String str = "Sending VideoRecordEvent " + videoRecordEvent.getClass().getSimpleName();
                if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
                    VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
                    if (finalize.hasError()) {
                        str = str + String.format(" [error: %s]", new Object[]{VideoRecordEvent.Finalize.errorToString(finalize.getError())});
                    }
                }
                Logger.d(Recorder.TAG, str);
                if (getCallbackExecutor() != null && getEventListener() != null) {
                    try {
                        getCallbackExecutor().execute(new Recorder$RecordingRecord$$ExternalSyntheticLambda5(this, videoRecordEvent));
                    } catch (RejectedExecutionException e) {
                        Logger.e(Recorder.TAG, "The callback executor is invalid.", e);
                    }
                }
            } else {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + videoRecordEvent.getOutputOptions() + ", Expected: " + getOutputOptions() + "]");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$updateVideoRecordEvent$6$androidx-camera-video-Recorder$RecordingRecord  reason: not valid java name */
        public /* synthetic */ void m191lambda$updateVideoRecordEvent$6$androidxcameravideoRecorder$RecordingRecord(VideoRecordEvent videoRecordEvent) {
            getEventListener().accept(videoRecordEvent);
        }

        /* access modifiers changed from: package-private */
        public AudioSource performOneTimeAudioSourceCreation(AudioSource.Settings settings, Executor executor) throws AudioSourceAccessException {
            if (hasAudioEnabled()) {
                AudioSourceSupplier andSet = this.mAudioSourceSupplier.getAndSet((Object) null);
                if (andSet != null) {
                    return andSet.get(settings, executor);
                }
                throw new AssertionError("One-time audio source creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + this);
        }

        /* access modifiers changed from: package-private */
        public MediaMuxer performOneTimeMediaMuxerCreation(int i, Consumer<Uri> consumer) throws IOException {
            if (this.mInitialized.get()) {
                MediaMuxerSupplier andSet = this.mMediaMuxerSupplier.getAndSet((Object) null);
                if (andSet != null) {
                    return andSet.get(i, consumer);
                }
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            throw new AssertionError("Recording " + this + " has not been initialized");
        }

        /* access modifiers changed from: package-private */
        public void finalizeRecording(Uri uri) {
            if (this.mInitialized.get()) {
                finalizeRecordingInternal(this.mRecordingFinalizer.getAndSet((Object) null), uri);
            }
        }

        public void close() {
            finalizeRecording(Uri.EMPTY);
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            try {
                this.mCloseGuard.warnIfOpen();
                Consumer andSet = this.mRecordingFinalizer.getAndSet((Object) null);
                if (andSet != null) {
                    finalizeRecordingInternal(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        private void finalizeRecordingInternal(Consumer<Uri> consumer, Uri uri) {
            if (consumer != null) {
                this.mCloseGuard.close();
                consumer.accept(uri);
                return;
            }
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    public static final class Builder {
        private EncoderFactory mAudioEncoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;
        private Executor mExecutor = null;
        private final MediaSpec.Builder mMediaSpecBuilder = MediaSpec.builder();
        private EncoderFactory mVideoEncoderFactory = Recorder.DEFAULT_ENCODER_FACTORY;

        public Builder setExecutor(Executor executor) {
            Preconditions.checkNotNull(executor, "The specified executor can't be null.");
            this.mExecutor = executor;
            return this;
        }

        public Builder setQualitySelector(QualitySelector qualitySelector) {
            Preconditions.checkNotNull(qualitySelector, "The specified quality selector can't be null.");
            this.mMediaSpecBuilder.configureVideo(new Recorder$Builder$$ExternalSyntheticLambda0(qualitySelector));
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setAspectRatio(int i) {
            this.mMediaSpecBuilder.configureVideo(new Recorder$Builder$$ExternalSyntheticLambda2(i));
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setAudioSource(int i) {
            this.mMediaSpecBuilder.configureAudio(new Recorder$Builder$$ExternalSyntheticLambda1(i));
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setVideoEncoderFactory(EncoderFactory encoderFactory) {
            this.mVideoEncoderFactory = encoderFactory;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setAudioEncoderFactory(EncoderFactory encoderFactory) {
            this.mAudioEncoderFactory = encoderFactory;
            return this;
        }

        public Recorder build() {
            return new Recorder(this.mExecutor, this.mMediaSpecBuilder.build(), this.mVideoEncoderFactory, this.mAudioEncoderFactory);
        }
    }
}
