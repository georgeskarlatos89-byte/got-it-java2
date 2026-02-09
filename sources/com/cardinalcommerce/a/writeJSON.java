package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class writeJSON {
    private static final int[] cca_continue = {-1, -1, -3, -1, -2, -1, 1, 0, 2};
    private static int[] configure = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    static final int[] getInstance = {-1, -1, -2, -1, -1, -1};

    public static void Cardinal(int[] iArr, int[] iArr2) {
        if (getErrorMessage.configure(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && RuntimeErrorEvent.init(iArr2, getInstance))) {
            cca_continue(iArr2);
        }
    }

    public static void configure(int[] iArr, int[] iArr2) {
        if (getErrorMessage.cca_continue(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && RuntimeErrorEvent.init(iArr2, getInstance))) {
            cca_continue(iArr2);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        if (RuntimeErrorEvent.init(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && RuntimeErrorEvent.init(iArr3, getInstance))) {
            cca_continue(iArr3);
        }
    }

    public static int[] getInstance(BigInteger bigInteger) {
        int[] configure2 = RuntimeErrorEvent.configure(bigInteger);
        if (configure2[5] == -1) {
            int[] iArr = getInstance;
            if (RuntimeErrorEvent.init(configure2, iArr)) {
                RuntimeErrorEvent.Cardinal(iArr, configure2);
            }
        }
        return configure2;
    }

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        RuntimeErrorEvent.Cardinal(iArr, iArr2, iArr4);
        getInstance(iArr4, iArr3);
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        if (RuntimeErrorEvent.cca_continue(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && getErrorMessage.init(12, iArr3, configure))) {
            int[] iArr4 = cca_continue;
            if (getErrorMessage.Cardinal(iArr4.length, iArr4, iArr3) != 0) {
                int length = iArr4.length;
                while (length < 12) {
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

    public static void init(int[] iArr, int[] iArr2) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 6) {
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
            iArr2[5] = 0;
            return;
        }
        RuntimeErrorEvent.getWarnings(getInstance, iArr, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b9, code lost:
        if (r16 == false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getInstance(int[] r26, int[] r27) {
        /*
            r0 = r27
            r1 = 6
            r2 = r26[r1]
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            r6 = 7
            r6 = r26[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 8
            r8 = r26[r8]
            long r8 = (long) r8
            long r8 = r8 & r4
            r10 = 9
            r10 = r26[r10]
            long r10 = (long) r10
            long r10 = r10 & r4
            r12 = 10
            r12 = r26[r12]
            long r12 = (long) r12
            long r12 = r12 & r4
            r14 = 11
            r14 = r26[r14]
            long r14 = (long) r14
            long r14 = r14 & r4
            long r12 = r12 + r2
            long r14 = r14 + r6
            r16 = 0
            r1 = r26[r16]
            r17 = r6
            long r6 = (long) r1
            long r6 = r6 & r4
            long r6 = r6 + r12
            r19 = 0
            long r6 = r6 + r19
            int r1 = (int) r6
            r21 = 32
            long r6 = r6 >> r21
            r22 = 1
            r23 = r1
            r1 = r26[r22]
            r24 = r2
            long r1 = (long) r1
            long r1 = r1 & r4
            long r1 = r1 + r14
            long r6 = r6 + r1
            int r1 = (int) r6
            r0[r22] = r1
            long r2 = r6 >> r21
            long r12 = r12 + r8
            long r14 = r14 + r10
            r6 = 2
            r7 = r26[r6]
            long r7 = (long) r7
            long r7 = r7 & r4
            long r7 = r7 + r12
            long r2 = r2 + r7
            long r7 = r2 & r4
            long r2 = r2 >> r21
            r9 = 3
            r10 = r26[r9]
            long r10 = (long) r10
            long r10 = r10 & r4
            long r10 = r10 + r14
            long r2 = r2 + r10
            int r10 = (int) r2
            r0[r9] = r10
            long r2 = r2 >> r21
            long r12 = r12 - r24
            long r14 = r14 - r17
            r10 = 4
            r11 = r26[r10]
            r24 = r7
            long r6 = (long) r11
            long r6 = r6 & r4
            long r6 = r6 + r12
            long r2 = r2 + r6
            int r6 = (int) r2
            r0[r10] = r6
            long r2 = r2 >> r21
            r6 = 5
            r7 = r26[r6]
            long r7 = (long) r7
            long r7 = r7 & r4
            long r7 = r7 + r14
            long r2 = r2 + r7
            int r7 = (int) r2
            r0[r6] = r7
            long r2 = r2 >> r21
            long r7 = r24 + r2
            r10 = r23
            long r10 = (long) r10
            long r10 = r10 & r4
            long r2 = r2 + r10
            int r10 = (int) r2
            r0[r16] = r10
            long r2 = r2 >> r21
            int r10 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r10 == 0) goto L_0x009e
            long r10 = (long) r1
            long r4 = r4 & r10
            long r2 = r2 + r4
            int r1 = (int) r2
            r0[r22] = r1
            long r1 = r2 >> r21
            long r7 = r7 + r1
        L_0x009e:
            int r1 = (int) r7
            r2 = 2
            r0[r2] = r1
            long r1 = r7 >> r21
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x00bb
            r1 = 6
        L_0x00a9:
            if (r9 >= r1) goto L_0x00b7
            r2 = r0[r9]
            int r2 = r2 + 1
            r0[r9] = r2
            if (r2 == 0) goto L_0x00b4
            goto L_0x00b9
        L_0x00b4:
            int r9 = r9 + 1
            goto L_0x00a9
        L_0x00b7:
            r16 = r22
        L_0x00b9:
            if (r16 != 0) goto L_0x00c8
        L_0x00bb:
            r1 = r0[r6]
            r2 = -1
            if (r1 != r2) goto L_0x00cb
            int[] r1 = getInstance
            boolean r1 = com.cardinalcommerce.a.RuntimeErrorEvent.init(r0, r1)
            if (r1 == 0) goto L_0x00cb
        L_0x00c8:
            cca_continue(r27)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.writeJSON.getInstance(int[], int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r0 == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(int r13, int[] r14) {
        /*
            r0 = 0
            r1 = 1
            r2 = 0
            if (r13 == 0) goto L_0x0033
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
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x0026
            r10 = r14[r1]
            long r10 = (long) r10
            long r10 = r10 & r6
            long r8 = r8 + r10
            int r10 = (int) r8
            r14[r1] = r10
            long r8 = r8 >> r13
        L_0x0026:
            r10 = 2
            r11 = r14[r10]
            long r11 = (long) r11
            long r6 = r6 & r11
            long r6 = r6 + r4
            long r8 = r8 + r6
            int r4 = (int) r8
            r14[r10] = r4
            long r4 = r8 >> r13
            goto L_0x0034
        L_0x0033:
            r4 = r2
        L_0x0034:
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x004a
            r13 = 3
        L_0x0039:
            r2 = 6
            if (r13 >= r2) goto L_0x0047
            r2 = r14[r13]
            int r2 = r2 + r1
            r14[r13] = r2
            if (r2 == 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            int r13 = r13 + 1
            goto L_0x0039
        L_0x0047:
            r0 = r1
        L_0x0048:
            if (r0 != 0) goto L_0x0058
        L_0x004a:
            r13 = 5
            r13 = r14[r13]
            r0 = -1
            if (r13 != r0) goto L_0x005b
            int[] r13 = getInstance
            boolean r13 = com.cardinalcommerce.a.RuntimeErrorEvent.init(r14, r13)
            if (r13 == 0) goto L_0x005b
        L_0x0058:
            cca_continue(r14)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.writeJSON.init(int, int[]):void");
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        RuntimeErrorEvent.configure(iArr, iArr3);
        getInstance(iArr3, iArr2);
    }

    public static void getInstance(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        RuntimeErrorEvent.configure(iArr, iArr3);
        while (true) {
            getInstance(iArr3, iArr2);
            i--;
            if (i > 0) {
                RuntimeErrorEvent.configure(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3) {
        if (RuntimeErrorEvent.getWarnings(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = j2 + ((4294967295L & ((long) iArr3[2])) - 1);
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                int i = 3;
                while (i < 6) {
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

    private static void cca_continue(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (4294967295L & ((long) iArr[2])) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            int i = 3;
            while (i < 6) {
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
