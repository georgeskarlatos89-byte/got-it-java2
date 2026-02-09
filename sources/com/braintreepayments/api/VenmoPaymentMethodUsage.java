package com.braintreepayments.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface VenmoPaymentMethodUsage {
    public static final int MULTI_USE = 2;
    public static final int SINGLE_USE = 1;
}
