package com.dooboolab.rniap;

import android.util.Log;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/dooboolab/rniap/RNIapModule$initConnection$1$1", "Lcom/android/billingclient/api/BillingClientStateListener;", "onBillingServiceDisconnected", "", "onBillingSetupFinished", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "react-native-iap_playRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
public final class RNIapModule$initConnection$1$1 implements BillingClientStateListener {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ RNIapModule this$0;

    RNIapModule$initConnection$1$1(RNIapModule rNIapModule, Promise promise) {
        this.this$0 = rNIapModule;
        this.$promise = promise;
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (this.this$0.isValidResult(billingResult, this.$promise)) {
            PromiseUtlisKt.safeResolve(this.$promise, true);
        }
    }

    public void onBillingServiceDisconnected() {
        Log.i(RNIapModule.TAG, "Billing service disconnected");
    }
}
