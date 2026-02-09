package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.PublicKey;

public interface IESUtil extends PKCS12BagAttributeCarrierImpl, PublicKey {
    BigInteger getInstance();
}
