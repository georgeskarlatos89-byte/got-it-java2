package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class GooglePayRequest implements Parcelable {
    public static final Parcelable.Creator<GooglePayRequest> CREATOR = new Parcelable.Creator<GooglePayRequest>() {
        public GooglePayRequest createFromParcel(Parcel parcel) {
            return new GooglePayRequest(parcel);
        }

        public GooglePayRequest[] newArray(int i) {
            return new GooglePayRequest[i];
        }
    };
    private boolean allowCreditCards = true;
    private boolean allowPrepaidCards;
    private final HashMap<String, JSONArray> allowedAuthMethods = new HashMap<>();
    private final HashMap<String, JSONArray> allowedCardNetworks = new HashMap<>();
    private final HashMap<String, JSONObject> allowedPaymentMethods = new HashMap<>();
    private int billingAddressFormat;
    private boolean billingAddressRequired;
    private String countryCode;
    private boolean emailRequired;
    private String environment;
    private String googleMerchantId;
    private String googleMerchantName;
    private boolean payPalEnabled = true;
    private boolean phoneNumberRequired;
    private boolean shippingAddressRequired;
    private ShippingAddressRequirements shippingAddressRequirements;
    private final HashMap<String, JSONObject> tokenizationSpecifications = new HashMap<>();
    private String totalPriceLabel;
    private TransactionInfo transactionInfo;

    public int describeContents() {
        return 0;
    }

    public GooglePayRequest() {
    }

    public void setTransactionInfo(TransactionInfo transactionInfo2) {
        this.transactionInfo = transactionInfo2;
    }

    public void setEmailRequired(boolean z) {
        this.emailRequired = z;
    }

    public void setPhoneNumberRequired(boolean z) {
        this.phoneNumberRequired = z;
    }

    public void setBillingAddressRequired(boolean z) {
        this.billingAddressRequired = z;
    }

    public void setBillingAddressFormat(int i) {
        this.billingAddressFormat = i;
    }

    public void setShippingAddressRequired(boolean z) {
        this.shippingAddressRequired = z;
    }

    public void setShippingAddressRequirements(ShippingAddressRequirements shippingAddressRequirements2) {
        this.shippingAddressRequirements = shippingAddressRequirements2;
    }

    public void setAllowPrepaidCards(boolean z) {
        this.allowPrepaidCards = z;
    }

    public void setPayPalEnabled(boolean z) {
        this.payPalEnabled = z;
    }

    public void setAllowedPaymentMethod(String str, JSONObject jSONObject) {
        this.allowedPaymentMethods.put(str, jSONObject);
    }

    public void setTokenizationSpecificationForType(String str, JSONObject jSONObject) {
        this.tokenizationSpecifications.put(str, jSONObject);
    }

    public void setAllowedAuthMethods(String str, JSONArray jSONArray) {
        this.allowedAuthMethods.put(str, jSONArray);
    }

    public void setAllowedCardNetworks(String str, JSONArray jSONArray) {
        this.allowedCardNetworks.put(str, jSONArray);
    }

    @Deprecated
    public void setGoogleMerchantId(String str) {
        this.googleMerchantId = str;
    }

    public void setGoogleMerchantName(String str) {
        this.googleMerchantName = str;
    }

    public void setEnvironment(String str) {
        String str2 = "PRODUCTION";
        if (!str2.equals(str.toUpperCase())) {
            str2 = "TEST";
        }
        this.environment = str2;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setAllowCreditCards(boolean z) {
        this.allowCreditCards = z;
    }

    public void setTotalPriceLabel(String str) {
        this.totalPriceLabel = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(4:2|(3:6|7|8)|9|10)|11|12|(1:14)|15|(1:17)|18|(8:23|24|25|(6:27|28|29|30|31|(1:33))|34|54|52|20)|53|35|(5:36|37|(1:39)|40|(1:42))|43|45|46|(1:48)|49|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:2|(3:6|7|8)|9|10) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:27|28|29|30|31|(1:33)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00e7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0037 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068 A[Catch:{ JSONException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed A[Catch:{ JSONException -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b A[Catch:{ JSONException -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x012e A[Catch:{ JSONException -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017d A[Catch:{ JSONException -> 0x0182 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toJson() {
        /*
            r13 = this;
            java.lang.String r0 = "parameters"
            java.lang.String r1 = "billingAddressParameters"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.google.android.gms.wallet.TransactionInfo r3 = r13.getTransactionInfo()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            boolean r6 = r13.isShippingAddressRequired()
            java.lang.String r7 = "phoneNumberRequired"
            if (r6 == 0) goto L_0x003e
            com.google.android.gms.wallet.ShippingAddressRequirements r6 = r13.shippingAddressRequirements
            java.util.ArrayList r6 = r6.getAllowedCountryCodes()
            if (r6 == 0) goto L_0x0037
            int r8 = r6.size()
            if (r8 <= 0) goto L_0x0037
            java.lang.String r8 = "allowedCountryCodes"
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0037 }
            r9.<init>(r6)     // Catch:{ JSONException -> 0x0037 }
            r5.put(r8, r9)     // Catch:{ JSONException -> 0x0037 }
        L_0x0037:
            boolean r6 = r13.isPhoneNumberRequired()     // Catch:{ JSONException -> 0x003e }
            r5.put(r7, r6)     // Catch:{ JSONException -> 0x003e }
        L_0x003e:
            java.lang.String r6 = r13.totalPriceStatusToString()     // Catch:{ JSONException -> 0x006d }
            java.lang.String r8 = "totalPriceStatus"
            org.json.JSONObject r6 = r2.put(r8, r6)     // Catch:{ JSONException -> 0x006d }
            java.lang.String r8 = "totalPrice"
            java.lang.String r9 = r3.getTotalPrice()     // Catch:{ JSONException -> 0x006d }
            org.json.JSONObject r6 = r6.put(r8, r9)     // Catch:{ JSONException -> 0x006d }
            java.lang.String r8 = "currencyCode"
            java.lang.String r3 = r3.getCurrencyCode()     // Catch:{ JSONException -> 0x006d }
            r6.put(r8, r3)     // Catch:{ JSONException -> 0x006d }
            java.lang.String r3 = r13.countryCode     // Catch:{ JSONException -> 0x006d }
            if (r3 == 0) goto L_0x0064
            java.lang.String r6 = "countryCode"
            r2.put(r6, r3)     // Catch:{ JSONException -> 0x006d }
        L_0x0064:
            java.lang.String r3 = r13.totalPriceLabel     // Catch:{ JSONException -> 0x006d }
            if (r3 == 0) goto L_0x006d
            java.lang.String r6 = "totalPriceLabel"
            r2.put(r6, r3)     // Catch:{ JSONException -> 0x006d }
        L_0x006d:
            java.util.HashMap<java.lang.String, org.json.JSONObject> r3 = r13.allowedPaymentMethods
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0077:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x010c
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0077 }
            r8.<init>()     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r9 = "type"
            java.lang.Object r10 = r6.getKey()     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ JSONException -> 0x0077 }
            java.lang.Object r9 = r6.getValue()     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r8 = r8.put(r0, r9)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r9 = "tokenizationSpecification"
            java.util.HashMap<java.lang.String, org.json.JSONObject> r10 = r13.tokenizationSpecifications     // Catch:{ JSONException -> 0x0077 }
            java.lang.Object r11 = r6.getKey()     // Catch:{ JSONException -> 0x0077 }
            java.lang.Object r10 = r10.get(r11)     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r8 = r8.put(r9, r10)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r9 = "CARD"
            java.lang.Object r10 = r6.getKey()     // Catch:{ JSONException -> 0x0077 }
            boolean r9 = r9.equals(r10)     // Catch:{ JSONException -> 0x0077 }
            if (r9 == 0) goto L_0x0107
            org.json.JSONObject r9 = r8.getJSONObject(r0)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r10 = "billingAddressRequired"
            boolean r11 = r13.isBillingAddressRequired()     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r10 = r9.put(r10, r11)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r11 = "allowPrepaidCards"
            boolean r12 = r13.getAllowPrepaidCards()     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r10 = r10.put(r11, r12)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r11 = "allowCreditCards"
            boolean r12 = r13.isCreditCardsAllowed()     // Catch:{ JSONException -> 0x0077 }
            r10.put(r11, r12)     // Catch:{ JSONException -> 0x0077 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ JSONException -> 0x00e7 }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x00e7 }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ JSONException -> 0x00e7 }
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch:{ JSONException -> 0x00e7 }
            r9.put(r1, r6)     // Catch:{ JSONException -> 0x00e7 }
            goto L_0x0107
        L_0x00e7:
            boolean r6 = r13.isBillingAddressRequired()     // Catch:{ JSONException -> 0x0077 }
            if (r6 == 0) goto L_0x0107
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0077 }
            r6.<init>()     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r10 = "format"
            java.lang.String r11 = r13.billingAddressFormatToString()     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r6 = r6.put(r10, r11)     // Catch:{ JSONException -> 0x0077 }
            boolean r10 = r13.isPhoneNumberRequired()     // Catch:{ JSONException -> 0x0077 }
            org.json.JSONObject r6 = r6.put(r7, r10)     // Catch:{ JSONException -> 0x0077 }
            r9.put(r1, r6)     // Catch:{ JSONException -> 0x0077 }
        L_0x0107:
            r4.put(r8)     // Catch:{ JSONException -> 0x0077 }
            goto L_0x0077
        L_0x010c:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r13.getGoogleMerchantId()     // Catch:{ JSONException -> 0x0137 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0137 }
            if (r1 != 0) goto L_0x0124
            java.lang.String r1 = "merchantId"
            java.lang.String r3 = r13.getGoogleMerchantId()     // Catch:{ JSONException -> 0x0137 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0137 }
        L_0x0124:
            java.lang.String r1 = r13.getGoogleMerchantName()     // Catch:{ JSONException -> 0x0137 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0137 }
            if (r1 != 0) goto L_0x0137
            java.lang.String r1 = "merchantName"
            java.lang.String r3 = r13.getGoogleMerchantName()     // Catch:{ JSONException -> 0x0137 }
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0137 }
        L_0x0137:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "apiVersion"
            r6 = 2
            org.json.JSONObject r3 = r1.put(r3, r6)     // Catch:{ JSONException -> 0x0182 }
            java.lang.String r6 = "apiVersionMinor"
            r7 = 0
            org.json.JSONObject r3 = r3.put(r6, r7)     // Catch:{ JSONException -> 0x0182 }
            java.lang.String r6 = "allowedPaymentMethods"
            org.json.JSONObject r3 = r3.put(r6, r4)     // Catch:{ JSONException -> 0x0182 }
            java.lang.String r4 = "emailRequired"
            boolean r6 = r13.isEmailRequired()     // Catch:{ JSONException -> 0x0182 }
            org.json.JSONObject r3 = r3.put(r4, r6)     // Catch:{ JSONException -> 0x0182 }
            java.lang.String r4 = "shippingAddressRequired"
            boolean r6 = r13.isShippingAddressRequired()     // Catch:{ JSONException -> 0x0182 }
            org.json.JSONObject r3 = r3.put(r4, r6)     // Catch:{ JSONException -> 0x0182 }
            java.lang.String r4 = "environment"
            java.lang.String r6 = r13.environment     // Catch:{ JSONException -> 0x0182 }
            org.json.JSONObject r3 = r3.put(r4, r6)     // Catch:{ JSONException -> 0x0182 }
            java.lang.String r4 = "merchantInfo"
            org.json.JSONObject r0 = r3.put(r4, r0)     // Catch:{ JSONException -> 0x0182 }
            java.lang.String r3 = "transactionInfo"
            r0.put(r3, r2)     // Catch:{ JSONException -> 0x0182 }
            boolean r0 = r13.isShippingAddressRequired()     // Catch:{ JSONException -> 0x0182 }
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = "shippingAddressParameters"
            r1.put(r0, r5)     // Catch:{ JSONException -> 0x0182 }
        L_0x0182:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.GooglePayRequest.toJson():java.lang.String");
    }

    private String totalPriceStatusToString() {
        int totalPriceStatus = getTransactionInfo().getTotalPriceStatus();
        if (totalPriceStatus != 1) {
            return totalPriceStatus != 2 ? "FINAL" : "ESTIMATED";
        }
        return "NOT_CURRENTLY_KNOWN";
    }

    public String billingAddressFormatToString() {
        return this.billingAddressFormat == 1 ? "FULL" : "MIN";
    }

    public TransactionInfo getTransactionInfo() {
        return this.transactionInfo;
    }

    public boolean isEmailRequired() {
        return this.emailRequired;
    }

    public boolean isPhoneNumberRequired() {
        return this.phoneNumberRequired;
    }

    public boolean isBillingAddressRequired() {
        return this.billingAddressRequired;
    }

    public int getBillingAddressFormat() {
        return this.billingAddressFormat;
    }

    public boolean isShippingAddressRequired() {
        return this.shippingAddressRequired;
    }

    public ShippingAddressRequirements getShippingAddressRequirements() {
        return this.shippingAddressRequirements;
    }

    public boolean getAllowPrepaidCards() {
        return this.allowPrepaidCards;
    }

    public boolean isPayPalEnabled() {
        return this.payPalEnabled;
    }

    public JSONObject getAllowedPaymentMethod(String str) {
        return this.allowedPaymentMethods.get(str);
    }

    public JSONObject getTokenizationSpecificationForType(String str) {
        return this.tokenizationSpecifications.get(str);
    }

    public JSONArray getAllowedAuthMethodsForType(String str) {
        return this.allowedAuthMethods.get(str);
    }

    public JSONArray getAllowedCardNetworksForType(String str) {
        return this.allowedCardNetworks.get(str);
    }

    public String getEnvironment() {
        return this.environment;
    }

    @Deprecated
    public String getGoogleMerchantId() {
        return this.googleMerchantId;
    }

    public String getGoogleMerchantName() {
        return this.googleMerchantName;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean isCreditCardsAllowed() {
        return this.allowCreditCards;
    }

    public String getTotalPriceLabel() {
        return this.totalPriceLabel;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.transactionInfo, i);
        parcel.writeByte(this.emailRequired ? (byte) 1 : 0);
        parcel.writeByte(this.phoneNumberRequired ? (byte) 1 : 0);
        parcel.writeByte(this.billingAddressRequired ? (byte) 1 : 0);
        parcel.writeInt(this.billingAddressFormat);
        parcel.writeByte(this.shippingAddressRequired ? (byte) 1 : 0);
        parcel.writeParcelable(this.shippingAddressRequirements, i);
        parcel.writeByte(this.allowPrepaidCards ? (byte) 1 : 0);
        parcel.writeByte(this.payPalEnabled ? (byte) 1 : 0);
        parcel.writeString(this.environment);
        parcel.writeString(this.googleMerchantId);
        parcel.writeString(this.googleMerchantName);
        parcel.writeString(this.countryCode);
        parcel.writeByte(this.allowCreditCards ? (byte) 1 : 0);
        parcel.writeString(this.totalPriceLabel);
    }

    GooglePayRequest(Parcel parcel) {
        boolean z = true;
        this.transactionInfo = (TransactionInfo) parcel.readParcelable(TransactionInfo.class.getClassLoader());
        this.emailRequired = parcel.readByte() != 0;
        this.phoneNumberRequired = parcel.readByte() != 0;
        this.billingAddressRequired = parcel.readByte() != 0;
        this.billingAddressFormat = parcel.readInt();
        this.shippingAddressRequired = parcel.readByte() != 0;
        this.shippingAddressRequirements = (ShippingAddressRequirements) parcel.readParcelable(ShippingAddressRequirements.class.getClassLoader());
        this.allowPrepaidCards = parcel.readByte() != 0;
        this.payPalEnabled = parcel.readByte() != 0;
        this.environment = parcel.readString();
        this.googleMerchantId = parcel.readString();
        this.googleMerchantName = parcel.readString();
        this.countryCode = parcel.readString();
        this.allowCreditCards = parcel.readByte() == 0 ? false : z;
        this.totalPriceLabel = parcel.readString();
    }
}
