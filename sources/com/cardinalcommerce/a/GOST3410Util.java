package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.PrivateKey;

public interface GOST3410Util extends DSAEncoder, PrivateKey {
    BigInteger Cardinal();
}
