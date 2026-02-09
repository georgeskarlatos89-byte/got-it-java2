package com.reactnativenavigation.utils;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class UiUtils$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ View f$0;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f$1;

    public /* synthetic */ UiUtils$$ExternalSyntheticLambda0(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f$0 = view;
        this.f$1 = onGlobalLayoutListener;
    }

    public final void run() {
        this.f$0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f$1);
    }
}
