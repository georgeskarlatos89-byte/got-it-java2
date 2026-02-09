package com.reactnativenavigation.react;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class DevPermissionRequest {
    private final boolean isDebug;

    public boolean shouldAskPermission(Activity activity) {
        return false;
    }

    public DevPermissionRequest(boolean z) {
        this.isDebug = z;
    }

    public void askPermission(Activity activity) {
        if (shouldAskPermission(activity)) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.addFlags(268435456);
            activity.startActivity(intent);
            Log.w("ReactNative", "======================================\n\n");
            Log.w("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            Log.w("ReactNative", "\n\n======================================");
            Toast.makeText(activity, "Overlay permissions needs to be granted in order for react native apps to run in dev mode", 1).show();
        }
    }
}
