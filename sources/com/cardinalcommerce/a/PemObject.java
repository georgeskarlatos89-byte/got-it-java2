package com.cardinalcommerce.a;

import java.security.spec.EncodedKeySpec;

public class PemObject extends EncodedKeySpec {
    private final String configure;

    public PemObject(byte[] bArr) {
        super(bArr);
        String str;
        byte b = bArr[0];
        if (b == 48) {
            str = "ASN.1";
        } else if (b == 111) {
            str = "OpenSSH";
        } else {
            throw new IllegalArgumentException("unknown byte encoding");
        }
        this.configure = str;
    }

    public String getFormat() {
        return this.configure;
    }
}
