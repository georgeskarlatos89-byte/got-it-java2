package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

class AppHelper {
    private static final int NO_FLAGS = 0;

    AppHelper() {
    }

    /* access modifiers changed from: package-private */
    public boolean isIntentAvailable(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities == null || queryIntentActivities.size() != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isAppInstalled(Context context, String str) {
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
