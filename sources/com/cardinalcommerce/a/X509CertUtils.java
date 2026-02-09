package com.cardinalcommerce.a;

public abstract class X509CertUtils {
    /* JADX WARNING: Removed duplicated region for block: B:88:0x009b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void init(int[] r11, int[] r12, int[] r13) {
        /*
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L_0x0003:
            r3 = 1
            if (r2 >= r0) goto L_0x000f
            r4 = r12[r2]
            if (r4 == 0) goto L_0x000c
            r2 = r1
            goto L_0x0010
        L_0x000c:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x000f:
            r2 = r3
        L_0x0010:
            if (r2 != 0) goto L_0x00d4
            r2 = r12[r1]
            if (r2 == r3) goto L_0x0018
        L_0x0016:
            r2 = r1
            goto L_0x0024
        L_0x0018:
            r2 = r3
        L_0x0019:
            if (r2 >= r0) goto L_0x0023
            r4 = r12[r2]
            if (r4 == 0) goto L_0x0020
            goto L_0x0016
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0023:
            r2 = r3
        L_0x0024:
            if (r2 == 0) goto L_0x002a
            java.lang.System.arraycopy(r12, r1, r13, r1, r0)
            return
        L_0x002a:
            int[] r2 = new int[r0]
            java.lang.System.arraycopy(r12, r1, r2, r1, r0)
            int[] r12 = new int[r0]
            r12[r1] = r3
            r4 = r2[r1]
            r4 = r4 & r3
            if (r4 != 0) goto L_0x003d
            int r4 = getInstance(r11, r2, r0, r12, r1)
            goto L_0x003e
        L_0x003d:
            r4 = r1
        L_0x003e:
            r5 = r2[r1]
            if (r5 == r3) goto L_0x0044
        L_0x0042:
            r5 = r1
            goto L_0x0050
        L_0x0044:
            r5 = r3
        L_0x0045:
            if (r5 >= r0) goto L_0x004f
            r6 = r2[r5]
            if (r6 == 0) goto L_0x004c
            goto L_0x0042
        L_0x004c:
            int r5 = r5 + 1
            goto L_0x0045
        L_0x004f:
            r5 = r3
        L_0x0050:
            if (r5 == 0) goto L_0x005e
            if (r4 >= 0) goto L_0x0059
            int r0 = r11.length
            com.cardinalcommerce.a.getErrorMessage.configure((int) r0, (int[]) r12, (int[]) r11, (int[]) r13)
            return
        L_0x0059:
            int r11 = r11.length
            java.lang.System.arraycopy(r12, r1, r13, r1, r11)
            return
        L_0x005e:
            int[] r5 = new int[r0]
            java.lang.System.arraycopy(r11, r1, r5, r1, r0)
            int[] r6 = new int[r0]
            r7 = r0
            r8 = r1
        L_0x0067:
            int r9 = r7 + -1
            r10 = r2[r9]
            if (r10 != 0) goto L_0x0074
            r9 = r5[r9]
            if (r9 != 0) goto L_0x0074
            int r7 = r7 + -1
            goto L_0x0067
        L_0x0074:
            boolean r9 = com.cardinalcommerce.a.getErrorMessage.init((int) r7, (int[]) r2, (int[]) r5)
            if (r9 == 0) goto L_0x00a7
            com.cardinalcommerce.a.getErrorMessage.cca_continue((int) r7, (int[]) r5, (int[]) r2)
            int r9 = com.cardinalcommerce.a.getErrorMessage.cca_continue((int) r0, (int[]) r6, (int[]) r12)
            int r9 = r9 - r8
            int r4 = r4 + r9
            int r4 = getInstance(r11, r2, r7, r12, r4)
            r9 = r2[r1]
            if (r9 == r3) goto L_0x008d
        L_0x008b:
            r9 = r1
            goto L_0x0099
        L_0x008d:
            r9 = r3
        L_0x008e:
            if (r9 >= r7) goto L_0x0098
            r10 = r2[r9]
            if (r10 == 0) goto L_0x0095
            goto L_0x008b
        L_0x0095:
            int r9 = r9 + 1
            goto L_0x008e
        L_0x0098:
            r9 = r3
        L_0x0099:
            if (r9 == 0) goto L_0x0067
            if (r4 >= 0) goto L_0x00a2
            int r0 = r11.length
            com.cardinalcommerce.a.getErrorMessage.configure((int) r0, (int[]) r12, (int[]) r11, (int[]) r13)
            return
        L_0x00a2:
            int r11 = r11.length
            java.lang.System.arraycopy(r12, r1, r13, r1, r11)
            return
        L_0x00a7:
            com.cardinalcommerce.a.getErrorMessage.cca_continue((int) r7, (int[]) r2, (int[]) r5)
            int r9 = com.cardinalcommerce.a.getErrorMessage.cca_continue((int) r0, (int[]) r12, (int[]) r6)
            int r9 = r9 - r4
            int r8 = r8 + r9
            int r8 = getInstance(r11, r5, r7, r6, r8)
            r9 = r5[r1]
            if (r9 == r3) goto L_0x00ba
        L_0x00b8:
            r9 = r1
            goto L_0x00c6
        L_0x00ba:
            r9 = r3
        L_0x00bb:
            if (r9 >= r7) goto L_0x00c5
            r10 = r5[r9]
            if (r10 == 0) goto L_0x00c2
            goto L_0x00b8
        L_0x00c2:
            int r9 = r9 + 1
            goto L_0x00bb
        L_0x00c5:
            r9 = r3
        L_0x00c6:
            if (r9 == 0) goto L_0x0067
            if (r8 >= 0) goto L_0x00cf
            int r12 = r11.length
            com.cardinalcommerce.a.getErrorMessage.configure((int) r12, (int[]) r6, (int[]) r11, (int[]) r13)
            return
        L_0x00cf:
            int r11 = r11.length
            java.lang.System.arraycopy(r6, r1, r13, r1, r11)
            return
        L_0x00d4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "'x' cannot be 0"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.X509CertUtils.init(int[], int[], int[]):void");
    }

    private static int getInstance(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int i3;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            int i5 = i;
            int i6 = 0;
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                int i7 = iArr2[i5];
                iArr2[i5] = i6;
                i6 = i7;
            }
            i4 += 32;
        }
        int i8 = 0;
        while ((i3 & 1) == 0) {
            i3 >>>= 1;
            i8++;
        }
        if (i8 > 0) {
            getErrorMessage.configure(i, iArr2, i8, 0);
            i4 += i8;
        }
        for (int i9 = 0; i9 < i4; i9++) {
            if ((iArr3[0] & 1) != 0) {
                i2 += i2 < 0 ? getErrorMessage.Cardinal(length, iArr, iArr3) : getErrorMessage.cca_continue(length, iArr, iArr3);
            }
            getErrorMessage.init(length, iArr3, i2);
        }
        return i2;
    }
}
