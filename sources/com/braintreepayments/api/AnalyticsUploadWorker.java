package com.braintreepayments.api;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/AnalyticsUploadWorker;", "Lcom/braintreepayments/api/AnalyticsBaseWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: AnalyticsUploadWorker.kt */
public class AnalyticsUploadWorker extends AnalyticsBaseWorker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnalyticsUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, NativeProtocol.WEB_DIALOG_PARAMS);
    }

    public ListenableWorker.Result doWork() {
        AnalyticsClient createAnalyticsClientFromInputData$BraintreeCore_release = createAnalyticsClientFromInputData$BraintreeCore_release();
        Context applicationContext = getApplicationContext();
        Data inputData = getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
        return createAnalyticsClientFromInputData$BraintreeCore_release.uploadAnalytics(applicationContext, inputData);
    }
}
