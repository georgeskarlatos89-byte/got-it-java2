package com.braintreepayments.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\""}, d2 = {"Lcom/braintreepayments/api/BraintreeOptions;", "", "context", "Landroid/content/Context;", "sessionId", "", "returnUrlScheme", "initialAuthString", "clientTokenProvider", "Lcom/braintreepayments/api/ClientTokenProvider;", "integrationType", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/braintreepayments/api/ClientTokenProvider;Ljava/lang/String;)V", "getClientTokenProvider", "()Lcom/braintreepayments/api/ClientTokenProvider;", "getContext", "()Landroid/content/Context;", "getInitialAuthString", "()Ljava/lang/String;", "getIntegrationType", "getReturnUrlScheme", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeOptions.kt */
public final class BraintreeOptions {
    private final ClientTokenProvider clientTokenProvider;
    private final Context context;
    private final String initialAuthString;
    private final String integrationType;
    private final String returnUrlScheme;
    private final String sessionId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeOptions(Context context2) {
        this(context2, (String) null, (String) null, (String) null, (ClientTokenProvider) null, (String) null, 62, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context2, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeOptions(Context context2, String str) {
        this(context2, str, (String) null, (String) null, (ClientTokenProvider) null, (String) null, 60, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context2, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeOptions(Context context2, String str, String str2) {
        this(context2, str, str2, (String) null, (ClientTokenProvider) null, (String) null, 56, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context2, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeOptions(Context context2, String str, String str2, String str3) {
        this(context2, str, str2, str3, (ClientTokenProvider) null, (String) null, 48, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context2, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BraintreeOptions(Context context2, String str, String str2, String str3, ClientTokenProvider clientTokenProvider2) {
        this(context2, str, str2, str3, clientTokenProvider2, (String) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context2, "context");
    }

    public static /* synthetic */ BraintreeOptions copy$default(BraintreeOptions braintreeOptions, Context context2, String str, String str2, String str3, ClientTokenProvider clientTokenProvider2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            context2 = braintreeOptions.context;
        }
        if ((i & 2) != 0) {
            str = braintreeOptions.sessionId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = braintreeOptions.returnUrlScheme;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = braintreeOptions.initialAuthString;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            clientTokenProvider2 = braintreeOptions.clientTokenProvider;
        }
        ClientTokenProvider clientTokenProvider3 = clientTokenProvider2;
        if ((i & 32) != 0) {
            str4 = braintreeOptions.integrationType;
        }
        return braintreeOptions.copy(context2, str5, str6, str7, clientTokenProvider3, str4);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.returnUrlScheme;
    }

    public final String component4() {
        return this.initialAuthString;
    }

    public final ClientTokenProvider component5() {
        return this.clientTokenProvider;
    }

    public final String component6() {
        return this.integrationType;
    }

    public final BraintreeOptions copy(Context context2, String str, String str2, String str3, ClientTokenProvider clientTokenProvider2, String str4) {
        Intrinsics.checkNotNullParameter(context2, "context");
        return new BraintreeOptions(context2, str, str2, str3, clientTokenProvider2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BraintreeOptions)) {
            return false;
        }
        BraintreeOptions braintreeOptions = (BraintreeOptions) obj;
        return Intrinsics.areEqual((Object) this.context, (Object) braintreeOptions.context) && Intrinsics.areEqual((Object) this.sessionId, (Object) braintreeOptions.sessionId) && Intrinsics.areEqual((Object) this.returnUrlScheme, (Object) braintreeOptions.returnUrlScheme) && Intrinsics.areEqual((Object) this.initialAuthString, (Object) braintreeOptions.initialAuthString) && Intrinsics.areEqual((Object) this.clientTokenProvider, (Object) braintreeOptions.clientTokenProvider) && Intrinsics.areEqual((Object) this.integrationType, (Object) braintreeOptions.integrationType);
    }

    public int hashCode() {
        int hashCode = this.context.hashCode() * 31;
        String str = this.sessionId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.returnUrlScheme;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialAuthString;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ClientTokenProvider clientTokenProvider2 = this.clientTokenProvider;
        int hashCode5 = (hashCode4 + (clientTokenProvider2 == null ? 0 : clientTokenProvider2.hashCode())) * 31;
        String str4 = this.integrationType;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "BraintreeOptions(context=" + this.context + ", sessionId=" + this.sessionId + ", returnUrlScheme=" + this.returnUrlScheme + ", initialAuthString=" + this.initialAuthString + ", clientTokenProvider=" + this.clientTokenProvider + ", integrationType=" + this.integrationType + ')';
    }

    public BraintreeOptions(Context context2, String str, String str2, String str3, ClientTokenProvider clientTokenProvider2, String str4) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        this.sessionId = str;
        this.returnUrlScheme = str2;
        this.initialAuthString = str3;
        this.clientTokenProvider = clientTokenProvider2;
        this.integrationType = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BraintreeOptions(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.braintreepayments.api.ClientTokenProvider r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braintreepayments.api.BraintreeOptions.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.braintreepayments.api.ClientTokenProvider, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getReturnUrlScheme() {
        return this.returnUrlScheme;
    }

    public final String getInitialAuthString() {
        return this.initialAuthString;
    }

    public final ClientTokenProvider getClientTokenProvider() {
        return this.clientTokenProvider;
    }

    public final String getIntegrationType() {
        return this.integrationType;
    }
}
