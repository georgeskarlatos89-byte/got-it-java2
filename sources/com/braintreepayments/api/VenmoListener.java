package com.braintreepayments.api;

public interface VenmoListener {
    void onVenmoFailure(Exception exc);

    void onVenmoSuccess(VenmoAccountNonce venmoAccountNonce);
}
