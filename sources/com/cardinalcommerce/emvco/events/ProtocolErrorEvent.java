package com.cardinalcommerce.emvco.events;

import com.cardinalcommerce.shared.models.ErrorMessage;

public class ProtocolErrorEvent extends ThreeDSEvent {
    private final ErrorMessage cca_continue;
    private final String getInstance;

    public ProtocolErrorEvent(String str, ErrorMessage errorMessage) {
        this.cca_continue = errorMessage;
        this.getInstance = str;
    }

    public String getSDKTransactionID() {
        return this.getInstance;
    }

    public ErrorMessage getErrorMessage() {
        return this.cca_continue;
    }
}
