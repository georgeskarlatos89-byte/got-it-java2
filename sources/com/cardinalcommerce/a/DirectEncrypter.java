package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class DirectEncrypter extends merge.Cardinal {
    protected long[] Cardinal;

    public DirectEncrypter(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.Cardinal = ECDSAVerifier.Cardinal(bigInteger);
    }

    protected DirectEncrypter(long[] jArr) {
        this.Cardinal = jArr;
    }

    public final int Cardinal() {
        return 571;
    }

    public final int CardinalError() {
        return ECDSAVerifier.init(this.Cardinal);
    }

    public final merge configure(merge merge, merge merge2, merge merge3) {
        return Cardinal(merge, merge2, merge3);
    }

    public final int hashCode() {
        return getBackgroundColor.Cardinal(this.Cardinal, 9) ^ 5711052;
    }

    public final merge init() {
        return this;
    }

    public final boolean values() {
        return (this.Cardinal[0] & 1) != 0;
    }

    public DirectEncrypter() {
        this.Cardinal = new long[9];
    }

    public final boolean cleanup() {
        long[] jArr = this.Cardinal;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean onCReqSuccess() {
        long[] jArr = this.Cardinal;
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final BigInteger cca_continue() {
        long[] jArr = this.Cardinal;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                int i2 = (8 - i) << 3;
                setTextFontSize.init((int) (j >>> 32), bArr, i2);
                setTextFontSize.init((int) j, bArr, i2 + 4);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final merge cca_continue(merge merge) {
        long[] jArr = new long[9];
        ECDSAVerifier.configure(this.Cardinal, ((DirectEncrypter) merge).Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge configure() {
        long[] jArr = new long[9];
        ECDSAVerifier.configure(this.Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge Cardinal(merge merge) {
        long[] jArr = new long[9];
        ECDSAVerifier.configure(this.Cardinal, ((DirectEncrypter) merge).Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge init(merge merge) {
        long[] jArr = new long[9];
        ECDSAVerifier.getInstance(this.Cardinal, ((DirectEncrypter) merge).Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge Cardinal(merge merge, merge merge2, merge merge3) {
        long[] jArr = this.Cardinal;
        long[] jArr2 = ((DirectEncrypter) merge).Cardinal;
        long[] jArr3 = ((DirectEncrypter) merge2).Cardinal;
        long[] jArr4 = ((DirectEncrypter) merge3).Cardinal;
        long[] jArr5 = new long[18];
        ECDSAVerifier.init(jArr, jArr2, jArr5);
        ECDSAVerifier.init(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        ECDSAVerifier.init(jArr5, jArr6);
        return new DirectEncrypter(jArr6);
    }

    public final merge getInstance(merge merge) {
        long[] jArr = new long[9];
        ECDSAVerifier.getInstance(this.Cardinal, ((DirectEncrypter) merge.onValidated()).Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge getInstance() {
        long[] jArr = new long[9];
        ECDSAVerifier.Cardinal(this.Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge configure(merge merge, merge merge2) {
        long[] jArr = this.Cardinal;
        long[] jArr2 = ((DirectEncrypter) merge).Cardinal;
        long[] jArr3 = ((DirectEncrypter) merge2).Cardinal;
        long[] jArr4 = new long[18];
        ECDSAVerifier.onCReqSuccess(jArr, jArr4);
        ECDSAVerifier.init(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        ECDSAVerifier.init(jArr4, jArr5);
        return new DirectEncrypter(jArr5);
    }

    public final merge init(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[9];
        ECDSAVerifier.getInstance(this.Cardinal, i, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge onValidated() {
        long[] jArr = new long[9];
        ECDSAVerifier.cca_continue(this.Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final merge getWarnings() {
        long[] jArr = new long[9];
        ECDSAVerifier.getInstance(this.Cardinal, jArr);
        return new DirectEncrypter(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DirectEncrypter)) {
            return false;
        }
        long[] jArr = this.Cardinal;
        long[] jArr2 = ((DirectEncrypter) obj).Cardinal;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
