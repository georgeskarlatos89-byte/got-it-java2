package com.dooboolab.rniap;

import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$getAvailableItemsByType$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $type;
    final /* synthetic */ RNIapModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$getAvailableItemsByType$1(String str, RNIapModule rNIapModule, Promise promise) {
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
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        QueryPurchasesParams.Builder newBuilder = QueryPurchasesParams.newBuilder();
        String str = "subs";
        if (!Intrinsics.areEqual((Object) this.$type, (Object) str)) {
            str = "inapp";
        }
        billingClient.queryPurchasesAsync(newBuilder.setProductType(str).build(), (PurchasesResponseListener) new RNIapModule$getAvailableItemsByType$1$$ExternalSyntheticLambda0(this.this$0, this.$promise, writableNativeArray, this.$type));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$2(RNIapModule rNIapModule, Promise promise, WritableNativeArray writableNativeArray, String str, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(rNIapModule, "this$0");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(writableNativeArray, "$items");
        Intrinsics.checkNotNullParameter(str, "$type");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        if (rNIapModule.isValidResult(billingResult, promise)) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("productId", purchase.getProducts().get(0));
                    WritableArray createArray = Arguments.createArray();
                    List<String> products = purchase.getProducts();
                    Intrinsics.checkNotNullExpressionValue(products, "purchase.products");
                    for (String pushString : products) {
                        createArray.pushString(pushString);
                    }
                    writableNativeMap.putArray("productIds", createArray);
                    writableNativeMap.putString("transactionId", purchase.getOrderId());
                    writableNativeMap.putDouble("transactionDate", (double) purchase.getPurchaseTime());
                    writableNativeMap.putString("transactionReceipt", purchase.getOriginalJson());
                    writableNativeMap.putString("orderId", purchase.getOrderId());
                    writableNativeMap.putString("purchaseToken", purchase.getPurchaseToken());
                    writableNativeMap.putString("developerPayloadAndroid", purchase.getDeveloperPayload());
                    writableNativeMap.putString("signatureAndroid", purchase.getSignature());
                    writableNativeMap.putInt("purchaseStateAndroid", purchase.getPurchaseState());
                    writableNativeMap.putBoolean("isAcknowledgedAndroid", purchase.isAcknowledged());
                    writableNativeMap.putString("packageNameAndroid", purchase.getPackageName());
                    AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                    String str2 = null;
                    writableNativeMap.putString("obfuscatedAccountIdAndroid", accountIdentifiers != null ? accountIdentifiers.getObfuscatedAccountId() : null);
                    AccountIdentifiers accountIdentifiers2 = purchase.getAccountIdentifiers();
                    if (accountIdentifiers2 != null) {
                        str2 = accountIdentifiers2.getObfuscatedProfileId();
                    }
                    writableNativeMap.putString("obfuscatedProfileIdAndroid", str2);
                    if (Intrinsics.areEqual((Object) str, (Object) "subs")) {
                        writableNativeMap.putBoolean("autoRenewingAndroid", purchase.isAutoRenewing());
                    }
                    writableNativeArray.pushMap(writableNativeMap);
                }
            }
            PromiseUtlisKt.safeResolve(promise, writableNativeArray);
        }
    }
}
