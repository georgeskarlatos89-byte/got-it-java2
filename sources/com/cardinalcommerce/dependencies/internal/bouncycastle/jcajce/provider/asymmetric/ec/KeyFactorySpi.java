package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PQCObjectIdentifiers;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.PemObject;
import com.cardinalcommerce.a.PemReader;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.X509SignatureUtil;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private PSSSignatureSpi.SHA512_256withRSA Cardinal;
    private String init;

    public static class EC extends KeyFactorySpi {
        public EC() {
            super("EC", KeyFactory.init);
        }
    }

    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", KeyFactory.init);
        }
    }

    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", KeyFactory.init);
        }
    }

    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", KeyFactory.init);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", KeyFactory.init);
        }
    }

    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", KeyFactory.init);
        }
    }

    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", KeyFactory.init);
        }
    }

    KeyFactorySpi(String str, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
        this.init = str;
        this.Cardinal = sHA512_256withRSA;
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.Cardinal);
        }
        if (key instanceof ECPrivateKey) {
            return new BCECPrivateKey((ECPrivateKey) key, this.Cardinal);
        }
        throw new InvalidKeyException("key type unknown");
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        X509CertificateObject x509CertificateObject;
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
        } else if (cls.isAssignableFrom(X509SignatureUtil.class) && (key instanceof ECPrivateKey)) {
            ECPrivateKey eCPrivateKey2 = (ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new X509SignatureUtil(eCPrivateKey2.getS(), EC5Util.getInstance(eCPrivateKey2.getParams()));
            }
            return new X509SignatureUtil(eCPrivateKey2.getS(), KeyFactory.init.cca_continue());
        } else if (!cls.isAssignableFrom(PemReader.class) || !(key instanceof ECPublicKey)) {
            if (!cls.isAssignableFrom(PemObject.class) || !(key instanceof ECPrivateKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            if (key instanceof BCECPrivateKey) {
                try {
                    return new PemObject(getThreeDSRequestorAppURL.Cardinal(PrivateKeyInfo.cca_continue(key.getEncoded()).Cardinal.getInstance()).onCReqSuccess().getEncoded());
                } catch (IOException e) {
                    throw new IllegalArgumentException(new StringBuilder("cannot encoded key: ").append(e.getMessage()).toString());
                }
            } else {
                throw new IllegalArgumentException(new StringBuilder("invalid key type: ").append(key.getClass().getName()).toString());
            }
        } else if (key instanceof BCECPublicKey) {
            BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
            if (bCECPublicKey.Cardinal == null) {
                x509CertificateObject = null;
            } else {
                ECParameterSpec eCParameterSpec = bCECPublicKey.Cardinal;
                boolean z = bCECPublicKey.getInstance;
                x509CertificateObject = EC5Util.getInstance(eCParameterSpec);
            }
            try {
                JSONNavi jSONNavi = bCECPublicKey.cca_continue.configure;
                if (bCECPublicKey.Cardinal == null) {
                    jSONNavi = jSONNavi.cca_continue();
                }
                return new PemReader(KeyAgreementSpi.MQVwithSHA1KDF.getInstance((setCCAImageUri) new KeyPairGeneratorSpi.XDH(jSONNavi, new KeyFactorySpi.EDDSA(x509CertificateObject.cca_continue, x509CertificateObject.configure, x509CertificateObject.getInstance, x509CertificateObject.getWarnings, x509CertificateObject.init))));
            } catch (IOException e2) {
                throw new IllegalArgumentException(new StringBuilder("unable to produce encoding: ").append(e2.getMessage()).toString());
            }
        } else {
            throw new IllegalArgumentException(new StringBuilder("invalid key type: ").append(key.getClass().getName()).toString());
        }
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509SignatureUtil) {
            return new BCECPrivateKey(this.init, (X509SignatureUtil) keySpec, this.Cardinal);
        }
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.init, (ECPrivateKeySpec) keySpec, this.Cardinal);
        }
        if (!(keySpec instanceof PemObject)) {
            return super.engineGeneratePrivate(keySpec);
        }
        byte[] encoded = ((PemObject) keySpec).getEncoded();
        KeyAgreementSpi.DHwithSHA1CKDF dHwithSHA1CKDF = encoded != null ? new KeyAgreementSpi.DHwithSHA1CKDF(isEnableLogging.getInstance((Object) encoded)) : null;
        try {
            return new BCECPrivateKey(this.init, new PrivateKeyInfo(new BCDSAPrivateKey(GMCipherSpi.SM2withMD5.CardinalError, dHwithSHA1CKDF.Cardinal()), dHwithSHA1CKDF), this.Cardinal);
        } catch (IOException e) {
            throw new InvalidKeySpecException(new StringBuilder("bad encoding: ").append(e.getMessage()).toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        byte[] bArr;
        try {
            if (keySpec instanceof PQCObjectIdentifiers) {
                return new BCECPublicKey(this.init, (PQCObjectIdentifiers) keySpec, this.Cardinal);
            }
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.init, (ECPublicKeySpec) keySpec, this.Cardinal);
            }
            if (!(keySpec instanceof PemReader)) {
                return super.engineGeneratePublic(keySpec);
            }
            setCCAImageUri configure = KeyAgreementSpi.MQVwithSHA1KDF.configure(((PemReader) keySpec).getEncoded());
            if (configure instanceof KeyPairGeneratorSpi.XDH) {
                KeyFactorySpi.EDDSA eddsa = ((KeyPairGeneratorSpi.XDH) configure).Cardinal;
                JSONNavi jSONNavi = ((KeyPairGeneratorSpi.XDH) configure).configure;
                toJSONString tojsonstring = eddsa.cca_continue;
                JSONNavi jSONNavi2 = eddsa.init;
                BigInteger bigInteger = eddsa.getInstance;
                BigInteger bigInteger2 = eddsa.Cardinal;
                byte[] bArr2 = eddsa.configure;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    byte[] bArr3 = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                    bArr = bArr3;
                }
                return engineGeneratePublic(new PQCObjectIdentifiers(jSONNavi, new X509CertificateObject(tojsonstring, jSONNavi2, bigInteger, bigInteger2, bArr)));
            }
            throw new IllegalArgumentException("openssh key is not ec public key");
        } catch (Exception e) {
            throw new InvalidKeySpecException(new StringBuilder("invalid KeySpec: ").append(e.getMessage()).toString(), e);
        }
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(GMCipherSpi.SM2withMD5.CardinalError)) {
            return new BCECPrivateKey(this.init, privateKeyInfo, this.Cardinal);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        if (aSN1ObjectIdentifier.equals(GMCipherSpi.SM2withMD5.CardinalError)) {
            return new BCECPublicKey(this.init, subjectPublicKeyInfo, this.Cardinal);
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognised").toString());
    }
}
