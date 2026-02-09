package com.reactnativenavigation.react;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.reactnativenavigation.NavigationActivity;
import com.reactnativenavigation.react.events.EventEmitter;

public class NavigationReactInitializer implements ReactInstanceManager.ReactInstanceEventListener {
    private final DevPermissionRequest devPermissionRequest;
    private boolean isActivityReadyForUi = false;
    private final ReactInstanceManager reactInstanceManager;
    private boolean waitingForAppLaunchEvent = true;

    NavigationReactInitializer(ReactInstanceManager reactInstanceManager2, boolean z) {
        this.reactInstanceManager = reactInstanceManager2;
        this.devPermissionRequest = new DevPermissionRequest(z);
    }

    /* access modifiers changed from: package-private */
    public void onActivityCreated() {
        this.reactInstanceManager.addReactInstanceEventListener(this);
        this.waitingForAppLaunchEvent = true;
    }

    /* access modifiers changed from: package-private */
    public void onActivityResumed(NavigationActivity navigationActivity) {
        if (this.devPermissionRequest.shouldAskPermission(navigationActivity)) {
            this.devPermissionRequest.askPermission(navigationActivity);
            return;
        }
        this.reactInstanceManager.onHostResume(navigationActivity, navigationActivity);
        this.isActivityReadyForUi = true;
        prepareReactApp();
    }

    /* access modifiers changed from: package-private */
    public void onActivityPaused(NavigationActivity navigationActivity) {
        this.isActivityReadyForUi = false;
        if (this.reactInstanceManager.hasStartedCreatingInitialContext()) {
            this.reactInstanceManager.onHostPause(navigationActivity);
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityDestroyed(NavigationActivity navigationActivity) {
        this.reactInstanceManager.removeReactInstanceEventListener(this);
        if (this.reactInstanceManager.hasStartedCreatingInitialContext()) {
            this.reactInstanceManager.onHostDestroy(navigationActivity);
        }
    }

    private void prepareReactApp() {
        if (shouldCreateContext()) {
            this.reactInstanceManager.createReactContextInBackground();
        } else if (this.waitingForAppLaunchEvent && this.reactInstanceManager.getCurrentReactContext() != null) {
            emitAppLaunched(this.reactInstanceManager.getCurrentReactContext());
        }
    }

    private void emitAppLaunched(ReactContext reactContext) {
        if (this.isActivityReadyForUi) {
            this.waitingForAppLaunchEvent = false;
            new EventEmitter(reactContext).appLaunched();
        }
    }

    private boolean shouldCreateContext() {
        return !this.reactInstanceManager.hasStartedCreatingInitialContext();
    }

    public void onReactContextInitialized(ReactContext reactContext) {
        emitAppLaunched(reactContext);
    }
}
