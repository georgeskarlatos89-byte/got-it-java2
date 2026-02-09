package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;

public final class getTextFontName implements GMCipherSpi.SM2withRMD {
    public KeyAgreementSpi.X25519withSHA256KDF cca_continue;
    public KeyAgreementSpi.X25519withSHA256KDF getInstance;

    public getTextFontName() {
    }

    public getTextFontName(KeyAgreementSpi.X25519withSHA256KDF x25519withSHA256KDF, KeyAgreementSpi.X25519withSHA256KDF x25519withSHA256KDF2) {
        if (x25519withSHA256KDF == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        } else if (x25519withSHA256KDF2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        } else if (x25519withSHA256KDF.Cardinal.equals(x25519withSHA256KDF2.Cardinal)) {
            this.getInstance = x25519withSHA256KDF;
            this.cca_continue = x25519withSHA256KDF2;
        } else {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
    }
}
