package com.reactnativenavigation.viewcontrollers.modal;

import android.animation.AnimatorSet;
import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.reactnativenavigation.options.FadeAnimation;
import com.reactnativenavigation.options.StackAnimationOptions;
import com.reactnativenavigation.options.TransitionAnimationOptions;
import com.reactnativenavigation.utils.ScreenAnimationListener;
import com.reactnativenavigation.viewcontrollers.common.BaseAnimator;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.element.TransitionAnimatorCreator;
import com.reactnativenavigation.views.element.TransitionSetCreator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\u0014\u001a\u00020\u000f2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001c\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J2\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J9\u0010\u001e\u001a\u00020\u001b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010 J2\u0010!\u001a\u00020\u001b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J0\u0010\"\u001a\u00020\u001b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J2\u0010#\u001a\u00020\u001b2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u000e2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR.\u0010\f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r8\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/modal/ModalAnimator;", "Lcom/reactnativenavigation/viewcontrollers/common/BaseAnimator;", "context", "Landroid/content/Context;", "transitionAnimatorCreator", "Lcom/reactnativenavigation/views/element/TransitionAnimatorCreator;", "defaultAnimation", "Lcom/reactnativenavigation/options/StackAnimationOptions;", "(Landroid/content/Context;Lcom/reactnativenavigation/views/element/TransitionAnimatorCreator;Lcom/reactnativenavigation/options/StackAnimationOptions;)V", "isRunning", "", "()Z", "runningAnimators", "", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "Landroid/animation/AnimatorSet;", "getRunningAnimators$react_native_navigation_reactNative71Release$annotations", "()V", "getRunningAnimators$react_native_navigation_reactNative71Release", "()Ljava/util/Map;", "createDismissAnimator", "disappearing", "listener", "Lcom/reactnativenavigation/utils/ScreenAnimationListener;", "createShowModalAnimator", "appearing", "dismiss", "", "animationOptions", "Lcom/reactnativenavigation/options/TransitionAnimationOptions;", "setupDismissAnimationWithSharedElementTransition", "set", "(Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/options/TransitionAnimationOptions;Landroid/animation/AnimatorSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "showModalWithElementTransition", "showModalWithoutElementTransition", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ModalAnimator.kt */
public class ModalAnimator extends BaseAnimator {
    /* access modifiers changed from: private */
    public final StackAnimationOptions defaultAnimation;
    private final Map<ViewController<?>, AnimatorSet> runningAnimators;
    /* access modifiers changed from: private */
    public final TransitionAnimatorCreator transitionAnimatorCreator;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ModalAnimator(Context context) {
        this(context, (TransitionAnimatorCreator) null, (StackAnimationOptions) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ModalAnimator(Context context, TransitionAnimatorCreator transitionAnimatorCreator2) {
        this(context, transitionAnimatorCreator2, (StackAnimationOptions) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transitionAnimatorCreator2, "transitionAnimatorCreator");
    }

    public static /* synthetic */ void getRunningAnimators$react_native_navigation_reactNative71Release$annotations() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalAnimator(Context context, TransitionAnimatorCreator transitionAnimatorCreator2, StackAnimationOptions stackAnimationOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new TransitionAnimatorCreator((TransitionSetCreator) null, 1, (DefaultConstructorMarker) null) : transitionAnimatorCreator2, (i & 4) != 0 ? FadeAnimation.INSTANCE : stackAnimationOptions);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModalAnimator(Context context, TransitionAnimatorCreator transitionAnimatorCreator2, StackAnimationOptions stackAnimationOptions) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transitionAnimatorCreator2, "transitionAnimatorCreator");
        Intrinsics.checkNotNullParameter(stackAnimationOptions, "defaultAnimation");
        this.transitionAnimatorCreator = transitionAnimatorCreator2;
        this.defaultAnimation = stackAnimationOptions;
        this.runningAnimators = new HashMap();
    }

    public final boolean isRunning() {
        return !this.runningAnimators.isEmpty();
    }

    public final Map<ViewController<?>, AnimatorSet> getRunningAnimators$react_native_navigation_reactNative71Release() {
        return this.runningAnimators;
    }

