package com.braintreepayments.api;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\bH\u0010¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/AnalyticsBaseWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "createAnalyticsClientFromInputData", "Lcom/braintreepayments/api/AnalyticsClient;", "createAnalyticsClientFromInputData$BraintreeCore_release", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: AnalyticsBaseWorker.kt */
public abstract class AnalyticsBaseWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnalyticsBaseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
    }

    public AnalyticsClient createAnalyticsClientFromInputData$BraintreeCore_release() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        return new AnalyticsClient(applicationContext);
    }
}
