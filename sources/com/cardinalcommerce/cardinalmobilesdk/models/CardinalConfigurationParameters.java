package com.cardinalcommerce.cardinalmobilesdk.models;

import com.cardinalcommerce.a.getString;
import com.cardinalcommerce.cardinalmobilesdk.cm.models.CardinalError;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalEnvironment;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalRenderType;
import com.cardinalcommerce.cardinalmobilesdk.enums.CardinalUiType;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;
import org.apache.http.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CardinalConfigurationParameters {
    private JSONArray Cardinal;
    private boolean CardinalRenderType = true;
    private int cca_continue = 8000;
    private UiCustomization cleanup = new UiCustomization();
    private CardinalUiType configure = CardinalUiType.BOTH;
    private int getInstance = 5;
    private String getSDKVersion = "";
    private final getString getWarnings = getString.getInstance();
    private String init = "";
    private CardinalEnvironment onCReqSuccess = CardinalEnvironment.PRODUCTION;
    private boolean onValidated = true;
    private boolean values = false;

    public CardinalConfigurationParameters() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(CardinalRenderType.OTP);
        jSONArray.put(CardinalRenderType.SINGLE_SELECT);
        jSONArray.put(CardinalRenderType.MULTI_SELECT);
        jSONArray.put(CardinalRenderType.OOB);
        jSONArray.put(CardinalRenderType.HTML);
        this.Cardinal = jSONArray;
    }

    public int getRequestTimeout() {
        return this.cca_continue;
    }

    public void setRequestTimeout(int i) {
        if (i < 0) {
            i = 0;
        }
        this.cca_continue = i;
    }

    public int getChallengeTimeout() {
        return this.getInstance;
    }

    public void setChallengeTimeout(int i) {
        if (i < 5) {
            i = 5;
        }
        this.getInstance = i;
    }

    public CardinalEnvironment getEnvironment() {
        return this.onCReqSuccess;
    }

    public void setEnvironment(CardinalEnvironment cardinalEnvironment) {
        this.onCReqSuccess = cardinalEnvironment;
    }

    public String getProxyAddress() {
        return this.init;
    }

    public void setProxyAddress(String str) {
        this.init = str;
    }

    public CardinalUiType getUiType() {
        return this.configure;
    }

    public void setUiType(CardinalUiType cardinalUiType) {
        this.configure = cardinalUiType;
    }

    public JSONArray getRenderType() {
        return this.Cardinal;
    }

    public void setRenderType(JSONArray jSONArray) throws InvalidInputException {
        if (jSONArray != null) {
            this.Cardinal = jSONArray;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Invalid Input Exception configure Parameters"));
    }

    public void setUICustomization(UiCustomization uiCustomization) {
        this.cleanup = uiCustomization;
    }

    public UiCustomization getUICustomization() {
        return this.cleanup;
    }

    public boolean isEnableDFSync() {
        return this.onValidated;
    }

    public void setEnableDFSync(boolean z) {
        this.onValidated = z;
    }

    public String getThreeDSRequestorAppURL() {
        return this.getSDKVersion;
    }

    public void setThreeDSRequestorAppURL(String str) {
        this.getSDKVersion = str;
    }

    public boolean isEnableLogging() {
        return this.CardinalRenderType;
    }

    public void setEnableLogging(boolean z) {
        this.CardinalRenderType = z;
    }

    public boolean isLocationDataConsentGiven() {
        return this.values;
    }

    public void setLocationDataConsentGiven(boolean z) {
        this.values = z;
    }

    public JSONObject getJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("Environment", this.onCReqSuccess);
            jSONObject.putOpt("ProxyAddress", this.init);
            jSONObject.putOpt("RenderType", this.Cardinal);
            jSONObject.putOpt(HttpHeaders.TIMEOUT, Integer.valueOf(this.cca_continue));
            jSONObject.putOpt("UiType", this.configure);
            jSONObject.putOpt("EnableDFSync", Boolean.valueOf(this.onValidated));
            jSONObject.putOpt("EnableLogging", Boolean.valueOf(this.CardinalRenderType));
            jSONObject.putOpt("LocationDataConsentGiven", Boolean.valueOf(this.values));
            if (!this.getSDKVersion.equals("")) {
                jSONObject.putOpt("ThreeDSRequestorAppURL", this.getSDKVersion);
            }
        } catch (JSONException e) {
            this.getWarnings.cca_continue(new CardinalError((int) CardinalError.CARDINAL_JSON_EXCEPTION_ERROR_CODE, (Exception) e), (String) null);
        }
        return jSONObject;
    }
}
