package com.cardinalcommerce.a;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;

public interface ECUtil extends EC5Util, DHPrivateKey {
    BigInteger getX();
}
