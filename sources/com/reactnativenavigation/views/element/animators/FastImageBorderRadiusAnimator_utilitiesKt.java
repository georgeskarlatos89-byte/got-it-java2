package com.reactnativenavigation.views.element.animators;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import com.reactnativenavigation.R;
import com.reactnativenavigation.react.ReactView;
import com.reactnativenavigation.utils.ReactViewGroupKt;
import com.reactnativenavigation.utils.ViewTags;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.OverlayLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\t"}, d2 = {"getBorderRadius", "", "v", "Landroid/view/View;", "getOriginalParent", "Landroid/view/ViewGroup;", "view", "getInheritedBorderRadius", "Lcom/reactnativenavigation/views/element/animators/FastImageBorderRadiusAnimator;", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FastImageBorderRadiusAnimator+utilities.kt */
public final class FastImageBorderRadiusAnimator_utilitiesKt {
    public static final float getInheritedBorderRadius(FastImageBorderRadiusAnimator fastImageBorderRadiusAnimator, View view) {
        Intrinsics.checkNotNullParameter(fastImageBorderRadiusAnimator, "<this>");
        Intrinsics.checkNotNullParameter(view, "v");
        if ((view instanceof ReactView) || (view instanceof OverlayLayout)) {
            return 0.0f;
        }
        float borderRadius = getBorderRadius(view);
        if (borderRadius > 0.0f) {
            return borderRadius;
        }
        ViewGroup originalParent = getOriginalParent(view);
        if (originalParent == null) {
            return 0.0f;
        }
        return getInheritedBorderRadius(fastImageBorderRadiusAnimator, originalParent);
    }

    private static final float getBorderRadius(View view) {
        if (view instanceof ReactViewGroup) {
            ReactViewGroup reactViewGroup = (ReactViewGroup) view;
            if (ReactViewGroupKt.getBorderRadius(reactViewGroup) > 0.0f && Intrinsics.areEqual((Object) reactViewGroup.getOverflow(), (Object) ViewProps.HIDDEN)) {
                return ReactViewGroupKt.getBorderRadius(reactViewGroup);
            }
        }
        return 0.0f;
    }

    private static final ViewGroup getOriginalParent(View view) {
        if (view.getParent() == null) {
            return null;
        }
        int i = R.id.original_parent;
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) ViewTags.get(view, i, (ViewGroup) parent);
    }
}
