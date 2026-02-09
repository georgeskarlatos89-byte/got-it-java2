package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.wobs.WalletObjects;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final class zzab implements WalletObjects {
    public final void createWalletObjects(GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        googleApiClient.enqueue(new zzaa(this, googleApiClient, createWalletObjectsRequest, i));
    }
}
