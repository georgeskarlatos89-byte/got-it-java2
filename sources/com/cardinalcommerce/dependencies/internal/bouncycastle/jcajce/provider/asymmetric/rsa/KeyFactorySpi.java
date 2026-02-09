package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.PemObject;
import com.cardinalcommerce.a.PemReader;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ExtendedInvalidKeySpecException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof RSAPublicKeySpec) {
            return new BCRSAPublicKey((RSAPublicKeySpec) keySpec);
        }
        if (!(keySpec instanceof PemReader)) {
            return super.engineGeneratePublic(keySpec);
        }
        setCCAImageUri configure = KeyAgreementSpi.MQVwithSHA1KDF.configure(((PemReader) keySpec).getEncoded());
        if (configure instanceof DigestSignatureSpi.SHA256) {
            return new BCRSAPublicKey((DigestSignatureSpi.SHA256) configure);
        }
        throw new InvalidKeySpecException("Open SSH public key is not RSA public key");
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(RSAPublicKeySpec.class) && (key instanceof RSAPublicKey)) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) key;
            return new RSAPublicKeySpec(rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        } else if (cls.isAssignableFrom(RSAPrivateKeySpec.class) && (key instanceof RSAPrivateKey)) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) key;
            return new RSAPrivateKeySpec(rSAPrivateKey.getModulus(), rSAPrivateKey.getPrivateExponent());
        } else if (cls.isAssignableFrom(RSAPrivateCrtKeySpec.class) && (key instanceof RSAPrivateCrtKey)) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) key;
            return new RSAPrivateCrtKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent(), rSAPrivateCrtKey.getPrivateExponent(), rSAPrivateCrtKey.getPrimeP(), rSAPrivateCrtKey.getPrimeQ(), rSAPrivateCrtKey.getPrimeExponentP(), rSAPrivateCrtKey.getPrimeExponentQ(), rSAPrivateCrtKey.getCrtCoefficient());
        } else if (cls.isAssignableFrom(PemReader.class) && (key instanceof RSAPublicKey)) {
            try {
                return new PemReader(KeyAgreementSpi.MQVwithSHA1KDF.getInstance((setCCAImageUri) new DigestSignatureSpi.SHA256(false, ((RSAPublicKey) key).getModulus(), ((RSAPublicKey) key).getPublicExponent())));
            } catch (IOException e) {
                throw new IllegalArgumentException(new StringBuilder("unable to produce encoding: ").append(e.getMessage()).toString());
            }
        } else if (!cls.isAssignableFrom(PemObject.class) || !(key instanceof RSAPrivateCrtKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            try {
                return new PemObject(PSSSignatureSpi.SHA3_256withRSA.init(new DigestSignatureSpi.RIPEMD256(((RSAPrivateCrtKey) key).getModulus(), ((RSAPrivateCrtKey) key).getPublicExponent(), ((RSAPrivateCrtKey) key).getPrivateExponent(), ((RSAPrivateCrtKey) key).getPrimeP(), ((RSAPrivateCrtKey) key).getPrimeQ(), ((RSAPrivateCrtKey) key).getPrimeExponentP(), ((RSAPrivateCrtKey) key).getPrimeExponentQ(), ((RSAPrivateCrtKey) key).getCrtCoefficient())));
            } catch (IOException e2) {
                throw new IllegalArgumentException(new StringBuilder("unable to produce encoding: ").append(e2.getMessage()).toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof RSAPublicKey) {
            return new BCRSAPublicKey((RSAPublicKey) key);
        }
        if (key instanceof RSAPrivateCrtKey) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKey) key);
        }
        if (key instanceof RSAPrivateKey) {
            return new BCRSAPrivateKey((RSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return cca_continue(PrivateKeyInfo.cca_continue(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                try {
                    byte[] encoded = ((PKCS8EncodedKeySpec) keySpec).getEncoded();
                    return new BCRSAPrivateCrtKey(encoded != null ? new KeyAgreementSpi.DHUwithSHA512CKDF(isEnableLogging.getInstance((Object) encoded)) : null);
                } catch (Exception unused) {
                    throw new ExtendedInvalidKeySpecException(new StringBuilder("unable to process key spec: ").append(e.toString()).toString(), e);
                }
            }
        } else if (keySpec instanceof RSAPrivateCrtKeySpec) {
            return new BCRSAPrivateCrtKey((RSAPrivateCrtKeySpec) keySpec);
        } else {
            if (keySpec instanceof RSAPrivateKeySpec) {
                return new BCRSAPrivateKey((RSAPrivateKeySpec) keySpec);
            }
            if (keySpec instanceof PemObject) {
                setCCAImageUri Cardinal = PSSSignatureSpi.SHA3_256withRSA.Cardinal(((PemObject) keySpec).getEncoded());
                if (Cardinal instanceof DigestSignatureSpi.RIPEMD256) {
                    return new BCRSAPrivateCrtKey((DigestSignatureSpi.RIPEMD256) Cardinal);
                }
                throw new InvalidKeySpecException("open SSH public key is not RSA private key");
            }
            throw new InvalidKeySpecException(new StringBuilder("unknown KeySpec type: ").append(keySpec.getClass().getName()).toString());
        }
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        if (RSAUtil.Cardinal(aSN1ObjectIdentifier)) {
            getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance());
            KeyAgreementSpi.DHUwithSHA512CKDF dHUwithSHA512CKDF = Cardinal != null ? new KeyAgreementSpi.DHUwithSHA512CKDF(isEnableLogging.getInstance((Object) Cardinal)) : null;
            return dHUwithSHA512CKDF.onCReqSuccess.intValue() == 0 ? new BCRSAPrivateKey(dHUwithSHA512CKDF) : new BCRSAPrivateCrtKey(privateKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        if (RSAUtil.Cardinal(aSN1ObjectIdentifier)) {
            return new BCRSAPublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }
}
