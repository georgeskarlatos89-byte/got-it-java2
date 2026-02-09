package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.XMSSMTKeyFactorySpi;

public class IESUtil {
    public static XMSSMTKeyFactorySpi cca_continue(GMCipherSpi.SM2withSha1 sM2withSha1, byte[] bArr) {
        if (sM2withSha1 == null) {
            return new XMSSMTKeyFactorySpi((byte[]) null, (byte[]) null, 128);
        }
        GMCipherSpi.SM2withSha256 cca_continue = sM2withSha1.cca_continue();
        return (cca_continue.cca_continue().equals("DES") || cca_continue.cca_continue().equals("RC2") || cca_continue.cca_continue().equals("RC5-32") || cca_continue.cca_continue().equals("RC5-64")) ? new XMSSMTKeyFactorySpi((byte[]) null, (byte[]) null, 64, 64, bArr) : cca_continue.cca_continue().equals("SKIPJACK") ? new XMSSMTKeyFactorySpi((byte[]) null, (byte[]) null, 80, 80, bArr) : cca_continue.cca_continue().equals("GOST28147") ? new XMSSMTKeyFactorySpi((byte[]) null, (byte[]) null, 256, 256, bArr) : new XMSSMTKeyFactorySpi((byte[]) null, (byte[]) null, 128, 128, bArr);
    }
}
