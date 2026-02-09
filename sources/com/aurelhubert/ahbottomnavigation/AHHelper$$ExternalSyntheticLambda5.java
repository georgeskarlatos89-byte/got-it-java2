package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AHHelper$$ExternalSyntheticLambda5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ TextView f$0;

    public /* synthetic */ AHHelper$$ExternalSyntheticLambda5(TextView textView) {
        this.f$0 = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
