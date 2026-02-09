package com.reactnativenavigation.viewcontrollers.toptabs;

import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.Functions;
import com.reactnativenavigation.viewcontrollers.parent.ParentController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class TopTabsController$$ExternalSyntheticLambda0 implements Functions.Func1 {
    public final /* synthetic */ Options f$0;
    public final /* synthetic */ ViewController f$1;

    public /* synthetic */ TopTabsController$$ExternalSyntheticLambda0(Options options, ViewController viewController) {
        this.f$0 = options;
        this.f$1 = viewController;
    }

    public final void run(Object obj) {
        ((ParentController) obj).applyChildOptions(this.f$0.copy(), this.f$1);
    }
}
