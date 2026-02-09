package com.braintreepayments.api;

interface Scheduler {
    void runOnBackground(Runnable runnable);

    void runOnMain(Runnable runnable);
}
