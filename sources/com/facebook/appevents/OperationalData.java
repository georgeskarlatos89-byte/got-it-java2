package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.appevents.internal.Constants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0001J\u0006\u0010\f\u001a\u00020\u0000J\u0018\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/OperationalData;", "", "()V", "operationalData", "", "Lcom/facebook/appevents/OperationalDataEnum;", "", "addParameter", "", "type", "key", "value", "copy", "getParameter", "toJSON", "Lorg/json/JSONObject;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: OperationalData.kt */
public final class OperationalData {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Set<String> iapOperationalAndCustomParameters;
    private static final Set<String> iapOperationalParameters;
    /* access modifiers changed from: private */
    public static final Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> parameterClassifications;
    private final Map<OperationalDataEnum, Map<String, Object>> operationalData = new LinkedHashMap();

    public final OperationalData copy() {
        OperationalData operationalData2 = new OperationalData();
        for (OperationalDataEnum next : this.operationalData.keySet()) {
            Map map = this.operationalData.get(next);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        operationalData2.addParameter(next, str, obj);
                    }
                }
            }
        }
        return operationalData2;
    }

    public final void addParameter(OperationalDataEnum operationalDataEnum, String str, Object obj) {
        Intrinsics.checkNotNullParameter(operationalDataEnum, "type");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        Intrinsics.checkNotNullParameter(obj, "value");
        try {
            AppEvent.Companion.validateIdentifier(str);
            if (!(obj instanceof String)) {
                if (!(obj instanceof Number)) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                    throw new FacebookException(format);
                }
            }
            if (!this.operationalData.containsKey(operationalDataEnum)) {
                this.operationalData.put(operationalDataEnum, new LinkedHashMap());
            }
            Map map = this.operationalData.get(operationalDataEnum);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final Object getParameter(OperationalDataEnum operationalDataEnum, String str) {
        Map map;
        Intrinsics.checkNotNullParameter(operationalDataEnum, "type");
        Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
        if (this.operationalData.containsKey(operationalDataEnum) && (map = this.operationalData.get(operationalDataEnum)) != null) {
            return map.get(str);
        }
        return null;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject;
        try {
            Map<OperationalDataEnum, Map<String, Object>> map = this.operationalData;
            Map linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Object next : map.entrySet()) {
                linkedHashMap.put(((OperationalDataEnum) ((Map.Entry) next).getKey()).getValue(), ((Map.Entry) next).getValue());
            }
            jSONObject = new JSONObject(MapsKt.toMap(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013JB\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\n2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J,\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\t\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/OperationalData$Companion;", "", "()V", "iapOperationalAndCustomParameters", "", "", "iapOperationalParameters", "parameterClassifications", "", "Lcom/facebook/appevents/OperationalDataEnum;", "Lkotlin/Pair;", "addParameter", "", "typeOfParameter", "key", "value", "customEventsParams", "Landroid/os/Bundle;", "operationalData", "Lcom/facebook/appevents/OperationalData;", "addParameterAndReturn", "getParameter", "params", "getParameterClassification", "Lcom/facebook/appevents/ParameterClassification;", "parameter", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: OperationalData.kt */
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* compiled from: OperationalData.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    com.facebook.appevents.ParameterClassification[] r0 = com.facebook.appevents.ParameterClassification.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.facebook.appevents.ParameterClassification r1 = com.facebook.appevents.ParameterClassification.CustomData     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.facebook.appevents.ParameterClassification r1 = com.facebook.appevents.ParameterClassification.OperationalData     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.facebook.appevents.ParameterClassification r1 = com.facebook.appevents.ParameterClassification.CustomAndOperationalData     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.OperationalData.Companion.WhenMappings.<clinit>():void");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.Set} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.appevents.ParameterClassification getParameterClassification(com.facebook.appevents.OperationalDataEnum r4, java.lang.String r5) {
            /*
                r3 = this;
                java.lang.String r0 = "typeOfParameter"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "parameter"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.util.Map r0 = com.facebook.appevents.OperationalData.parameterClassifications
                java.lang.Object r0 = r0.get(r4)
                kotlin.Pair r0 = (kotlin.Pair) r0
                r1 = 0
                if (r0 == 0) goto L_0x001e
                java.lang.Object r0 = r0.getFirst()
                java.util.Set r0 = (java.util.Set) r0
                goto L_0x001f
            L_0x001e:
                r0 = r1
            L_0x001f:
                java.util.Map r2 = com.facebook.appevents.OperationalData.parameterClassifications
                java.lang.Object r4 = r2.get(r4)
                kotlin.Pair r4 = (kotlin.Pair) r4
                if (r4 == 0) goto L_0x0032
                java.lang.Object r4 = r4.getSecond()
                r1 = r4
                java.util.Set r1 = (java.util.Set) r1
            L_0x0032:
                if (r0 == 0) goto L_0x003d
                boolean r4 = r0.contains(r5)
                if (r4 == 0) goto L_0x003d
                com.facebook.appevents.ParameterClassification r4 = com.facebook.appevents.ParameterClassification.OperationalData
                return r4
            L_0x003d:
                if (r1 == 0) goto L_0x0048
                boolean r4 = r1.contains(r5)
                if (r4 == 0) goto L_0x0048
                com.facebook.appevents.ParameterClassification r4 = com.facebook.appevents.ParameterClassification.CustomAndOperationalData
                return r4
            L_0x0048:
                com.facebook.appevents.ParameterClassification r4 = com.facebook.appevents.ParameterClassification.CustomData
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.OperationalData.Companion.getParameterClassification(com.facebook.appevents.OperationalDataEnum, java.lang.String):com.facebook.appevents.ParameterClassification");
        }

        public final void addParameter(OperationalDataEnum operationalDataEnum, String str, String str2, Bundle bundle, OperationalData operationalData) {
            Intrinsics.checkNotNullParameter(operationalDataEnum, "typeOfParameter");
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(str2, "value");
            Intrinsics.checkNotNullParameter(bundle, "customEventsParams");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            int i = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(operationalDataEnum, str).ordinal()];
            if (i == 1) {
                bundle.putCharSequence(str, str2);
            } else if (i == 2) {
                operationalData.addParameter(operationalDataEnum, str, str2);
            } else if (i == 3) {
                operationalData.addParameter(operationalDataEnum, str, str2);
                bundle.putCharSequence(str, str2);
            }
        }

        public final Pair<Bundle, OperationalData> addParameterAndReturn(OperationalDataEnum operationalDataEnum, String str, String str2, Bundle bundle, OperationalData operationalData) {
            Intrinsics.checkNotNullParameter(operationalDataEnum, "typeOfParameter");
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            Intrinsics.checkNotNullParameter(str2, "value");
            int i = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(operationalDataEnum, str).ordinal()];
            if (i == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(str, str2);
            } else if (i == 2) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                operationalData.addParameter(operationalDataEnum, str, str2);
            } else if (i == 3) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                operationalData.addParameter(operationalDataEnum, str, str2);
                bundle.putCharSequence(str, str2);
            }
            return new Pair<>(bundle, operationalData);
        }

        public final Object getParameter(OperationalDataEnum operationalDataEnum, String str, Bundle bundle, OperationalData operationalData) {
            Intrinsics.checkNotNullParameter(operationalDataEnum, "typeOfParameter");
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_KEY);
            CharSequence charSequence = null;
            Object parameter = operationalData != null ? operationalData.getParameter(operationalDataEnum, str) : null;
            if (bundle != null) {
                charSequence = bundle.getCharSequence(str);
            }
            return parameter == null ? charSequence : parameter;
        }
    }

    static {
        Set<String> of = SetsKt.setOf(Constants.IAP_PACKAGE_NAME, Constants.IAP_SUBSCRIPTION_AUTORENEWING, Constants.IAP_FREE_TRIAL_PERIOD, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, Constants.IAP_INTRO_PRICE_CYCLES, Constants.IAP_BASE_PLAN, Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, Constants.IAP_AUTOLOG_IMPLEMENTATION, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, Constants.IAP_BILLING_LIBRARY_VERSION, Constants.IAP_SUBSCRIPTION_PERIOD, Constants.IAP_PURCHASE_TOKEN, Constants.IAP_NON_DEDUPED_EVENT_TIME, Constants.IAP_ACTUAL_DEDUP_RESULT, Constants.IAP_ACTUAL_DEDUP_KEY_USED, Constants.IAP_TEST_DEDUP_RESULT, Constants.IAP_TEST_DEDUP_KEY_USED);
        iapOperationalParameters = of;
        Set<String> of2 = SetsKt.setOf(Constants.IAP_PRODUCT_ID, Constants.IAP_PRODUCT_TYPE, Constants.IAP_PURCHASE_TIME);
        iapOperationalAndCustomParameters = of2;
        parameterClassifications = MapsKt.mapOf(TuplesKt.to(OperationalDataEnum.IAPParameters, new Pair(of, of2)));
    }
}
