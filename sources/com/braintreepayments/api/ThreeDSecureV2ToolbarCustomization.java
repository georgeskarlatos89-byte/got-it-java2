package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalcommerce.shared.userinterfaces.ToolbarCustomization;

public class ThreeDSecureV2ToolbarCustomization extends ThreeDSecureV2BaseCustomization implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureV2ToolbarCustomization> CREATOR = new Parcelable.Creator<ThreeDSecureV2ToolbarCustomization>() {
        public ThreeDSecureV2ToolbarCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV2ToolbarCustomization(parcel);
        }

        public ThreeDSecureV2ToolbarCustomization[] newArray(int i) {
            return new ThreeDSecureV2ToolbarCustomization[i];
        }
    };
    private final ToolbarCustomization cardinalToolbarCustomization;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecureV2ToolbarCustomization() {
        this.cardinalToolbarCustomization = new ToolbarCustomization();
    }

    public void setTextFontName(String str) {
        this.cardinalToolbarCustomization.setTextFontName(str);
    }

    public void setTextColor(String str) {
        this.cardinalToolbarCustomization.setTextColor(str);
    }

    public void setTextFontSize(int i) {
        this.cardinalToolbarCustomization.setTextFontSize(i);
    }

    public String getTextFontName() {
        return this.cardinalToolbarCustomization.getTextFontName();
    }

    public String getTextColor() {
        return this.cardinalToolbarCustomization.getTextColor();
    }

    public int getTextFontSize() {
        return this.cardinalToolbarCustomization.getTextFontSize();
    }

    public void setBackgroundColor(String str) {
        this.cardinalToolbarCustomization.setBackgroundColor(str);
    }

    public void setHeaderText(String str) {
        this.cardinalToolbarCustomization.setHeaderText(str);
    }

    public void setButtonText(String str) {
        this.cardinalToolbarCustomization.setButtonText(str);
    }

    public String getBackgroundColor() {
        return this.cardinalToolbarCustomization.getBackgroundColor();
    }

    public String getHeaderText() {
        return this.cardinalToolbarCustomization.getHeaderText();
    }

    public String getButtonText() {
        return this.cardinalToolbarCustomization.getButtonText();
    }

    /* access modifiers changed from: package-private */
    public ToolbarCustomization getCardinalToolbarCustomization() {
        return this.cardinalToolbarCustomization;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardinalToolbarCustomization.getTextFontName());
        parcel.writeString(this.cardinalToolbarCustomization.getTextColor());
        parcel.writeInt(this.cardinalToolbarCustomization.getTextFontSize());
        parcel.writeString(this.cardinalToolbarCustomization.getBackgroundColor());
        parcel.writeString(this.cardinalToolbarCustomization.getHeaderText());
        parcel.writeString(this.cardinalToolbarCustomization.getButtonText());
    }

    private ThreeDSecureV2ToolbarCustomization(Parcel parcel) {
        ToolbarCustomization toolbarCustomization = new ToolbarCustomization();
        this.cardinalToolbarCustomization = toolbarCustomization;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        if (readString != null) {
            toolbarCustomization.setTextFontName(readString);
        }
        if (readString2 != null) {
            toolbarCustomization.setTextColor(readString2);
        }
        if (readInt != 0) {
            toolbarCustomization.setTextFontSize(readInt);
        }
        if (readString3 != null) {
            toolbarCustomization.setBackgroundColor(readString3);
        }
        if (readString4 != null) {
            toolbarCustomization.setHeaderText(readString4);
        }
        if (readString5 != null) {
            toolbarCustomization.setButtonText(readString5);
        }
    }
}
