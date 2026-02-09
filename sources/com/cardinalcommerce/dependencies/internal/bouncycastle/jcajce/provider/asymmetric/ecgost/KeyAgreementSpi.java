package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOST3410Util;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.hasFailure;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private byte[] cleanup;
    private String configure;
    private KeyFactorySpi.EDDSA init;
    private hasFailure onCReqSuccess;

    public static class ECVKO extends KeyAgreementSpi {
        public ECVKO() {
            super("ECGOST3410", new hasFailure(new KeyAgreementSpi.ECKAEGwithSHA256KDF()), (GMCipherSpi.SM2withSha512) null);
        }
    }

    static {
        new GMCipherSpi.ErasableOutputStream();
    }

    protected KeyAgreementSpi(String str, hasFailure hasfailure, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
        this.configure = str;
        this.onCReqSuccess = hasfailure;
    }

    public final byte[] Cardinal() {
        return this.cleanup;
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        init(key, (AlgorithmParameterSpec) null);
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof com.cardinalcommerce.a.BaseAgreementSpi)) {
            init(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }

    /* access modifiers changed from: protected */
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        GMCipherSpi.SM2withRMD sM2withRMD;
        if (this.init == null) {
            throw new IllegalStateException(new StringBuilder().append(this.configure).append(" not initialised.").toString());
        } else if (!z) {
            throw new IllegalStateException(new StringBuilder().append(this.configure).append(" can only be between two parties.").toString());
        } else if (key instanceof PublicKey) {
            PublicKey publicKey = (PublicKey) key;
            if (publicKey instanceof BCECPublicKey) {
                sM2withRMD = ((BCECGOST3410PublicKey) publicKey).getInstance;
            } else {
                sM2withRMD = ECUtil.init(publicKey);
            }
            try {
                this.cleanup = this.onCReqSuccess.cca_continue(sM2withRMD);
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException(new StringBuilder("calculation failed: ").append(e.getMessage()).toString()) {
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else {
            StringBuilder append = new StringBuilder().append(this.configure).append(" key agreement requires ");
            String name = ExtendedInvalidKeySpecException.class.getName();
            throw new InvalidKeyException(append.append(name.substring(name.lastIndexOf(46) + 1)).append(" for doPhase").toString());
        }
    }

    private void init(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        byte[] bArr;
        byte[] bArr2;
        if (key instanceof PrivateKey) {
            KeyPairGeneratorSpi.EdDSA edDSA = (KeyPairGeneratorSpi.EdDSA) ECUtil.Cardinal((PrivateKey) key);
            this.init = edDSA.Cardinal;
            if (!(algorithmParameterSpec instanceof com.cardinalcommerce.a.BaseAgreementSpi) || (bArr2 = ((com.cardinalcommerce.a.BaseAgreementSpi) algorithmParameterSpec).configure) == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            }
            this.getInstance = bArr;
            this.onCReqSuccess.configure(new DigestSignatureSpi.MD2(edDSA, this.getInstance));
            return;
        }
        StringBuilder append = new StringBuilder().append(this.configure).append(" key agreement requires ");
        String name = GOST3410Util.class.getName();
        throw new InvalidKeyException(append.append(name.substring(name.lastIndexOf(46) + 1)).append(" for initialisation").toString());
    }
}
