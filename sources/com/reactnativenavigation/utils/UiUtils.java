package com.reactnativenavigation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.reactnativenavigation.utils.Functions;

public class UiUtils {
    private static final int DEFAULT_BOTTOM_TABS_HEIGHT = 56;
    private static final int DEFAULT_TOOLBAR_HEIGHT = 56;
    private static int bottomTabsHeight = -1;
    private static int topBarHeight = -1;

    public static <T extends View> void runOnPreDrawOnce(T t, Functions.Func1<T> func1) {
        if (t != null) {
            runOnPreDrawOnce((View) t, (Runnable) new UiUtils$$ExternalSyntheticLambda1(func1, t));
        }
    }

    public static void runOnPreDrawOnce(final View view, final Runnable runnable) {
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    runnable.run();
                    return true;
                }
            });
        }
    }

    public static void doOnLayout(final View view, final Runnable runnable) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    runnable.run();
                }
            });
        }
    }

    public static void runOnMeasured(final View view, final Runnable runnable) {
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            AnonymousClass3 r0 = new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (view.getHeight() > 0 && view.getWidth() > 0) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        runnable.run();
                    }
                }
            };
            runOnDetach(view, new UiUtils$$ExternalSyntheticLambda0(view, r0));
            view.getViewTreeObserver().addOnGlobalLayoutListener(r0);
            return;
        }
        runnable.run();
    }

    public static void runOnDetach(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnWindowAttachListener(new ViewTreeObserver.OnWindowAttachListener() {
            public void onWindowAttached() {
            }

            public void onWindowDetached() {
                view.getViewTreeObserver().removeOnWindowAttachListener(this);
                runnable.run();
            }
        });
    }

    public static void runOnMainThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(runnable);
        }
    }

    public static float getWindowHeight(Context context) {
        return (float) getDisplayMetrics(context).heightPixels;
    }

    public static float getWindowWidth(Context context) {
        return (float) getDisplayMetrics(context).widthPixels;
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static int getTopBarHeightDp(Context context) {
        return (int) pxToDp(context, (float) getTopBarHeight(context));
    }

    public static int getTopBarHeight(Context context) {
        int i;
        int i2 = topBarHeight;
        if (i2 > 0) {
            return i2;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("action_bar_size", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = dpToPx(context, 56);
        }
        topBarHeight = i;
        return i;
    }

    public static int getBottomTabsHeight(Context context) {
        int i;
        int i2 = bottomTabsHeight;
        if (i2 > 0) {
            return i2;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("bottom_navigation_height", "dimen", context.getPackageName());
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = dpToPx(context, 56);
        }
        bottomTabsHeight = i;
        return i;
    }

    public static float dpToPx(Context context, float f) {
        return dpToPx(context.getResources().getDisplayMetrics(), f);
    }

    public static float dpToPx(DisplayMetrics displayMetrics, float f) {
        return f * (((float) displayMetrics.densityDpi) / 160.0f);
    }

    public static int dpToPx(Context context, int i) {
        if (i <= 0) {
            return i;
        }
        return (int) (((float) i) * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    public static float pxToDp(Context context, float f) {
        return f / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static float dpToSp(Context context, float f) {
        return dpToPx(context, f) / context.getResources().getDisplayMetrics().density;
    }
}
