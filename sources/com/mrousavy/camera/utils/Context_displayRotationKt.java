package com.mrousavy.camera.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"displayRotation", "", "Landroid/content/Context;", "getDisplayRotation", "(Landroid/content/Context;)I", "react-native-vision-camera_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: Context+displayRotation.kt */
public final class Context_displayRotationKt {
    public static final int getDisplayRotation(Context context) {
        Display defaultDisplay;
        Activity currentActivity;
        Display display;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            Display display2 = context.getDisplay();
            if (display2 != null) {
                return display2.getRotation();
            }
            if (!(!(context instanceof ReactContext) || (currentActivity = ((ReactContext) context).getCurrentActivity()) == null || (display = currentActivity.getDisplay()) == null)) {
                return display.getRotation();
            }
        }
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }
}
