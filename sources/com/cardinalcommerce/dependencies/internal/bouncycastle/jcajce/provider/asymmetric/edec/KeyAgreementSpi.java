package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.JStylerObj;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.a.arrayObjectEnd;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private KeyAgreementSpi.CDHwithSHA512KDFAndSharedInfo configure;
    private byte[] getWarnings;
    private X931SignatureSpi.SHA256WithRSAEncryption init;

    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super("X25519");
        }
    }

    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super("X448");
        }
    }

    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    KeyAgreementSpi(String str) {
        super(str, (GMCipherSpi.SM2withSha512) null);
    }

    KeyAgreementSpi(String str, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
    }

    private KeyAgreementSpi.CDHwithSHA512KDFAndSharedInfo getInstance(String str) throws InvalidKeyException {
        if (this.Cardinal.equals("XDH") || this.Cardinal.startsWith(str)) {
            int indexOf = this.Cardinal.indexOf(85);
            boolean startsWith = str.startsWith("X448");
            return indexOf > 0 ? startsWith ? new arrayObjectEnd(new KeyAgreementSpi.ECKAEGwithSHA224KDF()) : new arrayObjectEnd(new KeyAgreementSpi.ECKAEGwithRIPEMD160KDF()) : startsWith ? new KeyAgreementSpi.ECKAEGwithSHA224KDF() : new KeyAgreementSpi.ECKAEGwithRIPEMD160KDF();
        }
        throw new InvalidKeyException(new StringBuilder("inappropriate key for ").append(this.Cardinal).toString());
    }

    public final byte[] Cardinal() {
        return this.getWarnings;
    }

    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new SignatureSpi.ecNR384(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new JStylerObj(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new JStylerObj(new SignatureSpi.ecCVCDSA()));
        }
    }

    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new JStylerObj(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new SignatureSpi.ecNR384(new KeyPairGeneratorSpi.ECMQV()));
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key instanceof BCXDHPrivateKey) {
            setCCAImageUri setccaimageuri = ((BCXDHPrivateKey) key).getInstance;
            this.configure = getInstance(setccaimageuri instanceof DigestSignatureSpi.SHA3_384 ? "X448" : "X25519");
            this.configure.init(setccaimageuri);
            if (this.cca_continue != null) {
                this.getInstance = new byte[0];
            } else {
                this.getInstance = null;
            }
        } else {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (key instanceof BCXDHPrivateKey) {
            setCCAImageUri setccaimageuri = ((BCXDHPrivateKey) key).getInstance;
            this.configure = getInstance(setccaimageuri instanceof DigestSignatureSpi.SHA3_384 ? "X448" : "X25519");
            byte[] bArr = null;
            this.getInstance = null;
            if (!(algorithmParameterSpec instanceof X931SignatureSpi.SHA256WithRSAEncryption)) {
                this.configure.init(setccaimageuri);
                if (!(algorithmParameterSpec instanceof com.cardinalcommerce.a.BaseAgreementSpi)) {
                    throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
                } else if (this.cca_continue != null) {
                    byte[] bArr2 = ((com.cardinalcommerce.a.BaseAgreementSpi) algorithmParameterSpec).configure;
                    if (bArr2 != null) {
                        bArr = new byte[bArr2.length];
                        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                    }
                    this.getInstance = bArr;
                } else {
                    throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
                }
            } else if (this.Cardinal.indexOf(85) >= 0) {
                X931SignatureSpi.SHA256WithRSAEncryption sHA256WithRSAEncryption = (X931SignatureSpi.SHA256WithRSAEncryption) algorithmParameterSpec;
                this.init = sHA256WithRSAEncryption;
                byte[] bArr3 = sHA256WithRSAEncryption.cca_continue;
                if (bArr3 != null) {
                    bArr = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                }
                this.getInstance = bArr;
                this.configure.init(new DigestSignatureSpi.SHA384(setccaimageuri, ((BCXDHPrivateKey) this.init.init).getInstance, ((BCXDHPublicKey) this.init.Cardinal).cca_continue));
            } else {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            }
            if (this.cca_continue != null && this.getInstance == null) {
                this.getInstance = new byte[0];
                return;
            }
            return;
        }
        throw new InvalidKeyException("cannot identify XDH private key");
    }

    /* access modifiers changed from: protected */
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.configure == null) {
            throw new IllegalStateException(new StringBuilder().append(this.Cardinal).append(" not initialised.").toString());
        } else if (!z) {
            throw new IllegalStateException(new StringBuilder().append(this.Cardinal).append(" can only be between two parties.").toString());
        } else if (key instanceof BCXDHPublicKey) {
            setCCAImageUri setccaimageuri = ((BCXDHPublicKey) key).cca_continue;
            byte[] bArr = new byte[this.configure.getInstance()];
            this.getWarnings = bArr;
            if (this.init != null) {
                this.configure.init(new DigestSignatureSpi.SHA512_224(setccaimageuri, ((BCXDHPublicKey) this.init.configure).cca_continue), this.getWarnings, 0);
                return null;
            }
            this.configure.init(setccaimageuri, bArr, 0);
            return null;
        } else {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
    }
}
