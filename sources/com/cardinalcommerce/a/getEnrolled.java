package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;

public final class getEnrolled implements CardinalChallengeObserver {
    private final int Cardinal;
    private final KeyAgreementSpi.MQVwithSHA1KDF configure;

    public getEnrolled(int i, KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF) {
        this.Cardinal = i;
        this.configure = mQVwithSHA1KDF;
    }

    public final getThreeDSRequestorAppURL init() throws IOException {
        return new getJSON(this.Cardinal, this.configure.init());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        try {
            return init();
        } catch (IOException e) {
            throw new isEnableDFSync(e.getMessage(), e);
        }
    }
}
