package com.braintreepayments.api;

import java.util.List;

interface GetSupportedPaymentMethodsCallback {
    void onResult(List<DropInPaymentMethod> list, Exception exc);
}
