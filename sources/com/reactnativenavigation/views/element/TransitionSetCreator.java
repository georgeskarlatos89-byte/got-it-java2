package com.reactnativenavigation.views.element;

import com.reactnativenavigation.options.ElementTransitions;
import com.reactnativenavigation.options.SharedElements;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH@ø\u0001\u0000¢\u0006\u0002\u0010\nJ7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000e\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0013\u001a\u00020\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/reactnativenavigation/views/element/TransitionSetCreator;", "", "()V", "create", "Lcom/reactnativenavigation/views/element/TransitionSet;", "animation", "Lcom/reactnativenavigation/options/LayoutAnimation;", "fromScreen", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "toScreen", "(Lcom/reactnativenavigation/options/LayoutAnimation;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createElementTransitions", "", "Lcom/reactnativenavigation/views/element/ElementTransition;", "elementTransitions", "Lcom/reactnativenavigation/options/ElementTransitions;", "(Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/options/ElementTransitions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSharedElementTransitions", "Lcom/reactnativenavigation/views/element/Transition;", "sharedElements", "Lcom/reactnativenavigation/options/SharedElements;", "(Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lcom/reactnativenavigation/options/SharedElements;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: TransitionSetCreator.kt */
public final class TransitionSetCreator {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object create(com.reactnativenavigation.options.LayoutAnimation r8, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r9, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController<?> r10, kotlin.coroutines.Continuation<? super com.reactnativenavigation.views.element.TransitionSet> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.reactnativenavigation.views.element.TransitionSetCreator$create$1
            if (r0 == 0) goto L_0x0014
            r0 = r11
            com.reactnativenavigation.views.element.TransitionSetCreator$create$1 r0 = (com.reactnativenavigation.views.element.TransitionSetCreator$create$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r11 = r0.label
            int r11 = r11 - r2
            r0.label = r11
            goto L_0x0019
        L_0x0014:
            com.reactnativenavigation.views.element.TransitionSetCreator$create$1 r0 = new com.reactnativenavigation.views.element.TransitionSetCreator$create$1
            r0.<init>(r7, r11)
        L_0x0019:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005e
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r8 = r0.L$1
            com.reactnativenavigation.views.element.TransitionSet r8 = (com.reactnativenavigation.views.element.TransitionSet) r8
            java.lang.Object r9 = r0.L$0
            com.reactnativenavigation.views.element.TransitionSet r9 = (com.reactnativenavigation.views.element.TransitionSet) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00ac
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            java.lang.Object r8 = r0.L$6
            com.reactnativenavigation.views.element.TransitionSet r8 = (com.reactnativenavigation.views.element.TransitionSet) r8
            java.lang.Object r9 = r0.L$5
            com.reactnativenavigation.views.element.TransitionSet r9 = (com.reactnativenavigation.views.element.TransitionSet) r9
            java.lang.Object r10 = r0.L$4
            com.reactnativenavigation.views.element.TransitionSet r10 = (com.reactnativenavigation.views.element.TransitionSet) r10
            java.lang.Object r2 = r0.L$3
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController r2 = (com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController) r2
            java.lang.Object r4 = r0.L$2
            com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController r4 = (com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController) r4
            java.lang.Object r5 = r0.L$1
            com.reactnativenavigation.options.LayoutAnimation r5 = (com.reactnativenavigation.options.LayoutAnimation) r5
            java.lang.Object r6 = r0.L$0
            com.reactnativenavigation.views.element.TransitionSetCreator r6 = (com.reactnativenavigation.views.element.TransitionSetCreator) r6
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0089
        L_0x005e:
            kotlin.ResultKt.throwOnFailure(r11)
            com.reactnativenavigation.views.element.TransitionSet r11 = new com.reactnativenavigation.views.element.TransitionSet
            r11.<init>()
            com.reactnativenavigation.options.SharedElements r2 = r8.getSharedElements()
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r11
            r0.L$5 = r11
            r0.L$6 = r11
            r0.label = r4
            java.lang.Object r2 = r7.createSharedElementTransitions(r9, r10, r2, r0)
            if (r2 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r6 = r7
            r5 = r8
            r4 = r9
            r8 = r11
            r9 = r8
            r11 = r2
            r2 = r10
            r10 = r9
        L_0x0089:
            java.util.List r11 = (java.util.List) r11
            r8.addAll(r11)
            com.reactnativenavigation.options.ElementTransitions r8 = r5.getElementTransitions()
            r0.L$0 = r10
            r0.L$1 = r9
            r11 = 0
            r0.L$2 = r11
            r0.L$3 = r11
            r0.L$4 = r11
            r0.L$5 = r11
            r0.L$6 = r11
            r0.label = r3
            java.lang.Object r11 = r6.createElementTransitions(r4, r2, r8, r0)
            if (r11 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r8 = r9
            r9 = r10
        L_0x00ac:
            java.util.List r11 = (java.util.List) r11
            r8.addAll(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativenavigation.views.element.TransitionSetCreator.create(com.reactnativenavigation.options.LayoutAnimation, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object createSharedElementTransitions(ViewController<?> viewController, ViewController<?> viewController2, SharedElements sharedElements, Continuation<? super List<? extends Transition>> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new TransitionSetCreator$createSharedElementTransitions$2(sharedElements, viewController2, viewController, (Continuation<? super TransitionSetCreator$createSharedElementTransitions$2>) null), continuation);
    }

    /* access modifiers changed from: private */
    public final Object createElementTransitions(ViewController<?> viewController, ViewController<?> viewController2, ElementTransitions elementTransitions, Continuation<? super List<ElementTransition>> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new TransitionSetCreator$createElementTransitions$2(elementTransitions, viewController, viewController2, (Continuation<? super TransitionSetCreator$createElementTransitions$2>) null), continuation);
    }
}
