package androidx.camera.video;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.video.StreamInfo;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class VideoCapture<T extends VideoOutput> extends UseCase {
    private static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final String SURFACE_UPDATE_KEY = "androidx.camera.video.VideoCapture.streamUpdate";
    private static final String TAG = "VideoCapture";
    DeferrableSurface mDeferrableSurface;
    SessionConfig.Builder mSessionConfigBuilder = new SessionConfig.Builder();
    VideoOutput.SourceState mSourceState = VideoOutput.SourceState.INACTIVE;
    StreamInfo mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
    private final Observable.Observer<StreamInfo> mStreamInfoObserver = new Observable.Observer<StreamInfo>() {
        public void onNewData(StreamInfo streamInfo) {
            if (streamInfo == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            } else if (VideoCapture.this.mSourceState != VideoOutput.SourceState.INACTIVE) {
                Logger.d(VideoCapture.TAG, "Stream info update: old: " + VideoCapture.this.mStreamInfo + " new: " + streamInfo);
                StreamInfo streamInfo2 = VideoCapture.this.mStreamInfo;
                VideoCapture.this.mStreamInfo = streamInfo;
                if (!StreamInfo.NON_SURFACE_STREAM_ID.contains(Integer.valueOf(streamInfo2.getId())) && !StreamInfo.NON_SURFACE_STREAM_ID.contains(Integer.valueOf(streamInfo.getId())) && streamInfo2.getId() != streamInfo.getId()) {
                    VideoCapture videoCapture = VideoCapture.this;
                    videoCapture.resetPipeline(videoCapture.getCameraId(), (VideoCaptureConfig) VideoCapture.this.getCurrentConfig(), (Size) Preconditions.checkNotNull(VideoCapture.this.getAttachedSurfaceResolution()));
                } else if ((streamInfo2.getId() != -1 && streamInfo.getId() == -1) || (streamInfo2.getId() == -1 && streamInfo.getId() != -1)) {
                    VideoCapture videoCapture2 = VideoCapture.this;
                    videoCapture2.applyStreamInfoToSessionConfigBuilder(videoCapture2.mSessionConfigBuilder, streamInfo);
                    VideoCapture videoCapture3 = VideoCapture.this;
                    videoCapture3.updateSessionConfig(videoCapture3.mSessionConfigBuilder.build());
                    VideoCapture.this.notifyReset();
                } else if (streamInfo2.getStreamState() != streamInfo.getStreamState()) {
                    VideoCapture videoCapture4 = VideoCapture.this;
                    videoCapture4.applyStreamInfoToSessionConfigBuilder(videoCapture4.mSessionConfigBuilder, streamInfo);
                    VideoCapture videoCapture5 = VideoCapture.this;
                    videoCapture5.updateSessionConfig(videoCapture5.mSessionConfigBuilder.build());
                    VideoCapture.this.notifyUpdated();
                }
            }
        }

        public void onError(Throwable th) {
            Logger.w(VideoCapture.TAG, "Receive onError from StreamState observer", th);
        }
    };
    private SurfaceRequest mSurfaceRequest;
    ListenableFuture<Void> mSurfaceUpdateFuture = null;

    public static <T extends VideoOutput> VideoCapture<T> withOutput(T t) {
        return new Builder((VideoOutput) Preconditions.checkNotNull(t)).build();
    }

    VideoCapture(VideoCaptureConfig<T> videoCaptureConfig) {
        super(videoCaptureConfig);
    }

    public T getOutput() {
        return ((VideoCaptureConfig) getCurrentConfig()).getVideoOutput();
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public void setTargetRotation(int i) {
        if (setTargetRotationInternal(i)) {
            sendTransformationInfoIfReady(getAttachedSurfaceResolution());
        }
    }

    public void onStateAttached() {
        super.onStateAttached();
        getOutput().getStreamInfo().addObserver(CameraXExecutors.mainThreadExecutor(), this.mStreamInfoObserver);
        setSourceState(VideoOutput.SourceState.ACTIVE_NON_STREAMING);
    }

    /* access modifiers changed from: protected */
    public Size onSuggestedResolutionUpdated(Size size) {
        Logger.d(TAG, "suggestedResolution = " + size);
        String cameraId = getCameraId();
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) getCurrentConfig();
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> supportedResolutions = videoCaptureConfig.getSupportedResolutions((List<Pair<Integer, Size[]>>) null);
        if (supportedResolutions != null) {
            Iterator<Pair<Integer, Size[]>> it = supportedResolutions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair next = it.next();
                if (((Integer) next.first).intValue() == getImageFormat() && next.second != null) {
                    sizeArr = (Size[]) next.second;
                    break;
                }
            }
        }
        if (sizeArr != null) {
            int width = size.getWidth() * size.getHeight();
            int length = sizeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size2 = sizeArr[i];
                if (Objects.equals(size2, size)) {
                    break;
                } else if (size2.getWidth() * size2.getHeight() < width) {
                    Logger.d(TAG, "Find a higher priority resolution: " + size2);
                    size = size2;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.mStreamInfo = (StreamInfo) fetchObservableValue(getOutput().getStreamInfo(), StreamInfo.STREAM_INFO_ANY_INACTIVE);
        SessionConfig.Builder createPipeline = createPipeline(cameraId, videoCaptureConfig, size);
        this.mSessionConfigBuilder = createPipeline;
        applyStreamInfoToSessionConfigBuilder(createPipeline, this.mStreamInfo);
        updateSessionConfig(this.mSessionConfigBuilder.build());
        notifyActive();
        return size;
    }

    public void setViewPortCropRect(Rect rect) {
        super.setViewPortCropRect(rect);
        sendTransformationInfoIfReady(getAttachedSurfaceResolution());
    }

    public void onDetached() {
        clearPipeline();
    }

    public void onStateDetached() {
        Preconditions.checkState(Threads.isMainThread(), "VideoCapture can only be detached on the main thread.");
        setSourceState(VideoOutput.SourceState.INACTIVE);
        getOutput().getStreamInfo().removeObserver(this.mStreamInfoObserver);
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.d(TAG, "VideoCapture is detached from the camera. Surface update cancelled.");
        }
    }

    public String toString() {
        return "VideoCapture:" + getName();
    }

    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE, 1);
        if (z) {
            config = Config.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.UseCaseConfig$Builder, androidx.camera.core.impl.UseCaseConfig$Builder<?, ?, ?>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal r1, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r2) {
        /*
            r0 = this;
            r0.updateSupportedResolutionsByQuality(r1, r2)
            androidx.camera.core.impl.UseCaseConfig r1 = r2.getUseCaseConfig()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.VideoCapture.onMergeConfig(androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.impl.UseCaseConfig$Builder):androidx.camera.core.impl.UseCaseConfig");
    }

    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    private void sendTransformationInfoIfReady(Size size) {
        CameraInternal camera = getCamera();
        SurfaceRequest surfaceRequest = this.mSurfaceRequest;
        Rect cropRect = getCropRect(size);
        if (camera != null && surfaceRequest != null && cropRect != null) {
            surfaceRequest.updateTransformationInfo(SurfaceRequest.TransformationInfo.of(cropRect, getRelativeRotation(camera), getTargetRotationInternal()));
        }
    }

    private Rect getCropRect(Size size) {
        if (getViewPortCropRect() != null) {
            return getViewPortCropRect();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    private SessionConfig.Builder createPipeline(String str, VideoCaptureConfig<T> videoCaptureConfig, Size size) {
        Threads.checkMainThread();
        this.mSurfaceRequest = new SurfaceRequest(size, (CameraInternal) Preconditions.checkNotNull(getCamera()), false);
        videoCaptureConfig.getVideoOutput().onSurfaceRequested(this.mSurfaceRequest);
        sendTransformationInfoIfReady(size);
        DeferrableSurface deferrableSurface = this.mSurfaceRequest.getDeferrableSurface();
        this.mDeferrableSurface = deferrableSurface;
        deferrableSurface.setContainerClass(MediaCodec.class);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(videoCaptureConfig);
        createFrom.addErrorListener(new VideoCapture$$ExternalSyntheticLambda0(this, str, videoCaptureConfig, size));
        return createFrom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createPipeline$0$androidx-camera-video-VideoCapture  reason: not valid java name */
    public /* synthetic */ void m192lambda$createPipeline$0$androidxcameravideoVideoCapture(String str, VideoCaptureConfig videoCaptureConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        resetPipeline(str, videoCaptureConfig, size);
    }

    private void clearPipeline() {
        Threads.checkMainThread();
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
        this.mSurfaceRequest = null;
        this.mStreamInfo = StreamInfo.STREAM_INFO_ANY_INACTIVE;
    }

    /* access modifiers changed from: package-private */
    public void resetPipeline(String str, VideoCaptureConfig<T> videoCaptureConfig, Size size) {
        clearPipeline();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder createPipeline = createPipeline(str, videoCaptureConfig, size);
            this.mSessionConfigBuilder = createPipeline;
            applyStreamInfoToSessionConfigBuilder(createPipeline, this.mStreamInfo);
            updateSessionConfig(this.mSessionConfigBuilder.build());
            notifyReset();
        }
    }

    public static final class Defaults implements ConfigProvider<VideoCaptureConfig<?>> {
        private static final VideoCaptureConfig<?> DEFAULT_CONFIG;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 3;
        private static final VideoOutput DEFAULT_VIDEO_OUTPUT;

        static {
            VideoCapture$Defaults$$ExternalSyntheticLambda0 videoCapture$Defaults$$ExternalSyntheticLambda0 = new VideoCapture$Defaults$$ExternalSyntheticLambda0();
            DEFAULT_VIDEO_OUTPUT = videoCapture$Defaults$$ExternalSyntheticLambda0;
            DEFAULT_CONFIG = new Builder(videoCapture$Defaults$$ExternalSyntheticLambda0).setSurfaceOccupancyPriority(3).getUseCaseConfig();
        }

        public VideoCaptureConfig<?> getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    private MediaSpec getMediaSpec() {
        return (MediaSpec) fetchObservableValue(getOutput().getMediaSpec(), (Object) null);
    }

    /* access modifiers changed from: package-private */
    public void applyStreamInfoToSessionConfigBuilder(SessionConfig.Builder builder, StreamInfo streamInfo) {
        boolean z = true;
        boolean z2 = streamInfo.getId() == -1;
        if (streamInfo.getStreamState() != StreamInfo.StreamState.ACTIVE) {
            z = false;
        }
        if (!z2 || !z) {
            builder.clearSurfaces();
            if (!z2) {
                if (z) {
                    builder.addSurface(this.mDeferrableSurface);
                } else {
                    builder.addNonRepeatingSurface(this.mDeferrableSurface);
                }
            }
            setupSurfaceUpdateNotifier(builder, z);
            return;
        }
        throw new IllegalStateException("Unexpected stream state, stream is error but active");
    }

    private void setupSurfaceUpdateNotifier(SessionConfig.Builder builder, final boolean z) {
        ListenableFuture<Void> listenableFuture = this.mSurfaceUpdateFuture;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            Logger.d(TAG, "A newer surface update is requested. Previous surface update cancelled.");
        }
        final ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new VideoCapture$$ExternalSyntheticLambda2(this, builder));
        this.mSurfaceUpdateFuture = future;
        Futures.addCallback(future, new FutureCallback<Void>() {
            public void onSuccess(Void voidR) {
                VideoOutput.SourceState sourceState;
                if (future == VideoCapture.this.mSurfaceUpdateFuture && VideoCapture.this.mSourceState != VideoOutput.SourceState.INACTIVE) {
                    VideoCapture videoCapture = VideoCapture.this;
                    if (z) {
                        sourceState = VideoOutput.SourceState.ACTIVE_STREAMING;
                    } else {
                        sourceState = VideoOutput.SourceState.ACTIVE_NON_STREAMING;
                    }
                    videoCapture.setSourceState(sourceState);
                }
            }

            public void onFailure(Throwable th) {
                if (!(th instanceof CancellationException)) {
                    Logger.e(VideoCapture.TAG, "Surface update completed with unexpected exception", th);
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$setupSurfaceUpdateNotifier$2$androidx-camera-video-VideoCapture  reason: not valid java name */
    public /* synthetic */ Object m193lambda$setupSurfaceUpdateNotifier$2$androidxcameravideoVideoCapture(final SessionConfig.Builder builder, final CallbackToFutureAdapter.Completer completer) throws Exception {
        builder.addTag(SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AnonymousClass2 r3 = new CameraCaptureCallback() {
            public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                Object tag;
                super.onCaptureCompleted(cameraCaptureResult);
                if (!atomicBoolean.get() && (tag = cameraCaptureResult.getTagBundle().getTag(VideoCapture.SURFACE_UPDATE_KEY)) != null && ((Integer) tag).intValue() == completer.hashCode() && completer.set(null) && !atomicBoolean.getAndSet(true)) {
                    CameraXExecutors.mainThreadExecutor().execute(new VideoCapture$2$$ExternalSyntheticLambda0(this, builder));
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: lambda$onCaptureCompleted$0$androidx-camera-video-VideoCapture$2  reason: not valid java name */
            public /* synthetic */ void m194lambda$onCaptureCompleted$0$androidxcameravideoVideoCapture$2(SessionConfig.Builder builder) {
                builder.removeCameraCaptureCallback(this);
            }
        };
        completer.addCancellationListener(new VideoCapture$$ExternalSyntheticLambda1(atomicBoolean, builder, r3), CameraXExecutors.directExecutor());
        builder.addRepeatingCameraCaptureCallback(r3);
        return String.format("%s[0x%x]", new Object[]{SURFACE_UPDATE_KEY, Integer.valueOf(completer.hashCode())});
    }

    static /* synthetic */ void lambda$setupSurfaceUpdateNotifier$1(AtomicBoolean atomicBoolean, SessionConfig.Builder builder, CameraCaptureCallback cameraCaptureCallback) {
        Preconditions.checkState(Threads.isMainThread(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        builder.removeCameraCaptureCallback(cameraCaptureCallback);
    }

    private void updateSupportedResolutionsByQuality(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder<?, ?, ?> builder) throws IllegalArgumentException {
        MediaSpec mediaSpec = getMediaSpec();
        Preconditions.checkArgument(mediaSpec != null, "Unable to update target resolution by null MediaSpec.");
        if (QualitySelector.getSupportedQualities(cameraInfoInternal).isEmpty()) {
            Logger.w(TAG, "Can't find any supported quality on the device.");
            return;
        }
        QualitySelector qualitySelector = mediaSpec.getVideoSpec().getQualitySelector();
        List<Quality> prioritizedQualities = qualitySelector.getPrioritizedQualities(cameraInfoInternal);
        Logger.d(TAG, "Found selectedQualities " + prioritizedQualities + " by " + qualitySelector);
        if (!prioritizedQualities.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Quality resolution : prioritizedQualities) {
                arrayList.add(QualitySelector.getResolution(cameraInfoInternal, resolution));
            }
            Logger.d(TAG, "Set supported resolutions = " + arrayList);
            builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, Collections.singletonList(Pair.create(Integer.valueOf(getImageFormat()), (Size[]) arrayList.toArray(new Size[0]))));
            return;
        }
        throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
    }

    private static <T> T fetchObservableValue(Observable<T> observable, T t) {
        ListenableFuture<T> fetchData = observable.fetchData();
        if (!fetchData.isDone()) {
            return t;
        }
        try {
            return fetchData.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: package-private */
    public void setSourceState(VideoOutput.SourceState sourceState) {
        if (sourceState != this.mSourceState) {
            this.mSourceState = sourceState;
            getOutput().onSourceStateChanged(sourceState);
        }
    }

    public static final class Builder<T extends VideoOutput> implements UseCaseConfig.Builder<VideoCapture<T>, VideoCaptureConfig<T>, Builder<T>>, ImageOutputConfig.Builder<Builder<T>>, ThreadConfig.Builder<Builder<T>> {
        private final MutableOptionsBundle mMutableConfig;

        Builder(T t) {
            this(createInitialBundle(t));
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            if (mutableOptionsBundle.containsOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT)) {
                Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
                if (cls == null || cls.equals(VideoCapture.class)) {
                    Class<VideoCapture> cls2 = VideoCapture.class;
                    Class cls3 = cls2;
                    setTargetClass(cls2);
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }

        static Builder<? extends VideoOutput> fromConfig(Config config) {
            return new Builder<>(MutableOptionsBundle.from(config));
        }

        public static <T extends VideoOutput> Builder<T> fromConfig(VideoCaptureConfig<T> videoCaptureConfig) {
            return new Builder<>(MutableOptionsBundle.from(videoCaptureConfig));
        }

        private static <T extends VideoOutput> MutableOptionsBundle createInitialBundle(T t) {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT, t);
            return create;
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public VideoCaptureConfig<T> getUseCaseConfig() {
            return new VideoCaptureConfig<>(OptionsBundle.from(this.mMutableConfig));
        }

        public VideoCapture<T> build() {
            return new VideoCapture<>(getUseCaseConfig());
        }

        public Builder<T> setTargetClass(Class<VideoCapture<T>> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder<T> setTargetName(String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder<T> setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder<T> setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        public Builder<T> setTargetResolution(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        public Builder<T> setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        public Builder<T> setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        public Builder<T> setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        public Builder<T> setBackgroundExecutor(Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        public Builder<T> setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        public Builder<T> setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        public Builder<T> setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder<T> setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder<T> setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder<T> setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        public Builder<T> setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }
    }
}
