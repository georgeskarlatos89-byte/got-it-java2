package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.cardinalcommerce.a.JSONNavi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X509CRLEntryObject;
import com.cardinalcommerce.a.X509CRLObject;
import com.cardinalcommerce.a.X509CertificateObject;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private KeyPairGeneratorSpi.Ed25519 Cardinal;
    private Object cca_continue = null;
    private SignatureSpi.ecNR224 configure = new SignatureSpi.ecNR256();
    private SecureRandom getInstance = null;
    private boolean getSDKVersion = false;
    private String init = "DSTU4145";

    public KeyPairGeneratorSpi() {
        super("DSTU4145");
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.getInstance = secureRandom;
        Object obj = this.cca_continue;
        if (obj != null) {
            try {
                initialize((ECGenParameterSpec) obj, secureRandom);
            } catch (InvalidAlgorithmParameterException unused) {
                throw new InvalidParameterException("key size not configurable.");
            }
        } else {
            throw new InvalidParameterException("unknown key size.");
        }
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof X509CertificateObject) {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) algorithmParameterSpec;
            this.cca_continue = algorithmParameterSpec;
            KeyPairGeneratorSpi.Ed25519 ed25519 = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(x509CertificateObject.cca_continue, x509CertificateObject.configure, x509CertificateObject.getInstance, x509CertificateObject.getWarnings), secureRandom);
            this.Cardinal = ed25519;
            this.configure.getInstance(ed25519);
            this.getSDKVersion = true;
            return;
        }
        byte[] bArr = null;
        if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.cca_continue = algorithmParameterSpec;
            toJSONString instance = EC5Util.getInstance(eCParameterSpec.getCurve());
            JSONNavi cca_continue2 = EC5Util.cca_continue(instance, eCParameterSpec.getGenerator());
            if (eCParameterSpec instanceof X931SignatureSpi.SHA384WithRSAEncryption) {
                KeyFactorySpi.EDDSA eddsa = new KeyFactorySpi.EDDSA(instance, cca_continue2, eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()));
                byte[] bArr2 = ((X931SignatureSpi.SHA384WithRSAEncryption) eCParameterSpec).Cardinal;
                if (bArr2 != null) {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                this.Cardinal = new KeyPairGeneratorSpi.Ed25519(new KeyAgreementSpi.XDH(eddsa, bArr), secureRandom);
            } else {
                this.Cardinal = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(instance, cca_continue2, eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
            }
            this.configure.getInstance(this.Cardinal);
            this.getSDKVersion = true;
            return;
        }
        boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
        if (z || (algorithmParameterSpec instanceof X509CRLEntryObject)) {
            String name = z ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((X509CRLEntryObject) algorithmParameterSpec).cca_continue;
            KeyFactorySpi.EDDSA instance2 = KeyAgreementSpi.DHwithSHA384CKDF.getInstance(new ASN1ObjectIdentifier(name));
            if (instance2 != null) {
                toJSONString tojsonstring = instance2.cca_continue;
                JSONNavi jSONNavi = instance2.init;
                BigInteger bigInteger = instance2.getInstance;
                BigInteger bigInteger2 = instance2.Cardinal;
                byte[] bArr3 = instance2.configure;
                if (bArr3 != null) {
                    bArr = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                }
                X509CRLObject x509CRLObject = new X509CRLObject(name, tojsonstring, jSONNavi, bigInteger, bigInteger2, bArr);
                this.cca_continue = x509CRLObject;
                ECParameterSpec eCParameterSpec2 = x509CRLObject;
                toJSONString instance3 = EC5Util.getInstance(eCParameterSpec2.getCurve());
                KeyPairGeneratorSpi.Ed25519 ed255192 = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(instance3, EC5Util.cca_continue(instance3, eCParameterSpec2.getGenerator()), eCParameterSpec2.getOrder(), BigInteger.valueOf((long) eCParameterSpec2.getCofactor())), secureRandom);
                this.Cardinal = ed255192;
                this.configure.getInstance(ed255192);
                this.getSDKVersion = true;
                return;
            }
            throw new InvalidAlgorithmParameterException("unknown curve name: ".concat(String.valueOf(name)));
        } else if (algorithmParameterSpec == null && KeyFactory.init.cca_continue() != null) {
            X509CertificateObject cca_continue3 = KeyFactory.init.cca_continue();
            this.cca_continue = algorithmParameterSpec;
            KeyPairGeneratorSpi.Ed25519 ed255193 = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(cca_continue3.cca_continue, cca_continue3.configure, cca_continue3.getInstance, cca_continue3.getWarnings), secureRandom);
            this.Cardinal = ed255193;
            this.configure.getInstance(ed255193);
            this.getSDKVersion = true;
        } else if (algorithmParameterSpec == null && KeyFactory.init.cca_continue() == null) {
            throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
        } else {
            throw new InvalidAlgorithmParameterException(new StringBuilder("parameter object not a ECParameterSpec: ").append(algorithmParameterSpec.getClass().getName()).toString());
        }
    }

    public KeyPair generateKeyPair() {
        if (this.getSDKVersion) {
            PSSSignatureSpi.SHA256withRSA init2 = this.configure.init();
            KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) init2.getInstance;
            KeyPairGeneratorSpi.EdDSA edDSA = (KeyPairGeneratorSpi.EdDSA) init2.init;
            Object obj = this.cca_continue;
            if (obj instanceof X509CertificateObject) {
                X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey = new BCDSTU4145PublicKey(this.init, xdh, x509CertificateObject);
                return new KeyPair(bCDSTU4145PublicKey, new BCDSTU4145PrivateKey(this.init, edDSA, bCDSTU4145PublicKey, x509CertificateObject));
            } else if (obj == null) {
                return new KeyPair(new BCDSTU4145PublicKey(this.init, xdh), new BCDSTU4145PrivateKey(this.init, edDSA));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCDSTU4145PublicKey bCDSTU4145PublicKey2 = new BCDSTU4145PublicKey(this.init, xdh, eCParameterSpec);
                return new KeyPair(bCDSTU4145PublicKey2, new BCDSTU4145PrivateKey(this.init, edDSA, bCDSTU4145PublicKey2, eCParameterSpec));
            }
        } else {
            throw new IllegalStateException("DSTU Key Pair Generator not initialised");
        }
    }
}
