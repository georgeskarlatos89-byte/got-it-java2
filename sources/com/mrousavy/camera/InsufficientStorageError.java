package com.mrousavy.camera;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/mrousavy/camera/InsufficientStorageError;", "Lcom/mrousavy/camera/CameraError;", "cause", "", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class InsufficientStorageError extends CameraError {
    public InsufficientStorageError(Throwable th) {
        super("capture", "insufficient-storage", "The recording failed due to insufficient storage space.\nThere are two possible cases that will cause this error.\n1. The storage is already full before the recording starts, so no output file will be generated.\n2. The storage becomes full during recording, so the output file will be generated.", th);
    }
}
