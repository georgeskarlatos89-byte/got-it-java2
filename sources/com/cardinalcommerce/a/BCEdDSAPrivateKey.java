package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;

public final class BCEdDSAPrivateKey implements BCXDHPrivateKey {
    public final int Cardinal(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    public final int init(byte[] bArr) throws KeyAgreementSpi.AnonymousClass1 {
        byte b = bArr[bArr.length - 1] & 255;
        byte b2 = (byte) b;
        boolean z = (b > bArr.length) | (b == 0);
        for (int i = 0; i < bArr.length; i++) {
            z |= (bArr.length - i <= b) & (bArr[i] != b2);
        }
        if (!z) {
            return b;
        }
        throw new KeyAgreementSpi.AnonymousClass1("pad block corrupted");
    }
}
