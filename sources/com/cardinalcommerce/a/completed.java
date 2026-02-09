package com.cardinalcommerce.a;

public final class completed extends setCCAImageUri {
    public final byte[] cca_continue;

    public completed(byte[] bArr) {
        super(false);
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.cca_continue = bArr2;
    }
}
