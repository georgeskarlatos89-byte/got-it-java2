package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AHHelper$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AHTextView f$0;

    public /* synthetic */ AHHelper$$ExternalSyntheticLambda0(AHTextView aHTextView) {
        this.f$0 = aHTextView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.setTextColor((Integer) valueAnimator.getAnimatedValue());
    }
}
