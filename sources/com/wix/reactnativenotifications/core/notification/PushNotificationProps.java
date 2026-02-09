package com.wix.reactnativenotifications.core.notification;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.messaging.Constants;

public class PushNotificationProps {
    protected Bundle mBundle;

    public PushNotificationProps(Bundle bundle) {
        this.mBundle = bundle;
    }

    public String getTitle() {
        return getBundleStringFirstNotNull("gcm.notification.title", "title");
    }

    public String getBody() {
        return getBundleStringFirstNotNull("gcm.notification.body", SDKConstants.PARAM_A2U_BODY);
    }

    public String getChannelId() {
        return getBundleStringFirstNotNull("gcm.notification.android_channel_id", "android_channel_id");
    }

    public Bundle asBundle() {
        return (Bundle) this.mBundle.clone();
    }

    public boolean isFirebaseBackgroundPayload() {
        return this.mBundle.containsKey(Constants.MessagePayloadKeys.MSGID);
    }

    public boolean isDataOnlyPushNotification() {
        return getTitle() == null && getBody() == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        for (String str : this.mBundle.keySet()) {
            sb.append(str).append("=").append(this.mBundle.get(str)).append(", ");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public PushNotificationProps copy() {
        return new PushNotificationProps((Bundle) this.mBundle.clone());
    }

    private String getBundleStringFirstNotNull(String str, String str2) {
        String string = this.mBundle.getString(str);
        return string == null ? this.mBundle.getString(str2) : string;
    }
}
