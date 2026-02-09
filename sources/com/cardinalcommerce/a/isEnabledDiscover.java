package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;

public final class isEnabledDiscover implements CardinalChallengeObserver {
    private boolean cca_continue;
    private KeyAgreementSpi.MQVwithSHA1KDF getInstance;
    private int init;

    public isEnabledDiscover(boolean z, int i, KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF) {
        this.cca_continue = z;
        this.init = i;
        this.getInstance = mQVwithSHA1KDF;
    }

    public final getThreeDSRequestorAppURL init() throws IOException {
        return this.getInstance.Cardinal(this.cca_continue, this.init);
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        try {
            return init();
        } catch (IOException e) {
            throw new isEnableDFSync(e.getMessage());
        }
    }
}
