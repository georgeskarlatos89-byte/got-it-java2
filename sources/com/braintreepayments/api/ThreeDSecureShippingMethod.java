package com.braintreepayments.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ThreeDSecureShippingMethod {
    public static final int ELECTRONIC_DELIVERY = 5;
    public static final int EXPEDITED = 2;
    public static final int GROUND = 4;
    public static final int PRIORITY = 3;
    public static final int SAME_DAY = 1;
    public static final int SHIP_TO_STORE = 6;
}
