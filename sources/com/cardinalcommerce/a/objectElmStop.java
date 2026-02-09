package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class objectElmStop extends merge.init {
    private static BigInteger init = arrayStart.getSDKVersion;
    protected int[] configure;

    public objectElmStop(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(init) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.configure = arrayfirstObject.cca_continue(bigInteger);
    }

    protected objectElmStop(int[] iArr) {
        this.configure = iArr;
    }

    public final int Cardinal() {
        return init.bitLength();
    }

    public final BigInteger cca_continue() {
        return getErrorMessage.Cardinal(12, this.configure);
    }

    public final int hashCode() {
        return init.hashCode() ^ getBackgroundColor.cca_continue(this.configure, 12);
    }

    public objectElmStop() {
        this.configure = new int[12];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.configure;
        for (int i = 0; i < 12; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean cleanup() {
        int[] iArr = this.configure;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 12; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean values() {
        return (this.configure[0] & 1) == 1;
    }

    public final merge cca_continue(merge merge) {
        int[] iArr = new int[12];
        arrayfirstObject.init(this.configure, ((objectElmStop) merge).configure, iArr);
        return new objectElmStop(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[12];
        arrayfirstObject.Cardinal(this.configure, iArr);
        return new objectElmStop(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[12];
        arrayfirstObject.configure(this.configure, ((objectElmStop) merge).configure, iArr);
        return new objectElmStop(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[12];
        arrayfirstObject.cca_continue(this.configure, ((objectElmStop) merge).configure, iArr);
        return new objectElmStop(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[12];
        X509CertUtils.init(arrayfirstObject.configure, ((objectElmStop) merge).configure, iArr);
        arrayfirstObject.cca_continue(iArr, this.configure, iArr);
        return new objectElmStop(iArr);
    }

    public final merge init() {
        int[] iArr = new int[12];
        arrayfirstObject.cca_continue(this.configure, iArr);
        return new objectElmStop(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[12];
        arrayfirstObject.init(this.configure, iArr);
        return new objectElmStop(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[12];
        X509CertUtils.init(arrayfirstObject.configure, this.configure, iArr);
        return new objectElmStop(iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cardinalcommerce.a.merge getWarnings() {
        /*
            r9 = this;
            int[] r0 = r9.configure
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 12
            r4 = 1
            if (r2 >= r3) goto L_0x0012
            r5 = r0[r2]
            if (r5 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0013
        L_0x000f:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0012:
            r2 = r4
        L_0x0013:
            if (r2 != 0) goto L_0x00b0
            r2 = r0[r1]
            if (r2 == r4) goto L_0x001b
        L_0x0019:
            r2 = r1
            goto L_0x0027
        L_0x001b:
            r2 = r4
        L_0x001c:
            if (r2 >= r3) goto L_0x0026
            r5 = r0[r2]
            if (r5 == 0) goto L_0x0023
            goto L_0x0019
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0026:
            r2 = r4
        L_0x0027:
            if (r2 == 0) goto L_0x002b
            goto L_0x00b0
        L_0x002b:
            int[] r2 = new int[r3]
            int[] r5 = new int[r3]
            int[] r6 = new int[r3]
            int[] r3 = new int[r3]
            com.cardinalcommerce.a.arrayfirstObject.init(r0, r2)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r2, r0, r2)
            r7 = 2
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r2, (int) r7, (int[]) r5)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r2, r5)
            com.cardinalcommerce.a.arrayfirstObject.init(r5, r5)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r0, r5)
            r8 = 5
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r5, (int) r8, (int[]) r6)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r6, r5, r6)
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r6, (int) r8, (int[]) r3)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r3, r5, r3)
            r8 = 15
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r3, (int) r8, (int[]) r5)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r3, r5)
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r5, (int) r7, (int[]) r6)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r2, r6, r2)
            r7 = 28
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r6, (int) r7, (int[]) r6)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r6, r5)
            r7 = 60
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r5, (int) r7, (int[]) r6)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r6, r5, r6)
            r7 = 120(0x78, float:1.68E-43)
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r6, (int) r7, (int[]) r5)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r6, r5)
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r5, (int) r8, (int[]) r5)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r3, r5)
            r3 = 33
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r5, (int) r3, (int[]) r5)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r2, r5)
            r3 = 64
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r5, (int) r3, (int[]) r5)
            com.cardinalcommerce.a.arrayfirstObject.cca_continue(r5, r0, r5)
            r3 = 30
            com.cardinalcommerce.a.arrayfirstObject.configure((int[]) r5, (int) r3, (int[]) r2)
            com.cardinalcommerce.a.arrayfirstObject.init(r2, r5)
            r3 = 11
        L_0x0099:
            if (r3 < 0) goto L_0x00a5
            r6 = r0[r3]
            r7 = r5[r3]
            if (r6 == r7) goto L_0x00a2
            goto L_0x00a6
        L_0x00a2:
            int r3 = r3 + -1
            goto L_0x0099
        L_0x00a5:
            r1 = r4
        L_0x00a6:
            if (r1 == 0) goto L_0x00ae
            com.cardinalcommerce.a.objectElmStop r0 = new com.cardinalcommerce.a.objectElmStop
            r0.<init>((int[]) r2)
            return r0
        L_0x00ae:
            r0 = 0
            return r0
        L_0x00b0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.objectElmStop.getWarnings():com.cardinalcommerce.a.merge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof objectElmStop)) {
            return false;
        }
        int[] iArr = this.configure;
        int[] iArr2 = ((objectElmStop) obj).configure;
        for (int i = 11; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
