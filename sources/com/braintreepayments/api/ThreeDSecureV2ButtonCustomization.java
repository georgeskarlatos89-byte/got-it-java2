package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalcommerce.shared.userinterfaces.ButtonCustomization;

public class ThreeDSecureV2ButtonCustomization extends ThreeDSecureV2BaseCustomization implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureV2ButtonCustomization> CREATOR = new Parcelable.Creator<ThreeDSecureV2ButtonCustomization>() {
        public ThreeDSecureV2ButtonCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV2ButtonCustomization(parcel);
        }

        public ThreeDSecureV2ButtonCustomization[] newArray(int i) {
            return new ThreeDSecureV2ButtonCustomization[i];
        }
    };
    private final ButtonCustomization cardinalButtonCustomization;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecureV2ButtonCustomization() {
        this.cardinalButtonCustomization = new ButtonCustomization();
    }

    public void setTextFontName(String str) {
        this.cardinalButtonCustomization.setTextFontName(str);
    }

    public void setTextColor(String str) {
        this.cardinalButtonCustomization.setTextColor(str);
    }

    public void setTextFontSize(int i) {
        this.cardinalButtonCustomization.setTextFontSize(i);
    }

    public String getTextFontName() {
        return this.cardinalButtonCustomization.getTextFontName();
    }

    public String getTextColor() {
        return this.cardinalButtonCustomization.getTextColor();
    }

    public int getTextFontSize() {
        return this.cardinalButtonCustomization.getTextFontSize();
    }

    public void setBackgroundColor(String str) {
        this.cardinalButtonCustomization.setBackgroundColor(str);
    }

    public void setCornerRadius(int i) {
        this.cardinalButtonCustomization.setCornerRadius(i);
    }

    public String getBackgroundColor() {
        return this.cardinalButtonCustomization.getBackgroundColor();
    }

    public int getCornerRadius() {
        return this.cardinalButtonCustomization.getCornerRadius();
    }

    /* access modifiers changed from: package-private */
    public ButtonCustomization getCardinalButtonCustomization() {
        return this.cardinalButtonCustomization;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardinalButtonCustomization.getTextFontName());
        parcel.writeString(this.cardinalButtonCustomization.getTextColor());
        parcel.writeInt(this.cardinalButtonCustomization.getTextFontSize());
        parcel.writeString(this.cardinalButtonCustomization.getBackgroundColor());
        parcel.writeInt(this.cardinalButtonCustomization.getCornerRadius());
    }

    protected ThreeDSecureV2ButtonCustomization(Parcel parcel) {
        ButtonCustomization buttonCustomization = new ButtonCustomization();
        this.cardinalButtonCustomization = buttonCustomization;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        String readString3 = parcel.readString();
        int readInt2 = parcel.readInt();
        if (readString != null) {
            buttonCustomization.setTextFontName(readString);
        }
        if (readString2 != null) {
            buttonCustomization.setTextColor(readString2);
        }
        if (readInt != 0) {
            buttonCustomization.setTextFontSize(readInt);
        }
        if (readString3 != null) {
            buttonCustomization.setBackgroundColor(readString3);
        }
        if (readInt2 != 0) {
            buttonCustomization.setCornerRadius(readInt2);
        }
    }
}
