package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

public final class AuthenticatedCipherText {
    public final byte[] configure;
    public final byte[] init;

    public AuthenticatedCipherText(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            this.configure = bArr;
            if (bArr2 != null) {
                this.init = bArr2;
                return;
            }
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }
}
