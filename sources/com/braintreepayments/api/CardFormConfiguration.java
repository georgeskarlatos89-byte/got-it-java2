package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;

class CardFormConfiguration implements Parcelable {
    public static final Parcelable.Creator<CardFormConfiguration> CREATOR = new Parcelable.Creator<CardFormConfiguration>() {
        public CardFormConfiguration createFromParcel(Parcel parcel) {
            return new CardFormConfiguration(parcel);
        }

        public CardFormConfiguration[] newArray(int i) {
            return new CardFormConfiguration[i];
        }
    };
    boolean isCvvChallengePresent;
    boolean isPostalCodeChallengePresent;

    public int describeContents() {
        return 0;
    }

    CardFormConfiguration(boolean z, boolean z2) {
        this.isCvvChallengePresent = z;
        this.isPostalCodeChallengePresent = z2;
    }

    CardFormConfiguration(Parcel parcel) {
        boolean z = true;
        this.isCvvChallengePresent = parcel.readByte() != 0;
        this.isPostalCodeChallengePresent = parcel.readByte() == 0 ? false : z;
    }

    /* access modifiers changed from: package-private */
    public boolean isCvvChallengePresent() {
        return this.isCvvChallengePresent;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostalCodeChallengePresent() {
        return this.isPostalCodeChallengePresent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isCvvChallengePresent ? (byte) 1 : 0);
        parcel.writeByte(this.isPostalCodeChallengePresent ? (byte) 1 : 0);
    }
}
