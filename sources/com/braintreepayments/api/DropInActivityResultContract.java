package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;

class DropInActivityResultContract extends ActivityResultContract<DropInIntentData, DropInResult> {
    DropInActivityResultContract() {
    }

    public Intent createIntent(Context context, DropInIntentData dropInIntentData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.braintreepayments.api.EXTRA_CHECKOUT_REQUEST", dropInIntentData.getDropInRequest());
        return new Intent(context, DropInActivity.class).putExtra("com.braintreepayments.api.EXTRA_CHECKOUT_REQUEST_BUNDLE", bundle).putExtra("com.braintreepayments.api.EXTRA_SESSION_ID", dropInIntentData.getSessionId()).putExtra("com.braintreepayments.api.EXTRA_AUTHORIZATION", dropInIntentData.getAuthorization().toString());
    }

    public DropInResult parseResult(int i, Intent intent) {
        if (i == -1) {
            if (intent != null) {
                return (DropInResult) intent.getParcelableExtra(DropInResult.EXTRA_DROP_IN_RESULT);
            }
            return null;
        } else if (i == 0) {
            DropInResult dropInResult = new DropInResult();
            dropInResult.setError(new UserCanceledException("User canceled DropIn."));
            return dropInResult;
        } else if (i != 1 || intent == null) {
            return null;
        } else {
            DropInResult dropInResult2 = new DropInResult();
            dropInResult2.setError((Exception) intent.getSerializableExtra(DropInResult.EXTRA_ERROR));
            return dropInResult2;
        }
    }
}
