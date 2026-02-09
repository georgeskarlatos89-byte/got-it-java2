package com.braintreepayments.api;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/braintreepayments/api/ConfigurationLoader;", "", "context", "Landroid/content/Context;", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "(Landroid/content/Context;Lcom/braintreepayments/api/BraintreeHttpClient;)V", "configurationCache", "Lcom/braintreepayments/api/ConfigurationCache;", "(Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/ConfigurationCache;)V", "getCachedConfiguration", "Lcom/braintreepayments/api/Configuration;", "authorization", "Lcom/braintreepayments/api/Authorization;", "configUrl", "", "loadConfiguration", "", "callback", "Lcom/braintreepayments/api/ConfigurationLoaderCallback;", "saveConfigurationToCache", "configuration", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: ConfigurationLoader.kt */
public final class ConfigurationLoader {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ConfigurationCache configurationCache;
    private final BraintreeHttpClient httpClient;

    public ConfigurationLoader(BraintreeHttpClient braintreeHttpClient, ConfigurationCache configurationCache2) {
        Intrinsics.checkNotNullParameter(braintreeHttpClient, "httpClient");
        Intrinsics.checkNotNullParameter(configurationCache2, "configurationCache");
        this.httpClient = braintreeHttpClient;
        this.configurationCache = configurationCache2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConfigurationLoader(Context context, BraintreeHttpClient braintreeHttpClient) {
        this(braintreeHttpClient, ConfigurationCache.Companion.getInstance(context));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(braintreeHttpClient, "httpClient");
    }

    public final void loadConfiguration(Authorization authorization, ConfigurationLoaderCallback configurationLoaderCallback) {
        Intrinsics.checkNotNullParameter(authorization, AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION);
        Intrinsics.checkNotNullParameter(configurationLoaderCallback, "callback");
        Unit unit = null;
        if (authorization instanceof InvalidAuthorization) {
            configurationLoaderCallback.onResult((Configuration) null, new BraintreeException(((InvalidAuthorization) authorization).getErrorMessage(), (Throwable) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        String uri = Uri.parse(authorization.getConfigUrl()).buildUpon().appendQueryParameter("configVersion", ExifInterface.GPS_MEASUREMENT_3D).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "parse(authorization.conf…)\n            .toString()");
        Configuration cachedConfiguration = getCachedConfiguration(authorization, uri);
        if (cachedConfiguration != null) {
            configurationLoaderCallback.onResult(cachedConfiguration, (Exception) null);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ConfigurationLoader configurationLoader = this;
            this.httpClient.get(uri, (Configuration) null, authorization, 1, new ConfigurationLoader$loadConfiguration$2$1(this, authorization, uri, configurationLoaderCallback));
        }
    }

    /* access modifiers changed from: private */
    public final void saveConfigurationToCache(Configuration configuration, Authorization authorization, String str) {
        this.configurationCache.saveConfiguration(configuration, Companion.createCacheKey(authorization, str));
    }

    private final Configuration getCachedConfiguration(Authorization authorization, String str) {
        try {
            return Configuration.Companion.fromJson(this.configurationCache.getConfiguration(Companion.createCacheKey(authorization, str)));
        } catch (JSONException unused) {
            Configuration configuration = null;
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/ConfigurationLoader$Companion;", "", "()V", "createCacheKey", "", "authorization", "Lcom/braintreepayments/api/Authorization;", "configUrl", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: ConfigurationLoader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String createCacheKey(Authorization authorization, String str) {
            byte[] bytes = (str + authorization.getBearer()).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            String encodeToString = Base64.encodeToString(bytes, 0);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(\"$configU…earer}\".toByteArray(), 0)");
            return encodeToString;
        }
    }
}
