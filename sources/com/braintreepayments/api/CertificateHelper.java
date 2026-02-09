package com.braintreepayments.api;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

class CertificateHelper {
    CertificateHelper() {
    }

    /* access modifiers changed from: package-private */
    public byte[] getEncodedCertificate(byte[] bArr) throws CertificateException {
        return ((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(bArr))).getEncoded();
    }
}
