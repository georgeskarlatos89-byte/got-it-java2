package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

abstract class BaseCard extends PaymentMethod implements Parcelable {
    static final String BILLING_ADDRESS_KEY = "billingAddress";
    static final String CARDHOLDER_NAME_KEY = "cardholderName";
    static final String COMPANY_KEY = "company";
    static final String COUNTRY_CODE_ALPHA3_KEY = "countryCodeAlpha3";
    static final String COUNTRY_CODE_KEY = "countryCode";
    static final String CREDIT_CARD_KEY = "creditCard";
    static final String CVV_KEY = "cvv";
    static final String EXPIRATION_MONTH_KEY = "expirationMonth";
    static final String EXPIRATION_YEAR_KEY = "expirationYear";
    static final String EXTENDED_ADDRESS_KEY = "extendedAddress";
    static final String FIRST_NAME_KEY = "firstName";
    static final String LAST_NAME_KEY = "lastName";
    static final String LOCALITY_KEY = "locality";
    static final String NUMBER_KEY = "number";
    static final String POSTAL_CODE_KEY = "postalCode";
    static final String REGION_KEY = "region";
    static final String STREET_ADDRESS_KEY = "streetAddress";
    private String cardholderName;
    private String company;
    private String countryCode;
    private String cvv;
    private String expirationMonth;
    private String expirationYear;
    private String extendedAddress;
    private String firstName;
    private String lastName;
    private String locality;
    private String number;
    private String postalCode;
    private String region;
    private String streetAddress;

    public int describeContents() {
        return 0;
    }

    public String getApiPath() {
        return "credit_cards";
    }

    BaseCard() {
    }

    public void setNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            this.number = null;
        } else {
            this.number = str;
        }
    }

    public void setCvv(String str) {
        if (TextUtils.isEmpty(str)) {
            this.cvv = null;
        } else {
            this.cvv = str;
        }
    }

    public void setExpirationMonth(String str) {
        if (TextUtils.isEmpty(str)) {
            this.expirationMonth = null;
        } else {
            this.expirationMonth = str;
        }
    }

    public void setExpirationYear(String str) {
        if (TextUtils.isEmpty(str)) {
            this.expirationYear = null;
        } else {
            this.expirationYear = str;
        }
    }

    public void setExpirationDate(String str) {
        if (TextUtils.isEmpty(str)) {
            this.expirationMonth = null;
            this.expirationYear = null;
            return;
        }
        String[] split = str.split("/");
        this.expirationMonth = split[0];
        if (split.length > 1) {
            this.expirationYear = split[1];
        }
    }

    public void setCardholderName(String str) {
        if (TextUtils.isEmpty(str)) {
            this.cardholderName = null;
        } else {
            this.cardholderName = str;
        }
    }

    public void setFirstName(String str) {
        if (TextUtils.isEmpty(str)) {
            this.firstName = null;
        } else {
            this.firstName = str;
        }
    }

    public void setLastName(String str) {
        if (TextUtils.isEmpty(str)) {
            this.lastName = null;
        } else {
            this.lastName = str;
        }
    }

    public void setCompany(String str) {
        if (TextUtils.isEmpty(str)) {
            this.company = null;
        } else {
            this.company = str;
        }
    }

    public void setCountryCode(String str) {
        if (TextUtils.isEmpty(str)) {
            this.countryCode = null;
        } else {
            this.countryCode = str;
        }
    }

    public void setLocality(String str) {
        if (TextUtils.isEmpty(str)) {
            this.locality = null;
        } else {
            this.locality = str;
        }
    }

    public void setPostalCode(String str) {
        if (TextUtils.isEmpty(str)) {
            this.postalCode = null;
        } else {
            this.postalCode = str;
        }
    }

    public void setRegion(String str) {
        if (TextUtils.isEmpty(str)) {
            this.region = null;
        } else {
            this.region = str;
        }
    }

    public void setStreetAddress(String str) {
        if (TextUtils.isEmpty(str)) {
            this.streetAddress = null;
        } else {
            this.streetAddress = str;
        }
    }

    public void setExtendedAddress(String str) {
        if (TextUtils.isEmpty(str)) {
            this.extendedAddress = null;
        } else {
            this.extendedAddress = str;
        }
    }

    public String getCardholderName() {
        return this.cardholderName;
    }

    public String getNumber() {
        return this.number;
    }

    public String getCompany() {
        return this.company;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCvv() {
        return this.cvv;
    }

    public String getExpirationMonth() {
        return this.expirationMonth;
    }

    public String getExpirationYear() {
        return this.expirationYear;
    }

    public String getExtendedAddress() {
        return this.extendedAddress;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLocality() {
        return this.locality;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getRegion() {
        return this.region;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public String getExpirationDate() {
        if (TextUtils.isEmpty(this.expirationMonth) || TextUtils.isEmpty(this.expirationYear)) {
            return null;
        }
        return this.expirationMonth + "/" + this.expirationYear;
    }

    public JSONObject buildJSON() throws JSONException {
        JSONObject buildJSON = super.buildJSON();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NUMBER_KEY, this.number);
        jSONObject.put(CVV_KEY, this.cvv);
        jSONObject.put(EXPIRATION_MONTH_KEY, this.expirationMonth);
        jSONObject.put(EXPIRATION_YEAR_KEY, this.expirationYear);
        jSONObject.put(CARDHOLDER_NAME_KEY, this.cardholderName);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(FIRST_NAME_KEY, this.firstName);
        jSONObject2.put(LAST_NAME_KEY, this.lastName);
        jSONObject2.put(COMPANY_KEY, this.company);
        jSONObject2.put("locality", this.locality);
        jSONObject2.put("postalCode", this.postalCode);
        jSONObject2.put(REGION_KEY, this.region);
        jSONObject2.put("streetAddress", this.streetAddress);
        jSONObject2.put("extendedAddress", this.extendedAddress);
        String str = this.countryCode;
        if (str != null) {
            jSONObject2.put(COUNTRY_CODE_ALPHA3_KEY, str);
        }
        if (jSONObject2.length() > 0) {
            jSONObject.put(BILLING_ADDRESS_KEY, jSONObject2);
        }
        buildJSON.put(CREDIT_CARD_KEY, jSONObject);
        return buildJSON;
    }

    protected BaseCard(Parcel parcel) {
        super(parcel);
        this.number = parcel.readString();
        this.cvv = parcel.readString();
        this.expirationMonth = parcel.readString();
        this.expirationYear = parcel.readString();
        this.cardholderName = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.company = parcel.readString();
        this.countryCode = parcel.readString();
        this.locality = parcel.readString();
        this.postalCode = parcel.readString();
        this.region = parcel.readString();
        this.streetAddress = parcel.readString();
        this.extendedAddress = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.number);
        parcel.writeString(this.cvv);
        parcel.writeString(this.expirationMonth);
        parcel.writeString(this.expirationYear);
        parcel.writeString(this.cardholderName);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.company);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.locality);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.region);
        parcel.writeString(this.streetAddress);
        parcel.writeString(this.extendedAddress);
    }
}
