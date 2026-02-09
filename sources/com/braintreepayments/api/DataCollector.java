package com.braintreepayments.api;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class DataCollector {
    private static final String CORRELATION_ID_KEY = "correlation_id";
    private final BraintreeClient braintreeClient;
    private final PayPalDataCollector payPalDataCollector;

    public DataCollector(BraintreeClient braintreeClient2) {
        this(braintreeClient2, new PayPalDataCollector(braintreeClient2));
    }

    DataCollector(BraintreeClient braintreeClient2, PayPalDataCollector payPalDataCollector2) {
        this.braintreeClient = braintreeClient2;
        this.payPalDataCollector = payPalDataCollector2;
    }

    @Deprecated
    public void collectDeviceData(Context context, DataCollectorCallback dataCollectorCallback) {
        collectDeviceData(context, new DataCollectorRequest(false), dataCollectorCallback);
    }

    public void collectDeviceData(Context context, final DataCollectorRequest dataCollectorRequest, final DataCollectorCallback dataCollectorCallback) {
        final Context applicationContext = context.getApplicationContext();
        this.braintreeClient.getConfiguration(new ConfigurationCallback() {
            public void onResult(Configuration configuration, Exception exc) {
                if (configuration != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        String access$000 = DataCollector.this.getPayPalClientMetadataId(applicationContext, configuration, dataCollectorRequest);
                        if (!TextUtils.isEmpty(access$000)) {
                            jSONObject.put(DataCollector.CORRELATION_ID_KEY, access$000);
                        }
                    } catch (JSONException unused) {
                    }
                    dataCollectorCallback.onResult(jSONObject.toString(), (Exception) null);
                    return;
                }
                dataCollectorCallback.onResult((String) null, exc);
            }
        });
    }

    @Deprecated
    public void collectDeviceData(Context context, String str, DataCollectorCallback dataCollectorCallback) {
        collectDeviceData(context, dataCollectorCallback);
    }

    /* access modifiers changed from: private */
    public String getPayPalClientMetadataId(Context context, Configuration configuration, DataCollectorRequest dataCollectorRequest) {
        try {
            return this.payPalDataCollector.getClientMetadataId(context, configuration, dataCollectorRequest.getHasUserLocationConsent());
        } catch (NoClassDefFoundError unused) {
            return "";
        }
    }
}
