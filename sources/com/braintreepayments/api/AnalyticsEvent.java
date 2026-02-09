package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0012\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEvent;", "", "name", "", "payPalContextId", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "id", "getName", "()Ljava/lang/String;", "getPayPalContextId", "getTimestamp", "()J", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: AnalyticsEvent.kt */
public class AnalyticsEvent {
    public long id;
    private final String name;
    private final String payPalContextId;
    private final long timestamp;

    public AnalyticsEvent(String str, String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.name = str;
        this.payPalContextId = str2;
        this.timestamp = j;
    }

    public String getName() {
        return this.name;
    }

    public String getPayPalContextId() {
        return this.payPalContextId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnalyticsEvent(String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
