package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

public class DropInRequest implements Parcelable {
    public static final Parcelable.Creator<DropInRequest> CREATOR = new Parcelable.Creator<DropInRequest>() {
        public DropInRequest createFromParcel(Parcel parcel) {
            return new DropInRequest(parcel);
        }

        public DropInRequest[] newArray(int i) {
            return new DropInRequest[i];
        }
    };
    private boolean allowVaultCardOverride;
    private boolean cardDisabled;
    private boolean cardLogosDisabled;
    private int cardholderNameStatus;
    private String customUrlScheme;
    private boolean googlePayDisabled;
    private GooglePayRequest googlePayRequest;
    private final boolean hasUserLocationConsent;
    private boolean maskCardNumber;
    private boolean maskSecurityCode;
    private boolean payPalDisabled;
    private PayPalRequest payPalRequest;
    private ThreeDSecureRequest threeDSecureRequest;
    private boolean vaultCardDefaultValue;
    private boolean vaultManagerEnabled;
    private boolean venmoDisabled;
    private VenmoRequest venmoRequest;

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public DropInRequest() {
        this.googlePayDisabled = false;
        this.maskCardNumber = false;
        this.maskSecurityCode = false;
        this.vaultManagerEnabled = false;
        this.payPalDisabled = false;
        this.venmoDisabled = false;
        this.cardDisabled = false;
        this.cardLogosDisabled = false;
        this.vaultCardDefaultValue = true;
        this.allowVaultCardOverride = false;
        this.customUrlScheme = null;
        this.cardholderNameStatus = 0;
        this.hasUserLocationConsent = false;
    }

    public DropInRequest(boolean z) {
        this.googlePayDisabled = false;
        this.maskCardNumber = false;
        this.maskSecurityCode = false;
        this.vaultManagerEnabled = false;
        this.payPalDisabled = false;
        this.venmoDisabled = false;
        this.cardDisabled = false;
        this.cardLogosDisabled = false;
        this.vaultCardDefaultValue = true;
        this.allowVaultCardOverride = false;
        this.customUrlScheme = null;
        this.cardholderNameStatus = 0;
        this.hasUserLocationConsent = z;
    }

    public void setGooglePayRequest(GooglePayRequest googlePayRequest2) {
        this.googlePayRequest = googlePayRequest2;
    }

    public void setPayPalRequest(PayPalRequest payPalRequest2) {
        this.payPalRequest = payPalRequest2;
    }

    public void setVenmoRequest(VenmoRequest venmoRequest2) {
        this.venmoRequest = venmoRequest2;
    }

    public void setGooglePayDisabled(boolean z) {
        this.googlePayDisabled = z;
    }

    public void setPayPalDisabled(boolean z) {
        this.payPalDisabled = z;
    }

    public void setVenmoDisabled(boolean z) {
        this.venmoDisabled = z;
    }

    public void setCardDisabled(boolean z) {
        this.cardDisabled = z;
    }

    public void setCardLogosDisabled(boolean z) {
        this.cardLogosDisabled = z;
    }

    public void setThreeDSecureRequest(ThreeDSecureRequest threeDSecureRequest2) {
        this.threeDSecureRequest = threeDSecureRequest2;
    }

    public void setMaskCardNumber(boolean z) {
        this.maskCardNumber = z;
    }

    public void setMaskSecurityCode(boolean z) {
        this.maskSecurityCode = z;
    }

    public void setVaultManagerEnabled(boolean z) {
        this.vaultManagerEnabled = z;
    }

    public void setVaultCardDefaultValue(boolean z) {
        this.vaultCardDefaultValue = z;
    }

    public void setAllowVaultCardOverride(boolean z) {
        this.allowVaultCardOverride = z;
    }

    public void setCardholderNameStatus(int i) {
        this.cardholderNameStatus = i;
    }

    public boolean isPayPalDisabled() {
        return this.payPalDisabled;
    }

    public PayPalRequest getPayPalRequest() {
        return this.payPalRequest;
    }

    public boolean isVenmoDisabled() {
        return this.venmoDisabled;
    }

    public VenmoRequest getVenmoRequest() {
        return this.venmoRequest;
    }

    public boolean isCardDisabled() {
        return this.cardDisabled;
    }

    public boolean areCardLogosDisabled() {
        return this.cardLogosDisabled;
    }

