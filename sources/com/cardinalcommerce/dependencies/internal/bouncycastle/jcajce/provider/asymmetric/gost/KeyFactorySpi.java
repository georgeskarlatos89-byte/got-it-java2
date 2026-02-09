package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.IESUtil;
import com.cardinalcommerce.a.KeyUtil;
import com.cardinalcommerce.a.McElieceCCA2KeyFactorySpi;
import com.cardinalcommerce.a.McElieceKeyFactorySpi;
import com.cardinalcommerce.a.NHKeyFactorySpi;
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

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof McElieceCCA2KeyFactorySpi ? new BCGOST3410PrivateKey((McElieceCCA2KeyFactorySpi) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof McElieceKeyFactorySpi ? new BCGOST3410PublicKey((McElieceKeyFactorySpi) keySpec) : super.engineGeneratePublic(keySpec);
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof IESUtil) {
            return new BCGOST3410PublicKey((IESUtil) key);
        }
        if (key instanceof KeyUtil) {
            return new BCGOST3410PrivateKey((KeyUtil) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(McElieceKeyFactorySpi.class) && (key instanceof IESUtil)) {
            IESUtil iESUtil = (IESUtil) key;
            NHKeyFactorySpi Cardinal = iESUtil.Cardinal().Cardinal();
            return new McElieceKeyFactorySpi(iESUtil.getInstance(), Cardinal.init, Cardinal.getInstance, Cardinal.configure);
        } else if (!cls.isAssignableFrom(McElieceCCA2KeyFactorySpi.class) || !(key instanceof KeyUtil)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            KeyUtil keyUtil = (KeyUtil) key;
            NHKeyFactorySpi Cardinal2 = keyUtil.Cardinal().Cardinal();
            return new McElieceCCA2KeyFactorySpi(keyUtil.configure(), Cardinal2.init, Cardinal2.getInstance, Cardinal2.configure);
        }
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(IES.getSDKVersion)) {
            return new BCGOST3410PrivateKey(privateKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(IES.getSDKVersion)) {
            return new BCGOST3410PublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }
}
