package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PayPalVaultRequest extends PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalVaultRequest> CREATOR = new Parcelable.Creator<PayPalVaultRequest>() {
        public PayPalVaultRequest createFromParcel(Parcel parcel) {
            return new PayPalVaultRequest(parcel);
        }

        public PayPalVaultRequest[] newArray(int i) {
            return new PayPalVaultRequest[i];
        }
    };
    private boolean shouldOfferCredit;
    private String userAuthenticationEmail;

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public PayPalVaultRequest() {
        super(false);
    }

    public PayPalVaultRequest(boolean z) {
        super(z);
    }

    public void setShouldOfferCredit(boolean z) {
        this.shouldOfferCredit = z;
    }

    public boolean getShouldOfferCredit() {
        return this.shouldOfferCredit;
    }

    public void setUserAuthenticationEmail(String str) {
        this.userAuthenticationEmail = str;
    }

    public String getUserAuthenticationEmail() {
        return this.userAuthenticationEmail;
    }

    /* access modifiers changed from: package-private */
    public String createRequestBody(Configuration configuration, Authorization authorization, String str, String str2) throws JSONException {
        JSONObject put = new JSONObject().put("return_url", str).put("cancel_url", str2).put("offer_paypal_credit", this.shouldOfferCredit);
        if (authorization instanceof ClientToken) {
            put.put("authorization_fingerprint", authorization.getBearer());
        } else {
            put.put("client_key", authorization.getBearer());
        }
        String billingAgreementDescription = getBillingAgreementDescription();
        if (!TextUtils.isEmpty(billingAgreementDescription)) {
            put.put("description", billingAgreementDescription);
        }
        put.putOpt("payer_email", this.userAuthenticationEmail);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("no_shipping", !isShippingAddressRequired());
        jSONObject.put("landing_page_type", getLandingPageType());
        String displayName = getDisplayName();
        if (TextUtils.isEmpty(displayName)) {
            displayName = configuration.getPayPalDisplayName();
        }
        jSONObject.put("brand_name", displayName);
        if (getLocaleCode() != null) {
            jSONObject.put("locale_code", getLocaleCode());
        }
        if (getShippingAddressOverride() != null) {
            jSONObject.put("address_override", !isShippingAddressEditable());
            JSONObject jSONObject2 = new JSONObject();
            put.put("shipping_address", jSONObject2);
            PostalAddress shippingAddressOverride = getShippingAddressOverride();
            jSONObject2.put(PostalAddressParser.LINE_1_KEY, shippingAddressOverride.getStreetAddress());
            jSONObject2.put(PostalAddressParser.LINE_2_KEY, shippingAddressOverride.getExtendedAddress());
            jSONObject2.put(PostalAddressParser.LOCALITY_KEY, shippingAddressOverride.getLocality());
            jSONObject2.put("state", shippingAddressOverride.getRegion());
            jSONObject2.put(PostalAddressParser.POSTAL_CODE_UNDERSCORE_KEY, shippingAddressOverride.getPostalCode());
            jSONObject2.put(PostalAddressParser.COUNTRY_CODE_UNDERSCORE_KEY, shippingAddressOverride.getCountryCodeAlpha2());
            jSONObject2.put(PostalAddressParser.RECIPIENT_NAME_UNDERSCORE_KEY, shippingAddressOverride.getRecipientName());
        } else {
            jSONObject.put("address_override", false);
        }
        if (getMerchantAccountId() != null) {
            put.put("merchant_account_id", getMerchantAccountId());
        }
        if (getRiskCorrelationId() != null) {
            put.put("correlation_id", getRiskCorrelationId());
        }
        put.put("experience_profile", jSONObject);
        return put.toString();
    }

    PayPalVaultRequest(Parcel parcel) {
        super(parcel);
        this.shouldOfferCredit = parcel.readByte() != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.shouldOfferCredit ? (byte) 1 : 0);
    }
}
