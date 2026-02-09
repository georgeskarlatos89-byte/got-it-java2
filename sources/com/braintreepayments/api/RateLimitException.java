package com.braintreepayments.api;

public class RateLimitException extends Exception {
    RateLimitException(String str) {
        super(str);
    }
}
