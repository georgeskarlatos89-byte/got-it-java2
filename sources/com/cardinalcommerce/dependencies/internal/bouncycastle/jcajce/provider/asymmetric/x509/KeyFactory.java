package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class KeyFactory extends KeyFactorySpi {
    /* access modifiers changed from: protected */
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PKCS8EncodedKeySpec.class) && key.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key.getEncoded());
        }
        if (cls.isAssignableFrom(X509EncodedKeySpec.class) && key.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key.getEncoded());
        }
        throw new InvalidKeySpecException(new StringBuilder("not implemented yet ").append(key).append(" ").append(cls).toString());
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("not implemented yet ".concat(String.valueOf(key)));
    }

    /* access modifiers changed from: protected */
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                PrivateKeyInfo cca_continue = PrivateKeyInfo.cca_continue(((PKCS8EncodedKeySpec) keySpec).getEncoded());
                PrivateKey Cardinal = com.cardinalcommerce.a.KeyFactory.Cardinal(cca_continue);
                if (Cardinal != null) {
                    return Cardinal;
                }
                throw new InvalidKeySpecException(new StringBuilder("no factory found for OID: ").append(cca_continue.cca_continue.cca_continue).toString());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unknown KeySpec type: ").append(keySpec.getClass().getName()).toString());
        }
    }

    /* access modifiers changed from: protected */
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                SubjectPublicKeyInfo configure = SubjectPublicKeyInfo.configure(((X509EncodedKeySpec) keySpec).getEncoded());
                PublicKey init = com.cardinalcommerce.a.KeyFactory.init(configure);
                if (init != null) {
                    return init;
                }
                throw new InvalidKeySpecException(new StringBuilder("no factory found for OID: ").append(configure.cca_continue.cca_continue).toString());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException(new StringBuilder("Unknown KeySpec type: ").append(keySpec.getClass().getName()).toString());
        }
    }
}
