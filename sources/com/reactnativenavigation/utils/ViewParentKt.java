package com.reactnativenavigation.utils;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"scaleX", "", "Landroid/view/ViewParent;", "getScaleX", "(Landroid/view/ViewParent;)F", "scaleY", "getScaleY", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ViewParent.kt */
public final class ViewParentKt {
    public static final float getScaleX(ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(viewParent, "<this>");
        return ((View) viewParent).getScaleX();
    }

    public static final float getScaleY(ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(viewParent, "<this>");
        return ((View) viewParent).getScaleY();
    }
}
