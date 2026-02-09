package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalcommerce.shared.userinterfaces.LabelCustomization;

public class ThreeDSecureV2LabelCustomization extends ThreeDSecureV2BaseCustomization implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureV2LabelCustomization> CREATOR = new Parcelable.Creator<ThreeDSecureV2LabelCustomization>() {
        public ThreeDSecureV2LabelCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV2LabelCustomization(parcel);
        }

        public ThreeDSecureV2LabelCustomization[] newArray(int i) {
            return new ThreeDSecureV2LabelCustomization[i];
        }
    };
    private final LabelCustomization cardinalLabelCustomization;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecureV2LabelCustomization() {
        this.cardinalLabelCustomization = new LabelCustomization();
    }

    public void setTextFontName(String str) {
        this.cardinalLabelCustomization.setTextFontName(str);
    }

    public void setTextColor(String str) {
        this.cardinalLabelCustomization.setTextColor(str);
    }

    public void setTextFontSize(int i) {
        this.cardinalLabelCustomization.setTextFontSize(i);
    }

    public String getTextFontName() {
        return this.cardinalLabelCustomization.getTextFontName();
    }

    public String getTextColor() {
        return this.cardinalLabelCustomization.getTextColor();
    }

    public int getTextFontSize() {
        return this.cardinalLabelCustomization.getTextFontSize();
    }

    public void setHeadingTextColor(String str) {
        this.cardinalLabelCustomization.setHeadingTextColor(str);
    }

    public void setHeadingTextFontName(String str) {
        this.cardinalLabelCustomization.setHeadingTextFontName(str);
    }

    public void setHeadingTextFontSize(int i) {
        this.cardinalLabelCustomization.setHeadingTextFontSize(i);
    }

    public String getHeadingTextColor() {
        return this.cardinalLabelCustomization.getHeadingTextColor();
    }

    public String getHeadingTextFontName() {
        return this.cardinalLabelCustomization.getHeadingTextFontName();
    }

    public int getHeadingTextFontSize() {
        return this.cardinalLabelCustomization.getHeadingTextFontSize();
    }

    /* access modifiers changed from: package-private */
    public LabelCustomization getCardinalLabelCustomization() {
        return this.cardinalLabelCustomization;
    }

    private ThreeDSecureV2LabelCustomization(Parcel parcel) {
        LabelCustomization labelCustomization = new LabelCustomization();
        this.cardinalLabelCustomization = labelCustomization;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        int readInt2 = parcel.readInt();
        if (readString != null) {
            labelCustomization.setTextFontName(readString);
        }
        if (readString2 != null) {
            labelCustomization.setTextColor(readString2);
        }
        if (readInt != 0) {
            labelCustomization.setTextFontSize(readInt);
        }
        if (readString3 != null) {
            labelCustomization.setHeadingTextColor(readString3);
        }
        if (readString4 != null) {
            labelCustomization.setHeadingTextFontName(readString4);
        }
        if (readInt2 != 0) {
            labelCustomization.setHeadingTextFontSize(readInt2);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardinalLabelCustomization.getTextFontName());
        parcel.writeString(this.cardinalLabelCustomization.getTextColor());
        parcel.writeInt(this.cardinalLabelCustomization.getTextFontSize());
        parcel.writeString(this.cardinalLabelCustomization.getHeadingTextColor());
        parcel.writeString(this.cardinalLabelCustomization.getHeadingTextFontName());
        parcel.writeInt(this.cardinalLabelCustomization.getHeadingTextFontSize());
    }
}
