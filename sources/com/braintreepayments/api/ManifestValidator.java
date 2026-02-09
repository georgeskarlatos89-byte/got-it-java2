package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;

class ManifestValidator {
    ManifestValidator() {
    }

    /* access modifiers changed from: package-private */
    public <T> boolean isActivityDeclaredInAndroidManifest(Context context, Class<T> cls) {
        return getActivityInfo(context, cls) != null;
    }

    /* access modifiers changed from: package-private */
    public <T> boolean isUrlSchemeDeclaredInAndroidManifest(Context context, String str, Class<T> cls) {
        Intent addCategory = new Intent("android.intent.action.VIEW").setData(Uri.parse(str + "://")).addCategory("android.intent.category.DEFAULT").addCategory("android.intent.category.BROWSABLE");
        ActivityInfo activityInfo = getActivityInfo(context, cls);
        return activityInfo != null && activityInfo.launchMode == 2 && new AppHelper().isIntentAvailable(context, addCategory);
    }

    /* access modifiers changed from: package-private */
    public <T> ActivityInfo getActivityInfo(Context context, Class<T> cls) {
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr == null) {
                return null;
            }
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (activityInfo.name.equals(cls.getName())) {
                    return activityInfo;
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
