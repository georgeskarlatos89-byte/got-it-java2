package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

public class X509CertificateObject implements AlgorithmParameterSpec {
    public toJSONString cca_continue;
    public JSONNavi configure;
    public BigInteger getInstance;
    public BigInteger getWarnings;
    public byte[] init;

    public X509CertificateObject(toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger) {
        this.cca_continue = tojsonstring;
        this.configure = jSONNavi.CardinalRenderType();
        this.getInstance = bigInteger;
        this.getWarnings = BigInteger.valueOf(1);
        this.init = null;
    }

    public X509CertificateObject(toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.cca_continue = tojsonstring;
        this.configure = jSONNavi.CardinalRenderType();
        this.getInstance = bigInteger;
        this.getWarnings = bigInteger2;
        this.init = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof X509CertificateObject)) {
            return false;
        }
        X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
        if (!this.cca_continue.configure(x509CertificateObject.cca_continue) || !this.configure.init(x509CertificateObject.configure)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.cca_continue.hashCode() ^ this.configure.hashCode();
    }
}