    public void show(ViewController<?> viewController, ViewController<?> viewController2, TransitionAnimationOptions transitionAnimationOptions, ScreenAnimationListener screenAnimationListener) {
        Intrinsics.checkNotNullParameter(viewController, "appearing");
        Intrinsics.checkNotNullParameter(transitionAnimationOptions, "animationOptions");
        Intrinsics.checkNotNullParameter(screenAnimationListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        AnimatorSet createShowModalAnimator = createShowModalAnimator(viewController, screenAnimationListener);
        this.runningAnimators.put(viewController, createShowModalAnimator);
        if (!transitionAnimationOptions.hasElementTransitions() || viewController2 == null) {
            showModalWithoutElementTransition(viewController, viewController2, transitionAnimationOptions, createShowModalAnimator);
        } else {
            showModalWithElementTransition(viewController, viewController2, transitionAnimationOptions, createShowModalAnimator);
        }
    }

    private final void showModalWithElementTransition(ViewController<?> viewController, ViewController<?> viewController2, TransitionAnimationOptions transitionAnimationOptions, AnimatorSet animatorSet) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new ModalAnimator$showModalWithElementTransition$1(viewController, transitionAnimationOptions, this, viewController2, animatorSet, (Continuation<? super ModalAnimator$showModalWithElementTransition$1>) null), 2, (Object) null);
    }

    private final void showModalWithoutElementTransition(ViewController<?> viewController, ViewController<?> viewController2, TransitionAnimationOptions transitionAnimationOptions, AnimatorSet animatorSet) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new ModalAnimator$showModalWithoutElementTransition$1(transitionAnimationOptions, viewController, this, viewController2, animatorSet, (Continuation<? super ModalAnimator$showModalWithoutElementTransition$1>) null), 2, (Object) null);
    }

    public void dismiss(ViewController<?> viewController, ViewController<?> viewController2, TransitionAnimationOptions transitionAnimationOptions, ScreenAnimationListener screenAnimationListener) {
        Intrinsics.checkNotNullParameter(viewController2, "disappearing");
        Intrinsics.checkNotNullParameter(transitionAnimationOptions, "animationOptions");
        Intrinsics.checkNotNullParameter(screenAnimationListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new ModalAnimator$dismiss$1(this, viewController2, screenAnimationListener, transitionAnimationOptions, viewController, (Continuation<? super ModalAnimator$dismiss$1>) null), 2, (Object) null);
    }

    private final AnimatorSet createShowModalAnimator(ViewController<?> viewController, ScreenAnimationListener screenAnimationListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new ModalAnimator$createShowModalAnimator$1(screenAnimationListener, this, viewController));
        return animatorSet;
    }

    /* access modifiers changed from: private */
    public final AnimatorSet createDismissAnimator(ViewController<?> viewController, ScreenAnimationListener screenAnimationListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new ModalAnimator$createDismissAnimator$1(screenAnimationListener, this, viewController));
        return animatorSet;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.animation.AnimatorSet} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7 A[LOOP:0: B:21:0x00a1->B:23:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setupDismissAnimationWithSharedElementTransition(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r10, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r11, com.reactnativenavigation.options.TransitionAnimationOptions r12, android.animation.AnimatorSet r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.reactnativenavigation.viewcontrollers.modal.ModalAnimator$setupDismissAnimationWithSharedElementTransition$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.reactnativenavigation.viewcontrollers.modal.ModalAnimator$setupDismissAnimationWithSharedElementTransition$1 r0 = (com.reactnativenavigation.viewcontrollers.modal.ModalAnimator$setupDismissAnimationWithSharedElementTransition$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            com.reactnativenavigation.viewcontrollers.modal.ModalAnimator$setupDismissAnimationWithSharedElementTransition$1 r0 = new com.reactnativenavigation.viewcontrollers.modal.ModalAnimator$setupDismissAnimationWithSharedElementTransition$1
            r0.<init>(r9, r14)
        L_0x0019:
            r6 = r0
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r7 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 != r7) goto L_0x0038
            java.lang.Object r10 = r6.L$2
            com.reactnativenavigation.options.AnimationOptions r10 = (com.reactnativenavigation.options.AnimationOptions) r10
            java.lang.Object r11 = r6.L$1
            r13 = r11
            android.animation.AnimatorSet r13 = (android.animation.AnimatorSet) r13
            java.lang.Object r11 = r6.L$0
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController r11 = (com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController) r11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0073
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r14)
            com.reactnativenavigation.options.AnimationOptions r14 = r12.getExit()
            boolean r14 = r14.isFadeAnimation()
            if (r14 == 0) goto L_0x0052
            com.reactnativenavigation.options.AnimationOptions r14 = r12.getExit()
            goto L_0x0058
        L_0x0052:
            com.reactnativenavigation.options.StackAnimationOptions r14 = r9.defaultAnimation
            com.reactnativenavigation.options.animations.ViewAnimationOptions r14 = r14.content
            com.reactnativenavigation.options.AnimationOptions r14 = r14.exit
        L_0x0058:
            com.reactnativenavigation.views.element.TransitionAnimatorCreator r1 = r9.transitionAnimatorCreator
            r2 = r12
            com.reactnativenavigation.options.LayoutAnimation r2 = (com.reactnativenavigation.options.LayoutAnimation) r2
            r6.L$0 = r10
            r6.L$1 = r13
            r6.L$2 = r14
            r6.label = r7
            r3 = r14
            r4 = r10
            r5 = r11
            java.lang.Object r11 = r1.create(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L_0x006f
            return r0
        L_0x006f:
            r8 = r11
            r11 = r10
            r10 = r14
            r14 = r8
        L_0x0073:
            android.animation.AnimatorSet r14 = (android.animation.AnimatorSet) r14
            r12 = 2
            android.animation.Animator[] r12 = new android.animation.Animator[r12]
            android.view.ViewGroup r11 = r11.getView()
            java.lang.String r0 = "disappearing.view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            android.view.View r11 = (android.view.View) r11
            android.animation.Animator r10 = r10.getAnimation(r11)
            r11 = 0
            r12[r11] = r10
            r10 = r14
            android.animation.Animator r10 = (android.animation.Animator) r10
            r12[r7] = r10
            r13.playTogether(r12)
            java.util.ArrayList r10 = r14.getListeners()
            java.lang.String r11 = "transitionAnimators.listeners"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00a1:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b1
            java.lang.Object r11 = r10.next()
            android.animation.Animator$AnimatorListener r11 = (android.animation.Animator.AnimatorListener) r11
            r13.addListener(r11)
            goto L_0x00a1
        L_0x00b1:
            r14.removeAllListeners()
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.modal.ModalAnimator.setupDismissAnimationWithSharedElementTransition(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.options.TransitionAnimationOptions, android.animation.AnimatorSet, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
