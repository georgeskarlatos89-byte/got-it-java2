package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolvableVoidResult;
import com.google.android.gms.wallet.AutoResolveHelper;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
final class zzv extends zzt {
    private final TaskCompletionSource zza;

    public zzv(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzh(int i, Bundle bundle) {
        Status status;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
        if (pendingIntent == null || i != 6) {
            status = new Status(i);
        } else {
            status = new Status(6, "Need to resolve PendingIntent", pendingIntent);
        }
        AutoResolveHelper.zzd(status, new AutoResolvableVoidResult(), this.zza);
    }
}
