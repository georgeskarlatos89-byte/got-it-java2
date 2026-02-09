package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020(H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u000bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000b¨\u0006/"}, d2 = {"Lcom/braintreepayments/api/PostalAddress;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "countryCodeAlpha2", "", "getCountryCodeAlpha2", "()Ljava/lang/String;", "setCountryCodeAlpha2", "(Ljava/lang/String;)V", "extendedAddress", "getExtendedAddress", "setExtendedAddress", "isEmpty", "", "()Z", "locality", "getLocality", "setLocality", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "postalCode", "getPostalCode", "setPostalCode", "recipientName", "getRecipientName", "setRecipientName", "region", "getRegion", "setRegion", "sortingCode", "getSortingCode", "setSortingCode", "streetAddress", "getStreetAddress", "setStreetAddress", "describeContents", "", "toString", "writeToParcel", "", "dest", "flags", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: PostalAddress.kt */
public class PostalAddress implements Parcelable {
    public static final Parcelable.Creator<PostalAddress> CREATOR = new PostalAddress$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String countryCodeAlpha2;
    private String extendedAddress;
    private String locality;
    private String phoneNumber;
    private String postalCode;
    private String recipientName;
    private String region;
    private String sortingCode;
    private String streetAddress;

    public /* synthetic */ PostalAddress(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String str) {
        this.recipientName = str;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String str) {
        this.streetAddress = str;
    }

    public String getExtendedAddress() {
        return this.extendedAddress;
    }

    public void setExtendedAddress(String str) {
        this.extendedAddress = str;
    }

    public String getLocality() {
        return this.locality;
    }

    public void setLocality(String str) {
        this.locality = str;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public String getSortingCode() {
        return this.sortingCode;
    }

    public void setSortingCode(String str) {
        this.sortingCode = str;
    }

    public String getCountryCodeAlpha2() {
        return this.countryCodeAlpha2;
    }

    public void setCountryCodeAlpha2(String str) {
        this.countryCodeAlpha2 = str;
    }

    public PostalAddress() {
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getCountryCodeAlpha2());
    }

    public String toString() {
        return getRecipientName() + 10 + getStreetAddress() + 10 + getExtendedAddress() + 10 + getLocality() + ", " + getRegion() + 10 + getPostalCode() + ' ' + getCountryCodeAlpha2();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(getStreetAddress());
        parcel.writeString(getExtendedAddress());
        parcel.writeString(getLocality());
        parcel.writeString(getRegion());
        parcel.writeString(getPostalCode());
        parcel.writeString(getCountryCodeAlpha2());
        parcel.writeString(getRecipientName());
        parcel.writeString(getPhoneNumber());
        parcel.writeString(getSortingCode());
    }

    private PostalAddress(Parcel parcel) {
        setStreetAddress(parcel.readString());
        setExtendedAddress(parcel.readString());
        setLocality(parcel.readString());
        setRegion(parcel.readString());
        setPostalCode(parcel.readString());
        setCountryCodeAlpha2(parcel.readString());
        setRecipientName(parcel.readString());
        setPhoneNumber(parcel.readString());
        setSortingCode(parcel.readString());
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/PostalAddress$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PostalAddress;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: PostalAddress.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
