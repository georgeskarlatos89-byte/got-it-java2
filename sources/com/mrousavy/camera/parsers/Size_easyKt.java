package com.mrousavy.camera.parsers;

import android.util.Size;
import android.util.SizeF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000e"}, d2 = {"bigger", "", "Landroid/util/Size;", "getBigger", "(Landroid/util/Size;)I", "", "Landroid/util/SizeF;", "(Landroid/util/SizeF;)F", "smaller", "getSmaller", "areUltimatelyEqual", "", "size1", "size2", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Size+easy.kt */
public final class Size_easyKt {
    public static final int getBigger(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return Math.max(size.getWidth(), size.getHeight());
    }

    public static final int getSmaller(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static final float getBigger(SizeF sizeF) {
        Intrinsics.checkNotNullParameter(sizeF, "<this>");
        return Math.max(sizeF.getWidth(), sizeF.getHeight());
    }

    public static final float getSmaller(SizeF sizeF) {
        Intrinsics.checkNotNullParameter(sizeF, "<this>");
        return Math.min(sizeF.getWidth(), sizeF.getHeight());
    }

    public static final boolean areUltimatelyEqual(Size size, Size size2) {
        Intrinsics.checkNotNullParameter(size, "size1");
        Intrinsics.checkNotNullParameter(size2, "size2");
        return size.getWidth() * size.getHeight() == size2.getWidth() * size2.getHeight();
    }
}
