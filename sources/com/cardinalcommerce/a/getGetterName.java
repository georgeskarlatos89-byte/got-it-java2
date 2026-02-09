package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class getGetterName {
    private static final long[] Cardinal = {2791191049453778211L, 2791191049453778402L, 6};

    private static void Cardinal(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 44);
        jArr[1] = (j2 >>> 20) ^ (j3 << 24);
        jArr[2] = ((j3 >>> 40) ^ (j4 << 4)) ^ (j5 << 48);
        jArr[3] = ((j4 >>> 60) ^ (j6 << 28)) ^ (j5 >>> 16);
        jArr[4] = j6 >>> 36;
        jArr[5] = 0;
    }

    public static void configure(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static void configure(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static int getInstance(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }

    private static void getInstance(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & 17592186044415L;
        long j4 = ((j2 << 20) ^ (j >>> 44)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j9 = ((j6 >>> 44) ^ (j7 << 20)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
        long[] jArr4 = new long[10];
        init(j5, j10, jArr4, 0);
        init(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        long[] jArr5 = jArr4;
        init(j11, j12, jArr5, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        init(j5 ^ j13, j10 ^ j14, jArr5, 6);
        init(j11 ^ j13, j12 ^ j14, jArr5, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = jArr4[9] ^ j17;
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 44);
        long j29 = (j24 ^ j18) ^ (j28 >>> 44);
        long j30 = j28 & 17592186044415L;
        long j31 = ((j26 & 17592186044415L) >>> 1) ^ ((j30 & 1) << 43);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 17592186044415L;
        long j38 = ((j30 >>> 1) ^ ((j29 & 1) << 43)) ^ (j37 >>> 43);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 17592186044415L;
        long j45 = (j44 >>> 43) ^ (j29 >>> 1);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j21;
        jArr3[1] = (j23 ^ j37) ^ j25;
        jArr3[2] = ((j24 ^ j44) ^ j37) ^ j27;
        jArr3[3] = j51 ^ j44;
        jArr3[4] = jArr4[2] ^ j51;
        jArr3[5] = jArr4[3];
        Cardinal(jArr3);
    }

    private static void init(long j, long j2, long[] jArr, int i) {
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
        int i2 = (int) j3;
        long j8 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        long j9 = 0;
        int i3 = 33;
        do {
            int i4 = (int) (j3 >>> i3);
            long j10 = ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9);
            j8 ^= j10 << i3;
            j9 ^= j10 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = 17592186044415L & j8;
        jArr[i + 1] = (j8 >>> 44) ^ (j9 << 20);
    }

    public static void init(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j10 >>> 56) ^ j8;
        jArr2[2] = 7 & j9;
    }

    private static void init(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] Cardinal(BigInteger bigInteger) {
        long[] cca_continue = RuntimeErrorEvent.cca_continue(bigInteger);
        long j = cca_continue[2];
        long j2 = j >>> 3;
        cca_continue[0] = cca_continue[0] ^ ((((j2 << 2) ^ j2) ^ (j2 << 3)) ^ (j2 << 8));
        cca_continue[1] = (j2 >>> 56) ^ cca_continue[1];
        cca_continue[2] = j & 7;
        return cca_continue;
    }

    public static void Cardinal(long[] jArr, long[] jArr2) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = true;
                break;
            } else if (jArr[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            long[] jArr5 = new long[5];
            EncryptedJWT.Cardinal(jArr[0], jArr5, 0);
            EncryptedJWT.Cardinal(jArr[1], jArr5, 2);
            jArr5[4] = ((long) EncryptedJWT.configure((int) jArr[2])) & 4294967295L;
            init(jArr5, jArr3);
            long[] jArr6 = new long[6];
            getInstance(jArr3, jArr, jArr6);
            init(jArr6, jArr3);
            Cardinal(jArr3, 2, jArr4);
            long[] jArr7 = new long[6];
            getInstance(jArr4, jArr3, jArr7);
            init(jArr7, jArr4);
            Cardinal(jArr4, 4, jArr3);
            long[] jArr8 = new long[6];
            getInstance(jArr3, jArr4, jArr8);
            init(jArr8, jArr3);
            Cardinal(jArr3, 8, jArr4);
            long[] jArr9 = new long[6];
            getInstance(jArr4, jArr3, jArr9);
            init(jArr9, jArr4);
            Cardinal(jArr4, 16, jArr3);
            long[] jArr10 = new long[6];
            getInstance(jArr3, jArr4, jArr10);
            init(jArr10, jArr3);
            Cardinal(jArr3, 32, jArr4);
            long[] jArr11 = new long[6];
            getInstance(jArr4, jArr3, jArr11);
            init(jArr11, jArr4);
            long[] jArr12 = new long[5];
            EncryptedJWT.Cardinal(jArr4[0], jArr12, 0);
            EncryptedJWT.Cardinal(jArr4[1], jArr12, 2);
            jArr12[4] = ((long) EncryptedJWT.configure((int) jArr4[2])) & 4294967295L;
            init(jArr12, jArr4);
            long[] jArr13 = new long[6];
            getInstance(jArr4, jArr, jArr13);
            init(jArr13, jArr4);
            Cardinal(jArr4, 65, jArr3);
            long[] jArr14 = new long[6];
            getInstance(jArr3, jArr4, jArr14);
            init(jArr14, jArr3);
            long[] jArr15 = new long[5];
            EncryptedJWT.Cardinal(jArr3[0], jArr15, 0);
            EncryptedJWT.Cardinal(jArr3[1], jArr15, 2);
            jArr15[4] = ((long) EncryptedJWT.configure((int) jArr3[2])) & 4294967295L;
            init(jArr15, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void Cardinal(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        getInstance(jArr, jArr2, jArr4);
        init(jArr4, jArr3);
    }

    public static void cca_continue(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        getInstance(jArr, jArr2, jArr4);
        init(jArr3, jArr4, jArr3);
    }

    public static void getInstance(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[3];
        long instance = EncryptedJWT.getInstance(jArr[0]);
        long instance2 = EncryptedJWT.getInstance(jArr[1]);
        jArr3[0] = (instance >>> 32) | (instance2 & -4294967296L);
        long instance3 = EncryptedJWT.getInstance(jArr[2]);
        long j = instance3 & 4294967295L;
        jArr3[1] = instance3 >>> 32;
        long[] jArr4 = new long[6];
        getInstance(jArr3, Cardinal, jArr4);
        init(jArr4, jArr2);
        jArr2[0] = jArr2[0] ^ ((instance & 4294967295L) | (instance2 << 32));
        jArr2[1] = jArr2[1] ^ j;
    }

    public static void cca_continue(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        EncryptedJWT.Cardinal(jArr[0], jArr3, 0);
        EncryptedJWT.Cardinal(jArr[1], jArr3, 2);
        jArr3[4] = ((long) EncryptedJWT.configure((int) jArr[2])) & 4294967295L;
        init(jArr3, jArr2);
    }

    public static void onValidated(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        EncryptedJWT.Cardinal(jArr[0], jArr3, 0);
        EncryptedJWT.Cardinal(jArr[1], jArr3, 2);
        jArr3[4] = ((long) EncryptedJWT.configure((int) jArr[2])) & 4294967295L;
        init(jArr2, jArr3, jArr2);
    }

    public static void Cardinal(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[5];
        EncryptedJWT.Cardinal(jArr[0], jArr3, 0);
        EncryptedJWT.Cardinal(jArr[1], jArr3, 2);
        jArr3[4] = ((long) EncryptedJWT.configure((int) jArr[2])) & 4294967295L;
        init(jArr3, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                EncryptedJWT.Cardinal(jArr2[0], jArr3, 0);
                EncryptedJWT.Cardinal(jArr2[1], jArr3, 2);
                jArr3[4] = ((long) EncryptedJWT.configure((int) jArr2[2])) & 4294967295L;
                init(jArr3, jArr2);
            } else {
                return;
            }
        }
    }
}
