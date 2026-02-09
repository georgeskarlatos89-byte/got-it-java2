package com.braintreepayments.api;

import android.content.DialogInterface;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class AlertPresenter$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInteractionCallback f$0;

    public /* synthetic */ AlertPresenter$$ExternalSyntheticLambda0(DialogInteractionCallback dialogInteractionCallback) {
        this.f$0 = dialogInteractionCallback;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f$0.onDialogInteraction(DialogInteraction.POSITIVE);
    }
}
