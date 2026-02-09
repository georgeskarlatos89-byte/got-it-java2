package com.braintreepayments.api;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0016¨\u0006\t"}, d2 = {"com/braintreepayments/api/ApiClient$tokenizeREST$1$1", "Lcom/braintreepayments/api/HttpResponseCallback;", "onResult", "", "responseBody", "", "httpError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: ApiClient.kt */
public final class ApiClient$tokenizeREST$1$1 implements HttpResponseCallback {
    final /* synthetic */ TokenizeCallback $callback;
    final /* synthetic */ BraintreeClient $this_run;
    final /* synthetic */ ApiClient this$0;

    ApiClient$tokenizeREST$1$1(ApiClient apiClient, BraintreeClient braintreeClient, TokenizeCallback tokenizeCallback) {
        this.this$0 = apiClient;
        this.$this_run = braintreeClient;
        this.$callback = tokenizeCallback;
    }

    public void onResult(String str, Exception exc) {
        JSONObject access$parseResponseToJSON = this.this$0.parseResponseToJSON(str);
        if (access$parseResponseToJSON != null) {
            BraintreeClient braintreeClient = this.$this_run;
            TokenizeCallback tokenizeCallback = this.$callback;
            BraintreeClient.sendAnalyticsEvent$default(braintreeClient, "card.rest.tokenization.success", (String) null, 2, (Object) null);
            tokenizeCallback.onResult(access$parseResponseToJSON, (Exception) null);
        } else if (exc != null) {
            BraintreeClient braintreeClient2 = this.$this_run;
            TokenizeCallback tokenizeCallback2 = this.$callback;
            BraintreeClient.sendAnalyticsEvent$default(braintreeClient2, "card.rest.tokenization.failure", (String) null, 2, (Object) null);
            tokenizeCallback2.onResult((JSONObject) null, exc);
        }
    }
}
