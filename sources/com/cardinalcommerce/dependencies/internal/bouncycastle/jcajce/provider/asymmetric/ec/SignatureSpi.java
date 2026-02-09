package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.ISOSignatureSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class SignatureSpi extends DSABase {

    public static class ecDSARipeMD160 extends SignatureSpi {
        public ecDSARipeMD160() {
            super(new KeyFactorySpi.ECGOST3410_2012(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new KeyFactorySpi.ECDHC(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecPlainDSARP160 extends SignatureSpi {
        public ecPlainDSARP160() {
            super(new KeyFactorySpi.ECGOST3410_2012(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA1withRSA.cca_continue);
        }
    }

    SignatureSpi(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, GMSignatureSpi.sha256WithSM2 sha256withsm2, DigestSignatureSpi.noneRSA nonersa) {
        super(eCIESwithAESCBC, sha256withsm2, nonersa);
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        setCCAImageUri Cardinal = ECUtil.Cardinal(privateKey);
        this.getEciFlag.init();
        if (this.appRandom != null) {
            this.getEnrolled.cca_continue(true, new DigestSignatureSpi.RIPEMD128(Cardinal, this.appRandom));
        } else {
            this.getEnrolled.cca_continue(true, Cardinal);
        }
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        setCCAImageUri cca_continue = ECUtils.cca_continue(publicKey);
        this.getEciFlag.init();
        this.getEnrolled.cca_continue(false, cca_continue);
    }

    public static class ecCVCDSA extends SignatureSpi {
        public ecCVCDSA() {
            super(new KeyFactorySpi.ECMQV(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA1withRSA.cca_continue);
        }
    }

    public static class ecCVCDSA224 extends SignatureSpi {
        public ecCVCDSA224() {
            super(new KeyPairGeneratorSpi.ECDHC(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA1withRSA.cca_continue);
        }
    }

    public static class ecCVCDSA256 extends SignatureSpi {
        public ecCVCDSA256() {
            super(new SignatureSpi.ecCVCDSA224(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA1withRSA.cca_continue);
        }
    }

    public static class ecCVCDSA384 extends SignatureSpi {
        public ecCVCDSA384() {
            super(new SignatureSpi.ecCVCDSA(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA1withRSA.cca_continue);
        }
    }

    public static class ecCVCDSA512 extends SignatureSpi {
        public ecCVCDSA512() {
            super(new KeyPairGeneratorSpi.ECMQV(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA1withRSA.cca_continue);
        }
    }

    public static class ecDSA extends SignatureSpi {
        public ecDSA() {
            super(new KeyFactorySpi.ECMQV(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSA224 extends SignatureSpi {
        public ecDSA224() {
            super(new KeyPairGeneratorSpi.ECDHC(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSA256 extends SignatureSpi {
        public ecDSA256() {
            super(new SignatureSpi.ecCVCDSA224(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSA384 extends SignatureSpi {
        public ecDSA384() {
            super(new SignatureSpi.ecCVCDSA(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSA512 extends SignatureSpi {
        public ecDSA512() {
            super(new KeyPairGeneratorSpi.ECMQV(), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSASha3_224 extends SignatureSpi {
        public ecDSASha3_224() {
            super(new KeyPairGeneratorSpi.ECDSA(224), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSASha3_256 extends SignatureSpi {
        public ecDSASha3_256() {
            super(new KeyPairGeneratorSpi.ECDSA(256), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSASha3_384 extends SignatureSpi {
        public ecDSASha3_384() {
            super(new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDSASha3_512 extends SignatureSpi {
        public ecDSASha3_512() {
            super(new KeyPairGeneratorSpi.ECDSA(512), new ISOSignatureSpi.SHA1WithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSA extends SignatureSpi {
        public ecDetDSA() {
            super(new KeyFactorySpi.ECMQV(), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyFactorySpi.ECMQV())), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSA224 extends SignatureSpi {
        public ecDetDSA224() {
            super(new KeyPairGeneratorSpi.ECDHC(), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDHC())), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSA256 extends SignatureSpi {
        public ecDetDSA256() {
            super(new SignatureSpi.ecCVCDSA224(), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new SignatureSpi.ecCVCDSA224())), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSA384 extends SignatureSpi {
        public ecDetDSA384() {
            super(new SignatureSpi.ecCVCDSA(), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new SignatureSpi.ecCVCDSA())), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSA512 extends SignatureSpi {
        public ecDetDSA512() {
            super(new KeyPairGeneratorSpi.ECMQV(), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECMQV())), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSASha3_224 extends SignatureSpi {
        public ecDetDSASha3_224() {
            super(new KeyPairGeneratorSpi.ECDSA(224), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(224))), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSASha3_256 extends SignatureSpi {
        public ecDetDSASha3_256() {
            super(new KeyPairGeneratorSpi.ECDSA(256), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(256))), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSASha3_384 extends SignatureSpi {
        public ecDetDSASha3_384() {
            super(new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT))), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecDetDSASha3_512 extends SignatureSpi {
        public ecDetDSASha3_512() {
            super(new KeyPairGeneratorSpi.ECDSA(512), new ISOSignatureSpi.SHA1WithRSAEncryption(new ISOSignatureSpi.SHA512WithRSAEncryption(new KeyPairGeneratorSpi.ECDSA(512))), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecNR extends SignatureSpi {
        public ecNR() {
            super(new KeyFactorySpi.ECMQV(), new ISOSignatureSpi.WhirlpoolWithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecNR224 extends SignatureSpi {
        public ecNR224() {
            super(new KeyPairGeneratorSpi.ECDHC(), new ISOSignatureSpi.WhirlpoolWithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecNR256 extends SignatureSpi {
        public ecNR256() {
            super(new SignatureSpi.ecCVCDSA224(), new ISOSignatureSpi.WhirlpoolWithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecNR384 extends SignatureSpi {
        public ecNR384() {
            super(new SignatureSpi.ecCVCDSA(), new ISOSignatureSpi.WhirlpoolWithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }

    public static class ecNR512 extends SignatureSpi {
        public ecNR512() {
            super(new KeyPairGeneratorSpi.ECMQV(), new ISOSignatureSpi.WhirlpoolWithRSAEncryption(), PSSSignatureSpi.SHA384withRSA.getInstance);
        }
    }
}
