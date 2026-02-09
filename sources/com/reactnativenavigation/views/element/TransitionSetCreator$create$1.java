package com.reactnativenavigation.views.element;

import com.reactnativenavigation.options.LayoutAnimation;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.views.element.TransitionSetCreator", f = "TransitionSetCreator.kt", i = {0, 0, 0, 0, 0}, l = {19, 20}, m = "create", n = {"this", "animation", "fromScreen", "toScreen", "$this$create_u24lambda_u240"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5"})
/* compiled from: TransitionSetCreator.kt */
final class TransitionSetCreator$create$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransitionSetCreator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransitionSetCreator$create$1(TransitionSetCreator transitionSetCreator, Continuation<? super TransitionSetCreator$create$1> continuation) {
        super(continuation);
        this.this$0 = transitionSetCreator;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create((LayoutAnimation) null, (ViewController<?>) null, (ViewController<?>) null, this);
    }
}
