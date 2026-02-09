package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalChallengeObserver;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;

public class ThreeDSecureActivity extends AppCompatActivity implements CardinalValidateReceiver {
    static final String EXTRA_ERROR_MESSAGE = "com.braintreepayments.api.ThreeDSecureActivity.EXTRA_ERROR_MESSAGE";
    static final String EXTRA_JWT = "com.braintreepayments.api.ThreeDSecureActivity.EXTRA_JWT";
    static final String EXTRA_THREE_D_SECURE_RESULT = "com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_RESULT";
    static final String EXTRA_VALIDATION_RESPONSE = "com.braintreepayments.api.ThreeDSecureActivity.EXTRA_VALIDATION_RESPONSE";
    static final int RESULT_COULD_NOT_START_CARDINAL = 1;
    private final CardinalClient cardinalClient = new CardinalClient();
    private CardinalChallengeObserver challengeObserver;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.challengeObserver = new CardinalChallengeObserver(this, new ThreeDSecureActivity$$ExternalSyntheticLambda0(this));
        new Handler(Looper.getMainLooper()).post(new ThreeDSecureActivity$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$0$com-braintreepayments-api-ThreeDSecureActivity  reason: not valid java name */
    public /* synthetic */ void m401lambda$onCreate$0$combraintreepaymentsapiThreeDSecureActivity(Context context, ValidateResponse validateResponse, String str) {
        handleValidated(validateResponse, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$1$com-braintreepayments-api-ThreeDSecureActivity  reason: not valid java name */
    public /* synthetic */ void m402lambda$onCreate$1$combraintreepaymentsapiThreeDSecureActivity() {
        launchCardinalAuthChallenge(this.cardinalClient);
    }

    /* access modifiers changed from: package-private */
    public void launchCardinalAuthChallenge(CardinalClient cardinalClient2) {
        if (!isFinishing()) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            ThreeDSecureResult threeDSecureResult = (ThreeDSecureResult) extras.getParcelable(EXTRA_THREE_D_SECURE_RESULT);
            if (threeDSecureResult != null) {
                try {
                    cardinalClient2.continueLookup(threeDSecureResult, this.challengeObserver);
                } catch (BraintreeException e) {
                    finishWithError(e.getMessage());
                }
            } else {
                finishWithError("Unable to launch 3DS authentication.");
            }
        }
    }

    private void finishWithError(String str) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_ERROR_MESSAGE, str);
        setResult(1, intent);
        finish();
    }

    public void onValidated(Context context, ValidateResponse validateResponse, String str) {
        handleValidated(validateResponse, str);
    }

    private void handleValidated(ValidateResponse validateResponse, String str) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_JWT, str);
        intent.putExtra(EXTRA_THREE_D_SECURE_RESULT, (ThreeDSecureResult) getIntent().getExtras().getParcelable(EXTRA_THREE_D_SECURE_RESULT));
        intent.putExtra(EXTRA_VALIDATION_RESPONSE, validateResponse);
        setResult(-1, intent);
        finish();
    }
}
