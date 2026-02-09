package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.ECDH;
import com.nimbusds.jose.crypto.utils.ECChecks;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Set;
import javax.crypto.SecretKey;

public class ECDHDecrypter extends ECDHCryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {
    private final CriticalHeaderParamsDeferral critPolicy;
    private final ECPrivateKey privateKey;

    public /* bridge */ /* synthetic */ Curve getCurve() {
        return super.getCurve();
    }

    public /* bridge */ /* synthetic */ JWEJCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public /* bridge */ /* synthetic */ Set supportedEllipticCurves() {
        return super.supportedEllipticCurves();
    }

    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }

    public ECDHDecrypter(ECPrivateKey eCPrivateKey) throws JOSEException {
        this(eCPrivateKey, (Set<String>) null);
    }

    public ECDHDecrypter(ECKey eCKey) throws JOSEException {
        super(eCKey.getCurve());
        this.critPolicy = new CriticalHeaderParamsDeferral();
        if (eCKey.isPrivate()) {
            this.privateKey = eCKey.toECPrivateKey();
            return;
        }
        throw new JOSEException("The EC JWK doesn't contain a private part");
    }

    public ECDHDecrypter(ECPrivateKey eCPrivateKey, Set<String> set) throws JOSEException {
        super(Curve.forECParameterSpec(eCPrivateKey.getParams()));
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
        this.privateKey = eCPrivateKey;
    }

    public ECPrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public Set<String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public Set<String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        ECDH.AlgorithmMode resolveAlgorithmMode = ECDH.resolveAlgorithmMode(jWEHeader.getAlgorithm());
        this.critPolicy.ensureHeaderPasses(jWEHeader);
        ECKey ephemeralPublicKey = jWEHeader.getEphemeralPublicKey();
        if (ephemeralPublicKey != null) {
            ECPublicKey eCPublicKey = ephemeralPublicKey.toECPublicKey();
            if (ECChecks.isPointOnCurve(eCPublicKey, getPrivateKey())) {
                SecretKey deriveSharedSecret = ECDH.deriveSharedSecret(eCPublicKey, this.privateKey, getJCAContext().getKeyEncryptionProvider());
                getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
                SecretKey deriveSharedKey = ECDH.deriveSharedKey(jWEHeader, deriveSharedSecret, getConcatKDF());
                if (!resolveAlgorithmMode.equals(ECDH.AlgorithmMode.DIRECT)) {
                    if (!resolveAlgorithmMode.equals(ECDH.AlgorithmMode.KW)) {
                        throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + resolveAlgorithmMode);
                    } else if (base64URL != null) {
                        deriveSharedKey = AESKW.unwrapCEK(deriveSharedKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
                    } else {
                        throw new JOSEException("Missing JWE encrypted key");
                    }
                }
                return ContentCryptoProvider.decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, deriveSharedKey, getJCAContext());
            }
            throw new JOSEException("Invalid ephemeral public EC key: Point(s) not on the expected curve");
        }
        throw new JOSEException("Missing ephemeral public EC key \"epk\" JWE header parameter");
    }
}
