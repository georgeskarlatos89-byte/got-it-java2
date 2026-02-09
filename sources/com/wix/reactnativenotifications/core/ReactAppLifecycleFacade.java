package com.wix.reactnativenotifications.core;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.wix.reactnativenotifications.core.AppLifecycleFacade;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class ReactAppLifecycleFacade implements AppLifecycleFacade {
    private boolean mIsDestroyed;
    private boolean mIsVisible;
    private Set<AppLifecycleFacade.AppVisibilityListener> mListeners = new CopyOnWriteArraySet();
    private ReactContext mReactContext;

    public void init(ReactContext reactContext) {
        this.mReactContext = reactContext;
        reactContext.addLifecycleEventListener(new LifecycleEventListener() {
            public void onHostResume() {
                ReactAppLifecycleFacade.this.switchToVisible();
            }

            public void onHostPause() {
                ReactAppLifecycleFacade.this.switchToInvisible();
            }

            public void onHostDestroy() {
                ReactAppLifecycleFacade.this.switchToInvisible();
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        return r1.mReactContext.hasActiveReactInstance();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isReactInitialized() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.facebook.react.bridge.ReactContext r0 = r1.mReactContext     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0008
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0008:
            boolean r0 = r0.hasActiveCatalystInstance()     // Catch:{ Exception -> 0x000e }
            monitor-exit(r1)
            return r0
        L_0x000e:
            com.facebook.react.bridge.ReactContext r0 = r1.mReactContext     // Catch:{ all -> 0x0016 }
            boolean r0 = r0.hasActiveReactInstance()     // Catch:{ all -> 0x0016 }
            monitor-exit(r1)
            return r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wix.reactnativenotifications.core.ReactAppLifecycleFacade.isReactInitialized():boolean");
    }

    public ReactContext getRunningReactContext() {
        ReactContext reactContext = this.mReactContext;
        if (reactContext == null) {
            return null;
        }
        return reactContext;
    }

    public boolean isAppVisible() {
        return this.mIsVisible;
    }

    public boolean isAppDestroyed() {
        return this.mIsDestroyed;
    }

    public void addVisibilityListener(AppLifecycleFacade.AppVisibilityListener appVisibilityListener) {
        this.mListeners.add(appVisibilityListener);
    }

    public void removeVisibilityListener(AppLifecycleFacade.AppVisibilityListener appVisibilityListener) {
        this.mListeners.remove(appVisibilityListener);
    }

    /* access modifiers changed from: private */
    public synchronized void switchToVisible() {
        if (!this.mIsVisible) {
            this.mIsVisible = true;
            for (AppLifecycleFacade.AppVisibilityListener onAppVisible : this.mListeners) {
                onAppVisible.onAppVisible();
            }
        }
    }

    /* access modifiers changed from: private */
    public synchronized void switchToInvisible() {
        if (this.mIsVisible) {
            this.mIsVisible = false;
            for (AppLifecycleFacade.AppVisibilityListener onAppNotVisible : this.mListeners) {
                onAppNotVisible.onAppNotVisible();
            }
        }
    }

    private synchronized void switchToDestroyed() {
        switchToInvisible();
        if (!this.mIsDestroyed) {
            this.mIsDestroyed = true;
        }
    }
}
