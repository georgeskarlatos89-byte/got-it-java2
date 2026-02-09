package com.braintreepayments.api;

import android.net.Uri;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J5\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J*\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpClient;", "", "httpClient", "Lcom/braintreepayments/api/HttpClient;", "(Lcom/braintreepayments/api/HttpClient;)V", "get", "", "path", "", "configuration", "Lcom/braintreepayments/api/Configuration;", "authorization", "Lcom/braintreepayments/api/Authorization;", "callback", "Lcom/braintreepayments/api/HttpResponseCallback;", "retryStrategy", "", "post", "data", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeHttpClient.kt */
public final class BraintreeHttpClient {
    private static final String AUTHORIZATION_FINGERPRINT_KEY = "authorizationFingerprint";
    private static final String CLIENT_KEY_HEADER = "Client-Key";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String USER_AGENT_HEADER = "User-Agent";
    private final HttpClient httpClient;

    public BraintreeHttpClient() {
        this((HttpClient) null, 1, (DefaultConstructorMarker) null);
    }

    public BraintreeHttpClient(HttpClient httpClient2) {
        Intrinsics.checkNotNullParameter(httpClient2, "httpClient");
        this.httpClient = httpClient2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BraintreeHttpClient(HttpClient httpClient2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Companion.createDefaultHttpClient() : httpClient2);
    }

    public final void get(String str, Configuration configuration, Authorization authorization, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
        Intrinsics.checkNotNullParameter(httpResponseCallback, "callback");
        get(str, configuration, authorization, 0, httpResponseCallback);
    }

    public final void get(String str, Configuration configuration, Authorization authorization, int i, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
        Intrinsics.checkNotNullParameter(httpResponseCallback, "callback");
        if (authorization instanceof InvalidAuthorization) {
            httpResponseCallback.onResult((String) null, new BraintreeException(((InvalidAuthorization) authorization).getErrorMessage(), (Throwable) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        boolean z = !StringsKt.startsWith$default(str, "http", false, 2, (Object) null);
        if (configuration != null || !z) {
            if (authorization instanceof ClientToken) {
                str = Uri.parse(str).buildUpon().appendQueryParameter(AUTHORIZATION_FINGERPRINT_KEY, ((ClientToken) authorization).getBearer()).toString();
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (authorization is Cli…           path\n        }");
            HttpRequest addHeader = new HttpRequest().method("GET").path(str).addHeader("User-Agent", "braintree/android/4.45.0");
            if (z && configuration != null) {
                addHeader.baseUrl(configuration.getClientApiUrl());
            }
            if (authorization instanceof TokenizationKey) {
                addHeader.addHeader(CLIENT_KEY_HEADER, ((TokenizationKey) authorization).getBearer());
            }
            this.httpClient.sendRequest(addHeader, i, httpResponseCallback);
            return;
        }
        httpResponseCallback.onResult((String) null, new BraintreeException("Braintree HTTP GET request without configuration cannot have a relative path.", (Throwable) null, 2, (DefaultConstructorMarker) null));
    }

    public final void post(String str, String str2, Configuration configuration, Authorization authorization, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
        Intrinsics.checkNotNullParameter(str2, "data");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "callback");
        if (authorization instanceof InvalidAuthorization) {
            httpResponseCallback.onResult((String) null, new BraintreeException(((InvalidAuthorization) authorization).getErrorMessage(), (Throwable) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        boolean z = !StringsKt.startsWith$default(str, "http", false, 2, (Object) null);
        if (configuration != null || !z) {
            if (authorization instanceof ClientToken) {
                try {
                    str2 = new JSONObject(str2).put(AUTHORIZATION_FINGERPRINT_KEY, ((ClientToken) authorization).getAuthorizationFingerprint()).toString();
                } catch (JSONException e) {
                    httpResponseCallback.onResult((String) null, e);
                    return;
                }
            }
            Intrinsics.checkNotNullExpressionValue(str2, "if (authorization is Cli…           data\n        }");
            HttpRequest addHeader = new HttpRequest().method("POST").path(str).data(str2).addHeader("User-Agent", "braintree/android/4.45.0");
            if (z && configuration != null) {
                addHeader.baseUrl(configuration.getClientApiUrl());
            }
            if (authorization instanceof TokenizationKey) {
                addHeader.addHeader(CLIENT_KEY_HEADER, ((TokenizationKey) authorization).getBearer());
            }
            this.httpClient.sendRequest(addHeader, httpResponseCallback);
            return;
        }
        httpResponseCallback.onResult((String) null, new BraintreeException("Braintree HTTP GET request without configuration cannot have a relative path.", (Throwable) null, 2, (DefaultConstructorMarker) null));
    }

    public final String post(String str, String str2, Configuration configuration, Authorization authorization) throws Exception {
        Intrinsics.checkNotNullParameter(str, ClientCookie.PATH_ATTR);
        Intrinsics.checkNotNullParameter(str2, "data");
        if (!(authorization instanceof InvalidAuthorization)) {
            boolean z = !StringsKt.startsWith$default(str, "http", false, 2, (Object) null);
            if (configuration != null || !z) {
                if (authorization instanceof ClientToken) {
                    str2 = new JSONObject(str2).put(AUTHORIZATION_FINGERPRINT_KEY, ((ClientToken) authorization).getAuthorizationFingerprint()).toString();
                }
                Intrinsics.checkNotNullExpressionValue(str2, "if (authorization is Cli…           data\n        }");
                HttpRequest addHeader = new HttpRequest().method("POST").path(str).data(str2).addHeader("User-Agent", "braintree/android/4.45.0");
                if (z && configuration != null) {
                    addHeader.baseUrl(configuration.getClientApiUrl());
                }
                if (authorization instanceof TokenizationKey) {
                    addHeader.addHeader(CLIENT_KEY_HEADER, ((TokenizationKey) authorization).getBearer());
                }
                String sendRequest = this.httpClient.sendRequest(addHeader);
                Intrinsics.checkNotNullExpressionValue(sendRequest, "httpClient.sendRequest(request)");
                return sendRequest;
            }
            throw new BraintreeException("Braintree HTTP GET request without configuration cannot have a relative path.", (Throwable) null, 2, (DefaultConstructorMarker) null);
        }
        throw new BraintreeException(((InvalidAuthorization) authorization).getErrorMessage(), (Throwable) null, 2, (DefaultConstructorMarker) null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpClient$Companion;", "", "()V", "AUTHORIZATION_FINGERPRINT_KEY", "", "CLIENT_KEY_HEADER", "USER_AGENT_HEADER", "createDefaultHttpClient", "Lcom/braintreepayments/api/HttpClient;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: BraintreeHttpClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final HttpClient createDefaultHttpClient() {
            return new HttpClient((SSLSocketFactory) new TLSSocketFactory(TLSCertificatePinning.INSTANCE.getCertInputStream()), (HttpResponseParser) new BraintreeHttpResponseParser((HttpResponseParser) null, 1, (DefaultConstructorMarker) null));
        }
    }
}
