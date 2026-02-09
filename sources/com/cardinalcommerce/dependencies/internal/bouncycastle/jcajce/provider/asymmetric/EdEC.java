package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import java.util.HashMap;
import java.util.Map;

public class EdEC {
    private static final Map<String, String> getInstance;

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("KeyFactory.XDH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$XDH");
            sHA512_224withRSA.configure("KeyFactory.X448", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X448");
            sHA512_224withRSA.configure("KeyFactory.X25519", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$X25519");
            sHA512_224withRSA.configure("KeyFactory.EDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$EDDSA");
            sHA512_224withRSA.configure("KeyFactory.ED448", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED448");
            sHA512_224withRSA.configure("KeyFactory.ED25519", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi$ED25519");
            sHA512_224withRSA.configure("Signature.EDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$EdDSA");
            sHA512_224withRSA.configure("Signature.ED448", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
            sHA512_224withRSA.configure("Signature.ED25519", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
            sHA512_224withRSA.init("Signature", X509.Mappings.init, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed448");
            sHA512_224withRSA.init("Signature", X509.Mappings.cca_continue, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.SignatureSpi$Ed25519");
            sHA512_224withRSA.configure("KeyPairGenerator.EDDSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$EdDSA");
            sHA512_224withRSA.configure("KeyPairGenerator.ED448", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            sHA512_224withRSA.configure("KeyPairGenerator.ED25519", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            sHA512_224withRSA.init("KeyPairGenerator", X509.Mappings.init, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed448");
            sHA512_224withRSA.init("KeyPairGenerator", X509.Mappings.cca_continue, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$Ed25519");
            sHA512_224withRSA.configure("KeyAgreement.XDH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$XDH");
            sHA512_224withRSA.configure("KeyAgreement.X448", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            sHA512_224withRSA.configure("KeyAgreement.X25519", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            sHA512_224withRSA.init("KeyAgreement", X509.Mappings.configure, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448");
            sHA512_224withRSA.init("KeyAgreement", X509.Mappings.Cardinal, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519");
            sHA512_224withRSA.configure("KeyAgreement.X25519WITHSHA256CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256CKDF");
            sHA512_224withRSA.configure("KeyAgreement.X25519WITHSHA384CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA384CKDF");
            sHA512_224withRSA.configure("KeyAgreement.X25519WITHSHA512CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA512CKDF");
            sHA512_224withRSA.configure("KeyAgreement.X448WITHSHA256CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA256CKDF");
            sHA512_224withRSA.configure("KeyAgreement.X448WITHSHA384CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA384CKDF");
            sHA512_224withRSA.configure("KeyAgreement.X448WITHSHA512CKDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512CKDF");
            sHA512_224withRSA.configure("KeyAgreement.X25519WITHSHA256KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519withSHA256KDF");
            sHA512_224withRSA.configure("KeyAgreement.X448WITHSHA512KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448withSHA512KDF");
            sHA512_224withRSA.configure("KeyAgreement.X25519UWITHSHA256KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X25519UwithSHA256KDF");
            sHA512_224withRSA.configure("KeyAgreement.X448UWITHSHA512KDF", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi$X448UwithSHA512KDF");
            sHA512_224withRSA.configure("KeyPairGenerator.XDH", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$XDH");
            sHA512_224withRSA.configure("KeyPairGenerator.X448", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X448");
            sHA512_224withRSA.configure("KeyPairGenerator.X25519", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpi$X25519");
            sHA512_224withRSA.init("KeyPairGenerator", X509.Mappings.configure, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpiSpi$X448");
            sHA512_224withRSA.init("KeyPairGenerator", X509.Mappings.Cardinal, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec.KeyPairGeneratorSpiSpi$X25519");
            init(sHA512_224withRSA, X509.Mappings.configure, "XDH", new KeyFactorySpi.X448());
            init(sHA512_224withRSA, X509.Mappings.Cardinal, "XDH", new KeyFactorySpi.X25519());
            init(sHA512_224withRSA, X509.Mappings.init, "EDDSA", new KeyFactorySpi.ED448());
            init(sHA512_224withRSA, X509.Mappings.cca_continue, "EDDSA", new KeyFactorySpi.ED25519());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        getInstance = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
