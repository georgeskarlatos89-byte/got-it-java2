package com.braintreepayments.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PayPalPaymentIntent {
    public static final String AUTHORIZE = "authorize";
    public static final String ORDER = "order";
    public static final String SALE = "sale";
}
