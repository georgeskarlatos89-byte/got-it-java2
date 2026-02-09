package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.viewcontrollers.stack.StackAnimator$animatePop$1", f = "StackAnimator.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: StackAnimator.kt */
final class StackAnimator$animatePop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Animator> $additionalAnimations;
    final /* synthetic */ ViewController<?> $appearing;
    final /* synthetic */ ViewController<?> $disappearing;
    final /* synthetic */ Options $disappearingOptions;
    final /* synthetic */ Runnable $onAnimationEnd;
    int label;
    final /* synthetic */ StackAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StackAnimator$animatePop$1(StackAnimator stackAnimator, ViewController<?> viewController, Runnable runnable, Options options, ViewController<?> viewController2, List<? extends Animator> list, Continuation<? super StackAnimator$animatePop$1> continuation) {
        super(2, continuation);
        this.this$0 = stackAnimator;
        this.$disappearing = viewController;
        this.$onAnimationEnd = runnable;
        this.$disappearingOptions = options;
        this.$appearing = viewController2;
        this.$additionalAnimations = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StackAnimator$animatePop$1(this.this$0, this.$disappearing, this.$onAnimationEnd, this.$disappearingOptions, this.$appearing, this.$additionalAnimations, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StackAnimator$animatePop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AnimatorSet access$createPopAnimator = this.this$0.createPopAnimator(this.$disappearing, this.$onAnimationEnd);
            if (this.$disappearingOptions.animations.pop.getSharedElements().hasValue()) {
                this.label = 1;
                if (this.this$0.popWithElementTransitions(this.$appearing, this.$disappearing, this.$disappearingOptions, access$createPopAnimator, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.popWithoutElementTransitions(this.$appearing, this.$disappearing, this.$disappearingOptions, access$createPopAnimator, this.$additionalAnimations);
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
