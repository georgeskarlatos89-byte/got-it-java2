package com.reactnativenavigation.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"hitRect", "Landroid/graphics/Rect;", "getHitRect", "()Landroid/graphics/Rect;", "coordinatesInsideView", "", "Landroid/view/MotionEvent;", "view", "Landroid/view/View;", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: MotionEvent.kt */
public final class MotionEventKt {
    private static final Rect hitRect = new Rect();

    public static final Rect getHitRect() {
        return hitRect;
    }

    public static final boolean coordinatesInsideView(MotionEvent motionEvent, View view) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        ViewGroup viewGroup = null;
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup2 != null ? viewGroup2.getChildAt(0) : null;
        if (childAt instanceof ViewGroup) {
            viewGroup = (ViewGroup) childAt;
        }
        if (viewGroup != null) {
            view = viewGroup;
        }
        if (view != null) {
            view.getHitRect(hitRect);
        }
        return hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }
}
