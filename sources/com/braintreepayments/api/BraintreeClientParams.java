package com.braintreepayments.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bw\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\b¢\u0006\u0002\u0010\u001bJ\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0017HÆ\u0003J\t\u00108\u001a\u00020\u0019HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\t\u0010?\u001a\u00020\u0011HÆ\u0003J\t\u0010@\u001a\u00020\u0013HÆ\u0003J\t\u0010A\u001a\u00020\u0015HÆ\u0003J\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0003\u0010\u001a\u001a\u00020\bHÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006J"}, d2 = {"Lcom/braintreepayments/api/BraintreeClientParams;", "", "options", "Lcom/braintreepayments/api/BraintreeOptions;", "(Lcom/braintreepayments/api/BraintreeOptions;)V", "context", "Landroid/content/Context;", "sessionId", "", "authorizationLoader", "Lcom/braintreepayments/api/AuthorizationLoader;", "returnUrlScheme", "httpClient", "Lcom/braintreepayments/api/BraintreeHttpClient;", "graphQLClient", "Lcom/braintreepayments/api/BraintreeGraphQLClient;", "analyticsClient", "Lcom/braintreepayments/api/AnalyticsClient;", "browserSwitchClient", "Lcom/braintreepayments/api/BrowserSwitchClient;", "manifestValidator", "Lcom/braintreepayments/api/ManifestValidator;", "uuidHelper", "Lcom/braintreepayments/api/UUIDHelper;", "configurationLoader", "Lcom/braintreepayments/api/ConfigurationLoader;", "integrationType", "(Landroid/content/Context;Ljava/lang/String;Lcom/braintreepayments/api/AuthorizationLoader;Ljava/lang/String;Lcom/braintreepayments/api/BraintreeHttpClient;Lcom/braintreepayments/api/BraintreeGraphQLClient;Lcom/braintreepayments/api/AnalyticsClient;Lcom/braintreepayments/api/BrowserSwitchClient;Lcom/braintreepayments/api/ManifestValidator;Lcom/braintreepayments/api/UUIDHelper;Lcom/braintreepayments/api/ConfigurationLoader;Ljava/lang/String;)V", "getAnalyticsClient", "()Lcom/braintreepayments/api/AnalyticsClient;", "applicationContext", "getApplicationContext", "()Landroid/content/Context;", "getAuthorizationLoader", "()Lcom/braintreepayments/api/AuthorizationLoader;", "braintreeReturnUrlScheme", "getBraintreeReturnUrlScheme", "()Ljava/lang/String;", "getBrowserSwitchClient", "()Lcom/braintreepayments/api/BrowserSwitchClient;", "getConfigurationLoader", "()Lcom/braintreepayments/api/ConfigurationLoader;", "getContext", "getGraphQLClient", "()Lcom/braintreepayments/api/BraintreeGraphQLClient;", "getHttpClient", "()Lcom/braintreepayments/api/BraintreeHttpClient;", "getIntegrationType", "getManifestValidator", "()Lcom/braintreepayments/api/ManifestValidator;", "getReturnUrlScheme", "getSessionId", "getUuidHelper", "()Lcom/braintreepayments/api/UUIDHelper;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeClientParams.kt */
public final class BraintreeClientParams {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final AnalyticsClient analyticsClient;
    private final Context applicationContext;
    private final AuthorizationLoader authorizationLoader;
    private final String braintreeReturnUrlScheme;
    private final BrowserSwitchClient browserSwitchClient;
    private final ConfigurationLoader configurationLoader;
    private final Context context;
    private final BraintreeGraphQLClient graphQLClient;
    private final BraintreeHttpClient httpClient;
    private final String integrationType;
    private final ManifestValidator manifestValidator;
    private final String returnUrlScheme;
    private final String sessionId;
    private final UUIDHelper uuidHelper;

