package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.interfaces.RSAPublicKey;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class RSAEncrypter extends RSACryptoProvider implements JWEEncrypter {
    private final RSAPublicKey publicKey;

    public /* bridge */ /* synthetic */ JWEJCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public /* bridge */ /* synthetic */ Set supportedEncryptionMethods() {
        return super.supportedEncryptionMethods();
    }

    public /* bridge */ /* synthetic */ Set supportedJWEAlgorithms() {
        return super.supportedJWEAlgorithms();
    }

    public RSAEncrypter(RSAPublicKey rSAPublicKey) {
        if (rSAPublicKey != null) {
            this.publicKey = rSAPublicKey;
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }

    public RSAEncrypter(RSAKey rSAKey) throws JOSEException {
        this(rSAKey.toRSAPublicKey());
    }

    public RSAPublicKey getPublicKey() {
        return this.publicKey;
    }

    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        Base64URL base64URL;
        JWEAlgorithm algorithm = jWEHeader.getAlgorithm();
        SecretKey generateCEK = ContentCryptoProvider.generateCEK(jWEHeader.getEncryptionMethod(), getJCAContext().getSecureRandom());
        if (algorithm.equals(JWEAlgorithm.RSA1_5)) {
            base64URL = Base64URL.encode(RSA1_5.encryptCEK(this.publicKey, generateCEK, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP)) {
            base64URL = Base64URL.encode(RSA_OAEP.encryptCEK(this.publicKey, generateCEK, getJCAContext().getKeyEncryptionProvider()));
        } else if (algorithm.equals(JWEAlgorithm.RSA_OAEP_256)) {
            base64URL = Base64URL.encode(RSA_OAEP_256.encryptCEK(this.publicKey, generateCEK, getJCAContext().getKeyEncryptionProvider()));
        } else {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithm, SUPPORTED_ALGORITHMS));
        }
        return ContentCryptoProvider.encrypt(jWEHeader, bArr, generateCEK, base64URL, getJCAContext());
    }
}
