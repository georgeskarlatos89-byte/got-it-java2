package com.cardinalcommerce.a;

public final class cancelled extends setCCAImageUri {
    public byte[] Cardinal;
    public int configure;

    public cancelled(int i, byte[] bArr) {
        super(false);
        int i2;
        byte[] bArr2;
        int length = bArr.length;
        if (i == 0) {
            i2 = 1504;
        } else if (i == 1) {
            i2 = 2976;
        } else if (i == 2) {
            i2 = 3104;
        } else if (i == 3) {
            i2 = 14880;
        } else if (i == 4) {
            i2 = 39712;
        } else {
            throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
        }
        if (length == i2) {
            this.configure = i;
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            this.Cardinal = bArr2;
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }
}
