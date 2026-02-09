package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class objectStart extends merge.init {
    private static BigInteger configure = objectFirstStart.getWarnings;
    protected int[] getInstance;

    public objectStart(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(configure) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.getInstance = objectStop.getInstance(bigInteger);
    }

    protected objectStart(int[] iArr) {
        this.getInstance = iArr;
    }

    public final int Cardinal() {
        return configure.bitLength();
    }

    public final BigInteger cca_continue() {
        return setErrorCode.configure(this.getInstance);
    }

    public final boolean cleanup() {
        return setErrorCode.init(this.getInstance);
    }

    public final int hashCode() {
        return configure.hashCode() ^ getBackgroundColor.cca_continue(this.getInstance, 8);
    }

    public objectStart() {
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
        objectStop.Cardinal(this.getInstance, ((objectStart) merge).getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[8];
        objectStop.getInstance(this.getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[8];
        objectStop.cca_continue(this.getInstance, ((objectStart) merge).getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[8];
        objectStop.configure(this.getInstance, ((objectStart) merge).getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[8];
        X509CertUtils.init(objectStop.configure, ((objectStart) merge).getInstance, iArr);
        objectStop.configure(iArr, this.getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge init() {
        int[] iArr = new int[8];
        objectStop.Cardinal(this.getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[8];
        objectStop.init(this.getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[8];
        X509CertUtils.init(objectStop.configure, this.getInstance, iArr);
        return new objectStart(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        int[] iArr = this.getInstance;
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
        int[] iArr3 = new int[8];
        objectStop.init(iArr, iArr2);
        objectStop.configure(iArr2, iArr, iArr2);
        objectStop.cca_continue(iArr2, 2, iArr3);
        objectStop.configure(iArr3, iArr2, iArr3);
        objectStop.cca_continue(iArr3, 4, iArr2);
        objectStop.configure(iArr2, iArr3, iArr2);
        objectStop.cca_continue(iArr2, 8, iArr3);
        objectStop.configure(iArr3, iArr2, iArr3);
        objectStop.cca_continue(iArr3, 16, iArr2);
        objectStop.configure(iArr2, iArr3, iArr2);
        objectStop.cca_continue(iArr2, 32, iArr2);
        objectStop.configure(iArr2, iArr, iArr2);
        objectStop.cca_continue(iArr2, 96, iArr2);
        objectStop.configure(iArr2, iArr, iArr2);
        objectStop.cca_continue(iArr2, 94, iArr2);
        objectStop.init(iArr2, iArr3);
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
            return new objectStart(iArr2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof objectStart)) {
            return false;
        }
        int[] iArr = this.getInstance;
        int[] iArr2 = ((objectStart) obj).getInstance;
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
