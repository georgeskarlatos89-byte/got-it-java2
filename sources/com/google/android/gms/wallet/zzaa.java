package com.google.android.gms.wallet;

import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zzaa implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
        /*
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x000d:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L_0x0059
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L_0x0054;
                case 2: goto L_0x004a;
                case 3: goto L_0x0040;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                case 7: goto L_0x0027;
                case 8: goto L_0x0022;
                default: goto L_0x001e;
            }
        L_0x001e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto L_0x000d
        L_0x0022:
            android.os.Bundle r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r12, r1)
            goto L_0x000d
        L_0x0027:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto L_0x000d
        L_0x002c:
            android.os.Bundle r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r12, r1)
            goto L_0x000d
        L_0x0031:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto L_0x000d
        L_0x0036:
            android.os.Parcelable$Creator<com.google.android.gms.wallet.PaymentMethodToken> r2 = com.google.android.gms.wallet.PaymentMethodToken.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r6 = r1
            com.google.android.gms.wallet.PaymentMethodToken r6 = (com.google.android.gms.wallet.PaymentMethodToken) r6
            goto L_0x000d
        L_0x0040:
            android.os.Parcelable$Creator<com.google.android.gms.identity.intents.model.UserAddress> r2 = com.google.android.gms.identity.intents.model.UserAddress.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r5 = r1
            com.google.android.gms.identity.intents.model.UserAddress r5 = (com.google.android.gms.identity.intents.model.UserAddress) r5
            goto L_0x000d
        L_0x004a:
            android.os.Parcelable$Creator<com.google.android.gms.wallet.CardInfo> r2 = com.google.android.gms.wallet.CardInfo.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r1, r2)
            r4 = r1
            com.google.android.gms.wallet.CardInfo r4 = (com.google.android.gms.wallet.CardInfo) r4
            goto L_0x000d
        L_0x0054:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto L_0x000d
        L_0x0059:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.wallet.PaymentData r12 = new com.google.android.gms.wallet.PaymentData
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.zzaa.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentData[i];
    }
}
