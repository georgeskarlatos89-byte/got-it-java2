package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.PemObject;
import com.cardinalcommerce.a.PemReader;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.a.getHeadingTextFontName;
import com.cardinalcommerce.a.getProxyAddress;
import com.cardinalcommerce.a.isEnableLogging;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.a.setEnabledVisaCheckout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;

public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    static final byte[] Cardinal = getHeadingTextFontName.init("3043300506032b6571033a00");
    static final byte[] cca_continue = getHeadingTextFontName.init("3042300506032b656f033900");
    static final byte[] configure = getHeadingTextFontName.init("302a300506032b656e032100");
    static final byte[] getInstance = getHeadingTextFontName.init("302a300506032b6570032100");
    private final boolean getWarnings;
    private String init;
    private final int onCReqSuccess;

    public static class ED25519 extends KeyFactorySpi {
        public ED25519() {
            super("Ed25519", false, 112);
        }
    }

    public static class ED448 extends KeyFactorySpi {
        public ED448() {
            super("Ed448", false, 113);
        }
    }

    public static class EDDSA extends KeyFactorySpi {
        public EDDSA() {
            super("EdDSA", false, 0);
        }
    }

    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super("X25519", true, 110);
        }
    }

    public static class X448 extends KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z, int i) {
        this.init = str;
        this.getWarnings = z;
        this.onCReqSuccess = i;
    }

    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PemObject)) {
            return super.engineGeneratePrivate(keySpec);
        }
        setCCAImageUri Cardinal2 = PSSSignatureSpi.SHA3_256withRSA.Cardinal(((PemObject) keySpec).getEncoded());
        if (Cardinal2 instanceof KeyPairGeneratorSpi.X448) {
            return new BCEdDSAPrivateKey((setCCAImageUri) (KeyPairGeneratorSpi.X448) Cardinal2);
        }
        throw new IllegalStateException("openssh private key not Ed25519 private key");
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(PemObject.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new PemObject(PSSSignatureSpi.SHA3_256withRSA.init(new KeyPairGeneratorSpi.X448(((setEnabledVisaCheckout) new getProxyAddress(((setEnabledVisaCheckout) isEnableLogging.getInstance((Object) key.getEncoded()).init(2)).getInstance()).configure()).getInstance())));
            } catch (IOException e) {
                throw new InvalidKeySpecException(e.getMessage(), e.getCause());
            }
        } else if (!cls.isAssignableFrom(PemReader.class) || !(key instanceof BCEdDSAPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        } else {
            try {
                return new PemReader(KeyAgreementSpi.MQVwithSHA1KDF.getInstance((setCCAImageUri) new KeyPairGeneratorSpi.X25519(key.getEncoded(), getInstance.length)));
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.getMessage(), e2.getCause());
            }
        }
    }

    /* access modifiers changed from: protected */
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        throw new InvalidKeyException("key type unknown");
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        byte[] bArr;
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i = this.onCReqSuccess;
            if (i == 0 || i == encoded[8]) {
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(configure, encoded);
                    case 111:
                        return new BCXDHPublicKey(cca_continue, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(getInstance, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(Cardinal, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof PemReader) {
            setCCAImageUri configure2 = KeyAgreementSpi.MQVwithSHA1KDF.configure(((PemReader) keySpec).getEncoded());
            if (configure2 instanceof KeyPairGeneratorSpi.X25519) {
                byte[] bArr2 = new byte[0];
                byte[] bArr3 = ((KeyPairGeneratorSpi.X25519) configure2).getInstance;
                if (bArr3 == null) {
                    bArr = null;
                } else {
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    bArr = bArr4;
                }
                return new BCEdDSAPublicKey(bArr2, bArr);
            }
            throw new IllegalStateException("openssh public key not Ed25519 public key");
        }
        return super.engineGeneratePublic(keySpec);
    }

    public final PrivateKey cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = privateKeyInfo.cca_continue.cca_continue;
        if (this.getWarnings) {
            int i = this.onCReqSuccess;
            if ((i == 0 || i == 111) && aSN1ObjectIdentifier.equals(X509.Mappings.configure)) {
                return new BCXDHPrivateKey(privateKeyInfo);
            }
            int i2 = this.onCReqSuccess;
            if ((i2 == 0 || i2 == 110) && aSN1ObjectIdentifier.equals(X509.Mappings.Cardinal)) {
                return new BCXDHPrivateKey(privateKeyInfo);
            }
        } else if (aSN1ObjectIdentifier.equals(X509.Mappings.init) || aSN1ObjectIdentifier.equals(X509.Mappings.cca_continue)) {
            int i3 = this.onCReqSuccess;
            if ((i3 == 0 || i3 == 113) && aSN1ObjectIdentifier.equals(X509.Mappings.init)) {
                return new BCEdDSAPrivateKey(privateKeyInfo);
            }
            int i4 = this.onCReqSuccess;
            if ((i4 == 0 || i4 == 112) && aSN1ObjectIdentifier.equals(X509.Mappings.cca_continue)) {
                return new BCEdDSAPrivateKey(privateKeyInfo);
            }
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognized").toString());
    }

    public final PublicKey configure(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = subjectPublicKeyInfo.cca_continue.cca_continue;
        if (this.getWarnings) {
            int i = this.onCReqSuccess;
            if ((i == 0 || i == 111) && aSN1ObjectIdentifier.equals(X509.Mappings.configure)) {
                return new BCXDHPublicKey(subjectPublicKeyInfo);
            }
            int i2 = this.onCReqSuccess;
            if ((i2 == 0 || i2 == 110) && aSN1ObjectIdentifier.equals(X509.Mappings.Cardinal)) {
                return new BCXDHPublicKey(subjectPublicKeyInfo);
            }
        } else if (aSN1ObjectIdentifier.equals(X509.Mappings.init) || aSN1ObjectIdentifier.equals(X509.Mappings.cca_continue)) {
            int i3 = this.onCReqSuccess;
            if ((i3 == 0 || i3 == 113) && aSN1ObjectIdentifier.equals(X509.Mappings.init)) {
                return new BCEdDSAPublicKey(subjectPublicKeyInfo);
            }
            int i4 = this.onCReqSuccess;
            if ((i4 == 0 || i4 == 112) && aSN1ObjectIdentifier.equals(X509.Mappings.cca_continue)) {
                return new BCEdDSAPublicKey(subjectPublicKeyInfo);
            }
        }
        throw new IOException(new StringBuilder("algorithm identifier ").append(aSN1ObjectIdentifier).append(" in key not recognized").toString());
    }
}
