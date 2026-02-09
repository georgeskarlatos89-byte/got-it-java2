package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import com.reactnativenavigation.utils.ReactViewGroupKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/ReactViewBorderRadiusAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Lcom/facebook/react/views/view/ReactViewGroup;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ReactViewBorderRadiusAnimator.kt */
public final class ReactViewBorderRadiusAnimator extends PropertyAnimatorCreator<ReactViewGroup> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactViewBorderRadiusAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ReactViewGroup reactViewGroup, ReactViewGroup reactViewGroup2) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "fromChild");
        Intrinsics.checkNotNullParameter(reactViewGroup2, "toChild");
        return !(ReactViewGroupKt.getBorderRadius(reactViewGroup) == ReactViewGroupKt.getBorderRadius(reactViewGroup2));
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        View from = getFrom();
        Intrinsics.checkNotNull(from, "null cannot be cast to non-null type com.facebook.react.views.view.ReactViewGroup");
        ReactViewGroup reactViewGroup = (ReactViewGroup) from;
        View to = getTo();
        Intrinsics.checkNotNull(to, "null cannot be cast to non-null type com.facebook.react.views.view.ReactViewGroup");
        ReactViewGroup reactViewGroup2 = (ReactViewGroup) to;
        ValueAnimator ofObject = ObjectAnimator.ofObject(new CornerRadiusEvaluator(new ReactViewBorderRadiusAnimator$create$1(this)), new Object[]{Float.valueOf(ReactViewGroupKt.getBorderRadius((ReactViewGroup) getFrom())), Float.valueOf(ReactViewGroupKt.getBorderRadius((ReactViewGroup) getTo()))});
        Intrinsics.checkNotNullExpressionValue(ofObject, "override fun create(opti…derRadius\n        )\n    }");
        return ofObject;
    }
}
