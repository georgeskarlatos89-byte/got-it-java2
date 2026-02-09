package com.reactnativenavigation.viewcontrollers.viewcontroller;

import android.view.View;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ViewController;

public class ViewVisibilityListenerAdapter implements ViewController.ViewVisibilityListener {
    public boolean onViewAppeared(View view) {
        return false;
    }

    public boolean onViewDisappear(View view) {
        return false;
    }
}
