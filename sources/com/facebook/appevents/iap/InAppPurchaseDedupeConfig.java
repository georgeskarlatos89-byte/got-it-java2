package com.facebook.appevents.iap;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.internal.Constants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J&\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00070\u00042\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\tJ(\u0010\u0019\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u001dJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseDedupeConfig;", "", "()V", "defaultCurrencyParameterEquivalents", "", "", "defaultDedupeParameters", "Lkotlin/Pair;", "defaultDedupeWindow", "", "defaultValueParameterEquivalents", "addDedupeParameters", "Landroid/os/Bundle;", "Lcom/facebook/appevents/OperationalData;", "dedupeParameters", "originalParameters", "originalOperationalData", "getCurrencyOfManualEvent", "Ljava/util/Currency;", "parameters", "getCurrencyParameterEquivalents", "getDedupeParameters", "dedupingWithImplicitlyLoggedHistory", "", "getDedupeWindow", "getTestDedupeParameters", "getValueOfManualEvent", "", "valueToSum", "(Ljava/lang/Double;Landroid/os/Bundle;)Ljava/lang/Double;", "getValueParameterEquivalents", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InAppPurchaseDedupeConfig.kt */
public final class InAppPurchaseDedupeConfig {
    public static final InAppPurchaseDedupeConfig INSTANCE = new InAppPurchaseDedupeConfig();
    private static final List<String> defaultCurrencyParameterEquivalents = CollectionsKt.listOf(AppEventsConstants.EVENT_PARAM_CURRENCY);
    private static final List<Pair<String, List<String>>> defaultDedupeParameters = CollectionsKt.listOf(TuplesKt.to(Constants.IAP_PRODUCT_ID, CollectionsKt.listOf(Constants.IAP_PRODUCT_ID)), TuplesKt.to(Constants.IAP_PRODUCT_DESCRIPTION, CollectionsKt.listOf(Constants.IAP_PRODUCT_DESCRIPTION)), TuplesKt.to(Constants.IAP_PRODUCT_TITLE, CollectionsKt.listOf(Constants.IAP_PRODUCT_TITLE)), TuplesKt.to(Constants.IAP_PURCHASE_TOKEN, CollectionsKt.listOf(Constants.IAP_PURCHASE_TOKEN)));
    private static final long defaultDedupeWindow = TimeUnit.MINUTES.toMillis(1);
    private static final List<String> defaultValueParameterEquivalents = CollectionsKt.listOf(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);

    private InAppPurchaseDedupeConfig() {
    }

    public final List<Pair<String, List<String>>> getDedupeParameters(boolean z) {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getProdDedupeParameters() : null) == null || appSettingsWithoutQuery.getProdDedupeParameters().isEmpty()) {
            return defaultDedupeParameters;
        }
        if (!z) {
            return appSettingsWithoutQuery.getProdDedupeParameters();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair next : appSettingsWithoutQuery.getProdDedupeParameters()) {
            for (String pair : (List) next.getSecond()) {
                arrayList.add(new Pair(pair, CollectionsKt.listOf(next.getFirst())));
            }
        }
        return arrayList;
    }

    public final List<Pair<String, List<String>>> getTestDedupeParameters(boolean z) {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if (appSettingsWithoutQuery == null) {
            return null;
        }
        Collection testDedupeParameters = appSettingsWithoutQuery.getTestDedupeParameters();
        if (testDedupeParameters == null || testDedupeParameters.isEmpty()) {
            return null;
        }
        if (!z) {
            return appSettingsWithoutQuery.getTestDedupeParameters();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair next : appSettingsWithoutQuery.getTestDedupeParameters()) {
            for (String pair : (List) next.getSecond()) {
                arrayList.add(new Pair(pair, CollectionsKt.listOf(next.getFirst())));
            }
        }
        return arrayList;
    }

    public final List<String> getCurrencyParameterEquivalents() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getCurrencyDedupeParameters() : null) == null || appSettingsWithoutQuery.getCurrencyDedupeParameters().isEmpty()) {
            return defaultCurrencyParameterEquivalents;
        }
        return appSettingsWithoutQuery.getCurrencyDedupeParameters();
    }

    public final List<String> getValueParameterEquivalents() {
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getPurchaseValueDedupeParameters() : null) == null || appSettingsWithoutQuery.getPurchaseValueDedupeParameters().isEmpty()) {
            return defaultValueParameterEquivalents;
        }
        return appSettingsWithoutQuery.getPurchaseValueDedupeParameters();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[Catch:{ Exception -> 0x0008 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Currency getCurrencyOfManualEvent(android.os.Bundle r4) {
        /*
            r3 = this;
            java.util.List r0 = r3.getCurrencyParameterEquivalents()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r4 == 0) goto L_0x001b
            java.lang.String r2 = r4.getString(r1)     // Catch:{ Exception -> 0x0008 }
        L_0x001b:
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0008 }
            if (r1 == 0) goto L_0x0029
            int r1 = r1.length()     // Catch:{ Exception -> 0x0008 }
            if (r1 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x002d
            goto L_0x0008
        L_0x002d:
            java.util.Currency r4 = java.util.Currency.getInstance(r2)     // Catch:{ Exception -> 0x0008 }
            return r4
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.InAppPurchaseDedupeConfig.getCurrencyOfManualEvent(android.os.Bundle):java.util.Currency");
    }

    public final Double getValueOfManualEvent(Double d, Bundle bundle) {
        if (d != null) {
            return d;
        }
        for (String next : getValueParameterEquivalents()) {
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(next));
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public final long getDedupeWindow() {
        Long dedupeWindow;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
        if ((appSettingsWithoutQuery != null ? appSettingsWithoutQuery.getDedupeWindow() : null) == null || ((dedupeWindow = appSettingsWithoutQuery.getDedupeWindow()) != null && dedupeWindow.longValue() == 0)) {
            return defaultDedupeWindow;
        }
        return appSettingsWithoutQuery.getDedupeWindow().longValue();
    }

    public final Pair<Bundle, OperationalData> addDedupeParameters(Bundle bundle, Bundle bundle2, OperationalData operationalData) {
        if (bundle == null) {
            return new Pair<>(bundle2, operationalData);
        }
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    OperationalData.Companion companion = OperationalData.Companion;
                    OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                    Intrinsics.checkNotNullExpressionValue(str, SDKConstants.PARAM_KEY);
                    Pair<Bundle, OperationalData> addParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, str, string, bundle2, operationalData);
                    Bundle component1 = addParameterAndReturn.component1();
                    operationalData = addParameterAndReturn.component2();
                    bundle2 = component1;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair<>(bundle2, operationalData);
    }
}
