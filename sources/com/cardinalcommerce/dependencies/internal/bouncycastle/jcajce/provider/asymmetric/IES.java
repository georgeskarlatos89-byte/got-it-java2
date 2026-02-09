package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;

public class IES {

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("AlgorithmParameters.IES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ies.AlgorithmParametersSpi");
            sHA512_224withRSA.configure("AlgorithmParameters.ECIES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ies.AlgorithmParametersSpi");
        }
    }
}
