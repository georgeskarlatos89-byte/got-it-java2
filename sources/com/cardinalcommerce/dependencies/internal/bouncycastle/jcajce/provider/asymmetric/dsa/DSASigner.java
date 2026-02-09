package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.ISOSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.setCCAImageUri;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class DSASigner extends SignatureSpi implements DSASigner.noneDSA, KeyAgreementSpi.DHUwithSHA224CKDF {
    private GMSignatureSpi.sha256WithSM2 getEciFlag;
    private IESCipher.ECIESwithAESCBC getEnrolled;
    private DigestSignatureSpi.noneRSA isEnabledPaypal = PSSSignatureSpi.SHA384withRSA.getInstance;
    private SecureRandom setEnabledDiscover;

    public static class noneDSA extends DSASigner {
        public noneDSA() {
            super(new KeyFactorySpi.ECDHC(), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    protected DSASigner(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, GMSignatureSpi.sha256WithSM2 sha256withsm2) {
        this.getEnrolled = eCIESwithAESCBC;
        this.getEciFlag = sha256withsm2;
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        GMCipherSpi.SM2withRMD init = DSAUtil.init(privateKey);
        if (this.setEnabledDiscover != null) {
            init = new DigestSignatureSpi.RIPEMD128(init, this.setEnabledDiscover);
        }
        this.getEnrolled.init();
        this.getEciFlag.cca_continue(true, init);
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.setEnabledDiscover = secureRandom;
        engineInitSign(privateKey);
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        setCCAImageUri instance = DSAUtil.getInstance(publicKey);
        this.getEnrolled.init();
        this.getEciFlag.cca_continue(false, instance);
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.getEnrolled.getInstance()];
        this.getEnrolled.init(bArr, 0);
        try {
            BigInteger[] init = this.getEciFlag.init(bArr);
            return this.isEnabledPaypal.configure(this.getEciFlag.init(), init[0], init[1]);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) throws SignatureException {
        this.getEnrolled.cca_continue(b);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.getEnrolled.init(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.getEnrolled.getInstance()];
        this.getEnrolled.init(bArr2, 0);
        try {
            BigInteger[] instance = this.isEnabledPaypal.getInstance(this.getEciFlag.init(), bArr);
            return this.getEciFlag.configure(bArr2, instance[0], instance[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    public static class detDSA extends DSASigner {
        public detDSA() {
            super(new KeyFactorySpi.ECMQV(), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyFactorySpi.ECMQV())));
        }
    }

    public static class detDSA224 extends DSASigner {
        public detDSA224() {
            super(new KeyPairGeneratorSpi.ECDHC(), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDHC())));
        }
    }

    public static class detDSA256 extends DSASigner {
        public detDSA256() {
            super(new SignatureSpi.ecCVCDSA224(), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new SignatureSpi.ecCVCDSA224())));
        }
    }

    public static class detDSA384 extends DSASigner {
        public detDSA384() {
            super(new SignatureSpi.ecCVCDSA(), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new SignatureSpi.ecCVCDSA())));
        }
    }

    public static class detDSA512 extends DSASigner {
        public detDSA512() {
            super(new KeyPairGeneratorSpi.ECMQV(), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECMQV())));
        }
    }

    public static class detDSASha3_224 extends DSASigner {
        public detDSASha3_224() {
            super(new KeyPairGeneratorSpi.ECDSA(224), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(224))));
        }
    }

    public static class detDSASha3_256 extends DSASigner {
        public detDSASha3_256() {
            super(new KeyPairGeneratorSpi.ECDSA(256), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(256))));
        }
    }

    public static class detDSASha3_384 extends DSASigner {
        public detDSASha3_384() {
            super(new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT))));
        }
    }

    public static class detDSASha3_512 extends DSASigner {
        public detDSASha3_512() {
            super(new KeyPairGeneratorSpi.ECDSA(512), new ISOSignatureSpi.MD5WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(512))));
        }
    }

    public static class dsa224 extends DSASigner {
        public dsa224() {
            super(new KeyPairGeneratorSpi.ECDHC(), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class dsa256 extends DSASigner {
        public dsa256() {
            super(new SignatureSpi.ecCVCDSA224(), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class dsa384 extends DSASigner {
        public dsa384() {
            super(new SignatureSpi.ecCVCDSA(), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class dsa512 extends DSASigner {
        public dsa512() {
            super(new KeyPairGeneratorSpi.ECMQV(), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class dsaSha3_224 extends DSASigner {
        public dsaSha3_224() {
            super(new KeyPairGeneratorSpi.ECDSA(224), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class dsaSha3_256 extends DSASigner {
        public dsaSha3_256() {
            super(new KeyPairGeneratorSpi.ECDSA(256), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class dsaSha3_384 extends DSASigner {
        public dsaSha3_384() {
            super(new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class dsaSha3_512 extends DSASigner {
        public dsaSha3_512() {
            super(new KeyPairGeneratorSpi.ECDSA(512), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }

    public static class stdDSA extends DSASigner {
        public stdDSA() {
            super(new KeyFactorySpi.ECMQV(), new ISOSignatureSpi.MD5WithRSAEncryption());
        }
    }
}
