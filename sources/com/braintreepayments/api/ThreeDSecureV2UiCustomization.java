package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalcommerce.shared.models.enums.ButtonType;
import com.cardinalcommerce.shared.userinterfaces.UiCustomization;

public class ThreeDSecureV2UiCustomization implements Parcelable {
    public static final int BUTTON_TYPE_CANCEL = 3;
    public static final int BUTTON_TYPE_CONTINUE = 1;
    public static final int BUTTON_TYPE_NEXT = 2;
    public static final int BUTTON_TYPE_RESEND = 4;
    public static final int BUTTON_TYPE_VERIFY = 0;
    public static final Parcelable.Creator<ThreeDSecureV2UiCustomization> CREATOR = new Parcelable.Creator<ThreeDSecureV2UiCustomization>() {
        public ThreeDSecureV2UiCustomization createFromParcel(Parcel parcel) {
            return new ThreeDSecureV2UiCustomization(parcel);
        }

        public ThreeDSecureV2UiCustomization[] newArray(int i) {
            return new ThreeDSecureV2UiCustomization[i];
        }
    };
    private ThreeDSecureV2ButtonCustomization buttonCustomization;
    private int buttonType;
    private UiCustomization cardinalValue;
    private ThreeDSecureV2LabelCustomization labelCustomization;
    private ThreeDSecureV2TextBoxCustomization textBoxCustomization;
    private ThreeDSecureV2ToolbarCustomization toolbarCustomization;

    public int describeContents() {
        return 0;
    }

    public ThreeDSecureV2UiCustomization() {
        this.cardinalValue = new UiCustomization();
    }

    public void setButtonCustomization(ThreeDSecureV2ButtonCustomization threeDSecureV2ButtonCustomization, int i) {
        this.buttonCustomization = threeDSecureV2ButtonCustomization;
        this.buttonType = i;
        this.cardinalValue.setButtonCustomization(threeDSecureV2ButtonCustomization.getCardinalButtonCustomization(), getCardinalButtonType(i));
    }

    public void setLabelCustomization(ThreeDSecureV2LabelCustomization threeDSecureV2LabelCustomization) {
        this.labelCustomization = threeDSecureV2LabelCustomization;
        this.cardinalValue.setLabelCustomization(threeDSecureV2LabelCustomization.getCardinalLabelCustomization());
    }

    public void setTextBoxCustomization(ThreeDSecureV2TextBoxCustomization threeDSecureV2TextBoxCustomization) {
        this.textBoxCustomization = threeDSecureV2TextBoxCustomization;
        this.cardinalValue.setTextBoxCustomization(threeDSecureV2TextBoxCustomization.getCardinalTextBoxCustomization());
    }

    public void setToolbarCustomization(ThreeDSecureV2ToolbarCustomization threeDSecureV2ToolbarCustomization) {
        this.toolbarCustomization = threeDSecureV2ToolbarCustomization;
        this.cardinalValue.setToolbarCustomization(threeDSecureV2ToolbarCustomization.getCardinalToolbarCustomization());
    }

    public ThreeDSecureV2ButtonCustomization getButtonCustomization() {
        return this.buttonCustomization;
    }

    public ThreeDSecureV2LabelCustomization getLabelCustomization() {
        return this.labelCustomization;
    }

    public ThreeDSecureV2TextBoxCustomization getTextBoxCustomization() {
        return this.textBoxCustomization;
    }

    public ThreeDSecureV2ToolbarCustomization getToolbarCustomization() {
        return this.toolbarCustomization;
    }

    /* access modifiers changed from: package-private */
    public UiCustomization getCardinalUiCustomization() {
        return this.cardinalValue;
    }

    private ButtonType getCardinalButtonType(int i) {
        if (i == 0) {
            return ButtonType.VERIFY;
        }
        if (i == 1) {
            return ButtonType.CONTINUE;
        }
        if (i == 2) {
            return ButtonType.NEXT;
        }
        if (i == 3) {
            return ButtonType.CANCEL;
        }
        if (i != 4) {
            return null;
        }
        return ButtonType.RESEND;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.buttonCustomization, i);
        parcel.writeParcelable(this.labelCustomization, i);
        parcel.writeParcelable(this.textBoxCustomization, i);
        parcel.writeParcelable(this.toolbarCustomization, i);
        parcel.writeInt(this.buttonType);
        parcel.writeSerializable(this.cardinalValue);
    }

    private ThreeDSecureV2UiCustomization(Parcel parcel) {
        this.cardinalValue = new UiCustomization();
        this.buttonCustomization = (ThreeDSecureV2ButtonCustomization) parcel.readParcelable(ThreeDSecureV2ButtonCustomization.class.getClassLoader());
        this.labelCustomization = (ThreeDSecureV2LabelCustomization) parcel.readParcelable(ThreeDSecureV2LabelCustomization.class.getClassLoader());
        this.textBoxCustomization = (ThreeDSecureV2TextBoxCustomization) parcel.readParcelable(ThreeDSecureV2TextBoxCustomization.class.getClassLoader());
        this.toolbarCustomization = (ThreeDSecureV2ToolbarCustomization) parcel.readParcelable(ThreeDSecureV2ToolbarCustomization.class.getClassLoader());
        this.buttonType = parcel.readInt();
        this.cardinalValue = (UiCustomization) parcel.readSerializable();
    }
}
