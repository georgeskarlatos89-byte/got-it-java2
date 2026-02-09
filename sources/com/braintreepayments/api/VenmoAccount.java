package com.braintreepayments.api;

import org.json.JSONException;
import org.json.JSONObject;

class VenmoAccount extends PaymentMethod {
    private static final String NONCE_KEY = "nonce";
    private static final String VENMO_ACCOUNT_KEY = "venmoAccount";
    private String nonce;

    public String getApiPath() {
        return "venmo_accounts";
    }

    VenmoAccount() {
    }

    public JSONObject buildJSON() throws JSONException {
        JSONObject buildJSON = super.buildJSON();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nonce", this.nonce);
        buildJSON.put(VENMO_ACCOUNT_KEY, jSONObject);
        return buildJSON;
    }

    /* access modifiers changed from: package-private */
    public void setNonce(String str) {
        this.nonce = str;
    }
}
