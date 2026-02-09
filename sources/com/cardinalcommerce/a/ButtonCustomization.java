package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;

public final class ButtonCustomization {
    private int[] Cardinal;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ButtonCustomization)) {
            return false;
        }
        return KeyAgreementSpi.MQVwithSHA1KDF.init(this.Cardinal, ((ButtonCustomization) obj).Cardinal);
    }

    public final int hashCode() {
        return getBackgroundColor.init(this.Cardinal);
    }

    public final String toString() {
        String obj = new StringBuilder("[").append(this.Cardinal[0]).toString();
        for (int i = 1; i < this.Cardinal.length; i++) {
            obj = new StringBuilder().append(obj).append(", ").append(this.Cardinal[i]).toString();
        }
        return new StringBuilder().append(obj).append("]").toString();
    }

    public ButtonCustomization(byte[] bArr) {
        if (bArr.length > 4) {
            boolean z = false;
            int cca_continue = KeyAgreementSpi.MQVwithSHA1KDF.cca_continue(bArr, 0);
            int Cardinal2 = getValue.Cardinal(cca_continue - 1);
            if (bArr.length == (cca_continue * Cardinal2) + 4) {
                this.Cardinal = new int[cca_continue];
                for (int i = 0; i < cca_continue; i++) {
                    int[] iArr = this.Cardinal;
                    int i2 = (i * Cardinal2) + 4;
                    int i3 = 0;
                    for (int i4 = Cardinal2 - 1; i4 >= 0; i4--) {
                        i3 |= (bArr[i2 + i4] & 255) << (i4 << 3);
                    }
                    iArr[i] = i3;
                }
                int[] iArr2 = this.Cardinal;
                int length = iArr2.length;
                boolean[] zArr = new boolean[length];
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        int i6 = iArr2[i5];
                        if (i6 < 0 || i6 >= length || zArr[i6]) {
                            break;
                        }
                        zArr[i6] = true;
                        i5++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new IllegalArgumentException("invalid encoding");
                }
                return;
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    public final byte[] init() {
        int length = this.Cardinal.length;
        int Cardinal2 = getValue.Cardinal(length - 1);
        byte[] bArr = new byte[((length * Cardinal2) + 4)];
        KeyAgreementSpi.MQVwithSHA1KDF.configure(length, bArr, 0);
        for (int i = 0; i < length; i++) {
            int i2 = this.Cardinal[i];
            int i3 = (i * Cardinal2) + 4;
            for (int i4 = Cardinal2 - 1; i4 >= 0; i4--) {
                bArr[i3 + i4] = (byte) (i2 >>> (i4 << 3));
            }
        }
        return bArr;
    }
}
