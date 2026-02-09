package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class asDouble extends merge.init {
    private static BigInteger Cardinal = add.getSDKVersion;
    private static final int[] cca_continue = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    protected int[] getInstance;

    public asDouble(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Cardinal) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.getInstance = asDoubleObj.init(bigInteger);
    }

    protected asDouble(int[] iArr) {
        this.getInstance = iArr;
    }

    public final int Cardinal() {
        return Cardinal.bitLength();
    }

    public final BigInteger cca_continue() {
        return setErrorCode.configure(this.getInstance);
    }

    public final boolean cleanup() {
        return setErrorCode.init(this.getInstance);
    }

    public final int hashCode() {
        return Cardinal.hashCode() ^ getBackgroundColor.cca_continue(this.getInstance, 8);
    }

    public asDouble() {
        this.getInstance = new int[8];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.getInstance;
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean values() {
        return (this.getInstance[0] & 1) == 1;
    }

    public final merge cca_continue(merge merge) {
        int[] iArr = new int[8];
        asDoubleObj.configure(this.getInstance, ((asDouble) merge).getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[8];
        asDoubleObj.cca_continue(this.getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[8];
        asDoubleObj.Cardinal(this.getInstance, ((asDouble) merge).getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[8];
        asDoubleObj.cca_continue(this.getInstance, ((asDouble) merge).getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[8];
        X509CertUtils.init(asDoubleObj.cca_continue, ((asDouble) merge).getInstance, iArr);
        asDoubleObj.cca_continue(iArr, this.getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge init() {
        int[] iArr = new int[8];
        asDoubleObj.init(this.getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[8];
        asDoubleObj.getInstance(this.getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[8];
        X509CertUtils.init(asDoubleObj.cca_continue, this.getInstance, iArr);
        return new asDouble(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        boolean z2;
        int[] iArr = this.getInstance;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= 8) {
                z = true;
                break;
            } else if (iArr[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z || setErrorCode.init(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        asDoubleObj.getInstance(iArr, iArr2);
        asDoubleObj.cca_continue(iArr2, iArr, iArr2);
        asDoubleObj.getInstance(iArr2, iArr2);
        asDoubleObj.cca_continue(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        asDoubleObj.getInstance(iArr2, iArr3);
        asDoubleObj.cca_continue(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        asDoubleObj.cca_continue(iArr3, 3, iArr4);
        asDoubleObj.cca_continue(iArr4, iArr2, iArr4);
        asDoubleObj.cca_continue(iArr4, 4, iArr2);
        asDoubleObj.cca_continue(iArr2, iArr3, iArr2);
        asDoubleObj.cca_continue(iArr2, 4, iArr4);
        asDoubleObj.cca_continue(iArr4, iArr3, iArr4);
        asDoubleObj.cca_continue(iArr4, 15, iArr3);
        asDoubleObj.cca_continue(iArr3, iArr4, iArr3);
        asDoubleObj.cca_continue(iArr3, 30, iArr4);
        asDoubleObj.cca_continue(iArr4, iArr3, iArr4);
        asDoubleObj.cca_continue(iArr4, 60, iArr3);
        asDoubleObj.cca_continue(iArr3, iArr4, iArr3);
        asDoubleObj.cca_continue(iArr3, 11, iArr4);
        asDoubleObj.cca_continue(iArr4, iArr2, iArr4);
        asDoubleObj.cca_continue(iArr4, 120, iArr2);
        asDoubleObj.cca_continue(iArr2, iArr3, iArr2);
        asDoubleObj.getInstance(iArr2, iArr2);
        asDoubleObj.getInstance(iArr2, iArr3);
        int i2 = 7;
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                z2 = true;
                break;
            } else if (iArr[i3] != iArr3[i3]) {
                z2 = false;
                break;
            } else {
                i3--;
            }
        }
        if (z2) {
            return new asDouble(iArr2);
        }
        asDoubleObj.cca_continue(iArr2, cca_continue, iArr2);
        asDoubleObj.getInstance(iArr2, iArr3);
        while (true) {
            if (i2 < 0) {
                z3 = true;
                break;
            } else if (iArr[i2] != iArr3[i2]) {
                break;
            } else {
                i2--;
            }
        }
        if (z3) {
            return new asDouble(iArr2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof asDouble)) {
            return false;
        }
        int[] iArr = this.getInstance;
        int[] iArr2 = ((asDouble) obj).getInstance;
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
