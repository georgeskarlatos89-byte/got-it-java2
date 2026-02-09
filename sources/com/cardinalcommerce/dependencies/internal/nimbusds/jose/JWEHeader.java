package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setAllowedHandwritingDelegatePackage;
import com.cardinalcommerce.a.setHorizontalScrollbarTrackDrawable;
import com.cardinalcommerce.a.setOnContextClickListener;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.a.setScrollIndicators;
import com.cardinalcommerce.a.setVerticalScrollbarPosition;
import com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
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

public final class JWEHeader extends setHorizontalScrollbarTrackDrawable {
    private static final Set<String> onValidated;
    public final EncryptionMethod Cardinal;
    private final Base64URL CardinalError;
    private final Base64URL CardinalRenderType;
    private final JWK cleanup;
    public final setOnContextClickListener configure;
    private final Base64URL getSDKVersion;
    private final Base64URL getWarnings;
    private final Base64URL onCReqSuccess;
    private final int values;

    public final /* bridge */ /* synthetic */ List cca_continue() {
        return super.cca_continue();
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("authTag");
        onValidated = Collections.unmodifiableSet(hashSet);
    }

    public static class getInstance {
        Set<String> Cardinal;
        Base64URL CardinalActionCode;
        Base64URL CardinalChallengeObserver;
        private final EncryptionMethod CardinalConfigurationParameters;
        Base64URL CardinalEnvironment;
        Base64URL CardinalError;
        setOnContextClickListener CardinalRenderType;
        Map<String, Object> CardinalUiType;
        String cca_continue;
        Base64URL cleanup;
        JWK configure;
        Base64URL getActionCode;
        URI getInstance;
        private final JWEAlgorithm getRequestTimeout;
        @Deprecated
        Base64URL getSDKVersion;
        int getString;
        public String getWarnings;
        setScrollIndicators init;
        URI onCReqSuccess;
        List<Base64> onValidated;
        public JWK valueOf;
        Base64URL values;

        public getInstance(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
            if (!jWEAlgorithm.configure.equals(setVerticalScrollbarTrackDrawable.cca_continue.configure)) {
                this.getRequestTimeout = jWEAlgorithm;
                if (encryptionMethod != null) {
                    this.CardinalConfigurationParameters = encryptionMethod;
                    return;
                }
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }

        public final JWEHeader configure() {
            return new JWEHeader(this.getRequestTimeout, this.CardinalConfigurationParameters, this.init, this.cca_continue, this.Cardinal, this.getInstance, this.configure, this.onCReqSuccess, this.getSDKVersion, this.cleanup, this.onValidated, this.getWarnings, this.valueOf, this.CardinalRenderType, this.CardinalError, this.CardinalEnvironment, this.values, this.getString, this.getActionCode, this.CardinalChallengeObserver, this.CardinalUiType, this.CardinalActionCode);
        }
    }

