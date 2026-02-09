package com.braintreepayments.api;

import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import java.util.Collection;

public interface GooglePayGetTokenizationParametersCallback {
    void onResult(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, Collection<Integer> collection);
}
