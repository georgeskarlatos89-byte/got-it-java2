package com.wix.reactnativenotifications.core.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.wix.reactnativenotifications.Defs;
import com.wix.reactnativenotifications.core.AppLaunchHelper;
import com.wix.reactnativenotifications.core.AppLifecycleFacade;
import com.wix.reactnativenotifications.core.AppLifecycleFacadeHolder;
import com.wix.reactnativenotifications.core.InitialNotificationHolder;
import com.wix.reactnativenotifications.core.JsIOHelper;
import com.wix.reactnativenotifications.core.NotificationIntentAdapter;
import com.wix.reactnativenotifications.core.notification.IPushNotification;

public class PushNotification implements IPushNotification {
    private final String DEFAULT_CHANNEL_ID = "channel_01";
    private final String DEFAULT_CHANNEL_NAME = "Channel Name";
    protected final AppLaunchHelper mAppLaunchHelper;
    protected final AppLifecycleFacade mAppLifecycleFacade;
    protected final AppLifecycleFacade.AppVisibilityListener mAppVisibilityListener = new AppLifecycleFacade.AppVisibilityListener() {
        public void onAppNotVisible() {
        }

        public void onAppVisible() {
            PushNotification.this.mAppLifecycleFacade.removeVisibilityListener(this);
            PushNotification.this.dispatchImmediately();
        }
    };
    protected final Context mContext;
    protected final JsIOHelper mJsIOHelper;
    protected final PushNotificationProps mNotificationProps;

