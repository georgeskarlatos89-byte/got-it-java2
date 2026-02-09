package com.reactnativenavigation.viewcontrollers.stack;

import android.view.View;
import com.reactnativenavigation.options.FabOptions;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FabPresenter$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ ViewController f$0;
    public final /* synthetic */ FabOptions f$1;

    public /* synthetic */ FabPresenter$$ExternalSyntheticLambda0(ViewController viewController, FabOptions fabOptions) {
        this.f$0 = viewController;
        this.f$1 = fabOptions;
    }

    public final void onClick(View view) {
        this.f$0.sendOnNavigationButtonPressed((String) this.f$1.id.get());
    }
}
