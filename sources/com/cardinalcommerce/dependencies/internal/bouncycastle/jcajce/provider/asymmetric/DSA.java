package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi;

public class DSA {

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("AlgorithmParameters.DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParametersSpi");
            sHA512_224withRSA.configure("AlgorithmParameterGenerator.DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.AlgorithmParameterGeneratorSpi");
            sHA512_224withRSA.configure("KeyPairGenerator.DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.KeyPairGeneratorSpi");
            sHA512_224withRSA.configure("KeyFactory.DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi");
            sHA512_224withRSA.configure("Signature.DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$stdDSA");
            sHA512_224withRSA.configure("Signature.NONEWITHDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$noneDSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.RAWDSA", "NONEWITHDSA");
            sHA512_224withRSA.configure("Signature.DETDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            sHA512_224withRSA.configure("Signature.SHA1WITHDETDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            sHA512_224withRSA.configure("Signature.SHA224WITHDETDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
            sHA512_224withRSA.configure("Signature.SHA256WITHDETDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
            sHA512_224withRSA.configure("Signature.SHA384WITHDETDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
            sHA512_224withRSA.configure("Signature.SHA512WITHDETDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
            sHA512_224withRSA.configure("Signature.DDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            sHA512_224withRSA.configure("Signature.SHA1WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA");
            sHA512_224withRSA.configure("Signature.SHA224WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA224");
            sHA512_224withRSA.configure("Signature.SHA256WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA256");
            sHA512_224withRSA.configure("Signature.SHA384WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA384");
            sHA512_224withRSA.configure("Signature.SHA512WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSA512");
            sHA512_224withRSA.configure("Signature.SHA3-224WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_224");
            sHA512_224withRSA.configure("Signature.SHA3-256WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_256");
            sHA512_224withRSA.configure("Signature.SHA3-384WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_384");
            sHA512_224withRSA.configure("Signature.SHA3-512WITHDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$detDSASha3_512");
            cca_continue(sHA512_224withRSA, "SHA224", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa224", IESCipher.IESwithDESedeCBC.getThreeDSRequestorAppURL);
            cca_continue(sHA512_224withRSA, "SHA256", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa256", IESCipher.IESwithDESedeCBC.setThreeDSRequestorAppURL);
            cca_continue(sHA512_224withRSA, "SHA384", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa384", IESCipher.IESwithDESedeCBC.setEnableDFSync);
            cca_continue(sHA512_224withRSA, "SHA512", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsa512", IESCipher.IESwithDESedeCBC.setLocationDataConsentGiven);
            cca_continue(sHA512_224withRSA, "SHA3-224", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_224", IESCipher.IESwithDESedeCBC.setEnableLogging);
            cca_continue(sHA512_224withRSA, "SHA3-256", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_256", IESCipher.IESwithDESedeCBC.ExtendedData);
            cca_continue(sHA512_224withRSA, "SHA3-384", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_384", IESCipher.IESwithDESedeCBC.isLocationDataConsentGiven);
            cca_continue(sHA512_224withRSA, "SHA3-512", "DSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner$dsaSha3_512", IESCipher.IESwithDESedeCBC.getJSON);
            sHA512_224withRSA.configure("Alg.Alias.Signature.SHA/DSA", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.SHA1withDSA", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.SHA1WITHDSA", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.1", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.1.3.14.3.2.26with1.2.840.10040.4.3", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.DSAwithSHA1", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.DSAWITHSHA1", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.SHA1WithDSA", "DSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.DSAWithSHA1", "DSA");
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            for (int i = 0; i != DSAUtil.init.length; i++) {
                sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(DSAUtil.init[i]).toString(), "DSA");
                init(sHA512_224withRSA, DSAUtil.init[i], "DSA", keyFactorySpi);
                init(sHA512_224withRSA, DSAUtil.init[i], "DSA");
            }
        }
    }
}
