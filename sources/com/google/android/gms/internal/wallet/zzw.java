package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;

/* compiled from: com.google.android.gms:play-services-wallet@@19.2.1 */
final class zzw extends zzt {
    private final TaskCompletionSource zza;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zze(Status status, PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentCardRecognitionIntentResponse, this.zza);
    }
}
