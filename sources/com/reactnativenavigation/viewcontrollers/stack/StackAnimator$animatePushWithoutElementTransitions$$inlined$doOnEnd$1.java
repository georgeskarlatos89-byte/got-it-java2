package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.Animator;
import android.view.ViewGroup;
import com.reactnativenavigation.utils.ViewExtensionsKt;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Animator.kt */
public final class StackAnimator$animatePushWithoutElementTransitions$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    final /* synthetic */ ViewController $disappearing$inlined;

    public void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public StackAnimator$animatePushWithoutElementTransitions$$inlined$doOnEnd$1(ViewController viewController) {
        this.$disappearing$inlined = viewController;
    }

    public void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        if (!this.$disappearing$inlined.isDestroyed()) {
            ViewGroup view = this.$disappearing$inlined.getView();
            Intrinsics.checkNotNullExpressionValue(view, "disappearing.view");
            ViewExtensionsKt.resetViewProperties(view);
        }
    }
}
