package com.braintreepayments.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import org.json.JSONException;
import org.json.JSONObject;

class VenmoActivityResultContract extends ActivityResultContract<VenmoIntentData, VenmoResult> {
    static final String APP_SWITCH_ACTIVITY = "controller.SetupMerchantActivity";
    static final String EXTRA_ACCESS_TOKEN = "com.braintreepayments.api.ACCESS_TOKEN";
    static final String EXTRA_BRAINTREE_DATA = "com.braintreepayments.api.EXTRA_BRAINTREE_DATA";
    static final String EXTRA_ENVIRONMENT = "com.braintreepayments.api.ENVIRONMENT";
    static final String EXTRA_MERCHANT_ID = "com.braintreepayments.api.MERCHANT_ID";
    static final String EXTRA_PAYMENT_METHOD_NONCE = "com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE";
    static final String EXTRA_RESOURCE_ID = "com.braintreepayments.api.EXTRA_RESOURCE_ID";
    static final String EXTRA_USERNAME = "com.braintreepayments.api.EXTRA_USER_NAME";
    static final String META_KEY = "_meta";
    static final String VENMO_PACKAGE_NAME = "com.venmo";
    boolean shouldVault;

    VenmoActivityResultContract() {
    }

    public Intent createIntent(Context context, VenmoIntentData venmoIntentData) {
        Intent putExtra = getVenmoIntent().putExtra(EXTRA_MERCHANT_ID, venmoIntentData.getProfileId()).putExtra(EXTRA_ACCESS_TOKEN, venmoIntentData.getConfiguration().getVenmoAccessToken()).putExtra(EXTRA_ENVIRONMENT, venmoIntentData.getConfiguration().getVenmoEnvironment());
        if (venmoIntentData.getPaymentContextId() != null) {
            putExtra.putExtra(EXTRA_RESOURCE_ID, venmoIntentData.getPaymentContextId());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("_meta", new MetadataBuilder().sessionId(venmoIntentData.getSessionId()).integration(venmoIntentData.getIntegrationType()).version().build());
            putExtra.putExtra(EXTRA_BRAINTREE_DATA, jSONObject.toString());
        } catch (JSONException unused) {
        }
        return putExtra;
    }

    public VenmoResult parseResult(int i, Intent intent) {
        if (i == -1) {
            if (intent == null) {
                return new VenmoResult((String) null, (String) null, (String) null, new BraintreeException("An unknown Android error occurred with the activity result API."));
            }
            return new VenmoResult(intent.getStringExtra(EXTRA_RESOURCE_ID), intent.getStringExtra(EXTRA_PAYMENT_METHOD_NONCE), intent.getStringExtra(EXTRA_USERNAME), (Exception) null);
        } else if (i == 0) {
            return new VenmoResult((String) null, (String) null, (String) null, new UserCanceledException("User canceled Venmo."));
        } else {
            return null;
        }
    }

    private static Intent getVenmoIntent() {
        return new Intent().setComponent(new ComponentName(VENMO_PACKAGE_NAME, "com.venmo.controller.SetupMerchantActivity"));
    }
}
