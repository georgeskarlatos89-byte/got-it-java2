package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class convertToX extends merge.init {
    private static BigInteger configure = objectEndOfKey.getWarnings;
    protected int[] cca_continue;

    public convertToX(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(configure) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.cca_continue = JSONUtil.getInstance(bigInteger);
    }

    protected convertToX(int[] iArr) {
        this.cca_continue = iArr;
    }

    public final int Cardinal() {
        return configure.bitLength();
    }

    public final BigInteger cca_continue() {
        return getErrorMessage.Cardinal(17, this.cca_continue);
    }

    public final int hashCode() {
        return configure.hashCode() ^ getBackgroundColor.cca_continue(this.cca_continue, 17);
    }

    public convertToX() {
        this.cca_continue = new int[17];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.cca_continue;
        for (int i = 0; i < 17; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean cleanup() {
        int[] iArr = this.cca_continue;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 17; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean values() {
        return (this.cca_continue[0] & 1) == 1;
    }

    public final merge cca_continue(merge merge) {
        int[] iArr = new int[17];
        JSONUtil.cca_continue(this.cca_continue, ((convertToX) merge).cca_continue, iArr);
        return new convertToX(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[17];
        JSONUtil.Cardinal(this.cca_continue, iArr);
        return new convertToX(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[17];
        JSONUtil.configure(this.cca_continue, ((convertToX) merge).cca_continue, iArr);
        return new convertToX(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[17];
        JSONUtil.getInstance(this.cca_continue, ((convertToX) merge).cca_continue, iArr);
        return new convertToX(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[17];
        X509CertUtils.init(JSONUtil.cca_continue, ((convertToX) merge).cca_continue, iArr);
        JSONUtil.getInstance(iArr, this.cca_continue, iArr);
        return new convertToX(iArr);
    }

    public final merge init() {
        int[] iArr = new int[17];
        JSONUtil.configure(this.cca_continue, iArr);
        return new convertToX(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[17];
        JSONUtil.init(this.cca_continue, iArr);
        return new convertToX(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[17];
        X509CertUtils.init(JSONUtil.cca_continue, this.cca_continue, iArr);
        return new convertToX(iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.cardinalcommerce.a.merge getWarnings() {
        /*
            r8 = this;
            int[] r0 = r8.cca_continue
            r1 = 0
            r2 = r1
        L_0x0004:
            r3 = 17
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
            if (r2 != 0) goto L_0x004f
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
            if (r2 == 0) goto L_0x002a
            goto L_0x004f
        L_0x002a:
            int[] r2 = new int[r3]
            int[] r3 = new int[r3]
            r5 = 519(0x207, float:7.27E-43)
            com.cardinalcommerce.a.JSONUtil.init(r0, r5, r2)
            com.cardinalcommerce.a.JSONUtil.init(r2, r3)
            r5 = 16
        L_0x0038:
            if (r5 < 0) goto L_0x0044
            r6 = r0[r5]
            r7 = r3[r5]
            if (r6 == r7) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            int r5 = r5 + -1
            goto L_0x0038
        L_0x0044:
            r1 = r4
        L_0x0045:
            if (r1 == 0) goto L_0x004d
            com.cardinalcommerce.a.convertToX r0 = new com.cardinalcommerce.a.convertToX
            r0.<init>((int[]) r2)
            return r0
        L_0x004d:
            r0 = 0
            return r0
        L_0x004f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.convertToX.getWarnings():com.cardinalcommerce.a.merge");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof convertToX)) {
            return false;
        }
        int[] iArr = this.cca_continue;
        int[] iArr2 = ((convertToX) obj).cca_continue;
        for (int i = 16; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
