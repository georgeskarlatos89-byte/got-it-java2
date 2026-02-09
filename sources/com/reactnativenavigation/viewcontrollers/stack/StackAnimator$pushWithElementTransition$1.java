package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.AnimatorSet;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.viewcontrollers.stack.StackAnimator$pushWithElementTransition$1", f = "StackAnimator.kt", i = {1}, l = {226, 228}, m = "invokeSuspend", n = {"fade"}, s = {"L$0"})
/* compiled from: StackAnimator.kt */
final class StackAnimator$pushWithElementTransition$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewController<?> $appearing;
    final /* synthetic */ ViewController<?> $disappearing;
    final /* synthetic */ Options $options;
    final /* synthetic */ AnimatorSet $set;
    Object L$0;
    int label;
    final /* synthetic */ StackAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StackAnimator$pushWithElementTransition$1(ViewController<?> viewController, Options options, StackAnimator stackAnimator, ViewController<?> viewController2, AnimatorSet animatorSet, Continuation<? super StackAnimator$pushWithElementTransition$1> continuation) {
        super(2, continuation);
        this.$appearing = viewController;
        this.$options = options;
        this.this$0 = stackAnimator;
        this.$disappearing = viewController2;
        this.$set = animatorSet;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StackAnimator$pushWithElementTransition$1(this.$appearing, this.$options, this.this$0, this.$disappearing, this.$set, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StackAnimator$pushWithElementTransition$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c8 A[LOOP:0: B:20:0x00c2->B:22:0x00c8, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r10.L$0
            com.reactnativenavigation.options.AnimationOptions r0 = (com.reactnativenavigation.options.AnimationOptions) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x008f
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x004c
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r11)
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r11 = r10.$appearing
            com.reactnativenavigation.options.params.Bool r1 = new com.reactnativenavigation.options.params.Bool
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r1.<init>(r4)
            r11.setWaitForRender(r1)
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r11 = r10.$appearing
            android.view.ViewGroup r11 = r11.getView()
            r1 = 0
            r11.setAlpha(r1)
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r11 = r10.$appearing
            r1 = r10
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r10.label = r3
            java.lang.Object r11 = com.reactnativenavigation.utils.ViewControllerKt.awaitRender(r11, r1)
            if (r11 != r0) goto L_0x004c
            return r0
        L_0x004c:
            com.reactnativenavigation.options.Options r11 = r10.$options
            com.reactnativenavigation.options.AnimationsOptions r11 = r11.animations
            com.reactnativenavigation.options.StackAnimationOptions r11 = r11.push
            com.reactnativenavigation.options.animations.ViewAnimationOptions r11 = r11.content
            com.reactnativenavigation.options.AnimationOptions r11 = r11.enter
            boolean r11 = r11.isFadeAnimation()
            if (r11 == 0) goto L_0x0065
            com.reactnativenavigation.options.Options r11 = r10.$options
            com.reactnativenavigation.options.AnimationsOptions r11 = r11.animations
            com.reactnativenavigation.options.StackAnimationOptions r11 = r11.push
            com.reactnativenavigation.options.animations.ViewAnimationOptions r11 = r11.content
            goto L_0x0069
        L_0x0065:
            com.reactnativenavigation.options.FadeAnimation r11 = com.reactnativenavigation.options.FadeAnimation.INSTANCE
            com.reactnativenavigation.options.animations.ViewAnimationOptions r11 = r11.content
        L_0x0069:
            com.reactnativenavigation.options.AnimationOptions r11 = r11.enter
            com.reactnativenavigation.viewcontrollers.stack.StackAnimator r1 = r10.this$0
            com.reactnativenavigation.views.element.TransitionAnimatorCreator r4 = r1.transitionAnimatorCreator
            com.reactnativenavigation.options.Options r1 = r10.$options
            com.reactnativenavigation.options.AnimationsOptions r1 = r1.animations
            com.reactnativenavigation.options.StackAnimationOptions r1 = r1.push
            r5 = r1
            com.reactnativenavigation.options.LayoutAnimation r5 = (com.reactnativenavigation.options.LayoutAnimation) r5
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r7 = r10.$disappearing
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r8 = r10.$appearing
            r9 = r10
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r10.L$0 = r11
            r10.label = r2
            r6 = r11
            java.lang.Object r1 = r4.create(r5, r6, r7, r8, r9)
            if (r1 != r0) goto L_0x008d
            return r0
        L_0x008d:
            r0 = r11
            r11 = r1
        L_0x008f:
            android.animation.AnimatorSet r11 = (android.animation.AnimatorSet) r11
            android.animation.AnimatorSet r1 = r10.$set
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r4 = r10.$appearing
            android.view.ViewGroup r4 = r4.getView()
            java.lang.String r5 = "appearing.view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            android.view.View r4 = (android.view.View) r4
            android.animation.Animator r0 = r0.getAnimation(r4)
            r4 = 0
            r2[r4] = r0
            r0 = r11
            android.animation.Animator r0 = (android.animation.Animator) r0
            r2[r3] = r0
            r1.playTogether(r2)
            java.util.ArrayList r0 = r11.getListeners()
            java.lang.String r1 = "transitionAnimators.listeners"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            android.animation.AnimatorSet r1 = r10.$set
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d2
            java.lang.Object r2 = r0.next()
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r1.addListener(r2)
            goto L_0x00c2
        L_0x00d2:
            r11.removeAllListeners()
            android.animation.AnimatorSet r11 = r10.$set
            r11.start()
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.StackAnimator$pushWithElementTransition$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
