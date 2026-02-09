package com.cardinalcommerce.shared.models;

public class ErrorMessage {
    private String Cardinal;
    private String cca_continue;
    private String configure;
    private String init;

    public ErrorMessage(String str, String str2, String str3, String str4) {
        this.Cardinal = str2;
        this.configure = str3;
        this.init = str4;
        this.cca_continue = str;
    }

    public ErrorMessage() {
    }

    public String getTransactionID() {
        return this.cca_continue;
    }

    public String getErrorCode() {
        return this.Cardinal;
    }

    public String getErrorDescription() {
        return this.configure;
    }

    public String getErrorDetails() {
        return this.init;
    }
}
