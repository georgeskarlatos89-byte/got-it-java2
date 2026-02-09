package com.braintreepayments.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0002\u0010\u0012B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000b¢\u0006\u0002\u0010\u0015B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000b¢\u0006\u0002\u0010\u0016Bg\b\u0001\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0002\u0010'J\u001a\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u000206H\u0007J\u0010\u00107\u001a\u0002022\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u00108\u001a\u0004\u0018\u0001092\u0006\u00103\u001a\u000204H\u0016J\u0012\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010;\u001a\u0002022\u0006\u0010<\u001a\u00020=H\u0007J\u0012\u0010>\u001a\u0004\u0018\u0001092\u0006\u00103\u001a\u000204H\u0007J\u0012\u0010?\u001a\u0004\u0018\u0001092\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010@\u001a\u0002022\u0006\u0010<\u001a\u00020AH\u0016J \u0010B\u001a\u0004\u0018\u00010C\"\u0004\b\u0000\u0010D2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u0002HD\u0018\u00010FH\u0007J\b\u0010G\u001a\u00020\u000bH\u0007J\b\u0010H\u001a\u000202H\u0016J(\u0010I\u001a\u00020/\"\u0004\b\u0000\u0010D2\b\u0010J\u001a\u0004\u0018\u00010\u000b2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u0002HD\u0018\u00010FH\u0007J\u0006\u0010.\u001a\u00020/J\u0010\u0010.\u001a\u0002022\u0006\u0010.\u001a\u00020/H\u0016J$\u0010K\u001a\u0004\u0018\u0001092\u0006\u0010\b\u001a\u00020\t2\u0006\u00105\u001a\u0002062\b\u0010L\u001a\u0004\u0018\u00010MH\u0007J\u000f\u0010N\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0002\u0010OJ\"\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010T2\u0006\u0010\n\u001a\u00020UH\u0002J\u001c\u0010P\u001a\u0002022\u0006\u0010V\u001a\u00020\u000b2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020[H\u0007J\u001a\u0010\\\u001a\u0002022\b\u0010]\u001a\u0004\u0018\u00010\u000b2\u0006\u0010Z\u001a\u00020[H\u0007J \u0010^\u001a\u0002022\u0006\u0010Y\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020[H\u0007J\u001c\u0010`\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010a\u001a\u0004\u0018\u00010bH\u0007R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0017\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u00020\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-¨\u0006c"}, d2 = {"Lcom/braintreepayments/api/BraintreeClient;", "", "params", "Lcom/braintreepayments/api/BraintreeClientParams;", "(Lcom/braintreepayments/api/BraintreeClientParams;)V", "options", "Lcom/braintreepayments/api/BraintreeOptions;", "(Lcom/braintreepayments/api/BraintreeOptions;)V", "context", "Landroid/content/Context;", "authorization", "", "(Landroid/content/Context;Ljava/lang/String;)V", "clientTokenProvider", "Lcom/braintreepayments/api/ClientTokenProvider;", "(Landroid/content/Context;Lcom/braintreepayments/api/ClientTokenProvider;)V", "returnUrlScheme", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/content/Context;Lcom/braintreepayments/api/ClientTokenProvider;Ljava/lang/String;)V", "sessionId", "integrationType", "(Landroid/content/Context;Lcom/braintreepayments/api/ClientTokenProvider;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "applicationContext", "authorizationLoader", "Lcom/braintreepayments/api/AuthorizationLoader;", "analyticsClient", "Lcom/braintreepayments/api/AnalyticsClient;", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "graphQLClient", "Lcom/braintreepayments/api/BraintreeGraphQLClient;", "browserSwitchClient", "Lcom/braintreepayments/api/BrowserSwitchClient;", "configurationLoader", "Lcom/braintreepayments/api/ConfigurationLoader;", "manifestValidator", "Lcom/braintreepayments/api/ManifestValidator;", "braintreeDeepLinkReturnUrlScheme", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/braintreepayments/api/AuthorizationLoader;Lcom/braintreepayments/api/AnalyticsClient;Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/BraintreeGraphQLClient;Lcom/braintreepayments/api/BrowserSwitchClient;Lcom/braintreepayments/api/ConfigurationLoader;Lcom/braintreepayments/api/ManifestValidator;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationContext", "()Landroid/content/Context;", "crashReporter", "Lcom/braintreepayments/api/CrashReporter;", "getIntegrationType", "()Ljava/lang/String;", "launchesBrowserSwitchAsNewTask", "", "getSessionId", "assertCanPerformBrowserSwitch", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "requestCode", "", "clearActiveBrowserSwitchRequests", "deliverBrowserSwitchResult", "Lcom/braintreepayments/api/BrowserSwitchResult;", "deliverBrowserSwitchResultFromNewTask", "getAuthorization", "callback", "Lcom/braintreepayments/api/AuthorizationCallback;", "getBrowserSwitchResult", "getBrowserSwitchResultFromNewTask", "getConfiguration", "Lcom/braintreepayments/api/ConfigurationCallback;", "getManifestActivityInfo", "Landroid/content/pm/ActivityInfo;", "T", "klass", "Ljava/lang/Class;", "getReturnUrlScheme", "invalidateClientToken", "isUrlSchemeDeclaredInAndroidManifest", "urlScheme", "parseBrowserSwitchResult", "intent", "Landroid/content/Intent;", "reportCrash", "()Lkotlin/Unit;", "sendAnalyticsEvent", "event", "Lcom/braintreepayments/api/AnalyticsEvent;", "configuration", "Lcom/braintreepayments/api/Configuration;", "Lcom/braintreepayments/api/Authorization;", "eventName", "payPalContextId", "sendGET", "url", "responseCallback", "Lcom/braintreepayments/api/HttpResponseCallback;", "sendGraphQLPOST", "payload", "sendPOST", "data", "startBrowserSwitch", "browserSwitchOptions", "Lcom/braintreepayments/api/BrowserSwitchOptions;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeClient.kt */
public class BraintreeClient {
    private final AnalyticsClient analyticsClient;
    private final Context applicationContext;
    private final AuthorizationLoader authorizationLoader;
    private final String braintreeDeepLinkReturnUrlScheme;
    private final BrowserSwitchClient browserSwitchClient;
    private final ConfigurationLoader configurationLoader;
    private final CrashReporter crashReporter;
    private final BraintreeGraphQLClient graphQLClient;
    private final BraintreeHttpClient httpClient;
    private final String integrationType;
    private boolean launchesBrowserSwitchAsNewTask;
    private final ManifestValidator manifestValidator;
    private final String returnUrlScheme;
    private final String sessionId;

