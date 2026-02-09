package com.reactnativenavigation.react;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.reactnativenavigation.react.events.ComponentType;
import com.reactnativenavigation.react.events.EventEmitter;
import com.reactnativenavigation.viewcontrollers.viewcontroller.IReactView;
import com.reactnativenavigation.viewcontrollers.viewcontroller.ScrollEventListener;
import com.reactnativenavigation.views.component.Renderable;

public class ReactView extends ReactRootView implements IReactView, Renderable {
    private final String componentId;
    private final String componentName;
    private boolean isAttachedToReactInstance = false;
    private final JSTouchDispatcher jsTouchDispatcher;
    private final ReactInstanceManager reactInstanceManager;

    public ReactView asView() {
        return this;
    }

    public ReactView(Context context, ReactInstanceManager reactInstanceManager2, String str, String str2) {
        super(context);
        this.reactInstanceManager = reactInstanceManager2;
        this.componentId = str;
        this.componentName = str2;
        this.jsTouchDispatcher = new JSTouchDispatcher(this);
        setIsFabric(ReactFeatureFlags.enableFabricRenderer);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    public void start() {
        if (!this.isAttachedToReactInstance) {
            this.isAttachedToReactInstance = true;
            Bundle bundle = new Bundle();
            bundle.putString("componentId", this.componentId);
            startReactApplication(this.reactInstanceManager, this.componentName, bundle);
        }
    }

    public boolean isReady() {
        return this.isAttachedToReactInstance;
    }

    public void destroy() {
        unmountReactApplication();
    }

    public void sendComponentWillStart(ComponentType componentType) {
        post(new ReactView$$ExternalSyntheticLambda1(this, componentType));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$sendComponentWillStart$0$com-reactnativenavigation-react-ReactView  reason: not valid java name */
    public /* synthetic */ void m987lambda$sendComponentWillStart$0$comreactnativenavigationreactReactView(ComponentType componentType) {
        ReactContext currentReactContext;
        ReactInstanceManager reactInstanceManager2 = this.reactInstanceManager;
        if (reactInstanceManager2 != null && (currentReactContext = reactInstanceManager2.getCurrentReactContext()) != null) {
            new EventEmitter(currentReactContext).emitComponentWillAppear(this.componentId, this.componentName, componentType);
        }
    }

    public void sendComponentStart(ComponentType componentType) {
        post(new ReactView$$ExternalSyntheticLambda0(this, componentType));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$sendComponentStart$1$com-reactnativenavigation-react-ReactView  reason: not valid java name */
    public /* synthetic */ void m986lambda$sendComponentStart$1$comreactnativenavigationreactReactView(ComponentType componentType) {
        ReactContext currentReactContext;
        ReactInstanceManager reactInstanceManager2 = this.reactInstanceManager;
        if (reactInstanceManager2 != null && (currentReactContext = reactInstanceManager2.getCurrentReactContext()) != null) {
            new EventEmitter(currentReactContext).emitComponentDidAppear(this.componentId, this.componentName, componentType);
        }
    }

    public void sendComponentStop(ComponentType componentType) {
        ReactContext currentReactContext;
        ReactInstanceManager reactInstanceManager2 = this.reactInstanceManager;
        if (reactInstanceManager2 != null && (currentReactContext = reactInstanceManager2.getCurrentReactContext()) != null) {
            new EventEmitter(currentReactContext).emitComponentDidDisappear(this.componentId, this.componentName, componentType);
        }
    }

    public void sendOnNavigationButtonPressed(String str) {
        ReactContext currentReactContext;
        ReactInstanceManager reactInstanceManager2 = this.reactInstanceManager;
        if (reactInstanceManager2 != null && (currentReactContext = reactInstanceManager2.getCurrentReactContext()) != null) {
            new EventEmitter(currentReactContext).emitOnNavigationButtonPressed(this.componentId, str);
        }
    }

    public ScrollEventListener getScrollEventListener() {
        return new ScrollEventListener(getEventDispatcher());
    }

    public void dispatchTouchEventToJs(MotionEvent motionEvent) {
        this.jsTouchDispatcher.handleTouchEvent(motionEvent, getEventDispatcher());
    }

    public boolean isRendered() {
        return getChildCount() >= 1;
    }

    public EventDispatcher getEventDispatcher() {
        ReactContext currentReactContext = this.reactInstanceManager.getCurrentReactContext();
        if (currentReactContext == null) {
            return null;
        }
        return ((UIManagerModule) currentReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
    }

    public String getComponentName() {
        return this.componentName;
    }
}
