package com.braintreepayments.api;

import android.content.Context;
import android.util.Log;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.InvalidInputException;
import lib.android.paypal.com.magnessdk.MagnesSDK;
import lib.android.paypal.com.magnessdk.MagnesSettings;
import lib.android.paypal.com.magnessdk.MagnesSource;

class MagnesInternalClient {
    private final MagnesSDK magnesSDK;

    MagnesInternalClient() {
        this(MagnesSDK.getInstance());
    }

    MagnesInternalClient(MagnesSDK magnesSDK2) {
        this.magnesSDK = magnesSDK2;
    }

    /* access modifiers changed from: package-private */
    public String getClientMetadataId(Context context, Configuration configuration, PayPalDataCollectorInternalRequest payPalDataCollectorInternalRequest) {
        if (context == null) {
            return "";
        }
        try {
            this.magnesSDK.setUp(new MagnesSettings.Builder(context.getApplicationContext()).setMagnesSource(MagnesSource.BRAINTREE).disableBeacon(payPalDataCollectorInternalRequest.isDisableBeacon()).setMagnesEnvironment(configuration.getEnvironment().equalsIgnoreCase("sandbox") ? Environment.SANDBOX : Environment.LIVE).setAppGuid(payPalDataCollectorInternalRequest.getApplicationGuid()).setHasUserLocationConsent(payPalDataCollectorInternalRequest.getHasUserLocationConsent()).build());
            return this.magnesSDK.collectAndSubmit(context.getApplicationContext(), payPalDataCollectorInternalRequest.getClientMetadataId(), payPalDataCollectorInternalRequest.getAdditionalData()).getPaypalClientMetaDataId();
        } catch (InvalidInputException e) {
            Log.e("Exception", "Error fetching client metadata ID. Contact Braintree Support for assistance.", e);
            return "";
        }
    }
}
