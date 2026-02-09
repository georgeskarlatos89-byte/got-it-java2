package com.cardinalcommerce.a;

import java.math.BigInteger;

final class Container implements Base64 {
    private BigInteger init;

    Container(BigInteger bigInteger) {
        this.init = bigInteger;
    }

    public final int Cardinal() {
        return 1;
    }

    public final BigInteger configure() {
        return this.init;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Container)) {
            return false;
        }
        return this.init.equals(((Container) obj).init);
    }

    public final int hashCode() {
        return this.init.hashCode();
    }
}
