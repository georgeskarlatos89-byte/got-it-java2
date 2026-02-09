package com.facebook.react.modules.devloading;

import com.facebook.fbreact.specs.NativeDevLoadingViewSpec;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.BridgeDevSupportManager;
import com.facebook.react.devsupport.DefaultDevLoadingViewImplementation;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DevLoadingView")
public class DevLoadingModule extends NativeDevLoadingViewSpec {
    /* access modifiers changed from: private */
    public DevLoadingViewManager mDevLoadingViewManager;
    private final JSExceptionHandler mJSExceptionHandler;

    public DevLoadingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        JSExceptionHandler jSExceptionHandler = reactApplicationContext.getJSExceptionHandler();
        this.mJSExceptionHandler = jSExceptionHandler;
        if (jSExceptionHandler != null && (jSExceptionHandler instanceof BridgeDevSupportManager)) {
            DevLoadingViewManager devLoadingViewManager = ((BridgeDevSupportManager) jSExceptionHandler).getDevLoadingViewManager();
            this.mDevLoadingViewManager = devLoadingViewManager;
            this.mDevLoadingViewManager = devLoadingViewManager == null ? new DefaultDevLoadingViewImplementation(((BridgeDevSupportManager) jSExceptionHandler).getReactInstanceManagerHelper()) : devLoadingViewManager;
        }
    }

    public void showMessage(final String str, Double d, Double d2) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                DevLoadingModule.this.mDevLoadingViewManager.showMessage(str);
            }
        });
    }

    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() {
            public void run() {
                if (DevLoadingModule.this.mDevLoadingViewManager != null) {
                    DevLoadingModule.this.mDevLoadingViewManager.hide();
                }
            }
        });
    }
}
