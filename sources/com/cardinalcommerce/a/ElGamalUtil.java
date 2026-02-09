package com.cardinalcommerce.a;

import com.cardinalcommerce.a.SignatureSpi;
import java.math.BigInteger;

public final class ElGamalUtil extends SignatureSpi.EdDSA {
    public BigInteger init;

    public ElGamalUtil(BigInteger bigInteger, BCElGamalPrivateKey bCElGamalPrivateKey) {
        super(true, bCElGamalPrivateKey);
        this.init = bigInteger;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ElGamalUtil) && ((ElGamalUtil) obj).init.equals(this.init)) {
            return super.equals(obj);
        }
        return false;
    }

    public final int hashCode() {
        return this.init.hashCode();
    }
}
