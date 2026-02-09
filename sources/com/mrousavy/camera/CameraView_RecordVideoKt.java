package com.mrousavy.camera;

import androidx.camera.core.Camera;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.core.content.ContextCompat;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u001a\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"pauseRecording", "", "Lcom/mrousavy/camera/CameraView;", "resumeRecording", "startRecording", "options", "Lcom/facebook/react/bridge/ReadableMap;", "onRecordCallback", "Lcom/facebook/react/bridge/Callback;", "stopRecording", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: CameraView+RecordVideo.kt */
public final class CameraView_RecordVideoKt {
    public static final void startRecording(CameraView cameraView, ReadableMap readableMap, Callback callback) {
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        Intrinsics.checkNotNullParameter(readableMap, "options");
        Intrinsics.checkNotNullParameter(callback, "onRecordCallback");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            if (Intrinsics.areEqual((Object) cameraView.getVideo(), (Object) true)) {
                throw new CameraNotReadyError();
            }
            throw new VideoNotEnabledError();
        } else if (!Intrinsics.areEqual((Object) cameraView.getAudio(), (Object) true) || ContextCompat.checkSelfPermission(cameraView.getContext(), "android.permission.RECORD_AUDIO") == 0) {
            if (readableMap.hasKey("flash")) {
                boolean areEqual = Intrinsics.areEqual((Object) readableMap.getString("flash"), (Object) "on");
                Camera camera$react_native_vision_camera_release = cameraView.getCamera$react_native_vision_camera_release();
                Intrinsics.checkNotNull(camera$react_native_vision_camera_release);
                camera$react_native_vision_camera_release.getCameraControl().enableTorch(areEqual);
            }
            FileOutputOptions build = new FileOutputOptions.Builder(File.createTempFile("VisionCamera-" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()), ".mp4")).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder(file).build()");
            VideoCapture<Recorder> videoCapture$react_native_vision_camera_release = cameraView.getVideoCapture$react_native_vision_camera_release();
            Intrinsics.checkNotNull(videoCapture$react_native_vision_camera_release);
            Recorder output = videoCapture$react_native_vision_camera_release.getOutput();
            Intrinsics.checkNotNullExpressionValue(output, "videoCapture!!.output");
            PendingRecording prepareRecording = output.prepareRecording(cameraView.getContext(), build);
            Intrinsics.checkNotNullExpressionValue(prepareRecording, "recorder.prepareRecording(context, fileOptions)");
            if (Intrinsics.areEqual((Object) cameraView.getAudio(), (Object) true)) {
                prepareRecording = prepareRecording.withAudioEnabled();
                Intrinsics.checkNotNullExpressionValue(prepareRecording, "recording.withAudioEnabled()");
            }
            cameraView.setActiveVideoRecording$react_native_vision_camera_release(prepareRecording.start(ContextCompat.getMainExecutor(cameraView.getContext()), new CameraView_RecordVideoKt$startRecording$1(callback, cameraView)));
        } else {
            throw new MicrophonePermissionError();
        }
    }

    public static final void pauseRecording(CameraView cameraView) {
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new CameraNotReadyError();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            Recording activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            Intrinsics.checkNotNull(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.pause();
        } else {
            throw new NoRecordingInProgressError();
        }
    }

    public static final void resumeRecording(CameraView cameraView) {
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new CameraNotReadyError();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            Recording activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            Intrinsics.checkNotNull(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.resume();
        } else {
            throw new NoRecordingInProgressError();
        }
    }

    public static final void stopRecording(CameraView cameraView) {
        Intrinsics.checkNotNullParameter(cameraView, "<this>");
        if (cameraView.getVideoCapture$react_native_vision_camera_release() == null) {
            throw new CameraNotReadyError();
        } else if (cameraView.getActiveVideoRecording$react_native_vision_camera_release() != null) {
            Recording activeVideoRecording$react_native_vision_camera_release = cameraView.getActiveVideoRecording$react_native_vision_camera_release();
            Intrinsics.checkNotNull(activeVideoRecording$react_native_vision_camera_release);
            activeVideoRecording$react_native_vision_camera_release.stop();
            Camera camera$react_native_vision_camera_release = cameraView.getCamera$react_native_vision_camera_release();
            Intrinsics.checkNotNull(camera$react_native_vision_camera_release);
            camera$react_native_vision_camera_release.getCameraControl().enableTorch(Intrinsics.areEqual((Object) cameraView.getTorch(), (Object) "on"));
        } else {
            throw new NoRecordingInProgressError();
        }
    }
}
