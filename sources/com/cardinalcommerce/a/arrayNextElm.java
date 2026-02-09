package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class arrayNextElm extends merge.Cardinal {
    protected long[] init;

    protected arrayNextElm(long[] jArr) {
        this.init = jArr;
    }

    public final int Cardinal() {
        return 113;
    }

    public final merge Cardinal(merge merge) {
        return cca_continue(merge);
    }

    public final merge configure(merge merge, merge merge2, merge merge3) {
        return Cardinal(merge, merge2, merge3);
    }

    public final int hashCode() {
        return getBackgroundColor.Cardinal(this.init, 2) ^ 113009;
    }

    public final merge init() {
        return this;
    }

    public final boolean values() {
        return (this.init[0] & 1) != 0;
    }

    public arrayNextElm(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        } else {
            long[] jArr = new long[2];
            int i = 0;
            while (bigInteger.signum() != 0) {
                jArr[i] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i++;
            }
            long j = jArr[1];
            long j2 = j >>> 49;
            jArr[0] = (j2 ^ (j2 << 9)) ^ jArr[0];
            jArr[1] = j & 562949953421311L;
            this.init = jArr;
        }
    }

    public arrayNextElm() {
        this.init = new long[2];
    }

    public final boolean cleanup() {
        long[] jArr = this.init;
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public final boolean onCReqSuccess() {
        long[] jArr = this.init;
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final BigInteger cca_continue() {
        long[] jArr = this.init;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                int i2 = (1 - i) << 3;
                setTextFontSize.init((int) (j >>> 32), bArr, i2);
                setTextFontSize.init((int) j, bArr, i2 + 4);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final merge cca_continue(merge merge) {
        long[] jArr = this.init;
        long[] jArr2 = ((arrayNextElm) merge).init;
        return new arrayNextElm(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1]});
    }

    public final merge configure() {
        long[] jArr = this.init;
        return new arrayNextElm(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    public final merge init(merge merge) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        arrayObjectEnd.init(this.init, ((arrayNextElm) merge).init, jArr2);
        arrayObjectEnd.Cardinal(jArr2, jArr);
        return new arrayNextElm(jArr);
    }

    public final merge Cardinal(merge merge, merge merge2, merge merge3) {
        long[] jArr = this.init;
        long[] jArr2 = ((arrayNextElm) merge).init;
        long[] jArr3 = ((arrayNextElm) merge2).init;
        long[] jArr4 = ((arrayNextElm) merge3).init;
        long[] jArr5 = new long[4];
        long[] jArr6 = new long[4];
        arrayObjectEnd.init(jArr, jArr2, jArr6);
        arrayObjectEnd.cca_continue(jArr5, jArr6, jArr5);
        long[] jArr7 = new long[4];
        arrayObjectEnd.init(jArr3, jArr4, jArr7);
        arrayObjectEnd.cca_continue(jArr5, jArr7, jArr5);
        long[] jArr8 = new long[2];
        arrayObjectEnd.Cardinal(jArr5, jArr8);
        return new arrayNextElm(jArr8);
    }

    public final merge getInstance(merge merge) {
        long[] jArr = new long[2];
        long[] jArr2 = new long[4];
        arrayObjectEnd.init(this.init, ((arrayNextElm) merge.onValidated()).init, jArr2);
        arrayObjectEnd.Cardinal(jArr2, jArr);
        return new arrayNextElm(jArr);
    }

    public final merge getInstance() {
        long[] jArr = new long[2];
        long[] jArr2 = this.init;
        long[] jArr3 = new long[4];
        EncryptedJWT.Cardinal(jArr2[0], jArr3, 0);
        EncryptedJWT.Cardinal(jArr2[1], jArr3, 2);
        arrayObjectEnd.Cardinal(jArr3, jArr);
        return new arrayNextElm(jArr);
    }

    public final merge configure(merge merge, merge merge2) {
        long[] jArr = this.init;
        long[] jArr2 = ((arrayNextElm) merge).init;
        long[] jArr3 = ((arrayNextElm) merge2).init;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        EncryptedJWT.Cardinal(jArr[0], jArr5, 0);
        EncryptedJWT.Cardinal(jArr[1], jArr5, 2);
        arrayObjectEnd.cca_continue(jArr4, jArr5, jArr4);
        long[] jArr6 = new long[4];
        arrayObjectEnd.init(jArr2, jArr3, jArr6);
        arrayObjectEnd.cca_continue(jArr4, jArr6, jArr4);
        long[] jArr7 = new long[2];
        arrayObjectEnd.Cardinal(jArr4, jArr7);
        return new arrayNextElm(jArr7);
    }

    public final merge init(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[2];
        arrayObjectEnd.Cardinal(this.init, i, jArr);
        return new arrayNextElm(jArr);
    }

    public final int CardinalError() {
        return ((int) this.init[0]) & 1;
    }

    public final merge onValidated() {
        boolean z;
        long[] jArr = new long[2];
        long[] jArr2 = this.init;
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[2];
            long[] jArr4 = new long[2];
            long[] jArr5 = new long[4];
            EncryptedJWT.Cardinal(jArr2[0], jArr5, 0);
            EncryptedJWT.Cardinal(jArr2[1], jArr5, 2);
            arrayObjectEnd.Cardinal(jArr5, jArr3);
            long[] jArr6 = new long[4];
            arrayObjectEnd.init(jArr3, jArr2, jArr6);
            arrayObjectEnd.Cardinal(jArr6, jArr3);
            long[] jArr7 = new long[4];
            EncryptedJWT.Cardinal(jArr3[0], jArr7, 0);
            EncryptedJWT.Cardinal(jArr3[1], jArr7, 2);
            arrayObjectEnd.Cardinal(jArr7, jArr3);
            long[] jArr8 = new long[4];
            arrayObjectEnd.init(jArr3, jArr2, jArr8);
            arrayObjectEnd.Cardinal(jArr8, jArr3);
            arrayObjectEnd.Cardinal(jArr3, 3, jArr4);
            long[] jArr9 = new long[4];
            arrayObjectEnd.init(jArr4, jArr3, jArr9);
            arrayObjectEnd.Cardinal(jArr9, jArr4);
            long[] jArr10 = new long[4];
            EncryptedJWT.Cardinal(jArr4[0], jArr10, 0);
            EncryptedJWT.Cardinal(jArr4[1], jArr10, 2);
            arrayObjectEnd.Cardinal(jArr10, jArr4);
            long[] jArr11 = new long[4];
            arrayObjectEnd.init(jArr4, jArr2, jArr11);
            arrayObjectEnd.Cardinal(jArr11, jArr4);
            arrayObjectEnd.Cardinal(jArr4, 7, jArr3);
            long[] jArr12 = new long[4];
            arrayObjectEnd.init(jArr3, jArr4, jArr12);
            arrayObjectEnd.Cardinal(jArr12, jArr3);
            arrayObjectEnd.Cardinal(jArr3, 14, jArr4);
            long[] jArr13 = new long[4];
            arrayObjectEnd.init(jArr4, jArr3, jArr13);
            arrayObjectEnd.Cardinal(jArr13, jArr4);
            arrayObjectEnd.Cardinal(jArr4, 28, jArr3);
            long[] jArr14 = new long[4];
            arrayObjectEnd.init(jArr3, jArr4, jArr14);
            arrayObjectEnd.Cardinal(jArr14, jArr3);
            arrayObjectEnd.Cardinal(jArr3, 56, jArr4);
            long[] jArr15 = new long[4];
            arrayObjectEnd.init(jArr4, jArr3, jArr15);
            arrayObjectEnd.Cardinal(jArr15, jArr4);
            long[] jArr16 = new long[4];
            EncryptedJWT.Cardinal(jArr4[0], jArr16, 0);
            EncryptedJWT.Cardinal(jArr4[1], jArr16, 2);
            arrayObjectEnd.Cardinal(jArr16, jArr);
            return new arrayNextElm(jArr);
        }
        throw new IllegalStateException();
    }

    public final merge getWarnings() {
        long[] jArr = this.init;
        long instance = EncryptedJWT.getInstance(jArr[0]);
        long instance2 = EncryptedJWT.getInstance(jArr[1]);
        long j = (instance >>> 32) | (instance2 & -4294967296L);
        return new arrayNextElm(new long[]{((j << 57) ^ ((4294967295L & instance) | (instance2 << 32))) ^ (j << 5), (j >>> 7) ^ (j >>> 59)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof arrayNextElm)) {
            return false;
        }
        long[] jArr = this.init;
        long[] jArr2 = ((arrayNextElm) obj).init;
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
