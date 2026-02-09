package com.reactnativenavigation.views.element.finder;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ExistingViewFinder.kt */
final class ExistingViewFinder$resumeOnImageLoad$1$1 implements Runnable {
    final /* synthetic */ Continuation<View> $cont;
    final /* synthetic */ ImageView $view;

    ExistingViewFinder$resumeOnImageLoad$1$1(Continuation<? super View> continuation, ImageView imageView) {
        this.$cont = continuation;
        this.$view = imageView;
    }

    public final void run() {
        Continuation<View> continuation = this.$cont;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m1102constructorimpl(this.$view));
    }
}
