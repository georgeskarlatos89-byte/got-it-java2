package com.braintreepayments.api;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class GooglePayLifecycleObserver implements LifecycleEventObserver {
    private static final String GOOGLE_PAY_RESULT = "com.braintreepayments.api.GooglePay.RESULT";
    ActivityResultLauncher<GooglePayIntentData> activityLauncher;
    ActivityResultRegistry activityResultRegistry;
    GooglePayClient googlePayClient;

    GooglePayLifecycleObserver(ActivityResultRegistry activityResultRegistry2, GooglePayClient googlePayClient2) {
        this.activityResultRegistry = activityResultRegistry2;
        this.googlePayClient = googlePayClient2;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            this.activityLauncher = this.activityResultRegistry.register(GOOGLE_PAY_RESULT, lifecycleOwner, new GooglePayActivityResultContract(), new ActivityResultCallback<GooglePayResult>() {
                public void onActivityResult(GooglePayResult googlePayResult) {
                    GooglePayLifecycleObserver.this.googlePayClient.onGooglePayResult(googlePayResult);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void launch(GooglePayIntentData googlePayIntentData) {
        this.activityLauncher.launch(googlePayIntentData);
    }
}
