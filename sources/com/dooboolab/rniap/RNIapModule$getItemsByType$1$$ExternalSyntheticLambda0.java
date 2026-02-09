package com.dooboolab.rniap;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.facebook.react.bridge.Promise;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RNIapModule$getItemsByType$1$$ExternalSyntheticLambda0 implements ProductDetailsResponseListener {
    public final /* synthetic */ RNIapModule f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ RNIapModule$getItemsByType$1$$ExternalSyntheticLambda0(RNIapModule rNIapModule, Promise promise) {
        this.f$0 = rNIapModule;
        this.f$1 = promise;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        RNIapModule$getItemsByType$1.invoke$lambda$10(this.f$0, this.f$1, billingResult, list);
    }
}
