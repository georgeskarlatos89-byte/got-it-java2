package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import java.math.BigInteger;

public final class BCElGamalPrivateKey implements GMCipherSpi.SM2withRMD {
    public int cca_continue;
    public BigInteger getInstance;
    public BigInteger init;

    public BCElGamalPrivateKey(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public BCElGamalPrivateKey(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.getInstance = bigInteger2;
        this.init = bigInteger;
        this.cca_continue = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BCElGamalPrivateKey)) {
            return false;
        }
        BCElGamalPrivateKey bCElGamalPrivateKey = (BCElGamalPrivateKey) obj;
        if (!bCElGamalPrivateKey.init.equals(this.init) || !bCElGamalPrivateKey.getInstance.equals(this.getInstance) || bCElGamalPrivateKey.cca_continue != this.cca_continue) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.init.hashCode() ^ this.getInstance.hashCode()) + this.cca_continue;
    }
}
