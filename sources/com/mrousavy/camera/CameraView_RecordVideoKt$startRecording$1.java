package com.mrousavy.camera;

import androidx.camera.core.Camera;
import androidx.camera.video.VideoRecordEvent;
import androidx.core.util.Consumer;
import com.brentvatne.react.ReactVideoView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.mrousavy.camera.utils.CallbackPromiseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/mrousavy/camera/CameraView_RecordVideoKt$startRecording$1", "Landroidx/core/util/Consumer;", "Landroidx/camera/video/VideoRecordEvent;", "accept", "", "event", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView+RecordVideo.kt */
public final class CameraView_RecordVideoKt$startRecording$1 implements Consumer<VideoRecordEvent> {
    final /* synthetic */ Callback $onRecordCallback;
    final /* synthetic */ CameraView $this_startRecording;

    CameraView_RecordVideoKt$startRecording$1(Callback callback, CameraView cameraView) {
        this.$onRecordCallback = callback;
        this.$this_startRecording = cameraView;
    }

    public void accept(VideoRecordEvent videoRecordEvent) {
        CameraError cameraError;
        if (videoRecordEvent instanceof VideoRecordEvent.Finalize) {
            VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) videoRecordEvent;
            if (finalize.hasError()) {
                switch (finalize.getError()) {
                    case 2:
                        cameraError = new FileSizeLimitReachedError(finalize.getCause());
                        break;
                    case 3:
                        cameraError = new InsufficientStorageError(finalize.getCause());
                        break;
                    case 4:
                        cameraError = new InactiveSourceError(finalize.getCause());
                        break;
                    case 5:
                        cameraError = new InvalidVideoOutputOptionsError(finalize.getCause());
                        break;
                    case 6:
                        cameraError = new VideoEncoderError(finalize.getCause());
                        break;
                    case 7:
                        cameraError = new RecorderError(finalize.getCause());
                        break;
                    case 8:
                        cameraError = new NoValidDataError(finalize.getCause());
                        break;
                    default:
                        cameraError = new UnknownCameraError(finalize.getCause());
                        break;
                }
                ReadableMap makeErrorMap$default = CallbackPromiseKt.makeErrorMap$default(cameraError.getDomain() + '/' + cameraError.getId(), cameraError.getMessage(), cameraError, (WritableMap) null, 8, (Object) null);
                this.$onRecordCallback.invoke(null, makeErrorMap$default);
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putString(ClientCookie.PATH_ATTR, finalize.getOutputResults().getOutputUri().toString());
                createMap.putDouble(ReactVideoView.EVENT_PROP_DURATION, (((double) finalize.getRecordingStats().getRecordedDurationNanos()) / 1000000.0d) / 1000.0d);
                createMap.putDouble("size", ((double) finalize.getRecordingStats().getNumBytesRecorded()) / 1000.0d);
                this.$onRecordCallback.invoke(createMap, null);
            }
            Camera camera$react_native_vision_camera_release = this.$this_startRecording.getCamera$react_native_vision_camera_release();
            Intrinsics.checkNotNull(camera$react_native_vision_camera_release);
            camera$react_native_vision_camera_release.getCameraControl().enableTorch(Intrinsics.areEqual((Object) this.$this_startRecording.getTorch(), (Object) "on"));
        }
    }
}
