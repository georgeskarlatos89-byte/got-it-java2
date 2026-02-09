package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;
import org.objectweb.asm.Opcodes;

public final class canRead extends merge.Cardinal {
    protected long[] configure;

    public canRead(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.configure = getGetterName.Cardinal(bigInteger);
    }

    protected canRead(long[] jArr) {
        this.configure = jArr;
    }

    public final int Cardinal() {
        return Opcodes.LXOR;
    }

    public final int CardinalError() {
        return getGetterName.getInstance(this.configure);
    }

    public final BigInteger cca_continue() {
        return RuntimeErrorEvent.cca_continue(this.configure);
    }

    public final boolean cleanup() {
        return RuntimeErrorEvent.Cardinal(this.configure);
    }

    public final merge configure(merge merge, merge merge2, merge merge3) {
        return Cardinal(merge, merge2, merge3);
    }

    public final int hashCode() {
        return getBackgroundColor.Cardinal(this.configure, 3) ^ 131832;
    }

    public final merge init() {
        return this;
    }

    public final boolean values() {
        return (this.configure[0] & 1) != 0;
    }

    public canRead() {
        this.configure = new long[3];
    }

    public final boolean onCReqSuccess() {
        long[] jArr = this.configure;
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final merge cca_continue(merge merge) {
        long[] jArr = new long[3];
        getGetterName.configure(this.configure, ((canRead) merge).configure, jArr);
        return new canRead(jArr);
    }

    public final merge configure() {
        long[] jArr = new long[3];
        getGetterName.configure(this.configure, jArr);
        return new canRead(jArr);
    }

    public final merge Cardinal(merge merge) {
        long[] jArr = new long[3];
        getGetterName.configure(this.configure, ((canRead) merge).configure, jArr);
        return new canRead(jArr);
    }

    public final merge init(merge merge) {
        long[] jArr = new long[3];
        getGetterName.Cardinal(this.configure, ((canRead) merge).configure, jArr);
        return new canRead(jArr);
    }

    public final merge Cardinal(merge merge, merge merge2, merge merge3) {
        long[] jArr = this.configure;
        long[] jArr2 = ((canRead) merge).configure;
        long[] jArr3 = ((canRead) merge2).configure;
        long[] jArr4 = ((canRead) merge3).configure;
        long[] jArr5 = new long[5];
        getGetterName.cca_continue(jArr, jArr2, jArr5);
        getGetterName.cca_continue(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        getGetterName.init(jArr5, jArr6);
        return new canRead(jArr6);
    }

    public final merge getInstance(merge merge) {
        long[] jArr = new long[3];
        getGetterName.Cardinal(this.configure, ((canRead) merge.onValidated()).configure, jArr);
        return new canRead(jArr);
    }

    public final merge getInstance() {
        long[] jArr = new long[3];
        getGetterName.cca_continue(this.configure, jArr);
        return new canRead(jArr);
    }

    public final merge configure(merge merge, merge merge2) {
        long[] jArr = this.configure;
        long[] jArr2 = ((canRead) merge).configure;
        long[] jArr3 = ((canRead) merge2).configure;
        long[] jArr4 = new long[5];
        getGetterName.onValidated(jArr, jArr4);
        getGetterName.cca_continue(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[3];
        getGetterName.init(jArr4, jArr5);
        return new canRead(jArr5);
    }

    public final merge init(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[3];
        getGetterName.Cardinal(this.configure, i, jArr);
        return new canRead(jArr);
    }

    public final merge onValidated() {
        long[] jArr = new long[3];
        getGetterName.Cardinal(this.configure, jArr);
        return new canRead(jArr);
    }

    public final merge getWarnings() {
        long[] jArr = new long[3];
        getGetterName.getInstance(this.configure, jArr);
        return new canRead(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof canRead)) {
            return false;
        }
        long[] jArr = this.configure;
        long[] jArr2 = ((canRead) obj).configure;
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
