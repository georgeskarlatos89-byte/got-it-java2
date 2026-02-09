package com.braintreepayments.api;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DropInInternalClient$$ExternalSyntheticLambda12 implements ConfigurationCallback {
    public final /* synthetic */ DropInInternalClient f$0;
    public final /* synthetic */ GetSupportedCardTypesCallback f$1;

    public /* synthetic */ DropInInternalClient$$ExternalSyntheticLambda12(DropInInternalClient dropInInternalClient, GetSupportedCardTypesCallback getSupportedCardTypesCallback) {
        this.f$0 = dropInInternalClient;
        this.f$1 = getSupportedCardTypesCallback;
    }

    public final void onResult(Configuration configuration, Exception exc) {
        this.f$0.m380lambda$getSupportedCardTypes$12$combraintreepaymentsapiDropInInternalClient(this.f$1, configuration, exc);
    }
}
