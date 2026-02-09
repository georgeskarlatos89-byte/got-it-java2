package com.reactnativenavigation.viewcontrollers.navigator;

import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.viewcontrollers.stack.StackController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Navigator$$ExternalSyntheticLambda4 implements Functions.Func1 {
    public final /* synthetic */ ViewController f$0;
    public final /* synthetic */ CommandListener f$1;

    public /* synthetic */ Navigator$$ExternalSyntheticLambda4(ViewController viewController, CommandListener commandListener) {
        this.f$0 = viewController;
        this.f$1 = commandListener;
    }

    public final void run(Object obj) {
        ((StackController) obj).push(this.f$0, this.f$1);
    }
}
