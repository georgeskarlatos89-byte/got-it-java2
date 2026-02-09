package com.wix.reactnativenotifications.core;

public class AppLifecycleFacadeHolder {
    protected static AppLifecycleFacade sInstance = new ReactAppLifecycleFacade();

    public static AppLifecycleFacade get() {
        return sInstance;
    }

    public static void set(AppLifecycleFacade appLifecycleFacade) {
        sInstance = appLifecycleFacade;
    }
}
