package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;

public final class setDeviceFingerprintUrl implements CardinalConfigurationParameters, EdEC {
    private KeyAgreementSpi.MQVwithSHA1KDF cca_continue;

    public setDeviceFingerprintUrl(KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF) {
        this.cca_continue = mQVwithSHA1KDF;
    }

    public final getThreeDSRequestorAppURL init() throws IOException {
        try {
            return new DH(this.cca_continue.init());
        } catch (IllegalArgumentException e) {
            throw new setProxyAddress(e.getMessage(), e);
        }
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        try {
            return init();
        } catch (IOException e) {
            throw new isEnableDFSync("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new isEnableDFSync("unable to get DER object", e2);
        }
    }
}
