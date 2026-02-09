package com.braintreepayments.api;

import android.animation.ValueAnimator;

abstract class IncrementalAnimatorUpdateListener implements ValueAnimator.AnimatorUpdateListener {
    private int previousValue = 0;

    /* access modifiers changed from: package-private */
    public abstract void onAnimationUpdate(ValueAnimator valueAnimator, int i);

    IncrementalAnimatorUpdateListener() {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        onAnimationUpdate(valueAnimator, intValue - this.previousValue);
        this.previousValue = intValue;
    }
}
