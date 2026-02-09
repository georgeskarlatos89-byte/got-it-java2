package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class setVerticalScrollbarPosition implements Serializable {
    private static final Map<String, Object> cleanup = Collections.unmodifiableMap(new HashMap());
    private final setScrollIndicators Cardinal;
    public final Base64URL cca_continue;
    private final setVerticalScrollbarTrackDrawable configure;
    public final Set<String> getInstance;
    public final Map<String, Object> init;
    private final String onCReqSuccess;

    protected setVerticalScrollbarPosition(setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, setScrollIndicators setscrollindicators, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        if (setverticalscrollbartrackdrawable != null) {
            this.configure = setverticalscrollbartrackdrawable;
            this.Cardinal = setscrollindicators;
            this.onCReqSuccess = str;
            if (set != null) {
                this.getInstance = Collections.unmodifiableSet(new HashSet(set));
            } else {
                this.getInstance = null;
            }
            if (map != null) {
                this.init = Collections.unmodifiableMap(new HashMap(map));
            } else {
                this.init = cleanup;
            }
            this.cca_continue = base64URL;
            return;
        }
        throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
    }

    public setVerticalScrollbarTrackDrawable configure() {
        return this.configure;
    }

    public JSONObject Cardinal() {
        JSONObject jSONObject = new JSONObject(this.init);
        jSONObject.put("alg", this.configure.toString());
        setScrollIndicators setscrollindicators = this.Cardinal;
        if (setscrollindicators != null) {
            jSONObject.put("typ", setscrollindicators.toString());
        }
        String str = this.onCReqSuccess;
        if (str != null) {
            jSONObject.put("cty", str);
        }
        Set<String> set = this.getInstance;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String add : this.getInstance) {
                jSONArray.add(add);
            }
            jSONObject.put("crit", jSONArray);
        }
        return jSONObject;
    }

    public String toString() {
        return Cardinal().toString();
    }

    public static setVerticalScrollbarTrackDrawable init(JSONObject jSONObject) throws ParseException {
        String str = (String) setAccessibilityPaneTitle.init(jSONObject, "alg", String.class);
        if (str == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        } else if (str.equals(setVerticalScrollbarTrackDrawable.cca_continue.configure)) {
            return setVerticalScrollbarTrackDrawable.cca_continue;
        } else {
            if (jSONObject.containsKey("enc")) {
                return JWEAlgorithm.Cardinal(str);
            }
            return JWSAlgorithm.getInstance(str);
        }
    }
}
