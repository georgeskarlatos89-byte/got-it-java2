package com.braintreepayments.api;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;

class DropInClientParams {
    private FragmentActivity activity;
    private BraintreeClient braintreeClient;
    private DropInRequest dropInRequest;
    private DropInSharedPreferences dropInSharedPreferences;
    private GooglePayClient googlePayClient;
    private Lifecycle lifecycle;
    private PaymentMethodClient paymentMethodClient;

    DropInClientParams() {
    }

    /* access modifiers changed from: package-private */
    public DropInRequest getDropInRequest() {
        return this.dropInRequest;
    }

    /* access modifiers changed from: package-private */
    public DropInClientParams dropInRequest(DropInRequest dropInRequest2) {
        this.dropInRequest = dropInRequest2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public BraintreeClient getBraintreeClient() {
        return this.braintreeClient;
    }

    /* access modifiers changed from: package-private */
    public DropInClientParams braintreeClient(BraintreeClient braintreeClient2) {
        this.braintreeClient = braintreeClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public GooglePayClient getGooglePayClient() {
        return this.googlePayClient;
    }

    /* access modifiers changed from: package-private */
    public DropInClientParams googlePayClient(GooglePayClient googlePayClient2) {
        this.googlePayClient = googlePayClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public PaymentMethodClient getPaymentMethodClient() {
        return this.paymentMethodClient;
    }

    /* access modifiers changed from: package-private */
    public DropInClientParams paymentMethodClient(PaymentMethodClient paymentMethodClient2) {
        this.paymentMethodClient = paymentMethodClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public DropInClientParams dropInSharedPreferences(DropInSharedPreferences dropInSharedPreferences2) {
        this.dropInSharedPreferences = dropInSharedPreferences2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public DropInSharedPreferences getDropInSharedPreferences() {
        return this.dropInSharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public DropInClientParams activity(FragmentActivity fragmentActivity) {
        this.activity = fragmentActivity;
        return this;
    }

    /* access modifiers changed from: package-private */
    public FragmentActivity getActivity() {
        return this.activity;
    }

    /* access modifiers changed from: package-private */
    public DropInClientParams lifecycle(Lifecycle lifecycle2) {
        this.lifecycle = lifecycle2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
