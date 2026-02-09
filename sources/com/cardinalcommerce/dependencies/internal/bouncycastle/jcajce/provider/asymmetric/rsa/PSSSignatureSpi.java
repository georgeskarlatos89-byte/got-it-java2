package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

public class PSSSignatureSpi extends SignatureSpi {
    private PSSParameterSpec Cardinal;
    private boolean CardinalError;
    private PSSSignatureSpi.PSSwithRSA CardinalRenderType;
    private PSSParameterSpec cca_continue;
    private IESCipher.ECIESwithAESCBC cleanup;
    private final BaseCipherSpi.ErasableOutputStream configure;
    private AlgorithmParameters getInstance;
    private IESCipher.ECIESwithAESCBC getSDKVersion;
    private boolean getWarnings;
    private GMCipherSpi.SM2withBlake2b init;
    private byte onCReqSuccess;
    private int onValidated;
    private DigestSignatureSpi.SHA256 values;

    public static class PSSwithRSA extends PSSSignatureSpi {
        public PSSwithRSA() {
            super(new SignatureSpi.ecDSASha3_384(), (PSSParameterSpec) null);
        }
    }

    public static class SHA1withRSA extends PSSSignatureSpi {
        public SHA1withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), PSSParameterSpec.DEFAULT);
        }
    }

    public static class SHA224withRSA extends PSSSignatureSpi {
        public SHA224withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), 28, 1));
        }
    }

    public static class SHA256withRSA extends PSSSignatureSpi {
        public SHA256withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
        }
    }

    public static class SHA384withRSA extends PSSSignatureSpi {
        public SHA384withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
        }
    }

    public static class SHA3_224withRSA extends PSSSignatureSpi {
        public SHA3_224withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    public static class SHA3_256withRSA extends PSSSignatureSpi {
        public SHA3_256withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), 32, 1));
        }
    }

    public static class SHA3_384withRSA extends PSSSignatureSpi {
        public SHA3_384withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    public static class SHA3_512withRSA extends PSSSignatureSpi {
        public SHA3_512withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    public static class SHA512_224withRSA extends PSSSignatureSpi {
        public SHA512_224withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    public static class SHA512_256withRSA extends PSSSignatureSpi {
        public SHA512_256withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    public static class SHA512withRSA extends PSSSignatureSpi {
        public SHA512withRSA() {
            super(new SignatureSpi.ecDSASha3_384(), new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
        }
    }

    public static class nonePSS extends PSSSignatureSpi {
        public nonePSS() {
            super(new SignatureSpi.ecDSASha3_384(), (PSSParameterSpec) null, true);
        }
    }

    protected PSSSignatureSpi(GMCipherSpi.SM2withBlake2b sM2withBlake2b, PSSParameterSpec pSSParameterSpec) {
        this(sM2withBlake2b, pSSParameterSpec, false);
    }

    private void configure() {
        this.cleanup = this.getWarnings ? new NullPssDigest(this.getSDKVersion) : this.getSDKVersion;
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        if (this.getInstance == null && this.cca_continue != null) {
            try {
                AlgorithmParameters cca_continue2 = this.configure.cca_continue("PSS");
                this.getInstance = cca_continue2;
                cca_continue2.init(this.cca_continue);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.getInstance;
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            this.values = RSAUtil.init((RSAPrivateKey) privateKey);
            PSSSignatureSpi.PSSwithRSA pSSwithRSA = new PSSSignatureSpi.PSSwithRSA(this.init, this.cleanup, this.getSDKVersion, this.onValidated, this.onCReqSuccess);
            this.CardinalRenderType = pSSwithRSA;
            pSSwithRSA.cca_continue(true, this.values);
            this.CardinalError = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            this.values = RSAUtil.init((RSAPrivateKey) privateKey);
            PSSSignatureSpi.PSSwithRSA pSSwithRSA = new PSSSignatureSpi.PSSwithRSA(this.init, this.cleanup, this.getSDKVersion, this.onValidated, this.onCReqSuccess);
            this.CardinalRenderType = pSSwithRSA;
            pSSwithRSA.cca_continue(true, new DigestSignatureSpi.RIPEMD128(this.values, secureRandom));
            this.CardinalError = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof RSAPublicKey) {
            this.values = RSAUtil.cca_continue((RSAPublicKey) publicKey);
            PSSSignatureSpi.PSSwithRSA pSSwithRSA = new PSSSignatureSpi.PSSwithRSA(this.init, this.cleanup, this.getSDKVersion, this.onValidated, this.onCReqSuccess);
            this.CardinalRenderType = pSSwithRSA;
            pSSwithRSA.cca_continue(false, this.values);
            this.CardinalError = true;
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() throws SignatureException {
        this.CardinalError = true;
        try {
            return this.CardinalRenderType.init();
        } catch (GMCipherSpi.SM2withSha224 e) {
            throw new SignatureException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        this.CardinalError = true;
        return this.CardinalRenderType.init(bArr);
    }

    class NullPssDigest implements IESCipher.ECIESwithAESCBC {
        private boolean Cardinal = true;
        private ByteArrayOutputStream getInstance = new ByteArrayOutputStream();
        private IESCipher.ECIESwithAESCBC init;

        public NullPssDigest(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            this.init = eCIESwithAESCBC;
        }

        public final void cca_continue(byte b) {
            this.getInstance.write(b);
        }

        public final String configure() {
            return "NULL";
        }

        public final int getInstance() {
            return this.init.getInstance();
        }

        public final void init() {
            this.getInstance.reset();
            this.init.init();
        }

        public final void init(byte[] bArr, int i, int i2) {
            this.getInstance.write(bArr, i, i2);
        }

        public final int init(byte[] bArr, int i) {
            byte[] byteArray = this.getInstance.toByteArray();
            if (this.Cardinal) {
                System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
            } else {
                this.init.init(byteArray, 0, byteArray.length);
                this.init.init(bArr, i);
            }
            this.getInstance.reset();
            this.init.init();
            this.Cardinal = !this.Cardinal;
            return byteArray.length;
        }
    }

    protected PSSSignatureSpi(GMCipherSpi.SM2withBlake2b sM2withBlake2b, PSSParameterSpec pSSParameterSpec, boolean z) {
        this.configure = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
        this.CardinalError = true;
        this.init = sM2withBlake2b;
        this.Cardinal = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.cca_continue = PSSParameterSpec.DEFAULT;
        } else {
            this.cca_continue = pSSParameterSpec;
        }
        this.getSDKVersion = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(this.cca_continue.getDigestAlgorithm());
        this.onValidated = this.cca_continue.getSaltLength();
        if (this.cca_continue.getTrailerField() == 1) {
            this.onCReqSuccess = -68;
            this.getWarnings = z;
            configure();
            return;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) throws SignatureException {
        this.CardinalRenderType.Cardinal.cca_continue(b);
        this.CardinalError = false;
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.CardinalRenderType.Cardinal.init(bArr, i, i2);
        this.CardinalError = false;
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null || (algorithmParameterSpec = this.Cardinal) != null) {
            if (!this.CardinalError) {
                throw new ProviderException("cannot call setParameter in the middle of update");
            } else if (algorithmParameterSpec instanceof PSSParameterSpec) {
                PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
                PSSParameterSpec pSSParameterSpec2 = this.Cardinal;
                if (pSSParameterSpec2 != null && !X931SignatureSpi.RIPEMD128WithRSAEncryption.Cardinal(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                    throw new InvalidAlgorithmParameterException(new StringBuilder("parameter must be using ").append(this.Cardinal.getDigestAlgorithm()).toString());
                } else if (!pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !pSSParameterSpec.getMGFAlgorithm().equals(KeyAgreementSpi.DHUwithSHA224CKDF.onCReqSuccess.init)) {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                } else if (pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                    MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
                    if (X931SignatureSpi.RIPEMD128WithRSAEncryption.Cardinal(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                        IESCipher.ECIESwithAESCBC configure2 = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(mGF1ParameterSpec.getDigestAlgorithm());
                        if (configure2 != null) {
                            this.getInstance = null;
                            this.cca_continue = pSSParameterSpec;
                            this.getSDKVersion = configure2;
                            this.onValidated = pSSParameterSpec.getSaltLength();
                            if (this.cca_continue.getTrailerField() == 1) {
                                this.onCReqSuccess = -68;
                                configure();
                                if (this.values != null) {
                                    this.CardinalRenderType = new PSSSignatureSpi.PSSwithRSA(this.init, this.cleanup, this.getSDKVersion, this.onValidated, this.onCReqSuccess);
                                    if (this.values.getSDKVersion) {
                                        this.CardinalRenderType.cca_continue(true, this.values);
                                    } else {
                                        this.CardinalRenderType.cca_continue(false, this.values);
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("unknown trailer field");
                            }
                        } else {
                            throw new InvalidAlgorithmParameterException(new StringBuilder("no match on MGF digest algorithm: ").append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("unknown MGF parameters");
                }
            } else {
                throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
            }
        }
    }
}
