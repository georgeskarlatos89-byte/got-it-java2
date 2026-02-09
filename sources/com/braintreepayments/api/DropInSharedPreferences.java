package com.braintreepayments.api;

import android.content.Context;

class DropInSharedPreferences {
    private static volatile DropInSharedPreferences INSTANCE = null;
    private static final String LAST_USED_PAYMENT_METHOD = "com.braintreepayments.api.dropin.LAST_USED_PAYMENT_METHOD";
    private final BraintreeSharedPreferences braintreeSharedPreferences;
    private final PaymentMethodInspector paymentMethodInspector;

    static DropInSharedPreferences getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (DropInSharedPreferences.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DropInSharedPreferences(context);
                }
            }
        }
        return INSTANCE;
    }

    private DropInSharedPreferences(Context context) {
        this(BraintreeSharedPreferences.getInstance(context), new PaymentMethodInspector());
    }

    DropInSharedPreferences(BraintreeSharedPreferences braintreeSharedPreferences2, PaymentMethodInspector paymentMethodInspector2) {
        this.braintreeSharedPreferences = braintreeSharedPreferences2;
        this.paymentMethodInspector = paymentMethodInspector2;
    }

    /* access modifiers changed from: package-private */
    public DropInPaymentMethod getLastUsedPaymentMethod() {
        String string = this.braintreeSharedPreferences.getString(LAST_USED_PAYMENT_METHOD, (String) null);
        if (string != null) {
            try {
                return DropInPaymentMethod.valueOf(string);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void setLastUsedPaymentMethod(PaymentMethodNonce paymentMethodNonce) {
        DropInPaymentMethod paymentMethod = this.paymentMethodInspector.getPaymentMethod(paymentMethodNonce);
        if (paymentMethod != null) {
            this.braintreeSharedPreferences.putString(LAST_USED_PAYMENT_METHOD, paymentMethod.name());
        }
    }
}
