package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

public class ThreeDSecureV1UiCustomization implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureV1UiCustomization> CREATOR = new Parcelable.Creator<ThreeDSecureV1UiCustomization>() {
        public ThreeDSecureV1UiCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV1UiCustomization(parcel);
        }

        public ThreeDSecureV1UiCustomization[] newArray(int i) {
            return new ThreeDSecureV1UiCustomization[i];
        }
    };
    private String redirectButtonText;
    private String redirectDescription;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecureV1UiCustomization() {
    }

    public void setRedirectButtonText(String str) {
        this.redirectButtonText = str;
    }

    public void setRedirectDescription(String str) {
        this.redirectDescription = str;
    }

    public String getRedirectButtonText() {
        return this.redirectButtonText;
    }

    public String getRedirectDescription() {
        return this.redirectDescription;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.redirectButtonText);
        parcel.writeString(this.redirectDescription);
    }

    private ThreeDSecureV1UiCustomization(Parcel parcel) {
        this.redirectButtonText = parcel.readString();
        this.redirectDescription = parcel.readString();
    }
}
