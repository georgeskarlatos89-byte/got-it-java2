package com.cardinalcommerce.a;

public final class ThreeDS2Service extends runtimeError {
    public final byte[] configure;

    public ThreeDS2Service(byte[] bArr, String str) {
        super(false, str);
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.configure = bArr2;
    }
}
