package com.cardinalcommerce.shared.models.exceptions;

public class SDKRuntimeException extends RuntimeException {
    private final Throwable configure;
    private final String init;

    public String getMessage() {
        return this.init;
    }

    public Throwable getCause() {
        return this.configure;
    }

    public SDKRuntimeException(String str, Throwable th) {
        this.init = str;
        this.configure = th;
    }

    public SDKRuntimeException(RuntimeException runtimeException) {
        this.init = runtimeException.getMessage();
        this.configure = runtimeException.getCause();
    }
}
