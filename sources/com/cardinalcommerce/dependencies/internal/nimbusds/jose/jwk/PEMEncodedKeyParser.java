package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.dependencies.internal.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

class PEMEncodedKeyParser {
    static {
        new JcaPEMKeyConverter();
    }

    private PEMEncodedKeyParser() {
    }
}
