package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal;

import com.cardinalcommerce.a.AsymmetricKeyInfoConverter;
import com.cardinalcommerce.a.BCECGOST3410PrivateKey;
import com.cardinalcommerce.a.BCElGamalPrivateKey;
import com.cardinalcommerce.a.BCGOST3410PrivateKey;
import com.cardinalcommerce.a.ElGamalUtil;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyFactory;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.Utils;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private SecureRandom Cardinal = GMCipherSpi.SM2withWhirlpool.configure();
    private int cca_continue = 20;
    private boolean cleanup = false;
    private int configure = 1024;
    private Utils getInstance;
    private SignatureSpi.ecNR512 init = new SignatureSpi.ecNR512();

    public KeyPairGeneratorSpi() {
        super("ElGamal");
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.configure = i;
        this.Cardinal = secureRandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        Utils utils;
        boolean z = algorithmParameterSpec instanceof AsymmetricKeyInfoConverter;
        if (z || (algorithmParameterSpec instanceof DHParameterSpec)) {
            if (z) {
                AsymmetricKeyInfoConverter asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) algorithmParameterSpec;
                utils = new Utils(secureRandom, new BCElGamalPrivateKey(asymmetricKeyInfoConverter.Cardinal, asymmetricKeyInfoConverter.configure));
            } else {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                utils = new Utils(secureRandom, new BCElGamalPrivateKey(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
            }
            this.getInstance = utils;
            SignatureSpi.ecNR512 ecnr512 = this.init;
            Utils utils2 = this.getInstance;
            Utils utils3 = utils2;
            ecnr512.Cardinal = utils2;
            this.cleanup = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec or an ElGamalParameterSpec");
    }

    public KeyPair generateKeyPair() {
        if (!this.cleanup) {
            DHParameterSpec configure2 = KeyFactory.init.configure(this.configure);
            if (configure2 != null) {
                this.getInstance = new Utils(this.Cardinal, new BCElGamalPrivateKey(configure2.getP(), configure2.getG(), configure2.getL()));
            } else {
                BCECGOST3410PrivateKey bCECGOST3410PrivateKey = new BCECGOST3410PrivateKey();
                int i = this.configure;
                int i2 = this.cca_continue;
                SecureRandom secureRandom = this.Cardinal;
                bCECGOST3410PrivateKey.configure = i;
                bCECGOST3410PrivateKey.getInstance = i2;
                bCECGOST3410PrivateKey.Cardinal = secureRandom;
                this.getInstance = new Utils(this.Cardinal, bCECGOST3410PrivateKey.Cardinal());
            }
            SignatureSpi.ecNR512 ecnr512 = this.init;
            Utils utils = this.getInstance;
            Utils utils2 = utils;
            ecnr512.Cardinal = utils;
            this.cleanup = true;
        }
        PSSSignatureSpi.SHA256withRSA init2 = this.init.init();
        return new KeyPair(new BCElGamalPublicKey((BCGOST3410PrivateKey) init2.getInstance), new BCElGamalPrivateKey((ElGamalUtil) init2.init));
    }
}
