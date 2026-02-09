package com.dooboolab.rniap;

import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingResult;
import com.facebook.react.bridge.Promise;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$getStorefront$1$$ExternalSyntheticLambda0 implements BillingConfigResponseListener {
    public final /* synthetic */ Promise f$0;

    public /* synthetic */ RNIapModule$getStorefront$1$$ExternalSyntheticLambda0(Promise promise) {
        this.f$0 = promise;
    }

    public final void onBillingConfigResponse(BillingResult billingResult, BillingConfig billingConfig) {
        RNIapModule$getStorefront$1.invoke$lambda$0(this.f$0, billingResult, billingConfig);
    }
}
