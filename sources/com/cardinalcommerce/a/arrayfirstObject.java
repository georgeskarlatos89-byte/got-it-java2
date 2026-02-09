package com.cardinalcommerce.a;

import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.math.BigInteger;

public final class arrayfirstObject {
    private static int[] Cardinal = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    static final int[] configure = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] getInstance = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void Cardinal(int[] iArr, int[] iArr2) {
        if (getErrorMessage.configure(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && getErrorMessage.init(12, iArr2, configure))) {
            Cardinal(iArr2);
        }
    }

    public static int[] cca_continue(BigInteger bigInteger) {
        int[] configure2 = getErrorMessage.configure(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, bigInteger);
        if (configure2[11] == -1) {
            int[] iArr = configure;
            if (getErrorMessage.init(12, configure2, iArr)) {
                getErrorMessage.cca_continue(12, iArr, configure2);
            }
        }
        return configure2;
    }

    public static void configure(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[17]) & 4294967295L;
        long j2 = ((long) iArr[20]) & 4294967295L;
        long j3 = ((long) iArr[21]) & 4294967295L;
        long j4 = ((long) iArr[19]) & 4294967295L;
        long j5 = ((long) iArr[22]) & 4294967295L;
        long j6 = ((long) iArr[18]) & 4294967295L;
        long j7 = ((long) iArr[23]) & 4294967295L;
        long j8 = ((long) iArr[16]) & 4294967295L;
        long j9 = ((((long) iArr[12]) & 4294967295L) + j2) - 1;
        long j10 = j2;
        long j11 = (((long) iArr[13]) & 4294967295L) + j5;
        long j12 = (((long) iArr[14]) & 4294967295L) + j5 + j7;
        long j13 = (((long) iArr[15]) & 4294967295L) + j7;
        long j14 = j + j3;
        long j15 = j3 - j7;
        long j16 = j9 + j15;
        long j17 = j5 - j7;
        long j18 = (((long) iArr[0]) & 4294967295L) + j16 + 0;
        iArr3[0] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[1]) & 4294967295L) + j7) - j9) + j11;
        iArr3[1] = (int) j19;
        long j20 = (j19 >> 32) + (((((long) iArr[2]) & 4294967295L) - j3) - j11) + j12;
        iArr3[2] = (int) j20;
        long j21 = (j20 >> 32) + ((((long) iArr[3]) & 4294967295L) - j12) + j13 + j16;
        iArr3[3] = (int) j21;
        long j22 = (j21 >> 32) + (((((((long) iArr[4]) & 4294967295L) + j8) + j3) + j11) - j13) + j16;
        iArr3[4] = (int) j22;
        long j23 = (j22 >> 32) + ((((long) iArr[5]) & 4294967295L) - j8) + j11 + j12 + j14;
        iArr3[5] = (int) j23;
        long j24 = (j23 >> 32) + (((((long) iArr[6]) & 4294967295L) + j6) - j) + j12 + j13;
        iArr3[6] = (int) j24;
        long j25 = (j24 >> 32) + ((((((long) iArr[7]) & 4294967295L) + j8) + j4) - j6) + j13;
        iArr3[7] = (int) j25;
        long j26 = (j25 >> 32) + (((((((long) iArr[8]) & 4294967295L) + j8) + j) + j10) - j4);
        iArr3[8] = (int) j26;
        long j27 = (j26 >> 32) + (((((long) iArr[9]) & 4294967295L) + j6) - j10) + j14;
        iArr3[9] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[10]) & 4294967295L) + j6) + j4) - j15) + j17;
        iArr3[10] = (int) j28;
        long j29 = (j28 >> 32) + ((((((long) iArr[11]) & 4294967295L) + j4) + j10) - j17);
        iArr3[11] = (int) j29;
        configure((int) ((j29 >> 32) + 1), iArr3);
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        if (getErrorMessage.cca_continue(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && getErrorMessage.init(12, iArr2, configure))) {
            Cardinal(iArr2);
        }
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        if (getErrorMessage.configure(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && getErrorMessage.init(12, iArr3, configure))) {
            Cardinal(iArr3);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        if (getErrorMessage.configure(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && getErrorMessage.init(24, iArr3, Cardinal))) {
            int[] iArr4 = getInstance;
            if (getErrorMessage.Cardinal(iArr4.length, iArr4, iArr3) != 0) {
                int length = iArr4.length;
                while (length < 24) {
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

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[24];
        getErrorCode.init(iArr, iArr2, iArr4);
        configure(iArr4, iArr3);
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 12) {
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
            for (int i2 = 0; i2 < 12; i2++) {
                iArr2[i2] = 0;
            }
            return;
        }
        getErrorMessage.init(12, configure, iArr, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (r0 == false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void configure(int r13, int[] r14) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x0049
            long r4 = (long) r13
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r13 = r14[r0]
            long r8 = (long) r13
            long r8 = r8 & r6
            long r8 = r8 + r4
            long r8 = r8 + r2
            int r13 = (int) r8
            r14[r0] = r13
            r13 = 32
            long r8 = r8 >> r13
            r10 = r14[r1]
            long r10 = (long) r10
            long r10 = r10 & r6
            long r10 = r10 - r4
            long r8 = r8 + r10
            int r10 = (int) r8
            r14[r1] = r10
            long r8 = r8 >> r13
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0031
            r10 = 2
            r11 = r14[r10]
            long r11 = (long) r11
            long r11 = r11 & r6
            long r8 = r8 + r11
            int r11 = (int) r8
            r14[r10] = r11
            long r8 = r8 >> r13
        L_0x0031:
            r10 = 3
            r11 = r14[r10]
            long r11 = (long) r11
            long r11 = r11 & r6
            long r11 = r11 + r4
            long r8 = r8 + r11
            int r11 = (int) r8
            r14[r10] = r11
            long r8 = r8 >> r13
            r10 = 4
            r11 = r14[r10]
            long r11 = (long) r11
            long r6 = r6 & r11
            long r6 = r6 + r4
            long r8 = r8 + r6
            int r4 = (int) r8
            r14[r10] = r4
            long r4 = r8 >> r13
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r2 = 12
            if (r13 == 0) goto L_0x0061
            r13 = 5
        L_0x0051:
            if (r13 >= r2) goto L_0x005e
            r3 = r14[r13]
            int r3 = r3 + r1
            r14[r13] = r3
            if (r3 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            int r13 = r13 + 1
            goto L_0x0051
        L_0x005e:
            r0 = r1
        L_0x005f:
            if (r0 != 0) goto L_0x0070
        L_0x0061:
            r13 = 11
            r13 = r14[r13]
            r0 = -1
            if (r13 != r0) goto L_0x0073
            int[] r13 = configure
            boolean r13 = com.cardinalcommerce.a.getErrorMessage.init((int) r2, (int[]) r14, (int[]) r13)
            if (r13 == 0) goto L_0x0073
        L_0x0070:
            Cardinal(r14)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.arrayfirstObject.configure(int, int[]):void");
    }

    public static void init(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        getErrorCode.getInstance(iArr, iArr3);
        configure(iArr3, iArr2);
    }

    public static void configure(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[24];
        getErrorCode.getInstance(iArr, iArr3);
        while (true) {
            configure(iArr3, iArr2);
            i--;
            if (i > 0) {
                getErrorCode.getInstance(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3) {
        if (getErrorMessage.init(12, iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = (j >> 32) + (((long) iArr3[1]) & 4294967295L) + 1;
            iArr3[1] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j4;
                j3 = j4 >> 32;
            }
            long j5 = j3 + ((((long) iArr3[3]) & 4294967295L) - 1);
            iArr3[3] = (int) j5;
            long j6 = (j5 >> 32) + ((4294967295L & ((long) iArr3[4])) - 1);
            iArr3[4] = (int) j6;
            if ((j6 >> 32) != 0) {
                int i = 5;
                while (i < 12) {
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

    private static void Cardinal(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (4294967295L & ((long) iArr[4])) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            int i = 5;
            while (i < 12) {
                int i2 = iArr[i] + 1;
                iArr[i] = i2;
                if (i2 == 0) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
