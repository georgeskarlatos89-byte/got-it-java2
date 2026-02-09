package com.reactnativenavigation.viewcontrollers.modal;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.TransitionAnimationOptions;
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
@DebugMetadata(c = "com.reactnativenavigation.viewcontrollers.modal.ModalAnimator$showModalWithoutElementTransition$1", f = "ModalAnimator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: ModalAnimator.kt */
final class ModalAnimator$showModalWithoutElementTransition$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransitionAnimationOptions $animationOptions;
    final /* synthetic */ ViewController<?> $appearing;
    final /* synthetic */ ViewController<?> $disappearing;
    final /* synthetic */ AnimatorSet $set;
    int label;
    final /* synthetic */ ModalAnimator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalAnimator$showModalWithoutElementTransition$1(TransitionAnimationOptions transitionAnimationOptions, ViewController<?> viewController, ModalAnimator modalAnimator, ViewController<?> viewController2, AnimatorSet animatorSet, Continuation<? super ModalAnimator$showModalWithoutElementTransition$1> continuation) {
        super(2, continuation);
        this.$animationOptions = transitionAnimationOptions;
        this.$appearing = viewController;
        this.this$0 = modalAnimator;
        this.$disappearing = viewController2;
        this.$set = animatorSet;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModalAnimator$showModalWithoutElementTransition$1(this.$animationOptions, this.$appearing, this.this$0, this.$disappearing, this.$set, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModalAnimator$showModalWithoutElementTransition$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Animator animator;
        Animator animator2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$animationOptions.getEnter().hasValue()) {
                AnimationOptions enter = this.$animationOptions.getEnter();
                Object view = this.$appearing.getView();
                Intrinsics.checkNotNullExpressionValue(view, "appearing.view");
                animator = enter.getAnimation((View) view);
            } else {
                AnimatorSet defaultPushAnimation = this.this$0.getDefaultPushAnimation(this.$appearing.getView());
                Intrinsics.checkNotNullExpressionValue(defaultPushAnimation, "getDefaultPushAnimation(appearing.view)");
                animator = defaultPushAnimation;
            }
            Unit unit = null;
            if (this.$disappearing == null || !this.$animationOptions.getExit().hasValue()) {
                animator2 = null;
            } else {
                AnimationOptions exit = this.$animationOptions.getExit();
                Object view2 = this.$disappearing.getView();
                Intrinsics.checkNotNullExpressionValue(view2, "disappearing.view");
                animator2 = exit.getAnimation((View) view2);
            }
            if (animator2 != null) {
                this.$set.playTogether(new Animator[]{animator, animator2});
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.$set.playTogether(new Animator[]{animator});
            }
            this.$set.start();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
