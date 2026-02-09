package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;

public final class getSignatureVerification implements setLocationDataConsentGiven {
    private KeyAgreementSpi.MQVwithSHA1KDF configure;

    public getSignatureVerification(KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF) {
        this.configure = mQVwithSHA1KDF;
    }

    public final getThreeDSRequestorAppURL init() throws IOException {
        return new setEnabledDiscover(this.configure.init());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        try {
            return init();
        } catch (IOException e) {
            throw new isEnableDFSync(e.getMessage(), e);
        }
    }
}
