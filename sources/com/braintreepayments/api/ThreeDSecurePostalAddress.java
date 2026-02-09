package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreeDSecurePostalAddress implements Parcelable {
    protected static final String BILLING_ADDRESS_KEY = "billingAddress";
    protected static final String COUNTRY_CODE_ALPHA_2_KEY = "countryCode";
    public static final Parcelable.Creator<ThreeDSecurePostalAddress> CREATOR = new Parcelable.Creator<ThreeDSecurePostalAddress>() {
        public ThreeDSecurePostalAddress createFromParcel(Parcel parcel) {
            return new ThreeDSecurePostalAddress(parcel);
        }

        public ThreeDSecurePostalAddress[] newArray(int i) {
            return new ThreeDSecurePostalAddress[i];
        }
    };
    protected static final String EXTENDED_ADDRESS_KEY = "line2";
    protected static final String FIRST_NAME_KEY = "firstName";
    protected static final String LAST_NAME_KEY = "lastName";
    protected static final String LINE_3_KEY = "line3";
    protected static final String LOCALITY_KEY = "city";
    protected static final String PHONE_NUMBER_KEY = "phoneNumber";
    protected static final String POSTAL_CODE_KEY = "postalCode";
    protected static final String REGION_KEY = "state";
    protected static final String STREET_ADDRESS_KEY = "line1";
    private String countryCodeAlpha2;
    private String extendedAddress;
    private String givenName;
    private String line3;
    private String locality;
    private String phoneNumber;
    private String postalCode;
    private String region;
    private String streetAddress;
    private String surname;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecurePostalAddress() {
    }

    public void setGivenName(String str) {
        this.givenName = str;
    }

    public void setSurname(String str) {
        this.surname = str;
    }

    public void setStreetAddress(String str) {
        this.streetAddress = str;
    }

    public void setExtendedAddress(String str) {
        this.extendedAddress = str;
    }

    public void setLine3(String str) {
        this.line3 = str;
    }

    public void setLocality(String str) {
        this.locality = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public void setCountryCodeAlpha2(String str) {
        this.countryCodeAlpha2 = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public String getExtendedAddress() {
        return this.extendedAddress;
    }

    public String getLine3() {
        return this.line3;
    }

    public String getLocality() {
        return this.locality;
    }

    public String getRegion() {
        return this.region;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCountryCodeAlpha2() {
        return this.countryCodeAlpha2;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ThreeDSecurePostalAddress(Parcel parcel) {
        this.givenName = parcel.readString();
        this.surname = parcel.readString();
        this.streetAddress = parcel.readString();
        this.extendedAddress = parcel.readString();
        this.line3 = parcel.readString();
        this.locality = parcel.readString();
        this.region = parcel.readString();
        this.postalCode = parcel.readString();
        this.countryCodeAlpha2 = parcel.readString();
        this.phoneNumber = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.givenName);
        parcel.writeString(this.surname);
        parcel.writeString(this.streetAddress);
        parcel.writeString(this.extendedAddress);
        parcel.writeString(this.line3);
        parcel.writeString(this.locality);
        parcel.writeString(this.region);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.countryCodeAlpha2);
        parcel.writeString(this.phoneNumber);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt(FIRST_NAME_KEY, this.givenName);
            jSONObject.putOpt(LAST_NAME_KEY, this.surname);
            jSONObject.putOpt("phoneNumber", this.phoneNumber);
            jSONObject2.putOpt("line1", this.streetAddress);
            jSONObject2.putOpt("line2", this.extendedAddress);
            jSONObject2.putOpt(LINE_3_KEY, this.line3);
            jSONObject2.putOpt("city", this.locality);
            jSONObject2.putOpt("state", this.region);
            jSONObject2.putOpt("postalCode", this.postalCode);
            jSONObject2.putOpt("countryCode", this.countryCodeAlpha2);
            if (jSONObject2.length() != 0) {
                jSONObject.putOpt(BILLING_ADDRESS_KEY, jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
