package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.AnimatorSet;
import com.reactnativenavigation.options.StackAnimationOptions;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class StackAnimator$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ ViewController f$0;
    public final /* synthetic */ StackAnimator f$1;
    public final /* synthetic */ AnimatorSet f$2;
    public final /* synthetic */ StackAnimationOptions f$3;
    public final /* synthetic */ ViewController f$4;
    public final /* synthetic */ List f$5;

    public /* synthetic */ StackAnimator$$ExternalSyntheticLambda0(ViewController viewController, StackAnimator stackAnimator, AnimatorSet animatorSet, StackAnimationOptions stackAnimationOptions, ViewController viewController2, List list) {
        this.f$0 = viewController;
        this.f$1 = stackAnimator;
        this.f$2 = animatorSet;
        this.f$3 = stackAnimationOptions;
        this.f$4 = viewController2;
        this.f$5 = list;
    }

    public final void run() {
        StackAnimator.setRoot$lambda$0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
    }
}
