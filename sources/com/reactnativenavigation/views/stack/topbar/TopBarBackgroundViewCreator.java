package com.reactnativenavigation.views.stack.topbar;

import android.app.Activity;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ReactViewCreator;

public class TopBarBackgroundViewCreator implements ReactViewCreator {
    protected ReactInstanceManager instanceManager;

    public TopBarBackgroundViewCreator(ReactInstanceManager reactInstanceManager) {
        this.instanceManager = reactInstanceManager;
    }

    public TopBarBackgroundView create(Activity activity, String str, String str2) {
        return new TopBarBackgroundView(activity, this.instanceManager, str, str2);
    }
}
