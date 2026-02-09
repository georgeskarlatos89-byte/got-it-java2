package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.McElieceCCA2KeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.mceliece.McElieceKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.DSAParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;

public final class KeyFactory extends Provider implements PSSSignatureSpi.SHA512_224withRSA {
    private static final String[] Cardinal = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
    private static final String[] cca_continue = {"SipHash", "Poly1305"};
    private static final String[] cleanup = {"BC", "BCFKS", "PKCS12"};
    private static String configure = "BouncyCastle Security Provider v1.62";
    private static final Map getInstance = new HashMap();
    private static final String[] getSDKVersion = {"X509", "IES"};
    private static final String[] getWarnings = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564"};
    public static final PSSSignatureSpi.SHA512_256withRSA init = new PSSSignatureSpi.SHA512_256withRSA() {
        private ThreadLocal Cardinal = new ThreadLocal();
        private volatile Object cca_continue;
        private ThreadLocal configure = new ThreadLocal();
        private volatile X509CertificateObject getInstance;
        private volatile Map getSDKVersion = new HashMap();
        private volatile Set init = new HashSet();

        static {
            new RSAUtil("BC", "threadLocalEcImplicitlyCa");
            new RSAUtil("BC", "ecImplicitlyCa");
            new RSAUtil("BC", "threadLocalDhDefaultParams");
            new RSAUtil("BC", "DhDefaultParams");
            new RSAUtil("BC", "acceptableEcCurves");
            new RSAUtil("BC", "additionalEcParameters");
        }

        public final X509CertificateObject cca_continue() {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) this.Cardinal.get();
            return x509CertificateObject != null ? x509CertificateObject : this.getInstance;
        }

        public final DHParameterSpec configure(int i) {
            Object obj = this.configure.get();
            if (obj == null) {
                obj = this.cca_continue;
            }
            if (obj instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
                if (dHParameterSpec.getP().bitLength() == i) {
                    return dHParameterSpec;
                }
            } else if (obj instanceof DHParameterSpec[]) {
                DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
                for (int i2 = 0; i2 != dHParameterSpecArr.length; i2++) {
                    if (dHParameterSpecArr[i2].getP().bitLength() == i) {
                        return dHParameterSpecArr[i2];
                    }
                }
            }
            KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = (KeyAgreementSpi.X25519withSHA256CKDF) GMCipherSpi.SM2withWhirlpool.init(GMCipherSpi.SM2withWhirlpool.init.Cardinal, i);
            if (x25519withSHA256CKDF != null) {
                return new X931SignatureSpi.SHA512WithRSAEncryption(x25519withSHA256CKDF);
            }
            return null;
        }

        public final Map getInstance() {
            return Collections.unmodifiableMap(this.getSDKVersion);
        }

        public final Set init() {
            return Collections.unmodifiableSet(this.init);
        }

