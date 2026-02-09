package com.tkporter.sendsms;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public class SendSMSModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int REQUEST_CODE = 5235;
    private Callback callback = null;
    private final ReactApplicationContext reactContext;

    public String getName() {
        return "SendSMS";
    }

    public void onNewIntent(Intent intent) {
    }

    public SendSMSModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE && i2 == 0) {
            sendCallback(false, true, false);
        }
    }

    public void sendCallback(Boolean bool, Boolean bool2, Boolean bool3) {
        Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.invoke(bool, bool2, bool3);
            this.callback = null;
        }
    }

    @ReactMethod
    public void send(ReadableMap readableMap, Callback callback2) {
        try {
            this.callback = callback2;
            new SendSMSObserver(this.reactContext, this, readableMap).start();
            String str = "";
            String string = readableMap.hasKey(SDKConstants.PARAM_A2U_BODY) ? readableMap.getString(SDKConstants.PARAM_A2U_BODY) : str;
            ReadableMap readableMap2 = null;
            ReadableArray array = readableMap.hasKey("recipients") ? readableMap.getArray("recipients") : null;
            if (readableMap.hasKey("attachment")) {
                readableMap2 = readableMap.getMap("attachment");
            }
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.reactContext);
            Intent intent = new Intent("android.intent.action.SEND");
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
            intent.setType("text/plain");
            intent.putExtra("sms_body", string);
            intent.putExtra("android.intent.extra.TEXT", string);
            intent.putExtra("exit_on_sent", true);
            if (readableMap2 != null) {
                intent.putExtra("android.intent.extra.STREAM", Uri.parse(readableMap2.getString("url")));
                intent.setType(readableMap2.getString("androidType"));
            }
            if (array != null) {
                String str2 = ";";
                if (Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
                    str2 = ",";
                }
                for (int i = 0; i < array.size(); i++) {
                    str = (str + array.getString(i)) + str2;
                }
                intent.putExtra(IntegrityManager.INTEGRITY_TYPE_ADDRESS, str);
            }
            this.reactContext.startActivityForResult(intent, REQUEST_CODE, intent.getExtras());
        } catch (Exception e) {
            sendCallback(false, false, true);
            throw e;
        }
    }
}
