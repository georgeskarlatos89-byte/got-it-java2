package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi;

public class ECGOST {

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("KeyFactory.ECGOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.GOST-3410-2001", "ECGOST3410");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.ECGOST-3410", "ECGOST3410");
            init(sHA512_224withRSA, IES.onValidated, "ECGOST3410", new KeyFactorySpi());
            init(sHA512_224withRSA, IES.getString, "ECGOST3410", new KeyFactorySpi());
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(IES.onValidated)), "ECGOST3410");
            sHA512_224withRSA.configure("KeyPairGenerator.ECGOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyPairGeneratorSpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.ECGOST-3410", "ECGOST3410");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.GOST-3410-2001", "ECGOST3410");
            sHA512_224withRSA.configure("Signature.ECGOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi");
            sHA512_224withRSA.configure("Alg.Alias.Signature.ECGOST-3410", "ECGOST3410");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST-3410-2001", "ECGOST3410");
            sHA512_224withRSA.configure("KeyAgreement.ECGOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi$ECVKO");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.KeyAgreement.").append(IES.onValidated).toString(), "ECGOST3410");
            sHA512_224withRSA.configure("Alg.Alias.KeyAgreement.GOST-3410-2001", "ECGOST3410");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.KeyAgreement.").append(IES.CardinalChallengeObserver).toString(), "ECGOST3410");
            sHA512_224withRSA.configure("AlgorithmParameters.ECGOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.AlgorithmParametersSpi");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.GOST-3410-2001", "ECGOST3410");
            cca_continue(sHA512_224withRSA, "GOST3411", "ECGOST3410", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost.SignatureSpi", IES.onCReqSuccess);
            sHA512_224withRSA.configure("KeyFactory.ECGOST3410-2012", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.GOST-3410-2012", "ECGOST3410-2012");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.ECGOST-3410-2012", "ECGOST3410-2012");
            init(sHA512_224withRSA, KeyAgreementSpi.DHwithSHA224CKDF.Cardinal, "ECGOST3410-2012", new com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            init(sHA512_224withRSA, KeyAgreementSpi.DHwithSHA224CKDF.onValidated, "ECGOST3410-2012", new com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(KeyAgreementSpi.DHwithSHA224CKDF.Cardinal)), "ECGOST3410-2012");
            init(sHA512_224withRSA, KeyAgreementSpi.DHwithSHA224CKDF.getInstance, "ECGOST3410-2012", new com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            init(sHA512_224withRSA, KeyAgreementSpi.DHwithSHA224CKDF.getWarnings, "ECGOST3410-2012", new com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(KeyAgreementSpi.DHwithSHA224CKDF.getInstance)), "ECGOST3410-2012");
            sHA512_224withRSA.configure("KeyPairGenerator.ECGOST3410-2012", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyPairGeneratorSpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.ECGOST3410-2012", "ECGOST3410-2012");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.GOST-3410-2012", "ECGOST3410-2012");
            sHA512_224withRSA.configure("Signature.ECGOST3410-2012-256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256");
            sHA512_224withRSA.configure("Alg.Alias.Signature.ECGOST3410-2012-256", "ECGOST3410-2012-256");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST-3410-2012-256", "ECGOST3410-2012-256");
            cca_continue(sHA512_224withRSA, "GOST3411-2012-256", "ECGOST3410-2012-256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi256", KeyAgreementSpi.DHwithSHA224CKDF.getSDKVersion);
            sHA512_224withRSA.configure("Signature.ECGOST3410-2012-512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512");
            sHA512_224withRSA.configure("Alg.Alias.Signature.ECGOST3410-2012-512", "ECGOST3410-2012-512");
            sHA512_224withRSA.configure("Alg.Alias.Signature.GOST-3410-2012-512", "ECGOST3410-2012-512");
            cca_continue(sHA512_224withRSA, "GOST3411-2012-512", "ECGOST3410-2012-512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.ECGOST2012SignatureSpi512", KeyAgreementSpi.DHwithSHA224CKDF.cleanup);
            sHA512_224withRSA.configure("KeyAgreement.ECGOST3410-2012-256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO256");
            sHA512_224withRSA.configure("KeyAgreement.ECGOST3410-2012-512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi$ECVKO512");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.KeyAgreement.").append(KeyAgreementSpi.DHwithSHA224CKDF.onValidated).toString(), "ECGOST3410-2012-256");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.KeyAgreement.").append(KeyAgreementSpi.DHwithSHA224CKDF.getWarnings).toString(), "ECGOST3410-2012-512");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.KeyAgreement.").append(KeyAgreementSpi.DHwithSHA224CKDF.Cardinal).toString(), "ECGOST3410-2012-256");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.KeyAgreement.").append(KeyAgreementSpi.DHwithSHA224CKDF.getInstance).toString(), "ECGOST3410-2012-512");
        }
    }
}
