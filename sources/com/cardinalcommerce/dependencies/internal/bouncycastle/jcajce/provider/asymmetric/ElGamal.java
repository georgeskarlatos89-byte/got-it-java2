package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi;

public class ElGamal {

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("AlgorithmParameterGenerator.ELGAMAL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
            sHA512_224withRSA.configure("AlgorithmParameterGenerator.ElGamal", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParameterGeneratorSpi");
            sHA512_224withRSA.configure("AlgorithmParameters.ELGAMAL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
            sHA512_224withRSA.configure("AlgorithmParameters.ElGamal", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.AlgorithmParametersSpi");
            sHA512_224withRSA.configure("Cipher.ELGAMAL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
            sHA512_224withRSA.configure("Cipher.ElGamal", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$NoPadding");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.ELGAMAL/ECB/PKCS1PADDING", "ELGAMAL/PKCS1");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.ELGAMAL/NONE/PKCS1PADDING", "ELGAMAL/PKCS1");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.ELGAMAL/NONE/NOPADDING", "ELGAMAL");
            sHA512_224withRSA.configure("Cipher.ELGAMAL/PKCS1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.CipherSpi$PKCS1v1_5Padding");
            sHA512_224withRSA.configure("KeyFactory.ELGAMAL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
            sHA512_224withRSA.configure("KeyFactory.ElGamal", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi");
            sHA512_224withRSA.configure("KeyPairGenerator.ELGAMAL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
            sHA512_224withRSA.configure("KeyPairGenerator.ElGamal", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyPairGeneratorSpi");
            init(sHA512_224withRSA, KeyAgreementSpi.DHUwithSHA1KDF.cleanup, "ELGAMAL", new KeyFactorySpi());
            init(sHA512_224withRSA, KeyAgreementSpi.DHUwithSHA1KDF.cleanup, "ELGAMAL");
        }
    }
}
