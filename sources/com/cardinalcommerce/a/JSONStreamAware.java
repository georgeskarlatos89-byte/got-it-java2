package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class JSONStreamAware {
    private static final int[] configure = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};
    static final int[] getInstance = {-6803, -2, -1, -1, -1, -1, -1};
    private static int[] init = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    public static void Cardinal(int[] iArr, int[] iArr2) {
        if (getErrorMessage.cca_continue(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && getSDKTransactionID.Cardinal(iArr2, getInstance))) {
            getErrorMessage.getInstance(7, 6803, iArr2);
        }
    }

    public static void Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
        if (getSDKTransactionID.init(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && getSDKTransactionID.Cardinal(iArr3, getInstance))) {
            getErrorMessage.getInstance(7, 6803, iArr3);
        }
    }

    public static void cca_continue(int[] iArr, int[] iArr2) {
        if (getSDKTransactionID.configure(getSDKTransactionID.cca_continue(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[6] == -1 && getSDKTransactionID.Cardinal(iArr2, getInstance))) {
            getErrorMessage.getInstance(7, 6803, iArr2);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        if (getErrorMessage.configure(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && getSDKTransactionID.Cardinal(iArr2, getInstance))) {
            getErrorMessage.getInstance(7, 6803, iArr2);
        }
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        if (getSDKTransactionID.getSDKVersion(iArr, iArr2, iArr3) != 0) {
            getErrorMessage.Cardinal(7, 6803, iArr3);
        }
    }

    public static int[] init(BigInteger bigInteger) {
        int[] instance = getSDKTransactionID.getInstance(bigInteger);
        if (instance[6] == -1 && getSDKTransactionID.Cardinal(instance, getInstance)) {
            getErrorMessage.getInstance(7, 6803, instance);
        }
        return instance;
    }

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        getSDKTransactionID.getInstance(iArr, iArr2, iArr4);
        cca_continue(iArr4, iArr3);
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        if (getSDKTransactionID.Cardinal(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && getErrorMessage.init(14, iArr3, init))) {
            int[] iArr4 = configure;
            if (getErrorMessage.Cardinal(iArr4.length, iArr4, iArr3) != 0) {
                int length = iArr4.length;
                while (length < 14) {
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

    public static void configure(int[] iArr, int[] iArr2) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 7) {
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
            iArr2[6] = 0;
            return;
        }
        getSDKTransactionID.getSDKVersion(getInstance, iArr, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r13 == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getInstance(int r13, int[] r14) {
        /*
            r0 = 7
            if (r13 == 0) goto L_0x004a
            long r1 = (long) r13
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 6803(0x1a93, double:3.361E-320)
            long r5 = r5 * r1
            r13 = 0
            r7 = r14[r13]
            long r7 = (long) r7
            long r7 = r7 & r3
            long r5 = r5 + r7
            r7 = 0
            long r5 = r5 + r7
            int r9 = (int) r5
            r14[r13] = r9
            r9 = 32
            long r5 = r5 >>> r9
            r10 = 1
            r11 = r14[r10]
            long r11 = (long) r11
            long r11 = r11 & r3
            long r1 = r1 + r11
            long r5 = r5 + r1
            int r1 = (int) r5
            r14[r10] = r1
            long r1 = r5 >>> r9
            r5 = 2
            r6 = r14[r5]
            long r11 = (long) r6
            long r3 = r3 & r11
            long r1 = r1 + r3
            int r3 = (int) r1
            r14[r5] = r3
            long r1 = r1 >>> r9
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0037
            goto L_0x0048
        L_0x0037:
            r1 = 3
        L_0x0038:
            if (r1 >= r0) goto L_0x0047
            int r2 = r1 + 0
            r3 = r14[r2]
            int r3 = r3 + r10
            r14[r2] = r3
            if (r3 == 0) goto L_0x0044
            goto L_0x0048
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x0038
        L_0x0047:
            r13 = r10
        L_0x0048:
            if (r13 != 0) goto L_0x0058
        L_0x004a:
            r13 = 6
            r13 = r14[r13]
            r1 = -1
            if (r13 != r1) goto L_0x005d
            int[] r13 = getInstance
            boolean r13 = com.cardinalcommerce.a.getSDKTransactionID.Cardinal(r14, r13)
            if (r13 == 0) goto L_0x005d
        L_0x0058:
            r13 = 6803(0x1a93, float:9.533E-42)
            com.cardinalcommerce.a.getErrorMessage.getInstance((int) r0, (int) r13, (int[]) r14)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.JSONStreamAware.getInstance(int, int[]):void");
    }

    public static void init(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        getSDKTransactionID.cca_continue(iArr, iArr3);
        cca_continue(iArr3, iArr2);
    }

    public static void cca_continue(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        getSDKTransactionID.cca_continue(iArr, iArr3);
        while (true) {
            cca_continue(iArr3, iArr2);
            i--;
            if (i > 0) {
                getSDKTransactionID.cca_continue(iArr2, iArr3);
            } else {
                return;
            }
        }
    }
}
