package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.BaseAlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JStylerObj;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getSeverity;
import com.cardinalcommerce.a.getTextFontName;
import com.cardinalcommerce.a.setCornerRadius;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger configure = BigInteger.valueOf(1);
    private static final BigInteger init = BigInteger.valueOf(2);
    private byte[] CardinalError;
    private BigInteger CardinalRenderType;
    private final GMCipherSpi.SM2withSha384 cleanup;
    private BaseAlgorithmParameterGeneratorSpi getSDKVersion;
    private BigInteger getWarnings;
    private final KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo onCReqSuccess;
    private X931SignatureSpi.SHA256WithRSAEncryption onValidated;
    private BigInteger values;

    public KeyAgreementSpi() {
        this("Diffie-Hellman", (GMCipherSpi.SM2withSha512) null);
    }

    public KeyAgreementSpi(String str, GMCipherSpi.SM2withSha384 sM2withSha384, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
        this.onCReqSuccess = null;
        this.cleanup = sM2withSha384;
    }

    public KeyAgreementSpi(String str, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
        this.onCReqSuccess = null;
        this.cleanup = null;
    }

    public KeyAgreementSpi(String str, KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo dHwithSHA1KDFAndSharedInfo, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
        this.onCReqSuccess = dHwithSHA1KDFAndSharedInfo;
        this.cleanup = null;
    }

    private byte[] cca_continue(BigInteger bigInteger) {
        int bitLength = (this.values.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == bitLength + 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    private static KeyAgreementSpi.X25519UwithSHA256CKDF configure(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("private key not a DHPrivateKey");
        } else if (privateKey instanceof BCDHPrivateKey) {
            return ((BCDHPrivateKey) privateKey).configure();
        } else {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            DHParameterSpec params = dHPrivateKey.getParams();
            return new KeyAgreementSpi.X25519UwithSHA256CKDF(dHPrivateKey.getX(), new KeyAgreementSpi.X25519withSHA256CKDF(params.getP(), params.getG(), (BigInteger) null, params.getL()));
        }
    }

    public final byte[] Cardinal() {
        return this.CardinalError;
    }

    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        if (this.getWarnings != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        if (this.getWarnings != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(Cardinal(this.CardinalError), str) : super.engineGenerateSecret(str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.getWarnings != null) {
            return super.engineGenerateSecret();
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            this.values = dHPrivateKey.getParams().getP();
            this.CardinalRenderType = dHPrivateKey.getParams().getG();
            BigInteger x = dHPrivateKey.getX();
            this.getWarnings = x;
            this.CardinalError = cca_continue(x);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new KeyAgreementSpi.ECKAEGwithSHA384KDF(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new JStylerObj(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new JStylerObj(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyFactorySpi.ECMQV()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECDHC()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", (GMCipherSpi.SM2withSha384) new KeyAgreementSpi.DHwithSHA256KDFAndSharedInfo(), (GMCipherSpi.SM2withSha512) new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    /* access modifiers changed from: protected */
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.getWarnings == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        } else if (key instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            if (!dHPublicKey.getParams().getG().equals(this.CardinalRenderType) || !dHPublicKey.getParams().getP().equals(this.values)) {
                throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
            }
            BigInteger y = dHPublicKey.getY();
            if (y != null && y.compareTo(init) >= 0) {
                BigInteger bigInteger = this.values;
                BigInteger bigInteger2 = configure;
                if (y.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                    if (this.onCReqSuccess != null) {
                        if (z) {
                            KeyAgreementSpi.X448 x448 = new KeyAgreementSpi.X448(configure((PublicKey) key), configure(this.onValidated.configure));
                            KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo dHwithSHA1KDFAndSharedInfo = this.onCReqSuccess;
                            KeyAgreementSpi.X448 x4482 = x448;
                            KeyAgreementSpi.DHwithSHA224KDFAndSharedInfo dHwithSHA224KDFAndSharedInfo = new KeyAgreementSpi.DHwithSHA224KDFAndSharedInfo();
                            KeyAgreementSpi.DHwithSHA224KDFAndSharedInfo dHwithSHA224KDFAndSharedInfo2 = new KeyAgreementSpi.DHwithSHA224KDFAndSharedInfo();
                            dHwithSHA224KDFAndSharedInfo.cca_continue(dHwithSHA1KDFAndSharedInfo.Cardinal.init);
                            BigInteger instance = dHwithSHA224KDFAndSharedInfo.getInstance(x448.init);
                            dHwithSHA224KDFAndSharedInfo2.cca_continue(dHwithSHA1KDFAndSharedInfo.Cardinal.configure);
                            this.CardinalError = getBackgroundColor.configure(setCornerRadius.getInstance((dHwithSHA1KDFAndSharedInfo.Cardinal.init.Cardinal.Cardinal.bitLength() + 7) / 8, dHwithSHA224KDFAndSharedInfo2.getInstance(x448.configure)), setCornerRadius.getInstance((dHwithSHA1KDFAndSharedInfo.Cardinal.init.Cardinal.Cardinal.bitLength() + 7) / 8, instance));
                            return null;
                        }
                        throw new IllegalStateException("unified Diffie-Hellman can use only two key pairs");
                    } else if (this.cleanup == null) {
                        BigInteger modPow = y.modPow(this.getWarnings, this.values);
                        if (modPow.compareTo(bigInteger2) != 0) {
                            this.CardinalError = cca_continue(modPow);
                            if (z) {
                                return null;
                            }
                            return new BCDHPublicKey(modPow, dHPublicKey.getParams());
                        }
                        throw new InvalidKeyException("Shared key can't be 1");
                    } else if (z) {
                        this.CardinalError = cca_continue(this.cleanup.getInstance(new getTextFontName(configure((PublicKey) key), configure(this.getSDKVersion.getInstance))));
                        return null;
                    } else {
                        throw new IllegalStateException("MQV Diffie-Hellman can use only two key pairs");
                    }
                }
            }
            throw new InvalidKeyException("Invalid DH PublicKey");
        } else {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            if (algorithmParameterSpec != null) {
                byte[] bArr = null;
                if (algorithmParameterSpec instanceof DHParameterSpec) {
                    DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                    this.values = dHParameterSpec.getP();
                    this.CardinalRenderType = dHParameterSpec.getG();
                    this.onValidated = null;
                    this.getInstance = null;
                } else if (algorithmParameterSpec instanceof X931SignatureSpi.SHA256WithRSAEncryption) {
                    if (this.onCReqSuccess != null) {
                        this.values = dHPrivateKey.getParams().getP();
                        this.CardinalRenderType = dHPrivateKey.getParams().getG();
                        X931SignatureSpi.SHA256WithRSAEncryption sHA256WithRSAEncryption = (X931SignatureSpi.SHA256WithRSAEncryption) algorithmParameterSpec;
                        this.onValidated = sHA256WithRSAEncryption;
                        byte[] bArr2 = sHA256WithRSAEncryption.cca_continue;
                        if (bArr2 != null) {
                            bArr = new byte[bArr2.length];
                            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                        }
                        this.getInstance = bArr;
                        if (this.onValidated.Cardinal != null) {
                            KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo dHwithSHA1KDFAndSharedInfo = this.onCReqSuccess;
                            KeyAgreementSpi.X25519withSHA384CKDF x25519withSHA384CKDF = new KeyAgreementSpi.X25519withSHA384CKDF(configure((PrivateKey) dHPrivateKey), configure(this.onValidated.init), configure(this.onValidated.Cardinal));
                            KeyAgreementSpi.X25519withSHA384CKDF x25519withSHA384CKDF2 = x25519withSHA384CKDF;
                            dHwithSHA1KDFAndSharedInfo.Cardinal = x25519withSHA384CKDF;
                        } else {
                            KeyAgreementSpi.DHwithSHA1KDFAndSharedInfo dHwithSHA1KDFAndSharedInfo2 = this.onCReqSuccess;
                            KeyAgreementSpi.X25519withSHA384CKDF x25519withSHA384CKDF3 = new KeyAgreementSpi.X25519withSHA384CKDF(configure((PrivateKey) dHPrivateKey), configure(this.onValidated.init));
                            KeyAgreementSpi.X25519withSHA384CKDF x25519withSHA384CKDF4 = x25519withSHA384CKDF3;
                            dHwithSHA1KDFAndSharedInfo2.Cardinal = x25519withSHA384CKDF3;
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
                    }
                } else if (algorithmParameterSpec instanceof BaseAlgorithmParameterGeneratorSpi) {
                    if (this.cleanup != null) {
                        this.values = dHPrivateKey.getParams().getP();
                        this.CardinalRenderType = dHPrivateKey.getParams().getG();
                        BaseAlgorithmParameterGeneratorSpi baseAlgorithmParameterGeneratorSpi = (BaseAlgorithmParameterGeneratorSpi) algorithmParameterSpec;
                        this.getSDKVersion = baseAlgorithmParameterGeneratorSpi;
                        byte[] bArr3 = baseAlgorithmParameterGeneratorSpi.init;
                        if (bArr3 != null) {
                            bArr = new byte[bArr3.length];
                            System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                        }
                        this.getInstance = bArr;
                        if (this.getSDKVersion.Cardinal != null) {
                            this.cleanup.cca_continue(new getSeverity(configure((PrivateKey) dHPrivateKey), configure(this.getSDKVersion.cca_continue), configure(this.getSDKVersion.Cardinal)));
                        } else {
                            this.cleanup.cca_continue(new getSeverity(configure((PrivateKey) dHPrivateKey), configure(this.getSDKVersion.cca_continue)));
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("agreement algorithm not MQV based");
                    }
                } else if (!(algorithmParameterSpec instanceof com.cardinalcommerce.a.BaseAgreementSpi)) {
                    throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
                } else if (this.cca_continue != null) {
                    this.values = dHPrivateKey.getParams().getP();
                    this.CardinalRenderType = dHPrivateKey.getParams().getG();
                    this.onValidated = null;
                    byte[] bArr4 = ((com.cardinalcommerce.a.BaseAgreementSpi) algorithmParameterSpec).configure;
                    if (bArr4 != null) {
                        bArr = new byte[bArr4.length];
                        System.arraycopy(bArr4, 0, bArr, 0, bArr4.length);
                    }
                    this.getInstance = bArr;
                } else {
                    throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
                }
            } else {
                this.values = dHPrivateKey.getParams().getP();
                this.CardinalRenderType = dHPrivateKey.getParams().getG();
            }
            BigInteger x = dHPrivateKey.getX();
            this.getWarnings = x;
            this.CardinalError = cca_continue(x);
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
    }

    private static KeyAgreementSpi.X25519withSHA256KDF configure(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("public key not a DHPublicKey");
        } else if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).Cardinal;
        } else {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            DHParameterSpec params = dHPublicKey.getParams();
            return params instanceof X931SignatureSpi.SHA512WithRSAEncryption ? new KeyAgreementSpi.X25519withSHA256KDF(dHPublicKey.getY(), ((X931SignatureSpi.SHA512WithRSAEncryption) params).init()) : new KeyAgreementSpi.X25519withSHA256KDF(dHPublicKey.getY(), new KeyAgreementSpi.X25519withSHA256CKDF(params.getP(), params.getG(), (BigInteger) null, params.getL()));
        }
    }
}
