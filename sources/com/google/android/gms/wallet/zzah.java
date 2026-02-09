package com.google.android.gms.wallet;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.wallet.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
public final /* synthetic */ class zzah implements RemoteCall {
    public final /* synthetic */ IsReadyToPayRequest zza;

    public /* synthetic */ zzah(IsReadyToPayRequest isReadyToPayRequest) {
        this.zza = isReadyToPayRequest;
    }

    public final void accept(Object obj, Object obj2) {
        int i = PaymentsClient.zza;
        ((zzy) obj).zzs(this.zza, (TaskCompletionSource) obj2);
    }
}
