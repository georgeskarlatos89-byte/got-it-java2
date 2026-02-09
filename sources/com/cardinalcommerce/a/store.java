package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class store {
    private static final int[] Cardinal = {-1, -1073741826, -1, -1, -1, 1, 1};
    private static int[] cca_continue = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    static final int[] getInstance = {Integer.MAX_VALUE, -1, -1, -1, -1};

    public static void cca_continue(int i, int[] iArr) {
        if ((i != 0 && ProtocolErrorEvent.Cardinal(i, iArr) != 0) || (iArr[4] == -1 && ProtocolErrorEvent.cca_continue(iArr, getInstance))) {
            getErrorMessage.cca_continue(5, -2147483647, iArr);
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        if (getErrorMessage.configure(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && ProtocolErrorEvent.cca_continue(iArr2, getInstance))) {
            getErrorMessage.cca_continue(5, -2147483647, iArr2);
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ProtocolErrorEvent.getInstance(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && ProtocolErrorEvent.cca_continue(iArr3, getInstance))) {
            getErrorMessage.cca_continue(5, -2147483647, iArr3);
        }
    }

    public static int[] cca_continue(BigInteger bigInteger) {
        int[] cca_continue2 = ProtocolErrorEvent.cca_continue(bigInteger);
        if (cca_continue2[4] == -1) {
            int[] iArr = getInstance;
            if (ProtocolErrorEvent.cca_continue(cca_continue2, iArr)) {
                ProtocolErrorEvent.Cardinal(iArr, cca_continue2);
            }
        }
        return cca_continue2;
    }

    public static void configure(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31) + 0;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31);
        iArr3[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31);
        iArr3[4] = (int) j10;
        cca_continue((int) (j10 >>> 32), iArr3);
    }

    public static void init(int[] iArr, int[] iArr2) {
        if (getErrorMessage.cca_continue(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && ProtocolErrorEvent.cca_continue(iArr2, getInstance))) {
            getErrorMessage.cca_continue(5, -2147483647, iArr2);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        ProtocolErrorEvent.init(iArr, iArr2, iArr4);
        configure(iArr4, iArr3);
    }

    public static void Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ProtocolErrorEvent.configure(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && getErrorMessage.init(10, iArr3, cca_continue))) {
            int[] iArr4 = Cardinal;
            if (getErrorMessage.Cardinal(iArr4.length, iArr4, iArr3) != 0) {
                int length = iArr4.length;
                while (length < 10) {
                    int i = iArr3[length] + 1;
                    iArr3[length] = i;
                    if (i == 0) {
                        length++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 5) {
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
            iArr2[4] = 0;
            return;
        }
        ProtocolErrorEvent.getSDKVersion(getInstance, iArr, iArr2);
    }

    public static void Cardinal(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        ProtocolErrorEvent.getInstance(iArr, iArr3);
        configure(iArr3, iArr2);
    }

    public static void cca_continue(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        ProtocolErrorEvent.getInstance(iArr, iArr3);
        while (true) {
            configure(iArr3, iArr2);
            i--;
            if (i > 0) {
                ProtocolErrorEvent.getInstance(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ProtocolErrorEvent.getSDKVersion(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 2147483649L;
            iArr3[0] = (int) j;
            if ((j >> 32) != 0) {
                int i = 1;
                while (i < 5) {
                    int i2 = iArr3[i] - 1;
                    iArr3[i] = i2;
                    if (i2 == -1) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
