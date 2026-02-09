package com.reactnativenavigation.viewcontrollers.stack;

import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class StackController$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ CommandListener f$0;
    public final /* synthetic */ ViewController f$1;

    public /* synthetic */ StackController$$ExternalSyntheticLambda4(CommandListener commandListener, ViewController viewController) {
        this.f$0 = commandListener;
        this.f$1 = viewController;
    }

    public final void run() {
        this.f$0.onSuccess(this.f$1.getId());
    }
}
