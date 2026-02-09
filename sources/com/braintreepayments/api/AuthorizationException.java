package com.braintreepayments.api;

public class AuthorizationException extends Exception {
    AuthorizationException(String str) {
        super(str);
    }
}
