package com.wix.reactnativenotifications.fcm;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;

public class FcmInstanceIdRefreshHandlerService extends JobIntentService {
    public static String EXTRA_IS_APP_INIT = "isAppInit";
    public static String EXTRA_MANUAL_REFRESH = "doManualRefresh";
    public static final int JOB_ID = 2400;

    public static void enqueueWork(Context context, Intent intent) {
        enqueueWork(context, (Class<?>) FcmInstanceIdRefreshHandlerService.class, (int) JOB_ID, intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleWork(Intent intent) {
        IFcmToken iFcmToken = FcmToken.get(this);
        if (iFcmToken != null) {
            if (intent.getBooleanExtra(EXTRA_IS_APP_INIT, false)) {
                iFcmToken.onAppReady();
            } else if (intent.getBooleanExtra(EXTRA_MANUAL_REFRESH, false)) {
                iFcmToken.onManualRefresh();
            } else {
                iFcmToken.onNewTokenReady();
            }
        }
    }
}
