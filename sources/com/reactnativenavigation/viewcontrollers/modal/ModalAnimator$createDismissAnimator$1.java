package com.reactnativenavigation.viewcontrollers.modal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.reactnativenavigation.utils.ScreenAnimationListener;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"com/reactnativenavigation/viewcontrollers/modal/ModalAnimator$createDismissAnimator$1", "Landroid/animation/AnimatorListenerAdapter;", "isCancelled", "", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationStart", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalAnimator.kt */
public final class ModalAnimator$createDismissAnimator$1 extends AnimatorListenerAdapter {
    final /* synthetic */ ViewController<?> $disappearing;
    final /* synthetic */ ScreenAnimationListener $listener;
    private boolean isCancelled;
    final /* synthetic */ ModalAnimator this$0;

    ModalAnimator$createDismissAnimator$1(ScreenAnimationListener screenAnimationListener, ModalAnimator modalAnimator, ViewController<?> viewController) {
        this.$listener = screenAnimationListener;
        this.this$0 = modalAnimator;
        this.$disappearing = viewController;
    }

    public void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animation");
        this.$listener.onStart();
    }

    public void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animation");
        this.isCancelled = true;
        this.this$0.getRunningAnimators$react_native_navigation_reactNative71Release().remove(this.$disappearing);
        this.$listener.onCancel();
    }

    public void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animation");
        this.this$0.getRunningAnimators$react_native_navigation_reactNative71Release().remove(this.$disappearing);
        if (!this.isCancelled) {
            this.$listener.onEnd();
        }
    }
}
