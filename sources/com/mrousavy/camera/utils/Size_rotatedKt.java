package com.mrousavy.camera.utils;

import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"rotated", "Landroid/util/Size;", "surfaceRotation", "", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Size+rotated.kt */
public final class Size_rotatedKt {
    public static final Size rotated(Size size, int i) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        if (i == 0) {
            return new Size(size.getWidth(), size.getHeight());
        }
        if (i == 1) {
            return new Size(size.getHeight(), size.getWidth());
        }
        if (i == 2) {
            return new Size(size.getWidth(), size.getHeight());
        }
        if (i != 3) {
            return new Size(size.getWidth(), size.getHeight());
        }
        return new Size(size.getHeight(), size.getWidth());
    }
}
