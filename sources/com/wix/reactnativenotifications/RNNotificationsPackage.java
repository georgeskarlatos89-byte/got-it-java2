package com.wix.reactnativenotifications;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.google.firebase.FirebaseApp;
import com.wix.reactnativenotifications.core.AppLifecycleFacade;
import com.wix.reactnativenotifications.core.AppLifecycleFacadeHolder;
import com.wix.reactnativenotifications.core.InitialNotificationHolder;
import com.wix.reactnativenotifications.core.NotificationIntentAdapter;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import com.wix.reactnativenotifications.core.notification.PushNotification;
import com.wix.reactnativenotifications.core.notificationdrawer.PushNotificationsDrawer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RNNotificationsPackage implements ReactPackage, AppLifecycleFacade.AppVisibilityListener, Application.ActivityLifecycleCallbacks {
    private final Application mApplication;

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAppNotVisible() {
    }

    public RNNotificationsPackage(Application application) {
        this.mApplication = application;
        FirebaseApp.initializeApp(application.getApplicationContext());
        AppLifecycleFacadeHolder.get().addVisibilityListener(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new RNNotificationsModule(this.mApplication, reactApplicationContext)});
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public void onAppVisible() {
        PushNotificationsDrawer.get(this.mApplication.getApplicationContext()).onAppVisible();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        PushNotificationsDrawer.get(this.mApplication.getApplicationContext()).onNewActivity(activity);
        callOnOpenedIfNeed(activity);
    }

    public void onActivityStarted(Activity activity) {
        if (InitialNotificationHolder.getInstance().get() == null) {
            callOnOpenedIfNeed(activity);
        }
    }

    private void callOnOpenedIfNeed(Activity activity) {
        Intent intent = activity.getIntent();
        if (NotificationIntentAdapter.canHandleIntent(intent)) {
            Context applicationContext = this.mApplication.getApplicationContext();
            IPushNotification iPushNotification = PushNotification.get(applicationContext, NotificationIntentAdapter.canHandleTrampolineActivity(applicationContext) ? intent.getExtras() : NotificationIntentAdapter.extractPendingNotificationDataFromIntent(intent));
            if (iPushNotification != null) {
                iPushNotification.onOpened();
            }
        }
    }
}
