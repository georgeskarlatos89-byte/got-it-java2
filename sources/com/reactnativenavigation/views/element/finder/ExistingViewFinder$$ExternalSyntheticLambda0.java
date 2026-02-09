package com.reactnativenavigation.views.element.finder;

import android.widget.ImageView;
import kotlin.coroutines.Continuation;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ExistingViewFinder$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Continuation f$0;
    public final /* synthetic */ ImageView f$1;

    public /* synthetic */ ExistingViewFinder$$ExternalSyntheticLambda0(Continuation continuation, ImageView imageView) {
        this.f$0 = continuation;
        this.f$1 = imageView;
    }

    public final void run() {
        ExistingViewFinder.resume$lambda$1(this.f$0, this.f$1);
    }
}
