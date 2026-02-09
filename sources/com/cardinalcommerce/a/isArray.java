package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class isArray extends merge.init {
    private static BigInteger init = o.getWarnings;
    protected int[] cca_continue;

    public isArray(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(init) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.cca_continue = isObject.configure(bigInteger);
    }

    protected isArray(int[] iArr) {
        this.cca_continue = iArr;
    }

    public final int Cardinal() {
        return init.bitLength();
    }

    public final BigInteger cca_continue() {
        return ProtocolErrorEvent.getInstance(this.cca_continue);
    }

    public final int hashCode() {
        return init.hashCode() ^ getBackgroundColor.cca_continue(this.cca_continue, 5);
    }

    public isArray() {
        this.cca_continue = new int[5];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.cca_continue;
        for (int i = 0; i < 5; i++) {
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
        for (int i = 1; i < 5; i++) {
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
        int[] iArr = new int[5];
        isObject.cca_continue(this.cca_continue, ((isArray) merge).cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[5];
        isObject.init(this.cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[5];
        isObject.Cardinal(this.cca_continue, ((isArray) merge).cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[5];
        isObject.getInstance(this.cca_continue, ((isArray) merge).cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[5];
        X509CertUtils.init(isObject.configure, ((isArray) merge).cca_continue, iArr);
        isObject.getInstance(iArr, this.cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge init() {
        int[] iArr = new int[5];
        isObject.configure(this.cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[5];
        isObject.getInstance(this.cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[5];
        X509CertUtils.init(isObject.configure, this.cca_continue, iArr);
        return new isArray(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        boolean z2;
        int[] iArr = this.cca_continue;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= 5) {
                z = true;
                break;
            } else if (iArr[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            if (iArr[0] == 1) {
                int i2 = 1;
                while (true) {
                    if (i2 >= 5) {
                        z2 = true;
                        break;
                    } else if (iArr[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                int[] iArr2 = new int[5];
                isObject.getInstance(iArr, iArr2);
                isObject.getInstance(iArr2, iArr, iArr2);
                int[] iArr3 = new int[5];
                isObject.getInstance(iArr2, iArr3);
                isObject.getInstance(iArr3, iArr, iArr3);
                int[] iArr4 = new int[5];
                isObject.getInstance(iArr3, iArr4);
                isObject.getInstance(iArr4, iArr, iArr4);
                int[] iArr5 = new int[5];
                isObject.configure(iArr4, 3, iArr5);
                isObject.getInstance(iArr5, iArr3, iArr5);
                isObject.configure(iArr5, 7, iArr4);
                isObject.getInstance(iArr4, iArr5, iArr4);
                isObject.configure(iArr4, 3, iArr5);
                isObject.getInstance(iArr5, iArr3, iArr5);
                int[] iArr6 = new int[5];
                isObject.configure(iArr5, 14, iArr6);
                isObject.getInstance(iArr6, iArr4, iArr6);
                isObject.configure(iArr6, 31, iArr4);
                isObject.getInstance(iArr4, iArr6, iArr4);
                isObject.configure(iArr4, 62, iArr6);
                isObject.getInstance(iArr6, iArr4, iArr6);
                isObject.configure(iArr6, 3, iArr4);
                isObject.getInstance(iArr4, iArr3, iArr4);
                isObject.configure(iArr4, 18, iArr4);
                isObject.getInstance(iArr4, iArr5, iArr4);
                isObject.configure(iArr4, 2, iArr4);
                isObject.getInstance(iArr4, iArr, iArr4);
                isObject.configure(iArr4, 3, iArr4);
                isObject.getInstance(iArr4, iArr2, iArr4);
                isObject.configure(iArr4, 6, iArr4);
                isObject.getInstance(iArr4, iArr3, iArr4);
                isObject.configure(iArr4, 2, iArr4);
                isObject.getInstance(iArr4, iArr, iArr4);
                isObject.getInstance(iArr4, iArr2);
                int i3 = 4;
                while (true) {
                    if (i3 < 0) {
                        z3 = true;
                        break;
                    } else if (iArr[i3] != iArr2[i3]) {
                        break;
                    } else {
                        i3--;
                    }
                }
                if (z3) {
                    return new isArray(iArr4);
                }
                return null;
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isArray)) {
            return false;
        }
        int[] iArr = this.cca_continue;
        int[] iArr2 = ((isArray) obj).cca_continue;
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
