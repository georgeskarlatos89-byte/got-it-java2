package com.reactnativenavigation.utils;

import android.content.res.Resources;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"dp", "", "", "getDp", "(F)I", "(I)I", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: PrimitiveExt.kt */
public final class PrimitiveExtKt {
    public static final int getDp(int i) {
        return (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int getDp(float f) {
        return (int) (f * Resources.getSystem().getDisplayMetrics().density);
    }
}
