package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class indent extends merge.init {
    private static BigInteger getInstance = protect4Web.getSDKVersion;
    protected int[] Cardinal;

    public indent(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(getInstance) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.Cardinal = mustProtectKey.init(bigInteger);
    }

    protected indent(int[] iArr) {
        this.Cardinal = iArr;
    }

    public final int Cardinal() {
        return getInstance.bitLength();
    }

    public final BigInteger cca_continue() {
        return setErrorCode.configure(this.Cardinal);
    }

    public final boolean cleanup() {
        return setErrorCode.init(this.Cardinal);
    }

    public final int hashCode() {
        return getInstance.hashCode() ^ getBackgroundColor.cca_continue(this.Cardinal, 8);
    }

    public indent() {
        this.Cardinal = new int[8];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.Cardinal;
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean values() {
        return (this.Cardinal[0] & 1) == 1;
    }

    public final merge cca_continue(merge merge) {
        int[] iArr = new int[8];
        mustProtectKey.init(this.Cardinal, ((indent) merge).Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[8];
        mustProtectKey.getInstance(this.Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[8];
        mustProtectKey.configure(this.Cardinal, ((indent) merge).Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[8];
        mustProtectKey.getInstance(this.Cardinal, ((indent) merge).Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[8];
        X509CertUtils.init(mustProtectKey.init, ((indent) merge).Cardinal, iArr);
        mustProtectKey.getInstance(iArr, this.Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge init() {
        int[] iArr = new int[8];
        mustProtectKey.cca_continue(this.Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[8];
        mustProtectKey.init(this.Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[8];
        X509CertUtils.init(mustProtectKey.init, this.Cardinal, iArr);
        return new indent(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        int[] iArr = this.Cardinal;
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
        mustProtectKey.init(iArr, iArr2);
        mustProtectKey.getInstance(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        mustProtectKey.init(iArr2, iArr3);
        mustProtectKey.getInstance(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        mustProtectKey.Cardinal(iArr3, 3, iArr4);
        mustProtectKey.getInstance(iArr4, iArr3, iArr4);
        mustProtectKey.Cardinal(iArr4, 3, iArr4);
        mustProtectKey.getInstance(iArr4, iArr3, iArr4);
        mustProtectKey.Cardinal(iArr4, 2, iArr4);
        mustProtectKey.getInstance(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        mustProtectKey.Cardinal(iArr4, 11, iArr5);
        mustProtectKey.getInstance(iArr5, iArr4, iArr5);
        mustProtectKey.Cardinal(iArr5, 22, iArr4);
        mustProtectKey.getInstance(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        mustProtectKey.Cardinal(iArr4, 44, iArr6);
        mustProtectKey.getInstance(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        mustProtectKey.Cardinal(iArr6, 88, iArr7);
        mustProtectKey.getInstance(iArr7, iArr6, iArr7);
        mustProtectKey.Cardinal(iArr7, 44, iArr6);
        mustProtectKey.getInstance(iArr6, iArr4, iArr6);
        mustProtectKey.Cardinal(iArr6, 3, iArr4);
        mustProtectKey.getInstance(iArr4, iArr3, iArr4);
        mustProtectKey.Cardinal(iArr4, 23, iArr4);
        mustProtectKey.getInstance(iArr4, iArr5, iArr4);
        mustProtectKey.Cardinal(iArr4, 6, iArr4);
        mustProtectKey.getInstance(iArr4, iArr2, iArr4);
        mustProtectKey.Cardinal(iArr4, 2, iArr4);
        mustProtectKey.init(iArr4, iArr2);
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                z2 = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                break;
            } else {
                i2--;
            }
        }
        if (z2) {
            return new indent(iArr4);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof indent)) {
            return false;
        }
        int[] iArr = this.Cardinal;
        int[] iArr2 = ((indent) obj).Cardinal;
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
