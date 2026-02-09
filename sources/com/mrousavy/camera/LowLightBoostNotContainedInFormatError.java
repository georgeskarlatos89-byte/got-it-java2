package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mrousavy/camera/LowLightBoostNotContainedInFormatError;", "Lcom/mrousavy/camera/CameraError;", "()V", "react-native-vision-camera_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Errors.kt */
public final class LowLightBoostNotContainedInFormatError extends CameraError {
    public LowLightBoostNotContainedInFormatError() {
        super("format", "invalid-low-light-boost", "The currently selected format does not support low-light boost (night mode)! Make sure you select a format which includes `supportsLowLightBoost`.", (Throwable) null, 8, (DefaultConstructorMarker) null);
    }
}
