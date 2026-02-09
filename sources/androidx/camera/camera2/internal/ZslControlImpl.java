package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

final class ZslControlImpl implements ZslControl {
    private static final int MAX_IMAGES = 2;
    final Queue<ImageProxy> mImageRingBuffer = new LinkedList();
    private boolean mIsPrivateReprocessingSupported = false;
    private boolean mIsYuvReprocessingSupported = false;
    private boolean mIsZslDisabled = false;
    private DeferrableSurface mReprocessingImageDeferrableSurface;
    SafeCloseImageReaderProxy mReprocessingImageReader;
    ImageWriter mReprocessingImageWriter;
    final Queue<TotalCaptureResult> mTotalCaptureResultRingBuffer = new LinkedList();

    ZslControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mIsYuvReprocessingSupported = ZslUtil.isCapabilitySupported(cameraCharacteristicsCompat, 7);
        this.mIsPrivateReprocessingSupported = ZslUtil.isCapabilitySupported(cameraCharacteristicsCompat, 4);
    }

    public void setZslDisabled(boolean z) {
        this.mIsZslDisabled = z;
    }

    public void addZslConfig(Size size, SessionConfig.Builder builder) {
        if (!this.mIsZslDisabled) {
            if (this.mIsYuvReprocessingSupported || this.mIsPrivateReprocessingSupported) {
                cleanup();
                int i = this.mIsYuvReprocessingSupported ? 35 : 34;
                SafeCloseImageReaderProxy safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(size.getWidth(), size.getHeight(), i, 2));
                this.mReprocessingImageReader = safeCloseImageReaderProxy;
                safeCloseImageReaderProxy.setOnImageAvailableListener(new ZslControlImpl$$ExternalSyntheticLambda1(this), CameraXExecutors.ioExecutor());
                ImmediateSurface immediateSurface = new ImmediateSurface(this.mReprocessingImageReader.getSurface(), new Size(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight()), i);
                this.mReprocessingImageDeferrableSurface = immediateSurface;
                SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = this.mReprocessingImageReader;
                ListenableFuture<Void> terminationFuture = immediateSurface.getTerminationFuture();
                Objects.requireNonNull(safeCloseImageReaderProxy2);
                terminationFuture.addListener(new ZslControlImpl$$ExternalSyntheticLambda0(safeCloseImageReaderProxy2), CameraXExecutors.mainThreadExecutor());
                builder.addSurface(this.mReprocessingImageDeferrableSurface);
                builder.addCameraCaptureCallback(new CameraCaptureCallback() {
                    public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                        super.onCaptureCompleted(cameraCaptureResult);
                        CaptureResult captureResult = cameraCaptureResult.getCaptureResult();
                        if (captureResult != null && (captureResult instanceof TotalCaptureResult)) {
                            ZslControlImpl.this.mTotalCaptureResultRingBuffer.add((TotalCaptureResult) captureResult);
                        }
                    }
                });
                builder.addSessionStateCallback(new CameraCaptureSession.StateCallback() {
                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    }

                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        Surface inputSurface = cameraCaptureSession.getInputSurface();
                        if (inputSurface != null) {
                            ZslControlImpl.this.mReprocessingImageWriter = ImageWriterCompat.newInstance(inputSurface, 1);
                        }
                    }
                });
                builder.setInputConfiguration(new InputConfiguration(this.mReprocessingImageReader.getWidth(), this.mReprocessingImageReader.getHeight(), this.mReprocessingImageReader.getImageFormat()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$addZslConfig$0$androidx-camera-camera2-internal-ZslControlImpl  reason: not valid java name */
    public /* synthetic */ void m90lambda$addZslConfig$0$androidxcameracamera2internalZslControlImpl(ImageReaderProxy imageReaderProxy) {
        ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage != null) {
            this.mImageRingBuffer.add(acquireLatestImage);
        }
    }

    public ImageProxy dequeueImageFromBuffer() {
        try {
            return this.mImageRingBuffer.remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public boolean enqueueImageToImageWriter(ImageProxy imageProxy) {
        Image image = imageProxy.getImage();
        ImageWriter imageWriter = this.mReprocessingImageWriter;
        if (imageWriter == null || image == null) {
            return false;
        }
        ImageWriterCompat.queueInputImage(imageWriter, image);
        return true;
    }

    private void cleanup() {
        Queue<ImageProxy> queue = this.mImageRingBuffer;
        while (!queue.isEmpty()) {
            queue.remove().close();
        }
        this.mTotalCaptureResultRingBuffer.clear();
        DeferrableSurface deferrableSurface = this.mReprocessingImageDeferrableSurface;
        if (deferrableSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mReprocessingImageReader;
            if (safeCloseImageReaderProxy != null) {
                ListenableFuture<Void> terminationFuture = deferrableSurface.getTerminationFuture();
                Objects.requireNonNull(safeCloseImageReaderProxy);
                terminationFuture.addListener(new ZslControlImpl$$ExternalSyntheticLambda0(safeCloseImageReaderProxy), CameraXExecutors.mainThreadExecutor());
            }
            deferrableSurface.close();
        }
        ImageWriter imageWriter = this.mReprocessingImageWriter;
        if (imageWriter != null) {
            imageWriter.close();
            this.mReprocessingImageWriter = null;
        }
    }
}
