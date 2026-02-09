package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.OptionsContainer;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;

public final class SentryAndroid {
    static final String SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME = "io.sentry.android.fragment.FragmentLifecycleIntegration";
    static final String SENTRY_TIMBER_INTEGRATION_CLASS_NAME = "io.sentry.android.timber.SentryTimberIntegration";
    private static final long appStart = SystemClock.uptimeMillis();
    private static final Date appStartTime = DateUtils.getCurrentDateTime();

    static /* synthetic */ void lambda$init$0(SentryAndroidOptions sentryAndroidOptions) {
    }

    private SentryAndroid() {
    }

    public static void init(Context context) {
        init(context, (ILogger) new AndroidLogger());
    }

    public static void init(Context context, ILogger iLogger) {
        init(context, iLogger, new SentryAndroid$$ExternalSyntheticLambda1());
    }

    public static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, new AndroidLogger(), optionsConfiguration);
    }

    public static synchronized void init(Context context, ILogger iLogger, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        synchronized (SentryAndroid.class) {
            AppStartState.getInstance().setAppStartTime(appStart, appStartTime);
            try {
                Sentry.init(OptionsContainer.create(SentryAndroidOptions.class), new SentryAndroid$$ExternalSyntheticLambda0(context, iLogger, optionsConfiguration), true);
            } catch (IllegalAccessException e) {
                iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e);
            } catch (InstantiationException e2) {
                iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e2);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
            } catch (NoSuchMethodException e3) {
                iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e3);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
            } catch (InvocationTargetException e4) {
                iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", (Throwable) e4);
                throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
            }
        }
    }

    static /* synthetic */ void lambda$init$1(Context context, ILogger iLogger, Sentry.OptionsConfiguration optionsConfiguration, SentryAndroidOptions sentryAndroidOptions) {
        LoadClass loadClass = new LoadClass();
        boolean isClassAvailable = loadClass.isClassAvailable(SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME, (SentryOptions) sentryAndroidOptions);
        boolean isClassAvailable2 = loadClass.isClassAvailable(SENTRY_TIMBER_INTEGRATION_CLASS_NAME, (SentryOptions) sentryAndroidOptions);
        AndroidOptionsInitializer.init(sentryAndroidOptions, context, iLogger, isClassAvailable, isClassAvailable2);
        optionsConfiguration.configure(sentryAndroidOptions);
        deduplicateIntegrations(sentryAndroidOptions, isClassAvailable, isClassAvailable2);
    }

    private static void deduplicateIntegrations(SentryOptions sentryOptions, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Integration next : sentryOptions.getIntegrations()) {
            if (z && (next instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(next);
            }
            if (z2 && (next instanceof SentryTimberIntegration)) {
                arrayList.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList.get(i2));
            }
        }
    }
}
