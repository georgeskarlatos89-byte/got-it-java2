package com.reactnativenavigation.utils;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"MAIN_LIB_TAG", "", "logd", "", "msg", "tag", "wran", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Log.kt */
public final class LogKt {
    public static final String MAIN_LIB_TAG = "RNN";

    public static final void logd(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "tag");
    }

    public static /* synthetic */ void logd$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = MAIN_LIB_TAG;
        }
        logd(str, str2);
    }

    public static /* synthetic */ void wran$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = MAIN_LIB_TAG;
        }
        wran(str, str2);
    }

    public static final void wran(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "tag");
        if (str != null) {
            Log.w(str2, str);
        } else {
            Log.w(str2, "Cannot log null msg: " + str);
        }
    }
}
