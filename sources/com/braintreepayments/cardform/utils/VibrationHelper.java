package com.braintreepayments.cardform.utils;

import android.content.Context;
import android.os.Vibrator;

public class VibrationHelper {
    public static void vibrate(Context context, int i) {
        if (hasVibrationPermission(context)) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate((long) i);
        }
    }

    public static boolean hasVibrationPermission(Context context) {
        return context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0;
    }
}
