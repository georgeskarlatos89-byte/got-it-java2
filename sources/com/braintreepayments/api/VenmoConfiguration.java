package com.braintreepayments.api;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/braintreepayments/api/VenmoConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "accessToken", "", "environment", "merchantId", "enrichedCustomerDataEnabled", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAccessToken", "()Ljava/lang/String;", "getEnrichedCustomerDataEnabled", "()Z", "getEnvironment", "isAccessTokenValid", "getMerchantId", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: VenmoConfiguration.kt */
public final class VenmoConfiguration {
    private static final String ACCESS_TOKEN_KEY = "accessToken";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ECD_ENABLED_KEY = "enrichedCustomerDataEnabled";
    private static final String ENVIRONMENT_KEY = "environment";
    private static final String MERCHANT_ID_KEY = "merchantId";
    private final String accessToken;
    private final boolean enrichedCustomerDataEnabled;
    private final String environment;
    private final boolean isAccessTokenValid;
    private final String merchantId;

    public VenmoConfiguration(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, ENVIRONMENT_KEY);
        Intrinsics.checkNotNullParameter(str3, MERCHANT_ID_KEY);
        this.accessToken = str;
        this.environment = str2;
        this.merchantId = str3;
        this.enrichedCustomerDataEnabled = z;
        this.isAccessTokenValid = !TextUtils.isEmpty(str);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final boolean getEnrichedCustomerDataEnabled() {
        return this.enrichedCustomerDataEnabled;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VenmoConfiguration(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r0 = "accessToken"
            java.lang.String r1 = ""
            java.lang.String r0 = com.braintreepayments.api.Json.optString(r6, r0, r1)
            java.lang.String r2 = "optString(json, ACCESS_TOKEN_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r2 = "environment"
            java.lang.String r2 = com.braintreepayments.api.Json.optString(r6, r2, r1)
            java.lang.String r3 = "optString(json, ENVIRONMENT_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = "merchantId"
            java.lang.String r1 = com.braintreepayments.api.Json.optString(r6, r3, r1)
            java.lang.String r3 = "optString(json, MERCHANT_ID_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "enrichedCustomerDataEnabled"
            java.lang.Boolean r6 = com.braintreepayments.api.Json.optBoolean(r6, r4, r3)
            java.lang.String r3 = "optBoolean(json, ECD_ENABLED_KEY, false)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            boolean r6 = r6.booleanValue()
            r5.<init>(r0, r2, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.VenmoConfiguration.<init>(org.json.JSONObject):void");
    }

    public final boolean isAccessTokenValid() {
        return this.isAccessTokenValid;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/VenmoConfiguration$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "ECD_ENABLED_KEY", "ENVIRONMENT_KEY", "MERCHANT_ID_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: VenmoConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
