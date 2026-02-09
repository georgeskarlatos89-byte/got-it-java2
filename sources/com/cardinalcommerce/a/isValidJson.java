package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;
import org.objectweb.asm.Opcodes;

public final class isValidJson extends merge.Cardinal {
    protected long[] Cardinal;

    protected isValidJson(long[] jArr) {
        this.Cardinal = jArr;
    }

    public final int Cardinal() {
        return Opcodes.INSTANCEOF;
    }

    public final merge Cardinal(merge merge) {
        return cca_continue(merge);
    }

    public final BigInteger cca_continue() {
        return setErrorCode.init(this.Cardinal);
    }

    public final boolean cleanup() {
        return setErrorCode.Cardinal(this.Cardinal);
    }

    public final merge configure(merge merge, merge merge2, merge merge3) {
        return Cardinal(merge, merge2, merge3);
    }

    public final int hashCode() {
        return getBackgroundColor.Cardinal(this.Cardinal, 4) ^ 1930015;
    }

    public final merge init() {
        return this;
    }

    public final boolean values() {
        return (this.Cardinal[0] & 1) != 0;
    }

    public isValidJson(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        long[] init = setErrorCode.init(bigInteger);
        long j = init[3];
        long j2 = j >>> 1;
        init[0] = init[0] ^ ((j2 << 15) ^ j2);
        init[1] = (j2 >>> 49) ^ init[1];
        init[3] = j & 1;
        this.Cardinal = init;
    }

    public isValidJson() {
        this.Cardinal = new long[4];
    }

    public final boolean onCReqSuccess() {
        long[] jArr = this.Cardinal;
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final merge cca_continue(merge merge) {
        long[] jArr = this.Cardinal;
        long[] jArr2 = ((isValidJson) merge).Cardinal;
        return new isValidJson(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    public final merge configure() {
        long[] jArr = this.Cardinal;
        return new isValidJson(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    public final merge init(merge merge) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        JStylerObj.init(this.Cardinal, ((isValidJson) merge).Cardinal, jArr2);
        JStylerObj.configure(jArr2, jArr);
        return new isValidJson(jArr);
    }

    public final merge Cardinal(merge merge, merge merge2, merge merge3) {
        long[] jArr = this.Cardinal;
        long[] jArr2 = ((isValidJson) merge).Cardinal;
        long[] jArr3 = ((isValidJson) merge2).Cardinal;
        long[] jArr4 = ((isValidJson) merge3).Cardinal;
        long[] jArr5 = new long[8];
        long[] jArr6 = new long[8];
        JStylerObj.init(jArr, jArr2, jArr6);
        JStylerObj.Cardinal(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[8];
        JStylerObj.init(jArr3, jArr4, jArr7);
        JStylerObj.Cardinal(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[4];
        JStylerObj.configure(jArr5, jArr8);
        return new isValidJson(jArr8);
    }

    public final merge getInstance(merge merge) {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        JStylerObj.init(this.Cardinal, ((isValidJson) merge.onValidated()).Cardinal, jArr2);
        JStylerObj.configure(jArr2, jArr);
        return new isValidJson(jArr);
    }

    public final merge getInstance() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        JStylerObj.Cardinal(this.Cardinal, jArr2);
        JStylerObj.configure(jArr2, jArr);
        return new isValidJson(jArr);
    }

    public final merge configure(merge merge, merge merge2) {
        long[] jArr = this.Cardinal;
        long[] jArr2 = ((isValidJson) merge).Cardinal;
        long[] jArr3 = ((isValidJson) merge2).Cardinal;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        JStylerObj.Cardinal(jArr, jArr5);
        JStylerObj.Cardinal(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[8];
        JStylerObj.init(jArr2, jArr3, jArr6);
        JStylerObj.Cardinal(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[4];
        JStylerObj.configure(jArr4, jArr7);
        return new isValidJson(jArr7);
    }

    public final merge init(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[4];
        JStylerObj.cca_continue(this.Cardinal, i, jArr);
        return new isValidJson(jArr);
    }

    public final int CardinalError() {
        return ((int) this.Cardinal[0]) & 1;
    }

    public final merge onValidated() {
        long[] jArr = new long[4];
        long[] jArr2 = this.Cardinal;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 4) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            long[] jArr5 = new long[8];
            JStylerObj.Cardinal(jArr2, jArr5);
            JStylerObj.configure(jArr5, jArr3);
            JStylerObj.cca_continue(jArr3, 1, jArr4);
            long[] jArr6 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr6);
            JStylerObj.configure(jArr6, jArr3);
            JStylerObj.cca_continue(jArr4, 1, jArr4);
            long[] jArr7 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr7);
            JStylerObj.configure(jArr7, jArr3);
            JStylerObj.cca_continue(jArr3, 3, jArr4);
            long[] jArr8 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr8);
            JStylerObj.configure(jArr8, jArr3);
            JStylerObj.cca_continue(jArr3, 6, jArr4);
            long[] jArr9 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr9);
            JStylerObj.configure(jArr9, jArr3);
            JStylerObj.cca_continue(jArr3, 12, jArr4);
            long[] jArr10 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr10);
            JStylerObj.configure(jArr10, jArr3);
            JStylerObj.cca_continue(jArr3, 24, jArr4);
            long[] jArr11 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr11);
            JStylerObj.configure(jArr11, jArr3);
            JStylerObj.cca_continue(jArr3, 48, jArr4);
            long[] jArr12 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr12);
            JStylerObj.configure(jArr12, jArr3);
            JStylerObj.cca_continue(jArr3, 96, jArr4);
            long[] jArr13 = new long[8];
            JStylerObj.init(jArr3, jArr4, jArr13);
            JStylerObj.configure(jArr13, jArr);
            return new isValidJson(jArr);
        }
        throw new IllegalStateException();
    }

    public final merge getWarnings() {
        long[] jArr = this.Cardinal;
        long instance = EncryptedJWT.getInstance(jArr[0]);
        long instance2 = EncryptedJWT.getInstance(jArr[1]);
        long j = (instance & 4294967295L) | (instance2 << 32);
        long j2 = (instance >>> 32) | (instance2 & -4294967296L);
        long instance3 = EncryptedJWT.getInstance(jArr[2]);
        long j3 = instance3 >>> 32;
        return new isValidJson(new long[]{j ^ (j2 << 8), (((j3 << 8) ^ ((instance3 & 4294967295L) ^ (jArr[3] << 32))) ^ (j2 >>> 56)) ^ (j2 << 33), ((j3 >>> 56) ^ (j3 << 33)) ^ (j2 >>> 31), j3 >>> 31});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isValidJson)) {
            return false;
        }
        long[] jArr = this.Cardinal;
        long[] jArr2 = ((isValidJson) obj).Cardinal;
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
