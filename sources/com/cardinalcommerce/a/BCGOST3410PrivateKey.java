package com.cardinalcommerce.a;

import com.cardinalcommerce.a.SignatureSpi;
import java.math.BigInteger;

public final class BCGOST3410PrivateKey extends SignatureSpi.EdDSA {
    public BigInteger cca_continue;

    public BCGOST3410PrivateKey(BigInteger bigInteger, BCElGamalPrivateKey bCElGamalPrivateKey) {
        super(false, bCElGamalPrivateKey);
        this.cca_continue = bigInteger;
    }

    public final int hashCode() {
        return this.cca_continue.hashCode() ^ super.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof BCGOST3410PrivateKey) && ((BCGOST3410PrivateKey) obj).cca_continue.equals(this.cca_continue) && super.equals(obj);
    }
}
