package com.braintreepayments.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface BrowserSwitchStatus {
    public static final int CANCELED = 2;
    public static final int SUCCESS = 1;
}
