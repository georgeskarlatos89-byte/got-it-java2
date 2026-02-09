package com.reactnativenavigation.react;

import android.app.Activity;
import com.facebook.react.ReactInstanceManager;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ReactViewCreator;

public class ReactComponentViewCreator implements ReactViewCreator {
    private ReactInstanceManager reactInstanceManager;

    public ReactComponentViewCreator(ReactInstanceManager reactInstanceManager2) {
        this.reactInstanceManager = reactInstanceManager2;
    }

    public ReactView create(Activity activity, String str, String str2) {
        return new ReactView(activity, this.reactInstanceManager, str, str2);
    }
}
