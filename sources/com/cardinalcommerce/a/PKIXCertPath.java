package com.cardinalcommerce.a;

import java.security.spec.KeySpec;

public class PKIXCertPath implements KeySpec {
    public X509CertificateObject Cardinal;

    protected PKIXCertPath(X509CertificateObject x509CertificateObject) {
        this.Cardinal = x509CertificateObject;
    }
}
