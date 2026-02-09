package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.Curve;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class setNextFocusForwardId extends JWK {
    private static Set<Curve> cca_continue = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{Curve.Cardinal, Curve.onValidated, Curve.getWarnings, Curve.cleanup})));
    private final Base64URL Cardinal;
    private final Curve configure;
    private final Base64URL getInstance;
    private final byte[] init;
    private final byte[] onValidated;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private setNextFocusForwardId(Curve curve, Base64URL base64URL, setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(setNextClusterForwardId.getInstance, setwindowinsetsanimationcallback, set, setverticalscrollbartrackdrawable, str, uri, base64URL2, base64URL3, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL4 = base64URL;
        if (curve2 == null) {
            throw new IllegalArgumentException("The curve must not be null");
        } else if (cca_continue.contains(curve)) {
            this.configure = curve2;
            if (base64URL4 != null) {
                this.Cardinal = base64URL4;
                this.init = setPreferKeepClear.cca_continue(base64URL4.cca_continue);
                this.getInstance = null;
                this.onValidated = null;
                return;
            }
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        } else {
            throw new IllegalArgumentException("Unknown / unsupported curve: ".concat(String.valueOf(curve)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private setNextFocusForwardId(Curve curve, Base64URL base64URL, Base64URL base64URL2, setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(setNextClusterForwardId.getInstance, setwindowinsetsanimationcallback, set, setverticalscrollbartrackdrawable, str, uri, base64URL3, base64URL4, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        Base64URL base64URL6 = base64URL2;
        if (curve2 == null) {
            throw new IllegalArgumentException("The curve must not be null");
        } else if (cca_continue.contains(curve2)) {
            this.configure = curve2;
            if (base64URL5 != null) {
                this.Cardinal = base64URL5;
                this.init = setPreferKeepClear.cca_continue(base64URL5.cca_continue);
                if (base64URL6 != null) {
                    this.getInstance = base64URL6;
                    this.onValidated = setPreferKeepClear.cca_continue(base64URL6.cca_continue);
                    return;
                }
                throw new IllegalArgumentException("The 'd' parameter must not be null");
            }
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        } else {
            throw new IllegalArgumentException("Unknown / unsupported curve: ".concat(String.valueOf(curve)));
        }
    }

    public final boolean getInstance() {
        return this.getInstance != null;
    }

    public final JSONObject cca_continue() {
        JSONObject cca_continue2 = super.cca_continue();
        cca_continue2.put("crv", this.configure.toString());
        cca_continue2.put("x", this.Cardinal.toString());
        Base64URL base64URL = this.getInstance;
        if (base64URL != null) {
            cca_continue2.put("d", base64URL.toString());
        }
        return cca_continue2;
    }

    public static setNextFocusForwardId init(JSONObject jSONObject) throws ParseException {
        Base64URL base64URL;
        Base64URL base64URL2;
        List list;
        Base64URL base64URL3;
        List list2;
        Base64URL base64URL4;
        JSONObject jSONObject2 = jSONObject;
        if (setNextClusterForwardId.getInstance.equals(setKeepScreenOn.configure(jSONObject))) {
            try {
                Curve configure2 = Curve.configure((String) setAccessibilityPaneTitle.init(jSONObject2, "crv", String.class));
                String str = (String) setAccessibilityPaneTitle.init(jSONObject2, "x", String.class);
                Base64URL base64URL5 = null;
                if (str == null) {
                    base64URL = null;
                } else {
                    base64URL = new Base64URL(str);
                }
                String str2 = (String) setAccessibilityPaneTitle.init(jSONObject2, "d", String.class);
                if (str2 == null) {
                    base64URL2 = null;
                } else {
                    base64URL2 = new Base64URL(str2);
                }
                if (base64URL2 == null) {
                    try {
                        setWindowInsetsAnimationCallback instance = setWindowInsetsAnimationCallback.getInstance((String) setAccessibilityPaneTitle.init(jSONObject2, "use", String.class));
                        String[] configure3 = setAccessibilityPaneTitle.configure(jSONObject2, "key_ops");
                        if (configure3 == null) {
                            list2 = null;
                        } else {
                            list2 = Arrays.asList(configure3);
                        }
                        Set<setNextFocusRightId> instance2 = setNextFocusRightId.getInstance(list2);
                        setVerticalScrollbarTrackDrawable configure4 = setVerticalScrollbarTrackDrawable.configure((String) setAccessibilityPaneTitle.init(jSONObject2, "alg", String.class));
                        String str3 = (String) setAccessibilityPaneTitle.init(jSONObject2, "kid", String.class);
                        URI instance3 = setAccessibilityPaneTitle.getInstance(jSONObject2, "x5u");
                        String str4 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t", String.class);
                        if (str4 == null) {
                            base64URL4 = null;
                        } else {
                            base64URL4 = new Base64URL(str4);
                        }
                        String str5 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t#S256", String.class);
                        if (str5 != null) {
                            base64URL5 = new Base64URL(str5);
                        }
                        return new setNextFocusForwardId(configure2, base64URL, instance, instance2, configure4, str3, instance3, base64URL4, base64URL5, setKeepScreenOn.getInstance(jSONObject), (KeyStore) null);
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                } else {
                    setWindowInsetsAnimationCallback instance4 = setWindowInsetsAnimationCallback.getInstance((String) setAccessibilityPaneTitle.init(jSONObject2, "use", String.class));
                    String[] configure5 = setAccessibilityPaneTitle.configure(jSONObject2, "key_ops");
                    if (configure5 == null) {
                        list = null;
                    } else {
                        list = Arrays.asList(configure5);
                    }
                    Set<setNextFocusRightId> instance5 = setNextFocusRightId.getInstance(list);
                    setVerticalScrollbarTrackDrawable configure6 = setVerticalScrollbarTrackDrawable.configure((String) setAccessibilityPaneTitle.init(jSONObject2, "alg", String.class));
                    String str6 = (String) setAccessibilityPaneTitle.init(jSONObject2, "kid", String.class);
                    URI instance6 = setAccessibilityPaneTitle.getInstance(jSONObject2, "x5u");
                    String str7 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t", String.class);
                    if (str7 == null) {
                        base64URL3 = null;
                    } else {
                        base64URL3 = new Base64URL(str7);
                    }
                    String str8 = (String) setAccessibilityPaneTitle.init(jSONObject2, "x5t#S256", String.class);
                    if (str8 != null) {
                        base64URL5 = new Base64URL(str8);
                    }
                    return new setNextFocusForwardId(configure2, base64URL, base64URL2, instance4, instance5, configure6, str6, instance6, base64URL3, base64URL5, setKeepScreenOn.getInstance(jSONObject), (KeyStore) null);
                }
            } catch (IllegalArgumentException e2) {
                throw new ParseException(e2.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be OKP", 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setNextFocusForwardId) || !super.equals(obj)) {
            return false;
        }
        setNextFocusForwardId setnextfocusforwardid = (setNextFocusForwardId) obj;
        return Objects.equals(this.configure, setnextfocusforwardid.configure) && Objects.equals(this.Cardinal, setnextfocusforwardid.Cardinal) && Arrays.equals(this.init, setnextfocusforwardid.init) && Objects.equals(this.getInstance, setnextfocusforwardid.getInstance) && Arrays.equals(this.onValidated, setnextfocusforwardid.onValidated);
    }

    public final int hashCode() {
        return (((Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.configure, this.Cardinal, this.getInstance}) * 31) + Arrays.hashCode(this.init)) * 31) + Arrays.hashCode(this.onValidated);
    }
}
