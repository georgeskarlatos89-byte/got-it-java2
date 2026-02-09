package com.facebook.appevents.iap;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001dj\b\u0012\u0004\u0012\u00020\u0004`\u001e2\u0006\u0010\u001f\u001a\u00020\rH\u0002J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010!\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseActivityLifecycleTracker;", "", "()V", "BILLING_ACTIVITY_NAME", "", "SERVICE_INTERFACE_NAME", "TAG", "kotlin.jvm.PlatformType", "billingClientVersion", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "callbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "hasBillingActivity", "", "Ljava/lang/Boolean;", "hasBillingService", "inAppBillingObj", "intent", "Landroid/content/Intent;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "serviceConnection", "Landroid/content/ServiceConnection;", "initializeIfNotInitialized", "", "logPurchase", "context", "Landroid/content/Context;", "purchases", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isSubscription", "startIapLogging", "startTracking", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
public final class InAppPurchaseActivityLifecycleTracker {
    private static final String BILLING_ACTIVITY_NAME = "com.android.billingclient.api.ProxyBillingActivity";
    public static final InAppPurchaseActivityLifecycleTracker INSTANCE = new InAppPurchaseActivityLifecycleTracker();
    private static final String SERVICE_INTERFACE_NAME = "com.android.vending.billing.IInAppBillingService$Stub";
    private static final String TAG = InAppPurchaseActivityLifecycleTracker.class.getCanonicalName();
    private static InAppPurchaseUtils.BillingClientVersion billingClientVersion;
    private static Application.ActivityLifecycleCallbacks callbacks;
    /* access modifiers changed from: private */
    public static Boolean hasBillingActivity;
    private static Boolean hasBillingService;
    /* access modifiers changed from: private */
    public static Object inAppBillingObj;
    private static Intent intent;
    private static final AtomicBoolean isTracking = new AtomicBoolean(false);
    private static ServiceConnection serviceConnection;

    private InAppPurchaseActivityLifecycleTracker() {
    }

    @JvmStatic
    public static final void startIapLogging(InAppPurchaseUtils.BillingClientVersion billingClientVersion2) {
        Intrinsics.checkNotNullParameter(billingClientVersion2, "billingClientVersion");
        InAppPurchaseActivityLifecycleTracker inAppPurchaseActivityLifecycleTracker = INSTANCE;
        inAppPurchaseActivityLifecycleTracker.initializeIfNotInitialized();
        if (!Intrinsics.areEqual((Object) hasBillingService, (Object) false) && AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled()) {
            billingClientVersion = billingClientVersion2;
            inAppPurchaseActivityLifecycleTracker.startTracking();
        }
    }

    private final void initializeIfNotInitialized() {
        if (hasBillingService == null) {
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(InAppPurchaseUtils.getClass(SERVICE_INTERFACE_NAME) != null);
            hasBillingService = valueOf;
            if (!Intrinsics.areEqual((Object) valueOf, (Object) false)) {
                if (InAppPurchaseUtils.getClass(BILLING_ACTIVITY_NAME) == null) {
                    z = false;
                }
                hasBillingActivity = Boolean.valueOf(z);
                InAppPurchaseEventManager.clearSkuDetailsCache();
                Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                Intrinsics.checkNotNullExpressionValue(intent2, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                intent = intent2;
                serviceConnection = new InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$1();
                callbacks = new InAppPurchaseActivityLifecycleTracker$initializeIfNotInitialized$2();
            }
        }
    }

    private final void startTracking() {
        if (isTracking.compareAndSet(false, true)) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                ServiceConnection serviceConnection2 = null;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent2 = intent;
                if (intent2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(SDKConstants.PARAM_INTENT);
                    intent2 = null;
                }
                ServiceConnection serviceConnection3 = serviceConnection;
                if (serviceConnection3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("serviceConnection");
                } else {
                    serviceConnection2 = serviceConnection3;
                }
                applicationContext.bindService(intent2, serviceConnection2, 1);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void logPurchase(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString("productId");
                    Intrinsics.checkNotNullExpressionValue(string, "sku");
                    Intrinsics.checkNotNullExpressionValue(next, FirebaseAnalytics.Event.PURCHASE);
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(TAG, "Error parsing in-app purchase data.", e);
                }
            }
            for (Map.Entry next2 : InAppPurchaseEventManager.getSkuDetails(context, arrayList2, inAppBillingObj, z).entrySet()) {
                String str = (String) next2.getValue();
                String str2 = (String) hashMap.get((String) next2.getKey());
                if (str2 != null) {
                    AutomaticAnalyticsLogger.logPurchase$default(str2, str, z, billingClientVersion, false, 16, (Object) null);
                }
            }
        }
    }
}
