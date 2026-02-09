package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class AsymmetricKeyInfoConverter implements AlgorithmParameterSpec {
    public BigInteger Cardinal;
    public BigInteger configure;

    public AsymmetricKeyInfoConverter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.Cardinal = bigInteger;
        this.configure = bigInteger2;
    }
}
