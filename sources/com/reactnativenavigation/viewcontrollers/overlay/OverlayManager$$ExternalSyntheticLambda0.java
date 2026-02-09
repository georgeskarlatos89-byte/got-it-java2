package com.reactnativenavigation.viewcontrollers.overlay;

import com.reactnativenavigation.react.CommandListener;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class OverlayManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ ViewController f$0;
    public final /* synthetic */ CommandListener f$1;

    public /* synthetic */ OverlayManager$$ExternalSyntheticLambda0(ViewController viewController, CommandListener commandListener) {
        this.f$0 = viewController;
        this.f$1 = commandListener;
    }

    public final void run() {
        OverlayManager.show$lambda$0(this.f$0, this.f$1);
    }
}
