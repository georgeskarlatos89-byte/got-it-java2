package com.braintreepayments.api;

public class UnprocessableEntityException extends Exception {
    UnprocessableEntityException(String str) {
        super(str);
    }
}
