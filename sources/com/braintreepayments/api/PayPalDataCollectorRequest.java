package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/braintreepayments/api/PayPalDataCollectorRequest;", "", "hasUserLocationConsent", "", "riskCorrelationId", "", "(ZLjava/lang/String;)V", "getHasUserLocationConsent", "()Z", "getRiskCorrelationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "PayPalDataCollector_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: PayPalDataCollectorRequest.kt */
public final class PayPalDataCollectorRequest {
    private final boolean hasUserLocationConsent;
    private final String riskCorrelationId;

    public static /* synthetic */ PayPalDataCollectorRequest copy$default(PayPalDataCollectorRequest payPalDataCollectorRequest, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = payPalDataCollectorRequest.hasUserLocationConsent;
        }
        if ((i & 2) != 0) {
            str = payPalDataCollectorRequest.riskCorrelationId;
        }
        return payPalDataCollectorRequest.copy(z, str);
    }

    public final boolean component1() {
        return this.hasUserLocationConsent;
    }

    public final String component2() {
        return this.riskCorrelationId;
    }

    public final PayPalDataCollectorRequest copy(boolean z, String str) {
        return new PayPalDataCollectorRequest(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayPalDataCollectorRequest)) {
            return false;
        }
        PayPalDataCollectorRequest payPalDataCollectorRequest = (PayPalDataCollectorRequest) obj;
        return this.hasUserLocationConsent == payPalDataCollectorRequest.hasUserLocationConsent && Intrinsics.areEqual((Object) this.riskCorrelationId, (Object) payPalDataCollectorRequest.riskCorrelationId);
    }

    public int hashCode() {
        boolean z = this.hasUserLocationConsent;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.riskCorrelationId;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PayPalDataCollectorRequest(hasUserLocationConsent=" + this.hasUserLocationConsent + ", riskCorrelationId=" + this.riskCorrelationId + ')';
    }

    public PayPalDataCollectorRequest(boolean z, String str) {
        this.hasUserLocationConsent = z;
        this.riskCorrelationId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalDataCollectorRequest(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }

    public final boolean getHasUserLocationConsent() {
        return this.hasUserLocationConsent;
    }

    public final String getRiskCorrelationId() {
        return this.riskCorrelationId;
    }
}