    public static /* synthetic */ BraintreeClientParams copy$default(BraintreeClientParams braintreeClientParams, Context context2, String str, AuthorizationLoader authorizationLoader2, String str2, BraintreeHttpClient braintreeHttpClient, BraintreeGraphQLClient braintreeGraphQLClient, AnalyticsClient analyticsClient2, BrowserSwitchClient browserSwitchClient2, ManifestValidator manifestValidator2, UUIDHelper uUIDHelper, ConfigurationLoader configurationLoader2, String str3, int i, Object obj) {
        BraintreeClientParams braintreeClientParams2 = braintreeClientParams;
        int i2 = i;
        return braintreeClientParams.copy((i2 & 1) != 0 ? braintreeClientParams2.context : context2, (i2 & 2) != 0 ? braintreeClientParams2.sessionId : str, (i2 & 4) != 0 ? braintreeClientParams2.authorizationLoader : authorizationLoader2, (i2 & 8) != 0 ? braintreeClientParams2.returnUrlScheme : str2, (i2 & 16) != 0 ? braintreeClientParams2.httpClient : braintreeHttpClient, (i2 & 32) != 0 ? braintreeClientParams2.graphQLClient : braintreeGraphQLClient, (i2 & 64) != 0 ? braintreeClientParams2.analyticsClient : analyticsClient2, (i2 & 128) != 0 ? braintreeClientParams2.browserSwitchClient : browserSwitchClient2, (i2 & 256) != 0 ? braintreeClientParams2.manifestValidator : manifestValidator2, (i2 & 512) != 0 ? braintreeClientParams2.uuidHelper : uUIDHelper, (i2 & 1024) != 0 ? braintreeClientParams2.configurationLoader : configurationLoader2, (i2 & 2048) != 0 ? braintreeClientParams2.integrationType : str3);
    }

    public final Context component1() {
        return this.context;
    }

    public final UUIDHelper component10() {
        return this.uuidHelper;
    }

    public final ConfigurationLoader component11() {
        return this.configurationLoader;
    }

