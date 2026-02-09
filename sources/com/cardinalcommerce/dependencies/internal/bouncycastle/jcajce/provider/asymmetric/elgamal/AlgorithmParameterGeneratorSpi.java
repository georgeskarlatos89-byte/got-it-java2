package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.BCECGOST3410PrivateKey;
import com.cardinalcommerce.a.BCElGamalPrivateKey;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    private SecureRandom Cardinal;
    private int configure = 1024;
    private int getInstance = 0;

    /* access modifiers changed from: protected */
    public void engineInit(int i, SecureRandom secureRandom) {
        this.configure = i;
        this.Cardinal = secureRandom;
    }

    /* access modifiers changed from: protected */
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.configure = dHGenParameterSpec.getPrimeSize();
            this.getInstance = dHGenParameterSpec.getExponentSize();
            this.Cardinal = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGenerateParameters() {
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = new BCECGOST3410PrivateKey();
        SecureRandom secureRandom = this.Cardinal;
        if (secureRandom != null) {
            bCECGOST3410PrivateKey.configure = this.configure;
            bCECGOST3410PrivateKey.getInstance = 20;
            bCECGOST3410PrivateKey.Cardinal = secureRandom;
        } else {
            int i = this.configure;
            SecureRandom configure2 = GMCipherSpi.SM2withWhirlpool.configure();
            bCECGOST3410PrivateKey.configure = i;
            bCECGOST3410PrivateKey.getInstance = 20;
            bCECGOST3410PrivateKey.Cardinal = configure2;
        }
        BCElGamalPrivateKey Cardinal2 = bCECGOST3410PrivateKey.Cardinal();
        try {
            AlgorithmParameters cca_continue = cca_continue("ElGamal");
            cca_continue.init(new DHParameterSpec(Cardinal2.init, Cardinal2.getInstance, this.getInstance));
            return cca_continue;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
