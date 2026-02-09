package com.braintreepayments.api;

class DropInInternalClientParams {
    private BraintreeClient braintreeClient;
    private CardClient cardClient;
    private DataCollector dataCollector;
    private DropInRequest dropInRequest;
    private DropInSharedPreferences dropInSharedPreferences;
    private GooglePayClient googlePayClient;
    private PayPalClient payPalClient;
    private PaymentMethodClient paymentMethodClient;
    private ThreeDSecureClient threeDSecureClient;
    private UnionPayClient unionPayClient;
    private VenmoClient venmoClient;

    DropInInternalClientParams() {
    }

    /* access modifiers changed from: package-private */
    public ThreeDSecureClient getThreeDSecureClient() {
        return this.threeDSecureClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams threeDSecureClient(ThreeDSecureClient threeDSecureClient2) {
        this.threeDSecureClient = threeDSecureClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public DataCollector getDataCollector() {
        return this.dataCollector;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams dataCollector(DataCollector dataCollector2) {
        this.dataCollector = dataCollector2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public DropInRequest getDropInRequest() {
        return this.dropInRequest;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams dropInRequest(DropInRequest dropInRequest2) {
        this.dropInRequest = dropInRequest2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public BraintreeClient getBraintreeClient() {
        return this.braintreeClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams braintreeClient(BraintreeClient braintreeClient2) {
        this.braintreeClient = braintreeClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public GooglePayClient getGooglePayClient() {
        return this.googlePayClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams googlePayClient(GooglePayClient googlePayClient2) {
        this.googlePayClient = googlePayClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public PaymentMethodClient getPaymentMethodClient() {
        return this.paymentMethodClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams paymentMethodClient(PaymentMethodClient paymentMethodClient2) {
        this.paymentMethodClient = paymentMethodClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public PayPalClient getPayPalClient() {
        return this.payPalClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams payPalClient(PayPalClient payPalClient2) {
        this.payPalClient = payPalClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public VenmoClient getVenmoClient() {
        return this.venmoClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams venmoClient(VenmoClient venmoClient2) {
        this.venmoClient = venmoClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public CardClient getCardClient() {
        return this.cardClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams cardClient(CardClient cardClient2) {
        this.cardClient = cardClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public UnionPayClient getUnionPayClient() {
        return this.unionPayClient;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams unionPayClient(UnionPayClient unionPayClient2) {
        this.unionPayClient = unionPayClient2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public DropInInternalClientParams dropInSharedPreferences(DropInSharedPreferences dropInSharedPreferences2) {
        this.dropInSharedPreferences = dropInSharedPreferences2;
        return this;
    }

    /* access modifiers changed from: package-private */
    public DropInSharedPreferences getDropInSharedPreferences() {
        return this.dropInSharedPreferences;
    }
}
