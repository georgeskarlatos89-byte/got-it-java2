package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;
import org.objectweb.asm.Opcodes;

public final class parseWithException extends merge.Cardinal {
    protected long[] cca_continue;

    public parseWithException(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.cca_continue = compress.getInstance(bigInteger);
    }

    protected parseWithException(long[] jArr) {
        this.cca_continue = jArr;
    }

    public final int Cardinal() {
        return Opcodes.IF_ICMPGT;
    }

    public final int CardinalError() {
        return compress.cca_continue(this.cca_continue);
    }

    public final BigInteger cca_continue() {
        return RuntimeErrorEvent.cca_continue(this.cca_continue);
    }

    public final boolean cleanup() {
        return RuntimeErrorEvent.Cardinal(this.cca_continue);
    }

    public final merge configure(merge merge, merge merge2, merge merge3) {
        return Cardinal(merge, merge2, merge3);
    }

    public final int hashCode() {
        return getBackgroundColor.Cardinal(this.cca_continue, 3) ^ 163763;
    }

    public final merge init() {
        return this;
    }

    public final boolean values() {
        return (this.cca_continue[0] & 1) != 0;
    }

    public parseWithException() {
        this.cca_continue = new long[3];
    }

    public final boolean onCReqSuccess() {
        long[] jArr = this.cca_continue;
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final merge cca_continue(merge merge) {
        long[] jArr = new long[3];
        compress.Cardinal(this.cca_continue, ((parseWithException) merge).cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final merge configure() {
        long[] jArr = new long[3];
        compress.getInstance(this.cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final merge Cardinal(merge merge) {
        long[] jArr = new long[3];
        compress.Cardinal(this.cca_continue, ((parseWithException) merge).cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final merge init(merge merge) {
        long[] jArr = new long[3];
        compress.configure(this.cca_continue, ((parseWithException) merge).cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final merge Cardinal(merge merge, merge merge2, merge merge3) {
        long[] jArr = this.cca_continue;
        long[] jArr2 = ((parseWithException) merge).cca_continue;
        long[] jArr3 = ((parseWithException) merge2).cca_continue;
        long[] jArr4 = ((parseWithException) merge3).cca_continue;
        long[] jArr5 = new long[6];
        compress.cca_continue(jArr, jArr2, jArr5);
        compress.cca_continue(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        compress.init(jArr5, jArr6);
        return new parseWithException(jArr6);
    }

    public final merge getInstance(merge merge) {
        long[] jArr = new long[3];
        compress.configure(this.cca_continue, ((parseWithException) merge.onValidated()).cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final merge getInstance() {
        long[] jArr = new long[3];
        compress.cca_continue(this.cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final merge configure(merge merge, merge merge2) {
        long[] jArr = this.cca_continue;
        long[] jArr2 = ((parseWithException) merge).cca_continue;
        long[] jArr3 = ((parseWithException) merge2).cca_continue;
        long[] jArr4 = new long[6];
        compress.onCReqSuccess(jArr, jArr4);
        compress.cca_continue(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[3];
        compress.init(jArr4, jArr5);
        return new parseWithException(jArr5);
    }

    public final merge init(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[3];
        compress.getInstance(this.cca_continue, i, jArr);
        return new parseWithException(jArr);
    }

    public final merge onValidated() {
        long[] jArr = new long[3];
        compress.configure(this.cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final merge getWarnings() {
        long[] jArr = new long[3];
        compress.Cardinal(this.cca_continue, jArr);
        return new parseWithException(jArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof parseWithException)) {
            return false;
        }
        long[] jArr = this.cca_continue;
        long[] jArr2 = ((parseWithException) obj).cca_continue;
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
