package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2CameraCaptureResultConverter;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class AdaptingPreviewProcessor implements CaptureProcessor, CloseableProcessor {
    private static final String TAG = "AdaptingPreviewProcesso";
    private BlockingCloseAccessCounter mAccessCounter = new BlockingCloseAccessCounter();
    private final PreviewImageProcessorImpl mImpl;

    public AdaptingPreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl) {
        this.mImpl = previewImageProcessorImpl;
    }

    public void onOutputSurface(Surface surface, int i) {
        if (this.mAccessCounter.tryIncrement()) {
            try {
                this.mImpl.onOutputSurface(surface, i);
                this.mImpl.onImageFormatUpdate(35);
            } finally {
                this.mAccessCounter.decrement();
            }
        }
    }

    public void process(ImageProxyBundle imageProxyBundle) {
        List<Integer> captureIds = imageProxyBundle.getCaptureIds();
        boolean z = true;
        if (captureIds.size() != 1) {
            z = false;
        }
        Preconditions.checkArgument(z, "Processing preview bundle must be 1, but found " + captureIds.size());
        ListenableFuture<ImageProxy> imageProxy = imageProxyBundle.getImageProxy(captureIds.get(0).intValue());
        Preconditions.checkArgument(imageProxy.isDone());
        try {
            ImageProxy imageProxy2 = (ImageProxy) imageProxy.get();
            Image image = imageProxy2.getImage();
            CaptureResult captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(CameraCaptureResults.retrieveCameraCaptureResult(imageProxy2.getImageInfo()));
            TotalCaptureResult totalCaptureResult = captureResult instanceof TotalCaptureResult ? (TotalCaptureResult) captureResult : null;
            if (image != null && this.mAccessCounter.tryIncrement()) {
                try {
                    this.mImpl.process(image, totalCaptureResult);
                } finally {
                    this.mAccessCounter.decrement();
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
            Logger.e(TAG, "Unable to retrieve ImageProxy from bundle");
        }
    }

    public void onResolutionUpdate(Size size) {
        if (this.mAccessCounter.tryIncrement()) {
            try {
                this.mImpl.onResolutionUpdate(size);
            } finally {
                this.mAccessCounter.decrement();
            }
        }
    }

    public void close() {
        this.mAccessCounter.destroyAndWaitForZeroAccess();
    }
}
