package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi;

public class DSTU4145 {

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("KeyFactory.DSTU4145", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.DSTU-4145-2002", "DSTU4145");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.DSTU4145-3410", "DSTU4145");
            init(sHA512_224withRSA, KeyAgreementSpi.DHwithSHA512KDF.Cardinal, "DSTU4145", new KeyFactorySpi());
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(KeyAgreementSpi.DHwithSHA512KDF.Cardinal)), "DSTU4145");
            init(sHA512_224withRSA, KeyAgreementSpi.DHwithSHA512KDF.cca_continue, "DSTU4145", new KeyFactorySpi());
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(KeyAgreementSpi.DHwithSHA512KDF.cca_continue)), "DSTU4145");
            sHA512_224withRSA.configure("KeyPairGenerator.DSTU4145", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.DSTU-4145", "DSTU4145");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.DSTU-4145-2002", "DSTU4145");
            sHA512_224withRSA.configure("Signature.DSTU4145", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
            sHA512_224withRSA.configure("Alg.Alias.Signature.DSTU-4145", "DSTU4145");
            sHA512_224withRSA.configure("Alg.Alias.Signature.DSTU-4145-2002", "DSTU4145");
            cca_continue(sHA512_224withRSA, "GOST3411", "DSTU4145LE", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe", KeyAgreementSpi.DHwithSHA512KDF.Cardinal);
            cca_continue(sHA512_224withRSA, "GOST3411", "DSTU4145", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi", KeyAgreementSpi.DHwithSHA512KDF.cca_continue);
        }
    }
}
