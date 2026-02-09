package com.braintreepayments.api;

import androidx.lifecycle.Observer;
import java.util.List;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class VaultManagerFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ VaultManagerFragment f$0;

    public /* synthetic */ VaultManagerFragment$$ExternalSyntheticLambda0(VaultManagerFragment vaultManagerFragment) {
        this.f$0 = vaultManagerFragment;
    }

    public final void onChanged(Object obj) {
        this.f$0.showVaultedPaymentMethods((List) obj);
    }
}
