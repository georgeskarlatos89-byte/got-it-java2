package com.reactnativenavigation.views.stack.topbar.titlebar;

import android.app.Activity;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ReactViewCreator;

public class TitleBarReactViewCreator implements ReactViewCreator {
    protected ReactInstanceManager instanceManager;

    public TitleBarReactViewCreator(ReactInstanceManager reactInstanceManager) {
        this.instanceManager = reactInstanceManager;
    }

    public TitleBarReactView create(Activity activity, String str, String str2) {
        return new TitleBarReactView(activity, this.instanceManager, str, str2);
    }
}