    public final String component12() {
        return this.integrationType;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final AuthorizationLoader component3() {
        return this.authorizationLoader;
    }

    public final String component4() {
        return this.returnUrlScheme;
    }

    public final BraintreeHttpClient component5() {
        return this.httpClient;
    }

    public final BraintreeGraphQLClient component6() {
        return this.graphQLClient;
    }

    public final AnalyticsClient component7() {
        return this.analyticsClient;
    }

    public final BrowserSwitchClient component8() {
        return this.browserSwitchClient;
    }

    public final ManifestValidator component9() {
        return this.manifestValidator;
    }

    public final BraintreeClientParams copy(Context context2, String str, AuthorizationLoader authorizationLoader2, String str2, BraintreeHttpClient braintreeHttpClient, BraintreeGraphQLClient braintreeGraphQLClient, AnalyticsClient analyticsClient2, BrowserSwitchClient browserSwitchClient2, ManifestValidator manifestValidator2, UUIDHelper uUIDHelper, ConfigurationLoader configurationLoader2, String str3) {
        Intrinsics.checkNotNullParameter(context2, "context");
        String str4 = str;
        Intrinsics.checkNotNullParameter(str4, AnalyticsClient.WORK_INPUT_KEY_SESSION_ID);
        AuthorizationLoader authorizationLoader3 = authorizationLoader2;
        Intrinsics.checkNotNullParameter(authorizationLoader3, "authorizationLoader");
        String str5 = str2;
        Intrinsics.checkNotNullParameter(str5, "returnUrlScheme");
        BraintreeHttpClient braintreeHttpClient2 = braintreeHttpClient;
        Intrinsics.checkNotNullParameter(braintreeHttpClient2, "httpClient");
        BraintreeGraphQLClient braintreeGraphQLClient2 = braintreeGraphQLClient;
        Intrinsics.checkNotNullParameter(braintreeGraphQLClient2, "graphQLClient");
        AnalyticsClient analyticsClient3 = analyticsClient2;
        Intrinsics.checkNotNullParameter(analyticsClient3, "analyticsClient");
        BrowserSwitchClient browserSwitchClient3 = browserSwitchClient2;
        Intrinsics.checkNotNullParameter(browserSwitchClient3, "browserSwitchClient");
        ManifestValidator manifestValidator3 = manifestValidator2;
        Intrinsics.checkNotNullParameter(manifestValidator3, "manifestValidator");
        UUIDHelper uUIDHelper2 = uUIDHelper;
        Intrinsics.checkNotNullParameter(uUIDHelper2, "uuidHelper");
        ConfigurationLoader configurationLoader3 = configurationLoader2;
        Intrinsics.checkNotNullParameter(configurationLoader3, "configurationLoader");
        String str6 = str3;
        Intrinsics.checkNotNullParameter(str6, "integrationType");
        return new BraintreeClientParams(context2, str4, authorizationLoader3, str5, braintreeHttpClient2, braintreeGraphQLClient2, analyticsClient3, browserSwitchClient3, manifestValidator3, uUIDHelper2, configurationLoader3, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BraintreeClientParams)) {
            return false;
        }
        BraintreeClientParams braintreeClientParams = (BraintreeClientParams) obj;
        return Intrinsics.areEqual((Object) this.context, (Object) braintreeClientParams.context) && Intrinsics.areEqual((Object) this.sessionId, (Object) braintreeClientParams.sessionId) && Intrinsics.areEqual((Object) this.authorizationLoader, (Object) braintreeClientParams.authorizationLoader) && Intrinsics.areEqual((Object) this.returnUrlScheme, (Object) braintreeClientParams.returnUrlScheme) && Intrinsics.areEqual((Object) this.httpClient, (Object) braintreeClientParams.httpClient) && Intrinsics.areEqual((Object) this.graphQLClient, (Object) braintreeClientParams.graphQLClient) && Intrinsics.areEqual((Object) this.analyticsClient, (Object) braintreeClientParams.analyticsClient) && Intrinsics.areEqual((Object) this.browserSwitchClient, (Object) braintreeClientParams.browserSwitchClient) && Intrinsics.areEqual((Object) this.manifestValidator, (Object) braintreeClientParams.manifestValidator) && Intrinsics.areEqual((Object) this.uuidHelper, (Object) braintreeClientParams.uuidHelper) && Intrinsics.areEqual((Object) this.configurationLoader, (Object) braintreeClientParams.configurationLoader) && Intrinsics.areEqual((Object) this.integrationType, (Object) braintreeClientParams.integrationType);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.context.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.authorizationLoader.hashCode()) * 31) + this.returnUrlScheme.hashCode()) * 31) + this.httpClient.hashCode()) * 31) + this.graphQLClient.hashCode()) * 31) + this.analyticsClient.hashCode()) * 31) + this.browserSwitchClient.hashCode()) * 31) + this.manifestValidator.hashCode()) * 31) + this.uuidHelper.hashCode()) * 31) + this.configurationLoader.hashCode()) * 31) + this.integrationType.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BraintreeClientParams(context=");
        sb.append(this.context).append(", sessionId=").append(this.sessionId).append(", authorizationLoader=").append(this.authorizationLoader).append(", returnUrlScheme=").append(this.returnUrlScheme).append(", httpClient=").append(this.httpClient).append(", graphQLClient=").append(this.graphQLClient).append(", analyticsClient=").append(this.analyticsClient).append(", browserSwitchClient=").append(this.browserSwitchClient).append(", manifestValidator=").append(this.manifestValidator).append(", uuidHelper=").append(this.uuidHelper).append(", configurationLoader=").append(this.configurationLoader).append(", integrationType=");
        sb.append(this.integrationType).append(')');
        return sb.toString();
    }

    public BraintreeClientParams(Context context2, String str, AuthorizationLoader authorizationLoader2, String str2, BraintreeHttpClient braintreeHttpClient, BraintreeGraphQLClient braintreeGraphQLClient, AnalyticsClient analyticsClient2, BrowserSwitchClient browserSwitchClient2, ManifestValidator manifestValidator2, UUIDHelper uUIDHelper, ConfigurationLoader configurationLoader2, String str3) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(str, AnalyticsClient.WORK_INPUT_KEY_SESSION_ID);
        Intrinsics.checkNotNullParameter(authorizationLoader2, "authorizationLoader");
        Intrinsics.checkNotNullParameter(str2, "returnUrlScheme");
        Intrinsics.checkNotNullParameter(braintreeHttpClient, "httpClient");
        Intrinsics.checkNotNullParameter(braintreeGraphQLClient, "graphQLClient");
        Intrinsics.checkNotNullParameter(analyticsClient2, "analyticsClient");
        Intrinsics.checkNotNullParameter(browserSwitchClient2, "browserSwitchClient");
        Intrinsics.checkNotNullParameter(manifestValidator2, "manifestValidator");
        Intrinsics.checkNotNullParameter(uUIDHelper, "uuidHelper");
        Intrinsics.checkNotNullParameter(configurationLoader2, "configurationLoader");
        Intrinsics.checkNotNullParameter(str3, "integrationType");
        this.context = context2;
        this.sessionId = str;
        this.authorizationLoader = authorizationLoader2;
        this.returnUrlScheme = str2;
        this.httpClient = braintreeHttpClient;
        this.graphQLClient = braintreeGraphQLClient;
        this.analyticsClient = analyticsClient2;
        this.browserSwitchClient = browserSwitchClient2;
        this.manifestValidator = manifestValidator2;
        this.uuidHelper = uUIDHelper;
        this.configurationLoader = configurationLoader2;
        this.integrationType = str3;
        Context applicationContext2 = context2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        this.applicationContext = applicationContext2;
        this.braintreeReturnUrlScheme = Companion.getAppPackageNameWithoutUnderscores(context2) + ".braintree.deeplinkhandler";
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final AuthorizationLoader getAuthorizationLoader() {
        return this.authorizationLoader;
    }

    public final String getReturnUrlScheme() {
        return this.returnUrlScheme;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BraintreeClientParams(android.content.Context r14, java.lang.String r15, com.braintreepayments.api.AuthorizationLoader r16, java.lang.String r17, com.braintreepayments.api.BraintreeHttpClient r18, com.braintreepayments.api.BraintreeGraphQLClient r19, com.braintreepayments.api.AnalyticsClient r20, com.braintreepayments.api.BrowserSwitchClient r21, com.braintreepayments.api.ManifestValidator r22, com.braintreepayments.api.UUIDHelper r23, com.braintreepayments.api.ConfigurationLoader r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r1 = r14
            r0 = r26
            r2 = r0 & 16
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0010
            com.braintreepayments.api.BraintreeHttpClient r2 = new com.braintreepayments.api.BraintreeHttpClient
            r2.<init>(r4, r3, r4)
            r5 = r2
            goto L_0x0012
        L_0x0010:
            r5 = r18
        L_0x0012:
            r2 = r0 & 32
            if (r2 == 0) goto L_0x001d
            com.braintreepayments.api.BraintreeGraphQLClient r2 = new com.braintreepayments.api.BraintreeGraphQLClient
            r2.<init>(r4, r3, r4)
            r6 = r2
            goto L_0x001f
        L_0x001d:
            r6 = r19
        L_0x001f:
            r2 = r0 & 64
            if (r2 == 0) goto L_0x002a
            com.braintreepayments.api.AnalyticsClient r2 = new com.braintreepayments.api.AnalyticsClient
            r2.<init>(r14)
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r20
        L_0x002c:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0037
            com.braintreepayments.api.BrowserSwitchClient r2 = new com.braintreepayments.api.BrowserSwitchClient
            r2.<init>()
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r21
        L_0x0039:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0044
            com.braintreepayments.api.ManifestValidator r2 = new com.braintreepayments.api.ManifestValidator
            r2.<init>()
            r9 = r2
            goto L_0x0046
        L_0x0044:
            r9 = r22
        L_0x0046:
            r2 = r0 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0051
            com.braintreepayments.api.UUIDHelper r2 = new com.braintreepayments.api.UUIDHelper
            r2.<init>()
            r10 = r2
            goto L_0x0053
        L_0x0051:
            r10 = r23
        L_0x0053:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x005e
            com.braintreepayments.api.ConfigurationLoader r0 = new com.braintreepayments.api.ConfigurationLoader
            r0.<init>((android.content.Context) r14, (com.braintreepayments.api.BraintreeHttpClient) r5)
            r11 = r0
            goto L_0x0060
        L_0x005e:
            r11 = r24
        L_0x0060:
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r12 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.BraintreeClientParams.<init>(android.content.Context, java.lang.String, com.braintreepayments.api.AuthorizationLoader, java.lang.String, com.braintreepayments.api.BraintreeHttpClient, com.braintreepayments.api.BraintreeGraphQLClient, com.braintreepayments.api.AnalyticsClient, com.braintreepayments.api.BrowserSwitchClient, com.braintreepayments.api.ManifestValidator, com.braintreepayments.api.UUIDHelper, com.braintreepayments.api.ConfigurationLoader, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final BraintreeHttpClient getHttpClient() {
        return this.httpClient;
    }

    public final BraintreeGraphQLClient getGraphQLClient() {
        return this.graphQLClient;
    }

    public final AnalyticsClient getAnalyticsClient() {
        return this.analyticsClient;
    }

    public final BrowserSwitchClient getBrowserSwitchClient() {
        return this.browserSwitchClient;
    }

    public final ManifestValidator getManifestValidator() {
        return this.manifestValidator;
    }

    public final UUIDHelper getUuidHelper() {
        return this.uuidHelper;
    }

    public final ConfigurationLoader getConfigurationLoader() {
        return this.configurationLoader;
    }

    public final String getIntegrationType() {
        return this.integrationType;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BraintreeClientParams(com.braintreepayments.api.BraintreeOptions r17) {
        /*
            r16 = this;
            java.lang.String r0 = "options"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.content.Context r2 = r17.getContext()
            com.braintreepayments.api.AuthorizationLoader r4 = new com.braintreepayments.api.AuthorizationLoader
            java.lang.String r0 = r17.getInitialAuthString()
            com.braintreepayments.api.ClientTokenProvider r3 = r17.getClientTokenProvider()
            r4.<init>(r0, r3)
            java.lang.String r0 = r17.getSessionId()
            if (r0 != 0) goto L_0x0024
            com.braintreepayments.api.BraintreeClientParams$Companion r0 = Companion
            java.lang.String r0 = r0.createUniqueSessionId()
        L_0x0024:
            r3 = r0
            java.lang.String r0 = r17.getReturnUrlScheme()
            if (r0 != 0) goto L_0x0035
            com.braintreepayments.api.BraintreeClientParams$Companion r0 = Companion
            android.content.Context r5 = r17.getContext()
            java.lang.String r0 = r0.createDefaultReturnUrlScheme(r5)
        L_0x0035:
            r5 = r0
            java.lang.String r0 = r17.getIntegrationType()
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "custom"
        L_0x003e:
            r13 = r0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 2032(0x7f0, float:2.847E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.BraintreeClientParams.<init>(com.braintreepayments.api.BraintreeOptions):void");
    }

    public final Context getApplicationContext() {
        return this.applicationContext;
    }

    public final String getBraintreeReturnUrlScheme() {
        return this.braintreeReturnUrlScheme;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/BraintreeClientParams$Companion;", "", "()V", "createDefaultReturnUrlScheme", "", "context", "Landroid/content/Context;", "createUniqueSessionId", "getAppPackageNameWithoutUnderscores", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: BraintreeClientParams.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String createUniqueSessionId() {
            return new UUIDHelper().getFormattedUUID();
        }

        /* access modifiers changed from: private */
        public final String getAppPackageNameWithoutUnderscores(Context context) {
            String packageName = context.getApplicationContext().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.applicationContext.packageName");
            return StringsKt.replace$default(packageName, "_", "", false, 4, (Object) null);
        }

        /* access modifiers changed from: private */
        public final String createDefaultReturnUrlScheme(Context context) {
            return getAppPackageNameWithoutUnderscores(context) + ".braintree";
        }
    }
}
