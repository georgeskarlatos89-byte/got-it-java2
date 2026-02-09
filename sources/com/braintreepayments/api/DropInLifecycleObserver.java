package com.braintreepayments.api;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

class DropInLifecycleObserver implements DefaultLifecycleObserver {
    private static final String DROP_IN_RESULT = "com.braintreepayments.api.DropIn.RESULT";
    ActivityResultLauncher<DropInIntentData> activityLauncher;
    final ActivityResultRegistry activityResultRegistry;
    DropInClient dropInClient;

    DropInLifecycleObserver(ActivityResultRegistry activityResultRegistry2, DropInClient dropInClient2) {
        this.dropInClient = dropInClient2;
        this.activityResultRegistry = activityResultRegistry2;
    }

    public void onCreate(LifecycleOwner lifecycleOwner) {
        this.activityLauncher = this.activityResultRegistry.register(DROP_IN_RESULT, lifecycleOwner, new DropInActivityResultContract(), new DropInLifecycleObserver$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$0$com-braintreepayments-api-DropInLifecycleObserver  reason: not valid java name */
    public /* synthetic */ void m392lambda$onCreate$0$combraintreepaymentsapiDropInLifecycleObserver(DropInResult dropInResult) {
        this.dropInClient.onDropInResult(dropInResult);
    }

    /* access modifiers changed from: package-private */
    public void launch(DropInIntentData dropInIntentData) {
        this.activityLauncher.launch(dropInIntentData);
    }
}
