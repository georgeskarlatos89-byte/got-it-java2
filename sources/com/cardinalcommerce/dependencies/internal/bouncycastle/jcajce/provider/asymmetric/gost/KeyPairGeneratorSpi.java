package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost;

import com.cardinalcommerce.a.BCRSAPrivateKey;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.GOSTUtil;
import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.NHKeyFactorySpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.QTESLAKeyFactorySpi;
import com.cardinalcommerce.a.SignatureSpi;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private SignatureSpi.ecPlainDSARP160 Cardinal = new SignatureSpi.ecPlainDSARP160();
    private QTESLAKeyFactorySpi cca_continue;
    private SecureRandom configure = null;
    private CipherSpi.NoPadding getInstance;
    private boolean getWarnings = false;
    private int init = 1024;

    public KeyPairGeneratorSpi() {
        super("GOST3410");
    }

    public void initialize(int i, SecureRandom secureRandom) {
        this.init = i;
        this.configure = secureRandom;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof QTESLAKeyFactorySpi) {
            init((QTESLAKeyFactorySpi) algorithmParameterSpec, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a GOST3410ParameterSpec");
    }

    private void init(QTESLAKeyFactorySpi qTESLAKeyFactorySpi, SecureRandom secureRandom) {
        NHKeyFactorySpi nHKeyFactorySpi = qTESLAKeyFactorySpi.cca_continue;
        CipherSpi.NoPadding noPadding = new CipherSpi.NoPadding(secureRandom, new CipherSpi.PKCS1v1_5Padding(nHKeyFactorySpi.init, nHKeyFactorySpi.getInstance, nHKeyFactorySpi.configure));
        this.getInstance = noPadding;
        CipherSpi.NoPadding noPadding2 = noPadding;
        this.Cardinal.getInstance = noPadding;
        this.getWarnings = true;
        this.cca_continue = qTESLAKeyFactorySpi;
    }

    public KeyPair generateKeyPair() {
        if (!this.getWarnings) {
            init(new QTESLAKeyFactorySpi(IES.values.init), GMCipherSpi.SM2withWhirlpool.configure());
        }
        PSSSignatureSpi.SHA256withRSA init2 = this.Cardinal.init();
        return new KeyPair(new BCGOST3410PublicKey((BCRSAPrivateKey) init2.getInstance, this.cca_continue), new BCGOST3410PrivateKey((GOSTUtil) init2.init, this.cca_continue));
    }
}
