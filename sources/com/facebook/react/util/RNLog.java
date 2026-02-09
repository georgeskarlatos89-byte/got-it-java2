package com.facebook.react.util;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;

public class RNLog {
    public static final int ADVICE = 4;
    public static final int ERROR = 6;
    public static final int LOG = 2;
    public static final int MINIMUM_LEVEL_FOR_UI = 5;
    public static final int TRACE = 3;
    public static final int WARN = 5;

    private static String levelToString(int i) {
        String str = "log";
        if (!(i == 2 || i == 3)) {
            str = "warn";
            if (!(i == 4 || i == 5)) {
                return i != 6 ? "none" : "error";
            }
        }
        return str;
    }

    public static void l(String str) {
        FLog.i("ReactNative", str);
    }

    public static void t(String str) {
        FLog.i("ReactNative", str);
    }

    public static void a(String str) {
        FLog.w("ReactNative", "(ADVICE)" + str);
    }

    public static void w(ReactContext reactContext, String str) {
        logInternal(reactContext, str, 5);
        FLog.w("ReactNative", str);
    }

    public static void e(ReactContext reactContext, String str) {
        logInternal(reactContext, str, 6);
        FLog.e("ReactNative", str);
    }

    public static void e(String str) {
        FLog.e("ReactNative", str);
    }

    private static void logInternal(ReactContext reactContext, String str, int i) {
        if (i >= 5 && reactContext != null && reactContext.hasActiveReactInstance() && str != null) {
            ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(levelToString(i), str);
        }
    }
}
