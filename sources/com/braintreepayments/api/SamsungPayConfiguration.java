package com.braintreepayments.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B3\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/braintreepayments/api/SamsungPayConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "environment", "", "serviceId", "merchantDisplayName", "supportedCardBrands", "", "samsungAuthorization", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getEnvironment", "()Ljava/lang/String;", "isEnabled", "", "()Z", "getMerchantDisplayName", "getSamsungAuthorization", "getServiceId", "getSupportedCardBrands", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: SamsungPayConfiguration.kt */
public final class SamsungPayConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DISPLAY_NAME_KEY = "displayName";
    private static final String ENVIRONMENT = "environment";
    private static final String SAMSUNG_AUTHORIZATION_KEY = "samsungAuthorization";
    private static final String SERVICE_ID_KEY = "serviceId";
    private static final String SUPPORTED_CARD_BRANDS_KEY = "supportedCardBrands";
    private final String environment;
    private final boolean isEnabled;
    private final String merchantDisplayName;
    private final String samsungAuthorization;
    private final String serviceId;
    private final List<String> supportedCardBrands;

    public static /* synthetic */ SamsungPayConfiguration copy$default(SamsungPayConfiguration samsungPayConfiguration, String str, String str2, String str3, List<String> list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = samsungPayConfiguration.environment;
        }
        if ((i & 2) != 0) {
            str2 = samsungPayConfiguration.serviceId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = samsungPayConfiguration.merchantDisplayName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = samsungPayConfiguration.supportedCardBrands;
        }
        List<String> list2 = list;
        if ((i & 16) != 0) {
            str4 = samsungPayConfiguration.samsungAuthorization;
        }
        return samsungPayConfiguration.copy(str, str5, str6, list2, str4);
    }

    public final String component1() {
        return this.environment;
    }

    public final String component2() {
        return this.serviceId;
    }

    public final String component3() {
        return this.merchantDisplayName;
    }

    public final List<String> component4() {
        return this.supportedCardBrands;
    }

    public final String component5() {
        return this.samsungAuthorization;
    }

    public final SamsungPayConfiguration copy(String str, String str2, String str3, List<String> list, String str4) {
        Intrinsics.checkNotNullParameter(str, ENVIRONMENT);
        Intrinsics.checkNotNullParameter(str2, SERVICE_ID_KEY);
        Intrinsics.checkNotNullParameter(str3, "merchantDisplayName");
        Intrinsics.checkNotNullParameter(list, SUPPORTED_CARD_BRANDS_KEY);
        Intrinsics.checkNotNullParameter(str4, SAMSUNG_AUTHORIZATION_KEY);
        return new SamsungPayConfiguration(str, str2, str3, list, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SamsungPayConfiguration)) {
            return false;
        }
        SamsungPayConfiguration samsungPayConfiguration = (SamsungPayConfiguration) obj;
        return Intrinsics.areEqual((Object) this.environment, (Object) samsungPayConfiguration.environment) && Intrinsics.areEqual((Object) this.serviceId, (Object) samsungPayConfiguration.serviceId) && Intrinsics.areEqual((Object) this.merchantDisplayName, (Object) samsungPayConfiguration.merchantDisplayName) && Intrinsics.areEqual((Object) this.supportedCardBrands, (Object) samsungPayConfiguration.supportedCardBrands) && Intrinsics.areEqual((Object) this.samsungAuthorization, (Object) samsungPayConfiguration.samsungAuthorization);
    }

    public int hashCode() {
        return (((((((this.environment.hashCode() * 31) + this.serviceId.hashCode()) * 31) + this.merchantDisplayName.hashCode()) * 31) + this.supportedCardBrands.hashCode()) * 31) + this.samsungAuthorization.hashCode();
    }

    public String toString() {
        return "SamsungPayConfiguration(environment=" + this.environment + ", serviceId=" + this.serviceId + ", merchantDisplayName=" + this.merchantDisplayName + ", supportedCardBrands=" + this.supportedCardBrands + ", samsungAuthorization=" + this.samsungAuthorization + ')';
    }

    public SamsungPayConfiguration(String str, String str2, String str3, List<String> list, String str4) {
        Intrinsics.checkNotNullParameter(str, ENVIRONMENT);
        Intrinsics.checkNotNullParameter(str2, SERVICE_ID_KEY);
        Intrinsics.checkNotNullParameter(str3, "merchantDisplayName");
        Intrinsics.checkNotNullParameter(list, SUPPORTED_CARD_BRANDS_KEY);
        Intrinsics.checkNotNullParameter(str4, SAMSUNG_AUTHORIZATION_KEY);
        this.environment = str;
        this.serviceId = str2;
        this.merchantDisplayName = str3;
        this.supportedCardBrands = list;
        this.samsungAuthorization = str4;
        this.isEnabled = !TextUtils.isEmpty(str4);
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getMerchantDisplayName() {
        return this.merchantDisplayName;
    }

    public final List<String> getSupportedCardBrands() {
        return this.supportedCardBrands;
    }

    public final String getSamsungAuthorization() {
        return this.samsungAuthorization;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SamsungPayConfiguration(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "environment"
            java.lang.String r1 = ""
            java.lang.String r3 = com.braintreepayments.api.Json.optString(r9, r0, r1)
            java.lang.String r0 = "optString(json, ENVIRONMENT, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.String r0 = "serviceId"
            java.lang.String r4 = com.braintreepayments.api.Json.optString(r9, r0, r1)
            java.lang.String r0 = "optString(json, SERVICE_ID_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            java.lang.String r0 = "displayName"
            java.lang.String r5 = com.braintreepayments.api.Json.optString(r9, r0, r1)
            java.lang.String r0 = "optString(json, DISPLAY_NAME_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            com.braintreepayments.api.SamsungPayConfiguration$Companion r0 = Companion
            if (r9 == 0) goto L_0x002e
            java.lang.String r2 = "supportedCardBrands"
            org.json.JSONArray r2 = r9.optJSONArray(r2)
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            java.util.List r6 = r0.parseSupportedCardBrands(r2)
            java.lang.String r0 = "samsungAuthorization"
            java.lang.String r7 = com.braintreepayments.api.Json.optString(r9, r0, r1)
            java.lang.String r9 = "optString(json, SAMSUNG_AUTHORIZATION_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.SamsungPayConfiguration.<init>(org.json.JSONObject):void");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/braintreepayments/api/SamsungPayConfiguration$Companion;", "", "()V", "DISPLAY_NAME_KEY", "", "ENVIRONMENT", "SAMSUNG_AUTHORIZATION_KEY", "SERVICE_ID_KEY", "SUPPORTED_CARD_BRANDS_KEY", "parseSupportedCardBrands", "", "jsonArray", "Lorg/json/JSONArray;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: SamsungPayConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final List<String> parseSupportedCardBrands(JSONArray jSONArray) {
            List<String> arrayList = new ArrayList<>();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "array.getString(i)");
                    arrayList.add(string);
                }
            }
            return arrayList;
        }
    }
}
