package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class GooglePayCardNonce extends PaymentMethodNonce {
    static final String API_RESOURCE_KEY = "androidPayCards";
    private static final String BIN_KEY = "bin";
    private static final String CARD_DETAILS_KEY = "details";
    private static final String CARD_NETWORK_KEY = "cardNetwork";
    private static final String CARD_TYPE_KEY = "cardType";
    public static final Parcelable.Creator<GooglePayCardNonce> CREATOR = new Parcelable.Creator<GooglePayCardNonce>() {
        public GooglePayCardNonce createFromParcel(Parcel parcel) {
            return new GooglePayCardNonce(parcel);
        }

        public GooglePayCardNonce[] newArray(int i) {
            return new GooglePayCardNonce[i];
        }
    };
    private static final String IS_NETWORK_TOKENIZED_KEY = "isNetworkTokenized";
    private static final String LAST_FOUR_KEY = "lastFour";
    private static final String LAST_TWO_KEY = "lastTwo";
    private static final String PAYMENT_METHOD_DEFAULT_KEY = "default";
    private static final String PAYMENT_METHOD_NONCE_KEY = "nonce";
    private final PostalAddress billingAddress;
    private final String bin;
    private final BinData binData;
    private final String cardNetwork;
    private final String cardType;
    private final String email;
    private boolean isNetworkTokenized;
    private final String lastFour;
    private final String lastTwo;
    private final PostalAddress shippingAddress;

    static PaymentMethodNonce fromJSON(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token"));
        if (jSONObject2.has(API_RESOURCE_KEY)) {
            return fromGooglePayJSON(jSONObject);
        }
        if (jSONObject2.has("paypalAccounts")) {
            return PayPalAccountNonce.fromJSON(jSONObject);
        }
        throw new JSONException("Could not parse JSON for a payment method nonce");
    }

    private static GooglePayCardNonce fromGooglePayJSON(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject(jSONObject2.getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token")).getJSONArray(API_RESOURCE_KEY).getJSONObject(0);
        String string = jSONObject3.getString("nonce");
        boolean optBoolean = jSONObject3.optBoolean("default", false);
        JSONObject jSONObject4 = jSONObject3.getJSONObject(CARD_DETAILS_KEY);
        JSONObject jSONObject5 = jSONObject2.getJSONObject("paymentMethodData").getJSONObject("info");
        String string2 = jSONObject5.getString(CARD_NETWORK_KEY);
        JSONObject jSONObject6 = new JSONObject();
        if (jSONObject5.has("billingAddress")) {
            jSONObject6 = jSONObject5.getJSONObject("billingAddress");
        }
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject2.has("shippingAddress")) {
            jSONObject7 = jSONObject2.getJSONObject("shippingAddress");
        }
        String optString = Json.optString(jSONObject2, "email", "");
        PostalAddress postalAddressFromJson = postalAddressFromJson(jSONObject6);
        PostalAddress postalAddressFromJson2 = postalAddressFromJson(jSONObject7);
        BinData fromJson = BinData.fromJson(jSONObject2.optJSONObject(BinData.BIN_DATA_KEY));
        return new GooglePayCardNonce(jSONObject4.getString(CARD_TYPE_KEY), jSONObject4.getString(BIN_KEY), jSONObject4.getString(LAST_TWO_KEY), jSONObject4.getString(LAST_FOUR_KEY), optString, jSONObject4.optBoolean(IS_NETWORK_TOKENIZED_KEY, false), postalAddressFromJson, postalAddressFromJson2, fromJson, string, optBoolean, string2);
    }

    GooglePayCardNonce(String str, String str2, String str3, String str4, String str5, boolean z, PostalAddress postalAddress, PostalAddress postalAddress2, BinData binData2, String str6, boolean z2, String str7) {
        super(str6, z2);
        this.cardType = str;
        this.bin = str2;
        this.lastTwo = str3;
        this.lastFour = str4;
        this.email = str5;
        this.isNetworkTokenized = z;
        this.billingAddress = postalAddress;
        this.shippingAddress = postalAddress2;
        this.binData = binData2;
        this.cardNetwork = str7;
    }

    static PostalAddress postalAddressFromJson(JSONObject jSONObject) {
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.setRecipientName(Json.optString(jSONObject, "name", ""));
        postalAddress.setPhoneNumber(Json.optString(jSONObject, "phoneNumber", ""));
        postalAddress.setStreetAddress(Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_ADDRESS_1_KEY, ""));
        postalAddress.setExtendedAddress(formatExtendedAddress(jSONObject));
        postalAddress.setLocality(Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_LOCALITY_KEY, ""));
        postalAddress.setRegion(Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_ADMINISTRATIVE_AREA_KEY, ""));
        postalAddress.setCountryCodeAlpha2(Json.optString(jSONObject, "countryCode", ""));
        postalAddress.setPostalCode(Json.optString(jSONObject, "postalCode", ""));
        postalAddress.setSortingCode(Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_SORTING_CODE_KEY, ""));
        return postalAddress;
    }

    private static String formatExtendedAddress(JSONObject jSONObject) {
        return ("" + Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_ADDRESS_2_KEY, "") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_ADDRESS_3_KEY, "") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_ADDRESS_4_KEY, "") + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + Json.optString(jSONObject, PostalAddressParser.USER_ADDRESS_ADDRESS_5_KEY, "")).trim();
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getBin() {
        return this.bin;
    }

    public String getLastTwo() {
        return this.lastTwo;
    }

    public String getLastFour() {
        return this.lastFour;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean isNetworkTokenized() {
        return this.isNetworkTokenized;
    }

    public PostalAddress getBillingAddress() {
        return this.billingAddress;
    }

    public PostalAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public BinData getBinData() {
        return this.binData;
    }

    public String getCardNetwork() {
        return this.cardNetwork;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.cardType);
        parcel.writeString(this.bin);
        parcel.writeString(this.lastTwo);
        parcel.writeString(this.lastFour);
        parcel.writeString(this.email);
        parcel.writeParcelable(this.billingAddress, i);
        parcel.writeParcelable(this.shippingAddress, i);
        parcel.writeParcelable(this.binData, i);
        parcel.writeByte(this.isNetworkTokenized ? (byte) 1 : 0);
        parcel.writeString(this.cardNetwork);
    }

    private GooglePayCardNonce(Parcel parcel) {
        super(parcel);
        this.cardType = parcel.readString();
        this.bin = parcel.readString();
        this.lastTwo = parcel.readString();
        this.lastFour = parcel.readString();
        this.email = parcel.readString();
        this.billingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.shippingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.binData = (BinData) parcel.readParcelable(BinData.class.getClassLoader());
        this.isNetworkTokenized = parcel.readByte() > 0;
        this.cardNetwork = parcel.readString();
    }
}
