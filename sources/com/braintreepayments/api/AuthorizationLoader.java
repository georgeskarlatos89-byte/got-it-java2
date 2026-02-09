package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/braintreepayments/api/AuthorizationLoader;", "", "initialAuthString", "", "clientTokenProvider", "Lcom/braintreepayments/api/ClientTokenProvider;", "(Ljava/lang/String;Lcom/braintreepayments/api/ClientTokenProvider;)V", "authorizationFromCache", "Lcom/braintreepayments/api/Authorization;", "getAuthorizationFromCache", "()Lcom/braintreepayments/api/Authorization;", "setAuthorizationFromCache", "(Lcom/braintreepayments/api/Authorization;)V", "invalidateClientToken", "", "loadAuthorization", "callback", "Lcom/braintreepayments/api/AuthorizationCallback;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: AuthorizationLoader.kt */
public final class AuthorizationLoader {
    private Authorization authorizationFromCache;
    private final ClientTokenProvider clientTokenProvider;

    public AuthorizationLoader(String str, ClientTokenProvider clientTokenProvider2) {
        this.clientTokenProvider = clientTokenProvider2;
        this.authorizationFromCache = str != null ? Authorization.Companion.fromString(str) : null;
    }

    public final Authorization getAuthorizationFromCache() {
        return this.authorizationFromCache;
    }

    public final void setAuthorizationFromCache(Authorization authorization) {
        this.authorizationFromCache = authorization;
    }

    public final void loadAuthorization(AuthorizationCallback authorizationCallback) {
        Intrinsics.checkNotNullParameter(authorizationCallback, "callback");
        Authorization authorization = this.authorizationFromCache;
        if (authorization != null) {
            authorizationCallback.onAuthorizationResult(authorization, (Exception) null);
            return;
        }
        ClientTokenProvider clientTokenProvider2 = this.clientTokenProvider;
        if (clientTokenProvider2 != null) {
            clientTokenProvider2.getClientToken(new AuthorizationLoader$loadAuthorization$1(this, authorizationCallback));
        } else {
            authorizationCallback.onAuthorizationResult((Authorization) null, new BraintreeException("Authorization required. See https://developer.paypal.com/braintree/docs/guides/client-sdk/setup/android/v4#initialization for more info.", (Throwable) null, 2, (DefaultConstructorMarker) null));
        }
    }

    public final void invalidateClientToken() {
        if (this.clientTokenProvider != null) {
            this.authorizationFromCache = null;
        }
    }
}
