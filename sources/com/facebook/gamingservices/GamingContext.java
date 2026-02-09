package com.facebook.gamingservices;

import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/facebook/gamingservices/GamingContext;", "", "contextID", "", "(Ljava/lang/String;)V", "getContextID", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: GamingContext.kt */
public final class GamingContext {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int DEFAULT_TIMEOUT = 5;
    /* access modifiers changed from: private */
    public static GamingContext currentContext;
    private final String contextID;

    public static /* synthetic */ GamingContext copy$default(GamingContext gamingContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gamingContext.contextID;
        }
        return gamingContext.copy(str);
    }

    @JvmStatic
    public static final GamingContext getCurrentGamingContext() {
        return Companion.getCurrentGamingContext();
    }

    @JvmStatic
    public static final void setCurrentGamingContext(GamingContext gamingContext) {
        Companion.setCurrentGamingContext(gamingContext);
    }

    public final String component1() {
        return this.contextID;
    }

    public final GamingContext copy(String str) {
        Intrinsics.checkNotNullParameter(str, "contextID");
        return new GamingContext(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GamingContext) && Intrinsics.areEqual((Object) this.contextID, (Object) ((GamingContext) obj).contextID);
    }

    public int hashCode() {
        return this.contextID.hashCode();
    }

    public String toString() {
        return "GamingContext(contextID=" + this.contextID + ')';
    }

    public GamingContext(String str) {
        Intrinsics.checkNotNullParameter(str, "contextID");
        this.contextID = str;
    }

    public final String getContextID() {
        return this.contextID;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/gamingservices/GamingContext$Companion;", "", "()V", "DEFAULT_TIMEOUT", "", "currentContext", "Lcom/facebook/gamingservices/GamingContext;", "getCurrentGamingContext", "setCurrentGamingContext", "", "ctx", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: GamingContext.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r0 = r0.getJSONObject();
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.gamingservices.GamingContext getCurrentGamingContext() {
            /*
                r4 = this;
                boolean r0 = com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler.isRunningInCloud()
                if (r0 == 0) goto L_0x002b
                android.content.Context r0 = com.facebook.FacebookSdk.getApplicationContext()
                com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum r1 = com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum.CONTEXT_GET_ID
                r2 = 5
                r3 = 0
                com.facebook.GraphResponse r0 = com.facebook.gamingservices.cloudgaming.DaemonRequest.executeAndWait(r0, r3, r1, r2)
                if (r0 == 0) goto L_0x0021
                org.json.JSONObject r0 = r0.getJSONObject()
                if (r0 == 0) goto L_0x0021
                java.lang.String r1 = "id"
                java.lang.String r0 = r0.getString(r1)
                goto L_0x0022
            L_0x0021:
                r0 = r3
            L_0x0022:
                if (r0 != 0) goto L_0x0025
                return r3
            L_0x0025:
                com.facebook.gamingservices.GamingContext r1 = new com.facebook.gamingservices.GamingContext
                r1.<init>(r0)
                return r1
            L_0x002b:
                com.facebook.gamingservices.GamingContext r0 = com.facebook.gamingservices.GamingContext.currentContext
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.gamingservices.GamingContext.Companion.getCurrentGamingContext():com.facebook.gamingservices.GamingContext");
        }

        @JvmStatic
        public final void setCurrentGamingContext(GamingContext gamingContext) {
            Intrinsics.checkNotNullParameter(gamingContext, "ctx");
            if (!CloudGameLoginHandler.isRunningInCloud()) {
                GamingContext.currentContext = gamingContext;
            }
        }
    }
}
