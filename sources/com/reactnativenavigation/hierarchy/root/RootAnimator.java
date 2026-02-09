package com.reactnativenavigation.hierarchy.root;

import android.animation.AnimatorSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J8\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/reactnativenavigation/hierarchy/root/RootAnimator;", "", "()V", "createAnimator", "Landroid/animation/AnimatorSet;", "onAnimationEnd", "Lkotlin/Function0;", "", "setRoot", "appearing", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "disappearing", "Lcom/reactnativenavigation/options/TransitionAnimationOptions;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RootAnimator.kt */
public class RootAnimator {
    /* JADX WARNING: type inference failed for: r5v0, types: [com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRoot(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r5, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r6, com.reactnativenavigation.options.TransitionAnimationOptions r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8) {
        /*
            r4 = this;
            java.lang.String r0 = "appearing"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "setRoot"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "onAnimationEnd"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.view.ViewGroup r0 = r5.getView()
            r1 = 0
            r0.setVisibility(r1)
            boolean r0 = r7.hasValue()
            if (r0 == 0) goto L_0x0094
            com.reactnativenavigation.options.AnimationOptions r0 = r7.getEnter()
            boolean r0 = r0.hasAnimation()
            if (r0 != 0) goto L_0x0032
            com.reactnativenavigation.options.AnimationOptions r0 = r7.getExit()
            boolean r0 = r0.hasAnimation()
            if (r0 != 0) goto L_0x0032
            goto L_0x0094
        L_0x0032:
            android.animation.AnimatorSet r8 = r4.createAnimator(r8)
            com.reactnativenavigation.options.AnimationOptions r0 = r7.getEnter()
            boolean r0 = r0.hasAnimation()
            r2 = 0
            if (r0 == 0) goto L_0x0055
            com.reactnativenavigation.options.AnimationOptions r0 = r7.getEnter()
            android.view.ViewGroup r5 = r5.getView()
            java.lang.String r3 = "appearing.view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            android.view.View r5 = (android.view.View) r5
            android.animation.Animator r5 = r0.getAnimation(r5)
            goto L_0x0056
        L_0x0055:
            r5 = r2
        L_0x0056:
            if (r6 == 0) goto L_0x0075
            com.reactnativenavigation.options.AnimationOptions r0 = r7.getExit()
            boolean r0 = r0.hasAnimation()
            if (r0 == 0) goto L_0x0075
            com.reactnativenavigation.options.AnimationOptions r7 = r7.getExit()
            android.view.ViewGroup r6 = r6.getView()
            java.lang.String r0 = "disappearing.view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            android.view.View r6 = (android.view.View) r6
            android.animation.Animator r2 = r7.getAnimation(r6)
        L_0x0075:
            if (r5 == 0) goto L_0x0085
            if (r2 == 0) goto L_0x0085
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r1] = r5
            r5 = 1
            r6[r5] = r2
            r8.playTogether(r6)
            goto L_0x0090
        L_0x0085:
            if (r5 == 0) goto L_0x008b
            r8.play(r5)
            goto L_0x0090
        L_0x008b:
            if (r2 == 0) goto L_0x0090
            r8.play(r2)
        L_0x0090:
            r8.start()
            return
        L_0x0094:
            r8.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.hierarchy.root.RootAnimator.setRoot(com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.options.TransitionAnimationOptions, kotlin.jvm.functions.Function0):void");
    }

    private final AnimatorSet createAnimator(Function0<Unit> function0) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new RootAnimator$createAnimator$1(function0));
        return animatorSet;
    }
}
