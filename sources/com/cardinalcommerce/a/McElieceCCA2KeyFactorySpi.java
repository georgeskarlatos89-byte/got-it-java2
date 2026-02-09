package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class McElieceCCA2KeyFactorySpi implements KeySpec {
    public BigInteger Cardinal;
    public BigInteger cca_continue;
    public BigInteger getInstance;
    public BigInteger init;

    public McElieceCCA2KeyFactorySpi(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.cca_continue = bigInteger;
        this.init = bigInteger2;
        this.getInstance = bigInteger3;
        this.Cardinal = bigInteger4;
    }
}
