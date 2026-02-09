package com.braintreepayments.api;

import android.text.TextUtils;
import com.braintreepayments.api.GraphQLConstants;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÂ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0006J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/braintreepayments/api/GraphQLConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "url", "", "features", "", "(Ljava/lang/String;Ljava/util/Set;)V", "isEnabled", "", "()Z", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "isFeatureEnabled", "feature", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: GraphQLConfiguration.kt */
public final class GraphQLConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Set<String> features;
    private final boolean isEnabled;
    private final String url;

    private final Set<String> component2() {
        return this.features;
    }

    public static /* synthetic */ GraphQLConfiguration copy$default(GraphQLConfiguration graphQLConfiguration, String str, Set<String> set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = graphQLConfiguration.url;
        }
        if ((i & 2) != 0) {
            set = graphQLConfiguration.features;
        }
        return graphQLConfiguration.copy(str, set);
    }

    public final String component1() {
        return this.url;
    }

    public final GraphQLConfiguration copy(String str, Set<String> set) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(set, GraphQLConstants.Keys.FEATURES);
        return new GraphQLConfiguration(str, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphQLConfiguration)) {
            return false;
        }
        GraphQLConfiguration graphQLConfiguration = (GraphQLConfiguration) obj;
        return Intrinsics.areEqual((Object) this.url, (Object) graphQLConfiguration.url) && Intrinsics.areEqual((Object) this.features, (Object) graphQLConfiguration.features);
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.features.hashCode();
    }

    public String toString() {
        return "GraphQLConfiguration(url=" + this.url + ", features=" + this.features + ')';
    }

    public GraphQLConfiguration(String str, Set<String> set) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(set, GraphQLConstants.Keys.FEATURES);
        this.url = str;
        this.features = set;
        this.isEnabled = !TextUtils.isEmpty(str);
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GraphQLConfiguration(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "url"
            java.lang.String r1 = ""
            java.lang.String r0 = com.braintreepayments.api.Json.optString(r4, r0, r1)
            java.lang.String r1 = "optString(json, GraphQLConstants.Keys.URL, \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.braintreepayments.api.GraphQLConfiguration$Companion r1 = Companion
            if (r4 == 0) goto L_0x0018
            java.lang.String r2 = "features"
            org.json.JSONArray r4 = r4.optJSONArray(r2)
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            java.util.Set r4 = r1.parseJsonFeatures(r4)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.GraphQLConfiguration.<init>(org.json.JSONObject):void");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isFeatureEnabled(String str) {
        Intrinsics.checkNotNullParameter(str, "feature");
        return this.isEnabled && this.features.contains(str);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/GraphQLConfiguration$Companion;", "", "()V", "parseJsonFeatures", "", "", "jsonArray", "Lorg/json/JSONArray;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: GraphQLConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Set<String> parseJsonFeatures(JSONArray jSONArray) {
            Set<String> hashSet = new HashSet<>();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = jSONArray.optString(i, "");
                    Intrinsics.checkNotNullExpressionValue(optString, "array.optString(i, \"\")");
                    hashSet.add(optString);
                }
            }
            return hashSet;
        }
    }
}