    public JWEHeader(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, (setScrollIndicators) null, (String) null, (Set<String>) null, (URI) null, (JWK) null, (URI) null, (Base64URL) null, (Base64URL) null, (List<Base64>) null, (String) null, (JWK) null, (setOnContextClickListener) null, (Base64URL) null, (Base64URL) null, (Base64URL) null, 0, (Base64URL) null, (Base64URL) null, (Map<String, Object>) null, (Base64URL) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JWEHeader(setVerticalScrollbarTrackDrawable setverticalscrollbartrackdrawable, EncryptionMethod encryptionMethod, setScrollIndicators setscrollindicators, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, setOnContextClickListener setoncontextclicklistener, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i, Base64URL base64URL6, Base64URL base64URL7, Map<String, Object> map, Base64URL base64URL8) {
        super(setverticalscrollbartrackdrawable, setscrollindicators, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        EncryptionMethod encryptionMethod2 = encryptionMethod;
        JWK jwk3 = jwk2;
        if (setverticalscrollbartrackdrawable.configure.equals(setVerticalScrollbarTrackDrawable.cca_continue.configure)) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        } else if (encryptionMethod2 == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        } else if (jwk3 == null || !jwk2.getInstance()) {
            this.Cardinal = encryptionMethod2;
            this.cleanup = jwk3;
            this.configure = setoncontextclicklistener;
            this.getWarnings = base64URL3;
            this.getSDKVersion = base64URL4;
            this.onCReqSuccess = base64URL5;
            this.values = i;
            this.CardinalRenderType = base64URL6;
            this.CardinalError = base64URL7;
        } else {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
    }

    public final JWEAlgorithm init() {
        return (JWEAlgorithm) super.configure();
    }

    public final JSONObject Cardinal() {
        JSONObject Cardinal2 = super.Cardinal();
        EncryptionMethod encryptionMethod = this.Cardinal;
        if (encryptionMethod != null) {
            Cardinal2.put("enc", encryptionMethod.toString());
        }
        JWK jwk = this.cleanup;
        if (jwk != null) {
            Cardinal2.put("epk", jwk.cca_continue());
        }
        setOnContextClickListener setoncontextclicklistener = this.configure;
        if (setoncontextclicklistener != null) {
            Cardinal2.put("zip", setoncontextclicklistener.toString());
        }
        Base64URL base64URL = this.getWarnings;
        if (base64URL != null) {
            Cardinal2.put("apu", base64URL.toString());
        }
        Base64URL base64URL2 = this.getSDKVersion;
        if (base64URL2 != null) {
            Cardinal2.put("apv", base64URL2.toString());
        }
        Base64URL base64URL3 = this.onCReqSuccess;
        if (base64URL3 != null) {
            Cardinal2.put("p2s", base64URL3.toString());
        }
        int i = this.values;
        if (i > 0) {
            Cardinal2.put("p2c", Integer.valueOf(i));
        }
        Base64URL base64URL4 = this.CardinalRenderType;
        if (base64URL4 != null) {
            Cardinal2.put("iv", base64URL4.toString());
        }
        Base64URL base64URL5 = this.CardinalError;
        if (base64URL5 != null) {
            Cardinal2.put("tag", base64URL5.toString());
        }
        return Cardinal2;
    }

    public static JWEHeader Cardinal(Base64URL base64URL) throws ParseException {
        List list;
        JSONObject instance = setAccessibilityPaneTitle.getInstance(new String(setPreferKeepClear.cca_continue(base64URL.cca_continue), setAllowedHandwritingDelegatePackage.configure));
        setVerticalScrollbarTrackDrawable init = setVerticalScrollbarPosition.init(instance);
        if (init instanceof JWEAlgorithm) {
            getInstance getinstance = new getInstance((JWEAlgorithm) init, EncryptionMethod.init((String) setAccessibilityPaneTitle.init(instance, "enc", String.class)));
            getinstance.CardinalActionCode = base64URL;
            for (String str : instance.keySet()) {
                if (!"alg".equals(str) && !"enc".equals(str)) {
                    if ("typ".equals(str)) {
                        String str2 = (String) setAccessibilityPaneTitle.init(instance, str, String.class);
                        if (str2 != null) {
                            getinstance.init = new setScrollIndicators(str2);
                        }
                    } else if ("cty".equals(str)) {
                        getinstance.cca_continue = (String) setAccessibilityPaneTitle.init(instance, str, String.class);
                    } else if ("crit".equals(str)) {
                        String[] configure2 = setAccessibilityPaneTitle.configure(instance, str);
                        if (configure2 == null) {
                            list = null;
                        } else {
                            list = Arrays.asList(configure2);
                        }
                        if (list != null) {
                            getinstance.Cardinal = new HashSet(list);
                        }
                    } else if ("jku".equals(str)) {
                        getinstance.getInstance = setAccessibilityPaneTitle.getInstance(instance, str);
                    } else if ("jwk".equals(str)) {
                        JSONObject jSONObject = (JSONObject) setAccessibilityPaneTitle.init(instance, str, JSONObject.class);
                        if (jSONObject != null) {
                            getinstance.configure = JWK.cca_continue(jSONObject);
                        }
                    } else if ("x5u".equals(str)) {
                        getinstance.onCReqSuccess = setAccessibilityPaneTitle.getInstance(instance, str);
                    } else if ("x5t".equals(str)) {
                        getinstance.getSDKVersion = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("x5t#S256".equals(str)) {
                        getinstance.cleanup = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("x5c".equals(str)) {
                        getinstance.onValidated = setAccessibilityPaneTitle.configure((JSONArray) setAccessibilityPaneTitle.init(instance, str, JSONArray.class));
                    } else if ("kid".equals(str)) {
                        getinstance.getWarnings = (String) setAccessibilityPaneTitle.init(instance, str, String.class);
                    } else if ("epk".equals(str)) {
                        getinstance.valueOf = JWK.cca_continue((JSONObject) setAccessibilityPaneTitle.init(instance, str, JSONObject.class));
                    } else if ("zip".equals(str)) {
                        String str3 = (String) setAccessibilityPaneTitle.init(instance, str, String.class);
                        if (str3 != null) {
                            getinstance.CardinalRenderType = new setOnContextClickListener(str3);
                        }
                    } else if ("apu".equals(str)) {
                        getinstance.CardinalError = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("apv".equals(str)) {
                        getinstance.CardinalEnvironment = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("p2s".equals(str)) {
                        getinstance.values = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("p2c".equals(str)) {
                        Number number = (Number) setAccessibilityPaneTitle.init(instance, str, Number.class);
                        if (number != null) {
                            int intValue = number.intValue();
                            if (intValue >= 0) {
                                getinstance.getString = intValue;
                            } else {
                                throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
                            }
                        } else {
                            throw new ParseException(new StringBuilder("JSON object member with key \"").append(str).append("\" is missing or null").toString(), 0);
                        }
                    } else if ("iv".equals(str)) {
                        getinstance.getActionCode = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else if ("tag".equals(str)) {
                        getinstance.CardinalChallengeObserver = Base64URL.configure((String) setAccessibilityPaneTitle.init(instance, str, String.class));
                    } else {
                        Object obj = instance.get(str);
                        if (!onValidated.contains(str)) {
                            if (getinstance.CardinalUiType == null) {
                                getinstance.CardinalUiType = new HashMap();
                            }
                            getinstance.CardinalUiType.put(str, obj);
                        } else {
                            throw new IllegalArgumentException(new StringBuilder("The parameter name \"").append(str).append("\" matches a registered name").toString());
                        }
                    }
                }
            }
            return getinstance.configure();
        }
        throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
    }

    public final /* bridge */ /* synthetic */ setVerticalScrollbarTrackDrawable configure() {
        return (JWEAlgorithm) super.configure();
    }
}
