package com.nimbusds.jose.util;

import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class X509CertUtils {
    private static final String PEM_BEGIN_MARKER = "-----BEGIN CERTIFICATE-----";
    private static final String PEM_END_MARKER = "-----END CERTIFICATE-----";

    public static X509Certificate parse(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            try {
                Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
                if (!(generateCertificate instanceof X509Certificate)) {
                    return null;
                }
                return (X509Certificate) generateCertificate;
            } catch (CertificateException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r2 = r2.substring(r1 + 27);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate parse(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x003d
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x000a
            goto L_0x003d
        L_0x000a:
            java.lang.String r1 = "-----BEGIN CERTIFICATE-----"
            int r1 = r2.indexOf(r1)
            if (r1 >= 0) goto L_0x0013
            return r0
        L_0x0013:
            int r1 = r1 + 27
            java.lang.String r2 = r2.substring(r1)
            java.lang.String r1 = "-----END CERTIFICATE-----"
            int r1 = r2.indexOf(r1)
            if (r1 >= 0) goto L_0x0022
            return r0
        L_0x0022:
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r0 = "\\s"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replaceAll(r0, r1)
            com.nimbusds.jose.util.Base64 r0 = new com.nimbusds.jose.util.Base64
            r0.<init>(r2)
            byte[] r2 = r0.decode()
            java.security.cert.X509Certificate r2 = parse((byte[]) r2)
            return r2
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.util.X509CertUtils.parse(java.lang.String):java.security.cert.X509Certificate");
    }

    public static String toPEMString(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("-----BEGIN CERTIFICATE-----\n");
        try {
            sb.append(Base64.encode(x509Certificate.getEncoded()).toString());
            sb.append("\n-----END CERTIFICATE-----");
            return sb.toString();
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    public static Base64URL computeSHA256Thumbprint(X509Certificate x509Certificate) {
        try {
            return Base64URL.encode(MessageDigest.getInstance("SHA-256").digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException | CertificateEncodingException unused) {
            return null;
        }
    }
}
