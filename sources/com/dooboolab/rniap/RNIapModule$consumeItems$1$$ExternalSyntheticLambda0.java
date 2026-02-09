package com.dooboolab.rniap;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.facebook.react.bridge.Promise;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$consumeItems$1$$ExternalSyntheticLambda0 implements ConsumeResponseListener {
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ RNIapModule$consumeItems$1$$ExternalSyntheticLambda0(int i, Promise promise) {
        this.f$0 = i;
        this.f$1 = promise;
    }

    public final void onConsumeResponse(BillingResult billingResult, String str) {
        RNIapModule$consumeItems$1.invoke$lambda$0(this.f$0, this.f$1, billingResult, str);
    }
}
