package ai.gotit.giap.util;

import ai.gotit.giap.constant.CommonConstant;
import android.util.Log;
import java.util.Date;

public class Logger {
    private static String constructMessage(String str) {
        return String.valueOf(new Date().getTime()) + " - " + str;
    }

    public static void log(String str) {
        Log.d(CommonConstant.LOG_TAG, constructMessage(str));
    }

    public static void warn(Throwable th, String str) {
        Log.w(CommonConstant.LOG_TAG, constructMessage(str), th);
    }

    public static void warn(Throwable th) {
        warn(th, "Warning");
    }

    public static void warn(String str) {
        Log.w(CommonConstant.LOG_TAG, constructMessage(str));
    }

    public static void error(Throwable th, String str) {
        Log.e(CommonConstant.LOG_TAG, constructMessage(str), th);
    }

    public static void error(Throwable th) {
        error(th, "Error");
    }

    public static void error(String str) {
        Log.e(CommonConstant.LOG_TAG, constructMessage(str));
    }
}
