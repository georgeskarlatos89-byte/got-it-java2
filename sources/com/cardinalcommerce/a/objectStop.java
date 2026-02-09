package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class objectStop {
    static final int[] configure = {-1, -1, -1, 0, 0, 0, 1, -1};
    private static int[] init = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        if (setErrorCode.getInstance(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && setErrorCode.cca_continue(iArr3, configure))) {
            cca_continue(iArr3);
        }
    }

    private static void cca_continue(int[] iArr) {
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
        long j5 = j2 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = j6 + ((((long) iArr[6]) & 4294967295L) - 1);
        iArr[6] = (int) j9;
        iArr[7] = (int) ((j9 >> 32) + (4294967295L & ((long) iArr[7])) + 1);
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        if (getErrorMessage.cca_continue(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && setErrorCode.cca_continue(iArr2, configure))) {
            cca_continue(iArr2);
        }
    }

    public static void configure(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[9]) & 4294967295L;
        long j2 = ((long) iArr[10]) & 4294967295L;
        long j3 = ((long) iArr[11]) & 4294967295L;
        long j4 = ((long) iArr[12]) & 4294967295L;
        long j5 = ((long) iArr[13]) & 4294967295L;
        long j6 = ((long) iArr[14]) & 4294967295L;
        long j7 = ((long) iArr[15]) & 4294967295L;
        long j8 = (((long) iArr[8]) & 4294967295L) - 6;
        long j9 = j8 + j;
        long j10 = j + j2;
        long j11 = (j2 + j3) - j7;
        long j12 = j3 + j4;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j14 - j9;
        long j17 = j8;
        long j18 = (((((long) iArr[0]) & 4294967295L) - j12) - j16) + 0;
        iArr3[0] = (int) j18;
        long j19 = (j18 >> 32) + ((((((long) iArr[1]) & 4294967295L) + j10) - j13) - j15);
        iArr3[1] = (int) j19;
        long j20 = (j19 >> 32) + (((((long) iArr[2]) & 4294967295L) + j11) - j14);
        iArr3[2] = (int) j20;
        long j21 = (j20 >> 32) + ((((((long) iArr[3]) & 4294967295L) + (j12 << 1)) + j16) - j15);
        iArr3[3] = (int) j21;
        long j22 = (j21 >> 32) + ((((((long) iArr[4]) & 4294967295L) + (j13 << 1)) + j6) - j10);
        iArr3[4] = (int) j22;
        long j23 = (j22 >> 32) + (((((long) iArr[5]) & 4294967295L) + (j14 << 1)) - j11);
        iArr3[5] = (int) j23;
        long j24 = (j23 >> 32) + (((long) iArr[6]) & 4294967295L) + (j15 << 1) + j16;
        iArr3[6] = (int) j24;
        long j25 = (j24 >> 32) + (((((((long) iArr[7]) & 4294967295L) + (j7 << 1)) + j17) - j11) - j13);
        iArr3[7] = (int) j25;
        getInstance((int) ((j25 >> 32) + 6), iArr3);
    }

    public static void getInstance(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + ((((long) iArr[3]) & 4294967295L) - j2);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = j8 + ((((long) iArr[6]) & 4294967295L) - j2);
            iArr[6] = (int) j11;
            long j12 = (j11 >> 32) + (4294967295L & ((long) iArr[7])) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && setErrorCode.cca_continue(iArr, configure))) {
            cca_continue(iArr);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        if (getErrorMessage.configure(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && setErrorCode.cca_continue(iArr2, configure))) {
            cca_continue(iArr2);
        }
    }

    public static int[] getInstance(BigInteger bigInteger) {
        int[] Cardinal = setErrorCode.Cardinal(bigInteger);
        if (Cardinal[7] == -1) {
            int[] iArr = configure;
            if (setErrorCode.cca_continue(Cardinal, iArr)) {
                setErrorCode.cleanup(iArr, Cardinal);
            }
        }
        return Cardinal;
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        if (setErrorCode.configure(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && getErrorMessage.init(16, iArr3, init))) {
            getErrorMessage.cca_continue(16, init, iArr3);
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        setErrorCode.init(iArr, iArr2, iArr4);
        configure(iArr4, iArr3);
    }

    public static void Cardinal(int[] iArr, int[] iArr2) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 8) {
                z = true;
                break;
            } else if (iArr[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setErrorCode.getInstance(iArr2);
        } else {
            setErrorCode.getSDKVersion(configure, iArr, iArr2);
        }
    }

    public static void init(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        setErrorCode.getInstance(iArr, iArr3);
        configure(iArr3, iArr2);
    }

    public static void cca_continue(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        setErrorCode.getInstance(iArr, iArr3);
        while (true) {
            configure(iArr3, iArr2);
            i--;
            if (i > 0) {
                setErrorCode.getInstance(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        if (setErrorCode.getSDKVersion(iArr, iArr2, iArr3) != 0) {
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
            long j5 = j2 + (((long) iArr3[3]) & 4294967295L) + 1;
            iArr3[3] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j7;
                long j8 = (j7 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j8;
                j6 = j8 >> 32;
            }
            long j9 = j6 + (((long) iArr3[6]) & 4294967295L) + 1;
            iArr3[6] = (int) j9;
            iArr3[7] = (int) ((j9 >> 32) + ((((long) iArr3[7]) & 4294967295L) - 1));
        }
    }
}
