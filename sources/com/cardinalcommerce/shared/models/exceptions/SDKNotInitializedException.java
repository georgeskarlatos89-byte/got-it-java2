package com.cardinalcommerce.shared.models.exceptions;

public class SDKNotInitializedException extends RuntimeException {
    private final String configure;
    private final Throwable init;

    public String getMessage() {
        return this.configure;
    }

    public Throwable getCause() {
        return this.init;
    }

    public SDKNotInitializedException(String str, Throwable th) {
        this.configure = str;
        this.init = th;
    }

    public SDKNotInitializedException(RuntimeException runtimeException) {
        this.configure = runtimeException.getMessage();
        this.init = runtimeException.getCause();
    }
}
