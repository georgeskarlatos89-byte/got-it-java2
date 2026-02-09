package com.dooboolab.rniap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.facebook.appevents.internal.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
final class RNIapModule$getItemsByType$1 extends Lambda implements Function1<BillingClient, Unit> {
    final /* synthetic */ Promise $promise;
    final /* synthetic */ ReadableArray $skuArr;
    final /* synthetic */ String $type;
    final /* synthetic */ RNIapModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RNIapModule$getItemsByType$1(ReadableArray readableArray, Promise promise, String str, RNIapModule rNIapModule) {
        super(1);
        this.$skuArr = readableArray;
        this.$promise = promise;
        this.$type = str;
        this.this$0 = rNIapModule;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BillingClient) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(BillingClient billingClient) {
        String string;
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        List arrayList = new ArrayList();
        int size = this.$skuArr.size();
        for (int i = 0; i < size; i++) {
            if (this.$skuArr.getType(i) == ReadableType.String && (string = this.$skuArr.getString(i)) != null) {
                QueryProductDetailsParams.Product build = QueryProductDetailsParams.Product.newBuilder().setProductId(string).setProductType(this.$type).build();
                Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
                arrayList.add(build);
            }
        }
        if (arrayList.isEmpty()) {
            PromiseUtlisKt.safeReject(this.$promise, "EMPTY_SKU_LIST", "The SKU list is empty.");
            return;
        }
        QueryProductDetailsParams build2 = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        Intrinsics.checkNotNullExpressionValue(build2, "newBuilder()\n           …                 .build()");
        billingClient.queryProductDetailsAsync(build2, new RNIapModule$getItemsByType$1$$ExternalSyntheticLambda0(this.this$0, this.$promise));
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$10(RNIapModule rNIapModule, Promise promise, BillingResult billingResult, List list) {
        RNIapModule rNIapModule2 = rNIapModule;
        Promise promise2 = promise;
        BillingResult billingResult2 = billingResult;
        Intrinsics.checkNotNullParameter(rNIapModule2, "this$0");
        Intrinsics.checkNotNullParameter(promise2, "$promise");
        Intrinsics.checkNotNullParameter(billingResult2, "billingResult");
        Intrinsics.checkNotNullParameter(list, "skuDetailsList");
        if (rNIapModule2.isValidResult(billingResult2, promise2)) {
            WritableArray createArray = Arguments.createArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductDetails productDetails = (ProductDetails) it.next();
                Map access$getSkus$p = rNIapModule.skus;
                String productId = productDetails.getProductId();
                Intrinsics.checkNotNullExpressionValue(productId, "skuDetails.productId");
                Intrinsics.checkNotNullExpressionValue(productDetails, "skuDetails");
                access$getSkus$p.put(productId, productDetails);
                WritableMap createMap = Arguments.createMap();
                createMap.putString("productId", productDetails.getProductId());
                createMap.putString("title", productDetails.getTitle());
                createMap.putString("description", productDetails.getDescription());
                createMap.putString("productType", productDetails.getProductType());
                createMap.putString("name", productDetails.getName());
                ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                if (oneTimePurchaseOfferDetails != null) {
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7, oneTimePurchaseOfferDetails.getPriceCurrencyCode());
                    createMap2.putString("formattedPrice", oneTimePurchaseOfferDetails.getFormattedPrice());
                    createMap2.putString(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7, String.valueOf(oneTimePurchaseOfferDetails.getPriceAmountMicros()));
                    createMap.putMap(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS, createMap2);
                }
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
                if (subscriptionOfferDetails != null) {
                    WritableArray createArray2 = Arguments.createArray();
                    for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 : subscriptionOfferDetails) {
                        WritableMap createMap3 = Arguments.createMap();
                        createMap3.putString(Constants.GP_IAP_BASE_PLAN_ID, subscriptionOfferDetails2.getBasePlanId());
                        createMap3.putString(Constants.GP_IAP_OFFER_ID, subscriptionOfferDetails2.getOfferId());
                        createMap3.putString("offerToken", subscriptionOfferDetails2.getOfferToken());
                        WritableArray createArray3 = Arguments.createArray();
                        List<String> offerTags = subscriptionOfferDetails2.getOfferTags();
                        Intrinsics.checkNotNullExpressionValue(offerTags, "subscriptionOfferDetailsItem.offerTags");
                        for (String pushString : offerTags) {
                            createArray3.pushString(pushString);
                        }
                        createMap3.putArray("offerTags", createArray3);
                        WritableArray createArray4 = Arguments.createArray();
                        List<ProductDetails.PricingPhase> pricingPhaseList = subscriptionOfferDetails2.getPricingPhases().getPricingPhaseList();
                        Intrinsics.checkNotNullExpressionValue(pricingPhaseList, "subscriptionOfferDetails…ngPhases.pricingPhaseList");
                        for (ProductDetails.PricingPhase pricingPhase : pricingPhaseList) {
                            WritableMap createMap4 = Arguments.createMap();
                            createMap4.putString("formattedPrice", pricingPhase.getFormattedPrice());
                            createMap4.putString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7, pricingPhase.getPriceCurrencyCode());
                            createMap4.putString(Constants.GP_IAP_BILLING_PERIOD, pricingPhase.getBillingPeriod());
                            createMap4.putInt("billingCycleCount", pricingPhase.getBillingCycleCount());
                            createMap4.putString(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7, String.valueOf(pricingPhase.getPriceAmountMicros()));
                            createMap4.putInt(Constants.GP_IAP_RECURRENCE_MODE, pricingPhase.getRecurrenceMode());
                            createArray4.pushMap(createMap4);
                            RNIapModule rNIapModule3 = rNIapModule;
                        }
                        WritableMap createMap5 = Arguments.createMap();
                        createMap5.putArray("pricingPhaseList", createArray4);
                        createMap3.putMap(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES, createMap5);
                        createArray2.pushMap(createMap3);
                        RNIapModule rNIapModule4 = rNIapModule;
                    }
                    createMap.putArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS, createArray2);
                }
                createArray.pushMap(createMap);
                RNIapModule rNIapModule5 = rNIapModule;
            }
            PromiseUtlisKt.safeResolve(promise2, createArray);
        }
    }
}
