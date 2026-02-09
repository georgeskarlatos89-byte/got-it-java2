package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class UnionPayCard extends BaseCard implements Parcelable {
    public static final Parcelable.Creator<UnionPayCard> CREATOR = new Parcelable.Creator<UnionPayCard>() {
        public UnionPayCard createFromParcel(Parcel parcel) {
            return new UnionPayCard(parcel);
        }

        public UnionPayCard[] newArray(int i) {
            return new UnionPayCard[i];
        }
    };
    private static final String ENROLLMENT_ID_KEY = "id";
    private static final String MOBILE_COUNTRY_CODE_KEY = "mobileCountryCode";
    private static final String MOBILE_PHONE_NUMBER_KEY = "mobileNumber";
    private static final String SMS_CODE_KEY = "smsCode";
    private static final String UNIONPAY_ENROLLMENT_KEY = "unionPayEnrollment";
    private static final String UNIONPAY_KEY = "creditCard";
    private String enrollmentId;
    private String mobileCountryCode;
    private String mobilePhoneNumber;
    private String smsCode;

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

    public UnionPayCard() {
    }

    public void setMobileCountryCode(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mobileCountryCode = null;
        } else {
            this.mobileCountryCode = str;
        }
    }

    public void setMobilePhoneNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mobilePhoneNumber = null;
        } else {
            this.mobilePhoneNumber = str;
        }
    }

    public void setSmsCode(String str) {
        if (TextUtils.isEmpty(str)) {
            this.smsCode = null;
        } else {
            this.smsCode = str;
        }
    }

    public void setEnrollmentId(String str) {
        if (TextUtils.isEmpty(str)) {
            this.enrollmentId = null;
        } else {
            this.enrollmentId = str;
        }
    }

    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public String getMobilePhoneNumber() {
        return this.mobilePhoneNumber;
    }

    public String getSmsCode() {
        return this.smsCode;
    }

    public String getEnrollmentId() {
        return this.enrollmentId;
    }

    public JSONObject buildEnrollment() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("number", getNumber());
        jSONObject.put("expirationMonth", getExpirationMonth());
        jSONObject.put("expirationYear", getExpirationYear());
        jSONObject.put(MOBILE_COUNTRY_CODE_KEY, this.mobileCountryCode);
        jSONObject.put(MOBILE_PHONE_NUMBER_KEY, this.mobilePhoneNumber);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(UNIONPAY_ENROLLMENT_KEY, jSONObject);
        return jSONObject2;
    }

    public JSONObject buildJSON() throws JSONException {
        JSONObject buildJSON = super.buildJSON();
        JSONObject jSONObject = buildJSON.getJSONObject(UNIONPAY_KEY);
        JSONObject optJSONObject = jSONObject.optJSONObject("options");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            jSONObject.put("options", optJSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(SMS_CODE_KEY, this.smsCode);
        jSONObject2.put("id", this.enrollmentId);
        optJSONObject.put(UNIONPAY_ENROLLMENT_KEY, jSONObject2);
        buildJSON.put(UNIONPAY_KEY, jSONObject);
        return buildJSON;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mobileCountryCode);
        parcel.writeString(this.mobilePhoneNumber);
        parcel.writeString(this.smsCode);
        parcel.writeString(this.enrollmentId);
    }

    protected UnionPayCard(Parcel parcel) {
        super(parcel);
        this.mobileCountryCode = parcel.readString();
        this.mobilePhoneNumber = parcel.readString();
        this.smsCode = parcel.readString();
        this.enrollmentId = parcel.readString();
    }
}
