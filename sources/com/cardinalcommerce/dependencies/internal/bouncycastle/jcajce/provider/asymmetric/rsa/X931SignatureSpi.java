package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class X931SignatureSpi extends SignatureSpi {
    private PSSSignatureSpi.SHA3_224withRSA Cardinal;

    public static class RIPEMD128WithRSAEncryption extends X931SignatureSpi {
        public RIPEMD128WithRSAEncryption() {
            super(new KeyPairGeneratorSpi.ECDH(), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class RIPEMD160WithRSAEncryption extends X931SignatureSpi {
        public RIPEMD160WithRSAEncryption() {
            super(new KeyFactorySpi.ECGOST3410_2012(), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class WhirlpoolWithRSAEncryption extends X931SignatureSpi {
        public WhirlpoolWithRSAEncryption() {
            super(new SignatureSpi.ecDSA256(), new SignatureSpi.ecDSASha3_384());
        }
    }

    protected X931SignatureSpi(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
        this.Cardinal = new PSSSignatureSpi.SHA3_224withRSA(sM2withBlake2b, eCIESwithAESCBC);
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.Cardinal.cca_continue(true, RSAUtil.init((RSAPrivateKey) privateKey));
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.Cardinal.cca_continue(false, RSAUtil.cca_continue((RSAPublicKey) publicKey));
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
        try {
            return this.Cardinal.init();
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.Cardinal.init(bArr);
    }

    public static class SHA1WithRSAEncryption extends X931SignatureSpi {
        public SHA1WithRSAEncryption() {
            super(new KeyFactorySpi.ECMQV(), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class SHA224WithRSAEncryption extends X931SignatureSpi {
        public SHA224WithRSAEncryption() {
            super(new KeyPairGeneratorSpi.ECDHC(), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class SHA256WithRSAEncryption extends X931SignatureSpi {
        public SHA256WithRSAEncryption() {
            super(new SignatureSpi.ecCVCDSA224(), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class SHA384WithRSAEncryption extends X931SignatureSpi {
        public SHA384WithRSAEncryption() {
            super(new SignatureSpi.ecCVCDSA(), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class SHA512WithRSAEncryption extends X931SignatureSpi {
        public SHA512WithRSAEncryption() {
            super(new KeyPairGeneratorSpi.ECMQV(), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class SHA512_224WithRSAEncryption extends X931SignatureSpi {
        public SHA512_224WithRSAEncryption() {
            super(new SignatureSpi.ecCVCDSA256(224), new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class SHA512_256WithRSAEncryption extends X931SignatureSpi {
        public SHA512_256WithRSAEncryption() {
            super(new SignatureSpi.ecCVCDSA256(256), new SignatureSpi.ecDSASha3_384());
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) throws SignatureException {
        this.Cardinal.configure.cca_continue(b);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.Cardinal.configure.init(bArr, i, i2);
    }
}
