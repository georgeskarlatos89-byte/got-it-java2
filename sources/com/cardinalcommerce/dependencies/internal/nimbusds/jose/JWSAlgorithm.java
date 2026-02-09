package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setRevealOnFocusHint;
import com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable;

public final class JWSAlgorithm extends setVerticalScrollbarTrackDrawable {
    public static final JWSAlgorithm Cardinal = new JWSAlgorithm("RS512", setRevealOnFocusHint.OPTIONAL);
    public static final JWSAlgorithm CardinalEnvironment = new JWSAlgorithm("EdDSA", setRevealOnFocusHint.OPTIONAL);
    private static JWSAlgorithm CardinalError = new JWSAlgorithm("HS256", setRevealOnFocusHint.REQUIRED);
    public static final JWSAlgorithm CardinalRenderType = new JWSAlgorithm("PS512", setRevealOnFocusHint.OPTIONAL);
    public static final JWSAlgorithm cleanup = new JWSAlgorithm("ES512", setRevealOnFocusHint.OPTIONAL);
    public static final JWSAlgorithm getInstance = new JWSAlgorithm("RS384", setRevealOnFocusHint.OPTIONAL);
    public static final JWSAlgorithm getSDKVersion = new JWSAlgorithm("ES256K", setRevealOnFocusHint.OPTIONAL);
    private static JWSAlgorithm getString = new JWSAlgorithm("HS512", setRevealOnFocusHint.OPTIONAL);
    public static final JWSAlgorithm getWarnings = new JWSAlgorithm("PS256", setRevealOnFocusHint.OPTIONAL);
    public static final JWSAlgorithm init = new JWSAlgorithm("RS256", setRevealOnFocusHint.RECOMMENDED);
    public static final JWSAlgorithm onCReqSuccess = new JWSAlgorithm("ES256", setRevealOnFocusHint.RECOMMENDED);
    public static final JWSAlgorithm onValidated = new JWSAlgorithm("ES384", setRevealOnFocusHint.OPTIONAL);
    private static JWSAlgorithm valueOf = new JWSAlgorithm("HS384", setRevealOnFocusHint.OPTIONAL);
    public static final JWSAlgorithm values = new JWSAlgorithm("PS384", setRevealOnFocusHint.OPTIONAL);

    private JWSAlgorithm(String str, setRevealOnFocusHint setrevealonfocushint) {
        super(str, setrevealonfocushint);
    }

    private JWSAlgorithm(String str) {
        super(str, (setRevealOnFocusHint) null);
    }

    public static JWSAlgorithm getInstance(String str) {
        if (str.equals(CardinalError.configure)) {
            return CardinalError;
        }
        if (str.equals(valueOf.configure)) {
            return valueOf;
        }
        if (str.equals(getString.configure)) {
            return getString;
        }
        JWSAlgorithm jWSAlgorithm = init;
        if (str.equals(jWSAlgorithm.configure)) {
            return jWSAlgorithm;
        }
        JWSAlgorithm jWSAlgorithm2 = getInstance;
        if (str.equals(jWSAlgorithm2.configure)) {
            return jWSAlgorithm2;
        }
        JWSAlgorithm jWSAlgorithm3 = Cardinal;
        if (str.equals(jWSAlgorithm3.configure)) {
            return jWSAlgorithm3;
        }
        JWSAlgorithm jWSAlgorithm4 = onCReqSuccess;
        if (str.equals(jWSAlgorithm4.configure)) {
            return jWSAlgorithm4;
        }
        JWSAlgorithm jWSAlgorithm5 = getSDKVersion;
        if (str.equals(jWSAlgorithm5.configure)) {
            return jWSAlgorithm5;
        }
        JWSAlgorithm jWSAlgorithm6 = onValidated;
        if (str.equals(jWSAlgorithm6.configure)) {
            return jWSAlgorithm6;
        }
        JWSAlgorithm jWSAlgorithm7 = cleanup;
        if (str.equals(jWSAlgorithm7.configure)) {
            return jWSAlgorithm7;
        }
        JWSAlgorithm jWSAlgorithm8 = getWarnings;
        if (str.equals(jWSAlgorithm8.configure)) {
            return jWSAlgorithm8;
        }
        JWSAlgorithm jWSAlgorithm9 = values;
        if (str.equals(jWSAlgorithm9.configure)) {
            return jWSAlgorithm9;
        }
        JWSAlgorithm jWSAlgorithm10 = CardinalRenderType;
        if (str.equals(jWSAlgorithm10.configure)) {
            return jWSAlgorithm10;
        }
        JWSAlgorithm jWSAlgorithm11 = CardinalEnvironment;
        if (str.equals(jWSAlgorithm11.configure)) {
            return jWSAlgorithm11;
        }
        return new JWSAlgorithm(str);
    }
}
