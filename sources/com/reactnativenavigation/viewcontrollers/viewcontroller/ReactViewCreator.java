package com.reactnativenavigation.viewcontrollers.viewcontroller;

import android.app.Activity;

public interface ReactViewCreator {
    IReactView create(Activity activity, String str, String str2);
}
