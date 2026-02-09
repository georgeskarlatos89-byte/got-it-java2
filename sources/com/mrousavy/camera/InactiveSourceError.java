package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mrousavy/camera/InactiveSourceError;", "Lcom/mrousavy/camera/CameraError;", "cause", "", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class InactiveSourceError extends CameraError {
    public InactiveSourceError(Throwable th) {
        super("capture", "inactive-source", "The recording failed because the source becomes inactive and stops sending frames.\nOne case is that if camera is closed due to lifecycle stopped, the active recording will be finalized with this error, and the output will be generated, containing the frames produced before camera closing. Attempting to start a new recording will be finalized immediately if the source remains inactive and no output will be generated.", th);
    }
}
