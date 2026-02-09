package com.cardinalcommerce.a;

import com.cardinalcommerce.a.CipherSpi;
import java.math.BigInteger;

public final class GOSTUtil extends BCGOST3410PublicKey {
    public BigInteger configure;

    public GOSTUtil(BigInteger bigInteger, CipherSpi.PKCS1v1_5Padding pKCS1v1_5Padding) {
        super(true, pKCS1v1_5Padding);
        this.configure = bigInteger;
    }
}
