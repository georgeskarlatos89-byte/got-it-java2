package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.ImageUtilsKt;
import com.reactnativenavigation.utils.OutlineProvider;
import com.reactnativenavigation.utils.ReactViewGroupKt;
import com.reactnativenavigation.utils.Scale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¨\u0006\u0013"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/ReactViewOutlineAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Lcom/facebook/react/views/view/ReactViewGroup;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "setOutlineProvider", "", "provider", "Lcom/reactnativenavigation/utils/OutlineProvider;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactViewOutlineAnimator.kt */
public final class ReactViewOutlineAnimator extends PropertyAnimatorCreator<ReactViewGroup> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactViewOutlineAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ReactViewGroup reactViewGroup, ReactViewGroup reactViewGroup2) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "fromChild");
        Intrinsics.checkNotNullParameter(reactViewGroup2, "toChild");
        return !ImageUtilsKt.areDimensionsWithInheritedScaleEqual(getFrom(), getTo()) && reactViewGroup.getChildCount() == 0 && reactViewGroup2.getChildCount() == 0;
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        View from = getFrom();
        Intrinsics.checkNotNull(from, "null cannot be cast to non-null type com.facebook.react.views.view.ReactViewGroup");
        ReactViewGroup reactViewGroup = (ReactViewGroup) from;
        View to = getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type com.facebook.react.views.view.ReactViewGroup");
        ReactViewGroup reactViewGroup2 = (ReactViewGroup) to;
        Scale computeInheritedScale = ImageUtilsKt.computeInheritedScale(getFrom());
        float component1 = computeInheritedScale.component1();
        float component2 = computeInheritedScale.component2();
        ((ReactViewGroup) getTo()).getLayoutParams().width = Math.max(MathKt.roundToInt(((float) ((ReactViewGroup) getFrom()).getWidth()) * component1), ((ReactViewGroup) getTo()).getWidth());
        ((ReactViewGroup) getTo()).getLayoutParams().height = Math.max(MathKt.roundToInt(((float) ((ReactViewGroup) getFrom()).getHeight()) * component2), ((ReactViewGroup) getTo()).getHeight());
        RectF rectF = new RectF(((ReactViewGroup) getFrom()).getBackground().getBounds());
        RectF rectF2 = new RectF(((ReactViewGroup) getTo()).getBackground().getBounds());
        rectF.right *= component1;
        rectF.bottom *= component2;
        ViewOutline viewOutline = new ViewOutline(rectF.width(), rectF.height(), ReactViewGroupKt.getBorderRadius((ReactViewGroup) getFrom()));
        ViewOutline viewOutline2 = new ViewOutline(rectF2.width(), rectF2.height(), ReactViewGroupKt.getBorderRadius((ReactViewGroup) getTo()));
        ((ReactViewGroup) getTo()).setBorderRadius(0.0f);
        OutlineProvider outlineProvider = new OutlineProvider(getTo(), new ViewOutline(viewOutline.getWidth(), viewOutline.getHeight(), viewOutline.getRadius()));
        setOutlineProvider(outlineProvider);
        ValueAnimator ofObject = ObjectAnimator.ofObject(new OutlineEvaluator(new ReactViewOutlineAnimator$create$1(outlineProvider)), new Object[]{viewOutline, viewOutline2});
        Intrinsics.checkNotNullExpressionValue(ofObject, "create$lambda$1");
        Animator animator = ofObject;
        animator.addListener(new ReactViewOutlineAnimator$create$lambda$1$$inlined$doOnEnd$1(this, outlineProvider));
        Intrinsics.checkNotNullExpressionValue(ofObject, "outlineProvider = Outlin…e\n            }\n        }");
        return animator;
    }

    private final void setOutlineProvider(OutlineProvider outlineProvider) {
        getTo().setOutlineProvider(outlineProvider);
        getTo().setClipToOutline(true);
        getTo().invalidateOutline();
    }
}
