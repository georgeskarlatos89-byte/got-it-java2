package com.cardinalcommerce.a;

import java.math.BigInteger;

public class NHKeyFactorySpi {
    public BigInteger configure;
    public BigInteger getInstance;
    public BigInteger init;

    public NHKeyFactorySpi(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.init = bigInteger;
        this.getInstance = bigInteger2;
        this.configure = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof NHKeyFactorySpi) {
            NHKeyFactorySpi nHKeyFactorySpi = (NHKeyFactorySpi) obj;
            return this.configure.equals(nHKeyFactorySpi.configure) && this.init.equals(nHKeyFactorySpi.init) && this.getInstance.equals(nHKeyFactorySpi.getInstance);
        }
    }

    public int hashCode() {
        return (this.configure.hashCode() ^ this.init.hashCode()) ^ this.getInstance.hashCode();
    }
}