    public GooglePayRequest getGooglePayRequest() {
        return this.googlePayRequest;
    }

    public boolean isGooglePayDisabled() {
        return this.googlePayDisabled;
    }

    public ThreeDSecureRequest getThreeDSecureRequest() {
        return this.threeDSecureRequest;
    }

    public boolean getMaskCardNumber() {
        return this.maskCardNumber;
    }

    public boolean getMaskSecurityCode() {
        return this.maskSecurityCode;
    }

    public boolean isVaultManagerEnabled() {
        return this.vaultManagerEnabled;
    }

    public int getCardholderNameStatus() {
        return this.cardholderNameStatus;
    }

    public boolean getVaultCardDefaultValue() {
        return this.vaultCardDefaultValue;
    }

    public boolean getAllowVaultCardOverride() {
        return this.allowVaultCardOverride;
    }

    public void setCustomUrlScheme(String str) {
        this.customUrlScheme = str;
    }

    public String getCustomUrlScheme() {
        return this.customUrlScheme;
    }

    /* access modifiers changed from: package-private */
    public boolean hasUserLocationConsent() {
        return this.hasUserLocationConsent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.googlePayRequest, 0);
        parcel.writeByte(this.googlePayDisabled ? (byte) 1 : 0);
        parcel.writeParcelable(this.payPalRequest, 0);
        parcel.writeParcelable(this.venmoRequest, 0);
        parcel.writeByte(this.payPalDisabled ? (byte) 1 : 0);
        parcel.writeByte(this.venmoDisabled ? (byte) 1 : 0);
        parcel.writeByte(this.cardDisabled ? (byte) 1 : 0);
        parcel.writeByte(this.cardLogosDisabled ? (byte) 1 : 0);
        parcel.writeParcelable(this.threeDSecureRequest, 0);
        parcel.writeByte(this.maskCardNumber ? (byte) 1 : 0);
        parcel.writeByte(this.maskSecurityCode ? (byte) 1 : 0);
        parcel.writeByte(this.vaultManagerEnabled ? (byte) 1 : 0);
        parcel.writeInt(this.cardholderNameStatus);
        parcel.writeByte(this.vaultCardDefaultValue ? (byte) 1 : 0);
        parcel.writeByte(this.allowVaultCardOverride ? (byte) 1 : 0);
        parcel.writeString(this.customUrlScheme);
        parcel.writeByte(this.hasUserLocationConsent ? (byte) 1 : 0);
    }

    protected DropInRequest(Parcel parcel) {
        boolean z = false;
        this.googlePayDisabled = false;
        this.maskCardNumber = false;
        this.maskSecurityCode = false;
        this.vaultManagerEnabled = false;
        this.payPalDisabled = false;
        this.venmoDisabled = false;
        this.cardDisabled = false;
        this.cardLogosDisabled = false;
        this.vaultCardDefaultValue = true;
        this.allowVaultCardOverride = false;
        this.customUrlScheme = null;
        this.cardholderNameStatus = 0;
        this.googlePayRequest = (GooglePayRequest) parcel.readParcelable(GooglePayRequest.class.getClassLoader());
        this.googlePayDisabled = parcel.readByte() != 0;
        this.payPalRequest = (PayPalRequest) parcel.readParcelable(PayPalRequest.class.getClassLoader());
        this.venmoRequest = (VenmoRequest) parcel.readParcelable(VenmoRequest.class.getClassLoader());
        this.payPalDisabled = parcel.readByte() != 0;
        this.venmoDisabled = parcel.readByte() != 0;
        this.cardDisabled = parcel.readByte() != 0;
        this.cardLogosDisabled = parcel.readByte() != 0;
        this.threeDSecureRequest = (ThreeDSecureRequest) parcel.readParcelable(ThreeDSecureRequest.class.getClassLoader());
        this.maskCardNumber = parcel.readByte() != 0;
        this.maskSecurityCode = parcel.readByte() != 0;
        this.vaultManagerEnabled = parcel.readByte() != 0;
        this.cardholderNameStatus = parcel.readInt();
        this.vaultCardDefaultValue = parcel.readByte() != 0;
        this.allowVaultCardOverride = parcel.readByte() != 0;
        this.customUrlScheme = parcel.readString();
        this.hasUserLocationConsent = parcel.readByte() != 0 ? true : z;
    }
}
