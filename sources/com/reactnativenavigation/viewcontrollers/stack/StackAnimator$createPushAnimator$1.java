package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/reactnativenavigation/viewcontrollers/stack/StackAnimator$createPushAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "isCancelled", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: StackAnimator.kt */
public final class StackAnimator$createPushAnimator$1 extends AnimatorListenerAdapter {
    final /* synthetic */ ViewController<?> $appearing;
    final /* synthetic */ Runnable $onAnimationEnd;
    private boolean isCancelled;
    final /* synthetic */ StackAnimator this$0;

    StackAnimator$createPushAnimator$1(StackAnimator stackAnimator, ViewController<?> viewController, Runnable runnable) {
        this.this$0 = stackAnimator;
        this.$appearing = viewController;
        this.$onAnimationEnd = runnable;
    }

    public void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animation");
        if (this.this$0.getRunningPushAnimations().containsKey(this.$appearing)) {
            this.isCancelled = true;
            this.this$0.getRunningPushAnimations().remove(this.$appearing);
            this.$onAnimationEnd.run();
        }
    }

    public void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animation");
        if (this.this$0.getRunningPushAnimations().containsKey(this.$appearing) && !this.isCancelled) {
            this.this$0.getRunningPushAnimations().remove(this.$appearing);
            this.$onAnimationEnd.run();
        }
    }
}
