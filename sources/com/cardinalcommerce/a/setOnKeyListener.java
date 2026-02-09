package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.JWK;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class setOnKeyListener extends setHorizontalScrollbarTrackDrawable {
    private static final Set<String> configure;
    public final boolean Cardinal;

    public final /* bridge */ /* synthetic */ List cca_continue() {
        return super.cca_continue();
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        configure = Collections.unmodifiableSet(hashSet);
    }

    public static class configure {
        setScrollIndicators Cardinal;
        String CardinalEnvironment;
        boolean CardinalError = true;
        Map<String, Object> CardinalRenderType;
        URI cca_continue;
        URI cleanup;
        Set<String> configure;
        final JWSAlgorithm getInstance;
        Base64URL getSDKVersion;
        @Deprecated
        Base64URL getWarnings;
        String init;
        JWK onCReqSuccess;
        List<Base64> onValidated;
        Base64URL valueOf;

        public configure(JWSAlgorithm jWSAlgorithm) {
            if (!jWSAlgorithm.configure.equals(setVerticalScrollbarTrackDrawable.cca_continue.configure)) {
                this.getInstance = jWSAlgorithm;
                return;
            }
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }
    }

    private setOnKeyListener(JWSAlgorithm jWSAlgorithm, setScrollIndicators setscrollindicators, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, boolean z, Map<String, Object> map, Base64URL base64URL3) {
        super(jWSAlgorithm, setscrollindicators, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL3);
        if (!jWSAlgorithm.configure.equals(setVerticalScrollbarTrackDrawable.cca_continue.configure)) {
            this.Cardinal = z;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    public final JWSAlgorithm init() {
        return (JWSAlgorithm) super.configure();
    }

    public final JSONObject Cardinal() {
        JSONObject Cardinal2 = super.Cardinal();
        if (!this.Cardinal) {
            Cardinal2.put("b64", Boolean.FALSE);
        }
        return Cardinal2;
    }

    public static setOnKeyListener Cardinal(Base64URL base64URL) throws ParseException {
        List list;
        Base64URL base64URL2 = base64URL;
        JSONObject instance = setAccessibilityPaneTitle.getInstance(new String(setPreferKeepClear.cca_continue(base64URL2.cca_continue), setAllowedHandwritingDelegatePackage.configure));
        setVerticalScrollbarTrackDrawable init = setVerticalScrollbarPosition.init(instance);
        if (init instanceof JWSAlgorithm) {
            configure configure2 = new configure((JWSAlgorithm) init);
            configure2.valueOf = base64URL2;
            for (String str : instance.keySet()) {
                if (!"alg".equals(str)) {
                    if ("typ".equals(str)) {
                        String str2 = (String) setAccessibilityPaneTitle.init(instance, str, String.class);
                        if (str2 != null) {
                            configure2.Cardinal = new setScrollIndicators(str2);
                        }
                    } else if ("cty".equals(str)) {
                        configure2.init = (String) setAccessibilityPaneTitle.init(instance, str, String.class);
                    } else if ("crit".equals(str)) {
                        String[] configure3 = setAccessibilityPaneTitle.configure(instance, str);
                        if (configure3 == null) {
                            list = null;
                        } else {
                            list = Arrays.asList(configure3);
                        }
                        if (list != null) {
                            configure2.configure = new HashSet(list);
                        }
                    } else if ("jku".equals(str)) {
                        configure2.cca_continue = setAccessibilityPaneTitle.getInstance(instance, str);
                    } else if ("jwk".equals(str)) {
                        JSONObject jSONObject = (JSONObject) setAccessibilityPaneTitle.init(instance, str, JSONObject.class);
                        if (jSONObject != null) {
                            configure2.onCReqSuccess = JWK.cca_continue(jSONObject);
                        }
                    } else if ("x5u".equals(str)) {
                        configure2.cleanup = setAccessibilityPaneTitle.getInstance(instance, str);
                    } else if ("x5t".equals(str)) {
                        configure2.getWarnings = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("x5t#S256".equals(str)) {
                        configure2.getSDKVersion = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("x5c".equals(str)) {
                        configure2.onValidated = setAccessibilityPaneTitle.configure((JSONArray) setAccessibilityPaneTitle.init(instance, str, JSONArray.class));
                    } else if ("kid".equals(str)) {
                        configure2.CardinalEnvironment = (String) setAccessibilityPaneTitle.init(instance, str, String.class);
                    } else if ("b64".equals(str)) {
                        Boolean bool = (Boolean) setAccessibilityPaneTitle.init(instance, str, Boolean.class);
                        if (bool != null) {
                            configure2.CardinalError = bool.booleanValue();
                        } else {
                            throw new ParseException(new StringBuilder("JSON object member with key \"").append(str).append("\" is missing or null").toString(), 0);
                        }
                    } else {
                        Object obj = instance.get(str);
                        if (!configure.contains(str)) {
                            if (configure2.CardinalRenderType == null) {
                                configure2.CardinalRenderType = new HashMap();
                            }
                            configure2.CardinalRenderType.put(str, obj);
                        } else {
                            throw new IllegalArgumentException(new StringBuilder("The parameter name \"").append(str).append("\" matches a registered name").toString());
                        }
                    }
                }
            }
            return new setOnKeyListener(configure2.getInstance, configure2.Cardinal, configure2.init, configure2.configure, configure2.cca_continue, configure2.onCReqSuccess, configure2.cleanup, configure2.getWarnings, configure2.getSDKVersion, configure2.onValidated, configure2.CardinalEnvironment, configure2.CardinalError, configure2.CardinalRenderType, configure2.valueOf);
        }
        throw new ParseException("Not a JWS header", 0);
    }

    public final /* bridge */ /* synthetic */ setVerticalScrollbarTrackDrawable configure() {
        return (JWSAlgorithm) super.configure();
    }
}
