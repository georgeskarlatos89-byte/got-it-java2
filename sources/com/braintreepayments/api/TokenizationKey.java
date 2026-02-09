package com.braintreepayments.api;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lib.android.paypal.com.magnessdk.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/braintreepayments/api/TokenizationKey;", "Lcom/braintreepayments/api/Authorization;", "tokenizationKey", "", "(Ljava/lang/String;)V", "bearer", "getBearer", "()Ljava/lang/String;", "configUrl", "getConfigUrl", "environment", "getEnvironment", "merchantId", "getMerchantId", "url", "getUrl", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: TokenizationKey.kt */
public final class TokenizationKey extends Authorization {
    private static final String CONFIG_V1 = "v1/configuration";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DEVELOPMENT_URL = "http://10.0.2.2:3000/";
    public static final String MATCHER = "^[a-zA-Z0-9]+_[a-zA-Z0-9]+_[a-zA-Z0-9_]+$";
    private static final String PRODUCTION_URL = "https://api.braintreegateway.com/";
    private static final String SANDBOX_URL = "https://api.sandbox.braintreegateway.com/";
    private final String bearer = toString();
    private final String configUrl;
    private final String environment;
    private final String merchantId;
    private final String url;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenizationKey(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "tokenizationKey");
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 3, 2, (Object) null);
        String str2 = (String) split$default.get(0);
        this.environment = str2;
        String str3 = (String) split$default.get(2);
        this.merchantId = str3;
        String str4 = Companion.getUrl(str2) + "merchants/" + str3 + "/client_api/";
        this.url = str4;
        this.configUrl = str4 + CONFIG_V1;
    }

    public String getConfigUrl() {
        return this.configUrl;
    }

    public String getBearer() {
        return this.bearer;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getUrl() {
        return this.url;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braintreepayments/api/TokenizationKey$Companion;", "", "()V", "CONFIG_V1", "", "DEVELOPMENT_URL", "MATCHER", "PRODUCTION_URL", "SANDBOX_URL", "getUrl", "environment", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: TokenizationKey.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String getUrl(String str) throws InvalidArgumentException {
            int hashCode = str.hashCode();
            if (hashCode != -224813765) {
                if (hashCode != 1753018553) {
                    if (hashCode == 1865400007 && str.equals("sandbox")) {
                        return TokenizationKey.SANDBOX_URL;
                    }
                } else if (str.equals(a.d)) {
                    return TokenizationKey.PRODUCTION_URL;
                }
            } else if (str.equals("development")) {
                return "http://10.0.2.2:3000/";
            }
            throw new InvalidArgumentException("Tokenization Key contained invalid environment");
        }
    }
}
