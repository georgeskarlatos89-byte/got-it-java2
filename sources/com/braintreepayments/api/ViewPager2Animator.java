package com.braintreepayments.api;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.viewpager2.widget.ViewPager2;

class ViewPager2Animator {
    private final int animationDuration;

    ViewPager2Animator(int i) {
        this.animationDuration = i;
    }

    /* access modifiers changed from: package-private */
    public void animateToPosition(ViewPager2 viewPager2, int i) {
        animateToPosition(viewPager2, i, (AnimationCompleteCallback) null);
    }

    /* access modifiers changed from: package-private */
    public void animateToPosition(final ViewPager2 viewPager2, int i, final AnimationCompleteCallback animationCompleteCallback) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, viewPager2.getWidth() * (i - viewPager2.getCurrentItem())});
        ofInt.addUpdateListener(new IncrementalAnimatorUpdateListener() {
            /* access modifiers changed from: package-private */
            public void onAnimationUpdate(ValueAnimator valueAnimator, int i) {
                viewPager2.fakeDragBy((float) (i * -1));
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                viewPager2.beginFakeDrag();
            }

            public void onAnimationEnd(Animator animator) {
                viewPager2.endFakeDrag();
                viewPager2.post(new ViewPager2Animator$2$$ExternalSyntheticLambda0(animationCompleteCallback));
            }

            static /* synthetic */ void lambda$onAnimationEnd$0(AnimationCompleteCallback animationCompleteCallback) {
                if (animationCompleteCallback != null) {
                    animationCompleteCallback.onAnimationComplete();
                }
            }
        });
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration((long) this.animationDuration);
        ofInt.start();
    }
}
