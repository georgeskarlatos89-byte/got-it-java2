package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.google.common.base.Ascii;

public final class DirectoryServerID {
    public int Cardinal = 0;
    public int getInstance;

    public final boolean Cardinal(int i) {
        int i2 = this.Cardinal;
        return i2 == 31 ? i >= 0 : i >= 0 && i < (1 << i2);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof DirectoryServerID)) {
            DirectoryServerID directoryServerID = (DirectoryServerID) obj;
            return this.Cardinal == directoryServerID.Cardinal && this.getInstance == directoryServerID.getInstance;
        }
    }

    public final int hashCode() {
        return this.getInstance;
    }

    public DirectoryServerID(byte[] bArr) {
        if (bArr.length == 4) {
            byte b = ((bArr[3] & 255) << Ascii.CAN) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << Ascii.DLE);
            this.getInstance = b;
            if (KeyAgreementSpi.MQVwithSHA1KDF.cca_continue((int) b)) {
                int i = -1;
                for (int i2 = this.getInstance; i2 != 0; i2 >>>= 1) {
                    i++;
                }
                this.Cardinal = i;
                return;
            }
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        throw new IllegalArgumentException("byte array is not an encoded finite field");
    }

    public final int getInstance(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = getInstance(i, (1 << this.Cardinal) - 2);
            i2 = -i2;
        }
        int i3 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i3 = KeyAgreementSpi.MQVwithSHA1KDF.getInstance(i3, i, this.getInstance);
            }
            i = KeyAgreementSpi.MQVwithSHA1KDF.getInstance(i, i, this.getInstance);
            i2 >>>= 1;
        }
        return i3;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Finite Field GF(2^").append(this.Cardinal).append(") = GF(2)[X]/<");
        int i = this.getInstance;
        if (i == 0) {
            str = "0";
        } else {
            String str2 = ((byte) (i & 1)) == 1 ? "1" : "";
            int i2 = i >>> 1;
            int i3 = 1;
            while (i2 != 0) {
                if (((byte) (i2 & 1)) == 1) {
                    str2 = new StringBuilder().append(str2).append("+x^").append(i3).toString();
                }
                i2 >>>= 1;
                i3++;
            }
            str = str2;
        }
        return append.append(str).append("> ").toString();
    }
}
