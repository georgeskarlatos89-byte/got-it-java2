package com.braintreepayments.api;

import com.braintreepayments.api.GraphQLConstants;
import java.util.Arrays;
import java.util.Locale;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ*\u0010\u0005\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ2\u0010\u0005\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/braintreepayments/api/BraintreeGraphQLClient;", "", "httpClient", "Lcom/braintreepayments/api/HttpClient;", "(Lcom/braintreepayments/api/HttpClient;)V", "post", "", "data", "", "configuration", "Lcom/braintreepayments/api/Configuration;", "authorization", "Lcom/braintreepayments/api/Authorization;", "callback", "Lcom/braintreepayments/api/HttpResponseCallback;", "path", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeGraphQLClient.kt */
public final class BraintreeGraphQLClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final HttpClient httpClient;

    public BraintreeGraphQLClient() {
        this((HttpClient) null, 1, (DefaultConstructorMarker) null);
    }

    public BraintreeGraphQLClient(HttpClient httpClient2) {
        Intrinsics.checkNotNullParameter(httpClient2, "httpClient");
        this.httpClient = httpClient2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BraintreeGraphQLClient(HttpClient httpClient2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Companion.createDefaultHttpClient() : httpClient2);
    }

    public final void post(String str, String str2, Configuration configuration, Authorization authorization, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(configuration, AnalyticsClient.WORK_INPUT_KEY_CONFIGURATION);
        Intrinsics.checkNotNullParameter(authorization, AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION);
        Intrinsics.checkNotNullParameter(httpResponseCallback, "callback");
        if (authorization instanceof InvalidAuthorization) {
            httpResponseCallback.onResult((String) null, new BraintreeException(((InvalidAuthorization) authorization).getErrorMessage(), (Throwable) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        HttpRequest addHeader = new HttpRequest().method("POST").path(str).data(str2).baseUrl(configuration.getGraphQLUrl()).addHeader("User-Agent", "braintree/android/4.45.0");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "Bearer %s", Arrays.copyOf(new Object[]{authorization.getBearer()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        this.httpClient.sendRequest(addHeader.addHeader("Authorization", format).addHeader("Braintree-Version", GraphQLConstants.Headers.API_VERSION), httpResponseCallback);
    }

    public final void post(String str, Configuration configuration, Authorization authorization, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(configuration, AnalyticsClient.WORK_INPUT_KEY_CONFIGURATION);
        Intrinsics.checkNotNullParameter(authorization, AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION);
        Intrinsics.checkNotNullParameter(httpResponseCallback, "callback");
        if (authorization instanceof InvalidAuthorization) {
            httpResponseCallback.onResult((String) null, new BraintreeException(((InvalidAuthorization) authorization).getErrorMessage(), (Throwable) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        HttpRequest addHeader = new HttpRequest().method("POST").path("").data(str).baseUrl(configuration.getGraphQLUrl()).addHeader("User-Agent", "braintree/android/4.45.0");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "Bearer %s", Arrays.copyOf(new Object[]{authorization.getBearer()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        this.httpClient.sendRequest(addHeader.addHeader("Authorization", format).addHeader("Braintree-Version", GraphQLConstants.Headers.API_VERSION), httpResponseCallback);
    }

    public final String post(String str, String str2, Configuration configuration, Authorization authorization) throws Exception {
        Intrinsics.checkNotNullParameter(configuration, AnalyticsClient.WORK_INPUT_KEY_CONFIGURATION);
        Intrinsics.checkNotNullParameter(authorization, AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION);
        if (!(authorization instanceof InvalidAuthorization)) {
            HttpRequest addHeader = new HttpRequest().method("POST").path(str).data(str2).baseUrl(configuration.getGraphQLUrl()).addHeader("User-Agent", "braintree/android/4.45.0");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "Bearer %s", Arrays.copyOf(new Object[]{authorization.getBearer()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
            String sendRequest = this.httpClient.sendRequest(addHeader.addHeader("Authorization", format).addHeader("Braintree-Version", GraphQLConstants.Headers.API_VERSION));
            Intrinsics.checkNotNullExpressionValue(sendRequest, "httpClient.sendRequest(request)");
            return sendRequest;
        }
        throw new BraintreeException(((InvalidAuthorization) authorization).getErrorMessage(), (Throwable) null, 2, (DefaultConstructorMarker) null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"Lcom/braintreepayments/api/BraintreeGraphQLClient$Companion;", "", "()V", "createDefaultHttpClient", "Lcom/braintreepayments/api/HttpClient;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: BraintreeGraphQLClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final HttpClient createDefaultHttpClient() {
            return new HttpClient((SSLSocketFactory) new TLSSocketFactory(TLSCertificatePinning.INSTANCE.getCertInputStream()), (HttpResponseParser) new BraintreeGraphQLResponseParser());
        }
    }
}
