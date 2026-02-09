package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;

public final class BCRSAPublicKey implements GMCipherSpi.SM2withRMD {
    public KeyPairGeneratorSpi.XDH configure;
    public KeyPairGeneratorSpi.XDH getInstance;

    public BCRSAPublicKey(KeyPairGeneratorSpi.XDH xdh, KeyPairGeneratorSpi.XDH xdh2) {
        if (xdh == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        } else if (xdh2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        } else if (xdh.Cardinal.equals(xdh2.Cardinal)) {
            this.configure = xdh;
            this.getInstance = xdh2;
        } else {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
    }
}
