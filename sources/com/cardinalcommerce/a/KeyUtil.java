package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.PrivateKey;

public interface KeyUtil extends PKCS12BagAttributeCarrierImpl, PrivateKey {
    BigInteger configure();
}
