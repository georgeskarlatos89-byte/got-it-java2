package com.dooboolab.rniap;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$getAvailableItemsByType$1$$ExternalSyntheticLambda0 implements PurchasesResponseListener {
    public final /* synthetic */ RNIapModule f$0;
    public final /* synthetic */ Promise f$1;
    public final /* synthetic */ WritableNativeArray f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ RNIapModule$getAvailableItemsByType$1$$ExternalSyntheticLambda0(RNIapModule rNIapModule, Promise promise, WritableNativeArray writableNativeArray, String str) {
        this.f$0 = rNIapModule;
        this.f$1 = promise;
        this.f$2 = writableNativeArray;
        this.f$3 = str;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        RNIapModule$getAvailableItemsByType$1.invoke$lambda$2(this.f$0, this.f$1, this.f$2, this.f$3, billingResult, list);
    }
}
