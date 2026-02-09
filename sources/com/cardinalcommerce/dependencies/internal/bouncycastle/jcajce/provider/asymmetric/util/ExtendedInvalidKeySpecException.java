package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {
    private Throwable cca_continue;

    public ExtendedInvalidKeySpecException(String str, Throwable th) {
        super(str);
        this.cca_continue = th;
    }

    public Throwable getCause() {
        return this.cca_continue;
    }
}
