package com.braintreepayments.api;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/braintreepayments/api/BraintreeApiConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "accessToken", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "isEnabled", "", "()Z", "getUrl", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeApiConfiguration.kt */
public final class BraintreeApiConfiguration {
    private static final String ACCESS_TOKEN_KEY = "accessToken";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String URL_KEY = "url";
    private final String accessToken;
    private final boolean isEnabled;
    private final String url;

    public static /* synthetic */ BraintreeApiConfiguration copy$default(BraintreeApiConfiguration braintreeApiConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = braintreeApiConfiguration.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = braintreeApiConfiguration.url;
        }
        return braintreeApiConfiguration.copy(str, str2);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.url;
    }

    public final BraintreeApiConfiguration copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "url");
        return new BraintreeApiConfiguration(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BraintreeApiConfiguration)) {
            return false;
        }
        BraintreeApiConfiguration braintreeApiConfiguration = (BraintreeApiConfiguration) obj;
        return Intrinsics.areEqual((Object) this.accessToken, (Object) braintreeApiConfiguration.accessToken) && Intrinsics.areEqual((Object) this.url, (Object) braintreeApiConfiguration.url);
    }

    public int hashCode() {
        return (this.accessToken.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "BraintreeApiConfiguration(accessToken=" + this.accessToken + ", url=" + this.url + ')';
    }

    public BraintreeApiConfiguration(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "url");
        this.accessToken = str;
        this.url = str2;
        this.isEnabled = !TextUtils.isEmpty(str);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BraintreeApiConfiguration(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "accessToken"
            java.lang.String r1 = ""
            java.lang.String r0 = com.braintreepayments.api.Json.optString(r4, r0, r1)
            java.lang.String r2 = "optString(json, ACCESS_TOKEN_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r2 = "url"
            java.lang.String r4 = com.braintreepayments.api.Json.optString(r4, r2, r1)
            java.lang.String r1 = "optString(json, URL_KEY, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.BraintreeApiConfiguration.<init>(org.json.JSONObject):void");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/BraintreeApiConfiguration$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "URL_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: BraintreeApiConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
