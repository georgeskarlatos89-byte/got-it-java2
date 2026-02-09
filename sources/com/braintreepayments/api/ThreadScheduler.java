package com.braintreepayments.api;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadScheduler implements Scheduler {
    private final ExecutorService backgroundThreadService;
    private final Handler mainThreadHandler;

    ThreadScheduler() {
        this(new Handler(Looper.getMainLooper()), Executors.newCachedThreadPool());
    }

    ThreadScheduler(Handler handler, ExecutorService executorService) {
        this.mainThreadHandler = handler;
        this.backgroundThreadService = executorService;
    }

    public void runOnBackground(Runnable runnable) {
        this.backgroundThreadService.submit(runnable);
    }

    public void runOnMain(Runnable runnable) {
        this.mainThreadHandler.post(runnable);
    }
}
