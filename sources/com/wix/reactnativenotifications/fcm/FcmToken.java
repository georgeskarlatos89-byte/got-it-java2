package com.wix.reactnativenotifications.fcm;

import android.content.Context;
import android.os.Bundle;
import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.wix.reactnativenotifications.Defs;
import com.wix.reactnativenotifications.core.JsIOHelper;

public class FcmToken implements IFcmToken {
    protected static String sToken;
    protected final Context mAppContext;
    protected final JsIOHelper mJsIOHelper;

    protected FcmToken(Context context) {
        if (context instanceof ReactApplication) {
            this.mJsIOHelper = new JsIOHelper();
            this.mAppContext = context;
            return;
        }
        throw new IllegalStateException("Application instance isn't a react-application");
    }

    public static IFcmToken get(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof INotificationsFcmApplication) {
            return ((INotificationsFcmApplication) applicationContext).getFcmToken(context);
        }
        return new FcmToken(applicationContext);
    }

    public void onNewTokenReady() {
        synchronized (this.mAppContext) {
            refreshToken();
        }
    }

    public void onManualRefresh() {
        synchronized (this.mAppContext) {
            if (sToken == null) {
                refreshToken();
            } else {
                sendTokenToJS();
            }
        }
    }

    public void onAppReady() {
        synchronized (this.mAppContext) {
            if (sToken == null) {
                refreshToken();
            } else {
                sendTokenToJS();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void refreshToken() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new FcmToken$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$refreshToken$0$com-wix-reactnativenotifications-fcm-FcmToken  reason: not valid java name */
    public /* synthetic */ void m1057lambda$refreshToken$0$comwixreactnativenotificationsfcmFcmToken(Task task) {
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            sToken = str;
            Context context = this.mAppContext;
            if (context instanceof IFcmTokenListenerApplication) {
                ((IFcmTokenListenerApplication) context).onNewFCMToken(str);
            }
            sendTokenToJS();
        }
    }

    /* access modifiers changed from: protected */
    public void sendTokenToJS() {
        ReactContext currentReactContext = ((ReactApplication) this.mAppContext).getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
        if (currentReactContext != null && currentReactContext.hasActiveCatalystInstance()) {
            Bundle bundle = new Bundle();
            bundle.putString("deviceToken", sToken);
            this.mJsIOHelper.sendEventToJS(Defs.TOKEN_RECEIVED_EVENT_NAME, bundle, currentReactContext);
        }
    }
}
