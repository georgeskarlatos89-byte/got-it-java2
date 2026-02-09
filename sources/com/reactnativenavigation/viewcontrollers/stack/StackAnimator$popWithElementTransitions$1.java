package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.AnimatorSet;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.viewcontrollers.stack.StackAnimator", f = "StackAnimator.kt", i = {0, 0, 0}, l = {129}, m = "popWithElementTransitions", n = {"disappearing", "set", "fade"}, s = {"L$0", "L$1", "L$2"})
/* compiled from: StackAnimator.kt */
final class StackAnimator$popWithElementTransitions$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StackAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StackAnimator$popWithElementTransitions$1(StackAnimator stackAnimator, Continuation<? super StackAnimator$popWithElementTransitions$1> continuation) {
        super(continuation);
        this.this$0 = stackAnimator;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.popWithElementTransitions((ViewController<?>) null, (ViewController<?>) null, (Options) null, (AnimatorSet) null, this);
    }
}
