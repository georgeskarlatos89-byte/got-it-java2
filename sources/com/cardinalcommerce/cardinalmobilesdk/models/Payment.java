package com.cardinalcommerce.cardinalmobilesdk.models;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class Payment implements Serializable {
    private String configure;
    private String getInstance;
    private ExtendedData init;

    public Payment(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.configure = jSONObject.optString("Type", "");
        this.getInstance = jSONObject.optString("ProcessorTransactionId", "");
        String optString = jSONObject.optString("ExtendedData", "");
        if (optString != null && !optString.isEmpty()) {
            this.init = new ExtendedData(optString);
        }
    }

    public String getType() {
        return this.configure;
    }

    public String getProcessorTransactionId() {
        return this.getInstance;
    }

    public ExtendedData getExtendedData() {
        return this.init;
    }
}
