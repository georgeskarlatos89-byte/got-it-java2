package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.JStylerObj;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.getTextFontSize;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseCipherSpi;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class CipherSpi extends BaseCipherSpi {
    private boolean Cardinal = false;
    private AlgorithmParameterSpec cca_continue;
    private GMCipherSpi.SM2withBlake2b configure;
    private AlgorithmParameters getInstance;
    private boolean getWarnings = false;
    private final BaseCipherSpi.ErasableOutputStream init = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
    private BaseCipherSpi.ErasableOutputStream onValidated = new BaseCipherSpi.ErasableOutputStream();

    public static class ISO9796d1Padding extends CipherSpi {
        public ISO9796d1Padding() {
            super((GMCipherSpi.SM2withBlake2b) new SignatureSpi.ecDSA224(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super((GMCipherSpi.SM2withBlake2b) new SignatureSpi.ecDSASha3_384());
        }
    }

    public static class OAEPPadding extends CipherSpi {
        public OAEPPadding() {
            super(OAEPParameterSpec.DEFAULT);
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super((GMCipherSpi.SM2withBlake2b) new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends CipherSpi {
        public PKCS1v1_5Padding_PrivateOnly() {
            super(false, true, new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public static class PKCS1v1_5Padding_PublicOnly extends CipherSpi {
        public PKCS1v1_5Padding_PublicOnly() {
            super(true, false, new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384()));
        }
    }

    public CipherSpi(GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
        this.configure = sM2withBlake2b;
    }

    public CipherSpi(OAEPParameterSpec oAEPParameterSpec) {
        try {
            init(oAEPParameterSpec);
        } catch (NoSuchPaddingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public CipherSpi(boolean z, boolean z2, GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
        this.Cardinal = z;
        this.getWarnings = z2;
        this.configure = sM2withBlake2b;
    }

    private byte[] getInstance() throws BadPaddingException {
        try {
            byte[] Cardinal2 = this.configure.Cardinal(this.onValidated.getInstance(), 0, this.onValidated.size());
            this.onValidated.init();
            return Cardinal2;
        } catch (KeyAgreementSpi.AnonymousClass1 e) {
            throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to decrypt block", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to decrypt block", e2);
        } catch (Throwable th) {
            this.onValidated.init();
            throw th;
        }
    }

    private void init(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        IESCipher.ECIESwithAESCBC configure2 = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(mGF1ParameterSpec.getDigestAlgorithm());
        if (configure2 != null) {
            this.configure = new JStylerObj.MPTrue(new SignatureSpi.ecDSASha3_384(), configure2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.cca_continue = oAEPParameterSpec;
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder("no match on OAEP constructor for digest algorithm: ").append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
    }

    /* access modifiers changed from: protected */
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (bArr != null) {
                this.onValidated.write(bArr, i, i2);
            }
            if (this.configure instanceof SignatureSpi.ecDSASha3_384) {
                if (this.onValidated.size() > this.configure.init() + 1) {
                    throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
                }
            } else if (this.onValidated.size() > this.configure.init()) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
            byte[] instance = getInstance();
            for (int i4 = 0; i4 != instance.length; i4++) {
                bArr2[i3 + i4] = instance[i4];
            }
            return instance.length;
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    /* access modifiers changed from: protected */
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            this.onValidated.write(bArr, i, i2);
        }
        if (this.configure instanceof SignatureSpi.ecDSASha3_384) {
            if (this.onValidated.size() > this.configure.init() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
            }
        } else if (this.onValidated.size() > this.configure.init()) {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
        return getInstance();
    }

    public int engineGetBlockSize() {
        try {
            return this.configure.init();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    public int engineGetKeySize(Key key) {
        BigInteger modulus;
        if (key instanceof RSAPrivateKey) {
            modulus = ((RSAPrivateKey) key).getModulus();
        } else if (key instanceof RSAPublicKey) {
            modulus = ((RSAPublicKey) key).getModulus();
        } else {
            throw new IllegalArgumentException("not an RSA key!");
        }
        return modulus.bitLength();
    }

    public int engineGetOutputSize(int i) {
        try {
            return this.configure.getInstance();
        } catch (NullPointerException unused) {
            throw new IllegalStateException("RSA Cipher not initialised");
        }
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.getInstance == null && this.cca_continue != null) {
            try {
                AlgorithmParameters cca_continue2 = this.init.cca_continue("OAEP");
                this.getInstance = cca_continue2;
                cca_continue2.init(this.cca_continue);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.getInstance;
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(OAEPParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new InvalidAlgorithmParameterException(new StringBuilder("cannot recognise parameters: ").append(e.toString()).toString(), e);
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.getInstance = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            AlgorithmParameterSpec algorithmParameterSpec = null;
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(new StringBuilder("Eeeek! ").append(e.toString()).toString(), e);
        }
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        String cca_continue2 = getTextFontSize.cca_continue(str);
        if (!cca_continue2.equals("NONE") && !cca_continue2.equals("ECB")) {
            if (cca_continue2.equals("1")) {
                this.getWarnings = true;
                this.Cardinal = false;
            } else if (cca_continue2.equals("2")) {
                this.getWarnings = false;
                this.Cardinal = true;
            } else {
                throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
            }
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String cca_continue2 = getTextFontSize.cca_continue(str);
        if (cca_continue2.equals("NOPADDING")) {
            this.configure = new SignatureSpi.ecDSASha3_384();
        } else if (cca_continue2.equals("PKCS1PADDING")) {
            this.configure = new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSASha3_384());
        } else if (cca_continue2.equals("ISO9796-1PADDING")) {
            this.configure = new SignatureSpi.ecDSA224(new SignatureSpi.ecDSASha3_384());
        } else if (cca_continue2.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPPADDING")) {
            init(OAEPParameterSpec.DEFAULT);
        } else if (cca_continue2.equals("OAEPWITHSHA1ANDMGF1PADDING") || cca_continue2.equals("OAEPWITHSHA-1ANDMGF1PADDING")) {
            init(OAEPParameterSpec.DEFAULT);
        } else if (cca_continue2.equals("OAEPWITHSHA224ANDMGF1PADDING") || cca_continue2.equals("OAEPWITHSHA-224ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA256ANDMGF1PADDING") || cca_continue2.equals("OAEPWITHSHA-256ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA384ANDMGF1PADDING") || cca_continue2.equals("OAEPWITHSHA-384ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA512ANDMGF1PADDING") || cca_continue2.equals("OAEPWITHSHA-512ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
            init(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        } else {
            throw new NoSuchPaddingException(new StringBuilder().append(str).append(" unavailable with RSA.").toString());
        }
    }

    /* access modifiers changed from: protected */
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.onValidated.write(bArr, i, i2);
        if (this.configure instanceof SignatureSpi.ecDSASha3_384) {
            if (this.onValidated.size() <= this.configure.init() + 1) {
                return 0;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        } else if (this.onValidated.size() <= this.configure.init()) {
            return 0;
        } else {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.onValidated.write(bArr, i, i2);
        if (this.configure instanceof SignatureSpi.ecDSASha3_384) {
            if (this.onValidated.size() <= this.configure.init() + 1) {
                return null;
            }
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        } else if (this.onValidated.size() <= this.configure.init()) {
            return null;
        } else {
            throw new ArrayIndexOutOfBoundsException("too much data for RSA block");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        DigestSignatureSpi.RIPEMD128 ripemd128;
        DigestSignatureSpi.RIPEMD128 ripemd1282;
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof OAEPParameterSpec)) {
            if (key instanceof RSAPublicKey) {
                if (!this.getWarnings || i != 1) {
                    ripemd128 = RSAUtil.cca_continue((RSAPublicKey) key);
                } else {
                    throw new InvalidKeyException("mode 1 requires RSAPrivateKey");
                }
            } else if (!(key instanceof RSAPrivateKey)) {
                throw new InvalidKeyException("unknown key type passed to RSA");
            } else if (!this.Cardinal || i != 1) {
                ripemd128 = RSAUtil.init((RSAPrivateKey) key);
            } else {
                throw new InvalidKeyException("mode 2 requires RSAPublicKey");
            }
            if (algorithmParameterSpec != null) {
                OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
                this.cca_continue = algorithmParameterSpec;
                if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(KeyAgreementSpi.DHUwithSHA224CKDF.onCReqSuccess.init)) {
                    throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
                } else if (oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                    IESCipher.ECIESwithAESCBC configure2 = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(oAEPParameterSpec.getDigestAlgorithm());
                    if (configure2 != null) {
                        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
                        IESCipher.ECIESwithAESCBC configure3 = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(mGF1ParameterSpec.getDigestAlgorithm());
                        if (configure3 != null) {
                            this.configure = new JStylerObj.MPTrue(new SignatureSpi.ecDSASha3_384(), configure2, configure3, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                        } else {
                            throw new InvalidAlgorithmParameterException(new StringBuilder("no match on MGF digest algorithm: ").append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException(new StringBuilder("no match on digest algorithm: ").append(oAEPParameterSpec.getDigestAlgorithm()).toString());
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("unkown MGF parameters");
                }
            }
            if (!(this.configure instanceof SignatureSpi.ecDSASha3_384)) {
                if (secureRandom == null) {
                    ripemd1282 = new DigestSignatureSpi.RIPEMD128(ripemd128, GMCipherSpi.SM2withWhirlpool.configure());
                }
                ripemd128 = ripemd1282;
            }
            this.onValidated.reset();
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new InvalidParameterException(new StringBuilder("unknown opmode ").append(i).append(" passed to RSA").toString());
                        }
                    }
                }
                this.configure.getInstance(false, ripemd128);
                return;
            }
            this.configure.getInstance(true, ripemd128);
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder("unknown parameter type: ").append(algorithmParameterSpec.getClass().getName()).toString());
    }
}
