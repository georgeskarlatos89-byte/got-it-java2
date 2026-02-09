package com.cardinalcommerce.a;

import java.math.BigInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

public final class asDoubleObj {
    static final int[] cca_continue = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] getInstance = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void Cardinal(int[] iArr, int[] iArr2) {
        getErrorMessage.cca_continue(8, iArr, 0, iArr2);
        if (setErrorCode.cca_continue(iArr2, cca_continue)) {
            Cardinal(iArr2);
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        getErrorMessage.configure(8, iArr, iArr2);
        if (setErrorCode.cca_continue(iArr2, cca_continue)) {
            Cardinal(iArr2);
        }
    }

    public static void configure(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        getErrorMessage.cca_continue(iArr, i, iArr2);
        int i2 = iArr2[7];
        iArr2[7] = (Integer.MAX_VALUE & i2) + getErrorMessage.cca_continue(7, ((setErrorCode.Cardinal(iArr, iArr2) << 1) + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (setErrorCode.cca_continue(iArr2, cca_continue)) {
            Cardinal(iArr2);
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3) {
        setErrorCode.getInstance(iArr, iArr2, iArr3);
        if (setErrorCode.cca_continue(iArr3, cca_continue)) {
            Cardinal(iArr3);
        }
    }

    public static void getInstance(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + getErrorMessage.cca_continue(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (setErrorCode.cca_continue(iArr, cca_continue)) {
            Cardinal(iArr);
        }
    }

    public static int[] init(BigInteger bigInteger) {
        int[] Cardinal = setErrorCode.Cardinal(bigInteger);
        while (true) {
            int[] iArr = cca_continue;
            if (!setErrorCode.cca_continue(Cardinal, iArr)) {
                return Cardinal;
            }
            setErrorCode.cleanup(iArr, Cardinal);
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        setErrorCode.init(iArr, iArr2, iArr4);
        configure(iArr4, iArr3);
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        setErrorCode.configure(iArr, iArr2, iArr3);
        int[] iArr4 = getInstance;
        if (getErrorMessage.init(16, iArr3, iArr4)) {
            int i2 = 0;
            long j = (((long) iArr3[0]) & 4294967295L) - (((long) iArr4[0]) & 4294967295L);
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                int i3 = 1;
                while (true) {
                    i = -1;
                    if (i3 >= 8) {
                        break;
                    }
                    int i4 = iArr3[i3] - 1;
                    iArr3[i3] = i4;
                    if (i4 != -1) {
                        i = 0;
                        break;
                    }
                    i3++;
                }
                j2 = (long) i;
            }
            long j3 = j2 + (((long) iArr3[8]) & 4294967295L) + 19;
            iArr3[8] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                int i5 = 9;
                while (true) {
                    if (i5 >= 15) {
                        i2 = 1;
                        break;
                    }
                    int i6 = iArr3[i5] + 1;
                    iArr3[i5] = i6;
                    if (i6 != 0) {
                        break;
                    }
                    i5++;
                }
                j4 = (long) i2;
            }
            iArr3[15] = (int) (j4 + ((((long) iArr3[15]) & 4294967295L) - (4294967295L & ((long) (getInstance[15] + 1)))));
        }
    }

    public static void init(int[] iArr, int[] iArr2) {
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
            setErrorCode.getSDKVersion(cca_continue, iArr, iArr2);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
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

    public static void Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        if (setErrorCode.getSDKVersion(iArr, iArr2, iArr3) != 0) {
            int i = 0;
            long j = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                int i2 = 1;
                while (true) {
                    if (i2 >= 7) {
                        i = -1;
                        break;
                    }
                    int i3 = iArr3[i2] - 1;
                    iArr3[i2] = i3;
                    if (i3 != -1) {
                        break;
                    }
                    i2++;
                }
                j2 = (long) i;
            }
            iArr3[7] = (int) (j2 + (((long) iArr3[7]) & 4294967295L) + 2147483648L);
        }
    }

    private static int Cardinal(int[] iArr) {
        int i = 0;
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            int i2 = 1;
            while (true) {
                if (i2 >= 7) {
                    i = 1;
                    break;
                }
                int i3 = iArr[i2] + 1;
                iArr[i2] = i3;
                if (i3 != 0) {
                    break;
                }
                i2++;
            }
            j2 = (long) i;
        }
        long j3 = j2 + ((4294967295L & ((long) iArr[7])) - 2147483648L);
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }
}
