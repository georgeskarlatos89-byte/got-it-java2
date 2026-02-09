package com.reactnativenavigation.viewcontrollers.stack;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.reactnativenavigation.options.AnimationOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.StackAnimationOptions;
import com.reactnativenavigation.viewcontrollers.common.BaseAnimator;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import com.reactnativenavigation.views.element.TransitionAnimatorCreator;
import com.reactnativenavigation.views.element.TransitionSetCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J>\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J>\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J>\u0010$\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\n2\u0006\u0010%\u001a\u00020#2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0006\u0010&\u001a\u00020\u0016J\u0006\u0010'\u001a\u00020\u0016J\b\u0010(\u001a\u00020\nH\u0014J\u001c\u0010)\u001a\u00020\n2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010*\u001a\u00020\n2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010+\u001a\u00020\n2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0014\u0010,\u001a\u00020\u00162\n\u0010-\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0016\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016J>\u00101\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J9\u00102\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00103\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0002\u00104J>\u00105\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J<\u0010\"\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00103\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fJ0\u00106\u001a\u0002072\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00108\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\nH\u0002J>\u00109\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00103\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J<\u0010%\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u00108\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fR,\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR,\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR,\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"Lcom/reactnativenavigation/viewcontrollers/stack/StackAnimator;", "Lcom/reactnativenavigation/viewcontrollers/common/BaseAnimator;", "context", "Landroid/content/Context;", "transitionAnimatorCreator", "Lcom/reactnativenavigation/views/element/TransitionAnimatorCreator;", "(Landroid/content/Context;Lcom/reactnativenavigation/views/element/TransitionAnimatorCreator;)V", "runningPopAnimations", "", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "Landroid/animation/AnimatorSet;", "getRunningPopAnimations$annotations", "()V", "getRunningPopAnimations", "()Ljava/util/Map;", "runningPushAnimations", "getRunningPushAnimations$annotations", "getRunningPushAnimations", "runningSetRootAnimations", "getRunningSetRootAnimations$annotations", "getRunningSetRootAnimations", "animatePop", "", "appearing", "disappearing", "disappearingOptions", "Lcom/reactnativenavigation/options/Options;", "additionalAnimations", "", "Landroid/animation/Animator;", "onAnimationEnd", "Ljava/lang/Runnable;", "animatePushWithoutElementTransitions", "set", "push", "Lcom/reactnativenavigation/options/StackAnimationOptions;", "animateSetRoot", "setRoot", "cancelAllAnimations", "cancelPushAnimations", "createAnimatorSet", "createPopAnimator", "createPushAnimator", "createSetRootAnimator", "endPushAnimation", "view", "isChildInTransition", "", "child", "pop", "popWithElementTransitions", "resolvedOptions", "(Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/options/Options;Landroid/animation/AnimatorSet;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "popWithoutElementTransitions", "pushWithElementTransition", "Lkotlinx/coroutines/Job;", "options", "pushWithoutElementTransitions", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: StackAnimator.kt */
public class StackAnimator extends BaseAnimator {
    private final Map<ViewController<?>, AnimatorSet> runningPopAnimations;
    private final Map<ViewController<?>, AnimatorSet> runningPushAnimations;
    private final Map<ViewController<?>, AnimatorSet> runningSetRootAnimations;
    /* access modifiers changed from: private */
    public final TransitionAnimatorCreator transitionAnimatorCreator;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StackAnimator(Context context) {
        this(context, (TransitionAnimatorCreator) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getRunningPopAnimations$annotations() {
    }

    public static /* synthetic */ void getRunningPushAnimations$annotations() {
    }

    public static /* synthetic */ void getRunningSetRootAnimations$annotations() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackAnimator(Context context, TransitionAnimatorCreator transitionAnimatorCreator2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new TransitionAnimatorCreator((TransitionSetCreator) null, 1, (DefaultConstructorMarker) null) : transitionAnimatorCreator2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackAnimator(Context context, TransitionAnimatorCreator transitionAnimatorCreator2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(transitionAnimatorCreator2, "transitionAnimatorCreator");
        this.transitionAnimatorCreator = transitionAnimatorCreator2;
        this.runningPushAnimations = new HashMap();
        this.runningPopAnimations = new HashMap();
        this.runningSetRootAnimations = new HashMap();
    }

    public final Map<ViewController<?>, AnimatorSet> getRunningPushAnimations() {
        return this.runningPushAnimations;
    }

    public final Map<ViewController<?>, AnimatorSet> getRunningPopAnimations() {
        return this.runningPopAnimations;
    }

    public final Map<ViewController<?>, AnimatorSet> getRunningSetRootAnimations() {
        return this.runningSetRootAnimations;
    }

    public final void cancelPushAnimations() {
        for (Animator cancel : this.runningPushAnimations.values()) {
            cancel.cancel();
        }
    }

    public boolean isChildInTransition(ViewController<?> viewController) {
        return this.runningPushAnimations.containsKey(viewController) || this.runningPopAnimations.containsKey(viewController) || this.runningSetRootAnimations.containsKey(viewController);
    }

    public final void cancelAllAnimations() {
        this.runningPushAnimations.clear();
        this.runningPopAnimations.clear();
        this.runningSetRootAnimations.clear();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setRoot(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r9, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r10, com.reactnativenavigation.options.Options r11, java.util.List<? extends android.animation.Animator> r12, java.lang.Runnable r13) {
        /*
            r8 = this;
            java.lang.String r0 = "appearing"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "disappearing"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "additionalAnimations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onAnimationEnd"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            android.animation.AnimatorSet r13 = r8.createSetRootAnimator(r9, r13)
            java.util.Map<com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>, android.animation.AnimatorSet> r0 = r8.runningSetRootAnimations
            r0.put(r9, r13)
            com.reactnativenavigation.options.AnimationsOptions r11 = r11.animations
            com.reactnativenavigation.options.StackAnimationOptions r11 = r11.setStackRoot
            com.reactnativenavigation.options.params.Bool r0 = r11.waitForRender
            boolean r0 = r0.isTrue()
            if (r0 == 0) goto L_0x0046
            android.view.ViewGroup r0 = r9.getView()
            r1 = 0
            r0.setAlpha(r1)
            com.reactnativenavigation.viewcontrollers.stack.StackAnimator$$ExternalSyntheticLambda0 r0 = new com.reactnativenavigation.viewcontrollers.stack.StackAnimator$$ExternalSyntheticLambda0
            r1 = r0
            r2 = r9
            r3 = r8
            r4 = r13
            r5 = r11
            r6 = r10
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.addOnAppearedListener(r0)
            goto L_0x004f
        L_0x0046:
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r9
            r5 = r10
            r6 = r12
            r1.animateSetRoot(r2, r3, r4, r5, r6)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.StackAnimator.setRoot(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.options.Options, java.util.List, java.lang.Runnable):void");
    }

    /* access modifiers changed from: private */
    public static final void setRoot$lambda$0(ViewController viewController, StackAnimator stackAnimator, AnimatorSet animatorSet, StackAnimationOptions stackAnimationOptions, ViewController viewController2, List list) {
        Intrinsics.checkNotNullParameter(viewController, "$appearing");
        Intrinsics.checkNotNullParameter(stackAnimator, "this$0");
        Intrinsics.checkNotNullParameter(animatorSet, "$set");
        Intrinsics.checkNotNullParameter(stackAnimationOptions, "$setRoot");
        Intrinsics.checkNotNullParameter(viewController2, "$disappearing");
        Intrinsics.checkNotNullParameter(list, "$additionalAnimations");
        viewController.getView().setAlpha(1.0f);
        stackAnimator.animateSetRoot(animatorSet, stackAnimationOptions, viewController, viewController2, list);
    }

    public final void push(ViewController<?> viewController, ViewController<?> viewController2, Options options, List<? extends Animator> list, Runnable runnable) {
        Intrinsics.checkNotNullParameter(viewController, "appearing");
        Intrinsics.checkNotNullParameter(viewController2, "disappearing");
        Intrinsics.checkNotNullParameter(options, "resolvedOptions");
        Intrinsics.checkNotNullParameter(list, "additionalAnimations");
        Intrinsics.checkNotNullParameter(runnable, "onAnimationEnd");
        AnimatorSet createPushAnimator = createPushAnimator(viewController, runnable);
        this.runningPushAnimations.put(viewController, createPushAnimator);
        if (options.animations.push.getSharedElements().hasValue()) {
            pushWithElementTransition(viewController, viewController2, options, createPushAnimator);
        } else {
            pushWithoutElementTransitions(viewController, viewController2, options, createPushAnimator, list);
        }
    }

    public void pop(ViewController<?> viewController, ViewController<?> viewController2, Options options, List<? extends Animator> list, Runnable runnable) {
        Intrinsics.checkNotNullParameter(viewController, "appearing");
        Intrinsics.checkNotNullParameter(viewController2, "disappearing");
        Intrinsics.checkNotNullParameter(options, "disappearingOptions");
        Intrinsics.checkNotNullParameter(list, "additionalAnimations");
        Intrinsics.checkNotNullParameter(runnable, "onAnimationEnd");
        if (this.runningPushAnimations.containsKey(viewController2)) {
            AnimatorSet animatorSet = this.runningPushAnimations.get(viewController2);
            Intrinsics.checkNotNull(animatorSet);
            animatorSet.cancel();
            runnable.run();
            return;
        }
        animatePop(viewController, viewController2, options, list, runnable);
    }

    private final void animatePop(ViewController<?> viewController, ViewController<?> viewController2, Options options, List<? extends Animator> list, Runnable runnable) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new StackAnimator$animatePop$1(this, viewController2, runnable, options, viewController, list, (Continuation<? super StackAnimator$animatePop$1>) null), 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.animation.AnimatorSet} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ac A[LOOP:0: B:21:0x00a6->B:23:0x00ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object popWithElementTransitions(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r10, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r11, com.reactnativenavigation.options.Options r12, android.animation.AnimatorSet r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.reactnativenavigation.viewcontrollers.stack.StackAnimator$popWithElementTransitions$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            com.reactnativenavigation.viewcontrollers.stack.StackAnimator$popWithElementTransitions$1 r0 = (com.reactnativenavigation.viewcontrollers.stack.StackAnimator$popWithElementTransitions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            com.reactnativenavigation.viewcontrollers.stack.StackAnimator$popWithElementTransitions$1 r0 = new com.reactnativenavigation.viewcontrollers.stack.StackAnimator$popWithElementTransitions$1
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
            com.reactnativenavigation.options.StackAnimationOptions r10 = (com.reactnativenavigation.options.StackAnimationOptions) r10
            java.lang.Object r11 = r6.L$1
            r13 = r11
            android.animation.AnimatorSet r13 = (android.animation.AnimatorSet) r13
            java.lang.Object r11 = r6.L$0
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController r11 = (com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController) r11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0074
        L_0x0038:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r14)
            com.reactnativenavigation.options.AnimationsOptions r12 = r12.animations
            com.reactnativenavigation.options.StackAnimationOptions r12 = r12.pop
            com.reactnativenavigation.options.animations.ViewAnimationOptions r14 = r12.content
            com.reactnativenavigation.options.AnimationOptions r14 = r14.exit
            boolean r14 = r14.isFadeAnimation()
            if (r14 == 0) goto L_0x0053
            r14 = r12
            goto L_0x0057
        L_0x0053:
            com.reactnativenavigation.options.FadeAnimation r14 = com.reactnativenavigation.options.FadeAnimation.INSTANCE
            com.reactnativenavigation.options.StackAnimationOptions r14 = (com.reactnativenavigation.options.StackAnimationOptions) r14
        L_0x0057:
            com.reactnativenavigation.views.element.TransitionAnimatorCreator r1 = r9.transitionAnimatorCreator
            r2 = r12
            com.reactnativenavigation.options.LayoutAnimation r2 = (com.reactnativenavigation.options.LayoutAnimation) r2
            com.reactnativenavigation.options.animations.ViewAnimationOptions r12 = r14.content
            com.reactnativenavigation.options.AnimationOptions r3 = r12.exit
            r6.L$0 = r11
            r6.L$1 = r13
            r6.L$2 = r14
            r6.label = r7
            r4 = r11
            r5 = r10
            java.lang.Object r10 = r1.create(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L_0x0071
            return r0
        L_0x0071:
            r8 = r14
            r14 = r10
            r10 = r8
        L_0x0074:
            android.animation.AnimatorSet r14 = (android.animation.AnimatorSet) r14
            r12 = 2
            android.animation.Animator[] r12 = new android.animation.Animator[r12]
            com.reactnativenavigation.options.animations.ViewAnimationOptions r10 = r10.content
            com.reactnativenavigation.options.AnimationOptions r10 = r10.exit
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
        L_0x00a6:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b6
            java.lang.Object r11 = r10.next()
            android.animation.Animator$AnimatorListener r11 = (android.animation.Animator.AnimatorListener) r11
            r13.addListener(r11)
            goto L_0x00a6
        L_0x00b6:
            r14.removeAllListeners()
            r13.start()
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.StackAnimator.popWithElementTransitions(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.options.Options, android.animation.AnimatorSet, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void popWithoutElementTransitions(ViewController<?> viewController, ViewController<?> viewController2, Options options, AnimatorSet animatorSet, List<? extends Animator> list) {
        StackAnimationOptions stackAnimationOptions = options.animations.pop;
        AnimationOptions animationOptions = stackAnimationOptions.content.exit;
        Object view = viewController2.getView();
        Intrinsics.checkNotNullExpressionValue(view, "disappearing.view");
        AnimatorSet defaultPopAnimation = getDefaultPopAnimation(viewController2.getView());
        Intrinsics.checkNotNullExpressionValue(defaultPopAnimation, "getDefaultPopAnimation(disappearing.view)");
        List mutableListOf = CollectionsKt.mutableListOf(animationOptions.getAnimation((View) view, defaultPopAnimation));
        mutableListOf.addAll(list);
        if (stackAnimationOptions.content.enter.hasValue()) {
            AnimationOptions animationOptions2 = stackAnimationOptions.content.enter;
            Object view2 = viewController.getView();
            Intrinsics.checkNotNullExpressionValue(view2, "appearing.view");
            mutableListOf.add(animationOptions2.getAnimation((View) view2));
        }
        animatorSet.playTogether(CollectionsKt.toList(mutableListOf));
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    public final AnimatorSet createPopAnimator(ViewController<?> viewController, Runnable runnable) {
        AnimatorSet createAnimatorSet = createAnimatorSet();
        this.runningPopAnimations.put(viewController, createAnimatorSet);
        createAnimatorSet.addListener(new StackAnimator$createPopAnimator$1(this, viewController, runnable));
        return createAnimatorSet;
    }

    private final AnimatorSet createPushAnimator(ViewController<?> viewController, Runnable runnable) {
        AnimatorSet createAnimatorSet = createAnimatorSet();
        createAnimatorSet.addListener(new StackAnimator$createPushAnimator$1(this, viewController, runnable));
        return createAnimatorSet;
    }

    private final AnimatorSet createSetRootAnimator(ViewController<?> viewController, Runnable runnable) {
        AnimatorSet createAnimatorSet = createAnimatorSet();
        createAnimatorSet.addListener(new StackAnimator$createSetRootAnimator$1(this, viewController, runnable));
        return createAnimatorSet;
    }

    private final Job pushWithElementTransition(ViewController<?> viewController, ViewController<?> viewController2, Options options, AnimatorSet animatorSet) {
        return BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain().getImmediate(), (CoroutineStart) null, new StackAnimator$pushWithElementTransition$1(viewController, options, this, viewController2, animatorSet, (Continuation<? super StackAnimator$pushWithElementTransition$1>) null), 2, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void pushWithoutElementTransitions(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r9, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r10, com.reactnativenavigation.options.Options r11, android.animation.AnimatorSet r12, java.util.List<? extends android.animation.Animator> r13) {
        /*
            r8 = this;
            com.reactnativenavigation.options.AnimationsOptions r11 = r11.animations
            com.reactnativenavigation.options.StackAnimationOptions r11 = r11.push
            com.reactnativenavigation.options.params.Bool r0 = r11.waitForRender
            boolean r0 = r0.isTrue()
            if (r0 == 0) goto L_0x0024
            android.view.ViewGroup r0 = r9.getView()
            r1 = 0
            r0.setAlpha(r1)
            com.reactnativenavigation.viewcontrollers.stack.StackAnimator$$ExternalSyntheticLambda1 r7 = new com.reactnativenavigation.viewcontrollers.stack.StackAnimator$$ExternalSyntheticLambda1
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r12
            r4 = r11
            r5 = r10
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.addOnAppearedListener(r7)
            goto L_0x002d
        L_0x0024:
            r0 = r8
            r1 = r12
            r2 = r11
            r3 = r9
            r4 = r10
            r5 = r13
            r0.animatePushWithoutElementTransitions(r1, r2, r3, r4, r5)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.viewcontrollers.stack.StackAnimator.pushWithoutElementTransitions(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.options.Options, android.animation.AnimatorSet, java.util.List):void");
    }

    /* access modifiers changed from: private */
    public static final void pushWithoutElementTransitions$lambda$2(ViewController viewController, StackAnimator stackAnimator, AnimatorSet animatorSet, StackAnimationOptions stackAnimationOptions, ViewController viewController2, List list) {
        Intrinsics.checkNotNullParameter(viewController, "$appearing");
        Intrinsics.checkNotNullParameter(stackAnimator, "this$0");
        Intrinsics.checkNotNullParameter(animatorSet, "$set");
        Intrinsics.checkNotNullParameter(stackAnimationOptions, "$push");
        Intrinsics.checkNotNullParameter(viewController2, "$disappearing");
        Intrinsics.checkNotNullParameter(list, "$additionalAnimations");
        viewController.getView().setAlpha(1.0f);
        stackAnimator.animatePushWithoutElementTransitions(animatorSet, stackAnimationOptions, viewController, viewController2, list);
    }

    private final void animatePushWithoutElementTransitions(AnimatorSet animatorSet, StackAnimationOptions stackAnimationOptions, ViewController<?> viewController, ViewController<?> viewController2, List<? extends Animator> list) {
        AnimationOptions animationOptions = stackAnimationOptions.content.enter;
        Object view = viewController.getView();
        Intrinsics.checkNotNullExpressionValue(view, "appearing.view");
        AnimatorSet defaultPushAnimation = getDefaultPushAnimation(viewController.getView());
        Intrinsics.checkNotNullExpressionValue(defaultPushAnimation, "getDefaultPushAnimation(appearing.view)");
        List mutableListOf = CollectionsKt.mutableListOf(animationOptions.getAnimation((View) view, defaultPushAnimation));
        mutableListOf.addAll(list);
        if (stackAnimationOptions.content.exit.hasValue()) {
            AnimationOptions animationOptions2 = stackAnimationOptions.content.exit;
            Object view2 = viewController2.getView();
            Intrinsics.checkNotNullExpressionValue(view2, "disappearing.view");
            mutableListOf.add(animationOptions2.getAnimation((View) view2));
        }
        animatorSet.playTogether(CollectionsKt.toList(mutableListOf));
        animatorSet.addListener(new StackAnimator$animatePushWithoutElementTransitions$$inlined$doOnEnd$1(viewController2));
        animatorSet.start();
    }

    private final void animateSetRoot(AnimatorSet animatorSet, StackAnimationOptions stackAnimationOptions, ViewController<?> viewController, ViewController<?> viewController2, List<? extends Animator> list) {
        AnimationOptions animationOptions = stackAnimationOptions.content.enter;
        Object view = viewController.getView();
        Intrinsics.checkNotNullExpressionValue(view, "appearing.view");
        AnimatorSet defaultSetStackRootAnimation = getDefaultSetStackRootAnimation(viewController.getView());
        Intrinsics.checkNotNullExpressionValue(defaultSetStackRootAnimation, "getDefaultSetStackRootAnimation(appearing.view)");
        List mutableListOf = CollectionsKt.mutableListOf(animationOptions.getAnimation((View) view, defaultSetStackRootAnimation));
        mutableListOf.addAll(list);
        if (stackAnimationOptions.content.exit.hasValue()) {
            AnimationOptions animationOptions2 = stackAnimationOptions.content.exit;
            Object view2 = viewController2.getView();
            Intrinsics.checkNotNullExpressionValue(view2, "disappearing.view");
            mutableListOf.add(animationOptions2.getAnimation((View) view2));
        }
        animatorSet.playTogether(CollectionsKt.toList(mutableListOf));
        animatorSet.start();
    }

    /* access modifiers changed from: protected */
    public AnimatorSet createAnimatorSet() {
        return new AnimatorSet();
    }

    public final void endPushAnimation(ViewController<?> viewController) {
        Intrinsics.checkNotNullParameter(viewController, ViewHierarchyConstants.VIEW_KEY);
        if (this.runningPushAnimations.containsKey(viewController)) {
            AnimatorSet animatorSet = this.runningPushAnimations.get(viewController);
            Intrinsics.checkNotNull(animatorSet);
            animatorSet.end();
        }
    }
}
