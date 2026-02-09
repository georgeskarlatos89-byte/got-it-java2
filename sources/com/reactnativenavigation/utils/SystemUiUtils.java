package com.reactnativenavigation.utils;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\"\u0010\u001d\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001aH\u0007J$\u0010 \u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001aH\u0007J\"\u0010\"\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001aH\u0007J\u0012\u0010$\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001a\u0010%\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u001a\u0010&\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/reactnativenavigation/utils/SystemUiUtils;", "", "()V", "STATUS_BAR_HEIGHT_L", "", "STATUS_BAR_HEIGHT_M", "STATUS_BAR_HEIGHT_TRANSLUCENCY", "", "<set-?>", "navigationBarDefaultColor", "getNavigationBarDefaultColor", "()I", "statusBarHeight", "clearStatusBarTranslucency", "", "window", "Landroid/view/Window;", "getStatusBarHeight", "activity", "Landroid/app/Activity;", "getStatusBarHeightDp", "hideNavigationBar", "view", "Landroid/view/View;", "hideStatusBar", "isTranslucent", "", "saveStatusBarHeight", "height", "setNavigationBarBackgroundColor", "color", "lightColor", "setStatusBarColor", "translucent", "setStatusBarColorScheme", "isDark", "setStatusBarTranslucent", "showNavigationBar", "showStatusBar", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SystemUiUtils.kt */
public final class SystemUiUtils {
    public static final SystemUiUtils INSTANCE = new SystemUiUtils();
    private static final int STATUS_BAR_HEIGHT_L = 25;
    private static final int STATUS_BAR_HEIGHT_M = 24;
    public static final float STATUS_BAR_HEIGHT_TRANSLUCENCY = 0.65f;
    private static int navigationBarDefaultColor = -1;
    private static int statusBarHeight = -1;

    private SystemUiUtils() {
    }

    public final int getNavigationBarDefaultColor() {
        return navigationBarDefaultColor;
    }

    @JvmStatic
    public static final int getStatusBarHeight(Activity activity) {
        int i;
        Integer num;
        int i2 = statusBarHeight;
        if (i2 > 0) {
            return i2;
        }
        if (activity != null) {
            Rect rect = new Rect();
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "activity.window");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int i3 = rect.top;
            View findViewById = window.findViewById(16908290);
            if (findViewById != null) {
                Intrinsics.checkNotNullExpressionValue(findViewById, "contentView");
                num = Integer.valueOf(Math.abs(findViewById.getTop() - i3));
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
                int i4 = i;
                statusBarHeight = i4;
                return i4;
            }
        }
        i = 24;
        int i42 = i;
        statusBarHeight = i42;
        return i42;
    }

    @JvmStatic
    public static final void saveStatusBarHeight(int i) {
        statusBarHeight = i;
    }

    @JvmStatic
    public static final int getStatusBarHeightDp(Activity activity) {
        return (int) UiUtils.pxToDp(activity, (float) getStatusBarHeight(activity));
    }

    @JvmStatic
    public static final void hideNavigationBar(Window window, View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
            windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.navigationBars());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
        }
    }

    @JvmStatic
    public static final void showNavigationBar(Window window, View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, true);
            new WindowInsetsControllerCompat(window, view).show(WindowInsetsCompat.Type.navigationBars());
        }
    }

    @JvmStatic
    public static final void setStatusBarColorScheme(Window window, View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        if (window != null) {
            new WindowInsetsControllerCompat(window, view).setAppearanceLightStatusBars(z);
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }

    @JvmStatic
    public static final void setStatusBarTranslucent(Window window) {
        if (window != null) {
            setStatusBarColor(window, window.getStatusBarColor(), true);
        }
    }

    @JvmStatic
    public static final boolean isTranslucent(Window window) {
        return window != null && Color.alpha(window.getStatusBarColor()) < 255;
    }

    @JvmStatic
    public static final void clearStatusBarTranslucency(Window window) {
        if (window != null) {
            setStatusBarColor(window, window.getStatusBarColor(), false);
        }
    }

    @JvmStatic
    public static final void setStatusBarColor(Window window, int i, boolean z) {
        int alpha = Color.alpha(i);
        int argb = Color.argb((int) ((float) Math.ceil((double) (((!z || alpha != 255) ? ((float) alpha) / 255.0f : 0.65f) * ((float) 255)))), Color.red(i), Color.green(i), Color.blue(i));
        if (window != null) {
            window.setStatusBarColor(argb);
        }
    }

    @JvmStatic
    public static final void hideStatusBar(Window window, View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
            windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.statusBars());
            windowInsetsControllerCompat.setSystemBarsBehavior(2);
        }
    }

    @JvmStatic
    public static final void showStatusBar(Window window, View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, true);
            new WindowInsetsControllerCompat(window, view).show(WindowInsetsCompat.Type.statusBars());
        }
    }

    @JvmStatic
    public static final void setNavigationBarBackgroundColor(Window window, int i, boolean z) {
        if (window != null) {
            if (navigationBarDefaultColor == -1) {
                navigationBarDefaultColor = window.getNavigationBarColor();
            }
            new WindowInsetsControllerCompat(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
            window.setNavigationBarColor(i);
        }
    }
}
