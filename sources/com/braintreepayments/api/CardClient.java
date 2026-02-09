package com.braintreepayments.api;

import com.braintreepayments.api.GraphQLConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class CardClient {
    /* access modifiers changed from: private */
    public final ApiClient apiClient;
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;

    public CardClient(BraintreeClient braintreeClient2) {
        this(braintreeClient2, new ApiClient(braintreeClient2));
    }

    CardClient(BraintreeClient braintreeClient2, ApiClient apiClient2) {
        this.braintreeClient = braintreeClient2;
        this.apiClient = apiClient2;
    }

    public void tokenize(final Card card, final CardTokenizeCallback cardTokenizeCallback) {
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                if (exc != null) {
                    cardTokenizeCallback.onResult((CardNonce) null, exc);
                } else if (configuration.isGraphQLFeatureEnabled(GraphQLConstants.Features.TOKENIZE_CREDIT_CARDS)) {
                    card.setSessionId(CardClient.this.braintreeClient.getSessionId());
                    try {
                        CardClient.this.apiClient.tokenizeGraphQL(card.buildJSONForGraphQL(), new TokenizeCallback() {
                            public void onResult(JSONObject jSONObject, Exception exc) {
                                CardClient.this.handleTokenizeResponse(jSONObject, exc, cardTokenizeCallback);
                            }
                        });
                    } catch (BraintreeException | JSONException e) {
                        cardTokenizeCallback.onResult((CardNonce) null, e);
                    }
                } else {
                    CardClient.this.apiClient.tokenizeREST(card, new TokenizeCallback() {
                        public void onResult(JSONObject jSONObject, Exception exc) {
                            CardClient.this.handleTokenizeResponse(jSONObject, exc, cardTokenizeCallback);
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void handleTokenizeResponse(JSONObject jSONObject, Exception exc, CardTokenizeCallback cardTokenizeCallback) {
        if (jSONObject != null) {
            try {
                cardTokenizeCallback.onResult(CardNonce.fromJSON(jSONObject), (Exception) null);
                this.braintreeClient.sendAnalyticsEvent("card.nonce-received");
            } catch (JSONException e) {
                cardTokenizeCallback.onResult((CardNonce) null, e);
                this.braintreeClient.sendAnalyticsEvent("card.nonce-failed");
            }
        } else {
            cardTokenizeCallback.onResult((CardNonce) null, exc);
            this.braintreeClient.sendAnalyticsEvent("card.nonce-failed");
        }
    }
}
