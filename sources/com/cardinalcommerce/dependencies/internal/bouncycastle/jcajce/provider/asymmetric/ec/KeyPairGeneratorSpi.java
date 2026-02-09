package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X509CRLEntryObject;
import com.cardinalcommerce.a.X509CRLObject;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;

public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", KeyFactory.init);
        }
    }

    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", KeyFactory.init);
        }
    }

    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", KeyFactory.init);
        }
    }

    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", KeyFactory.init);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }

    public static class EC extends KeyPairGeneratorSpi {
        private static Hashtable getWarnings;
        private KeyPairGeneratorSpi.Ed25519 Cardinal;
        private Object cca_continue;
        private boolean cleanup;
        private SecureRandom configure;
        private SignatureSpi.ecNR224 getInstance;
        private PSSSignatureSpi.SHA512_256withRSA getSDKVersion;
        private int init;
        private String onValidated;

        public EC() {
            super("EC");
            this.getInstance = new SignatureSpi.ecNR224();
            this.cca_continue = null;
            this.init = 239;
            this.configure = GMCipherSpi.SM2withWhirlpool.configure();
            this.cleanup = false;
            this.onValidated = "EC";
            this.getSDKVersion = KeyFactory.init;
        }

        public EC(String str, PSSSignatureSpi.SHA512_256withRSA sHA512_256withRSA) {
            super(str);
            this.getInstance = new SignatureSpi.ecNR224();
            this.cca_continue = null;
            this.init = 239;
            this.configure = GMCipherSpi.SM2withWhirlpool.configure();
            this.cleanup = false;
            this.onValidated = str;
            this.getSDKVersion = sHA512_256withRSA;
        }

        private static KeyPairGeneratorSpi.Ed25519 configure(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            toJSONString instance = EC5Util.getInstance(eCParameterSpec.getCurve());
            return new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(instance, EC5Util.cca_continue(instance, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
        }

        public void initialize(int i, SecureRandom secureRandom) {
            this.init = i;
            this.configure = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) getWarnings.get(Integer.valueOf(i));
            if (eCGenParameterSpec != null) {
                try {
                    initialize(eCGenParameterSpec, secureRandom);
                } catch (InvalidAlgorithmParameterException unused) {
                    throw new InvalidParameterException("key size not configurable.");
                }
            } else {
                throw new InvalidParameterException("unknown key size.");
            }
        }

        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null) {
                X509CertificateObject cca_continue2 = this.getSDKVersion.cca_continue();
                if (cca_continue2 != null) {
                    this.cca_continue = null;
                    this.Cardinal = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(cca_continue2.cca_continue, cca_continue2.configure, cca_continue2.getInstance, cca_continue2.getWarnings), secureRandom);
                } else {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
            } else if (algorithmParameterSpec instanceof X509CertificateObject) {
                this.cca_continue = algorithmParameterSpec;
                X509CertificateObject x509CertificateObject = (X509CertificateObject) algorithmParameterSpec;
                this.Cardinal = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(x509CertificateObject.cca_continue, x509CertificateObject.configure, x509CertificateObject.getInstance, x509CertificateObject.getWarnings), secureRandom);
            } else if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.cca_continue = algorithmParameterSpec;
                this.Cardinal = configure((ECParameterSpec) algorithmParameterSpec, secureRandom);
            } else if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                X509CRLObject cca_continue3 = cca_continue(((ECGenParameterSpec) algorithmParameterSpec).getName());
                this.cca_continue = cca_continue3;
                this.Cardinal = configure(cca_continue3, secureRandom);
            } else if (algorithmParameterSpec instanceof X509CRLEntryObject) {
                X509CRLObject cca_continue4 = cca_continue(((X509CRLEntryObject) algorithmParameterSpec).cca_continue);
                this.cca_continue = cca_continue4;
                this.Cardinal = configure(cca_continue4, secureRandom);
            } else {
                throw new InvalidAlgorithmParameterException("parameter object not a ECParameterSpec");
            }
            this.getInstance.getInstance(this.Cardinal);
            this.cleanup = true;
        }

        public KeyPair generateKeyPair() {
            if (!this.cleanup) {
                initialize(this.init, new SecureRandom());
            }
            PSSSignatureSpi.SHA256withRSA init2 = this.getInstance.init();
            KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) init2.getInstance;
            KeyPairGeneratorSpi.EdDSA edDSA = (KeyPairGeneratorSpi.EdDSA) init2.init;
            Object obj = this.cca_continue;
            if (obj instanceof X509CertificateObject) {
                X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.onValidated, xdh, x509CertificateObject, this.getSDKVersion);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.onValidated, edDSA, bCECPublicKey, x509CertificateObject, this.getSDKVersion));
            } else if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.onValidated, xdh, this.getSDKVersion), new BCECPrivateKey(this.onValidated, edDSA, this.getSDKVersion));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.onValidated, xdh, eCParameterSpec, this.getSDKVersion);
                return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.onValidated, edDSA, bCECPublicKey2, eCParameterSpec, this.getSDKVersion));
            }
        }

        private X509CRLObject cca_continue(String str) throws InvalidAlgorithmParameterException {
            GMCipherSpi configure2 = ECUtils.configure(str);
            if (configure2 == null) {
                try {
                    configure2 = SignatureSpi.Cardinal(new ASN1ObjectIdentifier(str));
                    if (configure2 == null) {
                        configure2 = (GMCipherSpi) this.getSDKVersion.getInstance().get(new ASN1ObjectIdentifier(str));
                        if (configure2 == null) {
                            throw new InvalidAlgorithmParameterException("unknown curve OID: ".concat(String.valueOf(str)));
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(String.valueOf(str)));
                }
            }
            return new X509CRLObject(str, configure2.init, configure2.getInstance.cca_continue(), configure2.cca_continue, configure2.configure, (byte[]) null);
        }

        static {
            Hashtable hashtable = new Hashtable();
            getWarnings = hashtable;
            hashtable.put(192, new ECGenParameterSpec("prime192v1"));
            getWarnings.put(239, new ECGenParameterSpec("prime239v1"));
            getWarnings.put(256, new ECGenParameterSpec("prime256v1"));
            getWarnings.put(224, new ECGenParameterSpec("P-224"));
            getWarnings.put(Integer.valueOf(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), new ECGenParameterSpec("P-384"));
            getWarnings.put(521, new ECGenParameterSpec("P-521"));
        }
    }
}
