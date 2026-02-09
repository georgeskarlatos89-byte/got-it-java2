package com.cardinalcommerce.cardinalmobilesdk.models;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class ExtendedData implements Serializable {
    private String Cardinal;
    private String cca_continue;
    private String configure;
    private String getInstance;
    private String getWarnings;
    private String init;

    public ExtendedData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.Cardinal = jSONObject.optString("CAVV", "");
        this.init = jSONObject.optString("ECIFlag", "");
        this.getWarnings = jSONObject.optString("XID", "");
        this.cca_continue = jSONObject.optString("PAResStatus", "");
        this.getInstance = jSONObject.optString("SignatureVerification", "");
        this.configure = jSONObject.optString("Enrolled", "");
    }

    public String getCavv() {
        return this.Cardinal;
    }

    public String getEciFlag() {
        return this.init;
    }

    public String getXid() {
        return this.getWarnings;
    }

    public String getEnrolled() {
        return this.configure;
    }

    public String getPaResStatus() {
        return this.cca_continue;
    }

    public String getSignatureVerification() {
        return this.getInstance;
    }
}
