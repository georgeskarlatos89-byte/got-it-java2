package com.reactnativenavigation;

import android.app.Application;
import android.content.Context;
import com.facebook.react.ReactApplication;
import com.facebook.soloader.SoLoader;
import com.reactnativenavigation.react.ReactGateway;
import com.reactnativenavigation.viewcontrollers.externalcomponent.ExternalComponentCreator;
import java.util.HashMap;
import java.util.Map;

public abstract class NavigationApplication extends Application implements ReactApplication {
    public static NavigationApplication instance;
    final Map<String, ExternalComponentCreator> externalComponents = new HashMap();
    private ReactGateway reactGateway;

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onCreate() {
        super.onCreate();
        instance = this;
        SoLoader.init((Context) this, false);
        this.reactGateway = createReactGateway();
    }

    /* access modifiers changed from: protected */
    public ReactGateway createReactGateway() {
        return new ReactGateway(getReactNativeHost());
    }

    public ReactGateway getReactGateway() {
        return this.reactGateway;
    }

    public void registerExternalComponent(String str, ExternalComponentCreator externalComponentCreator) {
        if (!this.externalComponents.containsKey(str)) {
            this.externalComponents.put(str, externalComponentCreator);
            return;
        }
        throw new RuntimeException("A component has already been registered with this name: " + str);
    }

    public final Map<String, ExternalComponentCreator> getExternalComponents() {
        return this.externalComponents;
    }
}
