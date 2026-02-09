package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.crypto.ECDH;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Set;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class ECDHEncrypter extends ECDHCryptoProvider implements JWEEncrypter {
    private final ECPublicKey publicKey;

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

    public ECDHEncrypter(ECPublicKey eCPublicKey) throws JOSEException {
        super(Curve.forECParameterSpec(eCPublicKey.getParams()));
        this.publicKey = eCPublicKey;
    }

    public ECDHEncrypter(ECKey eCKey) throws JOSEException {
        super(eCKey.getCurve());
        this.publicKey = eCKey.toECPublicKey();
    }

    public ECPublicKey getPublicKey() {
        return this.publicKey;
    }

    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        Base64URL base64URL;
        ECDH.AlgorithmMode resolveAlgorithmMode = ECDH.resolveAlgorithmMode(jWEHeader.getAlgorithm());
        EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        KeyPair generateEphemeralKeyPair = generateEphemeralKeyPair(this.publicKey.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) generateEphemeralKeyPair.getPublic();
        SecretKey deriveSharedSecret = ECDH.deriveSharedSecret(this.publicKey, (ECPrivateKey) generateEphemeralKeyPair.getPrivate(), getJCAContext().getKeyEncryptionProvider());
        getConcatKDF().getJCAContext().setProvider(getJCAContext().getMACProvider());
        SecretKey deriveSharedKey = ECDH.deriveSharedKey(jWEHeader, deriveSharedSecret, getConcatKDF());
        if (resolveAlgorithmMode.equals(ECDH.AlgorithmMode.DIRECT)) {
            base64URL = null;
        } else if (resolveAlgorithmMode.equals(ECDH.AlgorithmMode.KW)) {
            SecretKey generateCEK = ContentCryptoProvider.generateCEK(encryptionMethod, getJCAContext().getSecureRandom());
            deriveSharedKey = generateCEK;
            base64URL = Base64URL.encode(AESKW.wrapCEK(generateCEK, deriveSharedKey, getJCAContext().getKeyEncryptionProvider()));
        } else {
            throw new JOSEException("Unexpected JWE ECDH algorithm mode: " + resolveAlgorithmMode);
        }
        return ContentCryptoProvider.encrypt(new JWEHeader.Builder(jWEHeader).ephemeralPublicKey(new ECKey.Builder(getCurve(), eCPublicKey).build()).build(), bArr, deriveSharedKey, base64URL, getJCAContext());
    }

    private KeyPair generateEphemeralKeyPair(ECParameterSpec eCParameterSpec) throws JOSEException {
        KeyPairGenerator keyPairGenerator;
        Provider keyEncryptionProvider = getJCAContext().getKeyEncryptionProvider();
        if (keyEncryptionProvider != null) {
            try {
                keyPairGenerator = KeyPairGenerator.getInstance("EC", keyEncryptionProvider);
            } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e) {
                throw new JOSEException("Couldn't generate ephemeral EC key pair: " + e.getMessage(), e);
            }
        } else {
            keyPairGenerator = KeyPairGenerator.getInstance("EC");
        }
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }
}
