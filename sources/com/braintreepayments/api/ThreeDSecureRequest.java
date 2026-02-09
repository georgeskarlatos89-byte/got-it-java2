package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreeDSecureRequest implements Parcelable {
    public static final int BOTH = 3;
    public static final Parcelable.Creator<ThreeDSecureRequest> CREATOR = new Parcelable.Creator<ThreeDSecureRequest>() {
        public ThreeDSecureRequest createFromParcel(Parcel parcel) {
            return new ThreeDSecureRequest(parcel);
        }

        public ThreeDSecureRequest[] newArray(int i) {
            return new ThreeDSecureRequest[i];
        }
    };
    public static final String CREDIT = "credit";
    public static final String DEBIT = "debit";
    public static final int HTML = 2;
    public static final String LOW_VALUE = "low_value";
    public static final int MULTI_SELECT = 3;
    public static final int NATIVE = 1;
    public static final int OOB = 4;
    public static final int OTP = 1;
    public static final int RENDER_HTML = 5;
    public static final String SECURE_CORPORATE = "secure_corporate";
    public static final int SINGLE_SELECT = 2;
    public static final String TRANSACTION_RISK_ANALYSIS = "transaction_risk_analysis";
    public static final String TRUSTED_BENEFICIARY = "trusted_beneficiary";
    public static final String VERSION_1 = "1";
    public static final String VERSION_2 = "2";
    private String accountType;
    private ThreeDSecureAdditionalInformation additionalInformation;
    private String amount;
    private ThreeDSecurePostalAddress billingAddress;
    private Boolean cardAddChallengeRequested;
    private boolean challengeRequested;
    private boolean dataOnlyRequested;
    private String email;
    private boolean exemptionRequested;
    private String mobilePhoneNumber;
    private String nonce;
    private List<Integer> renderTypes;
    private String requestedExemptionType;
    private int shippingMethod;
    private int uiType;
    private ThreeDSecureV1UiCustomization v1UiCustomization;
    private ThreeDSecureV2UiCustomization v2UiCustomization;
    private String versionRequested;

    public int describeContents() {
        return 0;
    }

    public void setNonce(String str) {
        this.nonce = str;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setMobilePhoneNumber(String str) {
        this.mobilePhoneNumber = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setShippingMethod(int i) {
        this.shippingMethod = i;
    }

    public void setBillingAddress(ThreeDSecurePostalAddress threeDSecurePostalAddress) {
        this.billingAddress = threeDSecurePostalAddress;
    }

    public void setVersionRequested(String str) {
        this.versionRequested = str;
    }

    public void setAccountType(String str) {
        this.accountType = str;
    }

    public void setAdditionalInformation(ThreeDSecureAdditionalInformation threeDSecureAdditionalInformation) {
        this.additionalInformation = threeDSecureAdditionalInformation;
    }

    public void setChallengeRequested(boolean z) {
        this.challengeRequested = z;
    }

    public void setDataOnlyRequested(boolean z) {
        this.dataOnlyRequested = z;
    }

    public void setExemptionRequested(boolean z) {
        this.exemptionRequested = z;
    }

    public void setRequestedExemptionType(String str) {
        this.requestedExemptionType = str;
    }

    public void setCardAddChallengeRequested(Boolean bool) {
        this.cardAddChallengeRequested = bool;
    }

    public void setV2UiCustomization(ThreeDSecureV2UiCustomization threeDSecureV2UiCustomization) {
        this.v2UiCustomization = threeDSecureV2UiCustomization;
    }

    public void setV1UiCustomization(ThreeDSecureV1UiCustomization threeDSecureV1UiCustomization) {
        this.v1UiCustomization = threeDSecureV1UiCustomization;
    }

    public void setUiType(int i) {
        this.uiType = i;
    }

    public void setRenderTypes(List<Integer> list) {
        this.renderTypes = list;
    }

    public String getNonce() {
        return this.nonce;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getMobilePhoneNumber() {
        return this.mobilePhoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public int getShippingMethod() {
        return this.shippingMethod;
    }

    public ThreeDSecurePostalAddress getBillingAddress() {
        return this.billingAddress;
    }

    public String getVersionRequested() {
        return this.versionRequested;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public ThreeDSecureAdditionalInformation getAdditionalInformation() {
        return this.additionalInformation;
    }

    public boolean isChallengeRequested() {
        return this.challengeRequested;
    }

    public boolean isDataOnlyRequested() {
        return this.dataOnlyRequested;
    }

    public boolean isExemptionRequested() {
        return this.exemptionRequested;
    }

    public String getRequestedExemptionType() {
        return this.requestedExemptionType;
    }

    public Boolean isCardAddChallengeRequested() {
        return this.cardAddChallengeRequested;
    }

    public ThreeDSecureV2UiCustomization getV2UiCustomization() {
        return this.v2UiCustomization;
    }

    public ThreeDSecureV1UiCustomization getV1UiCustomization() {
        return this.v1UiCustomization;
    }

    public int getUiType() {
        return this.uiType;
    }

    public List<Integer> getRenderTypes() {
        return this.renderTypes;
    }

    public ThreeDSecureRequest() {
        this.versionRequested = "2";
        this.challengeRequested = false;
        this.dataOnlyRequested = false;
        this.exemptionRequested = false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nonce);
        parcel.writeString(this.amount);
        parcel.writeString(this.mobilePhoneNumber);
        parcel.writeString(this.email);
        parcel.writeInt(this.shippingMethod);
        parcel.writeParcelable(this.billingAddress, i);
        parcel.writeString(this.versionRequested);
        parcel.writeParcelable(this.additionalInformation, i);
        parcel.writeByte(this.challengeRequested ? (byte) 1 : 0);
        parcel.writeByte(this.dataOnlyRequested ? (byte) 1 : 0);
        parcel.writeByte(this.exemptionRequested ? (byte) 1 : 0);
        parcel.writeString(this.requestedExemptionType);
        parcel.writeSerializable(this.cardAddChallengeRequested);
        parcel.writeParcelable(this.v2UiCustomization, i);
        parcel.writeParcelable(this.v1UiCustomization, i);
        parcel.writeString(this.accountType);
    }

    public ThreeDSecureRequest(Parcel parcel) {
        this.versionRequested = "2";
        boolean z = false;
        this.challengeRequested = false;
        this.dataOnlyRequested = false;
        this.exemptionRequested = false;
        this.nonce = parcel.readString();
        this.amount = parcel.readString();
        this.mobilePhoneNumber = parcel.readString();
        this.email = parcel.readString();
        this.shippingMethod = parcel.readInt();
        this.billingAddress = (ThreeDSecurePostalAddress) parcel.readParcelable(ThreeDSecurePostalAddress.class.getClassLoader());
        this.versionRequested = parcel.readString();
        this.additionalInformation = (ThreeDSecureAdditionalInformation) parcel.readParcelable(ThreeDSecureAdditionalInformation.class.getClassLoader());
        this.challengeRequested = parcel.readByte() > 0;
        this.dataOnlyRequested = parcel.readByte() > 0;
        this.exemptionRequested = parcel.readByte() > 0 ? true : z;
        this.requestedExemptionType = parcel.readString();
        this.cardAddChallengeRequested = (Boolean) parcel.readSerializable();
        this.v2UiCustomization = (ThreeDSecureV2UiCustomization) parcel.readParcelable(ThreeDSecureV2UiCustomization.class.getClassLoader());
        this.v1UiCustomization = (ThreeDSecureV1UiCustomization) parcel.readParcelable(ThreeDSecureV1UiCustomization.class.getClassLoader());
        this.accountType = parcel.readString();
    }

    public String build(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        ThreeDSecurePostalAddress billingAddress2 = getBillingAddress();
        if (getAdditionalInformation() == null) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = getAdditionalInformation().toJson();
        }
        try {
            jSONObject2.put("amount", this.amount);
            jSONObject2.put("additional_info", jSONObject);
            jSONObject2.putOpt("account_type", this.accountType);
            Boolean bool = this.cardAddChallengeRequested;
            if (bool != null) {
                jSONObject2.put("card_add", bool);
            }
            jSONObject.putOpt("mobile_phone_number", getMobilePhoneNumber());
            jSONObject.putOpt("shipping_method", getShippingMethodAsString());
            jSONObject.putOpt("email", getEmail());
            if (billingAddress2 != null) {
                jSONObject.putOpt("billing_given_name", billingAddress2.getGivenName());
                jSONObject.putOpt("billing_surname", billingAddress2.getSurname());
                jSONObject.putOpt("billing_line1", billingAddress2.getStreetAddress());
                jSONObject.putOpt("billing_line2", billingAddress2.getExtendedAddress());
                jSONObject.putOpt("billing_line3", billingAddress2.getLine3());
                jSONObject.putOpt("billing_city", billingAddress2.getLocality());
                jSONObject.putOpt("billing_state", billingAddress2.getRegion());
                jSONObject.putOpt("billing_postal_code", billingAddress2.getPostalCode());
                jSONObject.putOpt("billing_country_code", billingAddress2.getCountryCodeAlpha2());
                jSONObject.putOpt("billing_phone_number", billingAddress2.getPhoneNumber());
            }
            if ("2".equals(getVersionRequested())) {
                jSONObject2.putOpt("df_reference_id", str);
            }
            jSONObject2.put("challenge_requested", this.challengeRequested);
            jSONObject2.put("data_only_requested", this.dataOnlyRequested);
            jSONObject2.put("exemption_requested", this.exemptionRequested);
            jSONObject2.put("requested_exemption_type", this.requestedExemptionType);
        } catch (JSONException unused) {
        }
        return jSONObject2.toString();
    }

    private String getShippingMethodAsString() {
        switch (this.shippingMethod) {
            case 1:
                return "01";
            case 2:
                return ThreeDSStrings.RENDER_TYPE_SINGLE_SELECT;
            case 3:
                return ThreeDSStrings.RENDER_TYPE_MULTI_SELECT;
            case 4:
                return ThreeDSStrings.RENDER_TYPE_OOB;
            case 5:
                return ThreeDSStrings.RENDER_TYPE_HTML;
            case 6:
                return "06";
            default:
                return null;
        }
    }
}
