package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.BCElGamalPublicKey;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.ISOSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.setCCAImageUri;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;

public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] Cardinal = new byte[0];
    private final String cca_continue;
    private KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo getInstance;

    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super("Ed25519");
        }
    }

    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super("Ed448");
        }
    }

    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super((String) null);
        }
    }

    SignatureSpi(String str) {
        this.cca_continue = str;
    }

    private KeyAgreementSpi.CDHwithSHA256KDFAndSharedInfo getInstance(String str) throws InvalidKeyException {
        String str2 = this.cca_continue;
        if (str2 == null || str.equals(str2)) {
            return str.equals("Ed448") ? new ISOSignatureSpi.SHA512_224WithRSAEncryption(Cardinal) : new ISOSignatureSpi.SHA384WithRSAEncryption();
        }
        throw new InvalidKeyException(new StringBuilder("inappropriate key for ").append(this.cca_continue).toString());
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() throws SignatureException {
        try {
            return this.getInstance.init();
        } catch (GMCipherSpi.SM2withSha224 e) {
            throw new SignatureException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) throws SignatureException {
        this.getInstance.init(b);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.getInstance.cca_continue(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.getInstance.init(bArr);
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCEdDSAPublicKey) {
            setCCAImageUri setccaimageuri = ((BCEdDSAPublicKey) publicKey).Cardinal;
            this.getInstance = getInstance(setccaimageuri instanceof BCElGamalPublicKey ? "Ed448" : "Ed25519");
            this.getInstance.cca_continue(false, setccaimageuri);
            return;
        }
        throw new InvalidKeyException("cannot identify EdDSA public key");
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCEdDSAPrivateKey) {
            setCCAImageUri setccaimageuri = ((BCEdDSAPrivateKey) privateKey).init;
            this.getInstance = getInstance(setccaimageuri instanceof CipherSpi ? "Ed448" : "Ed25519");
            this.getInstance.cca_continue(true, setccaimageuri);
            return;
        }
        throw new InvalidKeyException("cannot identify EdDSA public key");
    }
}
