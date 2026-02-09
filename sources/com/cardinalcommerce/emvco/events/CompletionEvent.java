package com.cardinalcommerce.emvco.events;

public class CompletionEvent extends ThreeDSEvent {
    private final String Cardinal;
    private final String configure;

    public CompletionEvent(String str, String str2) {
        this.Cardinal = str;
        this.configure = str2;
    }

    public String getSDKTransactionID() {
        return this.Cardinal;
    }

    public String getTransactionStatus() {
        return this.configure;
    }
}
