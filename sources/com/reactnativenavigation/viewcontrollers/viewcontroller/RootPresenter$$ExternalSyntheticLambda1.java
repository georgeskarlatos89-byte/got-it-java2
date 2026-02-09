package com.reactnativenavigation.viewcontrollers.viewcontroller;

import com.reactnativenavigation.react.CommandListener;
import kotlin.jvm.functions.Function0;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RootPresenter$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ CommandListener f$0;
    public final /* synthetic */ ViewController f$1;

    public /* synthetic */ RootPresenter$$ExternalSyntheticLambda1(CommandListener commandListener, ViewController viewController) {
        this.f$0 = commandListener;
        this.f$1 = viewController;
    }

    public final Object invoke() {
        return this.f$0.onSuccess(this.f$1.getId());
    }
}
