package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;

public final class SDKRuntimeException {
    public int[] cca_continue;
    public DirectoryServerID getInstance;
    public int init;

    public SDKRuntimeException(DirectoryServerID directoryServerID, int i) {
        this.getInstance = directoryServerID;
        this.init = i;
        int[] iArr = new int[(i + 1)];
        this.cca_continue = iArr;
        iArr[i] = 1;
    }

    public final SDKRuntimeException cca_continue(int i) {
        if (this.getInstance.Cardinal(i)) {
            return new SDKRuntimeException(this.getInstance, cca_continue(this.cca_continue, i));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    /* access modifiers changed from: package-private */
    public final void configure() {
        int length = this.cca_continue.length;
        do {
            this.init = length - 1;
            length = this.init;
            if (length < 0 || this.cca_continue[length] != 0) {
            }
            this.init = length - 1;
            length = this.init;
            return;
        } while (this.cca_continue[length] != 0);
    }

    public final int hashCode() {
        int hashCode = this.getInstance.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.cca_continue;
            if (i >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i];
            i++;
        }
    }

    public final void init(int i) {
        if (this.getInstance.Cardinal(i)) {
            this.cca_continue = cca_continue(this.cca_continue, i);
            configure();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public SDKRuntimeException(DirectoryServerID directoryServerID, int[] iArr) {
        int[] iArr2;
        this.getInstance = directoryServerID;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1) {
            iArr2 = new int[1];
        } else {
            int i = length + 1;
            if (iArr.length == i) {
                iArr2 = new int[iArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                int[] iArr3 = new int[i];
                System.arraycopy(iArr, 0, iArr3, 0, i);
                iArr2 = iArr3;
            }
        }
        this.cca_continue = iArr2;
        configure();
    }

    public SDKRuntimeException(DirectoryServerID directoryServerID, byte[] bArr) {
        this.getInstance = directoryServerID;
        int i = 8;
        int i2 = 1;
        while (directoryServerID.Cardinal > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 == 0) {
            this.cca_continue = new int[(bArr.length / i2)];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.cca_continue;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.cca_continue;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (this.getInstance.Cardinal(this.cca_continue[i3])) {
                        i3++;
                    } else {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                } else if (iArr.length == 1 || iArr[iArr.length - 1] != 0) {
                    configure();
                    return;
                } else {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public SDKRuntimeException(SDKRuntimeException sDKRuntimeException) {
        this.getInstance = sDKRuntimeException.getInstance;
        this.init = sDKRuntimeException.init;
        int[] iArr = sDKRuntimeException.cca_continue;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.cca_continue = iArr2;
    }

    static int init(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1) {
            return 0;
        }
        return iArr[length];
    }

    public final byte[] Cardinal() {
        int i = 8;
        int i2 = 1;
        while (this.getInstance.Cardinal > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[(this.cca_continue.length * i2)];
        int i3 = 0;
        for (int i4 = 0; i4 < this.cca_continue.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.cca_continue[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public final int[] init(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = iArr3[length] ^ iArr[length];
        }
        return iArr3;
    }

    /* access modifiers changed from: package-private */
    public final int[] cca_continue(int[] iArr, int i) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        int[] iArr3 = new int[(length + 1)];
        while (length >= 0) {
            iArr3[length] = KeyAgreementSpi.MQVwithSHA1KDF.getInstance(iArr[length], i, this.getInstance.getInstance);
            length--;
        }
        return iArr3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x004a
            boolean r1 = r8 instanceof com.cardinalcommerce.a.SDKRuntimeException
            if (r1 != 0) goto L_0x0008
            goto L_0x004a
        L_0x0008:
            com.cardinalcommerce.a.SDKRuntimeException r8 = (com.cardinalcommerce.a.SDKRuntimeException) r8
            com.cardinalcommerce.a.DirectoryServerID r1 = r7.getInstance
            com.cardinalcommerce.a.DirectoryServerID r2 = r8.getInstance
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004a
            int r1 = r7.init
            int r2 = r8.init
            if (r1 != r2) goto L_0x004a
            int[] r1 = r7.cca_continue
            int[] r8 = r8.cca_continue
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
        L_0x0021:
            if (r2 < 0) goto L_0x002a
            r4 = r1[r2]
            if (r4 != 0) goto L_0x002a
            int r2 = r2 + -1
            goto L_0x0021
        L_0x002a:
            int r4 = r8.length
            int r4 = r4 - r3
        L_0x002c:
            if (r4 < 0) goto L_0x0035
            r5 = r8[r4]
            if (r5 != 0) goto L_0x0035
            int r4 = r4 + -1
            goto L_0x002c
        L_0x0035:
            if (r2 == r4) goto L_0x0039
        L_0x0037:
            r8 = r0
            goto L_0x0047
        L_0x0039:
            r4 = r0
        L_0x003a:
            if (r4 > r2) goto L_0x0046
            r5 = r1[r4]
            r6 = r8[r4]
            if (r5 == r6) goto L_0x0043
            goto L_0x0037
        L_0x0043:
            int r4 = r4 + 1
            goto L_0x003a
        L_0x0046:
            r8 = r3
        L_0x0047:
            if (r8 == 0) goto L_0x004a
            return r3
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.SDKRuntimeException.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        String obj = new StringBuilder(" Polynomial over ").append(this.getInstance.toString()).append(": \n").toString();
        for (int i = 0; i < this.cca_continue.length; i++) {
            StringBuilder append = new StringBuilder().append(obj);
            DirectoryServerID directoryServerID = this.getInstance;
            int i2 = this.cca_continue[i];
            String str = "";
            for (int i3 = 0; i3 < directoryServerID.Cardinal; i3++) {
                str = ((((byte) i2) & 1) == 0 ? "0" : "1").concat(String.valueOf(str));
                i2 >>>= 1;
            }
            obj = append.append(str).append("Y^").append(i).append("+").toString();
        }
        return new StringBuilder().append(obj).append(";").toString();
    }
}
