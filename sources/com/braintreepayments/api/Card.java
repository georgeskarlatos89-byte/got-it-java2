package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.braintreepayments.api.GraphQLConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class Card extends BaseCard implements Parcelable {
    private static final String AUTHENTICATION_INSIGHT_INPUT_KEY = "authenticationInsightInput";
    private static final String AUTHENTICATION_INSIGHT_REQUESTED_KEY = "authenticationInsight";
    public static final Parcelable.Creator<Card> CREATOR = new Parcelable.Creator<Card>() {
        public Card createFromParcel(Parcel parcel) {
            return new Card(parcel);
        }

        public Card[] newArray(int i) {
            return new Card[i];
        }
    };
    private static final String GRAPHQL_CLIENT_SDK_METADATA_KEY = "clientSdkMetadata";
    private static final String MERCHANT_ACCOUNT_ID_KEY = "merchantAccountId";
    private boolean authenticationInsightRequested;
    private String merchantAccountId;
    private boolean shouldValidate;

    public /* bridge */ /* synthetic */ int describeContents() {
        return super.describeContents();
    }

    public /* bridge */ /* synthetic */ String getApiPath() {
        return super.getApiPath();
    }

    public /* bridge */ /* synthetic */ String getCardholderName() {
        return super.getCardholderName();
    }

    public /* bridge */ /* synthetic */ String getCompany() {
        return super.getCompany();
    }

    public /* bridge */ /* synthetic */ String getCountryCode() {
        return super.getCountryCode();
    }

    public /* bridge */ /* synthetic */ String getCvv() {
        return super.getCvv();
    }

    public /* bridge */ /* synthetic */ String getExpirationDate() {
        return super.getExpirationDate();
    }

    public /* bridge */ /* synthetic */ String getExpirationMonth() {
        return super.getExpirationMonth();
    }

    public /* bridge */ /* synthetic */ String getExpirationYear() {
        return super.getExpirationYear();
    }

    public /* bridge */ /* synthetic */ String getExtendedAddress() {
        return super.getExtendedAddress();
    }

    public /* bridge */ /* synthetic */ String getFirstName() {
        return super.getFirstName();
    }

    public /* bridge */ /* synthetic */ String getLastName() {
        return super.getLastName();
    }

    public /* bridge */ /* synthetic */ String getLocality() {
        return super.getLocality();
    }

    public /* bridge */ /* synthetic */ String getNumber() {
        return super.getNumber();
    }

    public /* bridge */ /* synthetic */ String getPostalCode() {
        return super.getPostalCode();
    }

    public /* bridge */ /* synthetic */ String getRegion() {
        return super.getRegion();
    }

    public /* bridge */ /* synthetic */ String getStreetAddress() {
        return super.getStreetAddress();
    }

    public /* bridge */ /* synthetic */ void setCardholderName(String str) {
        super.setCardholderName(str);
    }

    public /* bridge */ /* synthetic */ void setCompany(String str) {
        super.setCompany(str);
    }

    public /* bridge */ /* synthetic */ void setCountryCode(String str) {
        super.setCountryCode(str);
    }

    public /* bridge */ /* synthetic */ void setCvv(String str) {
        super.setCvv(str);
    }

    public /* bridge */ /* synthetic */ void setExpirationDate(String str) {
        super.setExpirationDate(str);
    }

    public /* bridge */ /* synthetic */ void setExpirationMonth(String str) {
        super.setExpirationMonth(str);
    }

    public /* bridge */ /* synthetic */ void setExpirationYear(String str) {
        super.setExpirationYear(str);
    }

    public /* bridge */ /* synthetic */ void setExtendedAddress(String str) {
        super.setExtendedAddress(str);
    }

    public /* bridge */ /* synthetic */ void setFirstName(String str) {
        super.setFirstName(str);
    }

    public /* bridge */ /* synthetic */ void setLastName(String str) {
        super.setLastName(str);
    }

    public /* bridge */ /* synthetic */ void setLocality(String str) {
        super.setLocality(str);
    }

    public /* bridge */ /* synthetic */ void setNumber(String str) {
        super.setNumber(str);
    }

    public /* bridge */ /* synthetic */ void setPostalCode(String str) {
        super.setPostalCode(str);
    }

    public /* bridge */ /* synthetic */ void setRegion(String str) {
        super.setRegion(str);
    }

    public /* bridge */ /* synthetic */ void setStreetAddress(String str) {
        super.setStreetAddress(str);
    }

    /* access modifiers changed from: package-private */
    public JSONObject buildJSONForGraphQL() throws BraintreeException, JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject.put(GRAPHQL_CLIENT_SDK_METADATA_KEY, buildMetadataJSON());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(PaymentMethod.VALIDATE_KEY, this.shouldValidate);
        jSONObject2.put("options", jSONObject4);
        jSONObject3.put(GraphQLConstants.Keys.INPUT, jSONObject2);
        if (!TextUtils.isEmpty(this.merchantAccountId) || !this.authenticationInsightRequested) {
            if (this.authenticationInsightRequested) {
                jSONObject3.put(AUTHENTICATION_INSIGHT_INPUT_KEY, new JSONObject().put(MERCHANT_ACCOUNT_ID_KEY, this.merchantAccountId));
            }
            jSONObject.put("query", getCardTokenizationGraphQLMutation());
            jSONObject.put("operationName", "TokenizeCreditCard");
            JSONObject put = new JSONObject().put("number", getNumber()).put("expirationMonth", getExpirationMonth()).put("expirationYear", getExpirationYear()).put("cvv", getCvv()).put("cardholderName", getCardholderName());
            JSONObject put2 = new JSONObject().put("firstName", getFirstName()).put("lastName", getLastName()).put("company", getCompany()).put("countryCode", getCountryCode()).put(PostalAddressParser.USER_ADDRESS_LOCALITY_KEY, getLocality()).put("postalCode", getPostalCode()).put("region", getRegion()).put(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS, getStreetAddress()).put(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS, getExtendedAddress());
            if (put2.length() > 0) {
                put.put("billingAddress", put2);
            }
            jSONObject2.put("creditCard", put);
            jSONObject.put(GraphQLConstants.Keys.VARIABLES, jSONObject3);
            return jSONObject;
        }
        throw new BraintreeException("A merchant account ID is required when authenticationInsightRequested is true.");
    }

    public Card() {
    }

    public void setMerchantAccountId(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.merchantAccountId = str;
    }

    public void setShouldValidate(boolean z) {
        this.shouldValidate = z;
    }

    public void setAuthenticationInsightRequested(boolean z) {
        this.authenticationInsightRequested = z;
    }

    public String getMerchantAccountId() {
        return this.merchantAccountId;
    }

    public boolean isAuthenticationInsightRequested() {
        return this.authenticationInsightRequested;
    }

    public boolean getShouldValidate() {
        return this.shouldValidate;
    }

    public JSONObject buildJSON() throws JSONException {
        JSONObject buildJSON = super.buildJSON();
        JSONObject jSONObject = buildJSON.getJSONObject("creditCard");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(PaymentMethod.VALIDATE_KEY, this.shouldValidate);
        jSONObject.put("options", jSONObject2);
        if (this.authenticationInsightRequested) {
            buildJSON.put(MERCHANT_ACCOUNT_ID_KEY, this.merchantAccountId);
            buildJSON.put(AUTHENTICATION_INSIGHT_REQUESTED_KEY, this.authenticationInsightRequested);
        }
        return buildJSON;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.merchantAccountId);
        parcel.writeByte(this.shouldValidate ? (byte) 1 : 0);
        parcel.writeByte(this.authenticationInsightRequested ? (byte) 1 : 0);
    }

    protected Card(Parcel parcel) {
        super(parcel);
        this.merchantAccountId = parcel.readString();
        boolean z = true;
        this.shouldValidate = parcel.readByte() > 0;
        this.authenticationInsightRequested = parcel.readByte() <= 0 ? false : z;
    }

    private String getCardTokenizationGraphQLMutation() {
        StringBuilder sb = new StringBuilder("mutation TokenizeCreditCard($input: TokenizeCreditCardInput!");
        if (this.authenticationInsightRequested) {
            sb.append(", $authenticationInsightInput: AuthenticationInsightInput!");
        }
        sb.append(") {  tokenizeCreditCard(input: $input) {    token    creditCard {      bin      brand      expirationMonth      expirationYear      cardholderName      last4      binData {        prepaid        healthcare        debit        durbinRegulated        commercial        payroll        issuingBank        countryOfIssuance        productId      }    }");
        if (this.authenticationInsightRequested) {
            sb.append("    authenticationInsight(input: $authenticationInsightInput) {      customerAuthenticationRegulationEnvironment    }");
        }
        sb.append("  }}");
        return sb.toString();
    }
}
