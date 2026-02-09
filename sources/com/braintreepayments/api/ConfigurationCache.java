package com.braintreepayments.api;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/braintreepayments/api/ConfigurationCache;", "", "sharedPreferences", "Lcom/braintreepayments/api/BraintreeSharedPreferences;", "(Lcom/braintreepayments/api/BraintreeSharedPreferences;)V", "getConfiguration", "", "cacheKey", "currentTimeMillis", "", "saveConfiguration", "", "configuration", "Lcom/braintreepayments/api/Configuration;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: ConfigurationCache.kt */
public final class ConfigurationCache {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static volatile ConfigurationCache INSTANCE;
    private static final long TIME_TO_LIVE = TimeUnit.MINUTES.toMillis(5);
    private final BraintreeSharedPreferences sharedPreferences;

    public ConfigurationCache(BraintreeSharedPreferences braintreeSharedPreferences) {
        Intrinsics.checkNotNullParameter(braintreeSharedPreferences, "sharedPreferences");
        this.sharedPreferences = braintreeSharedPreferences;
    }

    public final String getConfiguration(String str) {
        Intrinsics.checkNotNullParameter(str, "cacheKey");
        return getConfiguration(str, System.currentTimeMillis());
    }

    public final String getConfiguration(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "cacheKey");
        String str2 = str + "_timestamp";
        if (!this.sharedPreferences.containsKey(str2) || j - this.sharedPreferences.getLong(str2) >= TIME_TO_LIVE) {
            return null;
        }
        return this.sharedPreferences.getString(str, "");
    }

    public final void saveConfiguration(Configuration configuration, String str) {
        Intrinsics.checkNotNullParameter(configuration, AnalyticsClient.WORK_INPUT_KEY_CONFIGURATION);
        saveConfiguration(configuration, str, System.currentTimeMillis());
    }

    public final void saveConfiguration(Configuration configuration, String str, long j) {
        Intrinsics.checkNotNullParameter(configuration, AnalyticsClient.WORK_INPUT_KEY_CONFIGURATION);
        String str2 = str;
        this.sharedPreferences.putStringAndLong(str2, configuration.toJson(), str + "_timestamp", j);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braintreepayments/api/ConfigurationCache$Companion;", "", "()V", "INSTANCE", "Lcom/braintreepayments/api/ConfigurationCache;", "TIME_TO_LIVE", "", "getInstance", "context", "Landroid/content/Context;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: ConfigurationCache.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConfigurationCache getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ConfigurationCache access$getINSTANCE$cp = ConfigurationCache.INSTANCE;
            if (access$getINSTANCE$cp == null) {
                synchronized (this) {
                    access$getINSTANCE$cp = ConfigurationCache.INSTANCE;
                    if (access$getINSTANCE$cp == null) {
                        BraintreeSharedPreferences instance = BraintreeSharedPreferences.getInstance(context);
                        Intrinsics.checkNotNullExpressionValue(instance, "getInstance(context)");
                        access$getINSTANCE$cp = new ConfigurationCache(instance);
                        Companion companion = ConfigurationCache.Companion;
                        ConfigurationCache.INSTANCE = access$getINSTANCE$cp;
                    }
                }
            }
            return access$getINSTANCE$cp;
        }
    }
}
