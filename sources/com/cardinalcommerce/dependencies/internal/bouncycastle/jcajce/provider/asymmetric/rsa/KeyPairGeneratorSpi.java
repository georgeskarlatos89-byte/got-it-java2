package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa;

import com.cardinalcommerce.a.BCECGOST3410PublicKey;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;

public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static BigInteger configure = BigInteger.valueOf(65537);
    private BCECGOST3410PublicKey Cardinal = new BCECGOST3410PublicKey();
    private DigestSignatureSpi.SHA224 cca_continue;

    public KeyPairGeneratorSpi() {
        super("RSA");
        DigestSignatureSpi.SHA224 sha224 = new DigestSignatureSpi.SHA224(configure, GMCipherSpi.SM2withWhirlpool.configure(), 2048, PrimeCertaintyCalculator.cca_continue(2048));
        this.cca_continue = sha224;
        DigestSignatureSpi.SHA224 sha2242 = sha224;
        this.Cardinal.Cardinal = sha224;
    }

    public void initialize(int i, SecureRandom secureRandom) {
        DigestSignatureSpi.SHA224 sha224 = new DigestSignatureSpi.SHA224(configure, secureRandom, i, PrimeCertaintyCalculator.cca_continue(i));
        this.cca_continue = sha224;
        DigestSignatureSpi.SHA224 sha2242 = sha224;
        this.Cardinal.Cardinal = sha224;
    }

    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof RSAKeyGenParameterSpec) {
            RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
            DigestSignatureSpi.SHA224 sha224 = new DigestSignatureSpi.SHA224(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), PrimeCertaintyCalculator.cca_continue(2048));
            this.cca_continue = sha224;
            DigestSignatureSpi.SHA224 sha2242 = sha224;
            this.Cardinal.Cardinal = sha224;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
    }

    public KeyPair generateKeyPair() {
        PSSSignatureSpi.SHA256withRSA init = this.Cardinal.init();
        return new KeyPair(new BCRSAPublicKey((DigestSignatureSpi.SHA256) init.getInstance), new BCRSAPrivateCrtKey((DigestSignatureSpi.RIPEMD256) init.init));
    }
}
