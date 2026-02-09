package com.cardinalcommerce.a;

import com.cardinalcommerce.a.SignatureSpi;
import java.math.BigInteger;
import java.security.SecureRandom;

public final class BCECGOST3410PrivateKey {
    public SecureRandom Cardinal;
    public int configure;
    public int getInstance;

    public final BCElGamalPrivateKey Cardinal() {
        BigInteger[] Cardinal2 = SignatureSpi.ecDetDSA384.Cardinal(this.configure, this.getInstance, this.Cardinal);
        BigInteger bigInteger = Cardinal2[0];
        BigInteger bigInteger2 = Cardinal2[1];
        return new BCElGamalPrivateKey(bigInteger, SignatureSpi.ecDetDSA384.init(bigInteger, this.Cardinal));
    }
}
