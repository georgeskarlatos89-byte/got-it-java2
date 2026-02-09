package ai.gotit.giap.service;

import ai.gotit.giap.GIAP;
import android.os.Process;
import java.lang.Thread;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final int SLEEP_TIMEOUT_MS = 400;
    private final Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private GIAP giapInstance;

    public ExceptionHandler(GIAP giap) {
        this.giapInstance = giap;
        this.defaultExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static ExceptionHandler makeInstance(GIAP giap) {
        return new ExceptionHandler(giap);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.giapInstance.onUncaughtException();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultExceptionHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            killProcessAndExit();
        }
    }

    private void killProcessAndExit() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        exit();
    }

    /* access modifiers changed from: package-private */
    public void exit() {
        System.exit(10);
    }
}
