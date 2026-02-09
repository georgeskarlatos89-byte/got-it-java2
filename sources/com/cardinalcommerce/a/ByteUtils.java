package com.cardinalcommerce.a;

import java.math.BigInteger;

public abstract class ByteUtils {
    private static Base64 Cardinal = new Container(BigInteger.valueOf(2));
    private static Base64 configure = new Container(BigInteger.valueOf(3));

    public static CompletionEvent Cardinal(int[] iArr) {
        if (iArr[0] == 0) {
            int i = 1;
            while (i < iArr.length) {
                if (iArr[i] > iArr[i - 1]) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
                }
            }
            return new PEMEncodedKeyParser(Cardinal, new JWK(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }

    public static Base64 init(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return Cardinal;
            }
            if (intValue == 3) {
                return configure;
            }
        }
        return new Container(bigInteger);
    }
}
