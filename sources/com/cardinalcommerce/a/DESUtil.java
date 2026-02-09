package com.cardinalcommerce.a;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;
import java.security.Principal;

public final class DESUtil extends DSASigner.dsaSha3_256 implements Principal {
    public DESUtil(KeyAgreementSpi.MQVwithSHA384KDF mQVwithSHA384KDF) {
        super((isEnableLogging) mQVwithSHA384KDF.onCReqSuccess());
    }

    public final byte[] getEncoded() {
        try {
            return configure("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public final String getName() {
        return toString();
    }
}
