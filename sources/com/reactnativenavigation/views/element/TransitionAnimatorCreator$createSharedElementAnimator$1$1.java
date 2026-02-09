package com.reactnativenavigation.views.element;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/reactnativenavigation/views/element/TransitionAnimatorCreator$createSharedElementAnimator$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TransitionAnimatorCreator.kt */
public final class TransitionAnimatorCreator$createSharedElementAnimator$1$1 extends AnimatorListenerAdapter {
    final /* synthetic */ SharedElementTransition $transition;

    TransitionAnimatorCreator$createSharedElementAnimator$1$1(SharedElementTransition sharedElementTransition) {
        this.$transition = sharedElementTransition;
    }

    public void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animation");
        this.$transition.getFrom().setAlpha(0.0f);
    }
}
