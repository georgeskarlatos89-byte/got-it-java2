package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PayPalCheckoutRequest extends PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalCheckoutRequest> CREATOR = new Parcelable.Creator<PayPalCheckoutRequest>() {
        public PayPalCheckoutRequest createFromParcel(Parcel parcel) {
            return new PayPalCheckoutRequest(parcel);
        }

        public PayPalCheckoutRequest[] newArray(int i) {
            return new PayPalCheckoutRequest[i];
        }
    };
    public static final String USER_ACTION_COMMIT = "commit";
    public static final String USER_ACTION_DEFAULT = "";
    private final String amount;
    private String currencyCode;
    private String intent;
    private boolean shouldOfferPayLater;
    private boolean shouldRequestBillingAgreement;
    private String userAction;

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public PayPalCheckoutRequest(String str) {
        this(str, false);
    }

    public PayPalCheckoutRequest(String str, boolean z) {
        super(z);
        this.intent = PayPalPaymentIntent.AUTHORIZE;
        this.userAction = "";
        this.amount = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setIntent(String str) {
        this.intent = str;
    }

    public void setUserAction(String str) {
        this.userAction = str;
    }

    public void setShouldOfferPayLater(boolean z) {
        this.shouldOfferPayLater = z;
    }

    public void setShouldRequestBillingAgreement(boolean z) {
        this.shouldRequestBillingAgreement = z;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getIntent() {
        return this.intent;
    }

    public String getUserAction() {
        return this.userAction;
    }

    public boolean getShouldOfferPayLater() {
        return this.shouldOfferPayLater;
    }

    public boolean getShouldRequestBillingAgreement() {
        return this.shouldRequestBillingAgreement;
    }

    /* access modifiers changed from: package-private */
    public String createRequestBody(Configuration configuration, Authorization authorization, String str, String str2) throws JSONException {
        JSONObject put = new JSONObject().put("return_url", str).put("cancel_url", str2).put("offer_pay_later", this.shouldOfferPayLater);
        if (authorization instanceof ClientToken) {
            put.put("authorization_fingerprint", authorization.getBearer());
        } else {
            put.put("client_key", authorization.getBearer());
        }
        if (this.shouldRequestBillingAgreement) {
            put.put("request_billing_agreement", true);
        }
        String billingAgreementDescription = getBillingAgreementDescription();
        if (this.shouldRequestBillingAgreement && !TextUtils.isEmpty(billingAgreementDescription)) {
            put.put("billing_agreement_details", new JSONObject().put("description", billingAgreementDescription));
        }
        String currencyCode2 = getCurrencyCode();
        if (currencyCode2 == null) {
            currencyCode2 = configuration.getPayPalCurrencyIsoCode();
        }
        put.put("amount", this.amount).put("currency_iso_code", currencyCode2).put(SDKConstants.PARAM_INTENT, this.intent);
        if (!getLineItems().isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<PayPalLineItem> it = getLineItems().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJson());
            }
            put.put("line_items", jSONArray);
        }
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
        if (getUserAction() != "") {
            jSONObject.put("user_action", getUserAction());
        }
        if (getShippingAddressOverride() != null) {
            jSONObject.put("address_override", !isShippingAddressEditable());
            PostalAddress shippingAddressOverride = getShippingAddressOverride();
            put.put(PostalAddressParser.LINE_1_KEY, shippingAddressOverride.getStreetAddress());
            put.put(PostalAddressParser.LINE_2_KEY, shippingAddressOverride.getExtendedAddress());
            put.put(PostalAddressParser.LOCALITY_KEY, shippingAddressOverride.getLocality());
            put.put("state", shippingAddressOverride.getRegion());
            put.put(PostalAddressParser.POSTAL_CODE_UNDERSCORE_KEY, shippingAddressOverride.getPostalCode());
            put.put(PostalAddressParser.COUNTRY_CODE_UNDERSCORE_KEY, shippingAddressOverride.getCountryCodeAlpha2());
            put.put(PostalAddressParser.RECIPIENT_NAME_UNDERSCORE_KEY, shippingAddressOverride.getRecipientName());
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

    PayPalCheckoutRequest(Parcel parcel) {
        super(parcel);
        this.intent = PayPalPaymentIntent.AUTHORIZE;
        this.userAction = "";
        this.intent = parcel.readString();
        this.userAction = parcel.readString();
        this.amount = parcel.readString();
        this.currencyCode = parcel.readString();
        boolean z = true;
        this.shouldRequestBillingAgreement = parcel.readByte() != 0;
        this.shouldOfferPayLater = parcel.readByte() == 0 ? false : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.intent);
        parcel.writeString(this.userAction);
        parcel.writeString(this.amount);
        parcel.writeString(this.currencyCode);
        parcel.writeByte(this.shouldRequestBillingAgreement ? (byte) 1 : 0);
        parcel.writeByte(this.shouldOfferPayLater ? (byte) 1 : 0);
    }
}
