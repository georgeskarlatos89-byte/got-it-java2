package com.reactnativenavigation.react;

import com.reactnativenavigation.react.JsDevReloadHandler;

public class ReloadHandler extends ReloadHandlerFacade implements JsDevReloadHandler.ReloadListener {
    private Runnable onReloadListener = new ReloadHandler$$ExternalSyntheticLambda0();

    static /* synthetic */ void lambda$new$0() {
    }

    public void setOnReloadListener(Runnable runnable) {
        this.onReloadListener = runnable;
    }

    public void onReload() {
        this.onReloadListener.run();
    }

    public void onSuccess() {
        this.onReloadListener.run();
    }

    public void destroy() {
        this.onReloadListener = null;
    }
}
