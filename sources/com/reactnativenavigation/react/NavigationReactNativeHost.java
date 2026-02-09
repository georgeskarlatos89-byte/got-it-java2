package com.reactnativenavigation.react;

import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.reactnativenavigation.NavigationApplication;

public abstract class NavigationReactNativeHost extends DefaultReactNativeHost implements BundleDownloadListenerProvider {
    /* access modifiers changed from: private */
    public NavigationDevBundleDownloadListener bundleListener;
    private final DevBundleDownloadListener bundleListenerMediator = new DevBundleDownloadListenerAdapter() {
        public void onSuccess() {
            if (NavigationReactNativeHost.this.bundleListener != null) {
                NavigationReactNativeHost.this.bundleListener.onSuccess();
            }
        }
    };

    public NavigationReactNativeHost(NavigationApplication navigationApplication) {
        super(navigationApplication);
    }

    public void setBundleLoaderListener(NavigationDevBundleDownloadListener navigationDevBundleDownloadListener) {
        this.bundleListener = navigationDevBundleDownloadListener;
    }

    /* access modifiers changed from: protected */
    public DevBundleDownloadListener getDevBundleDownloadListener() {
        return this.bundleListenerMediator;
    }
}
