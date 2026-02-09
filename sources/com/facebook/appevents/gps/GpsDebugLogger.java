package com.facebook.appevents.gps;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/gps/GpsDebugLogger;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "internalAppEventsLogger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "isGPSDebugEvent", "", "eventName", "", "log", "", "parameters", "Landroid/os/Bundle;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: GpsDebugLogger.kt */
public final class GpsDebugLogger {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String GPS_PREFIX = "gps";
    private static final double LOGGING_SAMPLING_RATE = 1.0E-4d;
    private static final boolean shouldLog = (Random.Default.nextDouble() <= LOGGING_SAMPLING_RATE);
    private final InternalAppEventsLogger internalAppEventsLogger;

    public GpsDebugLogger(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.internalAppEventsLogger = new InternalAppEventsLogger(context);
    }

    public final void log(String str, Bundle bundle) {
        if (shouldLog && isGPSDebugEvent(str)) {
            this.internalAppEventsLogger.logEventImplicitly(str, bundle);
        }
    }

    private final boolean isGPSDebugEvent(String str) {
        if (str != null) {
            return StringsKt.contains$default((CharSequence) str, (CharSequence) GPS_PREFIX, false, 2, (Object) null);
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/gps/GpsDebugLogger$Companion;", "", "()V", "GPS_PREFIX", "", "LOGGING_SAMPLING_RATE", "", "shouldLog", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: GpsDebugLogger.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
