package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;

class ThreeDSecureActivityResultContract extends ActivityResultContract<ThreeDSecureResult, CardinalResult> {
    ThreeDSecureActivityResultContract() {
    }

    public Intent createIntent(Context context, ThreeDSecureResult threeDSecureResult) {
        Intent intent = new Intent(context, ThreeDSecureActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_RESULT", threeDSecureResult);
        intent.putExtras(bundle);
        return intent;
    }

    public CardinalResult parseResult(int i, Intent intent) {
        if (i == 0) {
            return new CardinalResult(new UserCanceledException("User canceled 3DS."));
        }
        if (intent == null) {
            return new CardinalResult(new BraintreeException("An unknown Android error occurred with the activity result API."));
        }
        if (i == 1) {
            return new CardinalResult(new BraintreeException(intent.getStringExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_ERROR_MESSAGE")));
        }
        return new CardinalResult((ThreeDSecureResult) intent.getParcelableExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_RESULT"), intent.getStringExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_JWT"), (ValidateResponse) intent.getSerializableExtra("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_VALIDATION_RESPONSE"));
    }
}
