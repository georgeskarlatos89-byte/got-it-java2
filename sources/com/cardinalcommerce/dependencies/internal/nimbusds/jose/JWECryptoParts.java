package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;

public final class JWECryptoParts {
    final Base64URL Cardinal;
    final Base64URL cca_continue;
    final Base64URL configure;
    final JWEHeader getInstance;
    final Base64URL init;

    public JWECryptoParts(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        this.getInstance = jWEHeader;
        this.Cardinal = base64URL;
        this.configure = base64URL2;
        if (base64URL3 != null) {
            this.cca_continue = base64URL3;
            this.init = base64URL4;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }
}
