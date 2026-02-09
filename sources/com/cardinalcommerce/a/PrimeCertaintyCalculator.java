package com.cardinalcommerce.a;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;

public interface PrimeCertaintyCalculator extends EC5Util, DHPublicKey {
    BigInteger getY();
}
