package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BCDSAPrivateKey;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.isEnabledVisaCheckout;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

public class DigestSignatureSpi extends SignatureSpi {
    private BCDSAPrivateKey configure;
    private IESCipher.ECIESwithAESCBC getInstance;
    private GMCipherSpi.SM2withBlake2b init;

    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(KeyAgreementSpi.DHUwithSHA224CKDF.getRequestTimeout, new KeyFactorySpi.ECDSA(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(KeyAgreementSpi.DHUwithSHA224CKDF.getChallengeTimeout, new KeyFactorySpi.ECGOST3410(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(KeyAgreementSpi.DHwithSHA384KDF.init, new KeyPairGeneratorSpi.ECDH(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(KeyAgreementSpi.DHwithSHA384KDF.cca_continue, new KeyFactorySpi.ECGOST3410_2012(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(KeyAgreementSpi.DHwithSHA384KDF.configure, new KeyPairGeneratorSpi.EC(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new KeyFactorySpi.ECDHC(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    protected DigestSignatureSpi(IESCipher.ECIESwithAESCBC eCIESwithAESCBC, GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
        this.getInstance = eCIESwithAESCBC;
        this.init = sM2withBlake2b;
        this.configure = null;
    }

    protected DigestSignatureSpi(ASN1ObjectIdentifier aSN1ObjectIdentifier, IESCipher.ECIESwithAESCBC eCIESwithAESCBC, GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
        this.getInstance = eCIESwithAESCBC;
        this.init = sM2withBlake2b;
        this.configure = new BCDSAPrivateKey(aSN1ObjectIdentifier, isEnabledVisaCheckout.configure);
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        return null;
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
    public void engineUpdate(byte b) throws SignatureException {
        this.getInstance.cca_continue(b);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.getInstance.init(bArr, i, i2);
    }

    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(KeyAgreementSpi.DHUwithSHA224CKDF.setChallengeTimeout, new KeyFactorySpi.ECDH(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(KeyAgreementSpi.DHUwithSHA1KDF.onValidated, new KeyFactorySpi.ECMQV(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(IESCipher.IESwithDESedeCBC.onValidated, new KeyPairGeneratorSpi.ECDHC(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(IESCipher.IESwithDESedeCBC.cca_continue, new SignatureSpi.ecCVCDSA224(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(IESCipher.IESwithDESedeCBC.Cardinal, new SignatureSpi.ecCVCDSA(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(IESCipher.IESwithDESedeCBC.getSDKVersion, new KeyPairGeneratorSpi.ECDSA(224), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(IESCipher.IESwithDESedeCBC.getWarnings, new KeyPairGeneratorSpi.ECDSA(256), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(IESCipher.IESwithDESedeCBC.CardinalError, new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(IESCipher.IESwithDESedeCBC.CardinalEnvironment, new KeyPairGeneratorSpi.ECDSA(512), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(IESCipher.IESwithDESedeCBC.getInstance, new KeyPairGeneratorSpi.ECMQV(), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(IESCipher.IESwithDESedeCBC.cleanup, new SignatureSpi.ecCVCDSA256(224), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(IESCipher.IESwithDESedeCBC.onCReqSuccess, new SignatureSpi.ecCVCDSA256(256), new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof RSAPublicKey)) {
            throw new InvalidKeyException(new StringBuilder("Supplied key (").append(publicKey == null ? null : publicKey.getClass().getName()).append(") is not a RSAPublicKey instance").toString());
        }
        DigestSignatureSpi.SHA256 cca_continue = RSAUtil.cca_continue((RSAPublicKey) publicKey);
        this.getInstance.init();
        this.init.getInstance(false, cca_continue);
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof RSAPrivateKey)) {
            throw new InvalidKeyException(new StringBuilder("Supplied key (").append(privateKey == null ? null : privateKey.getClass().getName()).append(") is not a RSAPrivateKey instance").toString());
        }
        DigestSignatureSpi.SHA256 init2 = RSAUtil.init((RSAPrivateKey) privateKey);
        this.getInstance.init();
        this.init.getInstance(true, init2);
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() throws SignatureException {
        byte[] bArr = new byte[this.getInstance.getInstance()];
        this.getInstance.init(bArr, 0);
        try {
            if (this.configure != null) {
                bArr = new DSASigner.detDSA224(this.configure, bArr).configure("DER");
            }
            return this.init.Cardinal(bArr, 0, bArr.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.getInstance.getInstance()];
        this.getInstance.init(bArr2, 0);
        try {
            byte[] Cardinal = this.init.Cardinal(bArr, 0, bArr.length);
            if (this.configure != null) {
                bArr2 = new DSASigner.detDSA224(this.configure, bArr2).configure("DER");
            }
            if (Cardinal.length == bArr2.length) {
                return getBackgroundColor.init(Cardinal, bArr2);
            }
            if (Cardinal.length == bArr2.length - 2) {
                bArr2[1] = (byte) (bArr2[1] - 2);
                byte b = (byte) (bArr2[3] - 2);
                bArr2[3] = b;
                int i = b + 4;
                int i2 = i + 2;
                byte b2 = 0;
                for (int i3 = 0; i3 < bArr2.length - i2; i3++) {
                    b2 |= Cardinal[i + i3] ^ bArr2[i2 + i3];
                }
                for (int i4 = 0; i4 < i; i4++) {
                    b2 |= Cardinal[i4] ^ bArr2[i4];
                }
                return b2 == 0;
            }
            getBackgroundColor.init(bArr2, bArr2);
            return false;
        } catch (Exception unused) {
        }
    }
}
