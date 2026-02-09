package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.braintreepayments.api.AnalyticsClient;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchase;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001+B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J>\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J0\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J0\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J \u0010\u001e\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\b\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020#H\u0007J\u001a\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020'H\u0007J4\u0010(\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010)\u001a\u00020!2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010*\u001a\u00020!H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger;", "", "()V", "APP_EVENTS_IF_AUTO_LOG_SUBS", "", "TAG", "kotlin.jvm.PlatformType", "internalAppEventsLogger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "getPurchaseDedupeParameters", "Landroid/os/Bundle;", "purchaseLoggingParametersList", "", "Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "getPurchaseLoggingParameters", "purchase", "skuDetails", "billingClientVersion", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "extraParameter", "", "getPurchaseParametersGPBLV2V4", "type", "params", "operationalData", "Lcom/facebook/appevents/OperationalData;", "purchaseJSON", "Lorg/json/JSONObject;", "skuDetailsJSON", "getPurchaseParametersGPBLV5V7", "getSubscriptionDedupeParameters", "eventName", "isImplicitPurchaseLoggingEnabled", "", "logActivateAppEvent", "", "logActivityTimeSpentEvent", "activityName", "timeSpentInSeconds", "", "logPurchase", "isSubscription", "isFirstAppLaunch", "PurchaseLoggingParameters", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AutomaticAnalyticsLogger.kt */
public final class AutomaticAnalyticsLogger {
    private static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
    public static final AutomaticAnalyticsLogger INSTANCE = new AutomaticAnalyticsLogger();
    private static final String TAG = AutomaticAnalyticsLogger.class.getCanonicalName();
    private static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());

    private AutomaticAnalyticsLogger() {
    }

    @JvmStatic
    public static final void logActivateAppEvent() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        if (!FacebookSdk.getAutoLogAppEventsEnabled()) {
            return;
        }
        if (applicationContext instanceof Application) {
            AppEventsLogger.Companion.activateApp((Application) applicationContext, applicationId);
        } else {
            Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    @JvmStatic
    public static final void logActivityTimeSpentEvent(String str, long j) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
        if (queryAppSettings != null && queryAppSettings.getAutomaticLoggingEnabled() && j > 0) {
            InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(Constants.AA_TIME_SPENT_SCREEN_PARAMETER_NAME, str);
            internalAppEventsLogger2.logEvent(Constants.AA_TIME_SPENT_EVENT_NAME, (double) j, bundle);
        }
    }

    public static /* synthetic */ void logPurchase$default(String str, String str2, boolean z, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        logPurchase(str, str2, z, billingClientVersion, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd  */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void logPurchase(java.lang.String r8, java.lang.String r9, boolean r10, com.facebook.appevents.iap.InAppPurchaseUtils.BillingClientVersion r11, boolean r12) {
        /*
            java.lang.String r0 = "purchase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "skuDetails"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger r0 = INSTANCE
            boolean r1 = isImplicitPurchaseLoggingEnabled()
            if (r1 != 0) goto L_0x0013
            return
        L_0x0013:
            java.util.List r8 = r0.getPurchaseLoggingParameters(r8, r9, r11)
            if (r8 != 0) goto L_0x001a
            return
        L_0x001a:
            boolean r11 = r8.isEmpty()
            if (r11 == 0) goto L_0x0021
            return
        L_0x0021:
            r11 = 0
            if (r10 == 0) goto L_0x0032
            java.lang.String r0 = "app_events_if_auto_log_subs"
            java.lang.String r1 = com.facebook.FacebookSdk.getApplicationId()
            boolean r0 = com.facebook.internal.FetchedAppGateKeepersManager.getGateKeeperForKey(r0, r1, r11)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = r11
        L_0x0033:
            java.lang.String r1 = "fb_mobile_purchase"
            if (r0 == 0) goto L_0x004a
            if (r12 == 0) goto L_0x003c
            java.lang.String r9 = "SubscriptionRestore"
            goto L_0x004e
        L_0x003c:
            com.facebook.appevents.iap.InAppPurchaseEventManager r12 = com.facebook.appevents.iap.InAppPurchaseEventManager.INSTANCE
            boolean r9 = r12.hasFreeTrialPeirod(r9)
            if (r9 == 0) goto L_0x0047
            java.lang.String r9 = "StartTrial"
            goto L_0x004e
        L_0x0047:
            java.lang.String r9 = "Subscribe"
            goto L_0x004e
        L_0x004a:
            if (r12 == 0) goto L_0x0050
            java.lang.String r9 = "fb_mobile_purchase_restored"
        L_0x004e:
            r3 = r9
            goto L_0x0051
        L_0x0050:
            r3 = r1
        L_0x0051:
            if (r10 == 0) goto L_0x0060
            com.facebook.internal.FeatureManager$Feature r9 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitSubsDedupe
            boolean r9 = com.facebook.internal.FeatureManager.isEnabled(r9)
            if (r9 == 0) goto L_0x0060
            android.os.Bundle r9 = getSubscriptionDedupeParameters(r8, r3)
            goto L_0x0070
        L_0x0060:
            if (r10 != 0) goto L_0x006f
            com.facebook.internal.FeatureManager$Feature r9 = com.facebook.internal.FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe
            boolean r9 = com.facebook.internal.FeatureManager.isEnabled(r9)
            if (r9 == 0) goto L_0x006f
            android.os.Bundle r9 = getPurchaseDedupeParameters(r8)
            goto L_0x0070
        L_0x006f:
            r9 = 0
        L_0x0070:
            com.facebook.appevents.iap.InAppPurchaseDedupeConfig r10 = com.facebook.appevents.iap.InAppPurchaseDedupeConfig.INSTANCE
            java.lang.Object r12 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r12 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r12
            android.os.Bundle r12 = r12.getParam()
            java.lang.Object r0 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r0 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r0
            com.facebook.appevents.OperationalData r0 = r0.getOperationalData()
            r10.addDedupeParameters(r9, r12, r0)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)
            if (r9 != 0) goto L_0x00bd
            com.facebook.appevents.InternalAppEventsLogger r2 = internalAppEventsLogger
            java.lang.Object r9 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r9 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r9
            java.math.BigDecimal r4 = r9.getPurchaseAmount()
            java.lang.Object r9 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r9 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r9
            java.util.Currency r5 = r9.getCurrency()
            java.lang.Object r9 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r9 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r9
            android.os.Bundle r6 = r9.getParam()
            java.lang.Object r8 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r8 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r8
            com.facebook.appevents.OperationalData r7 = r8.getOperationalData()
            r2.logEventImplicitly(r3, r4, r5, r6, r7)
            goto L_0x00ea
        L_0x00bd:
            com.facebook.appevents.InternalAppEventsLogger r9 = internalAppEventsLogger
            java.lang.Object r10 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r10 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r10
            java.math.BigDecimal r10 = r10.getPurchaseAmount()
            java.lang.Object r12 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r12 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r12
            java.util.Currency r12 = r12.getCurrency()
            java.lang.Object r0 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r0 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r0
            android.os.Bundle r0 = r0.getParam()
            java.lang.Object r8 = r8.get(r11)
            com.facebook.appevents.internal.AutomaticAnalyticsLogger$PurchaseLoggingParameters r8 = (com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters) r8
            com.facebook.appevents.OperationalData r8 = r8.getOperationalData()
            r9.logPurchaseImplicitly(r10, r12, r0, r8)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.AutomaticAnalyticsLogger.logPurchase(java.lang.String, java.lang.String, boolean, com.facebook.appevents.iap.InAppPurchaseUtils$BillingClientVersion, boolean):void");
    }

    @JvmStatic
    public static final synchronized Bundle getPurchaseDedupeParameters(List<PurchaseLoggingParameters> list) {
        Bundle performDedupe;
        synchronized (AutomaticAnalyticsLogger.class) {
            Intrinsics.checkNotNullParameter(list, "purchaseLoggingParametersList");
            PurchaseLoggingParameters purchaseLoggingParameters = list.get(0);
            performDedupe = InAppPurchaseManager.performDedupe(CollectionsKt.listOf(new InAppPurchase(AppEventsConstants.EVENT_NAME_PURCHASED, purchaseLoggingParameters.getPurchaseAmount().doubleValue(), purchaseLoggingParameters.getCurrency())), System.currentTimeMillis(), true, CollectionsKt.listOf(new Pair(purchaseLoggingParameters.getParam(), purchaseLoggingParameters.getOperationalData())));
        }
        return performDedupe;
    }

    @JvmStatic
    public static final synchronized Bundle getSubscriptionDedupeParameters(List<PurchaseLoggingParameters> list, String str) {
        Bundle performDedupe;
        synchronized (AutomaticAnalyticsLogger.class) {
            Intrinsics.checkNotNullParameter(list, "purchaseLoggingParametersList");
            Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
            ArrayList arrayList = new ArrayList();
            for (PurchaseLoggingParameters next : list) {
                arrayList.add(new InAppPurchase(str, next.getPurchaseAmount().doubleValue(), next.getCurrency()));
            }
            List list2 = arrayList;
            long currentTimeMillis = System.currentTimeMillis();
            Iterable<PurchaseLoggingParameters> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (PurchaseLoggingParameters purchaseLoggingParameters : iterable) {
                arrayList2.add(new Pair(purchaseLoggingParameters.getParam(), purchaseLoggingParameters.getOperationalData()));
            }
            performDedupe = InAppPurchaseManager.performDedupe(list2, currentTimeMillis, true, (List) arrayList2);
        }
        return performDedupe;
    }

    @JvmStatic
    public static final boolean isImplicitPurchaseLoggingEnabled() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        return appSettingsWithoutQuery != null && FacebookSdk.getAutoLogAppEventsEnabled() && appSettingsWithoutQuery.getIAPAutomaticLoggingEnabled();
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String str, String str2, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        return getPurchaseLoggingParameters(str, str2, new HashMap(), billingClientVersion);
    }

    private final PurchaseLoggingParameters getPurchaseParametersGPBLV2V4(String str, Bundle bundle, OperationalData operationalData, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject2;
        if (Intrinsics.areEqual((Object) str, (Object) InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            boolean z = false;
            String bool = Boolean.toString(jSONObject.optBoolean(Constants.GP_IAP_AUTORENEWING, false));
            Intrinsics.checkNotNullExpressionValue(bool, "toString(\n              …      )\n                )");
            Bundle bundle2 = bundle;
            OperationalData operationalData2 = operationalData;
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, bool, bundle2, operationalData2);
            OperationalData.Companion companion2 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
            String optString = jSONObject3.optString(Constants.GP_IAP_SUBSCRIPTION_PERIOD);
            Intrinsics.checkNotNullExpressionValue(optString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            companion2.addParameter(operationalDataEnum2, Constants.IAP_SUBSCRIPTION_PERIOD, optString, bundle, operationalData);
            OperationalData.Companion companion3 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum3 = OperationalDataEnum.IAPParameters;
            String optString2 = jSONObject3.optString(Constants.GP_IAP_FREE_TRIAL_PERIOD);
            Intrinsics.checkNotNullExpressionValue(optString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            companion3.addParameter(operationalDataEnum3, Constants.IAP_FREE_TRIAL_PERIOD, optString2, bundle2, operationalData2);
            String optString3 = jSONObject3.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_CYCLES);
            Intrinsics.checkNotNullExpressionValue(optString3, Constants.GP_IAP_INTRODUCTORY_PRICE_CYCLES);
            if (optString3.length() > 0) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_INTRO_PRICE_CYCLES, optString3, bundle, operationalData);
            }
            String optString4 = jSONObject3.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_PERIOD);
            Intrinsics.checkNotNullExpressionValue(optString4, Constants.GP_IAP_INTRODUCTORY_PRICE_PERIOD);
            if (optString4.length() > 0) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_INTRO_PERIOD, optString4, bundle, operationalData);
            }
            String optString5 = jSONObject3.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_AMOUNT_MICROS);
            Intrinsics.checkNotNullExpressionValue(optString5, Constants.GP_IAP_INTRODUCTORY_PRICE_AMOUNT_MICROS);
            if (optString5.length() > 0) {
                z = true;
            }
            if (z) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, optString5, bundle, operationalData);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(((double) jSONObject3.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4)) / 1000000.0d);
        Currency instance = Currency.getInstance(jSONObject3.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V2V4));
        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new PurchaseLoggingParameters(bigDecimal, instance, bundle, operationalData);
    }

    private final List<PurchaseLoggingParameters> getPurchaseParametersGPBLV5V7(String str, Bundle bundle, OperationalData operationalData, JSONObject jSONObject) {
        Bundle bundle2 = bundle;
        JSONObject jSONObject2 = jSONObject;
        int i = 0;
        int i2 = 1;
        if (Intrinsics.areEqual((Object) str, (Object) InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            List<PurchaseLoggingParameters> arrayList = new ArrayList<>();
            JSONArray jSONArray = jSONObject2.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS);
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            while (i < length) {
                JSONObject jSONObject3 = jSONObject2.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS).getJSONObject(i);
                if (jSONObject3 == null) {
                    return null;
                }
                Bundle bundle3 = new Bundle(bundle2);
                OperationalData copy = operationalData.copy();
                String string = jSONObject3.getString(Constants.GP_IAP_BASE_PLAN_ID);
                OperationalData.Companion companion = OperationalData.Companion;
                OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                Intrinsics.checkNotNullExpressionValue(string, Constants.GP_IAP_BASE_PLAN_ID);
                OperationalData.Companion companion2 = companion;
                OperationalData operationalData2 = copy;
                Bundle bundle4 = bundle3;
                companion2.addParameter(operationalDataEnum, Constants.IAP_BASE_PLAN, string, bundle4, operationalData2);
                JSONArray jSONArray2 = jSONObject3.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES);
                JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - i2);
                if (jSONObject4 == null) {
                    return null;
                }
                OperationalData.Companion companion3 = OperationalData.Companion;
                OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
                String optString = jSONObject4.optString(Constants.GP_IAP_BILLING_PERIOD);
                Intrinsics.checkNotNullExpressionValue(optString, "subscriptionJSON.optStri…IOD\n                    )");
                companion3.addParameter(operationalDataEnum2, Constants.IAP_SUBSCRIPTION_PERIOD, optString, bundle4, operationalData2);
                if (!jSONObject4.has(Constants.GP_IAP_RECURRENCE_MODE) || jSONObject4.getInt(Constants.GP_IAP_RECURRENCE_MODE) == 3) {
                    OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_SUBSCRIPTION_AUTORENEWING, "false", bundle4, operationalData2);
                } else {
                    OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_SUBSCRIPTION_AUTORENEWING, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, bundle4, operationalData2);
                }
                BigDecimal bigDecimal = new BigDecimal(((double) jSONObject4.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7)) / 1000000.0d);
                Currency instance = Currency.getInstance(jSONObject4.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
                Intrinsics.checkNotNullExpressionValue(instance, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
                arrayList.add(new PurchaseLoggingParameters(bigDecimal, instance, bundle4, operationalData2));
                i++;
                i2 = 1;
            }
            return arrayList;
        }
        JSONObject jSONObject5 = jSONObject2.getJSONObject(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS);
        if (jSONObject5 == null) {
            return null;
        }
        BigDecimal bigDecimal2 = new BigDecimal(((double) jSONObject5.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7)) / 1000000.0d);
        Currency instance2 = Currency.getInstance(jSONObject5.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
        Intrinsics.checkNotNullExpressionValue(instance2, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
        return CollectionsKt.mutableListOf(new PurchaseLoggingParameters(bigDecimal2, instance2, bundle2, operationalData));
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String str, String str2, Map<String, String> map, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        List<PurchaseLoggingParameters> list = null;
        try {
            String str3 = str;
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            OperationalData operationalData = new OperationalData();
            if (billingClientVersion != null) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_AUTOLOG_IMPLEMENTATION, billingClientVersion.getType(), bundle, operationalData);
            }
            OperationalData.Companion companion = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = jSONObject.getString("productId");
            Intrinsics.checkNotNullExpressionValue(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_ID, string, bundle, operationalData);
            OperationalData.Companion companion2 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
            String string2 = jSONObject.getString(Constants.GP_IAP_PURCHASE_TIME);
            Intrinsics.checkNotNullExpressionValue(string2, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            companion2.addParameter(operationalDataEnum2, Constants.IAP_PURCHASE_TIME, string2, bundle, operationalData);
            OperationalData.Companion companion3 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum3 = OperationalDataEnum.IAPParameters;
            String string3 = jSONObject.getString("purchaseToken");
            Intrinsics.checkNotNullExpressionValue(string3, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            companion3.addParameter(operationalDataEnum3, Constants.IAP_PURCHASE_TOKEN, string3, bundle, operationalData);
            OperationalData.Companion companion4 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum4 = OperationalDataEnum.IAPParameters;
            String optString = jSONObject.optString("packageName");
            Intrinsics.checkNotNullExpressionValue(optString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            companion4.addParameter(operationalDataEnum4, Constants.IAP_PACKAGE_NAME, optString, bundle, operationalData);
            OperationalData.Companion companion5 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum5 = OperationalDataEnum.IAPParameters;
            String optString2 = jSONObject2.optString("title");
            Intrinsics.checkNotNullExpressionValue(optString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            companion5.addParameter(operationalDataEnum5, Constants.IAP_PRODUCT_TITLE, optString2, bundle, operationalData);
            OperationalData.Companion companion6 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum6 = OperationalDataEnum.IAPParameters;
            String optString3 = jSONObject2.optString("description");
            Intrinsics.checkNotNullExpressionValue(optString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            companion6.addParameter(operationalDataEnum6, Constants.IAP_PRODUCT_DESCRIPTION, optString3, bundle, operationalData);
            String optString4 = jSONObject2.optString("type");
            OperationalData.Companion companion7 = OperationalData.Companion;
            OperationalDataEnum operationalDataEnum7 = OperationalDataEnum.IAPParameters;
            Intrinsics.checkNotNullExpressionValue(optString4, "type");
            companion7.addParameter(operationalDataEnum7, Constants.IAP_PRODUCT_TYPE, optString4, bundle, operationalData);
            String specificBillingLibraryVersion = InAppPurchaseManager.getSpecificBillingLibraryVersion();
            if (specificBillingLibraryVersion != null) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_BILLING_LIBRARY_VERSION, specificBillingLibraryVersion, bundle, operationalData);
            }
            for (Map.Entry next : map.entrySet()) {
                OperationalData.Companion.addParameter(OperationalDataEnum.IAPParameters, (String) next.getKey(), (String) next.getValue(), bundle, operationalData);
            }
            if (jSONObject2.has(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4)) {
                list = CollectionsKt.mutableListOf(getPurchaseParametersGPBLV2V4(optString4, bundle, operationalData, jSONObject, jSONObject2));
            } else if (jSONObject2.has(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS) || jSONObject2.has(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS)) {
                try {
                    return getPurchaseParametersGPBLV5V7(optString4, bundle, operationalData, jSONObject2);
                } catch (JSONException e) {
                    e = e;
                    Log.e(TAG, "Error parsing in-app purchase/subscription data.", e);
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    Log.e(TAG, "Failed to get purchase logging parameters,", e);
                    return null;
                }
            }
            return list;
        } catch (JSONException e3) {
            e = e3;
            Log.e(TAG, "Error parsing in-app purchase/subscription data.", e);
            return null;
        } catch (Exception e4) {
            e = e4;
            Log.e(TAG, "Failed to get purchase logging parameters,", e);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "param", "Landroid/os/Bundle;", "operationalData", "Lcom/facebook/appevents/OperationalData;", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "getCurrency", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "getOperationalData", "()Lcom/facebook/appevents/OperationalData;", "setOperationalData", "(Lcom/facebook/appevents/OperationalData;)V", "getParam", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "getPurchaseAmount", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: AutomaticAnalyticsLogger.kt */
    public static final class PurchaseLoggingParameters {
        private Currency currency;
        private OperationalData operationalData;
        private Bundle param;
        private BigDecimal purchaseAmount;

        public PurchaseLoggingParameters(BigDecimal bigDecimal, Currency currency2, Bundle bundle, OperationalData operationalData2) {
            Intrinsics.checkNotNullParameter(bigDecimal, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency2, FirebaseAnalytics.Param.CURRENCY);
            Intrinsics.checkNotNullParameter(bundle, "param");
            Intrinsics.checkNotNullParameter(operationalData2, "operationalData");
            this.purchaseAmount = bigDecimal;
            this.currency = currency2;
            this.param = bundle;
            this.operationalData = operationalData2;
        }

        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public final void setPurchaseAmount(BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
            this.purchaseAmount = bigDecimal;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final void setCurrency(Currency currency2) {
            Intrinsics.checkNotNullParameter(currency2, "<set-?>");
            this.currency = currency2;
        }

        public final Bundle getParam() {
            return this.param;
        }

        public final void setParam(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<set-?>");
            this.param = bundle;
        }

        public final OperationalData getOperationalData() {
            return this.operationalData;
        }

        public final void setOperationalData(OperationalData operationalData2) {
            Intrinsics.checkNotNullParameter(operationalData2, "<set-?>");
            this.operationalData = operationalData2;
        }
    }
}
