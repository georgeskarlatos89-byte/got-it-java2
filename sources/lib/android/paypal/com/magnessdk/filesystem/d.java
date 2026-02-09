package lib.android.paypal.com.magnessdk.filesystem;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

public class d {
    private d() {
    }

    public static boolean a(Context context, List<String> list) {
        if (context == null || list == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        boolean z = false;
        for (String packageInfo : list) {
            try {
                packageManager.getPackageInfo(packageInfo, 0);
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public static boolean a(PackageManager packageManager, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }
}
