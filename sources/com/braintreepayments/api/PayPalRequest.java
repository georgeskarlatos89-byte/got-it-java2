package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONException;

public abstract class PayPalRequest implements Parcelable {
    static final String ADDRESS_OVERRIDE_KEY = "address_override";
    static final String AMOUNT_KEY = "amount";
    static final String AUTHORIZATION_FINGERPRINT_KEY = "authorization_fingerprint";
    static final String BILLING_AGREEMENT_DETAILS_KEY = "billing_agreement_details";
    static final String CANCEL_URL_KEY = "cancel_url";
    static final String CORRELATION_ID_KEY = "correlation_id";
    static final String CURRENCY_ISO_CODE_KEY = "currency_iso_code";
    static final String DESCRIPTION_KEY = "description";
    static final String DISPLAY_NAME_KEY = "brand_name";
    static final String EXPERIENCE_PROFILE_KEY = "experience_profile";
    static final String INTENT_KEY = "intent";
    public static final String LANDING_PAGE_TYPE_BILLING = "billing";
    static final String LANDING_PAGE_TYPE_KEY = "landing_page_type";
    public static final String LANDING_PAGE_TYPE_LOGIN = "login";
    static final String LINE_ITEMS_KEY = "line_items";
    static final String LOCALE_CODE_KEY = "locale_code";
    static final String MERCHANT_ACCOUNT_ID = "merchant_account_id";
    static final String NO_SHIPPING_KEY = "no_shipping";
    static final String OFFER_CREDIT_KEY = "offer_paypal_credit";
    static final String OFFER_PAY_LATER_KEY = "offer_pay_later";
    static final String PAYER_EMAIL_KEY = "payer_email";
    static final String REQUEST_BILLING_AGREEMENT_KEY = "request_billing_agreement";
    static final String RETURN_URL_KEY = "return_url";
    static final String SHIPPING_ADDRESS_KEY = "shipping_address";
    static final String TOKENIZATION_KEY = "client_key";
    static final String USER_ACTION_KEY = "user_action";
    private String billingAgreementDescription;
    private String displayName;
    private final boolean hasUserLocationConsent;
    private String landingPageType;
    private final ArrayList<PayPalLineItem> lineItems;
    private String localeCode;
    private String merchantAccountId;
    private String riskCorrelationId;
    private boolean shippingAddressEditable;
    private PostalAddress shippingAddressOverride;
    private boolean shippingAddressRequired;

    /* access modifiers changed from: package-private */
    public abstract String createRequestBody(Configuration configuration, Authorization authorization, String str, String str2) throws JSONException;

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public PayPalRequest() {
        this.shippingAddressEditable = false;
        this.shippingAddressRequired = false;
        this.lineItems = new ArrayList<>();
        this.hasUserLocationConsent = false;
    }

    public PayPalRequest(boolean z) {
        this.shippingAddressEditable = false;
        this.shippingAddressRequired = false;
        this.lineItems = new ArrayList<>();
        this.hasUserLocationConsent = z;
    }

    public void setShippingAddressRequired(boolean z) {
        this.shippingAddressRequired = z;
    }

    public void setShippingAddressEditable(boolean z) {
        this.shippingAddressEditable = z;
    }

    public void setLocaleCode(String str) {
        this.localeCode = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setBillingAgreementDescription(String str) {
        this.billingAgreementDescription = str;
    }

    public void setShippingAddressOverride(PostalAddress postalAddress) {
        this.shippingAddressOverride = postalAddress;
    }

    public void setLandingPageType(String str) {
        this.landingPageType = str;
    }

    public void setMerchantAccountId(String str) {
        this.merchantAccountId = str;
    }

    public void setRiskCorrelationId(String str) {
        this.riskCorrelationId = str;
    }

    public void setLineItems(Collection<PayPalLineItem> collection) {
        this.lineItems.clear();
        this.lineItems.addAll(collection);
    }

    public String getLocaleCode() {
        return this.localeCode;
    }

    public String getBillingAgreementDescription() {
        return this.billingAgreementDescription;
    }

    public boolean isShippingAddressRequired() {
        return this.shippingAddressRequired;
    }

    public boolean isShippingAddressEditable() {
        return this.shippingAddressEditable;
    }

    public PostalAddress getShippingAddressOverride() {
        return this.shippingAddressOverride;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getMerchantAccountId() {
        return this.merchantAccountId;
    }

    public String getRiskCorrelationId() {
        return this.riskCorrelationId;
    }

    public ArrayList<PayPalLineItem> getLineItems() {
        return this.lineItems;
    }

    public String getLandingPageType() {
        return this.landingPageType;
    }

    public boolean hasUserLocationConsent() {
        return this.hasUserLocationConsent;
    }

    protected PayPalRequest(Parcel parcel) {
        boolean z = false;
        this.shippingAddressEditable = false;
        this.localeCode = parcel.readString();
        this.billingAgreementDescription = parcel.readString();
        this.shippingAddressRequired = parcel.readByte() != 0;
        this.shippingAddressEditable = parcel.readByte() != 0;
        this.shippingAddressOverride = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.landingPageType = parcel.readString();
        this.displayName = parcel.readString();
        this.merchantAccountId = parcel.readString();
        this.riskCorrelationId = parcel.readString();
        this.lineItems = parcel.createTypedArrayList(PayPalLineItem.CREATOR);
        this.hasUserLocationConsent = parcel.readByte() != 0 ? true : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.localeCode);
        parcel.writeString(this.billingAgreementDescription);
        parcel.writeByte(this.shippingAddressRequired ? (byte) 1 : 0);
        parcel.writeByte(this.shippingAddressEditable ? (byte) 1 : 0);
        parcel.writeParcelable(this.shippingAddressOverride, i);
        parcel.writeString(this.landingPageType);
        parcel.writeString(this.displayName);
        parcel.writeString(this.merchantAccountId);
        parcel.writeString(this.riskCorrelationId);
        parcel.writeTypedList(this.lineItems);
        parcel.writeByte(this.hasUserLocationConsent ? (byte) 1 : 0);
    }
}
