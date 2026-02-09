package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import java.math.BigInteger;

public final class hasFailure {
    private KeyPairGeneratorSpi.EdDSA Cardinal;
    private final IESCipher.ECIESwithAESCBC configure;
    private BigInteger init;

    public hasFailure() {
    }

    public hasFailure(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        this.configure = eCIESwithAESCBC;
    }

    public final void configure(GMCipherSpi.SM2withRMD sM2withRMD) {
        DigestSignatureSpi.MD2 md2 = (DigestSignatureSpi.MD2) sM2withRMD;
        this.Cardinal = (KeyPairGeneratorSpi.EdDSA) md2.Cardinal;
        byte[] bArr = md2.cca_continue;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        this.init = new BigInteger(1, bArr2);
    }

    public final byte[] cca_continue(GMCipherSpi.SM2withRMD sM2withRMD) {
        KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) sM2withRMD;
        KeyFactorySpi.EDDSA eddsa = this.Cardinal.Cardinal;
        if (eddsa.equals(xdh.Cardinal)) {
            BigInteger mod = eddsa.Cardinal.multiply(this.init).multiply(this.Cardinal.init).mod(eddsa.getInstance);
            JSONNavi init2 = appendElement.init(eddsa.cca_continue, xdh.configure);
            if (!init2.getString()) {
                JSONNavi CardinalRenderType = init2.Cardinal(mod).CardinalRenderType();
                if (!CardinalRenderType.getString()) {
                    BigInteger cca_continue = CardinalRenderType.onCReqSuccess().cca_continue();
                    BigInteger cca_continue2 = CardinalRenderType.getWarnings().cca_continue();
                    int i = cca_continue.toByteArray().length > 33 ? 64 : 32;
                    int i2 = i * 2;
                    byte[] bArr = new byte[i2];
                    byte[] instance = setCornerRadius.getInstance(i, cca_continue);
                    byte[] instance2 = setCornerRadius.getInstance(i, cca_continue2);
                    for (int i3 = 0; i3 != i; i3++) {
                        bArr[i3] = instance[(i - i3) - 1];
                    }
                    for (int i4 = 0; i4 != i; i4++) {
                        bArr[i + i4] = instance2[(i - i4) - 1];
                    }
                    this.configure.init(bArr, 0, i2);
                    byte[] bArr2 = new byte[this.configure.getInstance()];
                    this.configure.init(bArr2, 0);
                    return bArr2;
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECVKO public key has wrong domain parameters");
    }
}
