package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.facebook.react.views.image.ReactImageView;
import com.google.firebase.messaging.Constants;
import com.reactnativenavigation.options.SharedElementTransitionOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/reactnativenavigation/views/element/animators/RotationAnimator;", "Lcom/reactnativenavigation/views/element/animators/PropertyAnimatorCreator;", "Lcom/facebook/react/views/image/ReactImageView;", "from", "Landroid/view/View;", "to", "(Landroid/view/View;Landroid/view/View;)V", "fromRotation", "", "toRotation", "create", "Landroid/animation/Animator;", "options", "Lcom/reactnativenavigation/options/SharedElementTransitionOptions;", "shouldAnimateProperty", "", "fromChild", "toChild", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RotationAnimator.kt */
public final class RotationAnimator extends PropertyAnimatorCreator<ReactImageView> {
    private final float fromRotation;
    private final float toRotation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotationAnimator(View view, View view2) {
        super(view, view2);
        Intrinsics.checkNotNullParameter(view, Constants.MessagePayloadKeys.FROM);
        Intrinsics.checkNotNullParameter(view2, "to");
        this.fromRotation = view.getRotation();
        this.toRotation = view2.getRotation();
    }

    /* access modifiers changed from: protected */
    public boolean shouldAnimateProperty(ReactImageView reactImageView, ReactImageView reactImageView2) {
        Intrinsics.checkNotNullParameter(reactImageView, "fromChild");
        Intrinsics.checkNotNullParameter(reactImageView2, "toChild");
        return !(this.fromRotation == this.toRotation);
    }

    public Animator create(SharedElementTransitionOptions sharedElementTransitionOptions) {
        Intrinsics.checkNotNullParameter(sharedElementTransitionOptions, "options");
        getTo().setRotation(this.fromRotation);
        getTo().setPivotX(0.0f);
        getTo().setPivotY(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(getTo(), View.ROTATION, new float[]{this.fromRotation, this.toRotation});
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(to, View.ROTATIO…fromRotation, toRotation)");
        return ofFloat;
    }
}
