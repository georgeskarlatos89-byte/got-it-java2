package com.braintreepayments.api;

import org.json.JSONException;
import org.json.JSONObject;

class ThreeDSecureAPI {
    private final BraintreeClient braintreeClient;

    ThreeDSecureAPI(BraintreeClient braintreeClient2) {
        this.braintreeClient = braintreeClient2;
    }

    /* access modifiers changed from: package-private */
    public void performLookup(ThreeDSecureRequest threeDSecureRequest, String str, final ThreeDSecureResultCallback threeDSecureResultCallback) {
        this.braintreeClient.sendPOST(ApiClient.versionedPath("payment_methods/" + threeDSecureRequest.getNonce() + "/three_d_secure/lookup"), threeDSecureRequest.build(str), new HttpResponseCallback() {
            public void onResult(String str, Exception exc) {
                if (str != null) {
                    try {
                        threeDSecureResultCallback.onResult(ThreeDSecureResult.fromJson(str), (Exception) null);
                    } catch (JSONException e) {
                        threeDSecureResultCallback.onResult((ThreeDSecureResult) null, e);
                    }
                } else {
                    threeDSecureResultCallback.onResult((ThreeDSecureResult) null, exc);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void authenticateCardinalJWT(ThreeDSecureResult threeDSecureResult, String str, final ThreeDSecureResultCallback threeDSecureResultCallback) {
        final CardNonce tokenizedCard = threeDSecureResult.getTokenizedCard();
        this.braintreeClient.sendAnalyticsEvent("three-d-secure.verification-flow.upgrade-payment-method.started");
        String string = tokenizedCard.getString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("jwt", str);
            jSONObject.put("paymentMethodNonce", string);
        } catch (JSONException unused) {
        }
        this.braintreeClient.sendPOST(ApiClient.versionedPath("payment_methods/" + string + "/three_d_secure/authenticate_from_jwt"), jSONObject.toString(), new HttpResponseCallback() {
            public void onResult(String str, Exception exc) {
                if (str != null) {
                    try {
                        ThreeDSecureResult fromJson = ThreeDSecureResult.fromJson(str);
                        if (fromJson.hasError()) {
                            fromJson.setTokenizedCard(tokenizedCard);
                        }
                        threeDSecureResultCallback.onResult(fromJson, (Exception) null);
                    } catch (JSONException e) {
                        threeDSecureResultCallback.onResult((ThreeDSecureResult) null, e);
                    }
                } else {
                    threeDSecureResultCallback.onResult((ThreeDSecureResult) null, exc);
                }
            }
        });
    }
}
