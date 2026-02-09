package com.reactnativenavigation.views.element.animators;

import android.animation.TypeEvaluator;
import com.facebook.react.views.image.ReactImageView;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ReactImageMatrixAnimator$$ExternalSyntheticLambda0 implements TypeEvaluator {
    public final /* synthetic */ ReactImageView f$0;
    public final /* synthetic */ ReactImageMatrixAnimator f$1;

    public /* synthetic */ ReactImageMatrixAnimator$$ExternalSyntheticLambda0(ReactImageView reactImageView, ReactImageMatrixAnimator reactImageMatrixAnimator) {
        this.f$0 = reactImageView;
        this.f$1 = reactImageMatrixAnimator;
    }

    public final Object evaluate(float f, Object obj, Object obj2) {
        return ReactImageMatrixAnimator.create$lambda$3$lambda$2(this.f$0, this.f$1, f, obj, obj2);
    }
}
