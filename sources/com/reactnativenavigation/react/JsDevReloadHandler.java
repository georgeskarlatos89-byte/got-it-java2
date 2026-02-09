package com.reactnativenavigation.react;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.widget.EditText;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.reactnativenavigation.utils.UiUtils;
import java.util.Objects;

public class JsDevReloadHandler extends JsDevReloadHandlerFacade {
    private static final String RELOAD_BROADCAST = "com.reactnativenavigation.broadcast.RELOAD";
    private final DevSupportManager devSupportManager;
    private long firstRTimestamp = 0;
    private ReloadListener reloadListener = new JsDevReloadHandler$$ExternalSyntheticLambda0();
    private final BroadcastReceiver reloadReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            JsDevReloadHandler.this.reloadReactNative();
        }
    };

    public interface ReloadListener {
        void onReload();
    }

    static /* synthetic */ void lambda$new$0() {
    }

    JsDevReloadHandler(DevSupportManager devSupportManager2) {
        this.devSupportManager = devSupportManager2;
    }

    public void onSuccess() {
        ReloadListener reloadListener2 = this.reloadListener;
        Objects.requireNonNull(reloadListener2);
        UiUtils.runOnMainThread(new JsDevReloadHandler$$ExternalSyntheticLambda1(reloadListener2));
    }

    public void setReloadListener(ReloadListener reloadListener2) {
        this.reloadListener = reloadListener2;
    }

    public void removeReloadListener(ReloadListener reloadListener2) {
        if (this.reloadListener == reloadListener2) {
            this.reloadListener = null;
        }
    }

    public void onActivityResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 34 || activity.getApplicationInfo().targetSdkVersion < 34) {
            activity.registerReceiver(this.reloadReceiver, new IntentFilter(RELOAD_BROADCAST));
        } else {
            activity.registerReceiver(this.reloadReceiver, new IntentFilter(RELOAD_BROADCAST), 2);
        }
    }

    public void onActivityPaused(Activity activity) {
        activity.unregisterReceiver(this.reloadReceiver);
    }

    public boolean onKeyUp(Activity activity, int i) {
        if (!this.devSupportManager.getDevSupportEnabled()) {
            return false;
        }
        if (i == 82) {
            this.devSupportManager.showDevOptionsDialog();
            return true;
        }
        if (i == 46) {
            if (!lessThan500MillisSinceLastR() || !textViewIsNotFocused(activity)) {
                this.firstRTimestamp = System.currentTimeMillis();
            } else {
                reloadReactNative();
                return true;
            }
        }
        return false;
    }

    private boolean lessThan500MillisSinceLastR() {
        return this.firstRTimestamp != 0 && System.currentTimeMillis() - this.firstRTimestamp < 1000;
    }

    private boolean textViewIsNotFocused(Activity activity) {
        return !(activity.getCurrentFocus() instanceof EditText);
    }

    /* access modifiers changed from: private */
    public void reloadReactNative() {
        this.reloadListener.onReload();
        this.devSupportManager.handleReloadJS();
    }
}
