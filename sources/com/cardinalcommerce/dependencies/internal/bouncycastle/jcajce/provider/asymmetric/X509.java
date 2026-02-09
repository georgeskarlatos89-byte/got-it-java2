package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;

public class X509 {

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("KeyFactory.X.509", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509.KeyFactory");
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.X509", "X.509");
            sHA512_224withRSA.configure("CertificateFactory.X.509", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory");
            sHA512_224withRSA.configure("Alg.Alias.CertificateFactory.X509", "X.509");
        }
    }
}
