package com.cardinalcommerce.a;

import java.math.BigInteger;

public class X509SignatureUtil extends PKIXCertPath {
    public BigInteger configure;

    public X509SignatureUtil(BigInteger bigInteger, X509CertificateObject x509CertificateObject) {
        super(x509CertificateObject);
        this.configure = bigInteger;
    }
}
