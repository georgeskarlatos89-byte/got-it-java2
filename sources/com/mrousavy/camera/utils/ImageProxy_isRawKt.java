package com.mrousavy.camera.utils;

import androidx.camera.core.ImageProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, d2 = {"isRaw", "", "Landroidx/camera/core/ImageProxy;", "(Landroidx/camera/core/ImageProxy;)Z", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImageProxy+isRaw.kt */
public final class ImageProxy_isRawKt {
    public static final boolean isRaw(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "<this>");
        int format = imageProxy.getFormat();
        if (format != 32) {
            switch (format) {
                case 36:
                case 37:
                case 38:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
