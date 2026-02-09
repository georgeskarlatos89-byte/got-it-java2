package com.braintreepayments.api;

public class ServiceUnavailableException extends Exception {
    ServiceUnavailableException(String str) {
        super(str);
    }
}
