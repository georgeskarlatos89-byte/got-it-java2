package com.dooboolab.rniap;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.facebook.react.bridge.Promise;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$getPurchaseHistoryByType$1$$ExternalSyntheticLambda0 implements PurchaseHistoryResponseListener {
    public final /* synthetic */ RNIapModule f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ RNIapModule$getPurchaseHistoryByType$1$$ExternalSyntheticLambda0(RNIapModule rNIapModule, Promise promise) {
        this.f$0 = rNIapModule;
        this.f$1 = promise;
    }

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        RNIapModule$getPurchaseHistoryByType$1.invoke$lambda$2(this.f$0, this.f$1, billingResult, list);
    }
}
