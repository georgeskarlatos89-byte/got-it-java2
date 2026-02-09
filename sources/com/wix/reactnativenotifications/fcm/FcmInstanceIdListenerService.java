package com.wix.reactnativenotifications.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import com.wix.reactnativenotifications.core.notification.PushNotification;

public class FcmInstanceIdListenerService extends FirebaseMessagingService {
    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            PushNotification.get(getApplicationContext(), remoteMessage.toIntent().getExtras()).onReceived();
        } catch (IPushNotification.InvalidNotificationException unused) {
        }
    }
}
