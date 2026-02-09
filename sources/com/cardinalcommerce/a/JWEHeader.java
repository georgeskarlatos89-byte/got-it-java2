package com.cardinalcommerce.a;

import com.cardinalcommerce.a.JStylerObj;
import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class JWEHeader extends merge.Cardinal {
    protected long[] getInstance;

    public JWEHeader(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.getInstance = JStylerObj.MustProtect.Cardinal(bigInteger);
    }

    protected JWEHeader(long[] jArr) {
        this.getInstance = jArr;
    }

    public final int Cardinal() {
        return 283;
    }

    public final int CardinalError() {
        return JStylerObj.MustProtect.configure(this.getInstance);
    }

    public final merge configure(merge merge, merge merge2, merge merge3) {
        return Cardinal(merge, merge2, merge3);
    }

    public final int hashCode() {
        return getBackgroundColor.Cardinal(this.getInstance, 5) ^ 2831275;
    }

    public final merge init() {
        return this;
    }

    public final boolean values() {
        return (this.getInstance[0] & 1) != 0;
    }

    public JWEHeader() {
        this.getInstance = new long[5];
    }

    public final boolean cleanup() {
        long[] jArr = this.getInstance;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean onCReqSuccess() {
        long[] jArr = this.getInstance;
        for (int i = 0; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final BigInteger cca_continue() {
        long[] jArr = this.getInstance;
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                int i2 = (4 - i) << 3;
                setTextFontSize.init((int) (j >>> 32), bArr, i2);
                setTextFontSize.init((int) j, bArr, i2 + 4);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final merge cca_continue(merge merge) {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.init(this.getInstance, ((JWEHeader) merge).getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final merge configure() {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.cca_continue(this.getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final merge Cardinal(merge merge) {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.init(this.getInstance, ((JWEHeader) merge).getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final merge init(merge merge) {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.Cardinal(this.getInstance, ((JWEHeader) merge).getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final merge Cardinal(merge merge, merge merge2, merge merge3) {
        long[] jArr = this.getInstance;
        long[] jArr2 = ((JWEHeader) merge).getInstance;
        long[] jArr3 = ((JWEHeader) merge2).getInstance;
        long[] jArr4 = ((JWEHeader) merge3).getInstance;
        long[] jArr5 = new long[9];
        JStylerObj.MustProtect.getInstance(jArr, jArr2, jArr5);
        JStylerObj.MustProtect.getInstance(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[5];
        JStylerObj.MustProtect.Cardinal(jArr5, jArr6);
        return new JWEHeader(jArr6);
    }

    public final merge getInstance(merge merge) {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.Cardinal(this.getInstance, ((JWEHeader) merge.onValidated()).getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final merge getInstance() {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.configure(this.getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final merge configure(merge merge, merge merge2) {
        long[] jArr = this.getInstance;
        long[] jArr2 = ((JWEHeader) merge).getInstance;
        long[] jArr3 = ((JWEHeader) merge2).getInstance;
        long[] jArr4 = new long[9];
        JStylerObj.MustProtect.cleanup(jArr, jArr4);
        JStylerObj.MustProtect.getInstance(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[5];
        JStylerObj.MustProtect.Cardinal(jArr4, jArr5);
        return new JWEHeader(jArr5);
    }

    public final merge init(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[5];
        JStylerObj.MustProtect.Cardinal(this.getInstance, i, jArr);
        return new JWEHeader(jArr);
    }

    public final merge onValidated() {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.getInstance(this.getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final merge getWarnings() {
        long[] jArr = new long[5];
        JStylerObj.MustProtect.init(this.getInstance, jArr);
        return new JWEHeader(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JWEHeader)) {
            return false;
        }
        long[] jArr = this.getInstance;
        long[] jArr2 = ((JWEHeader) obj).getInstance;
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
