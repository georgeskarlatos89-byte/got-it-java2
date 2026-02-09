package com.tkporter.sendsms;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SendSMSPackage implements ReactPackage {
    private static SendSMSPackage instance;
    private SendSMSModule sendSms = null;

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        SendSMSModule sendSMSModule = new SendSMSModule(reactApplicationContext);
        this.sendSms = sendSMSModule;
        if (instance == null) {
            instance = this;
        }
        return Arrays.asList(new NativeModule[]{sendSMSModule});
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public static SendSMSPackage getInstance() {
        if (instance == null) {
            instance = new SendSMSPackage();
        }
        return instance;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SendSMSModule sendSMSModule = this.sendSms;
        if (sendSMSModule != null) {
            sendSMSModule.onActivityResult((Activity) null, i, i2, intent);
        }
    }
}
