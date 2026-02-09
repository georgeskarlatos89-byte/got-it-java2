package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.EC5Util;
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
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class CipherSpi extends BaseCipherSpi {
    private GMCipherSpi.SM2withBlake2b Cardinal;
    private AlgorithmParameters cca_continue;
    private AlgorithmParameterSpec getInstance;
    private BaseCipherSpi.ErasableOutputStream init = new BaseCipherSpi.ErasableOutputStream();

    public static class NoPadding extends CipherSpi {
        public NoPadding() {
            super(new SignatureSpi.ecDSA512());
        }
    }

    public static class PKCS1v1_5Padding extends CipherSpi {
        public PKCS1v1_5Padding() {
            super(new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSA512()));
        }
    }

    public CipherSpi(GMCipherSpi.SM2withBlake2b sM2withBlake2b) {
        this.Cardinal = sM2withBlake2b;
    }

    private byte[] cca_continue() throws BadPaddingException {
        try {
            byte[] Cardinal2 = this.Cardinal.Cardinal(this.init.getInstance(), 0, this.init.size());
            this.init.init();
            return Cardinal2;
        } catch (KeyAgreementSpi.AnonymousClass1 e) {
            throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to decrypt block", e);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new X931SignatureSpi.SHA1WithRSAEncryption("unable to decrypt block", e2);
        } catch (Throwable th) {
            this.init.init();
            throw th;
        }
    }

    private void configure(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
        IESCipher.ECIESwithAESCBC configure = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(mGF1ParameterSpec.getDigestAlgorithm());
        if (configure != null) {
            this.Cardinal = new JStylerObj.MPTrue(new SignatureSpi.ecDSA512(), configure, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
            this.getInstance = oAEPParameterSpec;
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder("no match on OAEP constructor for digest algorithm: ").append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
    }

    /* access modifiers changed from: protected */
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (bArr != null) {
                this.init.write(bArr, i, i2);
            }
            if (this.Cardinal instanceof SignatureSpi.ecDSA512) {
                if (this.init.size() > this.Cardinal.init() + 1) {
                    throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
                }
            } else if (this.init.size() > this.Cardinal.init()) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
            byte[] cca_continue2 = cca_continue();
            for (int i4 = 0; i4 != cca_continue2.length; i4++) {
                bArr2[i3 + i4] = cca_continue2[i4];
            }
            return cca_continue2.length;
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    /* access modifiers changed from: protected */
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (bArr != null) {
            this.init.write(bArr, i, i2);
        }
        if (this.Cardinal instanceof SignatureSpi.ecDSA512) {
            if (this.init.size() > this.Cardinal.init() + 1) {
                throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
            }
        } else if (this.init.size() > this.Cardinal.init()) {
            throw new ArrayIndexOutOfBoundsException("too much data for ElGamal block");
        }
        return cca_continue();
    }

    public int engineGetBlockSize() {
        return this.Cardinal.init();
    }

    public int engineGetOutputSize(int i) {
        return this.Cardinal.getInstance();
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.cca_continue == null && this.getInstance != null) {
            try {
                AlgorithmParameters instance = getInstance("OAEP");
                this.cca_continue = instance;
                instance.init(this.getInstance);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.cca_continue;
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameters in ElGamal");
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
            throw new NoSuchAlgorithmException("can't support mode ".concat(String.valueOf(str)));
        }
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String cca_continue2 = getTextFontSize.cca_continue(str);
        if (cca_continue2.equals("NOPADDING")) {
            this.Cardinal = new SignatureSpi.ecDSA512();
        } else if (cca_continue2.equals("PKCS1PADDING")) {
            this.Cardinal = new SignatureSpi.ecDSARipeMD160(new SignatureSpi.ecDSA512());
        } else if (cca_continue2.equals("ISO9796-1PADDING")) {
            this.Cardinal = new SignatureSpi.ecDSA224(new SignatureSpi.ecDSA512());
        } else if (cca_continue2.equals("OAEPPADDING")) {
            configure(OAEPParameterSpec.DEFAULT);
        } else if (cca_continue2.equals("OAEPWITHMD5ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("MD5", "MGF1", new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA1ANDMGF1PADDING")) {
            configure(OAEPParameterSpec.DEFAULT);
        } else if (cca_continue2.equals("OAEPWITHSHA224ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA-224", "MGF1", new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA256ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA384ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA512ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-224ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-256ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA3-256", "MGF1", new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-384ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), PSource.PSpecified.DEFAULT));
        } else if (cca_continue2.equals("OAEPWITHSHA3-512ANDMGF1PADDING")) {
            configure(new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), PSource.PSpecified.DEFAULT));
        } else {
            throw new NoSuchPaddingException(new StringBuilder().append(str).append(" unavailable with ElGamal.").toString());
        }
    }

    /* access modifiers changed from: protected */
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.init.write(bArr, i, i2);
        return 0;
    }

    /* access modifiers changed from: protected */
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.init.write(bArr, i, i2);
        return null;
    }

    public int engineGetKeySize(Key key) {
        BigInteger p;
        if (key instanceof EC5Util) {
            p = ((EC5Util) key).getInstance().Cardinal;
        } else if (key instanceof DHKey) {
            p = ((DHKey) key).getParams().getP();
        } else {
            throw new IllegalArgumentException("not an ElGamal key!");
        }
        return p.bitLength();
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        DigestSignatureSpi.RIPEMD128 ripemd128;
        GMCipherSpi.SM2withBlake2b sM2withBlake2b;
        if (key instanceof DHPublicKey) {
            ripemd128 = ElGamalUtil.getInstance((PublicKey) key);
        } else if (key instanceof DHPrivateKey) {
            ripemd128 = ElGamalUtil.configure((PrivateKey) key);
        } else {
            throw new InvalidKeyException("unknown key type passed to ElGamal");
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
            this.getInstance = algorithmParameterSpec;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !oAEPParameterSpec.getMGFAlgorithm().equals(KeyAgreementSpi.DHUwithSHA224CKDF.onCReqSuccess.init)) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            } else if (oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                IESCipher.ECIESwithAESCBC configure = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(oAEPParameterSpec.getDigestAlgorithm());
                if (configure != null) {
                    MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters();
                    IESCipher.ECIESwithAESCBC configure2 = X931SignatureSpi.RIPEMD128WithRSAEncryption.configure(mGF1ParameterSpec.getDigestAlgorithm());
                    if (configure2 != null) {
                        this.Cardinal = new JStylerObj.MPTrue(new SignatureSpi.ecDSA512(), configure, configure2, ((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue());
                    } else {
                        throw new InvalidAlgorithmParameterException(new StringBuilder("no match on MGF digest algorithm: ").append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
                    }
                } else {
                    throw new InvalidAlgorithmParameterException(new StringBuilder("no match on digest algorithm: ").append(oAEPParameterSpec.getDigestAlgorithm()).toString());
                }
            } else {
                throw new InvalidAlgorithmParameterException("unkown MGF parameters");
            }
        } else if (algorithmParameterSpec != null) {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        if (secureRandom != null) {
            ripemd128 = new DigestSignatureSpi.RIPEMD128(ripemd128, secureRandom);
        }
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new InvalidParameterException(new StringBuilder("unknown opmode ").append(i).append(" passed to ElGamal").toString());
                    }
                }
            }
            sM2withBlake2b = this.Cardinal;
            z = false;
            sM2withBlake2b.getInstance(z, ripemd128);
        }
        sM2withBlake2b = this.Cardinal;
        sM2withBlake2b.getInstance(z, ripemd128);
    }
}
