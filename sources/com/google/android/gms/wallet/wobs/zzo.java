package com.google.android.gms.wallet.wobs;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zzo implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x000a:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L_0x0053
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 2
            if (r2 == r8) goto L_0x004e
            r8 = 3
            if (r2 == r8) goto L_0x0049
            r8 = 4
            if (r2 == r8) goto L_0x003f
            r8 = 5
            if (r2 == r8) goto L_0x0035
            r8 = 6
            if (r2 == r8) goto L_0x002b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto L_0x000a
        L_0x002b:
            android.os.Parcelable$Creator<com.google.android.gms.wallet.wobs.UriData> r2 = com.google.android.gms.wallet.wobs.UriData.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r7 = r1
            com.google.android.gms.wallet.wobs.UriData r7 = (com.google.android.gms.wallet.wobs.UriData) r7
            goto L_0x000a
        L_0x0035:
            android.os.Parcelable$Creator<com.google.android.gms.wallet.wobs.UriData> r2 = com.google.android.gms.wallet.wobs.UriData.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r6 = r1
            com.google.android.gms.wallet.wobs.UriData r6 = (com.google.android.gms.wallet.wobs.UriData) r6
            goto L_0x000a
        L_0x003f:
            android.os.Parcelable$Creator<com.google.android.gms.wallet.wobs.TimeInterval> r2 = com.google.android.gms.wallet.wobs.TimeInterval.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r5 = r1
            com.google.android.gms.wallet.wobs.TimeInterval r5 = (com.google.android.gms.wallet.wobs.TimeInterval) r5
            goto L_0x000a
        L_0x0049:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto L_0x000a
        L_0x004e:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto L_0x000a
        L_0x0053:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.wallet.wobs.WalletObjectMessage r10 = new com.google.android.gms.wallet.wobs.WalletObjectMessage
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.wobs.zzo.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
