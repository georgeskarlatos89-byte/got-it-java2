package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.PemObject;
import com.cardinalcommerce.a.PemReader;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DSAPublicKeySpec.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey = (DSAPublicKey) key;
            return new DSAPublicKeySpec(dSAPublicKey.getY(), dSAPublicKey.getParams().getP(), dSAPublicKey.getParams().getQ(), dSAPublicKey.getParams().getG());
        } else if (cls.isAssignableFrom(DSAPrivateKeySpec.class) && (key instanceof DSAPrivateKey)) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) key;
            return new DSAPrivateKeySpec(dSAPrivateKey.getX(), dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG());
        } else if (cls.isAssignableFrom(PemReader.class) && (key instanceof DSAPublicKey)) {
            DSAPublicKey dSAPublicKey2 = (DSAPublicKey) key;
            try {
                return new PemReader(KeyAgreementSpi.MQVwithSHA1KDF.getInstance((setCCAImageUri) new KeyAgreementSpi.X448withSHA512CKDF(dSAPublicKey2.getY(), new KeyAgreementSpi.X448withSHA256CKDF(dSAPublicKey2.getParams().getP(), dSAPublicKey2.getParams().getQ(), dSAPublicKey2.getParams().getG()))));
            } catch (IOException e) {
                throw new IllegalArgumentException(new StringBuilder("unable to produce encoding: ").append(e.getMessage()).toString());
            }
        } else if (!cls.isAssignableFrom(PemObject.class) || !(key instanceof DSAPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            DSAPrivateKey dSAPrivateKey2 = (DSAPrivateKey) key;
            try {
                return new PemObject(PSSSignatureSpi.SHA3_256withRSA.init(new KeyAgreementSpi.X448UwithSHA512KDF(dSAPrivateKey2.getX(), new KeyAgreementSpi.X448withSHA256CKDF(dSAPrivateKey2.getParams().getP(), dSAPrivateKey2.getParams().getQ(), dSAPrivateKey2.getParams().getG()))));
            } catch (IOException e2) {
                throw new IllegalArgumentException(new StringBuilder("unable to produce encoding: ").append(e2.getMessage()).toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) key);
        }
        if (key instanceof DSAPrivateKey) {
            return new BCDSAPrivateKey((DSAPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        if (DSAUtil.init(aSN1ObjectIdentifier)) {
            return new BCDSAPrivateKey(privateKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        if (DSAUtil.init(aSN1ObjectIdentifier)) {
            return new BCDSAPublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPrivateKeySpec) {
            return new BCDSAPrivateKey((DSAPrivateKeySpec) keySpec);
        }
        if (!(keySpec instanceof PemObject)) {
            return super.engineGeneratePrivate(keySpec);
        }
        setCCAImageUri Cardinal = PSSSignatureSpi.SHA3_256withRSA.Cardinal(((PemObject) keySpec).getEncoded());
        if (Cardinal instanceof KeyAgreementSpi.X448UwithSHA512KDF) {
            KeyAgreementSpi.X448UwithSHA512KDF x448UwithSHA512KDF = (KeyAgreementSpi.X448UwithSHA512KDF) Cardinal;
            return engineGeneratePrivate(new DSAPrivateKeySpec(x448UwithSHA512KDF.Cardinal, x448UwithSHA512KDF.configure.configure, x448UwithSHA512KDF.configure.init, x448UwithSHA512KDF.configure.Cardinal));
        }
        throw new IllegalArgumentException("openssh private key is not dsa privare key");
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DSAPublicKeySpec) {
            try {
                return new BCDSAPublicKey((DSAPublicKeySpec) keySpec);
            } catch (Exception e) {
                throw new InvalidKeySpecException(new StringBuilder("invalid KeySpec: ").append(e.getMessage()).toString()) {
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else if (!(keySpec instanceof PemReader)) {
            return super.engineGeneratePublic(keySpec);
        } else {
            setCCAImageUri configure = KeyAgreementSpi.MQVwithSHA1KDF.configure(((PemReader) keySpec).getEncoded());
            if (configure instanceof KeyAgreementSpi.X448withSHA512CKDF) {
                KeyAgreementSpi.X448withSHA512CKDF x448withSHA512CKDF = (KeyAgreementSpi.X448withSHA512CKDF) configure;
                return engineGeneratePublic(new DSAPublicKeySpec(x448withSHA512CKDF.init, x448withSHA512CKDF.configure.configure, x448withSHA512CKDF.configure.init, x448withSHA512CKDF.configure.Cardinal));
            }
            throw new IllegalArgumentException("openssh public key is not dsa public key");
        }
    }
}
