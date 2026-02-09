package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class asLongObj extends merge.init {
    private static BigInteger Cardinal = asFloat.getWarnings;
    protected int[] cca_continue;

    public asLongObj(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Cardinal) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.cca_continue = asFloatObj.init(bigInteger);
    }

    protected asLongObj(int[] iArr) {
        this.cca_continue = iArr;
    }

    public final int Cardinal() {
        return Cardinal.bitLength();
    }

    public final BigInteger cca_continue() {
        return setErrorCode.configure(this.cca_continue);
    }

    public final boolean cleanup() {
        return setErrorCode.init(this.cca_continue);
    }

    public final int hashCode() {
        return Cardinal.hashCode() ^ getBackgroundColor.cca_continue(this.cca_continue, 8);
    }

    public asLongObj() {
        this.cca_continue = new int[8];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.cca_continue;
        for (int i = 0; i < 8; i++) {
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
        int[] iArr = new int[8];
        asFloatObj.configure(this.cca_continue, ((asLongObj) merge).cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[8];
        asFloatObj.cca_continue(this.cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[8];
        asFloatObj.cca_continue(this.cca_continue, ((asLongObj) merge).cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[8];
        asFloatObj.init(this.cca_continue, ((asLongObj) merge).cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[8];
        X509CertUtils.init(asFloatObj.Cardinal, ((asLongObj) merge).cca_continue, iArr);
        asFloatObj.init(iArr, this.cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge init() {
        int[] iArr = new int[8];
        asFloatObj.configure(this.cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[8];
        asFloatObj.init(this.cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[8];
        X509CertUtils.init(asFloatObj.Cardinal, this.cca_continue, iArr);
        return new asLongObj(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        int[] iArr = this.cca_continue;
        boolean z2 = false;
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
        asFloatObj.init(iArr, iArr2);
        asFloatObj.init(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        asFloatObj.getInstance(iArr2, 2, iArr3);
        asFloatObj.init(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        asFloatObj.getInstance(iArr3, 2, iArr4);
        asFloatObj.init(iArr4, iArr2, iArr4);
        asFloatObj.getInstance(iArr4, 6, iArr2);
        asFloatObj.init(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        asFloatObj.getInstance(iArr2, 12, iArr5);
        asFloatObj.init(iArr5, iArr2, iArr5);
        asFloatObj.getInstance(iArr5, 6, iArr2);
        asFloatObj.init(iArr2, iArr4, iArr2);
        asFloatObj.init(iArr2, iArr4);
        asFloatObj.init(iArr4, iArr, iArr4);
        asFloatObj.getInstance(iArr4, 31, iArr5);
        asFloatObj.init(iArr5, iArr4, iArr2);
        asFloatObj.getInstance(iArr5, 32, iArr5);
        asFloatObj.init(iArr5, iArr2, iArr5);
        asFloatObj.getInstance(iArr5, 62, iArr5);
        asFloatObj.init(iArr5, iArr2, iArr5);
        asFloatObj.getInstance(iArr5, 4, iArr5);
        asFloatObj.init(iArr5, iArr3, iArr5);
        asFloatObj.getInstance(iArr5, 32, iArr5);
        asFloatObj.init(iArr5, iArr, iArr5);
        asFloatObj.getInstance(iArr5, 62, iArr5);
        asFloatObj.init(iArr5, iArr3);
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                z2 = true;
                break;
            } else if (iArr[i2] != iArr3[i2]) {
                break;
            } else {
                i2--;
            }
        }
        if (z2) {
            return new asLongObj(iArr5);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof asLongObj)) {
            return false;
        }
        int[] iArr = this.cca_continue;
        int[] iArr2 = ((asLongObj) obj).cca_continue;
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
