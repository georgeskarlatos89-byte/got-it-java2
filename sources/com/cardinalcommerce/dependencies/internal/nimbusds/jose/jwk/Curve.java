package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import com.cardinalcommerce.a.setNextFocusDownId;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Curve implements Serializable {
    public static final Curve Cardinal = new Curve("Ed25519", "Ed25519", (String) null);
    public static final Curve cca_continue = new Curve("P-384", "secp384r1", "1.3.132.0.34");
    public static final Curve cleanup = new Curve("X448", "X448", (String) null);
    public static final Curve configure = new Curve("secp256k1", "secp256k1", "1.3.132.0.10");
    public static final Curve getInstance = new Curve("P-256", "secp256r1", "1.2.840.10045.3.1.7");
    public static final Curve getWarnings = new Curve("X25519", "X25519", (String) null);
    public static final Curve init = new Curve("P-521", "secp521r1", "1.3.132.0.35");
    @Deprecated
    private static Curve onCReqSuccess = new Curve("P-256K", "secp256k1", "1.3.132.0.10");
    public static final Curve onValidated = new Curve("Ed448", "Ed448", (String) null);
    private final String CardinalError;
    private final String CardinalRenderType;
    private final String getSDKVersion;

    private Curve(String str) {
        this(str, (String) null, (String) null);
    }

    private Curve(String str, String str2, String str3) {
        if (str != null) {
            this.getSDKVersion = str;
            this.CardinalRenderType = str2;
            this.CardinalError = str3;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Curve) && toString().equals(obj.toString());
    }

    public static Curve configure(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
        }
        Curve curve = getInstance;
        if (str.equals(curve.getSDKVersion)) {
            return curve;
        }
        if (str.equals(onCReqSuccess.getSDKVersion)) {
            return onCReqSuccess;
        }
        Curve curve2 = configure;
        if (str.equals(curve2.getSDKVersion)) {
            return curve2;
        }
        Curve curve3 = cca_continue;
        if (str.equals(curve3.getSDKVersion)) {
            return curve3;
        }
        Curve curve4 = init;
        if (str.equals(curve4.getSDKVersion)) {
            return curve4;
        }
        Curve curve5 = Cardinal;
        if (str.equals(curve5.getSDKVersion)) {
            return curve5;
        }
        Curve curve6 = onValidated;
        if (str.equals(curve6.getSDKVersion)) {
            return curve6;
        }
        Curve curve7 = getWarnings;
        if (str.equals(curve7.getSDKVersion)) {
            return curve7;
        }
        Curve curve8 = cleanup;
        if (str.equals(curve8.getSDKVersion)) {
            return curve8;
        }
        return new Curve(str);
    }

    public static Set<Curve> getInstance(JWSAlgorithm jWSAlgorithm) {
        if (JWSAlgorithm.onCReqSuccess.equals(jWSAlgorithm)) {
            return Collections.singleton(getInstance);
        }
        if (JWSAlgorithm.getSDKVersion.equals(jWSAlgorithm)) {
            return Collections.singleton(configure);
        }
        if (JWSAlgorithm.onValidated.equals(jWSAlgorithm)) {
            return Collections.singleton(cca_continue);
        }
        if (JWSAlgorithm.cleanup.equals(jWSAlgorithm)) {
            return Collections.singleton(init);
        }
        if (!JWSAlgorithm.CardinalEnvironment.equals(jWSAlgorithm)) {
            return null;
        }
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{Cardinal, onValidated})));
    }

    public static Curve init(ECParameterSpec eCParameterSpec) {
        return setNextFocusDownId.Cardinal(eCParameterSpec);
    }

    public final String toString() {
        return this.getSDKVersion;
    }
}
