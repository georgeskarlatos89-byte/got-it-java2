package com.cardinalcommerce.a;

import java.math.BigInteger;

public interface AuthenticatedCipherText extends AAD {
    BigInteger[] getInstance(BigInteger bigInteger);
}
