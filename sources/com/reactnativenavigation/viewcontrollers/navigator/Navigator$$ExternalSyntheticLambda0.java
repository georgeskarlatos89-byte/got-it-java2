package com.reactnativenavigation.viewcontrollers.navigator;

import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.viewcontrollers.stack.StackController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Navigator$$ExternalSyntheticLambda0 implements Functions.Func1 {
    public final /* synthetic */ Options f$0;
    public final /* synthetic */ CommandListener f$1;

    public /* synthetic */ Navigator$$ExternalSyntheticLambda0(Options options, CommandListener commandListener) {
        this.f$0 = options;
        this.f$1 = commandListener;
    }

    public final void run(Object obj) {
        ((StackController) obj).popToRoot(this.f$0, this.f$1);
    }
}
