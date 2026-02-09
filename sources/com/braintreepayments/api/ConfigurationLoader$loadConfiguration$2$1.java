package com.braintreepayments.api;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0016¨\u0006\t"}, d2 = {"com/braintreepayments/api/ConfigurationLoader$loadConfiguration$2$1", "Lcom/braintreepayments/api/HttpResponseCallback;", "onResult", "", "responseBody", "", "httpError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: ConfigurationLoader.kt */
public final class ConfigurationLoader$loadConfiguration$2$1 implements HttpResponseCallback {
    final /* synthetic */ Authorization $authorization;
    final /* synthetic */ ConfigurationLoaderCallback $callback;
    final /* synthetic */ String $configUrl;
    final /* synthetic */ ConfigurationLoader $this_run;

    ConfigurationLoader$loadConfiguration$2$1(ConfigurationLoader configurationLoader, Authorization authorization, String str, ConfigurationLoaderCallback configurationLoaderCallback) {
        this.$this_run = configurationLoader;
        this.$authorization = authorization;
        this.$configUrl = str;
        this.$callback = configurationLoaderCallback;
    }

    public void onResult(String str, Exception exc) {
        if (str != null) {
            ConfigurationLoader configurationLoader = this.$this_run;
            Authorization authorization = this.$authorization;
            String str2 = this.$configUrl;
            ConfigurationLoaderCallback configurationLoaderCallback = this.$callback;
            try {
                Configuration fromJson = Configuration.Companion.fromJson(str);
                configurationLoader.saveConfigurationToCache(fromJson, authorization, str2);
                configurationLoaderCallback.onResult(fromJson, (Exception) null);
            } catch (JSONException e) {
                configurationLoaderCallback.onResult((Configuration) null, e);
            }
        } else if (exc != null) {
            ConfigurationLoaderCallback configurationLoaderCallback2 = this.$callback;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("Request for configuration has failed: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            configurationLoaderCallback2.onResult((Configuration) null, new ConfigurationException(format, exc));
        }
    }
}
