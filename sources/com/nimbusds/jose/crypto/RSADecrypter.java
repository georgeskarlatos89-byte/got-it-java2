package com.nimbusds.jose.crypto;

import com.nimbusds.jose.CriticalHeaderParamsAware;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEDecrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.PrivateKey;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class RSADecrypter extends RSACryptoProvider implements JWEDecrypter, CriticalHeaderParamsAware {
    private Exception cekDecryptionException;
    private final CriticalHeaderParamsDeferral critPolicy;
    private final PrivateKey privateKey;

    public /* bridge */ /* synthetic */ JWEJCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }

    public RSADecrypter(PrivateKey privateKey2) {
        this(privateKey2, (Set<String>) null);
    }

    public RSADecrypter(RSAKey rSAKey) throws JOSEException {
        this.critPolicy = new CriticalHeaderParamsDeferral();
        if (rSAKey.isPrivate()) {
            this.privateKey = rSAKey.toPrivateKey();
            return;
        }
        throw new JOSEException("The RSA JWK doesn't contain a private part");
    }

    public RSADecrypter(PrivateKey privateKey2, Set<String> set) {
        CriticalHeaderParamsDeferral criticalHeaderParamsDeferral = new CriticalHeaderParamsDeferral();
        this.critPolicy = criticalHeaderParamsDeferral;
        if (privateKey2 == null) {
            throw new IllegalArgumentException("The private RSA key must not be null");
        } else if (privateKey2.getAlgorithm().equalsIgnoreCase("RSA")) {
            this.privateKey = privateKey2;
            criticalHeaderParamsDeferral.setDeferredCriticalHeaderParams(set);
        } else {
            throw new IllegalArgumentException("The private key algorithm must be RSA");
        }
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public Set<String> getProcessedCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public Set<String> getDeferredCriticalHeaderParams() {
        return this.critPolicy.getProcessedCriticalHeaderParams();
    }

    public byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        SecretKey secretKey;
        if (base64URL == null) {
            throw new JOSEException("Missing JWE encrypted key");
        } else if (base64URL2 == null) {
            throw new JOSEException("Missing JWE initialization vector (IV)");
        } else if (base64URL4 != null) {
            this.critPolicy.ensureHeaderPasses(jWEHeader);
            JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
            if (algorithm.equals(JWEAlgorithm.RSA1_5)) {
                int cekBitLength = jWEHeader.getEncryptionMethod().cekBitLength();
                secretKey = ContentCryptoProvider.generateCEK(jWEHeader.getEncryptionMethod(), getJCAContext().getSecureRandom());
                try {
                    SecretKey decryptCEK = RSA1_5.decryptCEK(this.privateKey, base64URL.decode(), cekBitLength, getJCAContext().getKeyEncryptionProvider());
                    if (decryptCEK != null) {
                        secretKey = decryptCEK;
                    }
                } catch (Exception e) {
                    this.cekDecryptionException = e;
                }
                this.cekDecryptionException = null;
            } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP)) {
                secretKey = RSA_OAEP.decryptCEK(this.privateKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
            } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
                secretKey = RSA_OAEP_256.decryptCEK(this.privateKey, base64URL.decode(), getJCAContext().getKeyEncryptionProvider());
            } else {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, SUPPORTED_ALGORITHMS));
            }
            return ContentCryptoProvider.decrypt(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4, secretKey, getJCAContext());
        } else {
            throw new JOSEException("Missing JWE authentication tag");
        }
    }

    public Exception getCEKDecryptionException() {
        return this.cekDecryptionException;
    }
}
