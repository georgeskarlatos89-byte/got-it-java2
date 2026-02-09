package com.reactnativenavigation.react;

import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import javax.annotation.Nullable;

public abstract class ReloadHandlerFacade implements DevBundleDownloadListener {
    public void onFailure(Exception exc) {
    }

    public void onProgress(@Nullable String str, @Nullable Integer num, @Nullable Integer num2) {
    }

    public void onSuccess() {
    }
}
