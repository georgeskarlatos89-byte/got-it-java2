package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss;

import com.cardinalcommerce.a.getID;
import com.cardinalcommerce.a.getMessage;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class XMSSMTKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        return new getMessage(privateKeyInfo);
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return new getID(subjectPublicKeyInfo);
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof getMessage) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof getID)) {
            throw new InvalidKeySpecException(new StringBuilder("unsupported key type: ").append(key.getClass()).append(".").toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException(new StringBuilder("unknown key specification: ").append(cls).append(".").toString());
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof getMessage) || (key instanceof getID)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return new getMessage(PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("unsupported key specification: ").append(keySpec.getClass()).append(".").toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return new getID(SubjectPublicKeyInfo.configure(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("unknown key specification: ").append(keySpec).append(".").toString());
        }
    }
}
