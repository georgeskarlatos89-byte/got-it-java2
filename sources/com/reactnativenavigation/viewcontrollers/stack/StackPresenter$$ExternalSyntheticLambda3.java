package com.reactnativenavigation.viewcontrollers.stack;

import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.utils.CollectionUtils;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class StackPresenter$$ExternalSyntheticLambda3 implements CollectionUtils.Filter {
    public final /* synthetic */ ButtonOptions f$0;

    public /* synthetic */ StackPresenter$$ExternalSyntheticLambda3(ButtonOptions buttonOptions) {
        this.f$0 = buttonOptions;
    }

    public final boolean filter(Object obj) {
        return ((ButtonController) obj).getButton().equals(this.f$0);
    }
}
