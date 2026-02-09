package com.reactnativenavigation.viewcontrollers.navigator;

import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.viewcontrollers.stack.StackController;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class Navigator$$ExternalSyntheticLambda3 implements Functions.Func1 {
    public final /* synthetic */ List f$0;
    public final /* synthetic */ CommandListener f$1;

    public /* synthetic */ Navigator$$ExternalSyntheticLambda3(List list, CommandListener commandListener) {
        this.f$0 = list;
        this.f$1 = commandListener;
    }

    public final void run(Object obj) {
        ((StackController) obj).setRoot(this.f$0, this.f$1);
    }
}
