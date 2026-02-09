package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setRevealOnFocusHint;
import com.cardinalcommerce.a.setVerticalScrollbarTrackDrawable;

public final class JWEAlgorithm extends setVerticalScrollbarTrackDrawable {
    @Deprecated
    public static final JWEAlgorithm Cardinal = new JWEAlgorithm("RSA1_5", setRevealOnFocusHint.REQUIRED);
    private static JWEAlgorithm CardinalActionCode = new JWEAlgorithm("PBES2-HS384+A192KW", setRevealOnFocusHint.OPTIONAL);
    private static JWEAlgorithm CardinalChallengeObserver = new JWEAlgorithm("PBES2-HS256+A128KW", setRevealOnFocusHint.OPTIONAL);
    private static JWEAlgorithm CardinalEnvironment = new JWEAlgorithm("ECDH-ES+A256KW", setRevealOnFocusHint.RECOMMENDED);
    private static JWEAlgorithm CardinalError = new JWEAlgorithm("ECDH-ES+A192KW", setRevealOnFocusHint.OPTIONAL);
    private static JWEAlgorithm CardinalRenderType = new JWEAlgorithm("A192GCMKW", setRevealOnFocusHint.OPTIONAL);
    private static JWEAlgorithm cleanup = new JWEAlgorithm("A256KW", setRevealOnFocusHint.RECOMMENDED);
    private static JWEAlgorithm getActionCode = new JWEAlgorithm("PBES2-HS512+A256KW", setRevealOnFocusHint.OPTIONAL);
    public static final JWEAlgorithm getInstance = new JWEAlgorithm("RSA-OAEP-256", setRevealOnFocusHint.OPTIONAL);
    private static JWEAlgorithm getSDKVersion = new JWEAlgorithm("A192KW", setRevealOnFocusHint.OPTIONAL);
    private static JWEAlgorithm getString = new JWEAlgorithm("A256GCMKW", setRevealOnFocusHint.OPTIONAL);
    public static final JWEAlgorithm getWarnings = new JWEAlgorithm("dir", setRevealOnFocusHint.RECOMMENDED);
    @Deprecated
    public static final JWEAlgorithm init = new JWEAlgorithm("RSA-OAEP", setRevealOnFocusHint.OPTIONAL);
    private static JWEAlgorithm onCReqSuccess = new JWEAlgorithm("A128KW", setRevealOnFocusHint.RECOMMENDED);
    private static JWEAlgorithm onValidated = new JWEAlgorithm("ECDH-ES", setRevealOnFocusHint.RECOMMENDED);
    private static JWEAlgorithm valueOf = new JWEAlgorithm("ECDH-ES+A128KW", setRevealOnFocusHint.RECOMMENDED);
    private static JWEAlgorithm values = new JWEAlgorithm("A128GCMKW", setRevealOnFocusHint.OPTIONAL);

    private JWEAlgorithm(String str, setRevealOnFocusHint setrevealonfocushint) {
        super(str, setrevealonfocushint);
    }

    private JWEAlgorithm(String str) {
        super(str, (setRevealOnFocusHint) null);
    }

    public static JWEAlgorithm Cardinal(String str) {
        JWEAlgorithm jWEAlgorithm = Cardinal;
        if (str.equals(jWEAlgorithm.configure)) {
            return jWEAlgorithm;
        }
        JWEAlgorithm jWEAlgorithm2 = init;
        if (str.equals(jWEAlgorithm2.configure)) {
            return jWEAlgorithm2;
        }
        JWEAlgorithm jWEAlgorithm3 = getInstance;
        if (str.equals(jWEAlgorithm3.configure)) {
            return jWEAlgorithm3;
        }
        if (str.equals(onCReqSuccess.configure)) {
            return onCReqSuccess;
        }
        if (str.equals(getSDKVersion.configure)) {
            return getSDKVersion;
        }
        if (str.equals(cleanup.configure)) {
            return cleanup;
        }
        JWEAlgorithm jWEAlgorithm4 = getWarnings;
        if (str.equals(jWEAlgorithm4.configure)) {
            return jWEAlgorithm4;
        }
        if (str.equals(onValidated.configure)) {
            return onValidated;
        }
        if (str.equals(valueOf.configure)) {
            return valueOf;
        }
        if (str.equals(CardinalError.configure)) {
            return CardinalError;
        }
        if (str.equals(CardinalEnvironment.configure)) {
            return CardinalEnvironment;
        }
        if (str.equals(values.configure)) {
            return values;
        }
        if (str.equals(CardinalRenderType.configure)) {
            return CardinalRenderType;
        }
        if (str.equals(getString.configure)) {
            return getString;
        }
        if (str.equals(CardinalChallengeObserver.configure)) {
            return CardinalChallengeObserver;
        }
        if (str.equals(CardinalActionCode.configure)) {
            return CardinalActionCode;
        }
        if (str.equals(getActionCode.configure)) {
            return getActionCode;
        }
        return new JWEAlgorithm(str);
    }
}
