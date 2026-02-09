package com.braintreepayments.api;

import java.util.List;

public interface GetPaymentMethodNoncesCallback {
    void onResult(List<PaymentMethodNonce> list, Exception exc);
}
