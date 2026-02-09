package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class failure extends merge.init {
    private static BigInteger configure = escape.getSDKVersion;
    protected int[] cca_continue;

    public failure(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(configure) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.cca_continue = getJPath.init(bigInteger);
    }

    protected failure(int[] iArr) {
        this.cca_continue = iArr;
    }

    public final int Cardinal() {
        return configure.bitLength();
    }

    public final BigInteger cca_continue() {
        return RuntimeErrorEvent.cca_continue(this.cca_continue);
    }

    public final boolean cleanup() {
        return RuntimeErrorEvent.init(this.cca_continue);
    }

    public final int hashCode() {
        return configure.hashCode() ^ getBackgroundColor.cca_continue(this.cca_continue, 6);
    }

    public failure() {
        this.cca_continue = new int[6];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.cca_continue;
        for (int i = 0; i < 6; i++) {
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
        int[] iArr = new int[6];
        getJPath.configure(this.cca_continue, ((failure) merge).cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[6];
        getJPath.getInstance(this.cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[6];
        getJPath.cca_continue(this.cca_continue, ((failure) merge).cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[6];
        getJPath.Cardinal(this.cca_continue, ((failure) merge).cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[6];
        X509CertUtils.init(getJPath.getInstance, ((failure) merge).cca_continue, iArr);
        getJPath.Cardinal(iArr, this.cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge init() {
        int[] iArr = new int[6];
        getJPath.cca_continue(this.cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[6];
        getJPath.configure(this.cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[6];
        X509CertUtils.init(getJPath.getInstance, this.cca_continue, iArr);
        return new failure(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        int[] iArr = this.cca_continue;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= 6) {
                z = true;
                break;
            } else if (iArr[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (z || RuntimeErrorEvent.init(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        getJPath.configure(iArr, iArr2);
        getJPath.Cardinal(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        getJPath.configure(iArr2, iArr3);
        getJPath.Cardinal(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        getJPath.init(iArr3, 3, iArr4);
        getJPath.Cardinal(iArr4, iArr3, iArr4);
        getJPath.init(iArr4, 2, iArr4);
        getJPath.Cardinal(iArr4, iArr2, iArr4);
        getJPath.init(iArr4, 8, iArr2);
        getJPath.Cardinal(iArr2, iArr4, iArr2);
        getJPath.init(iArr2, 3, iArr4);
        getJPath.Cardinal(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        getJPath.init(iArr4, 16, iArr5);
        getJPath.Cardinal(iArr5, iArr2, iArr5);
        getJPath.init(iArr5, 35, iArr2);
        getJPath.Cardinal(iArr2, iArr5, iArr2);
        getJPath.init(iArr2, 70, iArr5);
        getJPath.Cardinal(iArr5, iArr2, iArr5);
        getJPath.init(iArr5, 19, iArr2);
        getJPath.Cardinal(iArr2, iArr4, iArr2);
        getJPath.init(iArr2, 20, iArr2);
        getJPath.Cardinal(iArr2, iArr4, iArr2);
        getJPath.init(iArr2, 4, iArr2);
        getJPath.Cardinal(iArr2, iArr3, iArr2);
        getJPath.init(iArr2, 6, iArr2);
        getJPath.Cardinal(iArr2, iArr3, iArr2);
        getJPath.configure(iArr2, iArr2);
        getJPath.configure(iArr2, iArr3);
        int i2 = 5;
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
            return new failure(iArr2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof failure)) {
            return false;
        }
        int[] iArr = this.cca_continue;
        int[] iArr2 = ((failure) obj).cca_continue;
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
