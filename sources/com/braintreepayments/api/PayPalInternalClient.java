package com.braintreepayments.api;

import android.content.Context;
import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

class PayPalInternalClient {
    private static final String CREATE_SINGLE_PAYMENT_ENDPOINT = "paypal_hermes/create_payment_resource";
    private static final String SETUP_BILLING_AGREEMENT_ENDPOINT = "paypal_hermes/setup_billing_agreement";
    private final ApiClient apiClient;
    /* access modifiers changed from: private */
    public final BraintreeClient braintreeClient;
    /* access modifiers changed from: private */
    public final String cancelUrl;
    /* access modifiers changed from: private */
    public final PayPalDataCollector payPalDataCollector;
    /* access modifiers changed from: private */
    public final String successUrl;

    PayPalInternalClient(BraintreeClient braintreeClient2) {
        this(braintreeClient2, new PayPalDataCollector(braintreeClient2), new ApiClient(braintreeClient2));
    }

    PayPalInternalClient(BraintreeClient braintreeClient2, PayPalDataCollector payPalDataCollector2, ApiClient apiClient2) {
        this.braintreeClient = braintreeClient2;
        this.payPalDataCollector = payPalDataCollector2;
        this.apiClient = apiClient2;
        this.cancelUrl = String.format("%s://onetouch/v1/cancel", new Object[]{braintreeClient2.getReturnUrlScheme()});
        this.successUrl = String.format("%s://onetouch/v1/success", new Object[]{braintreeClient2.getReturnUrlScheme()});
    }

    /* access modifiers changed from: package-private */
    public void sendRequest(final Context context, final PayPalRequest payPalRequest, final PayPalInternalClientCallback payPalInternalClientCallback) {
        this.braintreeClient.getAuthorization(new AuthorizationCallback() {
            public void onAuthorizationResult(final Authorization authorization, Exception exc) {
                if (authorization != null) {
                    PayPalInternalClient.this.braintreeClient.getConfiguration(new ConfigurationCallback() {
                        public void onResult(final Configuration configuration, Exception exc) {
                            if (configuration == null) {
                                payPalInternalClientCallback.onResult((PayPalResponse) null, exc);
                                return;
                            }
                            try {
                                final boolean z = payPalRequest instanceof PayPalVaultRequest;
                                PayPalInternalClient.this.braintreeClient.sendPOST(String.format("/v1/%s", new Object[]{z ? PayPalInternalClient.SETUP_BILLING_AGREEMENT_ENDPOINT : PayPalInternalClient.CREATE_SINGLE_PAYMENT_ENDPOINT}), payPalRequest.createRequestBody(configuration, authorization, PayPalInternalClient.this.successUrl, PayPalInternalClient.this.cancelUrl), new HttpResponseCallback() {
                                    public void onResult(String str, Exception exc) {
                                        if (str != null) {
                                            try {
                                                PayPalResponse successUrl = new PayPalResponse(payPalRequest).successUrl(PayPalInternalClient.this.successUrl);
                                                String redirectUrl = PayPalPaymentResource.fromJson(str).getRedirectUrl();
                                                if (redirectUrl != null) {
                                                    Uri parse = Uri.parse(redirectUrl);
                                                    String queryParameter = parse.getQueryParameter(z ? "ba_token" : "token");
                                                    String riskCorrelationId = payPalRequest.getRiskCorrelationId() != null ? payPalRequest.getRiskCorrelationId() : PayPalInternalClient.this.payPalDataCollector.getClientMetadataId(context, configuration, payPalRequest.hasUserLocationConsent());
                                                    if (queryParameter != null) {
                                                        successUrl.pairingId(queryParameter).clientMetadataId(riskCorrelationId);
                                                    }
                                                    successUrl.approvalUrl(parse.toString());
                                                }
                                                payPalInternalClientCallback.onResult(successUrl, (Exception) null);
                                            } catch (JSONException e) {
                                                payPalInternalClientCallback.onResult((PayPalResponse) null, e);
                                            }
                                        } else {
                                            payPalInternalClientCallback.onResult((PayPalResponse) null, exc);
                                        }
                                    }
                                });
                            } catch (JSONException e) {
                                payPalInternalClientCallback.onResult((PayPalResponse) null, e);
                            }
                        }
                    });
                } else {
                    payPalInternalClientCallback.onResult((PayPalResponse) null, exc);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void tokenize(PayPalAccount payPalAccount, final PayPalBrowserSwitchResultCallback payPalBrowserSwitchResultCallback) {
        this.apiClient.tokenizeREST(payPalAccount, new TokenizeCallback() {
            public void onResult(JSONObject jSONObject, Exception exc) {
                if (jSONObject != null) {
                    try {
                        payPalBrowserSwitchResultCallback.onResult(PayPalAccountNonce.fromJSON(jSONObject), (Exception) null);
                    } catch (JSONException e) {
                        payPalBrowserSwitchResultCallback.onResult((PayPalAccountNonce) null, e);
                    }
                } else {
                    payPalBrowserSwitchResultCallback.onResult((PayPalAccountNonce) null, exc);
                }
            }
        });
    }
}
