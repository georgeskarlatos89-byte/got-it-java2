package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class CardNonce extends PaymentMethodNonce {
    private static final String API_RESOURCE_KEY = "creditCards";
    private static final String AUTHENTICATION_INSIGHT_KEY = "authenticationInsight";
    private static final String BIN_KEY = "bin";
    private static final String CARDHOLDER_NAME_KEY = "cardholderName";
    private static final String CARD_DETAILS_KEY = "details";
    private static final String CARD_TYPE_KEY = "cardType";
    public static final Parcelable.Creator<CardNonce> CREATOR = new Parcelable.Creator<CardNonce>() {
        public CardNonce createFromParcel(Parcel parcel) {
            return new CardNonce(parcel);
        }

        public CardNonce[] newArray(int i) {
            return new CardNonce[i];
        }
    };
    private static final String DATA_KEY = "data";
    private static final String EXPIRATION_MONTH_KEY = "expirationMonth";
    private static final String EXPIRATION_YEAR_KEY = "expirationYear";
    private static final String GRAPHQL_BRAND_KEY = "brand";
    private static final String GRAPHQL_CREDIT_CARD_KEY = "creditCard";
    private static final String GRAPHQL_LAST_FOUR_KEY = "last4";
    private static final String GRAPHQL_TOKENIZE_CREDIT_CARD_KEY = "tokenizeCreditCard";
    private static final String LAST_FOUR_KEY = "lastFour";
    private static final String LAST_TWO_KEY = "lastTwo";
    private static final String PAYMENT_METHOD_DEFAULT_KEY = "default";
    private static final String PAYMENT_METHOD_NONCE_KEY = "nonce";
    private static final String THREE_D_SECURE_INFO_KEY = "threeDSecureInfo";
    private static final String TOKEN_KEY = "token";
    private final AuthenticationInsight authenticationInsight;
    private final String bin;
    private final BinData binData;
    private final String cardType;
    private final String cardholderName;
    private final String expirationMonth;
    private final String expirationYear;
    private final String lastFour;
    private final String lastTwo;
    private final ThreeDSecureInfo threeDSecureInfo;

    static CardNonce fromJSON(JSONObject jSONObject) throws JSONException {
        if (isGraphQLTokenizationResponse(jSONObject)) {
            return fromGraphQLJSON(jSONObject);
        }
        if (isRESTfulTokenizationResponse(jSONObject)) {
            return fromRESTJSON(jSONObject);
        }
        return fromPlainJSONObject(jSONObject);
    }

    private static boolean isGraphQLTokenizationResponse(JSONObject jSONObject) {
        return jSONObject.has("data");
    }

    private static boolean isRESTfulTokenizationResponse(JSONObject jSONObject) {
        return jSONObject.has(API_RESOURCE_KEY);
    }

    private static CardNonce fromRESTJSON(JSONObject jSONObject) throws JSONException {
        return fromPlainJSONObject(jSONObject.getJSONArray(API_RESOURCE_KEY).getJSONObject(0));
    }

    private static CardNonce fromPlainJSONObject(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("nonce");
        boolean optBoolean = jSONObject.optBoolean("default", false);
        JSONObject jSONObject2 = jSONObject.getJSONObject(CARD_DETAILS_KEY);
        String string2 = jSONObject2.getString(LAST_TWO_KEY);
        String string3 = jSONObject2.getString(LAST_FOUR_KEY);
        String string4 = jSONObject2.getString(CARD_TYPE_KEY);
        ThreeDSecureInfo fromJson = ThreeDSecureInfo.fromJson(jSONObject.optJSONObject(THREE_D_SECURE_INFO_KEY));
        String optString = Json.optString(jSONObject2, BIN_KEY, "");
        BinData fromJson2 = BinData.fromJson(jSONObject.optJSONObject(BinData.BIN_DATA_KEY));
        return new CardNonce(string4, string2, string3, fromJson, optString, fromJson2, AuthenticationInsight.fromJson(jSONObject.optJSONObject(AUTHENTICATION_INSIGHT_KEY)), Json.optString(jSONObject2, EXPIRATION_MONTH_KEY, ""), Json.optString(jSONObject2, EXPIRATION_YEAR_KEY, ""), Json.optString(jSONObject2, CARDHOLDER_NAME_KEY, ""), string, optBoolean);
    }

    private static CardNonce fromGraphQLJSON(JSONObject jSONObject) throws JSONException {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2.has(GRAPHQL_TOKENIZE_CREDIT_CARD_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(GRAPHQL_TOKENIZE_CREDIT_CARD_KEY);
            JSONObject jSONObject4 = jSONObject3.getJSONObject(GRAPHQL_CREDIT_CARD_KEY);
            String optString = Json.optString(jSONObject4, GRAPHQL_LAST_FOUR_KEY, "");
            if (optString.length() < 4) {
                str = "";
            } else {
                str = optString.substring(2);
            }
            return new CardNonce(Json.optString(jSONObject4, GRAPHQL_BRAND_KEY, "Unknown"), str, optString, ThreeDSecureInfo.fromJson((JSONObject) null), Json.optString(jSONObject4, BIN_KEY, ""), BinData.fromJson(jSONObject4.optJSONObject(BinData.BIN_DATA_KEY)), AuthenticationInsight.fromJson(jSONObject3.optJSONObject(AUTHENTICATION_INSIGHT_KEY)), Json.optString(jSONObject4, EXPIRATION_MONTH_KEY, ""), Json.optString(jSONObject4, EXPIRATION_YEAR_KEY, ""), Json.optString(jSONObject4, CARDHOLDER_NAME_KEY, ""), jSONObject3.getString(TOKEN_KEY), false);
        }
        throw new JSONException("Failed to parse GraphQL response JSON");
    }

    private CardNonce(String str, String str2, String str3, ThreeDSecureInfo threeDSecureInfo2, String str4, BinData binData2, AuthenticationInsight authenticationInsight2, String str5, String str6, String str7, String str8, boolean z) {
        super(str8, z);
        this.cardType = str;
        this.lastTwo = str2;
        this.lastFour = str3;
        this.threeDSecureInfo = threeDSecureInfo2;
        this.bin = str4;
        this.binData = binData2;
        this.authenticationInsight = authenticationInsight2;
        this.expirationMonth = str5;
        this.expirationYear = str6;
        this.cardholderName = str7;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getLastTwo() {
        return this.lastTwo;
    }

    public String getLastFour() {
        return this.lastFour;
    }

    public String getExpirationMonth() {
        return this.expirationMonth;
    }

    public String getExpirationYear() {
        return this.expirationYear;
    }

    public String getCardholderName() {
        return this.cardholderName;
    }

    public ThreeDSecureInfo getThreeDSecureInfo() {
        return this.threeDSecureInfo;
    }

    public String getBin() {
        return this.bin;
    }

    public BinData getBinData() {
        return this.binData;
    }

    public AuthenticationInsight getAuthenticationInsight() {
        return this.authenticationInsight;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.cardType);
        parcel.writeString(this.lastTwo);
        parcel.writeString(this.lastFour);
        parcel.writeString(this.bin);
        parcel.writeParcelable(this.binData, i);
        parcel.writeParcelable(this.threeDSecureInfo, i);
        parcel.writeParcelable(this.authenticationInsight, i);
        parcel.writeString(this.expirationMonth);
        parcel.writeString(this.expirationYear);
        parcel.writeString(this.cardholderName);
    }

    protected CardNonce(Parcel parcel) {
        super(parcel);
        this.cardType = parcel.readString();
        this.lastTwo = parcel.readString();
        this.lastFour = parcel.readString();
        this.bin = parcel.readString();
        this.binData = (BinData) parcel.readParcelable(BinData.class.getClassLoader());
        this.threeDSecureInfo = (ThreeDSecureInfo) parcel.readParcelable(ThreeDSecureInfo.class.getClassLoader());
        this.authenticationInsight = (AuthenticationInsight) parcel.readParcelable(AuthenticationInsight.class.getClassLoader());
        this.expirationMonth = parcel.readString();
        this.expirationYear = parcel.readString();
        this.cardholderName = parcel.readString();
    }
}
