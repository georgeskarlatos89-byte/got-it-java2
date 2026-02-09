package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;

public final class AppStartState {
    private static AppStartState instance = new AppStartState();
    private Long appStartEndMillis;
    private Long appStartMillis;
    private Date appStartTime;
    private Boolean coldStart = null;

    private AppStartState() {
    }

    public static AppStartState getInstance() {
        return instance;
    }

    /* access modifiers changed from: package-private */
    public void resetInstance() {
        instance = new AppStartState();
    }

    /* access modifiers changed from: package-private */
    public synchronized void setAppStartEnd() {
        setAppStartEnd(SystemClock.uptimeMillis());
    }

    /* access modifiers changed from: package-private */
    public void setAppStartEnd(long j) {
        this.appStartEndMillis = Long.valueOf(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Long getAppStartInterval() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.Long r0 = r4.appStartMillis     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001f
            java.lang.Long r0 = r4.appStartEndMillis     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001f
            java.lang.Boolean r1 = r4.coldStart     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x000e
            goto L_0x001f
        L_0x000e:
            long r0 = r0.longValue()     // Catch:{ all -> 0x0022 }
            java.lang.Long r2 = r4.appStartMillis     // Catch:{ all -> 0x0022 }
            long r2 = r2.longValue()     // Catch:{ all -> 0x0022 }
            long r0 = r0 - r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0022 }
            monitor-exit(r4)
            return r0
        L_0x001f:
            monitor-exit(r4)
            r0 = 0
            return r0
        L_0x0022:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.AppStartState.getAppStartInterval():java.lang.Long");
    }

    public Boolean isColdStart() {
        return this.coldStart;
    }

    /* access modifiers changed from: package-private */
    public synchronized void setColdStart(boolean z) {
        if (this.coldStart == null) {
            this.coldStart = Boolean.valueOf(z);
        }
    }

    public Date getAppStartTime() {
        return this.appStartTime;
    }

    /* access modifiers changed from: package-private */
    public synchronized void setAppStartTime(long j, Date date) {
        if (this.appStartTime == null || this.appStartMillis == null) {
            this.appStartTime = date;
            this.appStartMillis = Long.valueOf(j);
        }
    }
}
