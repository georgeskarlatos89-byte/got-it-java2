package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/braintreepayments/api/UnionPayConfiguration;", "", "json", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "isEnabled", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: UnionPayConfiguration.kt */
public final class UnionPayConfiguration {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ENABLED = "enabled";
    private final boolean isEnabled;

    public static /* synthetic */ UnionPayConfiguration copy$default(UnionPayConfiguration unionPayConfiguration, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = unionPayConfiguration.isEnabled;
        }
        return unionPayConfiguration.copy(z);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final UnionPayConfiguration copy(boolean z) {
        return new UnionPayConfiguration(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnionPayConfiguration) && this.isEnabled == ((UnionPayConfiguration) obj).isEnabled;
    }

    public int hashCode() {
        boolean z = this.isEnabled;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "UnionPayConfiguration(isEnabled=" + this.isEnabled + ')';
    }

    public UnionPayConfiguration(boolean z) {
        this.isEnabled = z;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public UnionPayConfiguration(JSONObject jSONObject) {
        this(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/braintreepayments/api/UnionPayConfiguration$Companion;", "", "()V", "ENABLED", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: UnionPayConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
