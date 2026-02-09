package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.AlgorithmProvider;
import com.cardinalcommerce.a.ECUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PrimeCertaintyCalculator;
import com.cardinalcommerce.a.RainbowKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof AlgorithmProvider ? new BCElGamalPrivateKey((AlgorithmProvider) keySpec) : keySpec instanceof DHPrivateKeySpec ? new BCElGamalPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof RainbowKeyFactorySpi ? new BCElGamalPublicKey((RainbowKeyFactorySpi) keySpec) : keySpec instanceof DHPublicKeySpec ? new BCElGamalPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        } else if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
        }
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCElGamalPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCElGamalPrivateKey((DHPrivateKey) key);
        }
        if (key instanceof PrimeCertaintyCalculator) {
            return new BCElGamalPublicKey((PrimeCertaintyCalculator) key);
        }
        if (key instanceof ECUtil) {
            return new BCElGamalPrivateKey((ECUtil) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(KeyAgreementSpi.DHUwithSHA224CKDF.getActionCode)) {
            return new BCElGamalPrivateKey(privateKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(GMCipherSpi.SM2withMD5.getSignatureVerification)) {
            return new BCElGamalPrivateKey(privateKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(KeyAgreementSpi.DHUwithSHA1KDF.cleanup)) {
            return new BCElGamalPrivateKey(privateKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(KeyAgreementSpi.DHUwithSHA224CKDF.getActionCode)) {
            return new BCElGamalPublicKey(subjectPublicKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(GMCipherSpi.SM2withMD5.getSignatureVerification)) {
            return new BCElGamalPublicKey(subjectPublicKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(KeyAgreementSpi.DHUwithSHA1KDF.cleanup)) {
            return new BCElGamalPublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }
}
