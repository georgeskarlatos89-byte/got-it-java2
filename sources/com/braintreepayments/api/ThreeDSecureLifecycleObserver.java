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

class ThreeDSecureLifecycleObserver implements LifecycleEventObserver {
    private static final String THREE_D_SECURE_RESULT = "com.braintreepayments.api.ThreeDSecure.RESULT";
    ActivityResultLauncher activityLauncher;
    ActivityResultRegistry activityResultRegistry;
    ThreeDSecureClient threeDSecureClient;

    ThreeDSecureLifecycleObserver(ActivityResultRegistry activityResultRegistry2, ThreeDSecureClient threeDSecureClient2) {
        this.activityResultRegistry = activityResultRegistry2;
        this.threeDSecureClient = threeDSecureClient2;
    }

    /* access modifiers changed from: package-private */
    public void launch(ThreeDSecureResult threeDSecureResult) {
        this.activityLauncher.launch(threeDSecureResult);
    }

    /* renamed from: com.braintreepayments.api.ThreeDSecureLifecycleObserver$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.lifecycle.Lifecycle$Event[] r0 = androidx.lifecycle.Lifecycle.Event.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$lifecycle$Lifecycle$Event = r0
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$lifecycle$Lifecycle$Event     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.ThreeDSecureLifecycleObserver.AnonymousClass3.<clinit>():void");
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        final FragmentActivity fragmentActivity;
        int i = AnonymousClass3.$SwitchMap$androidx$lifecycle$Lifecycle$Event[event.ordinal()];
        if (i == 1) {
            this.activityLauncher = this.activityResultRegistry.register(THREE_D_SECURE_RESULT, lifecycleOwner, new ThreeDSecureActivityResultContract(), new ActivityResultCallback<CardinalResult>() {
                public void onActivityResult(CardinalResult cardinalResult) {
                    ThreeDSecureLifecycleObserver.this.threeDSecureClient.onCardinalResult(cardinalResult);
                }
            });
        } else if (i != 2) {
            return;
        }
        if (lifecycleOwner instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) lifecycleOwner;
        } else {
            fragmentActivity = lifecycleOwner instanceof Fragment ? ((Fragment) lifecycleOwner).getActivity() : null;
        }
        if (fragmentActivity != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    BrowserSwitchResult browserSwitchResult = ThreeDSecureLifecycleObserver.this.threeDSecureClient.getBrowserSwitchResult(fragmentActivity);
                    BrowserSwitchResult deliverBrowserSwitchResult = (browserSwitchResult == null || browserSwitchResult.getRequestCode() != 13487) ? null : ThreeDSecureLifecycleObserver.this.threeDSecureClient.deliverBrowserSwitchResult(fragmentActivity);
                    BrowserSwitchResult browserSwitchResultFromNewTask = ThreeDSecureLifecycleObserver.this.threeDSecureClient.getBrowserSwitchResultFromNewTask(fragmentActivity);
                    if (browserSwitchResultFromNewTask != null && browserSwitchResultFromNewTask.getRequestCode() == 13487) {
                        deliverBrowserSwitchResult = ThreeDSecureLifecycleObserver.this.threeDSecureClient.deliverBrowserSwitchResultFromNewTask(fragmentActivity);
                    }
                    if (deliverBrowserSwitchResult != null) {
                        ThreeDSecureLifecycleObserver.this.threeDSecureClient.onBrowserSwitchResult(deliverBrowserSwitchResult);
                    }
                }
            });
        }
    }
}
