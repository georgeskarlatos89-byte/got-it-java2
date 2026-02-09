package com.aurelhubert.ahbottomnavigation;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AHHelper$$ExternalSyntheticLambda8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ImageView f$0;
    public final /* synthetic */ Drawable f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ AHHelper$$ExternalSyntheticLambda8(ImageView imageView, Drawable drawable, boolean z) {
        this.f$0 = imageView;
        this.f$1 = drawable;
        this.f$2 = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AHHelper.lambda$updateDrawableColor$7(this.f$0, this.f$1, this.f$2, valueAnimator);
    }
}
