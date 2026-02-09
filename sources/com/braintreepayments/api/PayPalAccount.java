package com.braintreepayments.api;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

class PayPalAccount extends PaymentMethod {
    private static final String CORRELATION_ID_KEY = "correlationId";
    private static final String INTENT_KEY = "intent";
    private static final String MERCHANT_ACCOUNT_ID_KEY = "merchant_account_id";
    private static final String PAYPAL_ACCOUNT_KEY = "paypalAccount";
    private String clientMetadataId;
    private String intent;
    private String merchantAccountId;
    private String paymentType;
    private JSONObject urlResponseData = new JSONObject();

    public String getApiPath() {
        return "paypal_accounts";
    }

    PayPalAccount() {
    }

    public JSONObject buildJSON() throws JSONException {
        JSONObject buildJSON = super.buildJSON();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CORRELATION_ID_KEY, this.clientMetadataId);
        jSONObject.put("intent", this.intent);
        if ("single-payment".equalsIgnoreCase(this.paymentType)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PaymentMethod.VALIDATE_KEY, false);
            jSONObject.put("options", jSONObject2);
        }
        Iterator<String> keys = this.urlResponseData.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, this.urlResponseData.get(next));
        }
        String str = this.merchantAccountId;
        if (str != null) {
            buildJSON.put(MERCHANT_ACCOUNT_ID_KEY, str);
        }
        buildJSON.put(PAYPAL_ACCOUNT_KEY, jSONObject);
        return buildJSON;
    }

    /* access modifiers changed from: package-private */
    public void setClientMetadataId(String str) {
        this.clientMetadataId = str;
    }

    /* access modifiers changed from: package-private */
    public void setUrlResponseData(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.urlResponseData = jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public void setIntent(String str) {
        this.intent = str;
    }

    /* access modifiers changed from: package-private */
    public void setMerchantAccountId(String str) {
        this.merchantAccountId = str;
    }

    /* access modifiers changed from: package-private */
    public void setPaymentType(String str) {
        this.paymentType = str;
    }
}