    public static IPushNotification get(Context context, Bundle bundle) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof INotificationsApplication) {
            return ((INotificationsApplication) applicationContext).getPushNotification(context, bundle, AppLifecycleFacadeHolder.get(), new AppLaunchHelper());
        }
        return new PushNotification(context, bundle, AppLifecycleFacadeHolder.get(), new AppLaunchHelper(), new JsIOHelper());
    }

    protected PushNotification(Context context, Bundle bundle, AppLifecycleFacade appLifecycleFacade, AppLaunchHelper appLaunchHelper, JsIOHelper jsIOHelper) {
        this.mContext = context;
        this.mAppLifecycleFacade = appLifecycleFacade;
        this.mAppLaunchHelper = appLaunchHelper;
        this.mJsIOHelper = jsIOHelper;
        this.mNotificationProps = createProps(bundle);
        initDefaultChannel(context);
    }

    public void onReceived() throws IPushNotification.InvalidNotificationException {
        if (!this.mAppLifecycleFacade.isAppVisible()) {
            postNotification((Integer) null);
            notifyReceivedBackgroundToJS();
            return;
        }
        notifyReceivedToJS();
    }

    public void onOpened() {
        digestNotification();
    }

    public int onPostRequest(Integer num) {
        return postNotification(num);
    }

    public PushNotificationProps asProps() {
        return this.mNotificationProps.copy();
    }

    /* access modifiers changed from: protected */
    public int postNotification(Integer num) {
        if (this.mNotificationProps.isDataOnlyPushNotification()) {
            return -1;
        }
        return postNotification(buildNotification(NotificationIntentAdapter.createPendingNotificationIntent(this.mContext, this.mNotificationProps)), num);
    }

    /* access modifiers changed from: protected */
    public void digestNotification() {
        if (!this.mAppLifecycleFacade.isReactInitialized()) {
            setAsInitialNotification();
            launchOrResumeApp();
            return;
        }
        if (this.mAppLifecycleFacade.getRunningReactContext().getCurrentActivity() == null) {
            setAsInitialNotification();
        }
        if (this.mAppLifecycleFacade.isAppVisible()) {
            dispatchImmediately();
        } else if (this.mAppLifecycleFacade.isAppDestroyed()) {
            launchOrResumeApp();
        } else {
            dispatchUponVisibility();
        }
    }

    /* access modifiers changed from: protected */
    public PushNotificationProps createProps(Bundle bundle) {
        return new PushNotificationProps(bundle);
    }

    /* access modifiers changed from: protected */
    public void setAsInitialNotification() {
        InitialNotificationHolder.getInstance().set(this.mNotificationProps);
    }

    /* access modifiers changed from: protected */
    public void dispatchImmediately() {
        notifyOpenedToJS();
    }

    /* access modifiers changed from: protected */
    public void dispatchUponVisibility() {
        this.mAppLifecycleFacade.addVisibilityListener(getIntermediateAppVisibilityListener());
        launchOrResumeApp();
    }

    /* access modifiers changed from: protected */
    public AppLifecycleFacade.AppVisibilityListener getIntermediateAppVisibilityListener() {
        return this.mAppVisibilityListener;
    }

    /* access modifiers changed from: protected */
    public Notification buildNotification(PendingIntent pendingIntent) {
        return getNotificationBuilder(pendingIntent).build();
    }

    /* access modifiers changed from: protected */
    public Notification.Builder getNotificationBuilder(PendingIntent pendingIntent) {
        Notification.Builder autoCancel = new Notification.Builder(this.mContext).setContentTitle(this.mNotificationProps.getTitle()).setContentText(this.mNotificationProps.getBody()).setContentIntent(pendingIntent).setDefaults(-1).setAutoCancel(true);
        setUpIcon(autoCancel);
        if (Build.VERSION.SDK_INT >= 26) {
            String channelId = this.mNotificationProps.getChannelId();
            if (((NotificationManager) this.mContext.getSystemService("notification")).getNotificationChannel(channelId) == null) {
                channelId = "channel_01";
            }
            autoCancel.setChannelId(channelId);
        }
        return autoCancel;
    }

    private void setUpIcon(Notification.Builder builder) {
        int appResourceId = getAppResourceId("notification_icon", "drawable");
        if (appResourceId != 0) {
            builder.setSmallIcon(appResourceId);
        } else {
            builder.setSmallIcon(this.mContext.getApplicationInfo().icon);
        }
        setUpIconColor(builder);
    }

    private void setUpIconColor(Notification.Builder builder) {
        int appResourceId = getAppResourceId("colorAccent", ViewProps.COLOR);
        if (appResourceId != 0) {
            builder.setColor(this.mContext.getResources().getColor(appResourceId));
        }
    }

    /* access modifiers changed from: protected */
    public int postNotification(Notification notification, Integer num) {
        int intValue = num != null ? num.intValue() : createNotificationId(notification);
        postNotification(intValue, notification);
        return intValue;
    }

    /* access modifiers changed from: protected */
    public void postNotification(int i, Notification notification) {
        ((NotificationManager) this.mContext.getSystemService("notification")).notify(i, notification);
    }

    /* access modifiers changed from: protected */
    public int createNotificationId(Notification notification) {
        return (int) System.nanoTime();
    }

    private void notifyReceivedToJS() {
        try {
            this.mJsIOHelper.sendEventToJS(Defs.NOTIFICATION_RECEIVED_EVENT_NAME, this.mNotificationProps.asBundle(), this.mAppLifecycleFacade.getRunningReactContext());
        } catch (NullPointerException unused) {
            Log.e(Defs.LOGTAG, "notifyReceivedToJS: Null pointer exception");
        }
    }

    private void notifyReceivedBackgroundToJS() {
        try {
            this.mJsIOHelper.sendEventToJS(Defs.NOTIFICATION_RECEIVED_BACKGROUND_EVENT_NAME, this.mNotificationProps.asBundle(), this.mAppLifecycleFacade.getRunningReactContext());
        } catch (NullPointerException unused) {
            Log.e(Defs.LOGTAG, "notifyReceivedBackgroundToJS: Null pointer exception");
        }
    }

    private void notifyOpenedToJS() {
        Bundle bundle = new Bundle();
        try {
            bundle.putBundle("notification", this.mNotificationProps.asBundle());
            this.mJsIOHelper.sendEventToJS(Defs.NOTIFICATION_OPENED_EVENT_NAME, bundle, this.mAppLifecycleFacade.getRunningReactContext());
        } catch (NullPointerException unused) {
            Log.e(Defs.LOGTAG, "notifyOpenedToJS: Null pointer exception");
        }
    }

    /* access modifiers changed from: protected */
    public void launchOrResumeApp() {
        if (NotificationIntentAdapter.canHandleTrampolineActivity(this.mContext)) {
            this.mContext.startActivity(this.mAppLaunchHelper.getLaunchIntent(this.mContext));
        }
    }

    private int getAppResourceId(String str, String str2) {
        return this.mContext.getResources().getIdentifier(str, str2, this.mContext.getPackageName());
    }

    private void initDefaultChannel(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager.getNotificationChannels().size() == 0) {
                notificationManager.createNotificationChannel(new NotificationChannel("channel_01", "Channel Name", 3));
            }
        }
    }
}
