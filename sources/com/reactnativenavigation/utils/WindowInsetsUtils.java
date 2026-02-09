package com.reactnativenavigation.utils;

import android.util.Log;
import androidx.core.view.WindowInsetsCompat;

public class WindowInsetsUtils {
    private static final String TAG = "GUYCA";

    public static void log(WindowInsetsCompat windowInsetsCompat) {
        Log.i(TAG, "t: " + windowInsetsCompat.getStableInsetTop() + " sysT: " + windowInsetsCompat.getSystemWindowInsetTop() + " b: " + windowInsetsCompat.getStableInsetBottom() + " sysB: " + windowInsetsCompat.getSystemWindowInsetBottom());
    }
}
