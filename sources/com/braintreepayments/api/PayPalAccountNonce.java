package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

public class PayPalAccountNonce extends PaymentMethodNonce {
    private static final String ACCOUNT_ADDRESS_KEY = "accountAddress";
    static final String API_RESOURCE_KEY = "paypalAccounts";
    private static final String BILLING_ADDRESS_KEY = "billingAddress";
    private static final String CLIENT_METADATA_ID_KEY = "correlationId";
    public static final Parcelable.Creator<PayPalAccountNonce> CREATOR = new Parcelable.Creator<PayPalAccountNonce>() {
        public PayPalAccountNonce createFromParcel(Parcel parcel) {
            return new PayPalAccountNonce(parcel);
        }

        public PayPalAccountNonce[] newArray(int i) {
            return new PayPalAccountNonce[i];
        }
    };
    private static final String CREDIT_FINANCING_KEY = "creditFinancingOffered";
    private static final String DETAILS_KEY = "details";
    private static final String EMAIL_KEY = "email";
    private static final String FIRST_NAME_KEY = "firstName";
    private static final String LAST_NAME_KEY = "lastName";
    private static final String PAYER_ID_KEY = "payerId";
    private static final String PAYER_INFO_KEY = "payerInfo";
    private static final String PAYMENT_METHOD_DATA_KEY = "paymentMethodData";
    private static final String PAYMENT_METHOD_DEFAULT_KEY = "default";
    private static final String PAYMENT_METHOD_NONCE_KEY = "nonce";
    private static final String PHONE_KEY = "phone";
    private static final String SHIPPING_ADDRESS_KEY = "shippingAddress";
    private static final String TOKENIZATION_DATA_KEY = "tokenizationData";
    private static final String TOKEN_KEY = "token";
    private final String authenticateUrl;
    private final PostalAddress billingAddress;
    private final String clientMetadataId;
    private final PayPalCreditFinancing creditFinancing;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String payerId;
    private final String phone;
    private final PostalAddress shippingAddress;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006e A[Catch:{ JSONException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a A[Catch:{ JSONException -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[SYNTHETIC, Splitter:B:29:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.braintreepayments.api.PayPalAccountNonce fromJSON(org.json.JSONObject r21) throws org.json.JSONException {
        /*
            r0 = r21
            java.lang.String r1 = "accountAddress"
            java.lang.String r2 = "shippingAddress"
            java.lang.String r3 = "creditFinancingOffered"
            java.lang.String r4 = ""
            java.lang.String r5 = "paypalAccounts"
            boolean r6 = r0.has(r5)
            r7 = 0
            if (r6 == 0) goto L_0x001d
            org.json.JSONArray r0 = r0.getJSONArray(r5)
            org.json.JSONObject r0 = r0.getJSONObject(r7)
        L_0x001b:
            r5 = r7
            goto L_0x0043
        L_0x001d:
            java.lang.String r6 = "paymentMethodData"
            boolean r8 = r0.has(r6)
            if (r8 == 0) goto L_0x001b
            org.json.JSONObject r8 = new org.json.JSONObject
            org.json.JSONObject r0 = r0.getJSONObject(r6)
            java.lang.String r6 = "tokenizationData"
            org.json.JSONObject r0 = r0.getJSONObject(r6)
            java.lang.String r6 = "token"
            java.lang.String r0 = r0.getString(r6)
            r8.<init>(r0)
            org.json.JSONArray r0 = r8.getJSONArray(r5)
            org.json.JSONObject r0 = r0.getJSONObject(r7)
            r5 = 1
        L_0x0043:
            java.lang.String r6 = "nonce"
            java.lang.String r19 = r0.getString(r6)
            java.lang.String r6 = "default"
            boolean r20 = r0.optBoolean(r6, r7)
            java.lang.String r6 = "authenticateUrl"
            r7 = 0
            java.lang.String r18 = com.braintreepayments.api.Json.optString(r0, r6, r7)
            java.lang.String r6 = "details"
            org.json.JSONObject r6 = r0.getJSONObject(r6)
            java.lang.String r8 = "email"
            java.lang.String r9 = com.braintreepayments.api.Json.optString(r6, r8, r7)
            java.lang.String r10 = "correlationId"
            java.lang.String r10 = com.braintreepayments.api.Json.optString(r6, r10, r7)
            boolean r11 = r6.has(r3)     // Catch:{ JSONException -> 0x00cb }
            if (r11 == 0) goto L_0x0077
            org.json.JSONObject r3 = r6.getJSONObject(r3)     // Catch:{ JSONException -> 0x00cb }
            com.braintreepayments.api.PayPalCreditFinancing r3 = com.braintreepayments.api.PayPalCreditFinancing.fromJson(r3)     // Catch:{ JSONException -> 0x00cb }
            goto L_0x0078
        L_0x0077:
            r3 = r7
        L_0x0078:
            java.lang.String r11 = "payerInfo"
            org.json.JSONObject r6 = r6.getJSONObject(r11)     // Catch:{ JSONException -> 0x00c5 }
            java.lang.String r11 = "billingAddress"
            org.json.JSONObject r11 = r6.optJSONObject(r11)     // Catch:{ JSONException -> 0x00c5 }
            boolean r12 = r6.has(r1)     // Catch:{ JSONException -> 0x00c5 }
            if (r12 == 0) goto L_0x008e
            org.json.JSONObject r11 = r6.optJSONObject(r1)     // Catch:{ JSONException -> 0x00c5 }
        L_0x008e:
            org.json.JSONObject r1 = r6.optJSONObject(r2)     // Catch:{ JSONException -> 0x00c5 }
            com.braintreepayments.api.PostalAddress r1 = com.braintreepayments.api.PostalAddressParser.fromJson(r1)     // Catch:{ JSONException -> 0x00c5 }
            com.braintreepayments.api.PostalAddress r11 = com.braintreepayments.api.PostalAddressParser.fromJson(r11)     // Catch:{ JSONException -> 0x00c5 }
            java.lang.String r12 = "firstName"
            java.lang.String r12 = com.braintreepayments.api.Json.optString(r6, r12, r4)     // Catch:{ JSONException -> 0x00c5 }
            java.lang.String r13 = "lastName"
            java.lang.String r13 = com.braintreepayments.api.Json.optString(r6, r13, r4)     // Catch:{ JSONException -> 0x00c2 }
            java.lang.String r14 = "phone"
            java.lang.String r14 = com.braintreepayments.api.Json.optString(r6, r14, r4)     // Catch:{ JSONException -> 0x00bf }
            java.lang.String r15 = "payerId"
            java.lang.String r4 = com.braintreepayments.api.Json.optString(r6, r15, r4)     // Catch:{ JSONException -> 0x00bd }
            if (r9 != 0) goto L_0x00b8
            java.lang.String r9 = com.braintreepayments.api.Json.optString(r6, r8, r7)     // Catch:{ JSONException -> 0x00c9 }
        L_0x00b8:
            r17 = r3
            r16 = r4
            goto L_0x00df
        L_0x00bd:
            r4 = r7
            goto L_0x00c9
        L_0x00bf:
            r4 = r7
            r14 = r4
            goto L_0x00c9
        L_0x00c2:
            r4 = r7
            r13 = r4
            goto L_0x00c8
        L_0x00c5:
            r4 = r7
            r12 = r4
            r13 = r12
        L_0x00c8:
            r14 = r13
        L_0x00c9:
            r7 = r3
            goto L_0x00cf
        L_0x00cb:
            r4 = r7
            r12 = r4
            r13 = r12
            r14 = r13
        L_0x00cf:
            com.braintreepayments.api.PostalAddress r1 = new com.braintreepayments.api.PostalAddress
            r1.<init>()
            com.braintreepayments.api.PostalAddress r3 = new com.braintreepayments.api.PostalAddress
            r3.<init>()
            r11 = r1
            r1 = r3
            r16 = r4
            r17 = r7
        L_0x00df:
            r15 = r9
            if (r5 == 0) goto L_0x00ed
            org.json.JSONObject r0 = r0.optJSONObject(r2)
            if (r0 == 0) goto L_0x00ed
            com.braintreepayments.api.PostalAddress r0 = com.braintreepayments.api.PostalAddressParser.fromJson(r0)
            goto L_0x00ee
        L_0x00ed:
            r0 = r1
        L_0x00ee:
            com.braintreepayments.api.PayPalAccountNonce r1 = new com.braintreepayments.api.PayPalAccountNonce
            r8 = r1
            r9 = r10
            r10 = r11
            r11 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.PayPalAccountNonce.fromJSON(org.json.JSONObject):com.braintreepayments.api.PayPalAccountNonce");
    }

    private PayPalAccountNonce(String str, PostalAddress postalAddress, PostalAddress postalAddress2, String str2, String str3, String str4, String str5, String str6, PayPalCreditFinancing payPalCreditFinancing, String str7, String str8, boolean z) {
        super(str8, z);
        this.clientMetadataId = str;
        this.billingAddress = postalAddress;
        this.shippingAddress = postalAddress2;
        this.firstName = str2;
        this.lastName = str3;
        this.phone = str4;
        this.email = str5;
        this.payerId = str6;
        this.creditFinancing = payPalCreditFinancing;
        this.authenticateUrl = str7;
    }

    public String getEmail() {
        return this.email;
    }

    public PostalAddress getBillingAddress() {
        return this.billingAddress;
    }

    public PostalAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getClientMetadataId() {
        return this.clientMetadataId;
    }

    public String getPayerId() {
        return this.payerId;
    }

    public PayPalCreditFinancing getCreditFinancing() {
        return this.creditFinancing;
    }

    public String getAuthenticateUrl() {
        return this.authenticateUrl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.clientMetadataId);
        parcel.writeParcelable(this.billingAddress, i);
        parcel.writeParcelable(this.shippingAddress, i);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
        parcel.writeString(this.payerId);
        parcel.writeParcelable(this.creditFinancing, i);
        parcel.writeString(this.authenticateUrl);
    }

    private PayPalAccountNonce(Parcel parcel) {
        super(parcel);
        this.clientMetadataId = parcel.readString();
        this.billingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.shippingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.email = parcel.readString();
        this.phone = parcel.readString();
        this.payerId = parcel.readString();
        this.creditFinancing = (PayPalCreditFinancing) parcel.readParcelable(PayPalCreditFinancing.class.getClassLoader());
        this.authenticateUrl = parcel.readString();
    }
}
