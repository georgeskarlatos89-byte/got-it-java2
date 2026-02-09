package com.braintreepayments.api;

public class UnionPayEnrollment {
    private final String id;
    private final boolean smsCodeRequired;

    UnionPayEnrollment(String str, boolean z) {
        this.id = str;
        this.smsCodeRequired = z;
    }

    public String getId() {
        return this.id;
    }

    public boolean isSmsCodeRequired() {
        return this.smsCodeRequired;
    }
}
