package com.reactnativenavigation.viewcontrollers.viewcontroller;

import android.view.MotionEvent;
import android.view.ViewGroup;

public interface IReactView extends Destroyable {
    ViewGroup asView();

    void dispatchTouchEventToJs(MotionEvent motionEvent);

    ScrollEventListener getScrollEventListener();

    boolean isReady();

    boolean isRendered();

    void sendOnNavigationButtonPressed(String str);
}
