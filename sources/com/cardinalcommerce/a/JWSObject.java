package com.cardinalcommerce.a;

import com.cardinalcommerce.a.merge;
import java.math.BigInteger;

public final class JWSObject extends merge.Cardinal {
    protected long[] configure;

    protected JWSObject(long[] jArr) {
        this.configure = jArr;
    }

    public final int Cardinal() {
        return 409;
    }

    public final merge Cardinal(merge merge) {
        return cca_continue(merge);
    }

    public final merge configure(merge merge, merge merge2, merge merge3) {
        return Cardinal(merge, merge2, merge3);
    }

    public final int hashCode() {
        return getBackgroundColor.Cardinal(this.configure, 7) ^ 4090087;
    }

    public final merge init() {
        return this;
    }

    public final boolean values() {
        return (this.configure[0] & 1) != 0;
    }

    public JWSObject(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        } else {
            long[] jArr = new long[7];
            int i = 0;
            while (bigInteger.signum() != 0) {
                jArr[i] = bigInteger.longValue();
                bigInteger = bigInteger.shiftRight(64);
                i++;
            }
            long j = jArr[6];
            long j2 = j >>> 25;
            jArr[0] = jArr[0] ^ j2;
            jArr[1] = (j2 << 23) ^ jArr[1];
            jArr[6] = j & 33554431;
            this.configure = jArr;
        }
    }

    public JWSObject() {
        this.configure = new long[7];
    }

    public final boolean cleanup() {
        long[] jArr = this.configure;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean onCReqSuccess() {
        long[] jArr = this.configure;
        for (int i = 0; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final BigInteger cca_continue() {
        long[] jArr = this.configure;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                int i2 = (6 - i) << 3;
                setTextFontSize.init((int) (j >>> 32), bArr, i2);
                setTextFontSize.init((int) j, bArr, i2 + 4);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final merge cca_continue(merge merge) {
        long[] jArr = this.configure;
        long[] jArr2 = ((JWSObject) merge).configure;
        return new JWSObject(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    public final merge configure() {
        long[] jArr = this.configure;
        return new JWSObject(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    public final merge init(merge merge) {
        long[] jArr = new long[7];
        long[] jArr2 = new long[14];
        KeyLengthException.init(this.configure, ((JWSObject) merge).configure, jArr2);
        KeyLengthException.cca_continue(jArr2, jArr);
        return new JWSObject(jArr);
    }

    public final merge Cardinal(merge merge, merge merge2, merge merge3) {
        long[] jArr = this.configure;
        long[] jArr2 = ((JWSObject) merge).configure;
        long[] jArr3 = ((JWSObject) merge2).configure;
        long[] jArr4 = ((JWSObject) merge3).configure;
        long[] jArr5 = new long[13];
        KeyLengthException.configure(jArr, jArr2, jArr5);
        KeyLengthException.configure(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[7];
        KeyLengthException.cca_continue(jArr5, jArr6);
        return new JWSObject(jArr6);
    }

    public final merge getInstance(merge merge) {
        long[] jArr = new long[7];
        long[] jArr2 = new long[14];
        KeyLengthException.init(this.configure, ((JWSObject) merge.onValidated()).configure, jArr2);
        KeyLengthException.cca_continue(jArr2, jArr);
        return new JWSObject(jArr);
    }

    public final merge getInstance() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        KeyLengthException.init(this.configure, jArr2);
        KeyLengthException.cca_continue(jArr2, jArr);
        return new JWSObject(jArr);
    }

    public final merge configure(merge merge, merge merge2) {
        long[] jArr = this.configure;
        long[] jArr2 = ((JWSObject) merge).configure;
        long[] jArr3 = ((JWSObject) merge2).configure;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[13];
        KeyLengthException.init(jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        KeyLengthException.configure(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[7];
        KeyLengthException.cca_continue(jArr4, jArr6);
        return new JWSObject(jArr6);
    }

    public final merge init(int i) {
        if (i <= 0) {
            return this;
        }
        long[] jArr = new long[7];
        KeyLengthException.Cardinal(this.configure, i, jArr);
        return new JWSObject(jArr);
    }

    public final int CardinalError() {
        return ((int) this.configure[0]) & 1;
    }

    public final merge onValidated() {
        long[] jArr = new long[7];
        long[] jArr2 = this.configure;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 7) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[7];
            long[] jArr4 = new long[7];
            long[] jArr5 = new long[7];
            long[] jArr6 = new long[13];
            KeyLengthException.init(jArr2, jArr6);
            KeyLengthException.cca_continue(jArr6, jArr3);
            KeyLengthException.Cardinal(jArr3, 1, jArr4);
            long[] jArr7 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr7);
            KeyLengthException.cca_continue(jArr7, jArr3);
            KeyLengthException.Cardinal(jArr4, 1, jArr4);
            long[] jArr8 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr8);
            KeyLengthException.cca_continue(jArr8, jArr3);
            KeyLengthException.Cardinal(jArr3, 3, jArr4);
            long[] jArr9 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr9);
            KeyLengthException.cca_continue(jArr9, jArr3);
            KeyLengthException.Cardinal(jArr3, 6, jArr4);
            long[] jArr10 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr10);
            KeyLengthException.cca_continue(jArr10, jArr3);
            KeyLengthException.Cardinal(jArr3, 12, jArr4);
            long[] jArr11 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr11);
            KeyLengthException.cca_continue(jArr11, jArr5);
            KeyLengthException.Cardinal(jArr5, 24, jArr3);
            KeyLengthException.Cardinal(jArr3, 24, jArr4);
            long[] jArr12 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr12);
            KeyLengthException.cca_continue(jArr12, jArr3);
            KeyLengthException.Cardinal(jArr3, 48, jArr4);
            long[] jArr13 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr13);
            KeyLengthException.cca_continue(jArr13, jArr3);
            KeyLengthException.Cardinal(jArr3, 96, jArr4);
            long[] jArr14 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr14);
            KeyLengthException.cca_continue(jArr14, jArr3);
            KeyLengthException.Cardinal(jArr3, 192, jArr4);
            long[] jArr15 = new long[14];
            KeyLengthException.init(jArr3, jArr4, jArr15);
            KeyLengthException.cca_continue(jArr15, jArr3);
            long[] jArr16 = new long[14];
            KeyLengthException.init(jArr3, jArr5, jArr16);
            KeyLengthException.cca_continue(jArr16, jArr);
            return new JWSObject(jArr);
        }
        throw new IllegalStateException();
    }

    public final merge getWarnings() {
        long[] jArr = this.configure;
        long instance = EncryptedJWT.getInstance(jArr[0]);
        long instance2 = EncryptedJWT.getInstance(jArr[1]);
        long j = (instance & 4294967295L) | (instance2 << 32);
        long j2 = (instance >>> 32) | (instance2 & -4294967296L);
        long instance3 = EncryptedJWT.getInstance(jArr[2]);
        long instance4 = EncryptedJWT.getInstance(jArr[3]);
        long j3 = (instance3 & 4294967295L) | (instance4 << 32);
        long j4 = (instance3 >>> 32) | (instance4 & -4294967296L);
        long instance5 = EncryptedJWT.getInstance(jArr[4]);
        long instance6 = EncryptedJWT.getInstance(jArr[5]);
        long j5 = (instance5 >>> 32) | (instance6 & -4294967296L);
        long instance7 = EncryptedJWT.getInstance(jArr[6]);
        long j6 = instance7 & 4294967295L;
        long j7 = instance7 >>> 32;
        return new JWSObject(new long[]{j ^ (j2 << 44), (j3 ^ (j4 << 44)) ^ (j2 >>> 20), (((instance5 & 4294967295L) | (instance6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20), (((j7 << 44) ^ j6) ^ (j5 >>> 20)) ^ (j2 << 13), (j2 >>> 51) ^ ((j7 >>> 20) ^ (j4 << 13)), (j5 << 13) ^ (j4 >>> 51), (j5 >>> 51) ^ (j7 << 13)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JWSObject)) {
            return false;
        }
        long[] jArr = this.configure;
        long[] jArr2 = ((JWSObject) obj).configure;
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
