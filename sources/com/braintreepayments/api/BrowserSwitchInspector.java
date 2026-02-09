package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;

class BrowserSwitchInspector {
    BrowserSwitchInspector() {
    }

    /* access modifiers changed from: package-private */
    public boolean isDeviceConfiguredForDeepLinking(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("%s://", new Object[]{str})));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        return canResolveActivityForIntent(context, intent);
    }

    /* access modifiers changed from: package-private */
    public boolean deviceHasBrowser(Context context) {
        return canResolveActivityForIntent(context, new Intent("android.intent.action.VIEW", Uri.parse("https://")));
    }

    /* access modifiers changed from: package-private */
    public boolean deviceHasChromeCustomTabs(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.parse("https://")), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent.setPackage(next.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(next);
            }
        }
        return !arrayList.isEmpty();
    }

    private boolean canResolveActivityForIntent(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
