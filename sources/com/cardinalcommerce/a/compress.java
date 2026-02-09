package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class compress {
    private static final long[] getInstance = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void Cardinal(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static int cca_continue(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }

    public static void getInstance(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    private static void getInstance(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
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
        long j8 = jArr2[((int) j3) & 3];
        long j9 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j3 >>> i2);
            long j10 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j8 ^= j10 << i2;
            j9 ^= j10 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 36028797018963967L & j8;
        jArr[i + 1] = (j8 >>> 55) ^ (j9 << 9);
    }

    private static void init(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 55);
        jArr[1] = (j2 >>> 9) ^ (j3 << 46);
        jArr[2] = (j3 >>> 18) ^ (j4 << 37);
        jArr[3] = (j4 >>> 27) ^ (j5 << 28);
        jArr[4] = (j5 >>> 36) ^ (j6 << 19);
        jArr[5] = j6 >>> 45;
    }

    public static void init(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36));
        long j9 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j10 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j11 = j8 ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j12 = j9 >>> 35;
        jArr2[0] = (((j10 ^ j12) ^ (j12 << 3)) ^ (j12 << 6)) ^ (j12 << 7);
        jArr2[1] = j11;
        jArr2[2] = 34359738367L & j9;
    }

    private static void init(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (jArr[2] << 18) ^ (j2 >>> 46);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        long[] jArr5 = jArr4;
        init(j5, j10, jArr5, 0);
        init(j3, j8, jArr5, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        long[] jArr6 = jArr4;
        init(j11, j12, jArr6, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        init(j5 ^ j13, j10 ^ j14, jArr6, 6);
        init(j11 ^ j13, j12 ^ j14, jArr6, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = jArr4[9] ^ j17;
        long j19 = jArr4[0];
        long j20 = jArr4[1];
        long j21 = (j20 ^ j19) ^ jArr4[4];
        long j22 = j20 ^ jArr4[5];
        long j23 = jArr4[2];
        long j24 = ((((j16 << 1) ^ j15) ^ j19) ^ (j23 << 4)) ^ (j23 << 1);
        long j25 = jArr4[3];
        long j26 = (((j21 ^ ((j16 ^ (j18 << 1)) ^ j17)) ^ (j25 << 4)) ^ (j25 << 1)) ^ (j24 >>> 55);
        long j27 = (j22 ^ j18) ^ (j26 >>> 55);
        long j28 = j26 & 36028797018963967L;
        long j29 = ((j24 & 36028797018963967L) >>> 1) ^ ((j28 & 1) << 54);
        long j30 = j29 ^ (j29 << 1);
        long j31 = j30 ^ (j30 << 2);
        long j32 = j31 ^ (j31 << 4);
        long j33 = j32 ^ (j32 << 8);
        long j34 = j33 ^ (j33 << 16);
        long j35 = (j34 ^ (j34 << 32)) & 36028797018963967L;
        long j36 = ((j28 >>> 1) ^ ((j27 & 1) << 54)) ^ (j35 >>> 54);
        long j37 = j36 ^ (j36 << 1);
        long j38 = j37 ^ (j37 << 2);
        long j39 = j38 ^ (j38 << 4);
        long j40 = j39 ^ (j39 << 8);
        long j41 = j40 ^ (j40 << 16);
        long j42 = (j41 ^ (j41 << 32)) & 36028797018963967L;
        long j43 = (j27 >>> 1) ^ (j42 >>> 54);
        long j44 = j43 ^ (j43 << 1);
        long j45 = j44 ^ (j44 << 2);
        long j46 = j45 ^ (j45 << 4);
        long j47 = j46 ^ (j46 << 8);
        long j48 = j47 ^ (j47 << 16);
        long j49 = j48 ^ (j48 << 32);
        jArr3[0] = j19;
        jArr3[1] = (j21 ^ j35) ^ j23;
        jArr3[2] = ((j22 ^ j42) ^ j35) ^ j25;
        jArr3[3] = j49 ^ j42;
        jArr3[4] = jArr4[2] ^ j49;
        jArr3[5] = jArr4[3];
        init(jArr3);
    }

    private static void onValidated(long[] jArr, long[] jArr2) {
        EncryptedJWT.Cardinal(jArr[0], jArr2, 0);
        EncryptedJWT.Cardinal(jArr[1], jArr2, 2);
        long j = jArr[2];
        jArr2[4] = EncryptedJWT.getInstance((int) j);
        jArr2[5] = ((long) EncryptedJWT.configure((int) (j >>> 32))) & 4294967295L;
    }

    public static long[] getInstance(BigInteger bigInteger) {
        long[] cca_continue = RuntimeErrorEvent.cca_continue(bigInteger);
        long j = cca_continue[2];
        long j2 = j >>> 35;
        cca_continue[0] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ cca_continue[0];
        cca_continue[2] = j & 34359738367L;
        return cca_continue;
    }

    public static void configure(long[] jArr, long[] jArr2) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = true;
                break;
            } else if (jArr[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            long[] jArr5 = new long[6];
            onValidated(jArr, jArr5);
            init(jArr5, jArr3);
            getInstance(jArr3, 1, jArr4);
            long[] jArr6 = new long[6];
            init(jArr3, jArr4, jArr6);
            init(jArr6, jArr3);
            getInstance(jArr4, 1, jArr4);
            long[] jArr7 = new long[6];
            init(jArr3, jArr4, jArr7);
            init(jArr7, jArr3);
            getInstance(jArr3, 3, jArr4);
            long[] jArr8 = new long[6];
            init(jArr3, jArr4, jArr8);
            init(jArr8, jArr3);
            getInstance(jArr4, 3, jArr4);
            long[] jArr9 = new long[6];
            init(jArr3, jArr4, jArr9);
            init(jArr9, jArr3);
            getInstance(jArr3, 9, jArr4);
            long[] jArr10 = new long[6];
            init(jArr3, jArr4, jArr10);
            init(jArr10, jArr3);
            getInstance(jArr4, 9, jArr4);
            long[] jArr11 = new long[6];
            init(jArr3, jArr4, jArr11);
            init(jArr11, jArr3);
            getInstance(jArr3, 27, jArr4);
            long[] jArr12 = new long[6];
            init(jArr3, jArr4, jArr12);
            init(jArr12, jArr3);
            getInstance(jArr4, 27, jArr4);
            long[] jArr13 = new long[6];
            init(jArr3, jArr4, jArr13);
            init(jArr13, jArr3);
            getInstance(jArr3, 81, jArr4);
            long[] jArr14 = new long[6];
            init(jArr3, jArr4, jArr14);
            init(jArr14, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void configure(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        init(jArr, jArr2, jArr4);
        init(jArr4, jArr3);
    }

    public static void cca_continue(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        init(jArr, jArr2, jArr4);
        getInstance(jArr3, jArr4, jArr3);
    }

    public static void Cardinal(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[3];
        long instance = EncryptedJWT.getInstance(jArr[0]);
        long instance2 = EncryptedJWT.getInstance(jArr[1]);
        jArr3[0] = (instance >>> 32) | (instance2 & -4294967296L);
        long instance3 = EncryptedJWT.getInstance(jArr[2]);
        long j = instance3 & 4294967295L;
        jArr3[1] = instance3 >>> 32;
        long[] jArr4 = new long[6];
        init(jArr3, getInstance, jArr4);
        init(jArr4, jArr2);
        jArr2[0] = jArr2[0] ^ ((instance & 4294967295L) | (instance2 << 32));
        jArr2[1] = jArr2[1] ^ j;
    }

    public static void cca_continue(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        onValidated(jArr, jArr3);
        init(jArr3, jArr2);
    }

    public static void onCReqSuccess(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        onValidated(jArr, jArr3);
        getInstance(jArr2, jArr3, jArr2);
    }

    public static void getInstance(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[6];
        onValidated(jArr, jArr3);
        while (true) {
            init(jArr3, jArr2);
            i--;
            if (i > 0) {
                onValidated(jArr2, jArr3);
            } else {
                return;
            }
        }
    }
}
