package com.reactnativenavigation.viewcontrollers.parent;

import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ParentController$$ExternalSyntheticLambda1 implements CollectionUtils.Apply {
    public final /* synthetic */ Options f$0;

    public /* synthetic */ ParentController$$ExternalSyntheticLambda1(Options options) {
        this.f$0 = options;
    }

    public final void on(Object obj) {
        ((ViewController) obj).setDefaultOptions(this.f$0);
    }
}
