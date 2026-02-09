package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new zzj();
    final byte[] zza;

    public zzi(byte[] bArr) {
        this.zza = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
