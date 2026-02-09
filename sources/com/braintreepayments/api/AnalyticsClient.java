package com.braintreepayments.api;

import android.content.Context;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import co.gotitapp.android.modules.braintree.BraintreeModule;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ8\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016JB\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J,\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J2\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016J(\u0010\u001f\u001a\u00020 2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020&2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020&2\u0006\u0010'\u001a\u00020(R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/braintreepayments/api/AnalyticsClient;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "analyticsDatabase", "Lcom/braintreepayments/api/AnalyticsDatabase;", "workManager", "Landroidx/work/WorkManager;", "deviceInspector", "Lcom/braintreepayments/api/DeviceInspector;", "(Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/AnalyticsDatabase;Landroidx/work/WorkManager;Lcom/braintreepayments/api/DeviceInspector;)V", "reportCrash", "", "configuration", "Lcom/braintreepayments/api/Configuration;", "sessionId", "", "integration", "authorization", "Lcom/braintreepayments/api/Authorization;", "timestamp", "", "scheduleAnalyticsUpload", "Ljava/util/UUID;", "scheduleAnalyticsWrite", "event", "Lcom/braintreepayments/api/AnalyticsEvent;", "sendEvent", "serializeEvents", "Lorg/json/JSONObject;", "events", "", "metadata", "Lcom/braintreepayments/api/DeviceMetadata;", "uploadAnalytics", "Landroidx/work/ListenableWorker$Result;", "inputData", "Landroidx/work/Data;", "writeAnalytics", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: AnalyticsClient.kt */
public final class AnalyticsClient {
    private static final String AUTHORIZATION_FINGERPRINT_KEY = "authorization_fingerprint";
    private static final String BATCH_PARAMS_KEY = "batch_params";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long DELAY_TIME_SECONDS = 30;
    private static final String EVENTS_CONTAINER_KEY = "events";
    private static final String EVENT_NAME_KEY = "event_name";
    private static final String EVENT_PARAMS_KEY = "event_params";
    private static final String FPTI_ANALYTICS_URL = "https://api-m.paypal.com/v1/tracking/batch/events";
    private static final long INVALID_TIMESTAMP = -1;
    private static final String PAYPAL_CONTEXT_ID_KEY = "paypal_context_id";
    private static final String TENANT_NAME_KEY = "tenant_name";
    private static final String TIMESTAMP_KEY = "t";
    private static final String TOKENIZATION_KEY = "tokenization_key";
    public static final String WORK_INPUT_KEY_AUTHORIZATION = "authorization";
    public static final String WORK_INPUT_KEY_CONFIGURATION = "configuration";
    public static final String WORK_INPUT_KEY_EVENT_NAME = "eventName";
    public static final String WORK_INPUT_KEY_INTEGRATION = "integration";
    public static final String WORK_INPUT_KEY_PAYPAL_CONTEXT_ID = "payPalContextId";
    public static final String WORK_INPUT_KEY_SESSION_ID = "sessionId";
    public static final String WORK_INPUT_KEY_TIMESTAMP = "timestamp";
    public static final String WORK_NAME_ANALYTICS_UPLOAD = "uploadAnalytics";
    public static final String WORK_NAME_ANALYTICS_WRITE = "writeAnalyticsToDb";
    private final AnalyticsDatabase analyticsDatabase;
    private final DeviceInspector deviceInspector;
    private final BraintreeHttpClient httpClient;
    private final WorkManager workManager;

    public AnalyticsClient(BraintreeHttpClient braintreeHttpClient, AnalyticsDatabase analyticsDatabase2, WorkManager workManager2, DeviceInspector deviceInspector2) {
        Intrinsics.checkNotNullParameter(braintreeHttpClient, "httpClient");
        Intrinsics.checkNotNullParameter(analyticsDatabase2, "analyticsDatabase");
        Intrinsics.checkNotNullParameter(workManager2, "workManager");
        Intrinsics.checkNotNullParameter(deviceInspector2, "deviceInspector");
        this.httpClient = braintreeHttpClient;
        this.analyticsDatabase = analyticsDatabase2;
        this.workManager = workManager2;
        this.deviceInspector = deviceInspector2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnalyticsClient(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.braintreepayments.api.BraintreeHttpClient r0 = new com.braintreepayments.api.BraintreeHttpClient
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            com.braintreepayments.api.AnalyticsDatabase$Companion r1 = com.braintreepayments.api.AnalyticsDatabase.Companion
            android.content.Context r2 = r5.getApplicationContext()
            java.lang.String r3 = "context.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.braintreepayments.api.AnalyticsDatabase r1 = r1.getInstance(r2)
            android.content.Context r5 = r5.getApplicationContext()
            androidx.work.WorkManager r5 = androidx.work.WorkManager.getInstance(r5)
            java.lang.String r2 = "getInstance(context.applicationContext)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            com.braintreepayments.api.DeviceInspector r2 = new com.braintreepayments.api.DeviceInspector
            r2.<init>()
            r4.<init>(r0, r1, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.AnalyticsClient.<init>(android.content.Context):void");
    }

    public final UUID sendEvent(Configuration configuration, AnalyticsEvent analyticsEvent, String str, String str2, Authorization authorization) {
        Intrinsics.checkNotNullParameter(configuration, WORK_INPUT_KEY_CONFIGURATION);
        Intrinsics.checkNotNullParameter(analyticsEvent, "event");
        Intrinsics.checkNotNullParameter(authorization, WORK_INPUT_KEY_AUTHORIZATION);
        scheduleAnalyticsWrite(analyticsEvent, authorization);
        return scheduleAnalyticsUpload(configuration, authorization, str, str2);
    }

    private final void scheduleAnalyticsWrite(AnalyticsEvent analyticsEvent, Authorization authorization) {
        Data build = new Data.Builder().putString(WORK_INPUT_KEY_AUTHORIZATION, authorization.toString()).putString(WORK_INPUT_KEY_EVENT_NAME, "android." + analyticsEvent.getName()).putLong("timestamp", analyticsEvent.getTimestamp()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .p…amp)\n            .build()");
        WorkRequest build2 = ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(AnalyticsWriteToDbWorker.class).setInputData(build)).build();
        Intrinsics.checkNotNullExpressionValue(build2, "Builder(AnalyticsWriteTo…\n                .build()");
        this.workManager.enqueueUniqueWork(WORK_NAME_ANALYTICS_WRITE, ExistingWorkPolicy.APPEND_OR_REPLACE, (OneTimeWorkRequest) build2);
    }

    public final ListenableWorker.Result writeAnalytics(Data data) {
        Intrinsics.checkNotNullParameter(data, "inputData");
        String string = data.getString(WORK_INPUT_KEY_EVENT_NAME);
        String string2 = data.getString(WORK_INPUT_KEY_PAYPAL_CONTEXT_ID);
        long j = data.getLong("timestamp", -1);
        if (string == null || j == -1) {
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(failure, "{\n            Listenable…esult.failure()\n        }");
            return failure;
        }
        this.analyticsDatabase.analyticsEventDao().insertEvent(new AnalyticsEvent(string, string2, j));
        ListenableWorker.Result success = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(success, "{\n            val event …esult.success()\n        }");
        return success;
    }

    private final UUID scheduleAnalyticsUpload(Configuration configuration, Authorization authorization, String str, String str2) {
        Data build = new Data.Builder().putString(WORK_INPUT_KEY_AUTHORIZATION, authorization.toString()).putString(WORK_INPUT_KEY_CONFIGURATION, configuration.toJson()).putString(WORK_INPUT_KEY_SESSION_ID, str).putString(WORK_INPUT_KEY_INTEGRATION, str2).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .p…ion)\n            .build()");
        WorkRequest build2 = ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(AnalyticsUploadWorker.class).setInitialDelay(DELAY_TIME_SECONDS, TimeUnit.SECONDS)).setInputData(build)).build();
        Intrinsics.checkNotNullExpressionValue(build2, "Builder(AnalyticsUploadW…ata)\n            .build()");
        OneTimeWorkRequest oneTimeWorkRequest = (OneTimeWorkRequest) build2;
        this.workManager.enqueueUniqueWork(WORK_NAME_ANALYTICS_UPLOAD, ExistingWorkPolicy.KEEP, oneTimeWorkRequest);
        UUID id = oneTimeWorkRequest.getId();
        Intrinsics.checkNotNullExpressionValue(id, "analyticsWorkRequest.id");
        return id;
    }

    public final ListenableWorker.Result uploadAnalytics(Context context, Data data) {
        ListenableWorker.Result result;
        Intrinsics.checkNotNullParameter(data, "inputData");
        Companion companion = Companion;
        Configuration access$getConfigurationFromData = companion.getConfigurationFromData(data);
        Authorization access$getAuthorizationFromData = companion.getAuthorizationFromData(data);
        String string = data.getString(WORK_INPUT_KEY_SESSION_ID);
        String string2 = data.getString(WORK_INPUT_KEY_INTEGRATION);
        if (CollectionsKt.listOf(access$getConfigurationFromData, access$getAuthorizationFromData, string, string2).contains((Object) null)) {
            ListenableWorker.Result failure = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(failure, "{\n            Listenable…esult.failure()\n        }");
            return failure;
        }
        try {
            AnalyticsEventDao analyticsEventDao = this.analyticsDatabase.analyticsEventDao();
            List<AnalyticsEvent> allEvents = analyticsEventDao.getAllEvents();
            if (true ^ allEvents.isEmpty()) {
                JSONObject serializeEvents = serializeEvents(access$getAuthorizationFromData, allEvents, this.deviceInspector.getDeviceMetadata$BraintreeCore_release(context, access$getConfigurationFromData, string, string2));
                BraintreeHttpClient braintreeHttpClient = this.httpClient;
                String jSONObject = serializeEvents.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "analyticsRequest.toString()");
                braintreeHttpClient.post(FPTI_ANALYTICS_URL, jSONObject, access$getConfigurationFromData, access$getAuthorizationFromData);
                analyticsEventDao.deleteEvents(allEvents);
            }
            result = ListenableWorker.Result.success();
        } catch (Exception unused) {
            result = ListenableWorker.Result.failure();
        }
        Intrinsics.checkNotNullExpressionValue(result, "{\n            try {\n    …)\n            }\n        }");
        return result;
    }

    public final void reportCrash(Context context, Configuration configuration, String str, String str2, Authorization authorization) {
        reportCrash(context, configuration, str, str2, System.currentTimeMillis(), authorization);
    }

    public final void reportCrash(Context context, Configuration configuration, String str, String str2, long j, Authorization authorization) {
        if (authorization != null) {
            try {
                JSONObject serializeEvents = serializeEvents(authorization, CollectionsKt.listOf(new AnalyticsEvent("android.crash", (String) null, j)), this.deviceInspector.getDeviceMetadata$BraintreeCore_release(context, configuration, str, str2));
                BraintreeHttpClient braintreeHttpClient = this.httpClient;
                String jSONObject = serializeEvents.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "analyticsRequest.toString()");
                braintreeHttpClient.post(FPTI_ANALYTICS_URL, jSONObject, (Configuration) null, authorization, new HttpNoResponse());
            } catch (JSONException unused) {
            }
        }
    }

    private final JSONObject serializeEvents(Authorization authorization, List<? extends AnalyticsEvent> list, DeviceMetadata deviceMetadata) throws JSONException {
        JSONObject json = deviceMetadata.toJSON();
        if (authorization != null) {
            if (authorization instanceof ClientToken) {
                json.put(AUTHORIZATION_FINGERPRINT_KEY, ((ClientToken) authorization).getBearer());
            } else {
                json.put(TOKENIZATION_KEY, authorization.getBearer());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BATCH_PARAMS_KEY, json);
        JSONArray jSONArray = new JSONArray();
        for (AnalyticsEvent analyticsEvent : list) {
            jSONArray.put(new JSONObject().put(EVENT_NAME_KEY, analyticsEvent.getName()).putOpt(PAYPAL_CONTEXT_ID_KEY, analyticsEvent.getPayPalContextId()).put(TIMESTAMP_KEY, analyticsEvent.getTimestamp()).put(TENANT_NAME_KEY, BraintreeModule.NAME));
        }
        jSONObject.put(EVENT_PARAMS_KEY, jSONArray);
        JSONObject put = new JSONObject().put(EVENTS_CONTAINER_KEY, new JSONArray(new JSONObject[]{jSONObject}));
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject().put(EVENTS_…NTAINER_KEY, eventsArray)");
        return put;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/braintreepayments/api/AnalyticsClient$Companion;", "", "()V", "AUTHORIZATION_FINGERPRINT_KEY", "", "BATCH_PARAMS_KEY", "DELAY_TIME_SECONDS", "", "EVENTS_CONTAINER_KEY", "EVENT_NAME_KEY", "EVENT_PARAMS_KEY", "FPTI_ANALYTICS_URL", "INVALID_TIMESTAMP", "PAYPAL_CONTEXT_ID_KEY", "TENANT_NAME_KEY", "TIMESTAMP_KEY", "TOKENIZATION_KEY", "WORK_INPUT_KEY_AUTHORIZATION", "WORK_INPUT_KEY_CONFIGURATION", "WORK_INPUT_KEY_EVENT_NAME", "WORK_INPUT_KEY_INTEGRATION", "WORK_INPUT_KEY_PAYPAL_CONTEXT_ID", "WORK_INPUT_KEY_SESSION_ID", "WORK_INPUT_KEY_TIMESTAMP", "WORK_NAME_ANALYTICS_UPLOAD", "WORK_NAME_ANALYTICS_WRITE", "getAuthorizationFromData", "Lcom/braintreepayments/api/Authorization;", "inputData", "Landroidx/work/Data;", "getConfigurationFromData", "Lcom/braintreepayments/api/Configuration;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: AnalyticsClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Authorization getAuthorizationFromData(Data data) {
            String string;
            if (data == null || (string = data.getString(AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION)) == null) {
                return null;
            }
            return Authorization.Companion.fromString(string);
        }

        /* access modifiers changed from: private */
        public final Configuration getConfigurationFromData(Data data) {
            String string;
            if (data == null || (string = data.getString(AnalyticsClient.WORK_INPUT_KEY_CONFIGURATION)) == null) {
                return null;
            }
            try {
                return Configuration.Companion.fromJson(string);
            } catch (JSONException unused) {
                Configuration configuration = null;
                return null;
            }
        }
    }
}
