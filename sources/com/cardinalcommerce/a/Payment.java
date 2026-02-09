package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.io.IOException;

public final class Payment implements setThreeDSRequestorAppURL {
    private KeyAgreementSpi.MQVwithSHA1KDF cca_continue;

    public Payment(KeyAgreementSpi.MQVwithSHA1KDF mQVwithSHA1KDF) {
        this.cca_continue = mQVwithSHA1KDF;
    }

    public final getThreeDSRequestorAppURL init() throws IOException {
        return new getProcessorTransactionId(this.cca_continue.init());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        try {
            return init();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
