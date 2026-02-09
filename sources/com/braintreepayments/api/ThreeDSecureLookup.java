package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreeDSecureLookup implements Parcelable {
    private static final String ACS_URL_KEY = "acsUrl";
    public static final Parcelable.Creator<ThreeDSecureLookup> CREATOR = new Parcelable.Creator<ThreeDSecureLookup>() {
        public ThreeDSecureLookup createFromParcel(Parcel parcel) {
            return new ThreeDSecureLookup(parcel);
        }

        public ThreeDSecureLookup[] newArray(int i) {
            return new ThreeDSecureLookup[i];
        }
    };
    private static final String MD_KEY = "md";
    private static final String PA_REQ_KEY = "pareq";
    private static final String TERM_URL_KEY = "termUrl";
    private static final String THREE_D_SECURE_VERSION_KEY = "threeDSecureVersion";
    private static final String TRANSACTION_ID_KEY = "transactionId";
    private String acsUrl;
    private String md;
    private String pareq;
    private String termUrl;
    private String threeDSecureVersion;
    private String transactionId;

    public int describeContents() {
        return 0;
    }

    static ThreeDSecureLookup fromJson(String str) throws JSONException {
        ThreeDSecureLookup threeDSecureLookup = new ThreeDSecureLookup();
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull(ACS_URL_KEY)) {
            threeDSecureLookup.acsUrl = null;
        } else {
            threeDSecureLookup.acsUrl = jSONObject.getString(ACS_URL_KEY);
        }
        threeDSecureLookup.md = jSONObject.getString(MD_KEY);
        threeDSecureLookup.termUrl = jSONObject.getString(TERM_URL_KEY);
        threeDSecureLookup.pareq = Json.optString(jSONObject, PA_REQ_KEY, "");
        threeDSecureLookup.threeDSecureVersion = Json.optString(jSONObject, THREE_D_SECURE_VERSION_KEY, "");
        threeDSecureLookup.transactionId = Json.optString(jSONObject, TRANSACTION_ID_KEY, "");
        return threeDSecureLookup;
    }

    public String getAcsUrl() {
        return this.acsUrl;
    }

    public String getMd() {
        return this.md;
    }

    public String getTermUrl() {
        return this.termUrl;
    }

    public String getPareq() {
        return this.pareq;
    }

    public String getThreeDSecureVersion() {
        return this.threeDSecureVersion;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public boolean requiresUserAuthentication() {
        return this.acsUrl != null;
    }

    public ThreeDSecureLookup() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.acsUrl);
        parcel.writeString(this.md);
        parcel.writeString(this.termUrl);
        parcel.writeString(this.pareq);
        parcel.writeString(this.threeDSecureVersion);
        parcel.writeString(this.transactionId);
    }

    private ThreeDSecureLookup(Parcel parcel) {
        this.acsUrl = parcel.readString();
        this.md = parcel.readString();
        this.termUrl = parcel.readString();
        this.pareq = parcel.readString();
        this.threeDSecureVersion = parcel.readString();
        this.transactionId = parcel.readString();
    }
}
