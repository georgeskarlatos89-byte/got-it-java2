package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mrousavy/camera/CameraPermissionError;", "Lcom/mrousavy/camera/CameraError;", "()V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class CameraPermissionError extends CameraError {
    public CameraPermissionError() {
        super("permission", "camera-permission-denied", "The Camera permission was denied!", (Throwable) null, 8, (DefaultConstructorMarker) null);
    }
}
