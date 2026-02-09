package com.braintreepayments.api;

public class UnexpectedException extends Exception {
    UnexpectedException(String str) {
        super(str);
    }

    UnexpectedException(String str, Throwable th) {
        super(str, th);
    }
}
