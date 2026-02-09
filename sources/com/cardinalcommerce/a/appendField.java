package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class appendField extends merge.init {
    private static BigInteger getInstance = writeJSONKV.getWarnings;
    protected int[] Cardinal;

    public appendField(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(getInstance) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.Cardinal = writeJSON.getInstance(bigInteger);
    }

    protected appendField(int[] iArr) {
        this.Cardinal = iArr;
    }

    public final int Cardinal() {
        return getInstance.bitLength();
    }

    public final BigInteger cca_continue() {
        return RuntimeErrorEvent.cca_continue(this.Cardinal);
    }

    public final boolean cleanup() {
        return RuntimeErrorEvent.init(this.Cardinal);
    }

    public final int hashCode() {
        return getInstance.hashCode() ^ getBackgroundColor.cca_continue(this.Cardinal, 6);
    }

    public appendField() {
        this.Cardinal = new int[6];
    }

    public final boolean onCReqSuccess() {
        int[] iArr = this.Cardinal;
        for (int i = 0; i < 6; i++) {
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
        int[] iArr = new int[6];
        writeJSON.getInstance(this.Cardinal, ((appendField) merge).Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge configure() {
        int[] iArr = new int[6];
        writeJSON.Cardinal(this.Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge Cardinal(merge merge) {
        int[] iArr = new int[6];
        writeJSON.configure(this.Cardinal, ((appendField) merge).Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge init(merge merge) {
        int[] iArr = new int[6];
        writeJSON.cca_continue(this.Cardinal, ((appendField) merge).Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge getInstance(merge merge) {
        int[] iArr = new int[6];
        X509CertUtils.init(writeJSON.getInstance, ((appendField) merge).Cardinal, iArr);
        writeJSON.cca_continue(iArr, this.Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge init() {
        int[] iArr = new int[6];
        writeJSON.init(this.Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge getInstance() {
        int[] iArr = new int[6];
        writeJSON.cca_continue(this.Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge onValidated() {
        int[] iArr = new int[6];
        X509CertUtils.init(writeJSON.getInstance, this.Cardinal, iArr);
        return new appendField(iArr);
    }

    public final merge getWarnings() {
        boolean z;
        int[] iArr = this.Cardinal;
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
        int[] iArr3 = new int[6];
        writeJSON.cca_continue(iArr, iArr2);
        writeJSON.cca_continue(iArr2, iArr, iArr2);
        writeJSON.getInstance(iArr2, 2, iArr3);
        writeJSON.cca_continue(iArr3, iArr2, iArr3);
        writeJSON.getInstance(iArr3, 4, iArr2);
        writeJSON.cca_continue(iArr2, iArr3, iArr2);
        writeJSON.getInstance(iArr2, 8, iArr3);
        writeJSON.cca_continue(iArr3, iArr2, iArr3);
        writeJSON.getInstance(iArr3, 16, iArr2);
        writeJSON.cca_continue(iArr2, iArr3, iArr2);
        writeJSON.getInstance(iArr2, 32, iArr3);
        writeJSON.cca_continue(iArr3, iArr2, iArr3);
        writeJSON.getInstance(iArr3, 64, iArr2);
        writeJSON.cca_continue(iArr2, iArr3, iArr2);
        writeJSON.getInstance(iArr2, 62, iArr2);
        writeJSON.cca_continue(iArr2, iArr3);
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
            return new appendField(iArr2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof appendField)) {
            return false;
        }
        int[] iArr = this.Cardinal;
        int[] iArr2 = ((appendField) obj).Cardinal;
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
