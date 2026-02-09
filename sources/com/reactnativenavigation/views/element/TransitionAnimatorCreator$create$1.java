package com.reactnativenavigation.views.element;

import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.LayoutAnimation;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.views.element.TransitionAnimatorCreator", f = "TransitionAnimatorCreator.kt", i = {0, 0}, l = {26}, m = "create", n = {"this", "fadeAnimation"}, s = {"L$0", "L$1"})
/* compiled from: TransitionAnimatorCreator.kt */
final class TransitionAnimatorCreator$create$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransitionAnimatorCreator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionAnimatorCreator$create$1(TransitionAnimatorCreator transitionAnimatorCreator, Continuation<? super TransitionAnimatorCreator$create$1> continuation) {
        super(continuation);
        this.this$0 = transitionAnimatorCreator;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create((LayoutAnimation) null, (AnimationOptions) null, (ViewController<?>) null, (ViewController<?>) null, this);
    }
}
