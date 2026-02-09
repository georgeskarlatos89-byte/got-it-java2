package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.ExtendedInvalidKeySpecException;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOST3410Util;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.hasFailure;
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
    private hasFailure cleanup;
    private KeyFactorySpi.EDDSA configure;
    private byte[] getSDKVersion;
    private String init;

    public static class ECVKO256 extends KeyAgreementSpi {
        public ECVKO256() {
            super("ECGOST3410-2012-256", new hasFailure(new KeyAgreementSpi.MQVwithSHA1KDFAndSharedInfo()), (GMCipherSpi.SM2withSha512) null);
        }
    }

    public static class ECVKO512 extends KeyAgreementSpi {
        public ECVKO512() {
            super("ECGOST3410-2012-512", new hasFailure(new KeyAgreementSpi.MQVwithSHA224KDFAndSharedInfo()), (GMCipherSpi.SM2withSha512) null);
        }
    }

    static {
        new GMCipherSpi.ErasableOutputStream();
    }

    protected KeyAgreementSpi(String str, hasFailure hasfailure, GMCipherSpi.SM2withSha512 sM2withSha512) {
        super(str, sM2withSha512);
        this.init = str;
        this.cleanup = hasfailure;
    }

    public final byte[] Cardinal() {
        return this.getSDKVersion;
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        configure(key, (AlgorithmParameterSpec) null);
    }

    /* access modifiers changed from: protected */
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof com.cardinalcommerce.a.BaseAgreementSpi)) {
            configure(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }

    /* access modifiers changed from: protected */
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        GMCipherSpi.SM2withRMD sM2withRMD;
        if (this.configure == null) {
            throw new IllegalStateException(new StringBuilder().append(this.init).append(" not initialised.").toString());
        } else if (!z) {
            throw new IllegalStateException(new StringBuilder().append(this.init).append(" can only be between two parties.").toString());
        } else if (key instanceof PublicKey) {
            PublicKey publicKey = (PublicKey) key;
            if (publicKey instanceof BCECGOST3410_2012PublicKey) {
                sM2withRMD = ((BCECGOST3410_2012PublicKey) publicKey).configure;
            } else {
                sM2withRMD = ECUtil.init(publicKey);
            }
            try {
                this.getSDKVersion = this.cleanup.cca_continue(sM2withRMD);
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException(new StringBuilder("calculation failed: ").append(e.getMessage()).toString()) {
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else {
            StringBuilder append = new StringBuilder().append(this.init).append(" key agreement requires ");
            String name = ExtendedInvalidKeySpecException.class.getName();
            throw new InvalidKeyException(append.append(name.substring(name.lastIndexOf(46) + 1)).append(" for doPhase").toString());
        }
    }

    private void configure(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        byte[] bArr;
        byte[] bArr2;
        if (key instanceof PrivateKey) {
            KeyPairGeneratorSpi.EdDSA edDSA = (KeyPairGeneratorSpi.EdDSA) ECUtil.Cardinal((PrivateKey) key);
            this.configure = edDSA.Cardinal;
            if (!(algorithmParameterSpec instanceof com.cardinalcommerce.a.BaseAgreementSpi) || (bArr2 = ((com.cardinalcommerce.a.BaseAgreementSpi) algorithmParameterSpec).configure) == null) {
                bArr = null;
            } else {
                bArr = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            }
            this.getInstance = bArr;
            this.cleanup.configure(new DigestSignatureSpi.MD2(edDSA, this.getInstance));
            return;
        }
        StringBuilder append = new StringBuilder().append(this.init).append(" key agreement requires ");
        String name = GOST3410Util.class.getName();
        throw new InvalidKeyException(append.append(name.substring(name.lastIndexOf(46) + 1)).append(" for initialisation").toString());
    }
}
