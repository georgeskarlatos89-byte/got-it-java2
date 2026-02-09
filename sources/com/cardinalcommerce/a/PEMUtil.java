package com.cardinalcommerce.a;

import java.math.BigInteger;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;

public interface PEMUtil extends Key {

    public final class Boundaries extends X509CertificateObject {
        public String Cardinal;

        public Boundaries(String str, toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
            super(tojsonstring, jSONNavi, bigInteger, bigInteger2, bArr);
            this.Cardinal = str;
        }
    }

    PublicKey getInstance();

    PrivateKey init();
}
