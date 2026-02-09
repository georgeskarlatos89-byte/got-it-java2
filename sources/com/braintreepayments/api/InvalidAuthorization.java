package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/InvalidAuthorization;", "Lcom/braintreepayments/api/Authorization;", "rawValue", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "bearer", "getBearer", "()Ljava/lang/String;", "configUrl", "getConfigUrl", "getErrorMessage", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: InvalidAuthorization.kt */
public final class InvalidAuthorization extends Authorization {
    private final String bearer;
    private final String configUrl;
    private final String errorMessage;

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidAuthorization(String str, String str2) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "rawValue");
        Intrinsics.checkNotNullParameter(str2, "errorMessage");
        this.errorMessage = str2;
    }

    public String getConfigUrl() {
        return this.configUrl;
    }

    public String getBearer() {
        return this.bearer;
    }
}
