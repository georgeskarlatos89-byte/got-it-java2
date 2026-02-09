package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

public class PayPalCreditFinancingAmount implements Parcelable {
    public static final Parcelable.Creator<PayPalCreditFinancingAmount> CREATOR = new Parcelable.Creator<PayPalCreditFinancingAmount>() {
        public PayPalCreditFinancingAmount createFromParcel(Parcel parcel) {
            return new PayPalCreditFinancingAmount(parcel);
        }

        public PayPalCreditFinancingAmount[] newArray(int i) {
            return new PayPalCreditFinancingAmount[i];
        }
    };
    private static final String CURRENCY_KEY = "currency";
    private static final String VALUE_KEY = "value";
    private String currency;
    private String value;

    public int describeContents() {
        return 0;
    }

    private PayPalCreditFinancingAmount() {
    }

    static PayPalCreditFinancingAmount fromJson(JSONObject jSONObject) {
        PayPalCreditFinancingAmount payPalCreditFinancingAmount = new PayPalCreditFinancingAmount();
        if (jSONObject == null) {
            return payPalCreditFinancingAmount;
        }
        payPalCreditFinancingAmount.currency = Json.optString(jSONObject, "currency", (String) null);
        payPalCreditFinancingAmount.value = Json.optString(jSONObject, "value", (String) null);
        return payPalCreditFinancingAmount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return String.format("%s %s", new Object[]{this.value, this.currency});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.currency);
        parcel.writeString(this.value);
    }

    private PayPalCreditFinancingAmount(Parcel parcel) {
        this.currency = parcel.readString();
        this.value = parcel.readString();
    }
}
