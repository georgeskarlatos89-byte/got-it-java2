package com.braintreepayments.api;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B?\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\fHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/braintreepayments/api/GooglePayConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "isEnabled", "", "googleAuthorizationFingerprint", "", "environment", "displayName", "supportedNetworks", "", "paypalClientId", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getEnvironment", "getGoogleAuthorizationFingerprint", "()Z", "getPaypalClientId", "getSupportedNetworks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: GooglePayConfiguration.kt */
public final class GooglePayConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DISPLAY_NAME_KEY = "displayName";
    private static final String ENABLED_KEY = "enabled";
    private static final String ENVIRONMENT_KEY = "environment";
    private static final String GOOGLE_AUTHORIZATION_FINGERPRINT_KEY = "googleAuthorizationFingerprint";
    private static final String PAYPAL_CLIENT_ID_KEY = "paypalClientId";
    private static final String SUPPORTED_NETWORKS_KEY = "supportedNetworks";
    private final String displayName;
    private final String environment;
    private final String googleAuthorizationFingerprint;
    private final boolean isEnabled;
    private final String paypalClientId;
    private final List<String> supportedNetworks;

    public static /* synthetic */ GooglePayConfiguration copy$default(GooglePayConfiguration googlePayConfiguration, boolean z, String str, String str2, String str3, List<String> list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = googlePayConfiguration.isEnabled;
        }
        if ((i & 2) != 0) {
            str = googlePayConfiguration.googleAuthorizationFingerprint;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = googlePayConfiguration.environment;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = googlePayConfiguration.displayName;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            list = googlePayConfiguration.supportedNetworks;
        }
        List<String> list2 = list;
        if ((i & 32) != 0) {
            str4 = googlePayConfiguration.paypalClientId;
        }
        return googlePayConfiguration.copy(z, str5, str6, str7, list2, str4);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final String component2() {
        return this.googleAuthorizationFingerprint;
    }

    public final String component3() {
        return this.environment;
    }

    public final String component4() {
        return this.displayName;
    }

    public final List<String> component5() {
        return this.supportedNetworks;
    }

    public final String component6() {
        return this.paypalClientId;
    }

    public final GooglePayConfiguration copy(boolean z, String str, String str2, String str3, List<String> list, String str4) {
        Intrinsics.checkNotNullParameter(str3, DISPLAY_NAME_KEY);
        Intrinsics.checkNotNullParameter(list, SUPPORTED_NETWORKS_KEY);
        Intrinsics.checkNotNullParameter(str4, PAYPAL_CLIENT_ID_KEY);
        return new GooglePayConfiguration(z, str, str2, str3, list, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayConfiguration)) {
            return false;
        }
        GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) obj;
        return this.isEnabled == googlePayConfiguration.isEnabled && Intrinsics.areEqual((Object) this.googleAuthorizationFingerprint, (Object) googlePayConfiguration.googleAuthorizationFingerprint) && Intrinsics.areEqual((Object) this.environment, (Object) googlePayConfiguration.environment) && Intrinsics.areEqual((Object) this.displayName, (Object) googlePayConfiguration.displayName) && Intrinsics.areEqual((Object) this.supportedNetworks, (Object) googlePayConfiguration.supportedNetworks) && Intrinsics.areEqual((Object) this.paypalClientId, (Object) googlePayConfiguration.paypalClientId);
    }

    public int hashCode() {
        boolean z = this.isEnabled;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.googleAuthorizationFingerprint;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.environment;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((((hashCode + i2) * 31) + this.displayName.hashCode()) * 31) + this.supportedNetworks.hashCode()) * 31) + this.paypalClientId.hashCode();
    }

    public String toString() {
        return "GooglePayConfiguration(isEnabled=" + this.isEnabled + ", googleAuthorizationFingerprint=" + this.googleAuthorizationFingerprint + ", environment=" + this.environment + ", displayName=" + this.displayName + ", supportedNetworks=" + this.supportedNetworks + ", paypalClientId=" + this.paypalClientId + ')';
    }

    public GooglePayConfiguration(boolean z, String str, String str2, String str3, List<String> list, String str4) {
        Intrinsics.checkNotNullParameter(str3, DISPLAY_NAME_KEY);
        Intrinsics.checkNotNullParameter(list, SUPPORTED_NETWORKS_KEY);
        Intrinsics.checkNotNullParameter(str4, PAYPAL_CLIENT_ID_KEY);
        this.isEnabled = z;
        this.googleAuthorizationFingerprint = str;
        this.environment = str2;
        this.displayName = str3;
        this.supportedNetworks = list;
        this.paypalClientId = str4;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final String getGoogleAuthorizationFingerprint() {
        return this.googleAuthorizationFingerprint;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<String> getSupportedNetworks() {
        return this.supportedNetworks;
    }

    public final String getPaypalClientId() {
        return this.paypalClientId;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GooglePayConfiguration(org.json.JSONObject r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0009
            java.lang.String r1 = "enabled"
            boolean r0 = r9.optBoolean(r1, r0)
        L_0x0009:
            r2 = r0
            java.lang.String r0 = "googleAuthorizationFingerprint"
            r1 = 0
            java.lang.String r3 = com.braintreepayments.api.Json.optString(r9, r0, r1)
            java.lang.String r0 = "environment"
            java.lang.String r4 = com.braintreepayments.api.Json.optString(r9, r0, r1)
            java.lang.String r0 = "displayName"
            java.lang.String r5 = ""
            java.lang.String r0 = com.braintreepayments.api.Json.optString(r9, r0, r5)
            java.lang.String r6 = "optString(json, DISPLAY_NAME_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            com.braintreepayments.api.GooglePayConfiguration$Companion r6 = Companion
            if (r9 == 0) goto L_0x002e
            java.lang.String r1 = "supportedNetworks"
            org.json.JSONArray r1 = r9.optJSONArray(r1)
        L_0x002e:
            java.util.List r6 = r6.parseSupportedNetworks(r1)
            java.lang.String r1 = "paypalClientId"
            java.lang.String r7 = com.braintreepayments.api.Json.optString(r9, r1, r5)
            java.lang.String r9 = "optString(json, PAYPAL_CLIENT_ID_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            r1 = r8
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.GooglePayConfiguration.<init>(org.json.JSONObject):void");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/braintreepayments/api/GooglePayConfiguration$Companion;", "", "()V", "DISPLAY_NAME_KEY", "", "ENABLED_KEY", "ENVIRONMENT_KEY", "GOOGLE_AUTHORIZATION_FINGERPRINT_KEY", "PAYPAL_CLIENT_ID_KEY", "SUPPORTED_NETWORKS_KEY", "parseSupportedNetworks", "", "networksArray", "Lorg/json/JSONArray;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: GooglePayConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final List<String> parseSupportedNetworks(JSONArray jSONArray) {
            List<String> arrayList = new ArrayList<>();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        String string = jSONArray.getString(i);
                        Intrinsics.checkNotNullExpressionValue(string, "array.getString(i)");
                        arrayList.add(string);
                    } catch (JSONException unused) {
                    }
                }
            }
            return arrayList;
        }
    }
}
