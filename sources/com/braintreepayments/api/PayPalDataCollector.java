package com.braintreepayments.api;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PayPalDataCollector {
    private static final String CORRELATION_ID_KEY = "correlation_id";
    private final BraintreeClient braintreeClient;
    /* access modifiers changed from: private */
    public final MagnesInternalClient magnesInternalClient;
    private final UUIDHelper uuidHelper;

    public PayPalDataCollector(BraintreeClient braintreeClient2) {
        this(braintreeClient2, new MagnesInternalClient(), new UUIDHelper());
    }

    PayPalDataCollector(BraintreeClient braintreeClient2, MagnesInternalClient magnesInternalClient2, UUIDHelper uUIDHelper) {
        this.braintreeClient = braintreeClient2;
        this.magnesInternalClient = magnesInternalClient2;
        this.uuidHelper = uUIDHelper;
    }

    /* access modifiers changed from: package-private */
    public String getPayPalInstallationGUID(Context context) {
        return this.uuidHelper.getInstallationGUID(context);
    }

    /* access modifiers changed from: package-private */
    public String getClientMetadataId(Context context, Configuration configuration, boolean z) {
        return getClientMetadataId(context, new PayPalDataCollectorInternalRequest(z).setApplicationGuid(getPayPalInstallationGUID(context)), configuration);
    }

    /* access modifiers changed from: package-private */
    public String getClientMetadataId(Context context, PayPalDataCollectorInternalRequest payPalDataCollectorInternalRequest, Configuration configuration) {
        return this.magnesInternalClient.getClientMetadataId(context, configuration, payPalDataCollectorInternalRequest);
    }

    @Deprecated
    public void collectDeviceData(Context context, PayPalDataCollectorCallback payPalDataCollectorCallback) {
        collectDeviceData(context, new PayPalDataCollectorRequest(false, (String) null), payPalDataCollectorCallback);
    }

    @Deprecated
    public void collectDeviceData(Context context, String str, PayPalDataCollectorCallback payPalDataCollectorCallback) {
        collectDeviceData(context, new PayPalDataCollectorRequest(false, str), payPalDataCollectorCallback);
    }

    public void collectDeviceData(final Context context, final PayPalDataCollectorRequest payPalDataCollectorRequest, final PayPalDataCollectorCallback payPalDataCollectorCallback) {
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                if (configuration != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        PayPalDataCollectorInternalRequest applicationGuid = new PayPalDataCollectorInternalRequest(payPalDataCollectorRequest.getHasUserLocationConsent()).setApplicationGuid(PayPalDataCollector.this.getPayPalInstallationGUID(context));
                        if (payPalDataCollectorRequest.getRiskCorrelationId() != null) {
                            applicationGuid.setRiskCorrelationId(payPalDataCollectorRequest.getRiskCorrelationId());
                        }
                        String clientMetadataId = PayPalDataCollector.this.magnesInternalClient.getClientMetadataId(context, configuration, applicationGuid);
                        if (!TextUtils.isEmpty(clientMetadataId)) {
                            jSONObject.put(PayPalDataCollector.CORRELATION_ID_KEY, clientMetadataId);
                        }
                    } catch (JSONException unused) {
                    }
                    payPalDataCollectorCallback.onResult(jSONObject.toString(), (Exception) null);
                    return;
                }
                payPalDataCollectorCallback.onResult((String) null, exc);
            }
        });
    }
}
