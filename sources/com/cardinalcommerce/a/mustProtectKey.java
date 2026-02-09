package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class mustProtectKey {
    private static final int[] cca_continue = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};
    private static int[] getInstance = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    static final int[] init = {-977, -2, -1, -1, -1, -1, -1, -1};

    public static void Cardinal(int[] iArr, int[] iArr2) {
        if (getErrorMessage.cca_continue(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && setErrorCode.cca_continue(iArr2, init))) {
            getErrorMessage.getInstance(8, 977, iArr2);
        }
    }

    public static void configure(int[] iArr, int[] iArr2) {
        if (setErrorCode.getInstance(setErrorCode.onCReqSuccess(iArr, iArr, iArr2), iArr2) != 0 || (iArr2[7] == -1 && setErrorCode.cca_continue(iArr2, init))) {
            getErrorMessage.getInstance(8, 977, iArr2);
        }
    }

    public static void configure(int[] iArr, int[] iArr2, int[] iArr3) {
        if (setErrorCode.getSDKVersion(iArr, iArr2, iArr3) != 0) {
            getErrorMessage.Cardinal(8, 977, iArr3);
        }
    }

    public static void getInstance(int[] iArr, int[] iArr2) {
        if (getErrorMessage.configure(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && setErrorCode.cca_continue(iArr2, init))) {
            getErrorMessage.getInstance(8, 977, iArr2);
        }
    }

    public static void init(int[] iArr, int[] iArr2, int[] iArr3) {
        if (setErrorCode.getInstance(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && setErrorCode.cca_continue(iArr3, init))) {
            getErrorMessage.getInstance(8, 977, iArr3);
        }
    }

    public static int[] init(BigInteger bigInteger) {
        int[] Cardinal = setErrorCode.Cardinal(bigInteger);
        if (Cardinal[7] == -1) {
            int[] iArr = init;
            if (setErrorCode.cca_continue(Cardinal, iArr)) {
                setErrorCode.cleanup(iArr, Cardinal);
            }
        }
        return Cardinal;
    }

    public static void getInstance(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        setErrorCode.init(iArr, iArr2, iArr4);
        configure(iArr4, iArr3);
    }

    public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
        if (setErrorCode.configure(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && getErrorMessage.init(16, iArr3, getInstance))) {
            int[] iArr4 = cca_continue;
            if (getErrorMessage.Cardinal(iArr4.length, iArr4, iArr3) != 0) {
                int length = iArr4.length;
                while (length < 16) {
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

    public static void cca_continue(int[] iArr, int[] iArr2) {
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
            setErrorCode.getSDKVersion(init, iArr, iArr2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        if (r13 == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void cca_continue(int r13, int[] r14) {
        /*
            r0 = 8
            if (r13 == 0) goto L_0x004b
            long r1 = (long) r13
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 977(0x3d1, double:4.827E-321)
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
            if (r1 != 0) goto L_0x0038
            goto L_0x0049
        L_0x0038:
            r1 = 3
        L_0x0039:
            if (r1 >= r0) goto L_0x0048
            int r2 = r1 + 0
            r3 = r14[r2]
            int r3 = r3 + r10
            r14[r2] = r3
            if (r3 == 0) goto L_0x0045
            goto L_0x0049
        L_0x0045:
            int r1 = r1 + 1
            goto L_0x0039
        L_0x0048:
            r13 = r10
        L_0x0049:
            if (r13 != 0) goto L_0x0059
        L_0x004b:
            r13 = 7
            r13 = r14[r13]
            r1 = -1
            if (r13 != r1) goto L_0x005e
            int[] r13 = init
            boolean r13 = com.cardinalcommerce.a.setErrorCode.cca_continue(r14, r13)
            if (r13 == 0) goto L_0x005e
        L_0x0059:
            r13 = 977(0x3d1, float:1.369E-42)
            com.cardinalcommerce.a.getErrorMessage.getInstance((int) r0, (int) r13, (int[]) r14)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.mustProtectKey.cca_continue(int, int[]):void");
    }

    public static void init(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        setErrorCode.getInstance(iArr, iArr3);
        configure(iArr3, iArr2);
    }

    public static void Cardinal(int[] iArr, int i, int[] iArr2) {
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
}
