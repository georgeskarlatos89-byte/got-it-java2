package com.braintreepayments.api;

import android.content.DialogInterface;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AlertPresenter$$ExternalSyntheticLambda1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInteractionCallback f$0;

    public /* synthetic */ AlertPresenter$$ExternalSyntheticLambda1(DialogInteractionCallback dialogInteractionCallback) {
        this.f$0 = dialogInteractionCallback;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f$0.onDialogInteraction(DialogInteraction.NEGATIVE);
    }
}
