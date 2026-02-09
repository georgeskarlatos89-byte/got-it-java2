package com.cardinalcommerce.a;

import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;

final class setCCAOnClickListener {
    final int Cardinal;
    private final IESCipher.ECIESwithAESCBC getInstance;

    protected setCCAOnClickListener(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, int i) {
        if (eCIESwithAESCBC != null) {
            this.getInstance = eCIESwithAESCBC;
            this.Cardinal = i;
            return;
        }
        throw new NullPointerException("digest == null");
    }

    /* access modifiers changed from: protected */
    public final byte[] Cardinal(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.Cardinal;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == i * 2) {
            return init(1, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong in length");
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] init(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.Cardinal) {
            throw new IllegalArgumentException("wrong key length");
        } else if (bArr2.length == 32) {
            return init(3, bArr, bArr2);
        } else {
            throw new IllegalArgumentException("wrong address length");
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] init(int i, byte[] bArr, byte[] bArr2) {
        long j = (long) i;
        int i2 = this.Cardinal;
        byte[] bArr3 = new byte[i2];
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            bArr3[i3] = (byte) ((int) j);
            j >>>= 8;
        }
        this.getInstance.init(bArr3, 0, i2);
        this.getInstance.init(bArr, 0, bArr.length);
        this.getInstance.init(bArr2, 0, bArr2.length);
        int i4 = this.Cardinal;
        byte[] bArr4 = new byte[i4];
        IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.getInstance;
        if (eCIESwithAESCBC instanceof KeyAgreementSpi.DH) {
            ((KeyAgreementSpi.DH) eCIESwithAESCBC).getInstance(bArr4, 0, i4);
        } else {
            eCIESwithAESCBC.init(bArr4, 0);
        }
        return bArr4;
    }
}
