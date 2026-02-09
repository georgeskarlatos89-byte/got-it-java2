package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;

public final class arrayObjectEnd implements KeyAgreementSpi.CDHwithSHA512KDFAndSharedInfo {
    private DigestSignatureSpi.SHA384 getInstance;
    private final KeyAgreementSpi.CDHwithSHA512KDFAndSharedInfo init;

    public arrayObjectEnd() {
    }

    public static void Cardinal(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    static void cca_continue(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    private static void configure(long j, long j2, long[] jArr, int i) {
        long j3 = j;
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        long j4 = j2 << 1;
        jArr2[2] = j4;
        long j5 = j4 ^ j2;
        jArr2[3] = j5;
        long j6 = j4 << 1;
        jArr2[4] = j6;
        jArr2[5] = j6 ^ j2;
        long j7 = j5 << 1;
        jArr2[6] = j7;
        jArr2[7] = j7 ^ j2;
        long j8 = jArr2[((int) j3) & 7];
        long j9 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j3 >>> i2);
            long j10 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j8 ^= j10 << i2;
            j9 ^= j10 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j8;
        jArr[i + 1] = (((((j3 & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j9) << 7) ^ (j8 >>> 57);
    }

    static void init(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = 144115188075855871L & j4;
        long[] jArr4 = new long[6];
        long[] jArr5 = jArr4;
        configure(j3, j6, jArr4, 0);
        configure(j2, j5, jArr5, 2);
        configure(j3 ^ j2, j6 ^ j5, jArr5, 4);
        long j7 = jArr5[1] ^ jArr5[2];
        long j8 = jArr5[0];
        long j9 = jArr5[3];
        long j10 = (jArr5[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr5[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void Cardinal(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[4];
        EncryptedJWT.Cardinal(jArr[0], jArr3, 0);
        EncryptedJWT.Cardinal(jArr[1], jArr3, 2);
        Cardinal(jArr3, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                EncryptedJWT.Cardinal(jArr2[0], jArr3, 0);
                EncryptedJWT.Cardinal(jArr2[1], jArr3, 2);
                Cardinal(jArr3, jArr2);
            } else {
                return;
            }
        }
    }

    public arrayObjectEnd(KeyAgreementSpi.CDHwithSHA512KDFAndSharedInfo cDHwithSHA512KDFAndSharedInfo) {
        this.init = cDHwithSHA512KDFAndSharedInfo;
    }

    public final void init(GMCipherSpi.SM2withRMD sM2withRMD) {
        this.getInstance = (DigestSignatureSpi.SHA384) sM2withRMD;
    }

    public final int getInstance() {
        return this.init.getInstance() << 1;
    }

    public final void init(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr, int i) {
        DigestSignatureSpi.SHA512_224 sha512_224 = (DigestSignatureSpi.SHA512_224) sM2withRMD;
        this.init.init(this.getInstance.cca_continue);
        this.init.init(sha512_224.init, bArr, i);
        this.init.init(this.getInstance.configure);
        this.init.init(sha512_224.getInstance, bArr, i + this.init.getInstance());
    }
}
