package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreeDSecureResult implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureResult> CREATOR = new Parcelable.Creator<ThreeDSecureResult>() {
        public ThreeDSecureResult createFromParcel(Parcel parcel) {
            return new ThreeDSecureResult(parcel);
        }

        public ThreeDSecureResult[] newArray(int i) {
            return new ThreeDSecureResult[i];
        }
    };
    private static final String ERRORS_KEY = "errors";
    private static final String ERROR_KEY = "error";
    private static final String LOOKUP_KEY = "lookup";
    private static final String MESSAGE_KEY = "message";
    private static final String PAYMENT_METHOD_KEY = "paymentMethod";
    private String errorMessage;
    private ThreeDSecureLookup lookup;
    private CardNonce tokenizedCard;

    public int describeContents() {
        return 0;
    }

    static ThreeDSecureResult fromJson(String str) throws JSONException {
        ThreeDSecureResult threeDSecureResult = new ThreeDSecureResult();
        JSONObject jSONObject = new JSONObject(str);
        JSONObject optJSONObject = jSONObject.optJSONObject(PAYMENT_METHOD_KEY);
        if (optJSONObject != null) {
            threeDSecureResult.tokenizedCard = CardNonce.fromJSON(optJSONObject);
        }
        if (jSONObject.has("errors")) {
            threeDSecureResult.errorMessage = Json.optString(jSONObject.getJSONArray("errors").getJSONObject(0), "message", (String) null);
        } else if (jSONObject.has("error")) {
            threeDSecureResult.errorMessage = Json.optString(jSONObject.getJSONObject("error"), "message", (String) null);
        }
        if (jSONObject.has("lookup")) {
            threeDSecureResult.lookup = ThreeDSecureLookup.fromJson(jSONObject.getJSONObject("lookup").toString());
        }
        return threeDSecureResult;
    }

    public CardNonce getTokenizedCard() {
        return this.tokenizedCard;
    }

    /* access modifiers changed from: package-private */
    public void setTokenizedCard(CardNonce cardNonce) {
        this.tokenizedCard = cardNonce;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /* access modifiers changed from: package-private */
    public boolean hasError() {
        String str = this.errorMessage;
        return str != null && str.length() > 0;
    }

    public ThreeDSecureLookup getLookup() {
        return this.lookup;
    }

    ThreeDSecureResult() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.tokenizedCard, i);
        parcel.writeString(this.errorMessage);
        parcel.writeParcelable(this.lookup, i);
    }

    private ThreeDSecureResult(Parcel parcel) {
        this.tokenizedCard = (CardNonce) parcel.readParcelable(CardNonce.class.getClassLoader());
        this.errorMessage = parcel.readString();
        this.lookup = (ThreeDSecureLookup) parcel.readParcelable(ThreeDSecureLookup.class.getClassLoader());
    }
}
