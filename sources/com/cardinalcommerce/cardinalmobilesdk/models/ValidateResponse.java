package com.cardinalcommerce.cardinalmobilesdk.models;

import com.cardinalcommerce.a.getActionCode;
import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class ValidateResponse implements Serializable {
    private CardinalActionCode Cardinal;
    private boolean cca_continue;
    private Payment configure;
    private int getInstance;
    private String init;

    public ValidateResponse(boolean z, CardinalActionCode cardinalActionCode, CardinalError cardinalError) {
        this.cca_continue = z;
        this.Cardinal = cardinalActionCode;
        this.getInstance = cardinalError.cca_continue();
        this.init = cardinalError.Cardinal();
    }

    public ValidateResponse(String str) throws UnsupportedOperationException, JSONException {
        String optString = new JSONObject(getActionCode.Cardinal(str)).optString("Payload", "");
        if (!optString.isEmpty()) {
            JSONObject jSONObject = new JSONObject(optString);
            String optString2 = jSONObject.optString("Payment", "");
            this.cca_continue = jSONObject.optBoolean("Validated", false);
            if (!optString2.isEmpty()) {
                this.configure = new Payment(optString2);
            }
            this.Cardinal = CardinalActionCode.getActionCode(jSONObject.optString("ActionCode", ""));
            this.getInstance = jSONObject.optInt("ErrorNumber", 0);
            this.init = jSONObject.optString("ErrorDescription", "");
        }
    }

    public boolean isValidated() {
        return this.cca_continue;
    }

    public Payment getPayment() {
        return this.configure;
    }

    public CardinalActionCode getActionCode() {
        return this.Cardinal;
    }

    public int getErrorNumber() {
        return this.getInstance;
    }

    public String getErrorDescription() {
        return this.init;
    }
}
