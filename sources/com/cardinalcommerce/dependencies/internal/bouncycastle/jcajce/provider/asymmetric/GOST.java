package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi;

public class GOST {

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("KeyPairGenerator.GOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost.KeyPairGeneratorSpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.GOST-3410", "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.GOST-3410-94", "GOST3410");
            sHA512_224withRSA.configure("KeyFactory.GOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.GOST-3410", "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.GOST-3410-94", "GOST3410");
            sHA512_224withRSA.configure("AlgorithmParameters.GOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParametersSpi");
            sHA512_224withRSA.configure("AlgorithmParameterGenerator.GOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost.AlgorithmParameterGeneratorSpi");
            init(sHA512_224withRSA, IES.getSDKVersion, "GOST3410", new KeyFactorySpi());
            init(sHA512_224withRSA, IES.getSDKVersion, "GOST3410");
            sHA512_224withRSA.configure("Signature.GOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.gost.SignatureSpi");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST-3410", "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST-3410-94", "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST3411withGOST3410", "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST3411WITHGOST3410", "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST3411WithGOST3410", "GOST3410");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(IES.cleanup).toString(), "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameterGenerator.GOST-3410", "GOST3410");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.GOST-3410", "GOST3410");
        }
    }
}
