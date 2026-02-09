package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageSaver;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.workaround.ExifRotationAvailability;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class ImageCapture extends UseCase {
    public static final int CAPTURE_MODE_MAXIMIZE_QUALITY = 0;
    public static final int CAPTURE_MODE_MINIMIZE_LATENCY = 1;
    public static final int CAPTURE_MODE_ZERO_SHUTTER_LAG = 2;
    private static final int DEFAULT_CAPTURE_MODE = 1;
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final int DEFAULT_FLASH_MODE = 2;
    public static final int ERROR_CAMERA_CLOSED = 3;
    public static final int ERROR_CAPTURE_FAILED = 2;
    public static final int ERROR_FILE_IO = 1;
    public static final int ERROR_INVALID_CAMERA = 4;
    public static final int ERROR_UNKNOWN = 0;
    static final ExifRotationAvailability EXIF_ROTATION_AVAILABILITY = new ExifRotationAvailability();
    public static final int FLASH_MODE_AUTO = 0;
    public static final int FLASH_MODE_OFF = 2;
    public static final int FLASH_MODE_ON = 1;
    private static final int FLASH_MODE_UNKNOWN = -1;
    public static final int FLASH_TYPE_ONE_SHOT_FLASH = 0;
    public static final int FLASH_TYPE_USE_TORCH_AS_FLASH = 1;
    private static final byte JPEG_QUALITY_MAXIMIZE_QUALITY_MODE = 100;
    private static final byte JPEG_QUALITY_MINIMIZE_LATENCY_MODE = 95;
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "ImageCapture";
    private CaptureBundle mCaptureBundle;
    private CaptureConfig mCaptureConfig;
    private final int mCaptureMode;
    private CaptureProcessor mCaptureProcessor;
    private final ImageReaderProxy.OnImageAvailableListener mClosingListener = new ImageCapture$$ExternalSyntheticLambda0();
    private Rational mCropAspectRatio = null;
    private DeferrableSurface mDeferrableSurface;
    private ExecutorService mExecutor;
    private int mFlashMode = -1;
    private final int mFlashType;
    private ImageCaptureRequestProcessor mImageCaptureRequestProcessor;
    SafeCloseImageReaderProxy mImageReader;
    private ListenableFuture<Void> mImageReaderCloseFuture = Futures.immediateFuture(null);
    final Executor mIoExecutor;
    private boolean mIsSessionProcessorEnabled = true;
    private final AtomicReference<Integer> mLockedFlashMode = new AtomicReference<>((Object) null);
    private int mMaxCaptureStages;
    private CameraCaptureCallback mMetadataMatchingCaptureCallback;
    ProcessingImageReader mProcessingImageReader;
    private Matrix mSensorToBufferTransformMatrix = new Matrix();
    final Executor mSequentialIoExecutor;
    SessionConfig.Builder mSessionConfigBuilder;
    private boolean mUseSoftwareJpeg = false;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CaptureMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FlashType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageCaptureError {
    }

    public static abstract class OnImageCapturedCallback {
        public void onCaptureSuccess(ImageProxy imageProxy) {
        }

        public void onError(ImageCaptureException imageCaptureException) {
        }
    }

    public interface OnImageSavedCallback {
        void onError(ImageCaptureException imageCaptureException);

        void onImageSaved(OutputFileResults outputFileResults);
    }

    static /* synthetic */ Void lambda$issueTakePicture$12(List list) {
        return null;
    }

    static /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        ImageProxy acquireLatestImage;
        try {
            acquireLatestImage = imageReaderProxy.acquireLatestImage();
            Log.d(TAG, "Discarding ImageProxy which was inadvertently acquired: " + acquireLatestImage);
            if (acquireLatestImage != null) {
                acquireLatestImage.close();
                return;
            }
            return;
        } catch (IllegalStateException e) {
            Log.e(TAG, "Failed to acquire latest image.", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig2.containsOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            this.mCaptureMode = imageCaptureConfig2.getCaptureMode();
        } else {
            this.mCaptureMode = 1;
        }
        this.mFlashType = imageCaptureConfig2.getFlashType(0);
        Executor executor = (Executor) Preconditions.checkNotNull(imageCaptureConfig2.getIoExecutor(CameraXExecutors.ioExecutor()));
        this.mIoExecutor = executor;
        this.mSequentialIoExecutor = CameraXExecutors.newSequentialExecutor(executor);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.SessionConfig.Builder createPipeline(java.lang.String r16, androidx.camera.core.impl.ImageCaptureConfig r17, android.util.Size r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            androidx.camera.core.impl.utils.Threads.checkMainThread()
            androidx.camera.core.impl.SessionConfig$Builder r2 = androidx.camera.core.impl.SessionConfig.Builder.createFrom(r17)
            int r3 = r15.getCaptureMode()
            r4 = 2
            if (r3 != r4) goto L_0x0018
            androidx.camera.core.impl.CameraControlInternal r3 = r15.getCameraControl()
            r3.addZslConfig(r1, r2)
        L_0x0018:
            androidx.camera.core.ImageReaderProxyProvider r3 = r17.getImageReaderProxyProvider()
            r5 = 0
            if (r3 == 0) goto L_0x0046
            androidx.camera.core.SafeCloseImageReaderProxy r3 = new androidx.camera.core.SafeCloseImageReaderProxy
            androidx.camera.core.ImageReaderProxyProvider r6 = r17.getImageReaderProxyProvider()
            int r7 = r18.getWidth()
            int r8 = r18.getHeight()
            int r9 = r15.getImageFormat()
            r10 = 2
            r11 = 0
            androidx.camera.core.impl.ImageReaderProxy r6 = r6.newInstance(r7, r8, r9, r10, r11)
            r3.<init>(r6)
            r0.mImageReader = r3
            androidx.camera.core.ImageCapture$1 r3 = new androidx.camera.core.ImageCapture$1
            r3.<init>()
            r0.mMetadataMatchingCaptureCallback = r3
            goto L_0x0123
        L_0x0046:
            boolean r3 = r0.mIsSessionProcessorEnabled
            r6 = 26
            r7 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x00fc
            int r3 = r15.getImageFormat()
            if (r3 != r7) goto L_0x006b
            androidx.camera.core.AndroidImageReaderProxy r3 = new androidx.camera.core.AndroidImageReaderProxy
            int r6 = r18.getWidth()
            int r7 = r18.getHeight()
            int r8 = r15.getImageFormat()
            android.media.ImageReader r6 = android.media.ImageReader.newInstance(r6, r7, r8, r4)
            r3.<init>(r6)
            r6 = r5
            goto L_0x00cb
        L_0x006b:
            int r3 = r15.getImageFormat()
            r8 = 35
            if (r3 != r8) goto L_0x00e3
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto L_0x00db
            androidx.camera.core.internal.YuvToJpegProcessor r3 = new androidx.camera.core.internal.YuvToJpegProcessor
            int r6 = r15.getJpegQualityInternal()
            r3.<init>(r6, r4)
            androidx.camera.core.ModifiableImageReaderProxy r6 = new androidx.camera.core.ModifiableImageReaderProxy
            int r9 = r18.getWidth()
            int r10 = r18.getHeight()
            android.media.ImageReader r8 = android.media.ImageReader.newInstance(r9, r10, r8, r4)
            r6.<init>(r8)
            androidx.camera.core.impl.CaptureBundle r8 = androidx.camera.core.CaptureBundles.singleDefaultCaptureBundle()
            androidx.camera.core.ProcessingImageReader$Builder r9 = new androidx.camera.core.ProcessingImageReader$Builder
            r9.<init>(r6, r8, r3)
            java.util.concurrent.ExecutorService r10 = r0.mExecutor
            androidx.camera.core.ProcessingImageReader$Builder r9 = r9.setPostProcessExecutor(r10)
            androidx.camera.core.ProcessingImageReader$Builder r7 = r9.setOutputFormat(r7)
            androidx.camera.core.ProcessingImageReader r7 = r7.build()
            androidx.camera.core.impl.MutableTagBundle r9 = androidx.camera.core.impl.MutableTagBundle.create()
            java.lang.String r10 = r7.getTagBundleKey()
            java.util.List r8 = r8.getCaptureStages()
            r11 = 0
            java.lang.Object r8 = r8.get(r11)
            androidx.camera.core.impl.CaptureStage r8 = (androidx.camera.core.impl.CaptureStage) r8
            int r8 = r8.getId()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.putTag(r10, r8)
            r6.setImageTagBundle(r9)
            r6 = r3
            r3 = r7
        L_0x00cb:
            androidx.camera.core.ImageCapture$2 r7 = new androidx.camera.core.ImageCapture$2
            r7.<init>()
            r0.mMetadataMatchingCaptureCallback = r7
            androidx.camera.core.SafeCloseImageReaderProxy r7 = new androidx.camera.core.SafeCloseImageReaderProxy
            r7.<init>(r3)
            r0.mImageReader = r7
            goto L_0x01aa
        L_0x00db:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Does not support API level < 26"
            r1.<init>(r2)
            throw r1
        L_0x00e3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported image format:"
            r2.<init>(r3)
            int r3 = r15.getImageFormat()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00fc:
            androidx.camera.core.impl.CaptureProcessor r3 = r0.mCaptureProcessor
            if (r3 != 0) goto L_0x0126
            boolean r8 = r0.mUseSoftwareJpeg
            if (r8 == 0) goto L_0x0105
            goto L_0x0126
        L_0x0105:
            androidx.camera.core.MetadataImageReader r3 = new androidx.camera.core.MetadataImageReader
            int r6 = r18.getWidth()
            int r7 = r18.getHeight()
            int r8 = r15.getImageFormat()
            r3.<init>(r6, r7, r8, r4)
            androidx.camera.core.impl.CameraCaptureCallback r6 = r3.getCameraCaptureCallback()
            r0.mMetadataMatchingCaptureCallback = r6
            androidx.camera.core.SafeCloseImageReaderProxy r6 = new androidx.camera.core.SafeCloseImageReaderProxy
            r6.<init>(r3)
            r0.mImageReader = r6
        L_0x0123:
            r6 = r5
            goto L_0x01aa
        L_0x0126:
            int r10 = r15.getImageFormat()
            int r8 = r15.getImageFormat()
            boolean r9 = r0.mUseSoftwareJpeg
            if (r9 == 0) goto L_0x0170
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto L_0x0168
            java.lang.String r3 = "ImageCapture"
            java.lang.String r6 = "Using software JPEG encoder."
            androidx.camera.core.Logger.i(r3, r6)
            androidx.camera.core.impl.CaptureProcessor r3 = r0.mCaptureProcessor
            if (r3 == 0) goto L_0x0158
            androidx.camera.core.internal.YuvToJpegProcessor r3 = new androidx.camera.core.internal.YuvToJpegProcessor
            int r6 = r15.getJpegQualityInternal()
            int r8 = r0.mMaxCaptureStages
            r3.<init>(r6, r8)
            androidx.camera.core.CaptureProcessorPipeline r6 = new androidx.camera.core.CaptureProcessorPipeline
            androidx.camera.core.impl.CaptureProcessor r8 = r0.mCaptureProcessor
            int r9 = r0.mMaxCaptureStages
            java.util.concurrent.ExecutorService r11 = r0.mExecutor
            r6.<init>(r8, r9, r3, r11)
            goto L_0x0164
        L_0x0158:
            androidx.camera.core.internal.YuvToJpegProcessor r3 = new androidx.camera.core.internal.YuvToJpegProcessor
            int r6 = r15.getJpegQualityInternal()
            int r8 = r0.mMaxCaptureStages
            r3.<init>(r6, r8)
            r6 = r3
        L_0x0164:
            r13 = r6
            r6 = r3
            r3 = r7
            goto L_0x0173
        L_0x0168:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Software JPEG only supported on API 26+"
            r1.<init>(r2)
            throw r1
        L_0x0170:
            r13 = r3
            r6 = r5
            r3 = r8
        L_0x0173:
            androidx.camera.core.ProcessingImageReader$Builder r14 = new androidx.camera.core.ProcessingImageReader$Builder
            int r8 = r18.getWidth()
            int r9 = r18.getHeight()
            int r11 = r0.mMaxCaptureStages
            androidx.camera.core.impl.CaptureBundle r7 = androidx.camera.core.CaptureBundles.singleDefaultCaptureBundle()
            androidx.camera.core.impl.CaptureBundle r12 = r15.getCaptureBundle(r7)
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.concurrent.ExecutorService r7 = r0.mExecutor
            androidx.camera.core.ProcessingImageReader$Builder r7 = r14.setPostProcessExecutor(r7)
            androidx.camera.core.ProcessingImageReader$Builder r3 = r7.setOutputFormat(r3)
            androidx.camera.core.ProcessingImageReader r3 = r3.build()
            r0.mProcessingImageReader = r3
            androidx.camera.core.impl.CameraCaptureCallback r3 = r3.getCameraCaptureCallback()
            r0.mMetadataMatchingCaptureCallback = r3
            androidx.camera.core.SafeCloseImageReaderProxy r3 = new androidx.camera.core.SafeCloseImageReaderProxy
            androidx.camera.core.ProcessingImageReader r7 = r0.mProcessingImageReader
            r3.<init>(r7)
            r0.mImageReader = r3
        L_0x01aa:
            androidx.camera.core.ImageCapture$ImageCaptureRequestProcessor r3 = r0.mImageCaptureRequestProcessor
            if (r3 == 0) goto L_0x01b8
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "Request is canceled."
            r7.<init>(r8)
            r3.cancelRequests(r7)
        L_0x01b8:
            androidx.camera.core.ImageCapture$ImageCaptureRequestProcessor r3 = new androidx.camera.core.ImageCapture$ImageCaptureRequestProcessor
            androidx.camera.core.ImageCapture$$ExternalSyntheticLambda6 r7 = new androidx.camera.core.ImageCapture$$ExternalSyntheticLambda6
            r7.<init>(r15)
            if (r6 != 0) goto L_0x01c3
            r8 = r5
            goto L_0x01c8
        L_0x01c3:
            androidx.camera.core.ImageCapture$3 r8 = new androidx.camera.core.ImageCapture$3
            r8.<init>(r6)
        L_0x01c8:
            r3.<init>(r4, r7, r8)
            r0.mImageCaptureRequestProcessor = r3
            androidx.camera.core.SafeCloseImageReaderProxy r3 = r0.mImageReader
            androidx.camera.core.impl.ImageReaderProxy$OnImageAvailableListener r4 = r0.mClosingListener
            java.util.concurrent.ScheduledExecutorService r6 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r3.setOnImageAvailableListener(r4, r6)
            androidx.camera.core.impl.DeferrableSurface r3 = r0.mDeferrableSurface
            if (r3 == 0) goto L_0x01df
            r3.close()
        L_0x01df:
            androidx.camera.core.impl.ImmediateSurface r3 = new androidx.camera.core.impl.ImmediateSurface
            androidx.camera.core.SafeCloseImageReaderProxy r4 = r0.mImageReader
            android.view.Surface r4 = r4.getSurface()
            android.util.Size r6 = new android.util.Size
            androidx.camera.core.SafeCloseImageReaderProxy r7 = r0.mImageReader
            int r7 = r7.getWidth()
            androidx.camera.core.SafeCloseImageReaderProxy r8 = r0.mImageReader
            int r8 = r8.getHeight()
            r6.<init>(r7, r8)
            androidx.camera.core.SafeCloseImageReaderProxy r7 = r0.mImageReader
            int r7 = r7.getImageFormat()
            r3.<init>(r4, r6, r7)
            r0.mDeferrableSurface = r3
            androidx.camera.core.ProcessingImageReader r3 = r0.mProcessingImageReader
            if (r3 == 0) goto L_0x020c
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getCloseFuture()
            goto L_0x0210
        L_0x020c:
            com.google.common.util.concurrent.ListenableFuture r3 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r5)
        L_0x0210:
            r0.mImageReaderCloseFuture = r3
            androidx.camera.core.impl.DeferrableSurface r3 = r0.mDeferrableSurface
            com.google.common.util.concurrent.ListenableFuture r3 = r3.getTerminationFuture()
            androidx.camera.core.SafeCloseImageReaderProxy r4 = r0.mImageReader
            java.util.Objects.requireNonNull(r4)
            androidx.camera.core.ImageCapture$$ExternalSyntheticLambda7 r5 = new androidx.camera.core.ImageCapture$$ExternalSyntheticLambda7
            r5.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor()
            r3.addListener(r5, r4)
            androidx.camera.core.impl.DeferrableSurface r3 = r0.mDeferrableSurface
            r2.addNonRepeatingSurface(r3)
            androidx.camera.core.ImageCapture$$ExternalSyntheticLambda8 r3 = new androidx.camera.core.ImageCapture$$ExternalSyntheticLambda8
            r4 = r16
            r5 = r17
            r3.<init>(r15, r4, r5, r1)
            r2.addErrorListener(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.createPipeline(java.lang.String, androidx.camera.core.impl.ImageCaptureConfig, android.util.Size):androidx.camera.core.impl.SessionConfig$Builder");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createPipeline$2$androidx-camera-core-ImageCapture  reason: not valid java name */
    public /* synthetic */ void m136lambda$createPipeline$2$androidxcameracoreImageCapture(String str, ImageCaptureConfig imageCaptureConfig, Size size, SessionConfig sessionConfig, SessionConfig.SessionError sessionError) {
        clearPipeline();
        if (isCurrentCamera(str)) {
            SessionConfig.Builder createPipeline = createPipeline(str, imageCaptureConfig, size);
            this.mSessionConfigBuilder = createPipeline;
            updateSessionConfig(createPipeline.build());
            notifyReset();
        }
    }

    /* access modifiers changed from: package-private */
    public void clearPipeline() {
        Threads.checkMainThread();
        ImageCaptureRequestProcessor imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
        if (imageCaptureRequestProcessor != null) {
            imageCaptureRequestProcessor.cancelRequests(new CancellationException("Request is canceled."));
            this.mImageCaptureRequestProcessor = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        this.mDeferrableSurface = null;
        this.mImageReader = null;
        this.mProcessingImageReader = null;
        this.mImageReaderCloseFuture = Futures.immediateFuture(null);
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
    }

    public UseCaseConfig<?> getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, getCaptureMode());
        if (z) {
            config = Config.mergeConfigs(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(Config config) {
        return Builder.fromConfig(config);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.camera.core.impl.UseCaseConfig$Builder, androidx.camera.core.impl.UseCaseConfig$Builder<?, ?, ?>] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.UseCaseConfig<?> onMergeConfig(androidx.camera.core.impl.CameraInfoInternal r8, androidx.camera.core.impl.UseCaseConfig.Builder<?, ?, ?> r9) {
        /*
            r7 = this;
            androidx.camera.core.impl.UseCaseConfig r0 = r9.getUseCaseConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureProcessor> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR
            r2 = 0
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            java.lang.String r1 = "ImageCapture"
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            if (r0 == 0) goto L_0x0029
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L_0x0029
            java.lang.String r8 = "Requesting software JPEG due to a CaptureProcessor is set."
            androidx.camera.core.Logger.i(r1, r8)
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            r8.insertOption(r0, r4)
            goto L_0x005b
        L_0x0029:
            androidx.camera.core.impl.Quirks r8 = r8.getCameraQuirks()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk> r0 = androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x005b
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            java.lang.Object r8 = r8.retrieveOption(r0, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x004d
            java.lang.String r8 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            androidx.camera.core.Logger.w(r1, r8)
            goto L_0x005b
        L_0x004d:
            java.lang.String r8 = "Requesting software JPEG due to device quirk."
            androidx.camera.core.Logger.i(r1, r8)
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER
            r8.insertOption(r0, r4)
        L_0x005b:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            boolean r8 = enforceSoftwareJpegConstraints(r8)
            androidx.camera.core.impl.MutableConfig r0 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r1 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_BUFFER_FORMAT
            java.lang.Object r0 = r0.retrieveOption(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            r4 = 35
            if (r0 == 0) goto L_0x009d
            androidx.camera.core.impl.MutableConfig r5 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureProcessor> r6 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR
            java.lang.Object r2 = r5.retrieveOption(r6, r2)
            if (r2 != 0) goto L_0x0082
            r2 = r3
            goto L_0x0083
        L_0x0082:
            r2 = r1
        L_0x0083:
            java.lang.String r5 = "Cannot set buffer format with CaptureProcessor defined."
            androidx.core.util.Preconditions.checkArgument(r2, r5)
            androidx.camera.core.impl.MutableConfig r2 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r5 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            if (r8 == 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            int r4 = r0.intValue()
        L_0x0095:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r2.insertOption(r5, r8)
            goto L_0x00ff
        L_0x009d:
            androidx.camera.core.impl.MutableConfig r0 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.CaptureProcessor> r5 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR
            java.lang.Object r0 = r0.retrieveOption(r5, r2)
            if (r0 != 0) goto L_0x00f2
            if (r8 == 0) goto L_0x00ac
            goto L_0x00f2
        L_0x00ac:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS
            java.lang.Object r8 = r8.retrieveOption(r0, r2)
            java.util.List r8 = (java.util.List) r8
            r0 = 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x00ca
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r2 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.insertOption(r2, r0)
            goto L_0x00ff
        L_0x00ca:
            boolean r2 = isImageFormatSupported(r8, r0)
            if (r2 == 0) goto L_0x00de
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r2 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.insertOption(r2, r0)
            goto L_0x00ff
        L_0x00de:
            boolean r8 = isImageFormatSupported(r8, r4)
            if (r8 == 0) goto L_0x00ff
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r8.insertOption(r0, r2)
            goto L_0x00ff
        L_0x00f2:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r8.insertOption(r0, r2)
        L_0x00ff:
            androidx.camera.core.impl.MutableConfig r8 = r9.getMutableConfig()
            androidx.camera.core.impl.Config$Option<java.lang.Integer> r0 = androidx.camera.core.impl.ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = r8.retrieveOption(r0, r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < r3) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r3 = r1
        L_0x0118:
            java.lang.String r8 = "Maximum outstanding image count must be at least 1"
            androidx.core.util.Preconditions.checkArgument(r3, r8)
            androidx.camera.core.impl.UseCaseConfig r8 = r9.getUseCaseConfig()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.onMergeConfig(androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.impl.UseCaseConfig$Builder):androidx.camera.core.impl.UseCaseConfig");
    }

    private static boolean isImageFormatSupported(List<Pair<Integer, Size[]>> list, int i) {
        if (list == null) {
            return false;
        }
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCameraControlReady() {
        trySetFlashModeToCameraControl();
    }

    public int getFlashMode() {
        int i;
        synchronized (this.mLockedFlashMode) {
            i = this.mFlashMode;
            if (i == -1) {
                i = ((ImageCaptureConfig) getCurrentConfig()).getFlashMode(2);
            }
        }
        return i;
    }

    public void setFlashMode(int i) {
        if (i == 0 || i == 1 || i == 2) {
            synchronized (this.mLockedFlashMode) {
                this.mFlashMode = i;
                trySetFlashModeToCameraControl();
            }
            return;
        }
        throw new IllegalArgumentException("Invalid flash mode: " + i);
    }

    public void setCropAspectRatio(Rational rational) {
        this.mCropAspectRatio = rational;
    }

    public int getTargetRotation() {
        return getTargetRotationInternal();
    }

    public void setTargetRotation(int i) {
        int targetRotation = getTargetRotation();
        if (setTargetRotationInternal(i) && this.mCropAspectRatio != null) {
            this.mCropAspectRatio = ImageUtil.getRotatedAspectRatio(Math.abs(CameraOrientationUtil.surfaceRotationToDegrees(i) - CameraOrientationUtil.surfaceRotationToDegrees(targetRotation)), this.mCropAspectRatio);
        }
    }

    public int getCaptureMode() {
        return this.mCaptureMode;
    }

    public int getJpegQuality() {
        return getJpegQualityInternal();
    }

    public ResolutionInfo getResolutionInfo() {
        return super.getResolutionInfo();
    }

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        this.mSensorToBufferTransformMatrix = matrix;
    }

    /* access modifiers changed from: protected */
    public ResolutionInfo getResolutionInfoInternal() {
        CameraInternal camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        Rect viewPortCropRect = getViewPortCropRect();
        Rational rational = this.mCropAspectRatio;
        if (viewPortCropRect == null) {
            if (rational != null) {
                viewPortCropRect = ImageUtil.computeCropRectFromAspectRatio(attachedSurfaceResolution, rational);
            } else {
                viewPortCropRect = new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
            }
        }
        return ResolutionInfo.create(attachedSurfaceResolution, viewPortCropRect, getRelativeRotation(camera));
    }

    /* renamed from: takePicture */
    public void m138lambda$takePicture$3$androidxcameracoreImageCapture(Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new ImageCapture$$ExternalSyntheticLambda4(this, executor, onImageCapturedCallback));
        } else {
            sendImageCaptureRequest(executor, onImageCapturedCallback, false);
        }
    }

    /* renamed from: takePicture */
    public void m139lambda$takePicture$4$androidxcameracoreImageCapture(OutputFileOptions outputFileOptions, Executor executor, final OnImageSavedCallback onImageSavedCallback) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new ImageCapture$$ExternalSyntheticLambda5(this, outputFileOptions, executor, onImageSavedCallback));
            return;
        }
        final AnonymousClass4 r7 = new ImageSaver.OnImageSavedCallback() {
            public void onImageSaved(OutputFileResults outputFileResults) {
                onImageSavedCallback.onImageSaved(outputFileResults);
            }

            public void onError(ImageSaver.SaveError saveError, String str, Throwable th) {
                int i = 1;
                if (AnonymousClass8.$SwitchMap$androidx$camera$core$ImageSaver$SaveError[saveError.ordinal()] != 1) {
                    i = 0;
                }
                onImageSavedCallback.onError(new ImageCaptureException(i, str, th));
            }
        };
        final int jpegQualityInternal = getJpegQualityInternal();
        final OutputFileOptions outputFileOptions2 = outputFileOptions;
        final Executor executor2 = executor;
        final OnImageSavedCallback onImageSavedCallback2 = onImageSavedCallback;
        sendImageCaptureRequest(CameraXExecutors.mainThreadExecutor(), new OnImageCapturedCallback() {
            public void onCaptureSuccess(ImageProxy imageProxy) {
                ImageCapture.this.mIoExecutor.execute(new ImageSaver(imageProxy, outputFileOptions2, imageProxy.getImageInfo().getRotationDegrees(), jpegQualityInternal, executor2, ImageCapture.this.mSequentialIoExecutor, r7));
            }

            public void onError(ImageCaptureException imageCaptureException) {
                onImageSavedCallback2.onError(imageCaptureException);
            }
        }, true);
    }

    /* renamed from: androidx.camera.core.ImageCapture$8  reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageSaver$SaveError;

        static {
            int[] iArr = new int[ImageSaver.SaveError.values().length];
            $SwitchMap$androidx$camera$core$ImageSaver$SaveError = iArr;
            try {
                iArr[ImageSaver.SaveError.FILE_IO_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static Rect computeDispatchCropRect(Rect rect, Rational rational, int i, Size size, int i2) {
        if (rect != null) {
            return ImageUtil.computeCropRectFromDispatchInfo(rect, i, size, i2);
        }
        if (rational != null) {
            if (i2 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (ImageUtil.isAspectRatioValid(size, rational)) {
                return ImageUtil.computeCropRectFromAspectRatio(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public void onStateDetached() {
        abortImageCaptureRequests();
    }

    private void abortImageCaptureRequests() {
        if (this.mImageCaptureRequestProcessor != null) {
            this.mImageCaptureRequestProcessor.cancelRequests(new CameraClosedException("Camera is closed."));
        }
    }

    private void sendImageCaptureRequest(Executor executor, OnImageCapturedCallback onImageCapturedCallback, boolean z) {
        CameraInternal camera = getCamera();
        if (camera == null) {
            executor.execute(new ImageCapture$$ExternalSyntheticLambda2(this, onImageCapturedCallback));
            return;
        }
        ImageCaptureRequestProcessor imageCaptureRequestProcessor = this.mImageCaptureRequestProcessor;
        if (imageCaptureRequestProcessor == null) {
            executor.execute(new ImageCapture$$ExternalSyntheticLambda3(onImageCapturedCallback));
        } else {
            imageCaptureRequestProcessor.sendRequest(new ImageCaptureRequest(getRelativeRotation(camera), getJpegQualityForImageCaptureRequest(camera, z), this.mCropAspectRatio, getViewPortCropRect(), this.mSensorToBufferTransformMatrix, executor, onImageCapturedCallback));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$sendImageCaptureRequest$5$androidx-camera-core-ImageCapture  reason: not valid java name */
    public /* synthetic */ void m137lambda$sendImageCaptureRequest$5$androidxcameracoreImageCapture(OnImageCapturedCallback onImageCapturedCallback) {
        onImageCapturedCallback.onError(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", (Throwable) null));
    }

    private int getJpegQualityForImageCaptureRequest(CameraInternal cameraInternal, boolean z) {
        if (!z) {
            return getJpegQualityInternal();
        }
        int relativeRotation = getRelativeRotation(cameraInternal);
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Rect computeDispatchCropRect = computeDispatchCropRect(getViewPortCropRect(), this.mCropAspectRatio, relativeRotation, attachedSurfaceResolution, relativeRotation);
        if (ImageUtil.shouldCropImage(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight(), computeDispatchCropRect.width(), computeDispatchCropRect.height())) {
            return this.mCaptureMode == 0 ? 100 : 95;
        }
        return getJpegQualityInternal();
    }

    private void lockFlashMode() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() == null) {
                this.mLockedFlashMode.set(Integer.valueOf(getFlashMode()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unlockFlashMode() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.mLockedFlashMode
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.mLockedFlashMode     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            int r1 = r1.intValue()     // Catch:{ all -> 0x001f }
            int r2 = r3.getFlashMode()     // Catch:{ all -> 0x001f }
            if (r1 == r2) goto L_0x001d
            r3.trySetFlashModeToCameraControl()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageCapture.unlockFlashMode():void");
    }

    private void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            if (this.mLockedFlashMode.get() == null) {
                getCameraControl().setFlashMode(getFlashMode());
            }
        }
    }

    private int getJpegQualityInternal() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        if (imageCaptureConfig.containsOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY)) {
            return imageCaptureConfig.getJpegQuality();
        }
        int i = this.mCaptureMode;
        if (i == 0) {
            return 100;
        }
        if (i == 1 || i == 2) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.mCaptureMode + " is invalid");
    }

    /* access modifiers changed from: private */
    /* renamed from: takePictureInternal */
    public ListenableFuture<ImageProxy> m135lambda$createPipeline$1$androidxcameracoreImageCapture(ImageCaptureRequest imageCaptureRequest) {
        return CallbackToFutureAdapter.getFuture(new ImageCapture$$ExternalSyntheticLambda9(this, imageCaptureRequest));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$takePictureInternal$9$androidx-camera-core-ImageCapture  reason: not valid java name */
    public /* synthetic */ Object m140lambda$takePictureInternal$9$androidxcameracoreImageCapture(ImageCaptureRequest imageCaptureRequest, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mImageReader.setOnImageAvailableListener(new ImageCapture$$ExternalSyntheticLambda13(completer), CameraXExecutors.mainThreadExecutor());
        lockFlashMode();
        ListenableFuture<Void> issueTakePicture = issueTakePicture(imageCaptureRequest);
        Futures.addCallback(issueTakePicture, new FutureCallback<Void>() {
            public void onSuccess(Void voidR) {
                ImageCapture.this.unlockFlashMode();
            }

            public void onFailure(Throwable th) {
                ImageCapture.this.unlockFlashMode();
                completer.setException(th);
            }
        }, this.mExecutor);
        completer.addCancellationListener(new ImageCapture$$ExternalSyntheticLambda1(issueTakePicture), CameraXExecutors.directExecutor());
        return "takePictureInternal";
    }

    static /* synthetic */ void lambda$takePictureInternal$7(CallbackToFutureAdapter.Completer completer, ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage == null) {
                completer.setException(new IllegalStateException("Unable to acquire image"));
            } else if (!completer.set(acquireLatestImage)) {
                acquireLatestImage.close();
            }
        } catch (IllegalStateException e) {
            completer.setException(e);
        }
    }

    static class ImageCaptureRequestProcessor implements ForwardingImageProxy.OnImageCloseListener {
        ImageCaptureRequest mCurrentRequest;
        ListenableFuture<ImageProxy> mCurrentRequestFuture;
        private final ImageCaptor mImageCaptor;
        final Object mLock;
        private final int mMaxImages;
        int mOutstandingImages;
        private final Deque<ImageCaptureRequest> mPendingRequests;
        private final RequestProcessCallback mRequestProcessCallback;

        interface ImageCaptor {
            ListenableFuture<ImageProxy> capture(ImageCaptureRequest imageCaptureRequest);
        }

        interface RequestProcessCallback {
            void onPreProcessRequest(ImageCaptureRequest imageCaptureRequest);
        }

        ImageCaptureRequestProcessor(int i, ImageCaptor imageCaptor) {
            this(i, imageCaptor, (RequestProcessCallback) null);
        }

        ImageCaptureRequestProcessor(int i, ImageCaptor imageCaptor, RequestProcessCallback requestProcessCallback) {
            this.mPendingRequests = new ArrayDeque();
            this.mCurrentRequest = null;
            this.mCurrentRequestFuture = null;
            this.mOutstandingImages = 0;
            this.mLock = new Object();
            this.mMaxImages = i;
            this.mImageCaptor = imageCaptor;
            this.mRequestProcessCallback = requestProcessCallback;
        }

        public void sendRequest(ImageCaptureRequest imageCaptureRequest) {
            synchronized (this.mLock) {
                this.mPendingRequests.offer(imageCaptureRequest);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.mCurrentRequest != null ? 1 : 0);
                objArr[1] = Integer.valueOf(this.mPendingRequests.size());
                Logger.d(ImageCapture.TAG, String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                processNextRequest();
            }
        }

        public void cancelRequests(Throwable th) {
            ImageCaptureRequest imageCaptureRequest;
            ListenableFuture<ImageProxy> listenableFuture;
            ArrayList<ImageCaptureRequest> arrayList;
            synchronized (this.mLock) {
                imageCaptureRequest = this.mCurrentRequest;
                this.mCurrentRequest = null;
                listenableFuture = this.mCurrentRequestFuture;
                this.mCurrentRequestFuture = null;
                arrayList = new ArrayList<>(this.mPendingRequests);
                this.mPendingRequests.clear();
            }
            if (!(imageCaptureRequest == null || listenableFuture == null)) {
                imageCaptureRequest.notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
                listenableFuture.cancel(true);
            }
            for (ImageCaptureRequest notifyCallbackError : arrayList) {
                notifyCallbackError.notifyCallbackError(ImageCapture.getError(th), th.getMessage(), th);
            }
        }

        public void onImageClose(ImageProxy imageProxy) {
            synchronized (this.mLock) {
                this.mOutstandingImages--;
                processNextRequest();
            }
        }

        /* access modifiers changed from: package-private */
        public void processNextRequest() {
            synchronized (this.mLock) {
                if (this.mCurrentRequest == null) {
                    if (this.mOutstandingImages >= this.mMaxImages) {
                        Logger.w(ImageCapture.TAG, "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    final ImageCaptureRequest poll = this.mPendingRequests.poll();
                    if (poll != null) {
                        this.mCurrentRequest = poll;
                        RequestProcessCallback requestProcessCallback = this.mRequestProcessCallback;
                        if (requestProcessCallback != null) {
                            requestProcessCallback.onPreProcessRequest(poll);
                        }
                        ListenableFuture<ImageProxy> capture = this.mImageCaptor.capture(poll);
                        this.mCurrentRequestFuture = capture;
                        Futures.addCallback(capture, new FutureCallback<ImageProxy>() {
                            public void onSuccess(ImageProxy imageProxy) {
                                synchronized (ImageCaptureRequestProcessor.this.mLock) {
                                    Preconditions.checkNotNull(imageProxy);
                                    SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy);
                                    singleCloseImageProxy.addOnImageCloseListener(ImageCaptureRequestProcessor.this);
                                    ImageCaptureRequestProcessor.this.mOutstandingImages++;
                                    poll.dispatchImage(singleCloseImageProxy);
                                    ImageCaptureRequestProcessor.this.mCurrentRequest = null;
                                    ImageCaptureRequestProcessor.this.mCurrentRequestFuture = null;
                                    ImageCaptureRequestProcessor.this.processNextRequest();
                                }
                            }

                            public void onFailure(Throwable th) {
                                synchronized (ImageCaptureRequestProcessor.this.mLock) {
                                    if (!(th instanceof CancellationException)) {
                                        poll.notifyCallbackError(ImageCapture.getError(th), th != null ? th.getMessage() : "Unknown error", th);
                                    }
                                    ImageCaptureRequestProcessor.this.mCurrentRequest = null;
                                    ImageCaptureRequestProcessor.this.mCurrentRequestFuture = null;
                                    ImageCaptureRequestProcessor.this.processNextRequest();
                                }
                            }
                        }, CameraXExecutors.directExecutor());
                    }
                }
            }
        }
    }

    public String toString() {
        return "ImageCapture:" + getName();
    }

    static int getError(Throwable th) {
        if (th instanceof CameraClosedException) {
            return 3;
        }
        if (th instanceof ImageCaptureException) {
            return ((ImageCaptureException) th).getImageCaptureError();
        }
        return 0;
    }

    static boolean enforceSoftwareJpegConstraints(MutableConfig mutableConfig) {
        boolean z;
        boolean z2 = false;
        if (((Boolean) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, false)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 26) {
                Logger.w(TAG, "Software JPEG only supported on API 26+, but current API level is " + Build.VERSION.SDK_INT);
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) mutableConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z2 = z;
            } else {
                Logger.w(TAG, "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z2) {
                Logger.w(TAG, "Unable to support software JPEG. Disabling.");
                mutableConfig.insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, false);
            }
        }
        return z2;
    }

    public void onDetached() {
        ListenableFuture<Void> listenableFuture = this.mImageReaderCloseFuture;
        abortImageCaptureRequests();
        clearPipeline();
        this.mUseSoftwareJpeg = false;
        listenableFuture.addListener(new ImageCapture$$ExternalSyntheticLambda12(this.mExecutor), CameraXExecutors.directExecutor());
    }

    public void onAttached() {
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) getCurrentConfig();
        this.mCaptureConfig = CaptureConfig.Builder.createFrom(imageCaptureConfig).build();
        this.mCaptureProcessor = imageCaptureConfig.getCaptureProcessor((CaptureProcessor) null);
        this.mMaxCaptureStages = imageCaptureConfig.getMaxCaptureStages(2);
        this.mCaptureBundle = imageCaptureConfig.getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
        this.mUseSoftwareJpeg = imageCaptureConfig.isSoftwareJpegEncoderRequested();
        this.mIsSessionProcessorEnabled = imageCaptureConfig.isSessionProcessorEnabled();
        Preconditions.checkNotNull(getCamera(), "Attached camera cannot be null");
        this.mExecutor = Executors.newFixedThreadPool(1, new ThreadFactory() {
            private final AtomicInteger mId = new AtomicInteger(0);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "CameraX-image_capture_" + this.mId.getAndIncrement());
            }
        });
    }

    /* access modifiers changed from: protected */
    public Size onSuggestedResolutionUpdated(Size size) {
        SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (ImageCaptureConfig) getCurrentConfig(), size);
        this.mSessionConfigBuilder = createPipeline;
        updateSessionConfig(createPipeline.build());
        notifyActive();
        return size;
    }

    /* access modifiers changed from: package-private */
    public ListenableFuture<Void> issueTakePicture(ImageCaptureRequest imageCaptureRequest) {
        String str;
        CaptureBundle captureBundle;
        Logger.d(TAG, "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.mProcessingImageReader != null) {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle == null) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.mCaptureProcessor == null && captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (captureBundle.getCaptureStages().size() > this.mMaxCaptureStages) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.mProcessingImageReader.setCaptureBundle(captureBundle);
            this.mProcessingImageReader.setOnProcessingErrorCallback(CameraXExecutors.directExecutor(), new ImageCapture$$ExternalSyntheticLambda10(imageCaptureRequest));
            str = this.mProcessingImageReader.getTagBundleKey();
        } else {
            captureBundle = getCaptureBundle(CaptureBundles.singleDefaultCaptureBundle());
            if (captureBundle.getCaptureStages().size() > 1) {
                return Futures.immediateFailedFuture(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (CaptureStage next : captureBundle.getCaptureStages()) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.setTemplateType(this.mCaptureConfig.getTemplateType());
            builder.addImplementationOptions(this.mCaptureConfig.getImplementationOptions());
            builder.addAllCameraCaptureCallbacks(this.mSessionConfigBuilder.getSingleCameraCaptureCallbacks());
            builder.addSurface(this.mDeferrableSurface);
            if (getImageFormat() == 256) {
                if (EXIF_ROTATION_AVAILABILITY.isRotationOptionSupported()) {
                    builder.addImplementationOption(CaptureConfig.OPTION_ROTATION, Integer.valueOf(imageCaptureRequest.mRotationDegrees));
                }
                builder.addImplementationOption(CaptureConfig.OPTION_JPEG_QUALITY, Integer.valueOf(imageCaptureRequest.mJpegQuality));
            }
            builder.addImplementationOptions(next.getCaptureConfig().getImplementationOptions());
            if (str != null) {
                builder.addTag(str, Integer.valueOf(next.getId()));
            }
            builder.addCameraCaptureCallback(this.mMetadataMatchingCaptureCallback);
            arrayList.add(builder.build());
        }
        return Futures.transform(getCameraControl().submitStillCaptureRequests(arrayList, this.mCaptureMode, this.mFlashType), new ImageCapture$$ExternalSyntheticLambda11(), CameraXExecutors.directExecutor());
    }

    static /* synthetic */ void lambda$issueTakePicture$11(ImageCaptureRequest imageCaptureRequest, String str, Throwable th) {
        Logger.e(TAG, "Processing image failed! " + str);
        imageCaptureRequest.notifyCallbackError(2, str, th);
    }

    private CaptureBundle getCaptureBundle(CaptureBundle captureBundle) {
        List<CaptureStage> captureStages = this.mCaptureBundle.getCaptureStages();
        return (captureStages == null || captureStages.isEmpty()) ? captureBundle : CaptureBundles.createCaptureBundle(captureStages);
    }

    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 0;
        private static final ImageCaptureConfig DEFAULT_CONFIG = new Builder().setSurfaceOccupancyPriority(4).setTargetAspectRatio(0).getUseCaseConfig();
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 4;

        public ImageCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public static final class OutputFileOptions {
        private final ContentResolver mContentResolver;
        private final ContentValues mContentValues;
        private final File mFile;
        private final Metadata mMetadata;
        private final OutputStream mOutputStream;
        private final Uri mSaveCollection;

        OutputFileOptions(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, Metadata metadata) {
            this.mFile = file;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mOutputStream = outputStream;
            this.mMetadata = metadata == null ? new Metadata() : metadata;
        }

        /* access modifiers changed from: package-private */
        public File getFile() {
            return this.mFile;
        }

        /* access modifiers changed from: package-private */
        public ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        /* access modifiers changed from: package-private */
        public Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        /* access modifiers changed from: package-private */
        public ContentValues getContentValues() {
            return this.mContentValues;
        }

        /* access modifiers changed from: package-private */
        public OutputStream getOutputStream() {
            return this.mOutputStream;
        }

        public Metadata getMetadata() {
            return this.mMetadata;
        }

        public static final class Builder {
            private ContentResolver mContentResolver;
            private ContentValues mContentValues;
            private File mFile;
            private Metadata mMetadata;
            private OutputStream mOutputStream;
            private Uri mSaveCollection;

            public Builder(File file) {
                this.mFile = file;
            }

            public Builder(ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }

            public Builder(OutputStream outputStream) {
                this.mOutputStream = outputStream;
            }

            public Builder setMetadata(Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public OutputFileOptions build() {
                return new OutputFileOptions(this.mFile, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mOutputStream, this.mMetadata);
            }
        }
    }

    public static class OutputFileResults {
        private Uri mSavedUri;

        OutputFileResults(Uri uri) {
            this.mSavedUri = uri;
        }

        public Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    public static final class Metadata {
        private boolean mIsReversedHorizontal;
        private boolean mIsReversedHorizontalSet = false;
        private boolean mIsReversedVertical;
        private Location mLocation;

        public boolean isReversedHorizontal() {
            return this.mIsReversedHorizontal;
        }

        public boolean isReversedHorizontalSet() {
            return this.mIsReversedHorizontalSet;
        }

        public void setReversedHorizontal(boolean z) {
            this.mIsReversedHorizontal = z;
            this.mIsReversedHorizontalSet = true;
        }

        public boolean isReversedVertical() {
            return this.mIsReversedVertical;
        }

        public void setReversedVertical(boolean z) {
            this.mIsReversedVertical = z;
        }

        public Location getLocation() {
            return this.mLocation;
        }

        public void setLocation(Location location) {
            this.mLocation = location;
        }
    }

    static class ImageCaptureRequest {
        private final OnImageCapturedCallback mCallback;
        AtomicBoolean mDispatched = new AtomicBoolean(false);
        final int mJpegQuality;
        private final Executor mListenerExecutor;
        final int mRotationDegrees;
        private final Matrix mSensorToBufferTransformMatrix;
        private final Rational mTargetRatio;
        private final Rect mViewPortCropRect;

        ImageCaptureRequest(int i, int i2, Rational rational, Rect rect, Matrix matrix, Executor executor, OnImageCapturedCallback onImageCapturedCallback) {
            boolean z = false;
            this.mRotationDegrees = i;
            this.mJpegQuality = i2;
            if (rational != null) {
                Preconditions.checkArgument(!rational.isZero(), "Target ratio cannot be zero");
                Preconditions.checkArgument(rational.floatValue() > 0.0f ? true : z, "Target ratio must be positive");
            }
            this.mTargetRatio = rational;
            this.mViewPortCropRect = rect;
            this.mSensorToBufferTransformMatrix = matrix;
            this.mListenerExecutor = executor;
            this.mCallback = onImageCapturedCallback;
        }

        /* access modifiers changed from: package-private */
        public void dispatchImage(ImageProxy imageProxy) {
            int i;
            Size size;
            if (!this.mDispatched.compareAndSet(false, true)) {
                imageProxy.close();
                return;
            }
            if (ImageCapture.EXIF_ROTATION_AVAILABILITY.shouldUseExifOrientation(imageProxy)) {
                try {
                    ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
                    buffer.rewind();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.get(bArr);
                    Exif createFromInputStream = Exif.createFromInputStream(new ByteArrayInputStream(bArr));
                    buffer.rewind();
                    size = new Size(createFromInputStream.getWidth(), createFromInputStream.getHeight());
                    i = createFromInputStream.getRotation();
                } catch (IOException e) {
                    notifyCallbackError(1, "Unable to parse JPEG exif", e);
                    imageProxy.close();
                    return;
                }
            } else {
                size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
                i = this.mRotationDegrees;
            }
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), i, this.mSensorToBufferTransformMatrix));
            settableImageProxy.setCropRect(ImageCapture.computeDispatchCropRect(this.mViewPortCropRect, this.mTargetRatio, this.mRotationDegrees, size, i));
            try {
                this.mListenerExecutor.execute(new ImageCapture$ImageCaptureRequest$$ExternalSyntheticLambda1(this, settableImageProxy));
            } catch (RejectedExecutionException unused) {
                Logger.e(ImageCapture.TAG, "Unable to post to the supplied executor.");
                imageProxy.close();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$dispatchImage$0$androidx-camera-core-ImageCapture$ImageCaptureRequest  reason: not valid java name */
        public /* synthetic */ void m141lambda$dispatchImage$0$androidxcameracoreImageCapture$ImageCaptureRequest(ImageProxy imageProxy) {
            this.mCallback.onCaptureSuccess(imageProxy);
        }

        /* access modifiers changed from: package-private */
        public void notifyCallbackError(int i, String str, Throwable th) {
            if (this.mDispatched.compareAndSet(false, true)) {
                try {
                    this.mListenerExecutor.execute(new ImageCapture$ImageCaptureRequest$$ExternalSyntheticLambda0(this, i, str, th));
                } catch (RejectedExecutionException unused) {
                    Logger.e(ImageCapture.TAG, "Unable to post to the supplied executor.");
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$notifyCallbackError$1$androidx-camera-core-ImageCapture$ImageCaptureRequest  reason: not valid java name */
        public /* synthetic */ void m142lambda$notifyCallbackError$1$androidxcameracoreImageCapture$ImageCaptureRequest(int i, String str, Throwable th) {
            this.mCallback.onError(new ImageCaptureException(i, str, th));
        }
    }

    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, IoConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        private Builder(MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(ImageCapture.class)) {
                setTargetClass((Class<ImageCapture>) ImageCapture.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        public static Builder fromConfig(Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        static Builder fromConfig(ImageCaptureConfig imageCaptureConfig) {
            return new Builder(MutableOptionsBundle.from(imageCaptureConfig));
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public ImageCaptureConfig getUseCaseConfig() {
            return new ImageCaptureConfig(OptionsBundle.from(this.mMutableConfig));
        }

        public ImageCapture build() {
            int intValue;
            if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_RESOLUTION, null) == null) {
                Integer num = (Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
                boolean z = false;
                if (num != null) {
                    Preconditions.checkArgument(getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, num);
                } else if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, null) != null) {
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
                } else {
                    getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                }
                ImageCapture imageCapture = new ImageCapture(getUseCaseConfig());
                Size size = (Size) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_RESOLUTION, null);
                if (size != null) {
                    imageCapture.setCropAspectRatio(new Rational(size.getWidth(), size.getHeight()));
                }
                if (((Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, 2)).intValue() >= 1) {
                    z = true;
                }
                Preconditions.checkArgument(z, "Maximum outstanding image count must be at least 1");
                Preconditions.checkNotNull((Executor) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_IO_EXECUTOR, CameraXExecutors.ioExecutor()), "The IO executor can't be null");
                if (!getMutableConfig().containsOption(ImageCaptureConfig.OPTION_FLASH_MODE) || (intValue = ((Integer) getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_FLASH_MODE)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                    return imageCapture;
                }
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        public Builder setCaptureMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setFlashMode(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_MODE, Integer.valueOf(i));
            return this;
        }

        public Builder setCaptureBundle(CaptureBundle captureBundle) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_BUNDLE, captureBundle);
            return this;
        }

        public Builder setCaptureProcessor(CaptureProcessor captureProcessor) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_PROCESSOR, captureProcessor);
            return this;
        }

        public Builder setBufferFormat(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, Integer.valueOf(i));
            return this;
        }

        public Builder setSessionProcessorEnabled(boolean z) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SESSION_PROCESSOR_ENABLED, Boolean.valueOf(z));
            return this;
        }

        public Builder setMaxCaptureStages(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i));
            return this;
        }

        public Builder setSupportedResolutions(List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        public Builder setTargetClass(Class<ImageCapture> cls) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public Builder setTargetName(String str) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        public Builder setTargetAspectRatio(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetRotation(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i));
            return this;
        }

        public Builder setTargetResolution(Size size) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        public Builder setDefaultResolution(Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        public Builder setMaxResolution(Size size) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        public Builder setImageReaderProxyProvider(ImageReaderProxyProvider imageReaderProxyProvider) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, imageReaderProxyProvider);
            return this;
        }

        public Builder setSoftwareJpegEncoderRequested(boolean z) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.valueOf(z));
            return this;
        }

        public Builder setFlashType(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_FLASH_TYPE, Integer.valueOf(i));
            return this;
        }

        public Builder setJpegQuality(int i) {
            Preconditions.checkArgumentInRange(i, 1, 100, "jpegQuality");
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i));
            return this;
        }

        public Builder setIoExecutor(Executor executor) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_IO_EXECUTOR, executor);
            return this;
        }

        public Builder setDefaultSessionConfig(SessionConfig sessionConfig) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        public Builder setDefaultCaptureConfig(CaptureConfig captureConfig) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        public Builder setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        public Builder setCameraSelector(CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        public Builder setSurfaceOccupancyPriority(int i) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i));
            return this;
        }

        public Builder setUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(ImageCaptureConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }
    }
}
