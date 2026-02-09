package com.cardinalcommerce.shared.models.exceptions;

public class SDKAlreadyInitializedException extends RuntimeException {
    private final String Cardinal;
    private final Throwable configure;

    public String getMessage() {
        return this.Cardinal;
    }

    public Throwable getCause() {
        return this.configure;
    }

    public SDKAlreadyInitializedException(String str, Throwable th) {
        this.Cardinal = str;
        this.configure = th;
    }
}
