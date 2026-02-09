package com.cardinalcommerce.a;

import java.security.spec.AlgorithmParameterSpec;

public class XMSSMTKeyFactorySpi implements AlgorithmParameterSpec {
    public int Cardinal;
    public byte[] cca_continue;
    public boolean cleanup;
    public byte[] configure;
    public byte[] getInstance;
    public int init;

    public XMSSMTKeyFactorySpi(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, bArr2, i, -1, (byte[]) null, (byte) 0);
    }

    public XMSSMTKeyFactorySpi(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, (byte) 0);
    }

    private XMSSMTKeyFactorySpi(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, byte b) {
        byte[] bArr4 = null;
        if (bArr != null) {
            byte[] bArr5 = new byte[bArr.length];
            this.cca_continue = bArr5;
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        } else {
            this.cca_continue = null;
        }
        if (bArr2 != null) {
            byte[] bArr6 = new byte[bArr2.length];
            this.getInstance = bArr6;
            System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
        } else {
            this.getInstance = null;
        }
        this.init = i;
        this.Cardinal = i2;
        if (bArr3 != null) {
            bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        }
        this.configure = bArr4;
        this.cleanup = false;
    }
}
