package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
final class zzu extends zzt {
    private final TaskCompletionSource zza;

    zzu(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzc(Status status, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.zza);
    }

    public final void zzg(int i, boolean z, Bundle bundle) {
        TaskUtil.setResultOrApiException(new Status(i), Boolean.valueOf(z), this.zza);
    }
}
