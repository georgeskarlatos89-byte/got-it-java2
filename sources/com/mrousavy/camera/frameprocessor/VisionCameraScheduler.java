package com.mrousavy.camera.frameprocessor;

import com.facebook.jni.HybridData;
import java.util.concurrent.ExecutorService;

public class VisionCameraScheduler {
    private final ExecutorService frameProcessorThread;
    private final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public VisionCameraScheduler(ExecutorService executorService) {
        this.frameProcessorThread = executorService;
    }

    private void scheduleOnUI(Runnable runnable) {
        this.frameProcessorThread.submit(runnable);
    }
}
