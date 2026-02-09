package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalcommerce.shared.userinterfaces.TextBoxCustomization;

public class ThreeDSecureV2TextBoxCustomization extends ThreeDSecureV2BaseCustomization implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureV2TextBoxCustomization> CREATOR = new Parcelable.Creator<ThreeDSecureV2TextBoxCustomization>() {
        public ThreeDSecureV2TextBoxCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV2TextBoxCustomization(parcel);
        }

        public ThreeDSecureV2TextBoxCustomization[] newArray(int i) {
            return new ThreeDSecureV2TextBoxCustomization[i];
        }
    };
    private final TextBoxCustomization cardinalTextBoxCustomization;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecureV2TextBoxCustomization() {
        this.cardinalTextBoxCustomization = new TextBoxCustomization();
    }

    public void setTextFontName(String str) {
        this.cardinalTextBoxCustomization.setTextFontName(str);
    }

    public void setTextColor(String str) {
        this.cardinalTextBoxCustomization.setTextColor(str);
    }

    public void setTextFontSize(int i) {
        this.cardinalTextBoxCustomization.setTextFontSize(i);
    }

    public String getTextFontName() {
        return this.cardinalTextBoxCustomization.getTextFontName();
    }

    public String getTextColor() {
        return this.cardinalTextBoxCustomization.getTextColor();
    }

    public int getTextFontSize() {
        return this.cardinalTextBoxCustomization.getTextFontSize();
    }

    public void setBorderWidth(int i) {
        this.cardinalTextBoxCustomization.setBorderWidth(i);
    }

    public void setBorderColor(String str) {
        this.cardinalTextBoxCustomization.setBorderColor(str);
    }

    public void setCornerRadius(int i) {
        this.cardinalTextBoxCustomization.setCornerRadius(i);
    }

    public int getBorderWidth() {
        return this.cardinalTextBoxCustomization.getBorderWidth();
    }

    public String getBorderColor() {
        return this.cardinalTextBoxCustomization.getBorderColor();
    }

    public int getCornerRadius() {
        return this.cardinalTextBoxCustomization.getCornerRadius();
    }

    /* access modifiers changed from: package-private */
    public TextBoxCustomization getCardinalTextBoxCustomization() {
        return this.cardinalTextBoxCustomization;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardinalTextBoxCustomization.getTextFontName());
        parcel.writeString(this.cardinalTextBoxCustomization.getTextColor());
        parcel.writeInt(this.cardinalTextBoxCustomization.getTextFontSize());
        parcel.writeInt(this.cardinalTextBoxCustomization.getBorderWidth());
        parcel.writeString(this.cardinalTextBoxCustomization.getBorderColor());
        parcel.writeInt(this.cardinalTextBoxCustomization.getCornerRadius());
    }

    private ThreeDSecureV2TextBoxCustomization(Parcel parcel) {
        TextBoxCustomization textBoxCustomization = new TextBoxCustomization();
        this.cardinalTextBoxCustomization = textBoxCustomization;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString3 = parcel.readString();
        int readInt3 = parcel.readInt();
        if (readString != null) {
            textBoxCustomization.setTextFontName(readString);
        }
        if (readString2 != null) {
            textBoxCustomization.setTextColor(readString2);
        }
        if (readInt != 0) {
            textBoxCustomization.setTextFontSize(readInt);
        }
        if (readInt2 != 0) {
            textBoxCustomization.setBorderWidth(readInt2);
        }
        if (readString3 != null) {
            textBoxCustomization.setBorderColor(readString3);
        }
        if (readInt3 != 0) {
            textBoxCustomization.setCornerRadius(readInt3);
        }
    }
}
