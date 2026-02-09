package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public class ThreeDSecureV2BaseCustomization implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureV2BaseCustomization> CREATOR = new Parcelable.Creator<ThreeDSecureV2BaseCustomization>() {
        public ThreeDSecureV2BaseCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV2BaseCustomization(parcel);
        }

        public ThreeDSecureV2BaseCustomization[] newArray(int i) {
            return new ThreeDSecureV2BaseCustomization[i];
        }
    };
    private String textColor;
    private String textFontName;
    private int textFontSize;

    public int describeContents() {
        return 0;
    }

    ThreeDSecureV2BaseCustomization() {
    }

    public void setTextFontName(String str) {
        this.textFontName = str;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public void setTextFontSize(int i) {
        this.textFontSize = i;
    }

    public String getTextFontName() {
        return this.textFontName;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int getTextFontSize() {
        return this.textFontSize;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.textFontName);
        parcel.writeString(this.textColor);
        parcel.writeInt(this.textFontSize);
    }

    protected ThreeDSecureV2BaseCustomization(Parcel parcel) {
        this.textFontName = parcel.readString();
        this.textColor = parcel.readString();
        this.textFontSize = parcel.readInt();
    }
}