    public final void sendAnalyticsEvent(String str) {
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
        sendAnalyticsEvent$default(this, str, (String) null, 2, (Object) null);
    }

    public BraintreeClient(Context context, String str, String str2, AuthorizationLoader authorizationLoader2, AnalyticsClient analyticsClient2, BraintreeHttpClient braintreeHttpClient, BraintreeGraphQLClient braintreeGraphQLClient, BrowserSwitchClient browserSwitchClient2, ConfigurationLoader configurationLoader2, ManifestValidator manifestValidator2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(str, "integrationType");
        Intrinsics.checkNotNullParameter(str2, AnalyticsClient.WORK_INPUT_KEY_SESSION_ID);
        Intrinsics.checkNotNullParameter(authorizationLoader2, "authorizationLoader");
        Intrinsics.checkNotNullParameter(analyticsClient2, "analyticsClient");
        Intrinsics.checkNotNullParameter(braintreeHttpClient, "httpClient");
        Intrinsics.checkNotNullParameter(braintreeGraphQLClient, "graphQLClient");
        Intrinsics.checkNotNullParameter(browserSwitchClient2, "browserSwitchClient");
        Intrinsics.checkNotNullParameter(configurationLoader2, "configurationLoader");
        Intrinsics.checkNotNullParameter(manifestValidator2, "manifestValidator");
        Intrinsics.checkNotNullParameter(str3, "returnUrlScheme");
        Intrinsics.checkNotNullParameter(str4, "braintreeDeepLinkReturnUrlScheme");
        this.applicationContext = context;
        this.integrationType = str;
        this.sessionId = str2;
        this.authorizationLoader = authorizationLoader2;
        this.analyticsClient = analyticsClient2;
        this.httpClient = braintreeHttpClient;
        this.graphQLClient = braintreeGraphQLClient;
        this.browserSwitchClient = browserSwitchClient2;
        this.configurationLoader = configurationLoader2;
        this.manifestValidator = manifestValidator2;
        this.returnUrlScheme = str3;
        this.braintreeDeepLinkReturnUrlScheme = str4;
        CrashReporter crashReporter2 = new CrashReporter(this);
        this.crashReporter = crashReporter2;
        crashReporter2.start();
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final String getIntegrationType() {
        return this.integrationType;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(BraintreeClientParams braintreeClientParams) {
        this(braintreeClientParams.getApplicationContext(), braintreeClientParams.getIntegrationType(), braintreeClientParams.getSessionId(), braintreeClientParams.getAuthorizationLoader(), braintreeClientParams.getAnalyticsClient(), braintreeClientParams.getHttpClient(), braintreeClientParams.getGraphQLClient(), braintreeClientParams.getBrowserSwitchClient(), braintreeClientParams.getConfigurationLoader(), braintreeClientParams.getManifestValidator(), braintreeClientParams.getReturnUrlScheme(), braintreeClientParams.getBraintreeReturnUrlScheme());
        Intrinsics.checkNotNullParameter(braintreeClientParams, NativeProtocol.WEB_DIALOG_PARAMS);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(BraintreeOptions braintreeOptions) {
        this(new BraintreeClientParams(braintreeOptions));
        Intrinsics.checkNotNullParameter(braintreeOptions, "options");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(Context context, String str) {
        this(new BraintreeOptions(context, (String) null, (String) null, str, (ClientTokenProvider) null, (String) null, 54, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(Context context, ClientTokenProvider clientTokenProvider) {
        this(new BraintreeOptions(context, (String) null, (String) null, (String) null, clientTokenProvider, (String) null, 46, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientTokenProvider, "clientTokenProvider");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(Context context, String str, String str2) {
        this(new BraintreeOptions(context, (String) null, str2, str, (ClientTokenProvider) null, (String) null, 50, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION);
        Intrinsics.checkNotNullParameter(str2, "returnUrlScheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(Context context, ClientTokenProvider clientTokenProvider, String str) {
        this(new BraintreeOptions(context, (String) null, str, (String) null, clientTokenProvider, (String) null, 42, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientTokenProvider, "clientTokenProvider");
        Intrinsics.checkNotNullParameter(str, "returnUrlScheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(Context context, ClientTokenProvider clientTokenProvider, String str, String str2) {
        this(new BraintreeOptions(context, str, (String) null, (String) null, clientTokenProvider, str2, 12, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientTokenProvider, "clientTokenProvider");
        Intrinsics.checkNotNullParameter(str2, "integrationType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeClient(Context context, String str, String str2, String str3) {
        this(new BraintreeOptions(context, str2, (String) null, str, (ClientTokenProvider) null, str3, 20, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_AUTHORIZATION);
        Intrinsics.checkNotNullParameter(str3, "integrationType");
    }

    public void getConfiguration(ConfigurationCallback configurationCallback) {
        Intrinsics.checkNotNullParameter(configurationCallback, "callback");
        getAuthorization(new BraintreeClient$$ExternalSyntheticLambda3(this, configurationCallback));
    }

    /* access modifiers changed from: private */
    /* renamed from: getConfiguration$lambda-1  reason: not valid java name */
    public static final void m339getConfiguration$lambda1(BraintreeClient braintreeClient, ConfigurationCallback configurationCallback, Authorization authorization, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(configurationCallback, "$callback");
        if (authorization != null) {
            braintreeClient.configurationLoader.loadConfiguration(authorization, new BraintreeClient$$ExternalSyntheticLambda9(configurationCallback));
        } else {
            configurationCallback.onResult((Configuration) null, exc);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: getConfiguration$lambda-1$lambda-0  reason: not valid java name */
    public static final void m340getConfiguration$lambda1$lambda0(ConfigurationCallback configurationCallback, Configuration configuration, Exception exc) {
        Intrinsics.checkNotNullParameter(configurationCallback, "$callback");
        if (configuration != null) {
            configurationCallback.onResult(configuration, (Exception) null);
        } else {
            configurationCallback.onResult((Configuration) null, exc);
        }
    }

    public final void getAuthorization(AuthorizationCallback authorizationCallback) {
        Intrinsics.checkNotNullParameter(authorizationCallback, "callback");
        this.authorizationLoader.loadAuthorization(authorizationCallback);
    }

    public static /* synthetic */ void sendAnalyticsEvent$default(BraintreeClient braintreeClient, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            braintreeClient.sendAnalyticsEvent(str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAnalyticsEvent");
    }

    public final void sendAnalyticsEvent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_EVENT_NAME);
        getAuthorization(new BraintreeClient$$ExternalSyntheticLambda10(this, str, str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: sendAnalyticsEvent$lambda-3  reason: not valid java name */
    public static final void m342sendAnalyticsEvent$lambda3(BraintreeClient braintreeClient, String str, String str2, Authorization authorization, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(str, "$eventName");
        if (authorization != null) {
            braintreeClient.getConfiguration(new BraintreeClient$$ExternalSyntheticLambda8(str, str2, braintreeClient, authorization));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendAnalyticsEvent$lambda-3$lambda-2  reason: not valid java name */
    public static final void m343sendAnalyticsEvent$lambda3$lambda2(String str, String str2, BraintreeClient braintreeClient, Authorization authorization, Configuration configuration, Exception exc) {
        Intrinsics.checkNotNullParameter(str, "$eventName");
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        braintreeClient.sendAnalyticsEvent(new AnalyticsEvent(str, str2, 0, 4, (DefaultConstructorMarker) null), configuration, authorization);
    }

    private final void sendAnalyticsEvent(AnalyticsEvent analyticsEvent, Configuration configuration, Authorization authorization) {
        if (configuration != null) {
            this.analyticsClient.sendEvent(configuration, analyticsEvent, this.sessionId, this.integrationType, authorization);
        }
    }

    public final void sendGET(String str, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "responseCallback");
        getAuthorization(new BraintreeClient$$ExternalSyntheticLambda0(this, httpResponseCallback, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: sendGET$lambda-6  reason: not valid java name */
    public static final void m344sendGET$lambda6(BraintreeClient braintreeClient, HttpResponseCallback httpResponseCallback, String str, Authorization authorization, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "$responseCallback");
        Intrinsics.checkNotNullParameter(str, "$url");
        if (authorization != null) {
            braintreeClient.getConfiguration(new BraintreeClient$$ExternalSyntheticLambda5(braintreeClient, str, authorization, httpResponseCallback));
        } else {
            httpResponseCallback.onResult((String) null, exc);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendGET$lambda-6$lambda-5  reason: not valid java name */
    public static final void m345sendGET$lambda6$lambda5(BraintreeClient braintreeClient, String str, Authorization authorization, HttpResponseCallback httpResponseCallback, Configuration configuration, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(str, "$url");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "$responseCallback");
        if (configuration != null) {
            braintreeClient.httpClient.get(str, configuration, authorization, httpResponseCallback);
        } else {
            httpResponseCallback.onResult((String) null, exc);
        }
    }

    public final void sendPOST(String str, String str2, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "data");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "responseCallback");
        getAuthorization(new BraintreeClient$$ExternalSyntheticLambda2(this, httpResponseCallback, str, str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: sendPOST$lambda-8  reason: not valid java name */
    public static final void m348sendPOST$lambda8(BraintreeClient braintreeClient, HttpResponseCallback httpResponseCallback, String str, String str2, Authorization authorization, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "$responseCallback");
        Intrinsics.checkNotNullParameter(str, "$url");
        Intrinsics.checkNotNullParameter(str2, "$data");
        if (authorization != null) {
            braintreeClient.getConfiguration(new BraintreeClient$$ExternalSyntheticLambda1(braintreeClient, str, str2, authorization, httpResponseCallback));
        } else {
            httpResponseCallback.onResult((String) null, exc);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendPOST$lambda-8$lambda-7  reason: not valid java name */
    public static final void m349sendPOST$lambda8$lambda7(BraintreeClient braintreeClient, String str, String str2, Authorization authorization, HttpResponseCallback httpResponseCallback, Configuration configuration, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(str, "$url");
        Intrinsics.checkNotNullParameter(str2, "$data");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "$responseCallback");
        if (configuration != null) {
            braintreeClient.httpClient.post(str, str2, configuration, authorization, httpResponseCallback);
        } else {
            httpResponseCallback.onResult((String) null, exc);
        }
    }

    public final void sendGraphQLPOST(String str, HttpResponseCallback httpResponseCallback) {
        Intrinsics.checkNotNullParameter(httpResponseCallback, "responseCallback");
        getAuthorization(new BraintreeClient$$ExternalSyntheticLambda6(this, httpResponseCallback, str));
    }

    /* access modifiers changed from: private */
    /* renamed from: sendGraphQLPOST$lambda-10  reason: not valid java name */
    public static final void m346sendGraphQLPOST$lambda10(BraintreeClient braintreeClient, HttpResponseCallback httpResponseCallback, String str, Authorization authorization, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "$responseCallback");
        if (authorization != null) {
            braintreeClient.getConfiguration(new BraintreeClient$$ExternalSyntheticLambda7(braintreeClient, str, authorization, httpResponseCallback));
        } else {
            httpResponseCallback.onResult((String) null, exc);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendGraphQLPOST$lambda-10$lambda-9  reason: not valid java name */
    public static final void m347sendGraphQLPOST$lambda10$lambda9(BraintreeClient braintreeClient, String str, Authorization authorization, HttpResponseCallback httpResponseCallback, Configuration configuration, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(httpResponseCallback, "$responseCallback");
        if (configuration != null) {
            braintreeClient.graphQLClient.post(str, configuration, authorization, httpResponseCallback);
        } else {
            httpResponseCallback.onResult((String) null, exc);
        }
    }

    public final void startBrowserSwitch(FragmentActivity fragmentActivity, BrowserSwitchOptions browserSwitchOptions) throws BrowserSwitchException {
        if (fragmentActivity != null && browserSwitchOptions != null) {
            this.browserSwitchClient.start(fragmentActivity, browserSwitchOptions);
        }
    }

    public final BrowserSwitchResult getBrowserSwitchResult(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        return this.browserSwitchClient.getResult(fragmentActivity);
    }

    public BrowserSwitchResult deliverBrowserSwitchResult(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        return this.browserSwitchClient.deliverResult(fragmentActivity);
    }

    public final BrowserSwitchResult getBrowserSwitchResultFromNewTask(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.browserSwitchClient.getResultFromCache(context);
    }

    public BrowserSwitchResult deliverBrowserSwitchResultFromNewTask(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.browserSwitchClient.deliverResultFromCache(context);
    }

    public final BrowserSwitchResult parseBrowserSwitchResult(Context context, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.browserSwitchClient.parseResult(context, i, intent);
    }

    public final void clearActiveBrowserSwitchRequests(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.browserSwitchClient.clearActiveRequests(context);
    }

    public final String getReturnUrlScheme() {
        if (this.launchesBrowserSwitchAsNewTask) {
            return this.braintreeDeepLinkReturnUrlScheme;
        }
        return this.returnUrlScheme;
    }

    public final void assertCanPerformBrowserSwitch(FragmentActivity fragmentActivity, int i) throws BrowserSwitchException {
        Uri parse = Uri.parse("https://braintreepayments.com");
        this.browserSwitchClient.assertCanPerformBrowserSwitch(fragmentActivity, new BrowserSwitchOptions().url(parse).returnUrlScheme(getReturnUrlScheme()).requestCode(i));
    }

    public final <T> boolean isUrlSchemeDeclaredInAndroidManifest(String str, Class<T> cls) {
        return this.manifestValidator.isUrlSchemeDeclaredInAndroidManifest(this.applicationContext, str, cls);
    }

    public final <T> ActivityInfo getManifestActivityInfo(Class<T> cls) {
        return this.manifestValidator.getActivityInfo(this.applicationContext, cls);
    }

    public final Unit reportCrash() {
        Authorization authorizationFromCache = this.authorizationLoader.getAuthorizationFromCache();
        if (authorizationFromCache == null) {
            return null;
        }
        getConfiguration(new BraintreeClient$$ExternalSyntheticLambda4(this, authorizationFromCache));
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: reportCrash$lambda-12$lambda-11  reason: not valid java name */
    public static final void m341reportCrash$lambda12$lambda11(BraintreeClient braintreeClient, Authorization authorization, Configuration configuration, Exception exc) {
        Intrinsics.checkNotNullParameter(braintreeClient, "this$0");
        Intrinsics.checkNotNullParameter(authorization, "$authorization");
        braintreeClient.analyticsClient.reportCrash(braintreeClient.applicationContext, configuration, braintreeClient.sessionId, braintreeClient.integrationType, authorization);
    }

    public void invalidateClientToken() {
        this.authorizationLoader.invalidateClientToken();
    }

    public final boolean launchesBrowserSwitchAsNewTask() {
        return this.launchesBrowserSwitchAsNewTask;
    }

    public void launchesBrowserSwitchAsNewTask(boolean z) {
        this.launchesBrowserSwitchAsNewTask = z;
    }
}
