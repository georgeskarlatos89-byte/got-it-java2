package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentManager;", "", "()V", "start", "", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: InstrumentManager.kt */
public final class InstrumentManager {
    public static final InstrumentManager INSTANCE = new InstrumentManager();

    private InstrumentManager() {
    }

    @JvmStatic
    public static final void start() {
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, new InstrumentManager$$ExternalSyntheticLambda0());
            FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new InstrumentManager$$ExternalSyntheticLambda1());
            FeatureManager.checkFeature(FeatureManager.Feature.AnrReport, new InstrumentManager$$ExternalSyntheticLambda2());
        }
    }

    /* access modifiers changed from: private */
    public static final void start$lambda$0(boolean z) {
        if (z) {
            CrashHandler.Companion.enable();
            if (FeatureManager.isEnabled(FeatureManager.Feature.CrashShield)) {
                ExceptionAnalyzer.enable();
                CrashShieldHandler.enable();
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.ThreadCheck)) {
                ThreadCheckHandler.enable();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void start$lambda$1(boolean z) {
        if (z) {
            ErrorReportHandler.enable();
        }
    }

    /* access modifiers changed from: private */
    public static final void start$lambda$2(boolean z) {
        if (z) {
            ANRHandler.enable();
        }
    }
}
