package com.dooboolab.rniap;

import android.app.Activity;
import co.gotitapp.android.modules.country.CountryPickerActivity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$buyItemByType$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ boolean $isOfferPersonalized;
    final /* synthetic */ String $obfuscatedAccountId;
    final /* synthetic */ String $obfuscatedProfileId;
    final /* synthetic */ ReadableArray $offerTokenArr;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ int $replacementMode;
    final /* synthetic */ ReadableArray $skuArr;
    final /* synthetic */ String $type;
    final /* synthetic */ RNIapModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$buyItemByType$1(Promise promise, String str, ReadableArray readableArray, ReadableArray readableArray2, RNIapModule rNIapModule, boolean z, String str2, int i, String str3, String str4, Activity activity) {
        super(1);
        this.$promise = promise;
        this.$type = str;
        this.$skuArr = readableArray;
        this.$offerTokenArr = readableArray2;
        this.this$0 = rNIapModule;
        this.$isOfferPersonalized = z;
        this.$purchaseToken = str2;
        this.$replacementMode = i;
        this.$obfuscatedAccountId = str3;
        this.$obfuscatedProfileId = str4;
        this.$activity = activity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BillingClient billingClient) {
        int i;
        int i2;
        String string;
        BillingClient billingClient2 = billingClient;
        Intrinsics.checkNotNullParameter(billingClient2, "billingClient");
        PromiseUtils.INSTANCE.addPromiseForKey("PROMISE_BUY_ITEM", this.$promise);
        if (!Intrinsics.areEqual((Object) this.$type, (Object) "subs") || this.$skuArr.size() == this.$offerTokenArr.size()) {
            ArrayList<Object> arrayList = this.$skuArr.toArrayList();
            Intrinsics.checkNotNullExpressionValue(arrayList, "skuArr.toArrayList()");
            Iterable<Object> iterable = arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Object obj : iterable) {
                arrayList2.add(obj.toString());
            }
            Iterable iterable2 = (List) arrayList2;
            RNIapModule rNIapModule = this.this$0;
            Promise promise = this.$promise;
            String str = this.$type;
            ReadableArray readableArray = this.$offerTokenArr;
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            Iterator it = iterable2.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) next;
                Iterator it2 = it;
                ProductDetails productDetails = (ProductDetails) rNIapModule.skus.get(str2);
                if (productDetails == null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("debugMessage", "The sku was not found. Please fetch products first by calling getItems");
                    createMap.putString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA, "PROMISE_BUY_ITEM");
                    createMap.putString("message", "The sku was not found. Please fetch products first by calling getItems");
                    createMap.putString("productId", str2);
                    rNIapModule.sendEvent(rNIapModule.reactContext, "purchase-error", createMap);
                    PromiseUtlisKt.safeReject(promise, "PROMISE_BUY_ITEM", "The sku was not found. Please fetch products first by calling getItems");
                    return;
                }
                BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
                Intrinsics.checkNotNullExpressionValue(productDetails2, "newBuilder().setProductDetails(selectedSku)");
                if (Intrinsics.areEqual((Object) str, (Object) "subs") && (string = readableArray.getString(i3)) != null) {
                    productDetails2 = productDetails2.setOfferToken(string);
                    Intrinsics.checkNotNullExpressionValue(productDetails2, "productDetailParams.setOfferToken(offerToken)");
                }
                arrayList3.add(productDetails2.build());
                it = it2;
                i3 = i4;
            }
            BillingFlowParams.Builder newBuilder = BillingFlowParams.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
            newBuilder.setProductDetailsParamsList((List) arrayList3).setIsOfferPersonalized(this.$isOfferPersonalized);
            BillingFlowParams.SubscriptionUpdateParams.Builder newBuilder2 = BillingFlowParams.SubscriptionUpdateParams.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
            String str3 = this.$purchaseToken;
            if (str3 != null) {
                newBuilder2.setOldPurchaseToken(str3);
                if (Intrinsics.areEqual((Object) this.$type, (Object) "subs") && (i = this.$replacementMode) != -1) {
                    int i5 = 1;
                    if (i != 1) {
                        i5 = 2;
                        if (i != 2) {
                            i5 = 3;
                            if (i != 3) {
                                i5 = 5;
                                if (i != 5) {
                                    i5 = 6;
                                    if (i != 6) {
                                        i2 = 0;
                                        newBuilder2.setSubscriptionReplacementMode(i2);
                                    }
                                }
                            }
                        }
                    }
                    i2 = i5;
                    newBuilder2.setSubscriptionReplacementMode(i2);
                }
                BillingFlowParams.SubscriptionUpdateParams build = newBuilder2.build();
                Intrinsics.checkNotNullExpressionValue(build, "subscriptionUpdateParamsBuilder.build()");
                newBuilder.setSubscriptionUpdateParams(build);
            }
            String str4 = this.$obfuscatedAccountId;
            if (str4 != null) {
                newBuilder.setObfuscatedAccountId(str4);
            }
            String str5 = this.$obfuscatedProfileId;
            if (str5 != null) {
                newBuilder.setObfuscatedProfileId(str5);
            }
            BillingFlowParams build2 = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build2, "builder.build()");
            int responseCode = billingClient2.launchBillingFlow(this.$activity, build2).getResponseCode();
            if (responseCode != 0) {
                BillingResponse billingResponseData = PlayUtils.INSTANCE.getBillingResponseData(responseCode);
                PromiseUtlisKt.safeReject(this.$promise, billingResponseData.getCode(), billingResponseData.getMessage());
                return;
            }
            return;
        }
        String str6 = "The number of skus (" + this.$skuArr.size() + ") must match: the number of offerTokens (" + this.$offerTokenArr.size() + ") for Subscriptions";
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("debugMessage", str6);
        createMap2.putString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA, "PROMISE_BUY_ITEM");
        createMap2.putString("message", str6);
        RNIapModule rNIapModule2 = this.this$0;
        rNIapModule2.sendEvent(rNIapModule2.reactContext, "purchase-error", createMap2);
        PromiseUtlisKt.safeReject(this.$promise, "PROMISE_BUY_ITEM", str6);
    }
}
