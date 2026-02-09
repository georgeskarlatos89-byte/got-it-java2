package com.cardinalcommerce.a;

import java.math.BigInteger;

public abstract class ProtocolErrorEvent {
    public static int Cardinal(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4])));
        iArr2[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static int Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static long cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = (j * 21389) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j2;
        long j3 = ((long) iArr[6]) & 4294967295L;
        long j4 = (j2 >>> 32) + (j3 * 21389) + j + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j4;
        long j5 = j4 >>> 32;
        long j6 = ((long) iArr[7]) & 4294967295L;
        long j7 = j5 + (j6 * 21389) + j3 + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j7;
        long j8 = ((long) iArr[8]) & 4294967295L;
        long j9 = (j7 >>> 32) + (j8 * 21389) + j6 + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j9;
        long j10 = ((long) iArr[9]) & 4294967295L;
        long j11 = (j9 >>> 32) + (21389 * j10) + j8 + (4294967295L & ((long) iArr2[4]));
        iArr3[4] = (int) j11;
        return (j11 >>> 32) + j10;
    }

    public static boolean cca_continue(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static int configure(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = 0;
        while (i < 5) {
            long j8 = ((long) iArr[i]) & j;
            long j9 = (j8 * j2) + (((long) iArr3[i]) & j) + 0;
            iArr3[i] = (int) j9;
            int i2 = i + 1;
            long j10 = j3;
            long j11 = (j9 >>> 32) + (j8 * j3) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j11;
            int i3 = i + 2;
            long j12 = j4;
            long j13 = (j11 >>> 32) + (j8 * j4) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j13;
            int i4 = i + 3;
            long j14 = (j13 >>> 32) + (j8 * j5) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j14;
            int i5 = i + 4;
            long j15 = (j14 >>> 32) + (j8 * j6) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j15;
            int i6 = i + 5;
            long j16 = (j15 >>> 32) + j7 + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j16;
            j7 = j16 >>> 32;
            i = i2;
            j = 4294967295L;
            j2 = j2;
            j3 = j10;
            j4 = j12;
        }
        return (int) j7;
    }

    public static int getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        return (int) (j5 >>> 32);
    }

    public static BigInteger getInstance(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                setTextFontSize.init(i2, bArr, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 10;
        int i2 = 0;
        int i3 = 4;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i2 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (((long) (i6 << 31)) & 4294967295L) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = j5 + (j6 * j);
                int i7 = (int) j7;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j8 = (((long) iArr2[2]) & 4294967295L) + (j7 >>> 32);
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = j8 + (j9 * j);
                int i8 = (int) j10;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                int i9 = i8 >>> 31;
                long j11 = (((long) iArr2[3]) & 4294967295L) + (j10 >>> 32) + (j9 * j6);
                long j12 = (((long) iArr2[4]) & 4294967295L) + (j11 >>> 32);
                long j13 = ((long) iArr[3]) & 4294967295L;
                long j14 = j9;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j12 >>> 32);
                long j16 = j6;
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j18 = (j11 & 4294967295L) + (j13 * j);
                int i10 = (int) j18;
                iArr2[3] = (i10 << 1) | i9;
                int i11 = i10 >>> 31;
                long j19 = (j12 & 4294967295L) + (j18 >>> 32) + (j13 * j16);
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j13 * j14);
                long j21 = j17 + (j20 >>> 32);
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (((long) iArr2[7]) & 4294967295L) + (j21 >>> 32);
                long j24 = (j19 & 4294967295L) + (j * j22);
                int i12 = (int) j24;
                iArr2[4] = (i12 << 1) | i11;
                long j25 = (j20 & 4294967295L) + (j24 >>> 32) + (j22 * j16);
                long j26 = (j21 & 4294967295L) + (j25 >>> 32) + (j22 * j14);
                long j27 = (4294967295L & j23) + (j26 >>> 32) + (j22 * j13);
                long j28 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32) + (j27 >>> 32);
                int i13 = (int) j25;
                iArr2[5] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j26;
                iArr2[6] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) j27;
                iArr2[7] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j28;
                iArr2[8] = i17 | (i18 << 1);
                iArr2[9] = (i18 >>> 31) | ((iArr2[9] + ((int) (j28 >>> 32))) << 1);
                return;
            }
            i3 = i4;
            i2 = i6;
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2, int i) {
        iArr2[i] = iArr[0];
        iArr2[i + 1] = iArr[1];
        iArr2[i + 2] = iArr[2];
        iArr2[i + 3] = iArr[3];
        iArr2[i + 4] = iArr[4];
    }

    public static int getSDKVersion(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = (j6 * j) + 0;
        iArr3[0] = (int) j7;
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j5);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j3);
        iArr3[3] = (int) j10;
        long j11 = (j10 >>> 32) + (j6 * j4);
        iArr3[4] = (int) j11;
        iArr3[5] = (int) (j11 >>> 32);
        for (int i2 = 5; i < i2; i2 = 5) {
            long j12 = ((long) iArr[i]) & 4294967295L;
            long j13 = (j12 * j) + (((long) iArr3[i]) & 4294967295L) + 0;
            iArr3[i] = (int) j13;
            int i3 = i + 1;
            int i4 = i3;
            long j14 = (j13 >>> 32) + (j12 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i4] = (int) j14;
            int i5 = i + 2;
            long j15 = j2;
            long j16 = (j14 >>> 32) + (j12 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j16;
            int i6 = i + 3;
            long j17 = (j16 >>> 32) + (j12 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j17;
            int i7 = i + 4;
            long j18 = (j17 >>> 32) + (j12 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j18;
            iArr3[i + 5] = (int) (j18 >>> 32);
            j3 = j3;
            j = j;
            i = i4;
            j2 = j15;
        }
    }

    public static int[] cca_continue(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[5];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArr;
    }

    public static int getInstance(long j, int[] iArr) {
        long j2 = j & 4294967295L;
        long j3 = (j2 * 21389) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j3;
        long j4 = j >>> 32;
        long j5 = (j3 >>> 32) + (21389 * j4) + j2 + (((long) iArr[1]) & 4294967295L);
        iArr[1] = (int) j5;
        long j6 = (j5 >>> 32) + j4 + (((long) iArr[2]) & 4294967295L);
        iArr[2] = (int) j6;
        long j7 = (j6 >>> 32) + (4294967295L & ((long) iArr[3]));
        iArr[3] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        int i = iArr[4] + 1;
        iArr[4] = i;
        return i != 0 ? 0 : 1;
    }

    public static int Cardinal(int i, int[] iArr) {
        long j = ((((long) i) & 4294967295L) * 2147483649L) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[1]));
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        for (int i2 = 2; i2 < 5; i2++) {
            int i3 = i2 + 0;
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
