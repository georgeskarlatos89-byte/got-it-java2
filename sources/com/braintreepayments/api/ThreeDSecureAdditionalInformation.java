package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class ThreeDSecureAdditionalInformation implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureAdditionalInformation> CREATOR = new Parcelable.Creator<ThreeDSecureAdditionalInformation>() {
        public ThreeDSecureAdditionalInformation createFromParcel(Parcel parcel) {
            return new ThreeDSecureAdditionalInformation(parcel);
        }

        public ThreeDSecureAdditionalInformation[] newArray(int i) {
            return new ThreeDSecureAdditionalInformation[i];
        }
    };
    private String accountAgeIndicator;
    private String accountChangeDate;
    private String accountChangeIndicator;
    private String accountCreateDate;
    private String accountId;
    private String accountPurchases;
    private String accountPwdChangeDate;
    private String accountPwdChangeIndicator;
    private String addCardAttempts;
    private String addressMatch;
    private String authenticationIndicator;
    private String deliveryEmail;
    private String deliveryTimeframe;
    private String fraudActivity;
    private String giftCardAmount;
    private String giftCardCount;
    private String giftCardCurrencyCode;
    private String installment;
    private String ipAddress;
    private String orderDescription;
    private String paymentAccountAge;
    private String paymentAccountIndicator;
    private String preorderDate;
    private String preorderIndicator;
    private String productCode;
    private String purchaseDate;
    private String recurringEnd;
    private String recurringFrequency;
    private String reorderIndicator;
    private String sdkMaxTimeout;
    private ThreeDSecurePostalAddress shippingAddress;
    private String shippingAddressUsageDate;
    private String shippingAddressUsageIndicator;
    private String shippingMethodIndicator;
    private String shippingNameIndicator;
    private String taxAmount;
    private String transactionCountDay;
    private String transactionCountYear;
    private String userAgent;
    private String workPhoneNumber;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecureAdditionalInformation() {
    }

    public void setShippingAddress(ThreeDSecurePostalAddress threeDSecurePostalAddress) {
        this.shippingAddress = threeDSecurePostalAddress;
    }

    public void setShippingMethodIndicator(String str) {
        this.shippingMethodIndicator = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setDeliveryTimeframe(String str) {
        this.deliveryTimeframe = str;
    }

    public void setDeliveryEmail(String str) {
        this.deliveryEmail = str;
    }

    public void setReorderIndicator(String str) {
        this.reorderIndicator = str;
    }

    public void setPreorderIndicator(String str) {
        this.preorderIndicator = str;
    }

    public void setPreorderDate(String str) {
        this.preorderDate = str;
    }

    public void setGiftCardAmount(String str) {
        this.giftCardAmount = str;
    }

    public void setGiftCardCurrencyCode(String str) {
        this.giftCardCurrencyCode = str;
    }

    public void setGiftCardCount(String str) {
        this.giftCardCount = str;
    }

    public void setAccountAgeIndicator(String str) {
        this.accountAgeIndicator = str;
    }

    public void setAccountCreateDate(String str) {
        this.accountCreateDate = str;
    }

    public void setAccountChangeIndicator(String str) {
        this.accountChangeIndicator = str;
    }

    public void setAccountChangeDate(String str) {
        this.accountChangeDate = str;
    }

    public void setAccountPwdChangeIndicator(String str) {
        this.accountPwdChangeIndicator = str;
    }

    public void setAccountPwdChangeDate(String str) {
        this.accountPwdChangeDate = str;
    }

    public void setShippingAddressUsageIndicator(String str) {
        this.shippingAddressUsageIndicator = str;
    }

    public void setShippingAddressUsageDate(String str) {
        this.shippingAddressUsageDate = str;
    }

    public void setTransactionCountDay(String str) {
        this.transactionCountDay = str;
    }

    public void setTransactionCountYear(String str) {
        this.transactionCountYear = str;
    }

    public void setAddCardAttempts(String str) {
        this.addCardAttempts = str;
    }

    public void setAccountPurchases(String str) {
        this.accountPurchases = str;
    }

    public void setFraudActivity(String str) {
        this.fraudActivity = str;
    }

    public void setShippingNameIndicator(String str) {
        this.shippingNameIndicator = str;
    }

    public void setPaymentAccountIndicator(String str) {
        this.paymentAccountIndicator = str;
    }

    public void setPaymentAccountAge(String str) {
        this.paymentAccountAge = str;
    }

    public void setAddressMatch(String str) {
        this.addressMatch = str;
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public void setOrderDescription(String str) {
        this.orderDescription = str;
    }

    public void setTaxAmount(String str) {
        this.taxAmount = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public void setAuthenticationIndicator(String str) {
        this.authenticationIndicator = str;
    }

    public void setInstallment(String str) {
        this.installment = str;
    }

    public void setPurchaseDate(String str) {
        this.purchaseDate = str;
    }

    public void setRecurringEnd(String str) {
        this.recurringEnd = str;
    }

    public void setRecurringFrequency(String str) {
        this.recurringFrequency = str;
    }

    public void setSdkMaxTimeout(String str) {
        this.sdkMaxTimeout = str;
    }

    public void setWorkPhoneNumber(String str) {
        this.workPhoneNumber = str;
    }

    public ThreeDSecurePostalAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public String getShippingMethodIndicator() {
        return this.shippingMethodIndicator;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getDeliveryTimeframe() {
        return this.deliveryTimeframe;
    }

    public String getDeliveryEmail() {
        return this.deliveryEmail;
    }

    public String getReorderIndicator() {
        return this.reorderIndicator;
    }

    public String getPreorderIndicator() {
        return this.preorderIndicator;
    }

    public String getPreorderDate() {
        return this.preorderDate;
    }

    public String getGiftCardAmount() {
        return this.giftCardAmount;
    }

    public String getGiftCardCurrencyCode() {
        return this.giftCardCurrencyCode;
    }

    public String getGiftCardCount() {
        return this.giftCardCount;
    }

    public String getAccountAgeIndicator() {
        return this.accountAgeIndicator;
    }

    public String getAccountCreateDate() {
        return this.accountCreateDate;
    }

    public String getAccountChangeIndicator() {
        return this.accountChangeIndicator;
    }

    public String getAccountChangeDate() {
        return this.accountChangeDate;
    }

    public String getAccountPwdChangeIndicator() {
        return this.accountPwdChangeIndicator;
    }

    public String getAccountPwdChangeDate() {
        return this.accountPwdChangeDate;
    }

    public String getShippingAddressUsageIndicator() {
        return this.shippingAddressUsageIndicator;
    }

    public String getShippingAddressUsageDate() {
        return this.shippingAddressUsageDate;
    }

    public String getTransactionCountDay() {
        return this.transactionCountDay;
    }

    public String getTransactionCountYear() {
        return this.transactionCountYear;
    }

    public String getAddCardAttempts() {
        return this.addCardAttempts;
    }

    public String getAccountPurchases() {
        return this.accountPurchases;
    }

    public String getFraudActivity() {
        return this.fraudActivity;
    }

    public String getShippingNameIndicator() {
        return this.shippingNameIndicator;
    }

    public String getPaymentAccountIndicator() {
        return this.paymentAccountIndicator;
    }

    public String getPaymentAccountAge() {
        return this.paymentAccountAge;
    }

    public String getAddressMatch() {
        return this.addressMatch;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getOrderDescription() {
        return this.orderDescription;
    }

    public String getTaxAmount() {
        return this.taxAmount;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public String getAuthenticationIndicator() {
        return this.authenticationIndicator;
    }

    public String getInstallment() {
        return this.installment;
    }

    public String getPurchaseDate() {
        return this.purchaseDate;
    }

    public String getRecurringEnd() {
        return this.recurringEnd;
    }

    public String getRecurringFrequency() {
        return this.recurringFrequency;
    }

    public String getSdkMaxTimeout() {
        return this.sdkMaxTimeout;
    }

    public String getWorkPhoneNumber() {
        return this.workPhoneNumber;
    }

    public ThreeDSecureAdditionalInformation(Parcel parcel) {
        this.shippingAddress = (ThreeDSecurePostalAddress) parcel.readParcelable(ThreeDSecurePostalAddress.class.getClassLoader());
        this.shippingMethodIndicator = parcel.readString();
        this.productCode = parcel.readString();
        this.deliveryTimeframe = parcel.readString();
        this.deliveryEmail = parcel.readString();
        this.reorderIndicator = parcel.readString();
        this.preorderIndicator = parcel.readString();
        this.preorderDate = parcel.readString();
        this.giftCardAmount = parcel.readString();
        this.giftCardCurrencyCode = parcel.readString();
        this.giftCardCount = parcel.readString();
        this.accountAgeIndicator = parcel.readString();
        this.accountCreateDate = parcel.readString();
        this.accountChangeIndicator = parcel.readString();
        this.accountChangeDate = parcel.readString();
        this.accountPwdChangeIndicator = parcel.readString();
        this.accountPwdChangeDate = parcel.readString();
        this.shippingAddressUsageIndicator = parcel.readString();
        this.shippingAddressUsageDate = parcel.readString();
        this.transactionCountDay = parcel.readString();
        this.transactionCountYear = parcel.readString();
        this.addCardAttempts = parcel.readString();
        this.accountPurchases = parcel.readString();
        this.fraudActivity = parcel.readString();
        this.shippingNameIndicator = parcel.readString();
        this.paymentAccountIndicator = parcel.readString();
        this.paymentAccountAge = parcel.readString();
        this.addressMatch = parcel.readString();
        this.accountId = parcel.readString();
        this.ipAddress = parcel.readString();
        this.orderDescription = parcel.readString();
        this.taxAmount = parcel.readString();
        this.userAgent = parcel.readString();
        this.authenticationIndicator = parcel.readString();
        this.installment = parcel.readString();
        this.purchaseDate = parcel.readString();
        this.recurringEnd = parcel.readString();
        this.recurringFrequency = parcel.readString();
        this.sdkMaxTimeout = parcel.readString();
        this.workPhoneNumber = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.shippingAddress, i);
        parcel.writeString(this.shippingMethodIndicator);
        parcel.writeString(this.productCode);
        parcel.writeString(this.deliveryTimeframe);
        parcel.writeString(this.deliveryEmail);
        parcel.writeString(this.reorderIndicator);
        parcel.writeString(this.preorderIndicator);
        parcel.writeString(this.preorderDate);
        parcel.writeString(this.giftCardAmount);
        parcel.writeString(this.giftCardCurrencyCode);
        parcel.writeString(this.giftCardCount);
        parcel.writeString(this.accountAgeIndicator);
        parcel.writeString(this.accountCreateDate);
        parcel.writeString(this.accountChangeIndicator);
        parcel.writeString(this.accountChangeDate);
        parcel.writeString(this.accountPwdChangeIndicator);
        parcel.writeString(this.accountPwdChangeDate);
        parcel.writeString(this.shippingAddressUsageIndicator);
        parcel.writeString(this.shippingAddressUsageDate);
        parcel.writeString(this.transactionCountDay);
        parcel.writeString(this.transactionCountYear);
        parcel.writeString(this.addCardAttempts);
        parcel.writeString(this.accountPurchases);
        parcel.writeString(this.fraudActivity);
        parcel.writeString(this.shippingNameIndicator);
        parcel.writeString(this.paymentAccountIndicator);
        parcel.writeString(this.paymentAccountAge);
        parcel.writeString(this.addressMatch);
        parcel.writeString(this.accountId);
        parcel.writeString(this.ipAddress);
        parcel.writeString(this.orderDescription);
        parcel.writeString(this.taxAmount);
        parcel.writeString(this.userAgent);
        parcel.writeString(this.authenticationIndicator);
        parcel.writeString(this.installment);
        parcel.writeString(this.purchaseDate);
        parcel.writeString(this.recurringEnd);
        parcel.writeString(this.recurringFrequency);
        parcel.writeString(this.sdkMaxTimeout);
        parcel.writeString(this.workPhoneNumber);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            ThreeDSecurePostalAddress threeDSecurePostalAddress = this.shippingAddress;
            if (threeDSecurePostalAddress != null) {
                jSONObject.putOpt("shipping_given_name", threeDSecurePostalAddress.getGivenName());
                jSONObject.putOpt("shipping_surname", this.shippingAddress.getSurname());
                jSONObject.putOpt("shipping_phone", this.shippingAddress.getPhoneNumber());
                jSONObject.putOpt("shipping_line1", this.shippingAddress.getStreetAddress());
                jSONObject.putOpt("shipping_line2", this.shippingAddress.getExtendedAddress());
                jSONObject.putOpt("shipping_line3", this.shippingAddress.getLine3());
                jSONObject.putOpt("shipping_city", this.shippingAddress.getLocality());
                jSONObject.putOpt("shipping_state", this.shippingAddress.getRegion());
                jSONObject.putOpt("shipping_postal_code", this.shippingAddress.getPostalCode());
                jSONObject.putOpt("shipping_country_code", this.shippingAddress.getCountryCodeAlpha2());
            }
            jSONObject.putOpt("shipping_method_indicator", this.shippingMethodIndicator);
            jSONObject.putOpt("product_code", this.productCode);
            jSONObject.putOpt("delivery_timeframe", this.deliveryTimeframe);
            jSONObject.putOpt("delivery_email", this.deliveryEmail);
            jSONObject.putOpt("reorder_indicator", this.reorderIndicator);
            jSONObject.putOpt("preorder_indicator", this.preorderIndicator);
            jSONObject.putOpt("preorder_date", this.preorderDate);
            jSONObject.putOpt("gift_card_amount", this.giftCardAmount);
            jSONObject.putOpt("gift_card_currency_code", this.giftCardCurrencyCode);
            jSONObject.putOpt("gift_card_count", this.giftCardCount);
            jSONObject.putOpt("account_age_indicator", this.accountAgeIndicator);
            jSONObject.putOpt("account_create_date", this.accountCreateDate);
            jSONObject.putOpt("account_change_indicator", this.accountChangeIndicator);
            jSONObject.putOpt("account_change_date", this.accountChangeDate);
            jSONObject.putOpt("account_pwd_change_indicator", this.accountPwdChangeIndicator);
            jSONObject.putOpt("account_pwd_change_date", this.accountPwdChangeDate);
            jSONObject.putOpt("shipping_address_usage_indicator", this.shippingAddressUsageIndicator);
            jSONObject.putOpt("shipping_address_usage_date", this.shippingAddressUsageDate);
            jSONObject.putOpt("transaction_count_day", this.transactionCountDay);
            jSONObject.putOpt("transaction_count_year", this.transactionCountYear);
            jSONObject.putOpt("add_card_attempts", this.addCardAttempts);
            jSONObject.putOpt("account_purchases", this.accountPurchases);
            jSONObject.putOpt("fraud_activity", this.fraudActivity);
            jSONObject.putOpt("shipping_name_indicator", this.shippingNameIndicator);
            jSONObject.putOpt("payment_account_indicator", this.paymentAccountIndicator);
            jSONObject.putOpt("payment_account_age", this.paymentAccountAge);
            jSONObject.putOpt("address_match", this.addressMatch);
            jSONObject.putOpt("account_id", this.accountId);
            jSONObject.putOpt("ip_address", this.ipAddress);
            jSONObject.putOpt("order_description", this.orderDescription);
            jSONObject.putOpt("tax_amount", this.taxAmount);
            jSONObject.putOpt("user_agent", this.userAgent);
            jSONObject.putOpt("authentication_indicator", this.authenticationIndicator);
            jSONObject.putOpt("installment", this.installment);
            jSONObject.putOpt("purchase_date", this.purchaseDate);
            jSONObject.putOpt("recurring_end", this.recurringEnd);
            jSONObject.putOpt("recurring_frequency", this.recurringFrequency);
            jSONObject.putOpt("sdk_max_timeout", this.sdkMaxTimeout);
            jSONObject.putOpt("work_phone_number", this.workPhoneNumber);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
