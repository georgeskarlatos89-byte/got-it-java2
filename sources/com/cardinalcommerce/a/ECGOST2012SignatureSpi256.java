package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;

public final class ECGOST2012SignatureSpi256 implements BCECGOST3410_2012PublicKey {
    private long[] cca_continue;

    public final void getInstance(byte[] bArr) {
        long[] jArr = new long[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            jArr[i2] = (((long) setTextFontSize.getInstance(bArr, i + 4)) & 4294967295L) | ((((long) setTextFontSize.getInstance(bArr, i)) & 4294967295L) << 32);
            i += 8;
        }
        this.cca_continue = jArr;
    }

    public final void cca_continue(long j, byte[] bArr) {
        long[] jArr;
        byte[] bArr2 = bArr;
        long[] jArr2 = new long[2];
        jArr2[0] = Long.MIN_VALUE;
        if (j > 0) {
            long[] jArr3 = this.cca_continue;
            if (jArr3 == null) {
                jArr = null;
            } else {
                long[] jArr4 = new long[jArr3.length];
                System.arraycopy(jArr3, 0, jArr4, 0, jArr3.length);
                jArr = jArr4;
            }
            long j2 = j;
            do {
                if ((1 & j2) != 0) {
                    KeyAgreementSpi.ECVKO512.configure(jArr2, jArr);
                }
                long[] jArr5 = new long[4];
                EncryptedJWT.configure(jArr[0], jArr5, 0);
                EncryptedJWT.configure(jArr[1], jArr5, 2);
                long j3 = jArr5[0];
                long j4 = jArr5[1];
                long j5 = jArr5[2];
                long j6 = jArr5[3];
                long j7 = j5 ^ (((j6 << 63) ^ (j6 << 62)) ^ (j6 << 57));
                jArr[0] = j3 ^ (((j7 ^ (j7 >>> 1)) ^ (j7 >>> 2)) ^ (j7 >>> 7));
                jArr[1] = (j4 ^ (((j6 ^ (j6 >>> 1)) ^ (j6 >>> 2)) ^ (j6 >>> 7))) ^ (((j7 << 63) ^ (j7 << 62)) ^ (j7 << 57));
                j2 >>>= 1;
            } while (j2 > 0);
        }
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            long j8 = jArr2[i2];
            setTextFontSize.init((int) (j8 >>> 32), bArr2, i);
            setTextFontSize.init((int) j8, bArr2, i + 4);
            i += 8;
        }
    }
}
