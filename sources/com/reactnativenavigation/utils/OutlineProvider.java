package com.reactnativenavigation.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.reactnativenavigation.views.element.animators.ViewOutline;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/reactnativenavigation/utils/OutlineProvider;", "Landroid/view/ViewOutlineProvider;", "view", "Landroid/view/View;", "outline", "Lcom/reactnativenavigation/views/element/animators/ViewOutline;", "(Landroid/view/View;Lcom/reactnativenavigation/views/element/animators/ViewOutline;)V", "radius", "", "getRadius", "()F", "getOutline", "", "Landroid/graphics/Outline;", "update", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: OutlineProvider.kt */
public final class OutlineProvider extends ViewOutlineProvider {
    private ViewOutline outline;
    private final View view;

    public OutlineProvider(View view2, ViewOutline viewOutline) {
        Intrinsics.checkNotNullParameter(view2, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(viewOutline, "outline");
        this.view = view2;
        this.outline = viewOutline;
    }

    public final float getRadius() {
        return this.outline.getRadius();
    }

    public void getOutline(View view2, Outline outline2) {
        Intrinsics.checkNotNullParameter(view2, ViewHierarchyConstants.VIEW_KEY);
        Intrinsics.checkNotNullParameter(outline2, "outline");
        outline2.setRoundRect(0, 0, MathKt.roundToInt(this.outline.getWidth()), MathKt.roundToInt(this.outline.getHeight()), this.outline.getRadius());
    }

    public final void update(ViewOutline viewOutline) {
        Intrinsics.checkNotNullParameter(viewOutline, "outline");
        this.outline = viewOutline;
        this.view.invalidateOutline();
    }
}
