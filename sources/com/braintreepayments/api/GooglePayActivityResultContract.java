package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

class GooglePayActivityResultContract extends ActivityResultContract<GooglePayIntentData, GooglePayResult> {
    GooglePayActivityResultContract() {
    }

    public Intent createIntent(Context context, GooglePayIntentData googlePayIntentData) {
        return new Intent(context, GooglePayActivity.class).putExtra("com.braintreepayments.api.EXTRA_ENVIRONMENT", googlePayIntentData.getGooglePayEnvironment()).putExtra("com.braintreepayments.api.EXTRA_PAYMENT_DATA_REQUEST", googlePayIntentData.getPaymentDataRequest());
    }

    public GooglePayResult parseResult(int i, Intent intent) {
        if (i == -1) {
            if (intent != null) {
                return new GooglePayResult(PaymentData.getFromIntent(intent), (Exception) null);
            }
        } else if (i == 0) {
            return new GooglePayResult((PaymentData) null, new UserCanceledException("User canceled Google Pay.", true));
        } else {
            if (i == 1 && intent != null) {
                return new GooglePayResult((PaymentData) null, new GooglePayException("An error was encountered during the Google Pay flow. See the status object in this exception for more details.", AutoResolveHelper.getStatusFromIntent(intent)));
            }
        }
        return new GooglePayResult((PaymentData) null, new BraintreeException("An unexpected error occurred."));
    }
}
