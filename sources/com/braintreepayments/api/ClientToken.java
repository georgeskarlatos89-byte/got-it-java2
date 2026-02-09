package com.braintreepayments.api;

import android.util.Base64;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/braintreepayments/api/ClientToken;", "Lcom/braintreepayments/api/Authorization;", "clientTokenString", "", "(Ljava/lang/String;)V", "authorizationFingerprint", "getAuthorizationFingerprint", "()Ljava/lang/String;", "bearer", "getBearer", "configUrl", "getConfigUrl", "customerId", "getCustomerId", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: ClientToken.kt */
public final class ClientToken extends Authorization {
    private static final String AUTHORIZATION_FINGERPRINT_KEY = "authorizationFingerprint";
    public static final String BASE_64_MATCHER = "([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)";
    private static final String CONFIG_URL_KEY = "configUrl";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String authorizationFingerprint;
    private final String bearer;
    private final String configUrl;
    private final String customerId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClientToken(String str) throws InvalidArgumentException {
        super(str);
        Intrinsics.checkNotNullParameter(str, "clientTokenString");
        try {
            byte[] decode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(clientTokenString, Base64.DEFAULT)");
            JSONObject jSONObject = new JSONObject(new String(decode, Charsets.UTF_8));
            String string = jSONObject.getString(CONFIG_URL_KEY);
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(CONFIG_URL_KEY)");
            this.configUrl = string;
            String string2 = jSONObject.getString(AUTHORIZATION_FINGERPRINT_KEY);
            Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(AUT…RIZATION_FINGERPRINT_KEY)");
            this.authorizationFingerprint = string2;
            this.bearer = string2;
            this.customerId = Companion.parseCustomerId(string2);
        } catch (NullPointerException unused) {
            throw new InvalidArgumentException("Client token was invalid");
        } catch (JSONException unused2) {
            throw new InvalidArgumentException("Client token was invalid");
        }
    }

    public String getConfigUrl() {
        return this.configUrl;
    }

    public String getBearer() {
        return this.bearer;
    }

    public final String getAuthorizationFingerprint() {
        return this.authorizationFingerprint;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braintreepayments/api/ClientToken$Companion;", "", "()V", "AUTHORIZATION_FINGERPRINT_KEY", "", "BASE_64_MATCHER", "CONFIG_URL_KEY", "parseCustomerId", "authorizationFingerprint", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: ClientToken.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String parseCustomerId(String str) {
            if (str != null) {
                for (CharSequence charSequence : StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null)) {
                    if (StringsKt.contains$default(charSequence, (CharSequence) "customer_id=", false, 2, (Object) null)) {
                        List split$default = StringsKt.split$default(charSequence, new String[]{"="}, false, 0, 6, (Object) null);
                        if (split$default.size() > 1) {
                            return (String) split$default.get(1);
                        }
                    }
                }
                return null;
            }
            String str2 = null;
            return null;
        }
    }
}
