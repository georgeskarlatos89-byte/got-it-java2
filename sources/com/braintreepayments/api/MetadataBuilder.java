package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0006\u0010\u000b\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/braintreepayments/api/MetadataBuilder;", "", "()V", "json", "Lorg/json/JSONObject;", "build", "integration", "", "sessionId", "source", "toString", "version", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: MetadataBuilder.kt */
public final class MetadataBuilder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String INTEGRATION_KEY = "integration";
    public static final String META_KEY = "_meta";
    private static final String PLATFORM_KEY = "platform";
    private static final String SESSION_ID_KEY = "sessionId";
    private static final String SOURCE_KEY = "source";
    private static final String VERSION_KEY = "version";
    private final JSONObject json;

    public MetadataBuilder() {
        JSONObject jSONObject = new JSONObject();
        this.json = jSONObject;
        try {
            jSONObject.put(PLATFORM_KEY, "android");
        } catch (JSONException unused) {
        }
    }

    public final MetadataBuilder source(String str) {
        try {
            this.json.put("source", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final MetadataBuilder integration(String str) {
        try {
            this.json.put("integration", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final MetadataBuilder sessionId(String str) {
        try {
            this.json.put("sessionId", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final MetadataBuilder version() {
        try {
            this.json.put("version", "4.45.0");
        } catch (JSONException unused) {
        }
        return this;
    }

    public final JSONObject build() {
        return this.json;
    }

    public String toString() {
        String jSONObject = this.json.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "json.toString()");
        return jSONObject;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/MetadataBuilder$Companion;", "", "()V", "INTEGRATION_KEY", "", "META_KEY", "PLATFORM_KEY", "SESSION_ID_KEY", "SOURCE_KEY", "VERSION_KEY", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: MetadataBuilder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
