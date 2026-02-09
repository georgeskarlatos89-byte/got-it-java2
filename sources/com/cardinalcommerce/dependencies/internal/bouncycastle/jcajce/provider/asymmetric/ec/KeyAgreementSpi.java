package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.BCRSAPublicKey;
import com.cardinalcommerce.a.BaseAlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.a.ExtCRLException;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JStylerObj;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.setCornerRadius;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private X931SignatureSpi.SHA256WithRSAEncryption cleanup;
    private KeyFactorySpi.EDDSA configure;
    private Object getSDKVersion;
    private String init;
    private byte[] onCReqSuccess;
    private BaseAlgorithmParameterGeneratorSpi onValidated;

    public static class DH extends KeyAgreementSpi {
        public DH() {
            super("ECDH", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) null);
        }
    }

    public static class DHC extends KeyAgreementSpi {
        public DHC() {
            super("ECDHC", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) null);
        }
    }

    public static class DHUC extends KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) null);
        }
    }

    public static class ECKAEGwithRIPEMD160KDF extends KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECGOST3410_2012()));
        }
    }

    public static class MQV extends KeyAgreementSpi {
        public MQV() {
            super("ECMQV", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) null);
        }
    }

    static {
        new GMCipherSpi.ErasableOutputStream();
    }

    protected KeyAgreementSpi(String str, GMCipherSpi.SM2withSha384 sM2withSha384, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
        this.init = str;
        this.getSDKVersion = sM2withSha384;
    }

    protected KeyAgreementSpi(String str, KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo dHwithSHA512KDFAndSharedInfo, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
        this.init = str;
        this.getSDKVersion = dHwithSHA512KDFAndSharedInfo;
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            init(key, (AlgorithmParameterSpec) null);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof BaseAlgorithmParameterGeneratorSpi) || (algorithmParameterSpec instanceof com.cardinalcommerce.a.BaseAgreementSpi) || (algorithmParameterSpec instanceof X931SignatureSpi.SHA256WithRSAEncryption)) {
            init(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }

    public static class CDHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.ECKAEGwithSHA1KDF(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class ECKAEGwithSHA1KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class ECKAEGwithSHA224KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class ECKAEGwithSHA256KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class ECKAEGwithSHA384KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class ECKAEGwithSHA512KDF extends KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHUC(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    /* access modifiers changed from: protected */
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        GMCipherSpi.SM2withRMD sM2withRMD;
        if (this.configure == null) {
            throw new IllegalStateException(new StringBuilder().append(this.init).append(" not initialised.").toString());
        } else if (z) {
            Object obj = this.getSDKVersion;
            if (obj instanceof KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo) {
                if (!(key instanceof ExtCRLException)) {
                    sM2withRMD = new BCRSAPublicKey((KeyPairGeneratorSpi.XDH) ECUtils.cca_continue((PublicKey) key), (KeyPairGeneratorSpi.XDH) ECUtils.cca_continue(this.onValidated.getInstance));
                } else {
                    ExtCRLException extCRLException = (ExtCRLException) key;
                    sM2withRMD = new BCRSAPublicKey((KeyPairGeneratorSpi.XDH) ECUtils.cca_continue(extCRLException.init()), (KeyPairGeneratorSpi.XDH) ECUtils.cca_continue(extCRLException.configure()));
                }
            } else if (obj instanceof KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo) {
                sM2withRMD = new KeyFactorySpi.ED448((KeyPairGeneratorSpi.XDH) ECUtils.cca_continue((PublicKey) key), (KeyPairGeneratorSpi.XDH) ECUtils.cca_continue(this.cleanup.configure));
            } else if (key instanceof PublicKey) {
                sM2withRMD = ECUtils.cca_continue((PublicKey) key);
            } else {
                StringBuilder append = new StringBuilder().append(this.init).append(" key agreement requires ");
                String name = ExtendedInvalidKeySpecException.class.getName();
                throw new InvalidKeyException(append.append(name.substring(name.lastIndexOf(46) + 1)).append(" for doPhase").toString());
            }
            try {
                Object obj2 = this.getSDKVersion;
                if (obj2 instanceof GMCipherSpi.SM2withSha384) {
                    this.onCReqSuccess = GMCipherSpi.ErasableOutputStream.cca_continue(((GMCipherSpi.SM2withSha384) obj2).getInstance(sM2withRMD), (this.configure.cca_continue.getInstance() + 7) / 8);
                    return null;
                }
                KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo dHwithSHA512KDFAndSharedInfo = (KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo) obj2;
                KeyFactorySpi.ED448 ed448 = (KeyFactorySpi.ED448) sM2withRMD;
                KeyAgreementSpi.ECKAEGwithSHA1KDF eCKAEGwithSHA1KDF = new KeyAgreementSpi.ECKAEGwithSHA1KDF();
                KeyAgreementSpi.ECKAEGwithSHA1KDF eCKAEGwithSHA1KDF2 = new KeyAgreementSpi.ECKAEGwithSHA1KDF();
                KeyPairGeneratorSpi.EdDSA edDSA = dHwithSHA512KDFAndSharedInfo.cca_continue.configure;
                KeyPairGeneratorSpi.EdDSA edDSA2 = edDSA;
                eCKAEGwithSHA1KDF.Cardinal = edDSA;
                BigInteger instance = eCKAEGwithSHA1KDF.getInstance(ed448.init);
                KeyPairGeneratorSpi.EdDSA edDSA3 = dHwithSHA512KDFAndSharedInfo.cca_continue.Cardinal;
                KeyPairGeneratorSpi.EdDSA edDSA4 = edDSA3;
                eCKAEGwithSHA1KDF2.Cardinal = edDSA3;
                this.onCReqSuccess = getBackgroundColor.configure(setCornerRadius.getInstance((dHwithSHA512KDFAndSharedInfo.cca_continue.configure.Cardinal.cca_continue.getInstance() + 7) / 8, eCKAEGwithSHA1KDF2.getInstance(ed448.Cardinal)), setCornerRadius.getInstance((dHwithSHA512KDFAndSharedInfo.cca_continue.configure.Cardinal.cca_continue.getInstance() + 7) / 8, instance));
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException(new StringBuilder("calculation failed: ").append(e.getMessage()).toString()) {
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else {
            throw new IllegalStateException(new StringBuilder().append(this.init).append(" can only be between two parties.").toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init(java.security.Key r8, java.security.spec.AlgorithmParameterSpec r9) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.getSDKVersion
            boolean r1 = r0 instanceof com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo
            java.lang.String r2 = " for initialisation"
            java.lang.String r3 = " key agreement requires "
            r4 = 46
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x00b9
            r7.onValidated = r6
            boolean r0 = r8 instanceof com.cardinalcommerce.a.CertificateFactory.ExCertificateException
            if (r0 != 0) goto L_0x004a
            boolean r1 = r9 instanceof com.cardinalcommerce.a.BaseAlgorithmParameterGeneratorSpi
            if (r1 == 0) goto L_0x0019
            goto L_0x004a
        L_0x0019:
            java.security.InvalidAlgorithmParameterException r8 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r7.init
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.Class<com.cardinalcommerce.a.BaseAlgorithmParameterGeneratorSpi> r0 = com.cardinalcommerce.a.BaseAlgorithmParameterGeneratorSpi.class
            java.lang.String r0 = r0.getName()
            int r1 = r0.lastIndexOf(r4)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x004a:
            if (r0 == 0) goto L_0x0074
            com.cardinalcommerce.a.CertificateFactory$ExCertificateException r8 = (com.cardinalcommerce.a.CertificateFactory.ExCertificateException) r8
            java.security.PrivateKey r9 = r8.init()
            com.cardinalcommerce.a.setCCAImageUri r9 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r9)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r9 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r9
            java.security.PrivateKey r0 = r8.Cardinal()
            com.cardinalcommerce.a.setCCAImageUri r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r0)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r0 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r0
            java.security.PublicKey r1 = r8.cca_continue()
            if (r1 == 0) goto L_0x00a6
            java.security.PublicKey r8 = r8.cca_continue()
            com.cardinalcommerce.a.setCCAImageUri r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.cca_continue((java.security.PublicKey) r8)
            r6 = r8
            com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH r6 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.XDH) r6
            goto L_0x00a6
        L_0x0074:
            com.cardinalcommerce.a.BaseAlgorithmParameterGeneratorSpi r9 = (com.cardinalcommerce.a.BaseAlgorithmParameterGeneratorSpi) r9
            java.security.PrivateKey r8 = (java.security.PrivateKey) r8
            com.cardinalcommerce.a.setCCAImageUri r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r8)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r8 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r8
            java.security.PrivateKey r0 = r9.cca_continue
            com.cardinalcommerce.a.setCCAImageUri r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r0)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r0 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r0
            java.security.PublicKey r1 = r9.Cardinal
            if (r1 == 0) goto L_0x0093
            java.security.PublicKey r1 = r9.Cardinal
            com.cardinalcommerce.a.setCCAImageUri r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.cca_continue((java.security.PublicKey) r1)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH r1 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.XDH) r1
            goto L_0x0094
        L_0x0093:
            r1 = r6
        L_0x0094:
            r7.onValidated = r9
            byte[] r9 = r9.init
            if (r9 != 0) goto L_0x009b
            goto L_0x00a2
        L_0x009b:
            int r2 = r9.length
            byte[] r6 = new byte[r2]
            int r2 = r9.length
            java.lang.System.arraycopy(r9, r5, r6, r5, r2)
        L_0x00a2:
            r7.getInstance = r6
            r9 = r8
            r6 = r1
        L_0x00a6:
            com.cardinalcommerce.a.CipherSpi$PKCS1v1_5Padding_PrivateOnly r8 = new com.cardinalcommerce.a.CipherSpi$PKCS1v1_5Padding_PrivateOnly
            r8.<init>(r9, r0, r6)
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r9 = r9.Cardinal
            r7.configure = r9
            java.lang.Object r9 = r7.getSDKVersion
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA384KDFAndSharedInfo r9 = (com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA384KDFAndSharedInfo) r9
            r0 = r8
            com.cardinalcommerce.a.CipherSpi$PKCS1v1_5Padding_PrivateOnly r0 = (com.cardinalcommerce.a.CipherSpi.PKCS1v1_5Padding_PrivateOnly) r0
            r9.Cardinal = r8
            return
        L_0x00b9:
            boolean r1 = r9 instanceof com.cardinalcommerce.a.X931SignatureSpi.SHA256WithRSAEncryption
            if (r1 == 0) goto L_0x0133
            boolean r0 = r0 instanceof com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo
            if (r0 == 0) goto L_0x0104
            com.cardinalcommerce.a.X931SignatureSpi$SHA256WithRSAEncryption r9 = (com.cardinalcommerce.a.X931SignatureSpi.SHA256WithRSAEncryption) r9
            java.security.PrivateKey r8 = (java.security.PrivateKey) r8
            com.cardinalcommerce.a.setCCAImageUri r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r8)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r8 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r8
            java.security.PrivateKey r0 = r9.init
            com.cardinalcommerce.a.setCCAImageUri r0 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r0)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r0 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r0
            java.security.PublicKey r1 = r9.Cardinal
            if (r1 == 0) goto L_0x00e0
            java.security.PublicKey r1 = r9.Cardinal
            com.cardinalcommerce.a.setCCAImageUri r1 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.cca_continue((java.security.PublicKey) r1)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH r1 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.XDH) r1
            goto L_0x00e1
        L_0x00e0:
            r1 = r6
        L_0x00e1:
            r7.cleanup = r9
            byte[] r9 = r9.cca_continue
            if (r9 != 0) goto L_0x00e8
            goto L_0x00ef
        L_0x00e8:
            int r2 = r9.length
            byte[] r6 = new byte[r2]
            int r2 = r9.length
            java.lang.System.arraycopy(r9, r5, r6, r5, r2)
        L_0x00ef:
            r7.getInstance = r6
            com.cardinalcommerce.a.KeyFactorySpi$X25519 r9 = new com.cardinalcommerce.a.KeyFactorySpi$X25519
            r9.<init>(r8, r0, r1)
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r8 = r8.Cardinal
            r7.configure = r8
            java.lang.Object r8 = r7.getSDKVersion
            com.cardinalcommerce.a.KeyAgreementSpi$DHwithSHA512KDFAndSharedInfo r8 = (com.cardinalcommerce.a.KeyAgreementSpi.DHwithSHA512KDFAndSharedInfo) r8
            r0 = r9
            com.cardinalcommerce.a.KeyFactorySpi$X25519 r0 = (com.cardinalcommerce.a.KeyFactorySpi.X25519) r0
            r8.cca_continue = r9
            return
        L_0x0104:
            java.security.InvalidAlgorithmParameterException r8 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r7.init
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r0 = " key agreement cannot be used with "
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.Class<com.cardinalcommerce.a.X931SignatureSpi$SHA256WithRSAEncryption> r0 = com.cardinalcommerce.a.X931SignatureSpi.SHA256WithRSAEncryption.class
            java.lang.String r0 = r0.getName()
            int r1 = r0.lastIndexOf(r4)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0133:
            boolean r0 = r8 instanceof java.security.PrivateKey
            if (r0 == 0) goto L_0x016f
            com.cardinalcommerce.a.GMCipherSpi$SM2withSha512 r0 = r7.cca_continue
            if (r0 != 0) goto L_0x0148
            boolean r0 = r9 instanceof com.cardinalcommerce.a.BaseAgreementSpi
            if (r0 != 0) goto L_0x0140
            goto L_0x0148
        L_0x0140:
            java.security.InvalidAlgorithmParameterException r8 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r9 = "no KDF specified for UserKeyingMaterialSpec"
            r8.<init>(r9)
            throw r8
        L_0x0148:
            java.security.PrivateKey r8 = (java.security.PrivateKey) r8
            com.cardinalcommerce.a.setCCAImageUri r8 = com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.Cardinal((java.security.PrivateKey) r8)
            com.cardinalcommerce.a.KeyPairGeneratorSpi$EdDSA r8 = (com.cardinalcommerce.a.KeyPairGeneratorSpi.EdDSA) r8
            com.cardinalcommerce.a.KeyFactorySpi$EDDSA r0 = r8.Cardinal
            r7.configure = r0
            boolean r0 = r9 instanceof com.cardinalcommerce.a.BaseAgreementSpi
            if (r0 == 0) goto L_0x0165
            com.cardinalcommerce.a.BaseAgreementSpi r9 = (com.cardinalcommerce.a.BaseAgreementSpi) r9
            byte[] r9 = r9.configure
            if (r9 == 0) goto L_0x0165
            int r0 = r9.length
            byte[] r6 = new byte[r0]
            int r0 = r9.length
            java.lang.System.arraycopy(r9, r5, r6, r5, r0)
        L_0x0165:
            r7.getInstance = r6
            java.lang.Object r9 = r7.getSDKVersion
            com.cardinalcommerce.a.GMCipherSpi$SM2withSha384 r9 = (com.cardinalcommerce.a.GMCipherSpi.SM2withSha384) r9
            r9.cca_continue(r8)
            return
        L_0x016f:
            java.security.InvalidKeyException r8 = new java.security.InvalidKeyException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r7.init
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.Class<com.cardinalcommerce.a.GOST3410Util> r0 = com.cardinalcommerce.a.GOST3410Util.class
            java.lang.String r0 = r0.getName()
            int r1 = r0.lastIndexOf(r4)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.init(java.security.Key, java.security.spec.AlgorithmParameterSpec):void");
    }

    public final byte[] Cardinal() {
        byte[] bArr = this.onCReqSuccess;
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
