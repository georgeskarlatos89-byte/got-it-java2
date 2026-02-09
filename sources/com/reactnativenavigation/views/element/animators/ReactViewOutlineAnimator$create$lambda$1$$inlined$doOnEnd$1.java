package com.reactnativenavigation.views.element.animators;

import android.animation.Animator;
import android.view.ViewOutlineProvider;
import com.facebook.react.views.view.ReactViewGroup;
import com.reactnativenavigation.utils.OutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\n"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Animator.kt */
public final class ReactViewOutlineAnimator$create$lambda$1$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    final /* synthetic */ OutlineProvider $outlineProvider$inlined;
    final /* synthetic */ ReactViewOutlineAnimator this$0;

    public void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    public ReactViewOutlineAnimator$create$lambda$1$$inlined$doOnEnd$1(ReactViewOutlineAnimator reactViewOutlineAnimator, OutlineProvider outlineProvider) {
        this.this$0 = reactViewOutlineAnimator;
        this.$outlineProvider$inlined = outlineProvider;
    }

    public void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        ((ReactViewGroup) this.this$0.getTo()).setBorderRadius(this.$outlineProvider$inlined.getRadius());
        ((ReactViewGroup) this.this$0.getTo()).setOutlineProvider((ViewOutlineProvider) null);
        ((ReactViewGroup) this.this$0.getTo()).setClipToOutline(false);
    }
}
