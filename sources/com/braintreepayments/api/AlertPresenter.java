package com.braintreepayments.api;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import com.braintreepayments.api.dropin.R;
import com.google.android.material.snackbar.Snackbar;

class AlertPresenter {
    AlertPresenter() {
    }

    /* access modifiers changed from: package-private */
    public void showConfirmNonceDeletionDialog(Context context, PaymentMethodNonce paymentMethodNonce, DialogInteractionCallback dialogInteractionCallback) {
        PaymentMethodItemView paymentMethodItemView = new PaymentMethodItemView(context);
        paymentMethodItemView.setPaymentMethod(paymentMethodNonce, false);
        new AlertDialog.Builder(context, R.style.Theme_AppCompat_Light_Dialog_Alert).setTitle(R.string.bt_delete_confirmation_title).setMessage(R.string.bt_delete_confirmation_description).setView((View) paymentMethodItemView).setPositiveButton(R.string.bt_delete, (DialogInterface.OnClickListener) new AlertPresenter$$ExternalSyntheticLambda0(dialogInteractionCallback)).setOnDismissListener(new AlertPresenter$$ExternalSyntheticLambda1(dialogInteractionCallback)).setNegativeButton(R.string.bt_cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    /* access modifiers changed from: package-private */
    public void showSnackbarText(View view, int i, int i2) {
        Snackbar.make(view, i, i2).show();
    }
}
