package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class asLong {
    static final int[] cca_continue = {-1, -1, -1, -3};
    private static int[] getInstance = {1, 0, 0, 4, -2, -1, 3, -4};
    private static final int[] init = {-1, -1, -1, -5, 1, 0, -4, 3};

    private static void Cardinal(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + (4294967295L & ((long) iArr[3])) + 2);
    }

    public static void Cardinal(int[] iArr, int[] iArr2) {
        if (getErrorMessage.configure(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && getTransactionStatus.init(iArr2, cca_continue))) {
            Cardinal(iArr2);
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[7]) & 4294967295L;
        long j2 = (((long) iArr[3]) & 4294967295L) + j;
        long j3 = (((long) iArr[6]) & 4294967295L) + (j << 1);
        long j4 = (((long) iArr[2]) & 4294967295L) + j3;
        long j5 = (((long) iArr[5]) & 4294967295L) + (j3 << 1);
        long j6 = (((long) iArr[1]) & 4294967295L) + j5;
        long j7 = (((long) iArr[4]) & 4294967295L) + (j5 << 1);
        long j8 = (((long) iArr[0]) & 4294967295L) + j7;
        iArr3[0] = (int) j8;
        long j9 = j6 + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = j4 + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = j2 + (j7 << 1) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        getInstance((int) (j11 >>> 32), iArr3);
    }

    public static void configure(int[] iArr, int[] iArr2) {
        if (getErrorMessage.cca_continue(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && getTransactionStatus.init(iArr2, cca_continue))) {
            Cardinal(iArr2);
        }
    }

    public static void getInstance(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (4294967295L & ((long) iArr[3])) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        int i = (int) j4;
        iArr3[3] = i;
        if (((int) (j4 >>> 32)) != 0 || ((i >>> 1) >= 2147483646 && getTransactionStatus.init(iArr3, cca_continue))) {
            Cardinal(iArr3);
        }
    }

    public static int[] cca_continue(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[4];
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArr[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        if ((iArr[3] >>> 1) >= 2147483646) {
            int[] iArr2 = cca_continue;
            if (getTransactionStatus.init(iArr, iArr2)) {
                long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
                iArr[0] = (int) j;
                long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
                iArr[1] = (int) j2;
                long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
                iArr[2] = (int) j3;
                iArr[3] = (int) ((j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)));
            }
        }
        return iArr;
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[8];
        getTransactionStatus.getInstance(iArr, iArr2, iArr4);
        cca_continue(iArr4, iArr3);
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr3;
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = 0;
        while (i < 4) {
            long j7 = ((long) iArr[i]) & j;
            long j8 = j2;
            long j9 = (j7 * j2) + (((long) iArr4[i]) & j) + 0;
            iArr4[i] = (int) j9;
            int i2 = i + 1;
            long j10 = (j9 >>> 32) + (j7 * j3) + (((long) iArr4[i2]) & 4294967295L);
            iArr4[i2] = (int) j10;
            int i3 = i + 2;
            long j11 = (j10 >>> 32) + (j7 * j4) + (((long) iArr4[i3]) & 4294967295L);
            iArr4[i3] = (int) j11;
            int i4 = i + 3;
            long j12 = (j11 >>> 32) + (j7 * j5) + (((long) iArr4[i4]) & 4294967295L);
            iArr4[i4] = (int) j12;
            int i5 = i + 4;
            long j13 = (j12 >>> 32) + j6 + (((long) iArr4[i5]) & 4294967295L);
            iArr4[i5] = (int) j13;
            j6 = j13 >>> 32;
            j = 4294967295L;
            j2 = j8;
            i = i2;
            j3 = j3;
        }
        if (((int) j6) != 0 || ((iArr4[7] >>> 1) >= 2147483646 && setErrorCode.cca_continue(iArr4, getInstance))) {
            int[] iArr5 = init;
            getErrorMessage.Cardinal(iArr5.length, iArr5, iArr4);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 4) {
                z = true;
                break;
            } else if (iArr[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            return;
        }
        getTransactionStatus.Cardinal(cca_continue, iArr, iArr2);
    }

    public static void init(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[8];
        getTransactionStatus.cca_continue(iArr, iArr3);
        cca_continue(iArr3, iArr2);
    }

    public static void cca_continue(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[8];
        getTransactionStatus.cca_continue(iArr, iArr3);
        while (true) {
            cca_continue(iArr3, iArr2);
            i--;
            if (i > 0) {
                getTransactionStatus.cca_continue(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        if (getTransactionStatus.Cardinal(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                long j4 = (j3 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j2 = j4 >> 32;
            }
            iArr3[3] = (int) (j2 + ((4294967295L & ((long) iArr3[3])) - 2));
        }
    }
}
