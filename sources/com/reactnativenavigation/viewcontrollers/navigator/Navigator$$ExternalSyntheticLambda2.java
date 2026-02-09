package com.reactnativenavigation.viewcontrollers.navigator;

import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.viewcontrollers.stack.StackController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Navigator$$ExternalSyntheticLambda2 implements Functions.Func1 {
    public final /* synthetic */ ViewController f$0;
    public final /* synthetic */ Options f$1;
    public final /* synthetic */ CommandListener f$2;

    public /* synthetic */ Navigator$$ExternalSyntheticLambda2(ViewController viewController, Options options, CommandListener commandListener) {
        this.f$0 = viewController;
        this.f$1 = options;
        this.f$2 = commandListener;
    }

    public final void run(Object obj) {
        ((StackController) obj).popTo(this.f$0, this.f$1, this.f$2);
    }
}
