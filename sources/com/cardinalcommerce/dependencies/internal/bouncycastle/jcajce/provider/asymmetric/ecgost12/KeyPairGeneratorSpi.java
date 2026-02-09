package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.JSONNavi;
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
    private SignatureSpi.ecNR224 Cardinal = new SignatureSpi.ecNR224();
    private KeyPairGeneratorSpi.Ed25519 cca_continue;
    private String configure = "ECGOST3410-2012";
    private int getInstance = 239;
    private Object init = null;
    private boolean onCReqSuccess = false;
    private SecureRandom onValidated = null;

    public KeyPairGeneratorSpi() {
        super("ECGOST3410-2012");
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.getInstance = i;
        this.onValidated = secureRandom;
        Object obj = this.init;
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
        if (algorithmParameterSpec instanceof X931SignatureSpi.SHA224WithRSAEncryption) {
            cca_continue((X931SignatureSpi.SHA224WithRSAEncryption) algorithmParameterSpec, secureRandom);
        } else if (algorithmParameterSpec instanceof X509CertificateObject) {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) algorithmParameterSpec;
            this.init = algorithmParameterSpec;
            KeyPairGeneratorSpi.Ed25519 ed25519 = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(x509CertificateObject.cca_continue, x509CertificateObject.configure, x509CertificateObject.getInstance, x509CertificateObject.getWarnings), secureRandom);
            this.cca_continue = ed25519;
            this.Cardinal.getInstance(ed25519);
            this.onCReqSuccess = true;
        } else if (algorithmParameterSpec instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            this.init = algorithmParameterSpec;
            toJSONString instance = EC5Util.getInstance(eCParameterSpec.getCurve());
            KeyPairGeneratorSpi.Ed25519 ed255192 = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(instance, EC5Util.cca_continue(instance, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
            this.cca_continue = ed255192;
            this.Cardinal.getInstance(ed255192);
            this.onCReqSuccess = true;
        } else {
            boolean z = algorithmParameterSpec instanceof ECGenParameterSpec;
            if (z || (algorithmParameterSpec instanceof X509CRLEntryObject)) {
                cca_continue(new X931SignatureSpi.SHA224WithRSAEncryption(z ? ((ECGenParameterSpec) algorithmParameterSpec).getName() : ((X509CRLEntryObject) algorithmParameterSpec).cca_continue), secureRandom);
            } else if (algorithmParameterSpec == null && KeyFactory.init.cca_continue() != null) {
                X509CertificateObject cca_continue2 = KeyFactory.init.cca_continue();
                this.init = algorithmParameterSpec;
                KeyPairGeneratorSpi.Ed25519 ed255193 = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.EDDSA(cca_continue2.cca_continue, cca_continue2.configure, cca_continue2.getInstance, cca_continue2.getWarnings), secureRandom);
                this.cca_continue = ed255193;
                this.Cardinal.getInstance(ed255193);
                this.onCReqSuccess = true;
            } else if (algorithmParameterSpec == null && KeyFactory.init.cca_continue() == null) {
                throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
            } else {
                throw new InvalidAlgorithmParameterException(new StringBuilder("parameter object not a ECParameterSpec: ").append(algorithmParameterSpec.getClass().getName()).toString());
            }
        }
    }

    private void cca_continue(X931SignatureSpi.SHA224WithRSAEncryption sHA224WithRSAEncryption, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        byte[] bArr;
        KeyFactorySpi.EDDSA configure2 = IES.Mappings.configure(sHA224WithRSAEncryption.configure);
        if (configure2 != null) {
            String init2 = IES.Mappings.init(sHA224WithRSAEncryption.configure);
            toJSONString tojsonstring = configure2.cca_continue;
            JSONNavi jSONNavi = configure2.init;
            BigInteger bigInteger = configure2.getInstance;
            BigInteger bigInteger2 = configure2.Cardinal;
            byte[] bArr2 = configure2.configure;
            if (bArr2 == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            }
            this.init = new X509CRLObject(init2, tojsonstring, jSONNavi, bigInteger, bigInteger2, bArr);
            KeyPairGeneratorSpi.Ed25519 ed25519 = new KeyPairGeneratorSpi.Ed25519(new KeyFactorySpi.X448(new KeyFactorySpi.XDH(sHA224WithRSAEncryption.configure, configure2), sHA224WithRSAEncryption.configure, sHA224WithRSAEncryption.getInstance, sHA224WithRSAEncryption.Cardinal), secureRandom);
            this.cca_continue = ed25519;
            this.Cardinal.getInstance(ed25519);
            this.onCReqSuccess = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder("unknown curve: ").append(sHA224WithRSAEncryption.configure).toString());
    }

    public KeyPair generateKeyPair() {
        if (this.onCReqSuccess) {
            PSSSignatureSpi.SHA256withRSA init2 = this.Cardinal.init();
            KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) init2.getInstance;
            KeyPairGeneratorSpi.EdDSA edDSA = (KeyPairGeneratorSpi.EdDSA) init2.init;
            Object obj = this.init;
            if (obj instanceof X509CertificateObject) {
                X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = new BCECGOST3410_2012PublicKey(this.configure, xdh, x509CertificateObject);
                return new KeyPair(bCECGOST3410_2012PublicKey, new BCECGOST3410_2012PrivateKey(this.configure, edDSA, bCECGOST3410_2012PublicKey, x509CertificateObject));
            } else if (obj == null) {
                return new KeyPair(new BCECGOST3410_2012PublicKey(this.configure, xdh), new BCECGOST3410_2012PrivateKey(this.configure, edDSA));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey2 = new BCECGOST3410_2012PublicKey(this.configure, xdh, eCParameterSpec);
                return new KeyPair(bCECGOST3410_2012PublicKey2, new BCECGOST3410_2012PrivateKey(this.configure, edDSA, bCECGOST3410_2012PublicKey2, eCParameterSpec));
            }
        } else {
            throw new IllegalStateException("EC Key Pair Generator not initialised");
        }
    }
}
