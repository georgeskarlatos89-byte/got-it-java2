package com.reactnativenavigation.viewcontrollers.modal;

import android.animation.AnimatorSet;
import com.reactnativenavigation.options.TransitionAnimationOptions;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.viewcontrollers.modal.ModalAnimator", f = "ModalAnimator.kt", i = {0, 0, 0}, l = {155}, m = "setupDismissAnimationWithSharedElementTransition", n = {"disappearing", "set", "disappearFade"}, s = {"L$0", "L$1", "L$2"})
/* compiled from: ModalAnimator.kt */
final class ModalAnimator$setupDismissAnimationWithSharedElementTransition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ModalAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalAnimator$setupDismissAnimationWithSharedElementTransition$1(ModalAnimator modalAnimator, Continuation<? super ModalAnimator$setupDismissAnimationWithSharedElementTransition$1> continuation) {
        super(continuation);
        this.this$0 = modalAnimator;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setupDismissAnimationWithSharedElementTransition((ViewController<?>) null, (ViewController<?>) null, (TransitionAnimationOptions) null, (AnimatorSet) null, this);
    }
}
