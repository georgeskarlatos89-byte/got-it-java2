package com.dooboolab.rniap;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.facebook.react.bridge.Promise;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$sendUnconsumedPurchases$1$$ExternalSyntheticLambda0 implements PurchasesResponseListener {
    public final /* synthetic */ RNIapModule f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ RNIapModule$sendUnconsumedPurchases$1$$ExternalSyntheticLambda0(RNIapModule rNIapModule, Promise promise) {
        this.f$0 = rNIapModule;
        this.f$1 = promise;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        RNIapModule$sendUnconsumedPurchases$1.invoke$lambda$1(this.f$0, this.f$1, billingResult, list);
    }
}
