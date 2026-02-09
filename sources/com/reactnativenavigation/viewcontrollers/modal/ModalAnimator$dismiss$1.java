package com.reactnativenavigation.viewcontrollers.modal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.TransitionAnimationOptions;
import com.reactnativenavigation.utils.ScreenAnimationListener;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativenavigation.viewcontrollers.modal.ModalAnimator$dismiss$1", f = "ModalAnimator.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"set"}, s = {"L$0"})
/* compiled from: ModalAnimator.kt */
final class ModalAnimator$dismiss$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransitionAnimationOptions $animationOptions;
    final /* synthetic */ ViewController<?> $appearing;
    final /* synthetic */ ViewController<?> $disappearing;
    final /* synthetic */ ScreenAnimationListener $listener;
    Object L$0;
    int label;
    final /* synthetic */ ModalAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalAnimator$dismiss$1(ModalAnimator modalAnimator, ViewController<?> viewController, ScreenAnimationListener screenAnimationListener, TransitionAnimationOptions transitionAnimationOptions, ViewController<?> viewController2, Continuation<? super ModalAnimator$dismiss$1> continuation) {
        super(2, continuation);
        this.this$0 = modalAnimator;
        this.$disappearing = viewController;
        this.$listener = screenAnimationListener;
        this.$animationOptions = transitionAnimationOptions;
        this.$appearing = viewController2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModalAnimator$dismiss$1(this.this$0, this.$disappearing, this.$listener, this.$animationOptions, this.$appearing, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModalAnimator$dismiss$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        Animator animator;
        Animator animator2;
        ViewController<?> viewController;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.getRunningAnimators$react_native_navigation_reactNative71Release().containsKey(this.$disappearing)) {
                AnimatorSet animatorSet3 = this.this$0.getRunningAnimators$react_native_navigation_reactNative71Release().get(this.$disappearing);
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                this.$listener.onEnd();
                return Unit.INSTANCE;
            }
            animatorSet = this.this$0.createDismissAnimator(this.$disappearing, this.$listener);
            if (!this.$animationOptions.hasElementTransitions() || (viewController = this.$appearing) == null) {
                Unit unit = null;
                if (this.$appearing == null || !this.$animationOptions.getEnter().hasValue()) {
                    animator = null;
                } else {
                    AnimationOptions enter = this.$animationOptions.getEnter();
                    Object view = this.$appearing.getView();
                    Intrinsics.checkNotNullExpressionValue(view, "appearing.view");
                    animator = enter.getAnimation((View) view);
                }
                if (this.$animationOptions.getExit().hasValue()) {
                    AnimationOptions exit = this.$animationOptions.getExit();
                    Object view2 = this.$disappearing.getView();
                    Intrinsics.checkNotNullExpressionValue(view2, "disappearing.view");
                    animator2 = exit.getAnimation((View) view2);
                } else {
                    AnimatorSet defaultPopAnimation = this.this$0.getDefaultPopAnimation(this.$disappearing.getView());
                    Intrinsics.checkNotNullExpressionValue(defaultPopAnimation, "getDefaultPopAnimation(disappearing.view)");
                    animator2 = defaultPopAnimation;
                }
                if (animator != null) {
                    animatorSet.playTogether(new Animator[]{animator, animator2});
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    animatorSet.playTogether(new Animator[]{animator2});
                }
                animatorSet.start();
                return Unit.INSTANCE;
            }
            this.L$0 = animatorSet;
            this.label = 1;
            if (this.this$0.setupDismissAnimationWithSharedElementTransition(this.$disappearing, viewController, this.$animationOptions, animatorSet, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            animatorSet2 = animatorSet;
        } else if (i == 1) {
            animatorSet2 = (AnimatorSet) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        animatorSet = animatorSet2;
        animatorSet.start();
        return Unit.INSTANCE;
    }
}
