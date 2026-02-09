package com.dooboolab.rniap;

import co.gotitapp.android.modules.country.CountryPickerActivity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$consumeProduct$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ ConsumeParams $params;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ RNIapModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$consumeProduct$1(ConsumeParams consumeParams, RNIapModule rNIapModule, Promise promise) {
        super(1);
        this.$params = consumeParams;
        this.this$0 = rNIapModule;
        this.$promise = promise;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BillingClient billingClient) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        billingClient.consumeAsync(this.$params, new RNIapModule$consumeProduct$1$$ExternalSyntheticLambda0(this.this$0, this.$promise));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$0(RNIapModule rNIapModule, Promise promise, BillingResult billingResult, String str) {
        Intrinsics.checkNotNullParameter(rNIapModule, "this$0");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (rNIapModule.isValidResult(billingResult, promise)) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("responseCode", billingResult.getResponseCode());
            createMap.putString("debugMessage", billingResult.getDebugMessage());
            BillingResponse billingResponseData = PlayUtils.INSTANCE.getBillingResponseData(billingResult.getResponseCode());
            createMap.putString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA, billingResponseData.getCode());
            createMap.putString("message", billingResponseData.getMessage());
            createMap.putString("purchaseToken", str);
            PromiseUtlisKt.safeResolve(promise, createMap);
        }
    }
}
