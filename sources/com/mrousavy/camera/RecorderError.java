package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mrousavy/camera/RecorderError;", "Lcom/mrousavy/camera/CameraError;", "cause", "", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class RecorderError extends CameraError {
    public RecorderError(Throwable th) {
        super("capture", "recorder-error", "The recording failed because the Recorder is in an unrecoverable error state.\nWhen this happens and the output file is generated, the output file is not properly constructed. The application will need to clean up the output file, such as deleting the file. Such an error will usually require creating a new Recorder object to start a new recording.", th);
    }
}
