package androidx.camera.video.internal;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.AutoValue_AudioSource_Settings;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.compat.Api23Impl;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.encoder.InputBuffer;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AudioSource {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(new Integer[]{48000, 44100, 22050, 11025, 8000, 4800}));
    private static final String TAG = "AudioSource";
    private FutureCallback<InputBuffer> mAcquireBufferCallback;
    final AudioRecord mAudioRecord;
    private AudioManager.AudioRecordingCallback mAudioRecordingCallback;
    AudioSourceCallback mAudioSourceCallback;
    BufferProvider<InputBuffer> mBufferProvider;
    BufferProvider.State mBufferProviderState = BufferProvider.State.INACTIVE;
    final int mBufferSize;
    Executor mCallbackExecutor;
    final Executor mExecutor;
    boolean mIsSendingAudio;
    AtomicBoolean mSourceSilence = new AtomicBoolean(false);
    InternalState mState = InternalState.CONFIGURED;
    private Observable.Observer<BufferProvider.State> mStateObserver;

    public interface AudioSourceCallback {
        void onError(Throwable th);

        void onSilenced(boolean z);
    }

    enum InternalState {
        CONFIGURED,
        STARTED,
        RELEASED
    }

    private static int channelCountToChannelConfig(int i) {
        return i == 1 ? 16 : 12;
    }

    private static int channelCountToChannelMask(int i) {
        return i == 1 ? 16 : 12;
    }

    public AudioSource(Settings settings, Executor executor, Context context) throws AudioSourceAccessException {
        boolean z = false;
        if (isSettingsSupported(settings.getSampleRate(), settings.getChannelCount(), settings.getAudioFormat())) {
            int minBufferSize = getMinBufferSize(settings.getSampleRate(), settings.getChannelCount(), settings.getAudioFormat());
            Preconditions.checkState(minBufferSize > 0 ? true : z);
            Executor newSequentialExecutor = CameraXExecutors.newSequentialExecutor(executor);
            this.mExecutor = newSequentialExecutor;
            int i = minBufferSize * 2;
            this.mBufferSize = i;
            try {
                AudioFormat build = new AudioFormat.Builder().setSampleRate(settings.getSampleRate()).setChannelMask(channelCountToChannelMask(settings.getChannelCount())).setEncoding(settings.getAudioFormat()).build();
                AudioRecord.Builder createAudioRecordBuilder = Api23Impl.createAudioRecordBuilder();
                if (Build.VERSION.SDK_INT >= 31 && context != null) {
                    Api31Impl.setContext(createAudioRecordBuilder, context);
                }
                Api23Impl.setAudioSource(createAudioRecordBuilder, settings.getAudioSource());
                Api23Impl.setAudioFormat(createAudioRecordBuilder, build);
                Api23Impl.setBufferSizeInBytes(createAudioRecordBuilder, i);
                AudioRecord build2 = Api23Impl.build(createAudioRecordBuilder);
                this.mAudioRecord = build2;
                if (build2.getState() != 1) {
                    build2.release();
                    throw new AudioSourceAccessException("Unable to initialize AudioRecord");
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AudioRecordingApi29Callback audioRecordingApi29Callback = new AudioRecordingApi29Callback();
                    this.mAudioRecordingCallback = audioRecordingApi29Callback;
                    Api29Impl.registerAudioRecordingCallback(build2, newSequentialExecutor, audioRecordingApi29Callback);
                }
            } catch (IllegalArgumentException e) {
                throw new AudioSourceAccessException("Unable to create AudioRecord", e);
            }
        } else {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", new Object[]{Integer.valueOf(settings.getSampleRate()), Integer.valueOf(settings.getChannelCount()), Integer.valueOf(settings.getAudioFormat())}));
        }
    }

    class AudioRecordingApi29Callback extends AudioManager.AudioRecordingCallback {
        AudioRecordingApi29Callback() {
        }

        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            super.onRecordingConfigChanged(list);
            if (AudioSource.this.mCallbackExecutor != null && AudioSource.this.mAudioSourceCallback != null) {
                for (AudioRecordingConfiguration next : list) {
                    if (Api24Impl.getClientAudioSessionId(next) == AudioSource.this.mAudioRecord.getAudioSessionId()) {
                        boolean isClientSilenced = Api29Impl.isClientSilenced(next);
                        if (AudioSource.this.mSourceSilence.getAndSet(isClientSilenced) != isClientSilenced) {
                            AudioSource.this.mCallbackExecutor.execute(new AudioSource$AudioRecordingApi29Callback$$ExternalSyntheticLambda0(this, isClientSilenced));
                            return;
                        }
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onRecordingConfigChanged$0$androidx-camera-video-internal-AudioSource$AudioRecordingApi29Callback  reason: not valid java name */
        public /* synthetic */ void m209lambda$onRecordingConfigChanged$0$androidxcameravideointernalAudioSource$AudioRecordingApi29Callback(boolean z) {
            AudioSource.this.mAudioSourceCallback.onSilenced(z);
        }
    }

    public void setBufferProvider(BufferProvider<InputBuffer> bufferProvider) {
        this.mExecutor.execute(new AudioSource$$ExternalSyntheticLambda3(this, bufferProvider));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setBufferProvider$0$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m206lambda$setBufferProvider$0$androidxcameravideointernalAudioSource(BufferProvider bufferProvider) {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i == 1 || i == 2) {
            if (this.mBufferProvider != bufferProvider) {
                resetBufferProvider(bufferProvider);
            }
        } else if (i == 3) {
            throw new IllegalStateException("AudioRecorder is released");
        }
    }

    public void start() {
        this.mExecutor.execute(new AudioSource$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$start$1$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m207lambda$start$1$androidxcameravideointernalAudioSource() {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i == 1) {
            setState(InternalState.STARTED);
            updateSendingAudio();
        } else if (i == 3) {
            throw new IllegalStateException("AudioRecorder is released");
        }
    }

    public void stop() {
        this.mExecutor.execute(new AudioSource$$ExternalSyntheticLambda5(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$stop$2$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m208lambda$stop$2$androidxcameravideointernalAudioSource() {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i == 2) {
            setState(InternalState.CONFIGURED);
            updateSendingAudio();
        } else if (i == 3) {
            throw new IllegalStateException("AudioRecorder is released");
        }
    }

    public void release() {
        this.mExecutor.execute(new AudioSource$$ExternalSyntheticLambda4(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$release$3$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m204lambda$release$3$androidxcameravideointernalAudioSource() {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i == 1 || i == 2) {
            resetBufferProvider((BufferProvider<InputBuffer>) null);
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, this.mAudioRecordingCallback);
            }
            this.mAudioRecord.release();
            stopSendingAudio();
            setState(InternalState.RELEASED);
        }
    }

    /* renamed from: androidx.camera.video.internal.AudioSource$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.video.internal.AudioSource$InternalState[] r0 = androidx.camera.video.internal.AudioSource.InternalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState = r0
                androidx.camera.video.internal.AudioSource$InternalState r1 = androidx.camera.video.internal.AudioSource.InternalState.CONFIGURED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.video.internal.AudioSource$InternalState r1 = androidx.camera.video.internal.AudioSource.InternalState.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$video$internal$AudioSource$InternalState     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.video.internal.AudioSource$InternalState r1 = androidx.camera.video.internal.AudioSource.InternalState.RELEASED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.AudioSource.AnonymousClass3.<clinit>():void");
        }
    }

    public void setAudioSourceCallback(Executor executor, AudioSourceCallback audioSourceCallback) {
        this.mExecutor.execute(new AudioSource$$ExternalSyntheticLambda0(this, executor, audioSourceCallback));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setAudioSourceCallback$4$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m205lambda$setAudioSourceCallback$4$androidxcameravideointernalAudioSource(Executor executor, AudioSourceCallback audioSourceCallback) {
        int i = AnonymousClass3.$SwitchMap$androidx$camera$video$internal$AudioSource$InternalState[this.mState.ordinal()];
        if (i == 1) {
            this.mCallbackExecutor = executor;
            this.mAudioSourceCallback = audioSourceCallback;
        } else if (i == 2 || i == 3) {
            throw new IllegalStateException("The audio recording callback must be registered before the audio source is started.");
        }
    }

    private void resetBufferProvider(final BufferProvider<InputBuffer> bufferProvider) {
        BufferProvider<InputBuffer> bufferProvider2 = this.mBufferProvider;
        if (bufferProvider2 != null) {
            bufferProvider2.removeObserver(this.mStateObserver);
            this.mBufferProvider = null;
            this.mStateObserver = null;
            this.mAcquireBufferCallback = null;
        }
        this.mBufferProviderState = BufferProvider.State.INACTIVE;
        updateSendingAudio();
        if (bufferProvider != null) {
            this.mBufferProvider = bufferProvider;
            this.mStateObserver = new Observable.Observer<BufferProvider.State>() {
                public void onNewData(BufferProvider.State state) {
                    if (AudioSource.this.mBufferProvider == bufferProvider) {
                        Logger.d(AudioSource.TAG, "Receive BufferProvider state change: " + AudioSource.this.mBufferProviderState + " to " + state);
                        AudioSource.this.mBufferProviderState = state;
                        AudioSource.this.updateSendingAudio();
                    }
                }

                public void onError(Throwable th) {
                    if (AudioSource.this.mBufferProvider == bufferProvider) {
                        AudioSource.this.notifyError(th);
                    }
                }
            };
            this.mAcquireBufferCallback = new FutureCallback<InputBuffer>() {
                public void onSuccess(InputBuffer inputBuffer) {
                    if (!AudioSource.this.mIsSendingAudio || AudioSource.this.mBufferProvider != bufferProvider) {
                        inputBuffer.cancel();
                        return;
                    }
                    ByteBuffer byteBuffer = inputBuffer.getByteBuffer();
                    int read = AudioSource.this.mAudioRecord.read(byteBuffer, AudioSource.this.mBufferSize);
                    if (read > 0) {
                        byteBuffer.limit(read);
                        inputBuffer.setPresentationTimeUs(AudioSource.this.generatePresentationTimeUs());
                        inputBuffer.submit();
                    } else {
                        Logger.w(AudioSource.TAG, "Unable to read data from AudioRecord.");
                        inputBuffer.cancel();
                    }
                    AudioSource.this.sendNextAudio();
                }

                public void onFailure(Throwable th) {
                    if (AudioSource.this.mBufferProvider != bufferProvider) {
                        Logger.d(AudioSource.TAG, "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
                        AudioSource.this.notifyError(th);
                    }
                }
            };
            this.mBufferProvider.addObserver(this.mExecutor, this.mStateObserver);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyError(Throwable th) {
        Executor executor = this.mCallbackExecutor;
        if (executor != null && this.mAudioSourceCallback != null) {
            executor.execute(new AudioSource$$ExternalSyntheticLambda1(this, th));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$notifyError$5$androidx-camera-video-internal-AudioSource  reason: not valid java name */
    public /* synthetic */ void m203lambda$notifyError$5$androidxcameravideointernalAudioSource(Throwable th) {
        this.mAudioSourceCallback.onError(th);
    }

    /* access modifiers changed from: package-private */
    public void updateSendingAudio() {
        if (this.mState == InternalState.STARTED && this.mBufferProviderState == BufferProvider.State.ACTIVE) {
            startSendingAudio();
        } else {
            stopSendingAudio();
        }
    }

    private void startSendingAudio() {
        if (!this.mIsSendingAudio) {
            try {
                Logger.d(TAG, "startSendingAudio");
                this.mAudioRecord.startRecording();
                if (this.mAudioRecord.getRecordingState() == 3) {
                    this.mIsSendingAudio = true;
                    sendNextAudio();
                    return;
                }
                throw new IllegalStateException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            } catch (IllegalStateException e) {
                Logger.w(TAG, "Failed to start AudioRecord", e);
                setState(InternalState.CONFIGURED);
                notifyError(new AudioSourceAccessException("Unable to start the audio record.", e));
            }
        }
    }

    private void stopSendingAudio() {
        if (this.mIsSendingAudio) {
            this.mIsSendingAudio = false;
            try {
                Logger.d(TAG, "stopSendingAudio");
                this.mAudioRecord.stop();
                if (this.mAudioRecord.getRecordingState() != 1) {
                    throw new IllegalStateException("Unable to stop AudioRecord with state: " + this.mAudioRecord.getRecordingState());
                }
            } catch (IllegalStateException e) {
                Logger.w(TAG, "Failed to stop AudioRecord", e);
                notifyError(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void sendNextAudio() {
        Futures.addCallback(this.mBufferProvider.acquireBuffer(), this.mAcquireBufferCallback, this.mExecutor);
    }

    /* access modifiers changed from: package-private */
    public void setState(InternalState internalState) {
        Logger.d(TAG, "Transitioning internal state: " + this.mState + " --> " + internalState);
        this.mState = internalState;
    }

    /* access modifiers changed from: package-private */
    public long generatePresentationTimeUs() {
        long j;
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        if (Api24Impl.getTimestamp(this.mAudioRecord, audioTimestamp, 0) == 0) {
            j = TimeUnit.NANOSECONDS.toMicros(audioTimestamp.nanoTime);
        } else {
            Logger.w(TAG, "Unable to get audio timestamp");
            j = -1;
        }
        return j == -1 ? TimeUnit.NANOSECONDS.toMicros(System.nanoTime()) : j;
    }

    public static boolean isSettingsSupported(int i, int i2, int i3) {
        return i > 0 && i2 > 0 && getMinBufferSize(i, i2, i3) > 0;
    }

    private static int getMinBufferSize(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, channelCountToChannelConfig(i2), i3);
    }

    public static abstract class Settings {
        public abstract int getAudioFormat();

        public abstract int getAudioSource();

        public abstract int getChannelCount();

        public abstract int getSampleRate();

        public abstract Builder toBuilder();

        public static Builder builder() {
            return new AutoValue_AudioSource_Settings.Builder().setAudioSource(-1).setSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
        }

        Settings() {
        }

        public static abstract class Builder {
            /* access modifiers changed from: package-private */
            public abstract Settings autoBuild();

            public abstract Builder setAudioFormat(int i);

            public abstract Builder setAudioSource(int i);

            public abstract Builder setChannelCount(int i);

            public abstract Builder setSampleRate(int i);

            public final Settings build() {
                Settings autoBuild = autoBuild();
                String str = autoBuild.getAudioSource() == -1 ? " audioSource" : "";
                if (autoBuild.getSampleRate() <= 0) {
                    str = str + " sampleRate";
                }
                if (autoBuild.getChannelCount() <= 0) {
                    str = str + " channelCount";
                }
                if (autoBuild.getAudioFormat() == -1) {
                    str = str + " audioFormat";
                }
                if (str.isEmpty()) {
                    return autoBuild;
                }
                throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
            }

            Builder() {
            }
        }
    }
}
