package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mrousavy/camera/InvalidVideoOutputOptionsError;", "Lcom/mrousavy/camera/CameraError;", "cause", "", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class InvalidVideoOutputOptionsError extends CameraError {
    public InvalidVideoOutputOptionsError(Throwable th) {
        super("capture", "invalid-video-options", "The recording failed due to invalid output options.\nThis error is generated when invalid output options have been used while preparing a recording", th);
    }
}
