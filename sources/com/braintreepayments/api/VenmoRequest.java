package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;

public class VenmoRequest implements Parcelable {
    public static final Parcelable.Creator<VenmoRequest> CREATOR = new Parcelable.Creator<VenmoRequest>() {
        public VenmoRequest createFromParcel(Parcel parcel) {
            return new VenmoRequest(parcel);
        }

        public VenmoRequest[] newArray(int i) {
            return new VenmoRequest[i];
        }
    };
    private boolean collectCustomerBillingAddress;
    private boolean collectCustomerShippingAddress;
    private String discountAmount;
    private String displayName;
    private boolean fallbackToWeb = false;
    private boolean isFinalAmount;
    private ArrayList<VenmoLineItem> lineItems;
    private final int paymentMethodUsage;
    private String profileId;
    private String shippingAmount;
    private boolean shouldVault;
    private String subTotalAmount;
    private String taxAmount;
    private String totalAmount;

    public int describeContents() {
        return 0;
    }

    public VenmoRequest(int i) {
        this.paymentMethodUsage = i;
        this.lineItems = new ArrayList<>();
    }

    public void setShouldVault(boolean z) {
        this.shouldVault = z;
    }

    public void setProfileId(String str) {
        this.profileId = str;
    }

    public boolean getShouldVault() {
        return this.shouldVault;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public int getPaymentMethodUsage() {
        return this.paymentMethodUsage;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    /* access modifiers changed from: package-private */
    public String getPaymentMethodUsageAsString() {
        int i = this.paymentMethodUsage;
        if (i == 1) {
            return "SINGLE_USE";
        }
        if (i != 2) {
            return null;
        }
        return "MULTI_USE";
    }

    public void setCollectCustomerShippingAddress(boolean z) {
        this.collectCustomerShippingAddress = z;
    }

    public boolean getCollectCustomerShippingAddress() {
        return this.collectCustomerShippingAddress;
    }

    /* access modifiers changed from: package-private */
    public String getCollectCustomerShippingAddressAsString() {
        return String.valueOf(this.collectCustomerShippingAddress);
    }

    public void setCollectCustomerBillingAddress(boolean z) {
        this.collectCustomerBillingAddress = z;
    }

    public boolean getCollectCustomerBillingAddress() {
        return this.collectCustomerBillingAddress;
    }

    /* access modifiers changed from: package-private */
    public String getCollectCustomerBillingAddressAsString() {
        return String.valueOf(this.collectCustomerBillingAddress);
    }

    public void setSubTotalAmount(String str) {
        this.subTotalAmount = str;
    }

    public String getSubTotalAmount() {
        return this.subTotalAmount;
    }

    public void setShippingAmount(String str) {
        this.shippingAmount = str;
    }

    public String getShippingAmount() {
        return this.shippingAmount;
    }

    public void setDiscountAmount(String str) {
        this.discountAmount = str;
    }

    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public void setTaxAmount(String str) {
        this.taxAmount = str;
    }

    public String getTaxAmount() {
        return this.taxAmount;
    }

    public void setTotalAmount(String str) {
        this.totalAmount = str;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public void setLineItems(Collection<VenmoLineItem> collection) {
        this.lineItems.clear();
        this.lineItems.addAll(collection);
    }

    public ArrayList<VenmoLineItem> getLineItems() {
        return this.lineItems;
    }

    public void setFallbackToWeb(boolean z) {
        this.fallbackToWeb = z;
    }

    public boolean getFallbackToWeb() {
        return this.fallbackToWeb;
    }

    public void setIsFinalAmount(boolean z) {
        this.isFinalAmount = z;
    }

    public boolean getIsFinalAmount() {
        return this.isFinalAmount;
    }

    /* access modifiers changed from: package-private */
    public String getIsFinalAmountAsString() {
        return String.valueOf(this.isFinalAmount);
    }

    protected VenmoRequest(Parcel parcel) {
        boolean z = false;
        this.shouldVault = parcel.readByte() != 0;
        this.collectCustomerBillingAddress = parcel.readByte() != 0;
        this.collectCustomerShippingAddress = parcel.readByte() != 0;
        this.profileId = parcel.readString();
        this.displayName = parcel.readString();
        this.paymentMethodUsage = parcel.readInt();
        this.subTotalAmount = parcel.readString();
        this.discountAmount = parcel.readString();
        this.shippingAmount = parcel.readString();
        this.taxAmount = parcel.readString();
        this.totalAmount = parcel.readString();
        this.lineItems = parcel.createTypedArrayList(VenmoLineItem.CREATOR);
        this.isFinalAmount = parcel.readByte() != 0;
        this.fallbackToWeb = parcel.readByte() != 0 ? true : z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.shouldVault ? (byte) 1 : 0);
        parcel.writeByte(this.collectCustomerBillingAddress ? (byte) 1 : 0);
        parcel.writeByte(this.collectCustomerShippingAddress ? (byte) 1 : 0);
        parcel.writeString(this.profileId);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.paymentMethodUsage);
        parcel.writeString(this.subTotalAmount);
        parcel.writeString(this.discountAmount);
        parcel.writeString(this.shippingAmount);
        parcel.writeString(this.taxAmount);
        parcel.writeString(this.totalAmount);
        parcel.writeTypedList(this.lineItems);
        parcel.writeByte(this.isFinalAmount ? (byte) 1 : 0);
        parcel.writeByte(this.fallbackToWeb ? (byte) 1 : 0);
    }
}
