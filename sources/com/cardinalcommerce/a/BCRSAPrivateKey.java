package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import java.math.BigInteger;

public final class BCRSAPrivateKey extends BCGOST3410PublicKey {
    public BigInteger getInstance;

    public BCRSAPrivateKey(BigInteger bigInteger, CipherSpi.PKCS1v1_5Padding pKCS1v1_5Padding) {
        super(false, pKCS1v1_5Padding);
        this.getInstance = bigInteger;
    }
}
