package com.mrousavy.camera.frameprocessor;

import androidx.camera.core.ImageProxy;

public abstract class FrameProcessorPlugin {
    private final String mName;

    public abstract Object callback(ImageProxy imageProxy, Object[] objArr);

    protected FrameProcessorPlugin(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }

    public static void register(FrameProcessorPlugin frameProcessorPlugin) {
        FrameProcessorRuntimeManager.Companion.getPlugins().add(frameProcessorPlugin);
    }
}
