package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.jwk.Curve;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

abstract class ECDHCryptoProvider extends BaseJWEProvider {
    public static final Set<JWEAlgorithm> SUPPORTED_ALGORITHMS;
    public static final Set<Curve> SUPPORTED_ELLIPTIC_CURVES;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS = ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS;
    private final ConcatKDF concatKDF;
    private final Curve curve;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.ECDH_ES);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A128KW);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A192KW);
        linkedHashSet.add(JWEAlgorithm.ECDH_ES_A256KW);
        SUPPORTED_ALGORITHMS = Collections.unmodifiableSet(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(Curve.P_256);
        linkedHashSet2.add(Curve.P_384);
        linkedHashSet2.add(Curve.P_521);
        SUPPORTED_ELLIPTIC_CURVES = Collections.unmodifiableSet(linkedHashSet2);
    }

    protected ECDHCryptoProvider(Curve curve2) throws JOSEException {
        super(SUPPORTED_ALGORITHMS, ContentCryptoProvider.SUPPORTED_ENCRYPTION_METHODS);
        Curve curve3;
        if (curve2 != null) {
            curve3 = curve2;
        } else {
            curve3 = new Curve("unknown");
        }
        Set<Curve> set = SUPPORTED_ELLIPTIC_CURVES;
        if (set.contains(curve2)) {
            this.curve = curve2;
            this.concatKDF = new ConcatKDF("SHA-256");
            return;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedEllipticCurve(curve3, set));
    }

    /* access modifiers changed from: protected */
    public ConcatKDF getConcatKDF() {
        return this.concatKDF;
    }

    public Set<Curve> supportedEllipticCurves() {
        return SUPPORTED_ELLIPTIC_CURVES;
    }

    public Curve getCurve() {
        return this.curve;
    }
}
