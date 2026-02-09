package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public class GooglePayException extends BraintreeException implements Parcelable {
    public static final Parcelable.Creator<GooglePayException> CREATOR = new Parcelable.Creator<GooglePayException>() {
        public GooglePayException createFromParcel(Parcel parcel) {
            return new GooglePayException(parcel);
        }

        public GooglePayException[] newArray(int i) {
            return new GooglePayException[i];
        }
    };
    private final Status status;

    public int describeContents() {
        return 0;
    }

    GooglePayException(String str, Status status2) {
        super(str);
        this.status = status2;
    }

    public Status getStatus() {
        return this.status;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getMessage());
        parcel.writeParcelable(this.status, 0);
    }

    protected GooglePayException(Parcel parcel) {
        super(parcel.readString());
        this.status = (Status) parcel.readParcelable(Status.class.getClassLoader());
    }
}
