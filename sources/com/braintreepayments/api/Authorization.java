package com.braintreepayments.api;

import android.text.TextUtils;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/Authorization;", "", "rawValue", "", "(Ljava/lang/String;)V", "bearer", "getBearer", "()Ljava/lang/String;", "configUrl", "getConfigUrl", "toString", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: Authorization.kt */
public abstract class Authorization {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String rawValue;

    @JvmStatic
    public static final Authorization fromString(String str) {
        return Companion.fromString(str);
    }

    public abstract String getBearer();

    public abstract String getConfigUrl();

    public Authorization(String str) {
        Intrinsics.checkNotNullParameter(str, "rawValue");
        this.rawValue = str;
    }

    public String toString() {
        return this.rawValue;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¨\u0006\f"}, d2 = {"Lcom/braintreepayments/api/Authorization$Companion;", "", "()V", "fromString", "Lcom/braintreepayments/api/Authorization;", "authorizationString", "", "isClientToken", "", "clientToken", "isTokenizationKey", "tokenizationKey", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: Authorization.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final boolean isTokenizationKey(String str) {
            return new Regex(TokenizationKey.MATCHER).matches(str);
        }

        private final boolean isClientToken(String str) {
            return new Regex(ClientToken.BASE_64_MATCHER).matches(str);
        }

        @JvmStatic
        public final Authorization fromString(String str) {
            String str2;
            if (str != null) {
                CharSequence charSequence = str;
                int length = charSequence.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.compare((int) charSequence.charAt(!z ? i : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                str2 = charSequence.subSequence(i, length + 1).toString();
            } else {
                str2 = null;
            }
            if (str2 == null || TextUtils.isEmpty(str)) {
                String str3 = "Authorization provided is invalid: " + str2;
                if (str2 == null) {
                    str2 = ThreeDSStrings.NULL_STRING;
                }
                return new InvalidAuthorization(str2, str3);
            }
            try {
                if (isTokenizationKey(str2)) {
                    return new TokenizationKey(str2);
                }
                if (isClientToken(str2)) {
                    return new ClientToken(str2);
                }
                return new InvalidAuthorization(str2, "Authorization provided is invalid: " + str2);
            } catch (InvalidArgumentException e) {
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                return new InvalidAuthorization(str2, message);
            }
        }
    }
}
