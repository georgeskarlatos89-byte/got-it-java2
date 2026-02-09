package com.braintreepayments.api;

import org.json.JSONException;
import org.json.JSONObject;

class PayPalPaymentResource {
    private static final String AGREEMENT_SETUP_KEY = "agreementSetup";
    private static final String APPROVAL_URL_KEY = "approvalUrl";
    private static final String PAYMENT_RESOURCE_KEY = "paymentResource";
    private static final String REDIRECT_URL_KEY = "redirectUrl";
    private String redirectUrl;

    PayPalPaymentResource() {
    }

    private void redirectUrl(String str) {
        this.redirectUrl = str;
    }

    /* access modifiers changed from: package-private */
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    static PayPalPaymentResource fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        PayPalPaymentResource payPalPaymentResource = new PayPalPaymentResource();
        JSONObject optJSONObject = jSONObject.optJSONObject(PAYMENT_RESOURCE_KEY);
        if (optJSONObject != null) {
            payPalPaymentResource.redirectUrl(Json.optString(optJSONObject, REDIRECT_URL_KEY, ""));
        } else {
            payPalPaymentResource.redirectUrl(Json.optString(jSONObject.optJSONObject(AGREEMENT_SETUP_KEY), APPROVAL_URL_KEY, ""));
        }
        return payPalPaymentResource;
    }
}
