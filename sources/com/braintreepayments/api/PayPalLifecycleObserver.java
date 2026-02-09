package com.braintreepayments.api;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: PayPalLifeCycleObserver */
class PayPalLifecycleObserver implements LifecycleEventObserver {
    final PayPalClient payPalClient;

    PayPalLifecycleObserver(PayPalClient payPalClient2) {
        this.payPalClient = payPalClient2;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        final FragmentActivity fragmentActivity;
        if (event == Lifecycle.Event.ON_RESUME) {
            if (lifecycleOwner instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) lifecycleOwner;
            } else {
                fragmentActivity = lifecycleOwner instanceof Fragment ? ((Fragment) lifecycleOwner).getActivity() : null;
            }
            if (fragmentActivity != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        BrowserSwitchResult browserSwitchResult = PayPalLifecycleObserver.this.payPalClient.getBrowserSwitchResult(fragmentActivity);
                        BrowserSwitchResult deliverBrowserSwitchResult = (browserSwitchResult == null || browserSwitchResult.getRequestCode() != 13591) ? null : PayPalLifecycleObserver.this.payPalClient.deliverBrowserSwitchResult(fragmentActivity);
                        BrowserSwitchResult browserSwitchResultFromNewTask = PayPalLifecycleObserver.this.payPalClient.getBrowserSwitchResultFromNewTask(fragmentActivity);
                        if (browserSwitchResultFromNewTask != null && browserSwitchResultFromNewTask.getRequestCode() == 13591) {
                            deliverBrowserSwitchResult = PayPalLifecycleObserver.this.payPalClient.deliverBrowserSwitchResultFromNewTask(fragmentActivity);
                        }
                        if (deliverBrowserSwitchResult != null) {
                            PayPalLifecycleObserver.this.payPalClient.onBrowserSwitchResult(deliverBrowserSwitchResult);
                        }
                    }
                });
            }
        }
    }
}
