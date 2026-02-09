package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

public abstract class NativeDevSplitBundleLoaderSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public static final String NAME = "DevSplitBundleLoader";

    @Nonnull
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public abstract void loadBundle(String str, Promise promise);

    public NativeDevSplitBundleLoaderSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