        public final DSAParameterSpec cca_continue(int i) {
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF = (KeyAgreementSpi.X448withSHA256CKDF) GMCipherSpi.SM2withWhirlpool.init(GMCipherSpi.SM2withWhirlpool.init.init, i);
            if (x448withSHA256CKDF != null) {
                return new DSAParameterSpec(x448withSHA256CKDF.configure, x448withSHA256CKDF.init, x448withSHA256CKDF.Cardinal);
            }
            return null;
        }
    };
    private static final String[] onCReqSuccess = {"AES", "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015"};
    private static final String[] onValidated = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
    private static final String[] valueOf = {"DRBG"};

    public KeyFactory() {
        super("BC", 1.62d, configure);
        AccessController.doPrivileged(new PrivilegedAction() {
            public final Object run() {
                KeyFactory.Cardinal(KeyFactory.this);
                return null;
            }
        });
    }

    private void cca_continue(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class init2 = ClassUtil.init(KeyFactory.class, new StringBuilder().append(str).append(strArr[i]).append("$Mappings").toString());
            if (init2 != null) {
                try {
                    ((AlgorithmProvider) init2.newInstance()).init(this);
                } catch (Exception e) {
                    throw new InternalError(new StringBuilder("cannot create instance of ").append(str).append(strArr[i]).append("$Mappings : ").append(e).toString());
                }
            }
        }
    }

    private static AsymmetricKeyInfoConverter configure(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        Map map = getInstance;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    public final boolean Cardinal(String str, String str2) {
        return containsKey(new StringBuilder().append(str).append(".").append(str2).toString()) || containsKey(new StringBuilder("Alg.Alias.").append(str).append(".").append(str2).toString());
    }

    public final void cca_continue(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        Map map = getInstance;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public final void cca_continue(String str, Map<String, String> map) {
        for (String next : map.keySet()) {
            String obj = new StringBuilder().append(str).append(" ").append(next).toString();
            if (!containsKey(obj)) {
                put(obj, map.get(next));
            } else {
                throw new IllegalStateException(new StringBuilder("duplicate provider attribute key (").append(obj).append(") found").toString());
            }
        }
    }

    public final void configure(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException(new StringBuilder("duplicate provider key (").append(str).append(") found").toString());
    }

    public final void init(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        configure(new StringBuilder().append(str).append(".").append(aSN1ObjectIdentifier).toString(), str2);
        configure(new StringBuilder().append(str).append(".OID.").append(aSN1ObjectIdentifier).toString(), str2);
    }

    public static PublicKey init(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter configure2 = configure(subjectPublicKeyInfo.cca_continue.cca_continue);
        if (configure2 == null) {
            return null;
        }
        return configure2.configure(subjectPublicKeyInfo);
    }

    public static PrivateKey Cardinal(PrivateKeyInfo privateKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter configure2 = configure(privateKeyInfo.cca_continue.cca_continue);
        if (configure2 == null) {
            return null;
        }
        return configure2.cca_continue(privateKeyInfo);
    }

    static /* synthetic */ void Cardinal(KeyFactory keyFactory) {
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.digest.", getWarnings);
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.symmetric.", Cardinal);
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.symmetric.", cca_continue);
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.symmetric.", onCReqSuccess);
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.", getSDKVersion);
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.", onValidated);
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.keystore.", cleanup);
        keyFactory.cca_continue("com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.drbg.", valueOf);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.configure;
        Sphincs256KeyFactorySpi sphincs256KeyFactorySpi = new Sphincs256KeyFactorySpi();
        Map map = getInstance;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, sphincs256KeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PQCObjectIdentifiers.onValidated;
        NHKeyFactorySpi nHKeyFactorySpi = new NHKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier2, nHKeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PQCObjectIdentifiers.getSDKVersion;
        XMSSKeyFactorySpi xMSSKeyFactorySpi = new XMSSKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier3, xMSSKeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PQCObjectIdentifiers.cleanup;
        XMSSMTKeyFactorySpi xMSSMTKeyFactorySpi = new XMSSMTKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier4, xMSSMTKeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PQCObjectIdentifiers.Cardinal;
        McElieceKeyFactorySpi mcElieceKeyFactorySpi = new McElieceKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier5, mcElieceKeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PQCObjectIdentifiers.getInstance;
        McElieceCCA2KeyFactorySpi mcElieceCCA2KeyFactorySpi = new McElieceCCA2KeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier6, mcElieceCCA2KeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PQCObjectIdentifiers.cca_continue;
        RainbowKeyFactorySpi rainbowKeyFactorySpi = new RainbowKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier7, rainbowKeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = PQCObjectIdentifiers.getWarnings;
        QTESLAKeyFactorySpi qTESLAKeyFactorySpi = new QTESLAKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier8, qTESLAKeyFactorySpi);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PQCObjectIdentifiers.onCReqSuccess;
        QTESLAKeyFactorySpi qTESLAKeyFactorySpi2 = new QTESLAKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier9, qTESLAKeyFactorySpi2);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = PQCObjectIdentifiers.CardinalError;
        QTESLAKeyFactorySpi qTESLAKeyFactorySpi3 = new QTESLAKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier10, qTESLAKeyFactorySpi3);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = PQCObjectIdentifiers.valueOf;
        QTESLAKeyFactorySpi qTESLAKeyFactorySpi4 = new QTESLAKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier11, qTESLAKeyFactorySpi4);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = PQCObjectIdentifiers.values;
        QTESLAKeyFactorySpi qTESLAKeyFactorySpi5 = new QTESLAKeyFactorySpi();
        synchronized (map) {
            map.put(aSN1ObjectIdentifier12, qTESLAKeyFactorySpi5);
        }
        keyFactory.put("X509Store.CERTIFICATE/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreCertCollection");
        keyFactory.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        keyFactory.put("X509Store.CRL/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreCRLCollection");
        keyFactory.put("X509Store.CERTIFICATEPAIR/COLLECTION", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreCertPairCollection");
        keyFactory.put("X509Store.CERTIFICATE/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPCerts");
        keyFactory.put("X509Store.CRL/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        keyFactory.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        keyFactory.put("X509Store.CERTIFICATEPAIR/LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        keyFactory.put("X509StreamParser.CERTIFICATE", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509CertParser");
        keyFactory.put("X509StreamParser.ATTRIBUTECERTIFICATE", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509AttrCertParser");
        keyFactory.put("X509StreamParser.CRL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509CRLParser");
        keyFactory.put("X509StreamParser.CERTIFICATEPAIR", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509CertPairParser");
        keyFactory.put("Cipher.BROKENPBEWITHMD5ANDDES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        keyFactory.put("Cipher.BROKENPBEWITHSHA1ANDDES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        keyFactory.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        keyFactory.put("CertPathValidator.RFC3281", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        keyFactory.put("CertPathBuilder.RFC3281", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        keyFactory.put("CertPathValidator.RFC3280", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        keyFactory.put("CertPathBuilder.RFC3280", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        keyFactory.put("CertPathValidator.PKIX", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
        keyFactory.put("CertPathBuilder.PKIX", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.PKIXCertPathBuilderSpi");
        keyFactory.put("CertStore.Collection", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.CertStoreCollectionSpi");
        keyFactory.put("CertStore.LDAP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        keyFactory.put("CertStore.Multi", "com.cardinalcommerce.dependencies.internal.bouncycastle.jce.provider.MultiCertStoreSpi");
        keyFactory.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
}
