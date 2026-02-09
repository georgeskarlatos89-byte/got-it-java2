package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setNextClusterForwardId;
import com.cardinalcommerce.a.setNextFocusForwardId;
import com.cardinalcommerce.a.setNextFocusRightId;
import com.cardinalcommerce.a.setOnApplyWindowInsetsListener;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.a.setPreferKeepClearRects;
import com.cardinalcommerce.a.setSystemGestureExclusionRects;
import com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable;
import com.cardinalcommerce.a.setWindowInsetsAnimationCallback;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONAware;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.X509CertUtils;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class JWK implements JSONAware, Serializable {
    private final setVerticalScrollbarTrackDrawable Cardinal;
    private final Set<setNextFocusRightId> cca_continue;
    private final List<X509Certificate> cleanup;
    private final String configure;
    private final setWindowInsetsAnimationCallback getInstance;
    private final URI getSDKVersion;
    @Deprecated
    private final Base64URL getWarnings;
    private final setNextClusterForwardId init;
    private final List<Base64> onCReqSuccess;
    private Base64URL onValidated;
    private final KeyStore values;

    public abstract boolean getInstance();

    public JWK(setNextClusterForwardId setnextclusterforwardid, setWindowInsetsAnimationCallback setwindowinsetsanimationcallback, Set<setNextFocusRightId> set, setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        LinkedList linkedList;
        if (setnextclusterforwardid != null) {
            this.init = setnextclusterforwardid;
            if (setOnApplyWindowInsetsListener.Cardinal(setwindowinsetsanimationcallback, set)) {
                this.getInstance = setwindowinsetsanimationcallback;
                this.cca_continue = set;
                this.Cardinal = setverticalscrollbartrackdrawable;
                this.configure = str;
                this.getSDKVersion = uri;
                this.getWarnings = base64URL;
                this.onValidated = base64URL2;
                if (list == null || !list.isEmpty()) {
                    this.onCReqSuccess = list;
                    if (list == null) {
                        linkedList = null;
                    } else {
                        try {
                            linkedList = new LinkedList();
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i) != null) {
                                    X509Certificate cca_continue2 = X509CertUtils.cca_continue(setPreferKeepClear.cca_continue(list.get(i).cca_continue));
                                    if (cca_continue2 != null) {
                                        linkedList.add(cca_continue2);
                                    } else {
                                        throw new ParseException("Invalid X.509 certificate at position ".concat(String.valueOf(i)), 0);
                                    }
                                }
                            }
                        } catch (ParseException e) {
                            throw new IllegalArgumentException(new StringBuilder("Invalid X.509 certificate chain \"x5c\": ").append(e.getMessage()).toString(), e);
                        }
                    }
                    this.cleanup = linkedList;
                    this.values = keyStore;
                    return;
                }
                throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
            }
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_opts\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
    }

    public final List<X509Certificate> init() {
        List<X509Certificate> list = this.cleanup;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public JSONObject cca_continue() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("kty", this.init.cca_continue);
        setWindowInsetsAnimationCallback setwindowinsetsanimationcallback = this.getInstance;
        if (setwindowinsetsanimationcallback != null) {
            jSONObject.put("use", setwindowinsetsanimationcallback.getInstance);
        }
        if (this.cca_continue != null) {
            JSONArray jSONArray = new JSONArray();
            for (setNextFocusRightId setnextfocusrightid : this.cca_continue) {
                jSONArray.add(setnextfocusrightid.identifier);
            }
            jSONObject.put("key_ops", jSONArray);
        }
        setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable = this.Cardinal;
        if (setverticalscrollbartrackdrawable != null) {
            jSONObject.put("alg", setverticalscrollbartrackdrawable.configure);
        }
        String str = this.configure;
        if (str != null) {
            jSONObject.put("kid", str);
        }
        URI uri = this.getSDKVersion;
        if (uri != null) {
            jSONObject.put("x5u", uri.toString());
        }
        Base64URL base64URL = this.getWarnings;
        if (base64URL != null) {
            jSONObject.put("x5t", base64URL.toString());
        }
        Base64URL base64URL2 = this.onValidated;
        if (base64URL2 != null) {
            jSONObject.put("x5t#S256", base64URL2.toString());
        }
        if (this.onCReqSuccess != null) {
            JSONArray jSONArray2 = new JSONArray();
            for (Base64 obj : this.onCReqSuccess) {
                jSONArray2.add(obj.toString());
            }
            jSONObject.put("x5c", jSONArray2);
        }
        return jSONObject;
    }

    public String toJSONString() {
        return cca_continue().toString();
    }

    public String toString() {
        return cca_continue().toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        JWK jwk = (JWK) obj;
        return Objects.equals(this.init, jwk.init) && Objects.equals(this.getInstance, jwk.getInstance) && Objects.equals(this.cca_continue, jwk.cca_continue) && Objects.equals(this.Cardinal, jwk.Cardinal) && Objects.equals(this.configure, jwk.configure) && Objects.equals(this.getSDKVersion, jwk.getSDKVersion) && Objects.equals(this.getWarnings, jwk.getWarnings) && Objects.equals(this.onValidated, jwk.onValidated) && Objects.equals(this.onCReqSuccess, jwk.onCReqSuccess) && Objects.equals(this.values, jwk.values);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.init, this.getInstance, this.cca_continue, this.Cardinal, this.configure, this.getSDKVersion, this.getWarnings, this.onValidated, this.onCReqSuccess, this.values});
    }

    public static JWK cca_continue(JSONObject jSONObject) throws ParseException {
        setNextClusterForwardId Cardinal2 = setNextClusterForwardId.Cardinal((String) setAccessibilityPaneTitle.init(jSONObject, "kty", String.class));
        if (Cardinal2 == setNextClusterForwardId.configure) {
            return ECKey.getInstance(jSONObject);
        }
        if (Cardinal2 == setNextClusterForwardId.init) {
            return setPreferKeepClearRects.init(jSONObject);
        }
        if (Cardinal2 == setNextClusterForwardId.Cardinal) {
            return setSystemGestureExclusionRects.getInstance(jSONObject);
        }
        if (Cardinal2 == setNextClusterForwardId.getInstance) {
            return setNextFocusForwardId.init(jSONObject);
        }
        throw new ParseException("Unsupported key type \"kty\" parameter: ".concat(String.valueOf(Cardinal2)), 0);
    }
}
