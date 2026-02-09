package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.AlgorithmParametersSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import java.util.HashMap;
import java.util.Map;

public class GM {
    private static final Map<String, String> Cardinal;

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("Signature.SHA256WITHSM2", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sha256WithSM2");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(AlgorithmParametersSpi.CardinalChallengeObserver).toString(), "SHA256WITHSM2");
            sHA512_224withRSA.configure("Signature.SM3WITHSM2", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(AlgorithmParametersSpi.getActionCode).toString(), "SM3WITHSM2");
            sHA512_224withRSA.configure("Cipher.SM2", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.SM2WITHSM3", "SM2");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.init).toString(), "SM2");
            sHA512_224withRSA.configure("Cipher.SM2WITHBLAKE2B", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.valueOf).toString(), "SM2WITHBLAKE2B");
            sHA512_224withRSA.configure("Cipher.SM2WITHBLAKE2S", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.CardinalRenderType).toString(), "SM2WITHBLAKE2S");
            sHA512_224withRSA.configure("Cipher.SM2WITHWHIRLPOOL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.CardinalEnvironment).toString(), "SM2WITHWHIRLPOOL");
            sHA512_224withRSA.configure("Cipher.SM2WITHMD5", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.values).toString(), "SM2WITHMD5");
            sHA512_224withRSA.configure("Cipher.SM2WITHRIPEMD160", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.CardinalError).toString(), "SM2WITHRIPEMD160");
            sHA512_224withRSA.configure("Cipher.SM2WITHSHA1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.getSDKVersion).toString(), "SM2WITHSHA1");
            sHA512_224withRSA.configure("Cipher.SM2WITHSHA224", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.cleanup).toString(), "SM2WITHSHA224");
            sHA512_224withRSA.configure("Cipher.SM2WITHSHA256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.getWarnings).toString(), "SM2WITHSHA256");
            sHA512_224withRSA.configure("Cipher.SM2WITHSHA384", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.onValidated).toString(), "SM2WITHSHA384");
            sHA512_224withRSA.configure("Cipher.SM2WITHSHA512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512");
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Cipher.").append(AlgorithmParametersSpi.onCReqSuccess).toString(), "SM2WITHSHA512");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        Cardinal = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
