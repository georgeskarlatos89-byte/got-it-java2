package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

public interface CameraControlInternal extends CameraControl {
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() {
        public void addInteropConfig(Config config) {
        }

        public void addZslConfig(Size size, SessionConfig.Builder builder) {
        }

        public void clearInteropConfig() {
        }

        public int getFlashMode() {
            return 2;
        }

        public Config getInteropConfig() {
            return null;
        }

        public void setFlashMode(int i) {
        }

        public void setZslDisabled(boolean z) {
        }

        public ListenableFuture<Void> enableTorch(boolean z) {
            return Futures.immediateFuture(null);
        }

        public ListenableFuture<Integer> setExposureCompensationIndex(int i) {
            return Futures.immediateFuture(0);
        }

        public ListenableFuture<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i, int i2) {
            return Futures.immediateFuture(Collections.emptyList());
        }

        public SessionConfig getSessionConfig() {
            return SessionConfig.defaultEmptySessionConfig();
        }

        public Rect getSensorRect() {
            return new Rect();
        }

        public ListenableFuture<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        public ListenableFuture<Void> cancelFocusAndMetering() {
            return Futures.immediateFuture(null);
        }

        public ListenableFuture<Void> setZoomRatio(float f) {
            return Futures.immediateFuture(null);
        }

        public ListenableFuture<Void> setLinearZoom(float f) {
            return Futures.immediateFuture(null);
        }
    };

    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(Config config);

    void addZslConfig(Size size, SessionConfig.Builder builder);

    void clearInteropConfig();

    int getFlashMode();

    Config getInteropConfig();

    Rect getSensorRect();

    SessionConfig getSessionConfig();

    void setFlashMode(int i);

    void setZslDisabled(boolean z);

    ListenableFuture<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i, int i2);

    public static final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure, Throwable th) {
            super(th);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }
    }
}
