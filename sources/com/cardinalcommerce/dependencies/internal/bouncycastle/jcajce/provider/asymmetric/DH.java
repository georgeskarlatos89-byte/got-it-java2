package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi;
import java.util.HashMap;
import java.util.Map;

public class DH {
    /* access modifiers changed from: private */
    public static final Map<String, String> configure;

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("KeyPairGenerator.DH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
            sHA512_224withRSA.cca_continue("KeyAgreement.DH", (Map<String, String>) DH.configure);
            sHA512_224withRSA.configure("KeyAgreement.DH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
            sHA512_224withRSA.init("KeyAgreement", KeyAgreementSpi.DHUwithSHA224CKDF.getXid, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
            sHA512_224withRSA.init("KeyAgreement", KeyAgreementSpi.DHUwithSHA224CKDF.getCavv, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithRFC2631KDF");
            sHA512_224withRSA.configure("KeyFactory.DH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
            sHA512_224withRSA.configure("AlgorithmParameters.DH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
            sHA512_224withRSA.configure("AlgorithmParameterGenerator.DH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
            sHA512_224withRSA.configure("Cipher.IES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
            sHA512_224withRSA.configure("Cipher.IESwithAES-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            sHA512_224withRSA.configure("Cipher.IESWITHAES-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            sHA512_224withRSA.configure("Cipher.IESWITHDESEDE-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
            sHA512_224withRSA.configure("Cipher.DHIES", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
            sHA512_224withRSA.configure("Cipher.DHIESwithAES-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            sHA512_224withRSA.configure("Cipher.DHIESWITHAES-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAESCBC");
            sHA512_224withRSA.configure("Cipher.DHIESWITHDESEDE-CBC", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESedeCBC");
            sHA512_224withRSA.configure("KeyAgreement.DHWITHSHA1KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA1KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHWITHSHA224KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA224KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHWITHSHA256KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA256KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHWITHSHA384KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA384KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHWITHSHA512KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHwithSHA512KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA1KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA224KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA256KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA384KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA512KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512KDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA1CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA1CKDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA224CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA224CKDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA256CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA256CKDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA384CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA384CKDF");
            sHA512_224withRSA.configure("KeyAgreement.DHUWITHSHA512CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$DHUwithSHA512CKDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA1KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1KDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA224KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224KDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA256KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256KDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA384KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384KDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA512KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512KDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA1CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA1CKDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA224CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA224CKDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA256CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA256CKDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA384CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA384CKDF");
            sHA512_224withRSA.configure("KeyAgreement.MQVWITHSHA512CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi$MQVwithSHA512CKDF");
            init(sHA512_224withRSA, KeyAgreementSpi.DHUwithSHA224CKDF.getActionCode, "DH", new KeyFactorySpi());
            init(sHA512_224withRSA, GMCipherSpi.SM2withMD5.getSignatureVerification, "DH", new KeyFactorySpi());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        configure = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
