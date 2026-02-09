package com.google.android.gms.wallet;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.wallet.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final /* synthetic */ class zzat implements RemoteCall {
    public final /* synthetic */ CreateWalletObjectsRequest zza;

    public /* synthetic */ zzat(CreateWalletObjectsRequest createWalletObjectsRequest) {
        this.zza = createWalletObjectsRequest;
    }

    public final void accept(Object obj, Object obj2) {
        int i = WalletObjectsClient.zza;
        ((zzy) obj).zzq(this.zza, (TaskCompletionSource) obj2);
    }
}
