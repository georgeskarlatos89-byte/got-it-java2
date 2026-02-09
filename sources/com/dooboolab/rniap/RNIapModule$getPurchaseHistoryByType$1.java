package com.dooboolab.rniap;

import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$getPurchaseHistoryByType$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $type;
    final /* synthetic */ RNIapModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$getPurchaseHistoryByType$1(String str, RNIapModule rNIapModule, Promise promise) {
        super(1);
        this.$type = str;
        this.this$0 = rNIapModule;
        this.$promise = promise;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BillingClient billingClient) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        QueryPurchaseHistoryParams.Builder newBuilder = QueryPurchaseHistoryParams.newBuilder();
        String str = "subs";
        if (!Intrinsics.areEqual((Object) this.$type, (Object) str)) {
            str = "inapp";
        }
        billingClient.queryPurchaseHistoryAsync(newBuilder.setProductType(str).build(), (PurchaseHistoryResponseListener) new RNIapModule$getPurchaseHistoryByType$1$$ExternalSyntheticLambda0(this.this$0, this.$promise));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$2(RNIapModule rNIapModule, Promise promise, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(rNIapModule, "this$0");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (rNIapModule.isValidResult(billingResult, promise)) {
            Log.d(RNIapModule.TAG, String.valueOf(list));
            WritableArray createArray = Arguments.createArray();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("productId", purchaseHistoryRecord.getProducts().get(0));
                    WritableArray createArray2 = Arguments.createArray();
                    List<String> products = purchaseHistoryRecord.getProducts();
                    Intrinsics.checkNotNullExpressionValue(products, "purchase.products");
                    for (String pushString : products) {
                        createArray2.pushString(pushString);
                    }
                    createMap.putArray("productIds", createArray2);
                    createMap.putDouble("transactionDate", (double) purchaseHistoryRecord.getPurchaseTime());
                    createMap.putString("transactionReceipt", purchaseHistoryRecord.getOriginalJson());
                    createMap.putString("purchaseToken", purchaseHistoryRecord.getPurchaseToken());
                    createMap.putString("dataAndroid", purchaseHistoryRecord.getOriginalJson());
                    createMap.putString("signatureAndroid", purchaseHistoryRecord.getSignature());
                    String developerPayload = purchaseHistoryRecord.getDeveloperPayload();
                    if (developerPayload == null) {
                        developerPayload = "";
                    }
                    createMap.putString(SDKConstants.PARAM_DEVELOPER_PAYLOAD, developerPayload);
                    createArray.pushMap(createMap);
                }
            }
            PromiseUtlisKt.safeResolve(promise, createArray);
        }
    }
}
