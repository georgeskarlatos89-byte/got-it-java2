package ai.gotit.giap.support;

import ai.gotit.giap.GIAP;
import ai.gotit.giap.util.Logger;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public class GIAPActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private GIAP giapInstance;
    private boolean isBackground = false;

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public GIAPActivityLifecycleCallbacks(GIAP giap) {
        this.giapInstance = giap;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Logger.log("LIFECYCLE: created!");
    }

    public void onActivityPaused(Activity activity) {
        this.isBackground = true;
        Logger.log("LIFECYCLE: foreground -> background");
        this.giapInstance.onPause();
    }

    public void onActivityResumed(Activity activity) {
        if (this.isBackground) {
            Logger.log("LIFECYCLE: background -> foreground");
            this.giapInstance.onResume();
        }
        this.isBackground = false;
    }

    public void onActivityStopped(Activity activity) {
        Logger.log("LIFECYCLE: stopped");
    }

    public void onActivityDestroyed(Activity activity) {
        Logger.log("LIFECYCLE: destroyed");
    }

    /* access modifiers changed from: package-private */
    public boolean getBackground() {
        return this.isBackground;
    }
}
