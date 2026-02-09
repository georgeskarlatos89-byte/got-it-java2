package com.braintreepayments.api;

import android.content.Context;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.Wallet;
import lib.android.paypal.com.magnessdk.a;

class GooglePayInternalClient {
    GooglePayInternalClient() {
    }

    /* access modifiers changed from: package-private */
    public void isReadyToPay(Context context, Configuration configuration, IsReadyToPayRequest isReadyToPayRequest, final GooglePayIsReadyToPayCallback googlePayIsReadyToPayCallback) {
        Wallet.getPaymentsClient(context, new Wallet.WalletOptions.Builder().setEnvironment(getGooglePayEnvironment(configuration)).build()).isReadyToPay(isReadyToPayRequest).addOnCompleteListener(new OnCompleteListener<Boolean>() {
            public void onComplete(Task<Boolean> task) {
                try {
                    googlePayIsReadyToPayCallback.onResult(task.getResult(ApiException.class).booleanValue(), (Exception) null);
                } catch (ApiException e) {
                    googlePayIsReadyToPayCallback.onResult(false, e);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public int getGooglePayEnvironment(Configuration configuration) {
        return a.d.equals(configuration.getGooglePayEnvironment()) ? 1 : 3;
    }
}
