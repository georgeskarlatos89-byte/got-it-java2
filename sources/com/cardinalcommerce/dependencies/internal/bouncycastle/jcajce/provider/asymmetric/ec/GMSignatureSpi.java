package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec;

import com.cardinalcommerce.a.BaseCipherSpi;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

public class GMSignatureSpi extends SignatureSpi {
    private final BaseCipherSpi.ErasableOutputStream Cardinal = new X931SignatureSpi.WhirlpoolWithRSAEncryption();
    private AlgorithmParameters cca_continue;
    private X931SignatureSpi.SHA512_256WithRSAEncryption configure;
    private final PSSSignatureSpi.SHA3_384withRSA init;

    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new PSSSignatureSpi.SHA3_384withRSA(new SignatureSpi.ecCVCDSA224()));
        }
    }

    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new PSSSignatureSpi.SHA3_384withRSA());
        }
    }

    GMSignatureSpi(PSSSignatureSpi.SHA3_384withRSA sHA3_384withRSA) {
        this.init = sHA3_384withRSA;
    }

    /* access modifiers changed from: protected */
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        if (this.cca_continue == null && this.configure != null) {
            try {
                AlgorithmParameters cca_continue2 = this.Cardinal.cca_continue("PSS");
                this.cca_continue = cca_continue2;
                cca_continue2.init(this.configure);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.cca_continue;
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* access modifiers changed from: protected */
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof X931SignatureSpi.SHA512_256WithRSAEncryption) {
            this.configure = (X931SignatureSpi.SHA512_256WithRSAEncryption) algorithmParameterSpec;
            return;
        }
        throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
    }

    /* access modifiers changed from: protected */
    public byte[] engineSign() throws SignatureException {
        try {
            return this.init.init();
        } catch (GMCipherSpi.SM2withSha224 e) {
            throw new SignatureException(new StringBuilder("unable to create signature: ").append(e.getMessage()).toString());
        }
    }

    /* access modifiers changed from: protected */
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.init.init(bArr);
    }

    /* access modifiers changed from: protected */
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        byte[] bArr;
        GMCipherSpi.SM2withRMD cca_continue2 = ECUtils.cca_continue(publicKey);
        if (this.configure != null) {
            byte[] bArr2 = this.configure.configure;
            if (bArr2 == null) {
                bArr = null;
            } else {
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                bArr = bArr3;
            }
            cca_continue2 = new CipherSpi.PKCS1v1_5Padding_PublicOnly(cca_continue2, bArr);
        }
        this.init.cca_continue(false, cca_continue2);
    }

    /* access modifiers changed from: protected */
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        byte[] bArr;
        GMCipherSpi.SM2withRMD Cardinal2 = ECUtil.Cardinal(privateKey);
        if (this.appRandom != null) {
            Cardinal2 = new DigestSignatureSpi.RIPEMD128(Cardinal2, this.appRandom);
        }
        if (this.configure != null) {
            PSSSignatureSpi.SHA3_384withRSA sHA3_384withRSA = this.init;
            byte[] bArr2 = this.configure.configure;
            if (bArr2 == null) {
                bArr = null;
            } else {
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                bArr = bArr3;
            }
            sHA3_384withRSA.cca_continue(true, new CipherSpi.PKCS1v1_5Padding_PublicOnly(Cardinal2, bArr));
            return;
        }
        this.init.cca_continue(true, Cardinal2);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte b) throws SignatureException {
        this.init.init.cca_continue(b);
    }

    /* access modifiers changed from: protected */
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.init.init.init(bArr, i, i2);
    }
}
