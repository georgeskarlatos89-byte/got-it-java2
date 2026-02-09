package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.lang.reflect.Array;

public final class getCause extends SDKAlreadyInitializedException {
    private int Cardinal;
    private int[][] getInstance;

    public getCause(int i, int[][] iArr) {
        if (iArr[0].length == ((i + 31) >> 5)) {
            this.configure = i;
            this.init = iArr.length;
            this.Cardinal = iArr[0].length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.init; i4++) {
                int[] iArr2 = iArr[i4];
                int i5 = this.Cardinal - 1;
                iArr2[i5] = iArr2[i5] & i3;
            }
            this.getInstance = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public getCause(byte[] bArr) {
        if (bArr.length >= 9) {
            this.init = KeyAgreementSpi.MQVwithSHA1KDF.cca_continue(bArr, 0);
            this.configure = KeyAgreementSpi.MQVwithSHA1KDF.cca_continue(bArr, 4);
            int i = ((this.configure + 7) >>> 3) * this.init;
            if (this.init > 0) {
                int i2 = 8;
                if (i == bArr.length - 8) {
                    this.Cardinal = (this.configure + 31) >>> 5;
                    int i3 = this.init;
                    int[] iArr = new int[2];
                    iArr[1] = this.Cardinal;
                    iArr[0] = i3;
                    this.getInstance = (int[][]) Array.newInstance(Integer.TYPE, iArr);
                    int i4 = this.configure >> 5;
                    int i5 = this.configure & 31;
                    for (int i6 = 0; i6 < this.init; i6++) {
                        int i7 = 0;
                        while (i7 < i4) {
                            this.getInstance[i6][i7] = KeyAgreementSpi.MQVwithSHA1KDF.cca_continue(bArr, i2);
                            i7++;
                            i2 += 4;
                        }
                        int i8 = 0;
                        while (i8 < i5) {
                            int[] iArr2 = this.getInstance[i6];
                            iArr2[i4] = ((bArr[i2] & 255) << i8) ^ iArr2[i4];
                            i8 += 8;
                            i2++;
                        }
                    }
                    return;
                }
            }
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getCause)) {
            return false;
        }
        getCause getcause = (getCause) obj;
        if (this.init != getcause.init || this.configure != getcause.configure || this.Cardinal != getcause.Cardinal) {
            return false;
        }
        for (int i = 0; i < this.init; i++) {
            if (!KeyAgreementSpi.MQVwithSHA1KDF.init(this.getInstance[i], getcause.getInstance[i])) {
                return false;
            }
        }
        return true;
    }

    public final byte[] getInstance() {
        int i = 8;
        byte[] bArr = new byte[((((this.configure + 7) >>> 3) * this.init) + 8)];
        KeyAgreementSpi.MQVwithSHA1KDF.configure(this.init, bArr, 0);
        KeyAgreementSpi.MQVwithSHA1KDF.configure(this.configure, bArr, 4);
        int i2 = this.configure >>> 5;
        int i3 = this.configure & 31;
        for (int i4 = 0; i4 < this.init; i4++) {
            int i5 = 0;
            while (i5 < i2) {
                KeyAgreementSpi.MQVwithSHA1KDF.configure(this.getInstance[i4][i5], bArr, i);
                i5++;
                i += 4;
            }
            int i6 = 0;
            while (i6 < i3) {
                bArr[i] = (byte) (this.getInstance[i4][i2] >>> i6);
                i6 += 8;
                i++;
            }
        }
        return bArr;
    }

    public final int hashCode() {
        int i = (((this.init * 31) + this.configure) * 31) + this.Cardinal;
        for (int i2 = 0; i2 < this.init; i2++) {
            i = (i * 31) + getBackgroundColor.init(this.getInstance[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.configure & 31;
        int i2 = this.Cardinal;
        if (i != 0) {
            i2--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.init; i3++) {
            stringBuffer.append(new StringBuilder().append(i3).append(": ").toString());
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.getInstance[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.getInstance[i3][this.Cardinal - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append(10);
        }
        return stringBuffer.toString();
    }

    public getCause(getCause getcause) {
        this.configure = getcause.Cardinal();
        this.init = getcause.cca_continue();
        this.Cardinal = getcause.Cardinal;
        this.getInstance = new int[getcause.getInstance.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.getInstance;
            if (i < iArr.length) {
                int[] iArr2 = getcause.getInstance[i];
                int[] iArr3 = new int[iArr2.length];
                System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
                iArr[i] = iArr3;
                i++;
            } else {
                return;
            }
        }
    }
}
