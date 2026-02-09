package com.braintreepayments.api;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

class VenmoLifecycleObserver implements LifecycleEventObserver {
    private static final String VENMO_SECURE_RESULT = "com.braintreepayments.api.Venmo.RESULT";
    ActivityResultLauncher<VenmoIntentData> activityLauncher;
    ActivityResultRegistry activityResultRegistry;
    VenmoActivityResultContract venmoActivityResultContract = new VenmoActivityResultContract();
    VenmoClient venmoClient;

    VenmoLifecycleObserver(ActivityResultRegistry activityResultRegistry2, VenmoClient venmoClient2) {
        this.activityResultRegistry = activityResultRegistry2;
        this.venmoClient = venmoClient2;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        final FragmentActivity fragmentActivity;
        if (event == Lifecycle.Event.ON_CREATE) {
            this.activityLauncher = this.activityResultRegistry.register(VENMO_SECURE_RESULT, lifecycleOwner, new VenmoActivityResultContract(), new ActivityResultCallback<VenmoResult>() {
                public void onActivityResult(VenmoResult venmoResult) {
                    VenmoLifecycleObserver.this.venmoClient.onVenmoResult(venmoResult);
                }
            });
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (lifecycleOwner instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) lifecycleOwner;
            } else {
                fragmentActivity = lifecycleOwner instanceof Fragment ? ((Fragment) lifecycleOwner).getActivity() : null;
            }
            if (fragmentActivity != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        BrowserSwitchResult browserSwitchResult = VenmoLifecycleObserver.this.venmoClient.getBrowserSwitchResult(fragmentActivity);
                        BrowserSwitchResult deliverBrowserSwitchResult = (browserSwitchResult == null || browserSwitchResult.getRequestCode() != 13488) ? null : VenmoLifecycleObserver.this.venmoClient.deliverBrowserSwitchResult(fragmentActivity);
                        BrowserSwitchResult browserSwitchResultFromNewTask = VenmoLifecycleObserver.this.venmoClient.getBrowserSwitchResultFromNewTask(fragmentActivity);
                        if (browserSwitchResultFromNewTask != null && browserSwitchResultFromNewTask.getRequestCode() == 13488) {
                            deliverBrowserSwitchResult = VenmoLifecycleObserver.this.venmoClient.deliverBrowserSwitchResultFromNewTask(fragmentActivity);
                        }
                        if (deliverBrowserSwitchResult != null) {
                            VenmoLifecycleObserver.this.venmoClient.onBrowserSwitchResult(deliverBrowserSwitchResult);
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void launch(VenmoIntentData venmoIntentData) {
        this.activityLauncher.launch(venmoIntentData);
    }
}
