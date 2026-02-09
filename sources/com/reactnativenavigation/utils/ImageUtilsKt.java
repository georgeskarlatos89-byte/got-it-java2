package com.reactnativenavigation.utils;

import android.view.View;
import android.view.ViewParent;
import com.reactnativenavigation.react.ReactView;
import com.reactnativenavigation.viewcontrollers.viewcontroller.overlay.OverlayLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"areDimensionsWithInheritedScaleEqual", "", "a", "Landroid/view/View;", "b", "computeInheritedScale", "Lcom/reactnativenavigation/utils/Scale;", "v", "Landroid/view/ViewParent;", "childrenScale", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ImageUtils.kt */
public final class ImageUtilsKt {
    public static final boolean areDimensionsWithInheritedScaleEqual(View view, View view2) {
        Intrinsics.checkNotNullParameter(view, "a");
        Intrinsics.checkNotNullParameter(view2, "b");
        Scale computeInheritedScale = computeInheritedScale(view);
        float component1 = computeInheritedScale.component1();
        float component2 = computeInheritedScale.component2();
        Scale computeInheritedScale2 = computeInheritedScale(view2);
        float component12 = computeInheritedScale2.component1();
        float component22 = computeInheritedScale2.component2();
        if (((float) view.getWidth()) * component1 == ((float) view2.getWidth()) * component12) {
            if (((float) view.getHeight()) * component2 == ((float) view2.getHeight()) * component22) {
                return true;
            }
        }
        return false;
    }

    public static final Scale computeInheritedScale(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNullExpressionValue(parent, "v.parent");
        return computeInheritedScale(parent, new Scale(view.getScaleX(), view.getScaleY()));
    }

    private static final Scale computeInheritedScale(ViewParent viewParent, Scale scale) {
        if ((viewParent instanceof ReactView) || (viewParent instanceof OverlayLayout) || viewParent.getParent() == null) {
            return scale;
        }
        ViewParent parent = viewParent.getParent();
        Intrinsics.checkNotNullExpressionValue(parent, "v.parent");
        return computeInheritedScale(parent, new Scale(scale.getX() * ViewParentKt.getScaleX(viewParent), scale.getY() * ViewParentKt.getScaleY(viewParent)));
    }
}
