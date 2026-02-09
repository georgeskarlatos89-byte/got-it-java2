package com.mrousavy.camera.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"RATIO_16_9_VALUE", "", "RATIO_4_3_VALUE", "aspectRatio", "", "width", "height", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: AspectRatio.kt */
public final class AspectRatioKt {
    private static final double RATIO_16_9_VALUE = 1.7777777777777777d;
    private static final double RATIO_4_3_VALUE = 1.3333333333333333d;

    public static final int aspectRatio(int i, int i2) {
        double max = ((double) Math.max(i, i2)) / ((double) Math.min(i, i2));
        return Math.abs(max - RATIO_4_3_VALUE) <= Math.abs(max - RATIO_16_9_VALUE) ? 0 : 1;
    }
}
