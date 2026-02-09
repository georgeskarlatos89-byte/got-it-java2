package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.PQCObjectIdentifiers;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.X509SignatureUtil;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class KeyFactorySpi extends BaseKeyFactorySpi {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof X509SignatureUtil ? new BCECGOST3410PrivateKey((X509SignatureUtil) keySpec) : keySpec instanceof ECPrivateKeySpec ? new BCECGOST3410PrivateKey((ECPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        return keySpec instanceof PQCObjectIdentifiers ? new BCECGOST3410PublicKey((PQCObjectIdentifiers) keySpec, KeyFactory.init) : keySpec instanceof ECPublicKeySpec ? new BCECGOST3410PublicKey((ECPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            X509CertificateObject cca_continue = KeyFactory.init.cca_continue();
            ECPoint w = eCPublicKey.getW();
            toJSONString tojsonstring = cca_continue.cca_continue;
            byte[] bArr = cca_continue.init;
            return new ECPublicKeySpec(w, EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring), cca_continue));
        } else if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            X509CertificateObject cca_continue2 = KeyFactory.init.cca_continue();
            BigInteger s = eCPrivateKey.getS();
            toJSONString tojsonstring2 = cca_continue2.cca_continue;
            byte[] bArr2 = cca_continue2.init;
            return new ECPrivateKeySpec(s, EC5Util.cca_continue(EC5Util.cca_continue(tojsonstring2), cca_continue2));
        } else if (cls.isAssignableFrom(PQCObjectIdentifiers.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new PQCObjectIdentifiers(EC5Util.init(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.getInstance(eCPublicKey2.getParams()));
            }
            return new PQCObjectIdentifiers(EC5Util.init(eCPublicKey2.getParams(), eCPublicKey2.getW()), KeyFactory.init.cca_continue());
        } else if (!cls.isAssignableFrom(X509SignatureUtil.class) || !(key instanceof ECPrivateKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new X509SignatureUtil(eCPrivateKey2.getS(), EC5Util.getInstance(eCPrivateKey2.getParams()));
            }
            return new X509SignatureUtil(eCPrivateKey2.getS(), KeyFactory.init.cca_continue());
        }
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(IES.onValidated)) {
            return new BCECGOST3410PrivateKey(privateKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(IES.getString)) {
            return new BCECGOST3410PrivateKey(privateKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(IES.CardinalChallengeObserver)) {
            return new BCECGOST3410PrivateKey(privateKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(IES.onValidated)) {
            return new BCECGOST3410PublicKey(subjectPublicKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(IES.getString)) {
            return new BCECGOST3410PublicKey(subjectPublicKeyInfo);
        }
        if (aSN1ObjectIdentifier.equals(IES.CardinalChallengeObserver)) {
            return new BCECGOST3410PublicKey(subjectPublicKeyInfo);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }
}
