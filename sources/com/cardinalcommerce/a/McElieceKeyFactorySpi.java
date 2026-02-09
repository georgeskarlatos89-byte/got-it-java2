package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.spec.KeySpec;

public class McElieceKeyFactorySpi implements KeySpec {
    public BigInteger Cardinal;
    public BigInteger cca_continue;
    public BigInteger getInstance;
    public BigInteger init;

    public McElieceKeyFactorySpi(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.Cardinal = bigInteger;
        this.cca_continue = bigInteger2;
        this.init = bigInteger3;
        this.getInstance = bigInteger4;
    }
}
