package com.dooboolab.rniap;

import android.app.Activity;
import android.util.Log;
import co.gotitapp.android.modules.country.CountryPickerActivity;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.braintreepayments.api.AnalyticsClient;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001HB!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0007JV\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J(\u0010$\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010(\u001a\u00020\u001eH\u0002J\"\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J1\u0010+\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00110-J\u0010\u00101\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u00102\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u00103\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u00104\u001a\u00020\u000eH\u0016J\u0010\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u00106\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u00107\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u00108\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010>\u001a\u00020\u00112\u0006\u0010<\u001a\u00020=2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0016J\u0010\u0010?\u001a\u00020\u00112\u0006\u0010@\u001a\u00020AH\u0007J\"\u0010B\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020C2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010D\u001a\u0004\u0018\u00010EH\u0002J\u0010\u0010F\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010G\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/dooboolab/rniap/RNIapModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "builder", "Lcom/android/billingclient/api/BillingClient$Builder;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/android/billingclient/api/BillingClient$Builder;Lcom/google/android/gms/common/GoogleApiAvailability;)V", "billingClientCache", "Lcom/android/billingclient/api/BillingClient;", "skus", "", "", "Lcom/android/billingclient/api/ProductDetails;", "acknowledgePurchase", "", "token", "developerPayLoad", "promise", "Lcom/facebook/react/bridge/Promise;", "addListener", "eventName", "buyItemByType", "type", "skuArr", "Lcom/facebook/react/bridge/ReadableArray;", "purchaseToken", "replacementMode", "", "obfuscatedAccountId", "obfuscatedProfileId", "offerTokenArr", "isOfferPersonalized", "", "consumeItems", "purchases", "", "Lcom/android/billingclient/api/Purchase;", "expectedResponseCode", "consumeProduct", "endConnection", "ensureConnection", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "billingClient", "flushFailedPurchasesCachedAsPending", "getAvailableItemsByType", "getItemsByType", "getName", "getPackageName", "getPurchaseHistoryByType", "getStorefront", "initConnection", "isFeatureSupported", "feature", "isValidResult", "billingResult", "Lcom/android/billingclient/api/BillingResult;", "onPurchasesUpdated", "removeListeners", "count", "", "sendEvent", "Lcom/facebook/react/bridge/ReactContext;", "params", "Lcom/facebook/react/bridge/WritableMap;", "sendUnconsumedPurchases", "startListening", "Companion", "react-native-iap_playRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ReactModule(name = "RNIapModule")
/* compiled from: RNIapModule.kt */
public final class RNIapModule extends ReactContextBaseJavaModule implements PurchasesUpdatedListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String PROMISE_BUY_ITEM = "PROMISE_BUY_ITEM";
    public static final String TAG = "RNIapModule";
    /* access modifiers changed from: private */
    public BillingClient billingClientCache;
    private final BillingClient.Builder builder;
    private final GoogleApiAvailability googleApiAvailability;
    /* access modifiers changed from: private */
    public final ReactApplicationContext reactContext;
    /* access modifiers changed from: private */
    public final Map<String, ProductDetails> skus;

    @ReactMethod
    public final void addListener(String str) {
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
    }

    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void removeListeners(double d) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RNIapModule(com.facebook.react.bridge.ReactApplicationContext r1, com.android.billingclient.api.BillingClient.Builder r2, com.google.android.gms.common.GoogleApiAvailability r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0014
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            com.android.billingclient.api.BillingClient$Builder r2 = com.android.billingclient.api.BillingClient.newBuilder(r2)
            com.android.billingclient.api.BillingClient$Builder r2 = r2.enablePendingPurchases()
            java.lang.String r5 = "newBuilder(reactContext).enablePendingPurchases()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
        L_0x0014:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0021
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            java.lang.String r4 = "getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L_0x0021:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dooboolab.rniap.RNIapModule.<init>(com.facebook.react.bridge.ReactApplicationContext, com.android.billingclient.api.BillingClient$Builder, com.google.android.gms.common.GoogleApiAvailability, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RNIapModule(ReactApplicationContext reactApplicationContext, BillingClient.Builder builder2, GoogleApiAvailability googleApiAvailability2) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactContext");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        Intrinsics.checkNotNullParameter(googleApiAvailability2, "googleApiAvailability");
        this.reactContext = reactApplicationContext;
        this.builder = builder2;
        this.googleApiAvailability = googleApiAvailability2;
        this.skus = new LinkedHashMap();
        reactApplicationContext.addLifecycleEventListener(new RNIapModule$lifecycleEventListener$1(this));
    }

    public final void ensureConnection(Promise promise, Function1<? super BillingClient, Unit> function1) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Intrinsics.checkNotNullParameter(function1, "callback");
        BillingClient billingClient = this.billingClientCache;
        boolean z = false;
        if (billingClient != null && billingClient.isReady()) {
            z = true;
        }
        if (z) {
            function1.invoke(billingClient);
        } else {
            initConnection(new PromiseImpl(new RNIapModule$$ExternalSyntheticLambda0(this, function1, promise), new RNIapModule$$ExternalSyntheticLambda1(promise)));
        }
    }

    /* access modifiers changed from: private */
    public static final void ensureConnection$lambda$0(RNIapModule rNIapModule, Function1 function1, Promise promise, Object[] objArr) {
        Intrinsics.checkNotNullParameter(rNIapModule, "this$0");
        Intrinsics.checkNotNullParameter(function1, "$callback");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullExpressionValue(objArr, "it");
        boolean z = true;
        if (!(objArr.length == 0)) {
            Boolean bool = objArr[0];
            if (bool instanceof Boolean) {
                Intrinsics.checkNotNull(bool, "null cannot be cast to non-null type kotlin.Boolean");
                if (bool.booleanValue()) {
                    BillingClient billingClient = rNIapModule.billingClientCache;
                    if (billingClient == null || !billingClient.isReady()) {
                        z = false;
                    }
                    if (z) {
                        function1.invoke(billingClient);
                        return;
                    } else {
                        PromiseUtlisKt.safeReject(promise, PromiseUtils.E_NOT_PREPARED, "Unable to auto-initialize connection");
                        return;
                    }
                }
            }
        }
        PromiseUtlisKt.safeReject(promise, PromiseUtils.E_UNKNOWN, "ensureConnection - incorrect parameter in resolve");
        Log.i(TAG, "Incorrect parameter in resolve");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ensureConnection$lambda$1(com.facebook.react.bridge.Promise r4, java.lang.Object[] r5) {
        /*
            java.lang.String r0 = "$promise"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L_0x0025
            r0 = r5[r1]
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x0025
            r3 = r5[r2]
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x0025
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r5 = r5[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x004f
        L_0x0025:
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            int r0 = r5.length
            if (r0 != 0) goto L_0x002f
            r0 = r2
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x004d
            r5 = r5[r1]
            boolean r0 = r5 instanceof com.facebook.react.bridge.WritableNativeMap
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.react.bridge.WritableNativeMap"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            com.facebook.react.bridge.WritableNativeMap r5 = (com.facebook.react.bridge.WritableNativeMap) r5
            java.lang.String r0 = "code"
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "message"
            java.lang.String r5 = r5.getString(r1)
            goto L_0x004f
        L_0x004d:
            r0 = 0
            r5 = r0
        L_0x004f:
            if (r0 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0057
            com.dooboolab.rniap.PromiseUtlisKt.safeReject((com.facebook.react.bridge.Promise) r4, (java.lang.String) r0, (java.lang.String) r5)
            goto L_0x0065
        L_0x0057:
            java.lang.String r5 = "E_UNKNOWN"
            java.lang.String r0 = "ensureConnection - incorrect parameter in reject"
            com.dooboolab.rniap.PromiseUtlisKt.safeReject((com.facebook.react.bridge.Promise) r4, (java.lang.String) r5, (java.lang.String) r0)
            java.lang.String r4 = "RNIapModule"
            java.lang.String r5 = "Incorrect parameters in reject"
            android.util.Log.i(r4, r5)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dooboolab.rniap.RNIapModule.ensureConnection$lambda$1(com.facebook.react.bridge.Promise, java.lang.Object[]):void");
    }

    @ReactMethod
    public final void isFeatureSupported(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(str, "feature");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new RNIapModule$isFeatureSupported$1(str, promise));
    }

    @ReactMethod
    public final void initConnection(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (this.googleApiAvailability.isGooglePlayServicesAvailable(this.reactContext) != 0) {
            Log.i(TAG, "Google Play Services are not available on this device");
            PromiseUtlisKt.safeReject(promise, PromiseUtils.E_NOT_PREPARED, "Google Play Services are not available on this device");
            return;
        }
        BillingClient billingClient = this.billingClientCache;
        boolean z = false;
        if (billingClient != null && billingClient.isReady()) {
            z = true;
        }
        if (z) {
            Log.i(TAG, "Already initialized, you should only call initConnection() once when your app starts");
            PromiseUtlisKt.safeResolve(promise, true);
            return;
        }
        BillingClient build = this.builder.setListener(this).build();
        this.billingClientCache = build;
        build.startConnection(new RNIapModule$initConnection$1$1(this, promise));
    }

    @ReactMethod
    public final void endConnection(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        BillingClient billingClient = this.billingClientCache;
        if (billingClient != null) {
            billingClient.endConnection();
        }
        this.billingClientCache = null;
        this.skus.clear();
        PromiseUtils.INSTANCE.rejectAllPendingPromises();
        PromiseUtlisKt.safeResolve(promise, true);
    }

    static /* synthetic */ void consumeItems$default(RNIapModule rNIapModule, List list, Promise promise, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        rNIapModule.consumeItems(list, promise, i);
    }

    /* access modifiers changed from: private */
    public final void consumeItems(List<? extends Purchase> list, Promise promise, int i) {
        for (Purchase rNIapModule$consumeItems$1 : list) {
            ensureConnection(promise, new RNIapModule$consumeItems$1(rNIapModule$consumeItems$1, i, promise));
        }
    }

    @ReactMethod
    public final void flushFailedPurchasesCachedAsPending(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new RNIapModule$flushFailedPurchasesCachedAsPending$1(this, promise));
    }

    @ReactMethod
    public final void getItemsByType(String str, ReadableArray readableArray, Promise promise) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(readableArray, "skuArr");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new RNIapModule$getItemsByType$1(readableArray, promise, str, this));
    }

    /* access modifiers changed from: private */
    public final boolean isValidResult(BillingResult billingResult, Promise promise) {
        Log.d(TAG, "responseCode: " + billingResult.getResponseCode());
        if (billingResult.getResponseCode() == 0) {
            return true;
        }
        PlayUtils.INSTANCE.rejectPromiseWithBillingError(promise, billingResult.getResponseCode());
        return false;
    }

    @ReactMethod
    public final void getAvailableItemsByType(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new RNIapModule$getAvailableItemsByType$1(str, this, promise));
    }

    @ReactMethod
    public final void getPurchaseHistoryByType(String str, Promise promise) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new RNIapModule$getPurchaseHistoryByType$1(str, this, promise));
    }

    @ReactMethod
    public final void buyItemByType(String str, ReadableArray readableArray, String str2, int i, String str3, String str4, ReadableArray readableArray2, boolean z, Promise promise) {
        Promise promise2 = promise;
        String str5 = str;
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(readableArray, "skuArr");
        Intrinsics.checkNotNullParameter(readableArray2, "offerTokenArr");
        Intrinsics.checkNotNullParameter(promise2, BaseJavaModule.METHOD_TYPE_PROMISE);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            PromiseUtlisKt.safeReject(promise2, PromiseUtils.E_UNKNOWN, "getCurrentActivity returned null");
            return;
        }
        ensureConnection(promise2, new RNIapModule$buyItemByType$1(promise, str, readableArray, readableArray2, this, z, str2, i, str3, str4, currentActivity));
    }

    @ReactMethod
    public final void acknowledgePurchase(String str, String str2, Promise promise) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new RNIapModule$acknowledgePurchase$1(str, this, promise));
    }

    @ReactMethod
    public final void consumeProduct(String str, String str2, Promise promise) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder().setPurchaseToken(token).build()");
        ensureConnection(promise, new RNIapModule$consumeProduct$1(build, this, promise));
    }

    public void onPurchasesUpdated(BillingResult billingResult, List<? extends Purchase> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 0) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("responseCode", responseCode);
            createMap.putString("debugMessage", billingResult.getDebugMessage());
            BillingResponse billingResponseData = PlayUtils.INSTANCE.getBillingResponseData(responseCode);
            createMap.putString(CountryPickerActivity.COUNTRY_PICKER_CODE_EXTRA, billingResponseData.getCode());
            createMap.putString("message", billingResponseData.getMessage());
            sendEvent(this.reactContext, "purchase-error", createMap);
            PlayUtils.INSTANCE.rejectPromisesWithBillingError(PROMISE_BUY_ITEM, responseCode);
        } else if (list != null) {
            WritableArray createArray = Arguments.createArray();
            Intrinsics.checkNotNullExpressionValue(createArray, "createArray()");
            for (Purchase purchase : list) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("productId", purchase.getProducts().get(0));
                WritableArray createArray2 = Arguments.createArray();
                List<String> products = purchase.getProducts();
                Intrinsics.checkNotNullExpressionValue(products, "purchase.products");
                for (String pushString : products) {
                    createArray2.pushString(pushString);
                }
                createMap2.putArray("productIds", createArray2);
                createMap2.putString("transactionId", purchase.getOrderId());
                createMap2.putDouble("transactionDate", (double) purchase.getPurchaseTime());
                createMap2.putString("transactionReceipt", purchase.getOriginalJson());
                createMap2.putString("purchaseToken", purchase.getPurchaseToken());
                createMap2.putString("dataAndroid", purchase.getOriginalJson());
                createMap2.putString("signatureAndroid", purchase.getSignature());
                createMap2.putBoolean("autoRenewingAndroid", purchase.isAutoRenewing());
                createMap2.putBoolean("isAcknowledgedAndroid", purchase.isAcknowledged());
                createMap2.putInt("purchaseStateAndroid", purchase.getPurchaseState());
                createMap2.putString("packageNameAndroid", purchase.getPackageName());
                createMap2.putString("developerPayloadAndroid", purchase.getDeveloperPayload());
                AccountIdentifiers accountIdentifiers = purchase.getAccountIdentifiers();
                if (accountIdentifiers != null) {
                    createMap2.putString("obfuscatedAccountIdAndroid", accountIdentifiers.getObfuscatedAccountId());
                    createMap2.putString("obfuscatedProfileIdAndroid", accountIdentifiers.getObfuscatedProfileId());
                }
                createArray.pushMap(createMap2.copy());
                sendEvent(this.reactContext, "purchase-updated", createMap2);
            }
            PromiseUtils.INSTANCE.resolvePromisesForKey(PROMISE_BUY_ITEM, createArray);
        } else {
            WritableMap createMap3 = Arguments.createMap();
            createMap3.putInt("responseCode", billingResult.getResponseCode());
            createMap3.putString("debugMessage", billingResult.getDebugMessage());
            createMap3.putString("extraMessage", "The purchases are null. This is a normal behavior if you have requested DEFERRED proration. If not please report an issue.");
            sendEvent(this.reactContext, "purchase-updated", createMap3);
            PromiseUtils.INSTANCE.resolvePromisesForKey(PROMISE_BUY_ITEM, (Object) null);
        }
    }

    private final void sendUnconsumedPurchases(Promise promise) {
        ensureConnection(promise, new RNIapModule$sendUnconsumedPurchases$1(promise, this));
    }

    @ReactMethod
    public final void startListening(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        sendUnconsumedPurchases(promise);
    }

    @ReactMethod
    public final void getPackageName(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(getReactApplicationContext().getPackageName());
    }

    @ReactMethod
    public final void getStorefront(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        ensureConnection(promise, new RNIapModule$getStorefront$1(promise));
    }

    /* access modifiers changed from: private */
    public final void sendEvent(ReactContext reactContext2, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext2.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/dooboolab/rniap/RNIapModule$Companion;", "", "()V", "PROMISE_BUY_ITEM", "", "TAG", "react-native-iap_playRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: RNIapModule.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
