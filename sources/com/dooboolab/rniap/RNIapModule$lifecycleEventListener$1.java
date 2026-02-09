package com.dooboolab.rniap;

import com.android.billingclient.api.BillingClient;
import com.facebook.react.bridge.LifecycleEventListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/dooboolab/rniap/RNIapModule$lifecycleEventListener$1", "Lcom/facebook/react/bridge/LifecycleEventListener;", "onHostDestroy", "", "onHostPause", "onHostResume", "react-native-iap_playRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RNIapModule.kt */
public final class RNIapModule$lifecycleEventListener$1 implements LifecycleEventListener {
    final /* synthetic */ RNIapModule this$0;

    public void onHostPause() {
    }

    public void onHostResume() {
    }

    RNIapModule$lifecycleEventListener$1(RNIapModule rNIapModule) {
        this.this$0 = rNIapModule;
    }

    public void onHostDestroy() {
        BillingClient access$getBillingClientCache$p = this.this$0.billingClientCache;
        if (access$getBillingClientCache$p != null) {
            access$getBillingClientCache$p.endConnection();
        }
        this.this$0.billingClientCache = null;
    }
}
