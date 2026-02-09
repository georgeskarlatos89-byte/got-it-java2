package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.sphincs;

import com.cardinalcommerce.a.ErrorMessage;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.getTransactionID;
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

public class Sphincs256KeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        return new getTransactionID(privateKeyInfo);
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return new ErrorMessage(subjectPublicKeyInfo);
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof getTransactionID) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else if (!(key instanceof ErrorMessage)) {
            throw new InvalidKeySpecException(new StringBuilder("Unsupported key type: ").append(key.getClass()).append(".").toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException(new StringBuilder("Unknown key specification: ").append(cls).append(".").toString());
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof getTransactionID) || (key instanceof ErrorMessage)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return new getTransactionID(PrivateKeyInfo.cca_continue(getThreeDSRequestorAppURL.Cardinal(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unsupported key specification: ").append(keySpec.getClass()).append(".").toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return new ErrorMessage(SubjectPublicKeyInfo.configure(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unknown key specification: ").append(keySpec).append(".").toString());
        }
    }
}
