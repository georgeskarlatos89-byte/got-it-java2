package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AHHelper$$ExternalSyntheticLambda4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View f$0;

    public /* synthetic */ AHHelper$$ExternalSyntheticLambda4(View view) {
        this.f$0 = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AHHelper.lambda$updateTopMargin$0(this.f$0, valueAnimator);
    }
}
