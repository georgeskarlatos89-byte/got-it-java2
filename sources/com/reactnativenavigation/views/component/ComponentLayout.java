package com.reactnativenavigation.views.component;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.options.ButtonOptions;
import com.reactnativenavigation.options.Options;
import com.reactnativenavigation.options.params.Bool;
import com.reactnativenavigation.react.ReactView;
import com.reactnativenavigation.react.events.ComponentType;
import com.reactnativenavigation.utils.CoordinatorLayoutUtils;
import com.reactnativenavigation.viewcontrollers.stack.topbar.button.ButtonController;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ScrollEventListener;
import com.reactnativenavigation.views.touch.OverlayTouchDelegate;

public class ComponentLayout extends CoordinatorLayout implements ReactComponent, ButtonController.OnClickListener {
    private ReactView reactView;
    private final OverlayTouchDelegate touchDelegate;
    private boolean willAppearSent = false;

    public ViewGroup asView() {
        return this;
    }

    public ComponentLayout(Context context, ReactView reactView2) {
        super(context);
        this.reactView = reactView2;
        addView(reactView2.asView(), CoordinatorLayoutUtils.matchParentLP());
        this.touchDelegate = new OverlayTouchDelegate(this, reactView2);
    }

    public boolean isReady() {
        return this.reactView.isReady();
    }

    public void destroy() {
        this.reactView.destroy();
    }

    public void start() {
        this.reactView.start();
    }

    public void sendComponentWillStart() {
        if (!this.willAppearSent) {
            this.reactView.sendComponentWillStart(ComponentType.Component);
        }
        this.willAppearSent = true;
    }

    public void sendComponentStart() {
        this.reactView.sendComponentStart(ComponentType.Component);
    }

    public void sendComponentStop() {
        this.willAppearSent = false;
        this.reactView.sendComponentStop(ComponentType.Component);
    }

    public void applyOptions(Options options) {
        this.touchDelegate.setInterceptTouchOutside(options.overlayOptions.interceptTouchOutside);
    }

    public void setInterceptTouchOutside(Bool bool) {
        this.touchDelegate.setInterceptTouchOutside(bool);
    }

    public void sendOnNavigationButtonPressed(String str) {
        this.reactView.sendOnNavigationButtonPressed(str);
    }

    public ScrollEventListener getScrollEventListener() {
        return this.reactView.getScrollEventListener();
    }

    public void dispatchTouchEventToJs(MotionEvent motionEvent) {
        this.reactView.dispatchTouchEventToJs(motionEvent);
    }

    public boolean isRendered() {
        return this.reactView.isRendered();
    }

    public void onPress(ButtonOptions buttonOptions) {
        this.reactView.sendOnNavigationButtonPressed(buttonOptions.id);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.touchDelegate.onInterceptTouchEvent(motionEvent);
    }

    public boolean superOnInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }
}
