package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;

class ExtCRLException extends CRLException {
    private Throwable getInstance;

    ExtCRLException(String str, Throwable th) {
        super(str);
        this.getInstance = th;
    }

    public Throwable getCause() {
        return this.getInstance;
    }
}
