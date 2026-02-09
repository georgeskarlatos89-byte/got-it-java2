package com.braintreepayments.api;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/braintreepayments/api/ApiClient;", "", "braintreeClient", "Lcom/braintreepayments/api/BraintreeClient;", "(Lcom/braintreepayments/api/BraintreeClient;)V", "parseResponseToJSON", "Lorg/json/JSONObject;", "responseBody", "", "tokenizeGraphQL", "", "tokenizePayload", "callback", "Lcom/braintreepayments/api/TokenizeCallback;", "tokenizeREST", "paymentMethod", "Lcom/braintreepayments/api/PaymentMethod;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: ApiClient.kt */
public final class ApiClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PAYMENT_METHOD_ENDPOINT = "payment_methods";
    private final BraintreeClient braintreeClient;

    @JvmStatic
    public static final String versionedPath(String str) {
        return Companion.versionedPath(str);
    }

    public ApiClient(BraintreeClient braintreeClient2) {
        Intrinsics.checkNotNullParameter(braintreeClient2, "braintreeClient");
        this.braintreeClient = braintreeClient2;
    }

    public final void tokenizeGraphQL(JSONObject jSONObject, TokenizeCallback tokenizeCallback) {
        Intrinsics.checkNotNullParameter(jSONObject, "tokenizePayload");
        Intrinsics.checkNotNullParameter(tokenizeCallback, "callback");
        BraintreeClient braintreeClient2 = this.braintreeClient;
        BraintreeClient.sendAnalyticsEvent$default(braintreeClient2, "card.graphql.tokenization.started", (String) null, 2, (Object) null);
        braintreeClient2.sendGraphQLPOST(jSONObject.toString(), new ApiClient$tokenizeGraphQL$1$1(this, braintreeClient2, tokenizeCallback));
    }

    public final void tokenizeREST(PaymentMethod paymentMethod, TokenizeCallback tokenizeCallback) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(tokenizeCallback, "callback");
        BraintreeClient braintreeClient2 = this.braintreeClient;
        String versionedPath = Companion.versionedPath("payment_methods/" + paymentMethod.getApiPath());
        paymentMethod.setSessionId(this.braintreeClient.getSessionId());
        BraintreeClient.sendAnalyticsEvent$default(braintreeClient2, "card.rest.tokenization.started", (String) null, 2, (Object) null);
        braintreeClient2.sendPOST(versionedPath, String.valueOf(paymentMethod.buildJSON()), new ApiClient$tokenizeREST$1$1(this, braintreeClient2, tokenizeCallback));
    }

    /* access modifiers changed from: private */
    public final JSONObject parseResponseToJSON(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject = null;
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/braintreepayments/api/ApiClient$Companion;", "", "()V", "PAYMENT_METHOD_ENDPOINT", "", "versionedPath", "path", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: ApiClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String versionedPath(String str) {
            Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
            return "/v1/" + str;
        }
    }
}
