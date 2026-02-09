package com.reactnativenavigation.react;

import com.reactnativenavigation.react.JsDevReloadHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class JsDevReloadHandler$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ JsDevReloadHandler.ReloadListener f$0;

    public /* synthetic */ JsDevReloadHandler$$ExternalSyntheticLambda1(JsDevReloadHandler.ReloadListener reloadListener) {
        this.f$0 = reloadListener;
    }

    public final void run() {
        this.f$0.onReload();
    }
}
