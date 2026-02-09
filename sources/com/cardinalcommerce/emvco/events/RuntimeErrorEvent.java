package com.cardinalcommerce.emvco.events;

public class RuntimeErrorEvent extends ThreeDSEvent {
    private String cca_continue;
    private String configure;

    public RuntimeErrorEvent(String str) {
        this.configure = str;
    }

    public RuntimeErrorEvent(String str, String str2) {
        this.cca_continue = str;
        this.configure = str2;
    }

    public String getErrorCode() {
        return this.cca_continue;
    }

    public void setErrorCode(String str) {
        this.cca_continue = str;
    }

    public String getErrorMessage() {
        return this.configure;
    }

    public void setErrorMessage(String str) {
        this.configure = str;
    }
}
