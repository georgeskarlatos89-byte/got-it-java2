package com.cardinalcommerce.a;

public final class BCElGamalPublicKey extends setCCAImageUri {
    public final byte[] configure;

    public BCElGamalPublicKey(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.configure = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 57);
    }

    public final byte[] getEncoded() {
        byte[] bArr = this.configure;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
