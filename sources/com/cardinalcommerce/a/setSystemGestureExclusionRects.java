package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class setSystemGestureExclusionRects extends JWK {
    private final Base64URL cca_continue;

    public final boolean getInstance() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private setSystemGestureExclusionRects(Base64URL base64URL, setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(setNextClusterForwardId.Cardinal, setwindowinsetsanimationcallback, set, setverticalscrollbartrackdrawable, str, uri, base64URL2, base64URL3, list, keyStore);
        Base64URL base64URL4 = base64URL;
        if (base64URL4 != null) {
            this.cca_continue = base64URL4;
        } else {
            throw new IllegalArgumentException("The key value must not be null");
        }
    }

    public final JSONObject cca_continue() {
        JSONObject cca_continue2 = super.cca_continue();
        cca_continue2.put("k", this.cca_continue.toString());
        return cca_continue2;
    }

    public static setSystemGestureExclusionRects getInstance(JSONObject jSONObject) throws ParseException {
        Base64URL base64URL;
        List list;
        Base64URL base64URL2;
        if (setNextClusterForwardId.Cardinal.equals(setKeepScreenOn.configure(jSONObject))) {
            String str = (String) setAccessibilityPaneTitle.init(jSONObject, "k", String.class);
            Base64URL base64URL3 = null;
            if (str == null) {
                base64URL = null;
            } else {
                base64URL = new Base64URL(str);
            }
            try {
                setWindowInsetsAnimationCallback instance = setWindowInsetsAnimationCallback.getInstance((String) setAccessibilityPaneTitle.init(jSONObject, "use", String.class));
                String[] configure = setAccessibilityPaneTitle.configure(jSONObject, "key_ops");
                if (configure == null) {
                    list = null;
                } else {
                    list = Arrays.asList(configure);
                }
                Set<setNextFocusRightId> instance2 = setNextFocusRightId.getInstance(list);
                setVerticalScrollbarTrackDrawable configure2 = setVerticalScrollbarTrackDrawable.configure((String) setAccessibilityPaneTitle.init(jSONObject, "alg", String.class));
                String str2 = (String) setAccessibilityPaneTitle.init(jSONObject, "kid", String.class);
                URI instance3 = setAccessibilityPaneTitle.getInstance(jSONObject, "x5u");
                String str3 = (String) setAccessibilityPaneTitle.init(jSONObject, "x5t", String.class);
                if (str3 == null) {
                    base64URL2 = null;
                } else {
                    base64URL2 = new Base64URL(str3);
                }
                String str4 = (String) setAccessibilityPaneTitle.init(jSONObject, "x5t#S256", String.class);
                if (str4 != null) {
                    base64URL3 = new Base64URL(str4);
                }
                return new setSystemGestureExclusionRects(base64URL, instance, instance2, configure2, str2, instance3, base64URL2, base64URL3, setKeepScreenOn.getInstance(jSONObject), (KeyStore) null);
            } catch (IllegalArgumentException e) {
                throw new ParseException(e.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be oct", 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof setSystemGestureExclusionRects) && super.equals(obj)) {
            return Objects.equals(this.cca_continue, ((setSystemGestureExclusionRects) obj).cca_continue);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.cca_continue});
    }
}
