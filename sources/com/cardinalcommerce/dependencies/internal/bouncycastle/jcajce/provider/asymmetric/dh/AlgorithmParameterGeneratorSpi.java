package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    private SecureRandom Cardinal;
    private int cca_continue = 0;
    private int init = 2048;

    /* access modifiers changed from: protected */
    public void engineInit(int i, SecureRandom secureRandom) {
        this.init = i;
        this.Cardinal = secureRandom;
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.init = dHGenParameterSpec.getPrimeSize();
            this.cca_continue = dHGenParameterSpec.getExponentSize();
            this.Cardinal = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGenerateParameters() {
        SignatureSpi.ecDetDSASha3_224 ecdetdsasha3_224 = new SignatureSpi.ecDetDSASha3_224();
        int cca_continue2 = PrimeCertaintyCalculator.cca_continue(this.init);
        SecureRandom secureRandom = this.Cardinal;
        if (secureRandom != null) {
            ecdetdsasha3_224.init = this.init;
            ecdetdsasha3_224.getInstance = cca_continue2;
            ecdetdsasha3_224.cca_continue = secureRandom;
        } else {
            int i = this.init;
            SecureRandom configure = GMCipherSpi.SM2withWhirlpool.configure();
            ecdetdsasha3_224.init = i;
            ecdetdsasha3_224.getInstance = cca_continue2;
            ecdetdsasha3_224.cca_continue = configure;
        }
        KeyAgreementSpi.X25519withSHA256CKDF configure2 = ecdetdsasha3_224.configure();
        try {
            AlgorithmParameters cca_continue3 = cca_continue("DH");
            cca_continue3.init(new DHParameterSpec(configure2.Cardinal, configure2.init, this.cca_continue));
            return cca_continue3;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
