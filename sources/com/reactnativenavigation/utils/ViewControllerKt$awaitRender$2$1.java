package com.reactnativenavigation.utils;

import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/reactnativenavigation/utils/ViewControllerKt$awaitRender$2$1", "Ljava/lang/Runnable;", "run", "", "react-native-navigation_reactNative71Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ViewController.kt */
public final class ViewControllerKt$awaitRender$2$1 implements Runnable {
    final /* synthetic */ Continuation<Unit> $cont;
    final /* synthetic */ ViewController<?> $this_awaitRender;

    ViewControllerKt$awaitRender$2$1(ViewController<?> viewController, Continuation<? super Unit> continuation) {
        this.$this_awaitRender = viewController;
        this.$cont = continuation;
    }

    public void run() {
        this.$this_awaitRender.removeOnAppearedListener(this);
        Continuation<Unit> continuation = this.$cont;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m1102constructorimpl(Unit.INSTANCE));
    }
}
