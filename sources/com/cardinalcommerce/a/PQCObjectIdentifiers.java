package com.cardinalcommerce.a;

public class PQCObjectIdentifiers extends PKIXCertPath {
    public JSONNavi cca_continue;

    public PQCObjectIdentifiers(JSONNavi jSONNavi, X509CertificateObject x509CertificateObject) {
        super(x509CertificateObject);
        if (jSONNavi.configure() != null) {
            this.cca_continue = jSONNavi.CardinalRenderType();
        } else {
            this.cca_continue = jSONNavi;
        }
    }
}
