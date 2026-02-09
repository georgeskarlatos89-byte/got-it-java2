package com.reactnativenavigation.utils;

public class ColorUtils {
    public static double[] colorToLAB(int i) {
        double[] dArr = new double[3];
        androidx.core.graphics.ColorUtils.colorToLAB(i, dArr);
        return dArr;
    }

    public static int labToColor(double[] dArr) {
        return androidx.core.graphics.ColorUtils.LABToColor(dArr[0], dArr[1], dArr[2]);
    }
}
