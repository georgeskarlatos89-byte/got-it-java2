package com.dooboolab.rniap;

import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.facebook.react.bridge.Promise;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$acknowledgePurchase$1$$ExternalSyntheticLambda0 implements AcknowledgePurchaseResponseListener {
    public final /* synthetic */ RNIapModule f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ RNIapModule$acknowledgePurchase$1$$ExternalSyntheticLambda0(RNIapModule rNIapModule, Promise promise) {
        this.f$0 = rNIapModule;
        this.f$1 = promise;
    }

    public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        RNIapModule$acknowledgePurchase$1.invoke$lambda$0(this.f$0, this.f$1, billingResult);
    }
}
