package com.cardinalcommerce.shared.models.exceptions;

public class InvalidInputException extends RuntimeException {
    private final String Cardinal;
    private final Throwable getInstance;

    public String getMessage() {
        return this.Cardinal;
    }

    public Throwable getCause() {
        return this.getInstance;
    }

    public InvalidInputException(String str, Throwable th) {
        this.Cardinal = str;
        this.getInstance = th;
    }

    public InvalidInputException(RuntimeException runtimeException) {
        this.Cardinal = runtimeException.getMessage();
        this.getInstance = runtimeException.getCause();
    }
}
