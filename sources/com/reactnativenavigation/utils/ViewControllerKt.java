package com.reactnativenavigation.utils;

import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"awaitRender", "", "Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;", "(Lcom/reactnativenavigation/viewcontrollers/viewcontroller/ViewController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-navigation_reactNative71Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ViewController.kt */
public final class ViewControllerKt {
    public static final Object awaitRender(ViewController<?> viewController, Continuation<? super Unit> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        viewController.addOnAppearedListener(new ViewControllerKt$awaitRender$2$1(viewController, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }
}
