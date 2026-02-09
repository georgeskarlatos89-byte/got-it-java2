package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/braintreepayments/api/PaymentMethodNonce;", "Landroid/os/Parcelable;", "nonce", "", "isDefault", "", "(Ljava/lang/String;Z)V", "inParcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()Z", "string", "getString", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "flags", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: PaymentMethodNonce.kt */
public class PaymentMethodNonce implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodNonce> CREATOR = new PaymentMethodNonce$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final boolean isDefault;
    private final String string;

    public int describeContents() {
        return 0;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/PaymentMethodNonce$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braintreepayments/api/PaymentMethodNonce;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: PaymentMethodNonce.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public String getString() {
        return this.string;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public PaymentMethodNonce(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "nonce");
        this.string = str;
        this.isDefault = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(getString());
        parcel.writeByte(isDefault() ? (byte) 1 : 0);
    }

    protected PaymentMethodNonce(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "inParcel");
        String readString = parcel.readString();
        this.string = readString == null ? "" : readString;
        this.isDefault = parcel.readByte() > 0;
    }
}
