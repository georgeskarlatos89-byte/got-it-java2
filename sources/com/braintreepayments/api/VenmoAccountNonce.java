package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class VenmoAccountNonce extends PaymentMethodNonce {
    private static final String API_RESOURCE_KEY = "venmoAccounts";
    public static final Parcelable.Creator<VenmoAccountNonce> CREATOR = new Parcelable.Creator<VenmoAccountNonce>() {
        public VenmoAccountNonce createFromParcel(Parcel parcel) {
            return new VenmoAccountNonce(parcel);
        }

        public VenmoAccountNonce[] newArray(int i) {
            return new VenmoAccountNonce[i];
        }
    };
    private static final String PAYMENT_METHOD_DEFAULT_KEY = "default";
    private static final String PAYMENT_METHOD_NONCE_KEY = "nonce";
    private static final String VENMO_BILLING_ADDRESS_KEY = "billingAddress";
    private static final String VENMO_DETAILS_KEY = "details";
    private static final String VENMO_EMAIL_KEY = "email";
    private static final String VENMO_EXTERNAL_ID_KEY = "externalId";
    private static final String VENMO_FIRST_NAME_KEY = "firstName";
    private static final String VENMO_LAST_NAME_KEY = "lastName";
    private static final String VENMO_PAYER_INFO_KEY = "payerInfo";
    private static final String VENMO_PAYMENT_METHOD_ID_KEY = "paymentMethodId";
    private static final String VENMO_PAYMENT_METHOD_USERNAME_KEY = "userName";
    private static final String VENMO_PHONE_NUMBER_KEY = "phoneNumber";
    private static final String VENMO_SHIPPING_ADDRESS_KEY = "shippingAddress";
    private static final String VENMO_USERNAME_KEY = "username";
    private PostalAddress billingAddress;
    private String email;
    private String externalId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private PostalAddress shippingAddress;
    private String username;

    static VenmoAccountNonce fromJSON(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        boolean z = false;
        if (jSONObject.has(API_RESOURCE_KEY)) {
            jSONObject = jSONObject.getJSONArray(API_RESOURCE_KEY).getJSONObject(0);
        }
        if (jSONObject.has(VENMO_PAYMENT_METHOD_ID_KEY)) {
            str2 = jSONObject.getString(VENMO_PAYMENT_METHOD_ID_KEY);
            str = jSONObject.getString(VENMO_PAYMENT_METHOD_USERNAME_KEY);
        } else {
            str2 = jSONObject.getString("nonce");
            z = jSONObject.optBoolean("default", false);
            str = jSONObject.getJSONObject(VENMO_DETAILS_KEY).getString("username");
        }
        return new VenmoAccountNonce(str2, str, z, jSONObject);
    }

    VenmoAccountNonce(String str, String str2, boolean z, JSONObject jSONObject) {
        super(str, z);
        this.username = str2;
        JSONObject optJSONObject = jSONObject.optJSONObject(VENMO_PAYER_INFO_KEY);
        if (optJSONObject != null) {
            this.email = optJSONObject.optString("email");
            this.externalId = optJSONObject.optString(VENMO_EXTERNAL_ID_KEY);
            this.firstName = optJSONObject.optString(VENMO_FIRST_NAME_KEY);
            this.lastName = optJSONObject.optString(VENMO_LAST_NAME_KEY);
            this.phoneNumber = optJSONObject.optString("phoneNumber");
            this.billingAddress = PostalAddressParser.fromJson(optJSONObject.optJSONObject(VENMO_BILLING_ADDRESS_KEY));
            this.shippingAddress = PostalAddressParser.fromJson(optJSONObject.optJSONObject(VENMO_SHIPPING_ADDRESS_KEY));
        }
    }

    VenmoAccountNonce(String str, String str2, boolean z) {
        super(str, z);
        this.username = str2;
    }

    public String getEmail() {
        return this.email;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getUsername() {
        return this.username;
    }

    public PostalAddress getBillingAddress() {
        return this.billingAddress;
    }

    public PostalAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.email);
        parcel.writeString(this.externalId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.username);
        parcel.writeParcelable(this.billingAddress, i);
        parcel.writeParcelable(this.shippingAddress, i);
    }

    private VenmoAccountNonce(Parcel parcel) {
        super(parcel);
        this.email = parcel.readString();
        this.externalId = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.phoneNumber = parcel.readString();
        this.username = parcel.readString();
        this.billingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.shippingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
    }
}
