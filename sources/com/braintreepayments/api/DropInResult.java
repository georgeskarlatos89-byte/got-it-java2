package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

public class DropInResult implements Parcelable {
    public static final Parcelable.Creator<DropInResult> CREATOR = new Parcelable.Creator<DropInResult>() {
        public DropInResult createFromParcel(Parcel parcel) {
            return new DropInResult(parcel);
        }

        public DropInResult[] newArray(int i) {
            return new DropInResult[i];
        }
    };
    public static final String EXTRA_DROP_IN_RESULT = "com.braintreepayments.api.dropin.EXTRA_DROP_IN_RESULT";
    public static final String EXTRA_ERROR = "com.braintreepayments.api.dropin.EXTRA_ERROR";
    private String deviceData;
    private Exception error;
    private String paymentDescription;
    private PaymentMethodNonce paymentMethodNonce;
    private DropInPaymentMethod paymentMethodType;

    public int describeContents() {
        return 0;
    }

    DropInResult() {
    }

    /* access modifiers changed from: package-private */
    public void setPaymentMethodNonce(PaymentMethodNonce paymentMethodNonce2) {
        setPaymentMethodNonce(paymentMethodNonce2, new PaymentMethodInspector());
    }

    /* access modifiers changed from: package-private */
    public void setPaymentMethodNonce(PaymentMethodNonce paymentMethodNonce2, PaymentMethodInspector paymentMethodInspector) {
        if (paymentMethodNonce2 != null) {
            this.paymentMethodType = paymentMethodInspector.getPaymentMethod(paymentMethodNonce2);
            this.paymentDescription = paymentMethodInspector.getPaymentMethodDescription(paymentMethodNonce2);
        }
        this.paymentMethodNonce = paymentMethodNonce2;
    }

    /* access modifiers changed from: package-private */
    public void setDeviceData(String str) {
        this.deviceData = str;
    }

    /* access modifiers changed from: package-private */
    public void setPaymentMethodType(DropInPaymentMethod dropInPaymentMethod) {
        this.paymentMethodType = dropInPaymentMethod;
    }

    /* access modifiers changed from: package-private */
    public void setError(Exception exc) {
        this.error = exc;
    }

    public DropInPaymentMethod getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public PaymentMethodNonce getPaymentMethodNonce() {
        return this.paymentMethodNonce;
    }

    public String getDeviceData() {
        return this.deviceData;
    }

    /* access modifiers changed from: package-private */
    public Exception getError() {
        return this.error;
    }

    public String getPaymentDescription() {
        return this.paymentDescription;
    }

    public void writeToParcel(Parcel parcel, int i) {
        DropInPaymentMethod dropInPaymentMethod = this.paymentMethodType;
        parcel.writeInt(dropInPaymentMethod == null ? -1 : dropInPaymentMethod.ordinal());
        parcel.writeParcelable(this.paymentMethodNonce, i);
        parcel.writeString(this.paymentDescription);
        parcel.writeString(this.deviceData);
    }

    protected DropInResult(Parcel parcel) {
        DropInPaymentMethod dropInPaymentMethod;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            dropInPaymentMethod = null;
        } else {
            dropInPaymentMethod = DropInPaymentMethod.values()[readInt];
        }
        this.paymentMethodType = dropInPaymentMethod;
        this.paymentMethodNonce = (PaymentMethodNonce) parcel.readParcelable(PaymentMethodNonce.class.getClassLoader());
        this.paymentDescription = parcel.readString();
        this.deviceData = parcel.readString();
    }
}
