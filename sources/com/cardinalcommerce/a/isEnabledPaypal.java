package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;

public final class isEnabledPaypal implements setThreeDSRequestorAppURL {
    private KeyAgreementSpi.MQVwithSHA1KDF getInstance;

    public isEnabledPaypal(KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF) {
        this.getInstance = mQVwithSHA1KDF;
    }

    public final getThreeDSRequestorAppURL init() throws IOException {
        return new getPaResStatus(this.getInstance.init());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        try {
            return init();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
