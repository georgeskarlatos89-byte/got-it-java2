package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/braintreepayments/api/AuthorizationLoader$loadAuthorization$1", "Lcom/braintreepayments/api/ClientTokenCallback;", "onFailure", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "clientToken", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: AuthorizationLoader.kt */
public final class AuthorizationLoader$loadAuthorization$1 implements ClientTokenCallback {
    final /* synthetic */ AuthorizationCallback $callback;
    final /* synthetic */ AuthorizationLoader this$0;

    AuthorizationLoader$loadAuthorization$1(AuthorizationLoader authorizationLoader, AuthorizationCallback authorizationCallback) {
        this.this$0 = authorizationLoader;
        this.$callback = authorizationCallback;
    }

    public void onSuccess(String str) {
        Intrinsics.checkNotNullParameter(str, "clientToken");
        this.this$0.setAuthorizationFromCache(Authorization.Companion.fromString(str));
        this.$callback.onAuthorizationResult(this.this$0.getAuthorizationFromCache(), (Exception) null);
    }

    public void onFailure(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "error");
        this.$callback.onAuthorizationResult((Authorization) null, exc);
    }
}
