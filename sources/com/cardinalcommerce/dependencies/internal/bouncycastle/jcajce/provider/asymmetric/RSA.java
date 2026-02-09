package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric;

import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X931SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import java.util.HashMap;
import java.util.Map;

public class RSA {
    /* access modifiers changed from: private */
    public static final Map<String, String> configure;

    static {
        HashMap hashMap = new HashMap();
        configure = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.interfaces.RSAPublicKey|javax.crypto.interfaces.RSAPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }

    public static class Mappings extends X931SignatureSpi.RIPEMD160WithRSAEncryption {
        private static void Cardinal(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA, String str, String str2) {
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("withRSA/X9.31").toString(), new StringBuilder().append(str).append("WITHRSA/X9.31").toString());
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("WithRSA/X9.31").toString(), new StringBuilder().append(str).append("WITHRSA/X9.31").toString());
            sHA512_224withRSA.configure(new StringBuilder("Signature.").append(str).append("WITHRSA/X9.31").toString(), str2);
        }

        private static void cca_continue(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            String obj = new StringBuilder().append(str).append("WITHRSA").toString();
            String obj2 = new StringBuilder().append(str).append("withRSA").toString();
            String obj3 = new StringBuilder().append(str).append("WithRSA").toString();
            String obj4 = new StringBuilder().append(str).append("/RSA").toString();
            String obj5 = new StringBuilder().append(str).append("WITHRSAENCRYPTION").toString();
            String obj6 = new StringBuilder().append(str).append("withRSAEncryption").toString();
            String obj7 = new StringBuilder().append(str).append("WithRSAEncryption").toString();
            sHA512_224withRSA.configure("Signature.".concat(String.valueOf(obj)), str2);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj2)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj3)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj5)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj6)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj7)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj4)), obj);
            if (aSN1ObjectIdentifier != null) {
                sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(aSN1ObjectIdentifier)), obj);
                sHA512_224withRSA.configure("Alg.Alias.Signature.OID.".concat(String.valueOf(aSN1ObjectIdentifier)), obj);
            }
        }

        private static void configure(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA, String str, String str2) {
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("withRSA/PSS").toString(), new StringBuilder().append(str).append("WITHRSAANDMGF1").toString());
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("WithRSA/PSS").toString(), new StringBuilder().append(str).append("WITHRSAANDMGF1").toString());
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("withRSAandMGF1").toString(), new StringBuilder().append(str).append("WITHRSAANDMGF1").toString());
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("WithRSAAndMGF1").toString(), new StringBuilder().append(str).append("WITHRSAANDMGF1").toString());
            sHA512_224withRSA.configure(new StringBuilder("Signature.").append(str).append("WITHRSAANDMGF1").toString(), str2);
        }

        private static void getInstance(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA, String str, String str2) {
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("withRSA/ISO9796-2").toString(), new StringBuilder().append(str).append("WITHRSA/ISO9796-2").toString());
            sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(str).append("WithRSA/ISO9796-2").toString(), new StringBuilder().append(str).append("WITHRSA/ISO9796-2").toString());
            sHA512_224withRSA.configure(new StringBuilder("Signature.").append(str).append("WITHRSA/ISO9796-2").toString(), str2);
        }

        public final void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA) {
            sHA512_224withRSA.configure("AlgorithmParameters.OAEP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
            sHA512_224withRSA.configure("AlgorithmParameters.PSS", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA3-224WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA3-256WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA3-384WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA3-512WITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
            sHA512_224withRSA.cca_continue("Cipher.RSA", (Map<String, String>) RSA.configure);
            sHA512_224withRSA.configure("Cipher.RSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            sHA512_224withRSA.configure("Cipher.RSA/RAW", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            sHA512_224withRSA.configure("Cipher.RSA/PKCS1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            sHA512_224withRSA.init("Cipher", KeyAgreementSpi.DHUwithSHA224CKDF.configure, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            sHA512_224withRSA.init("Cipher", DSASigner.noneDSA.d_, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            sHA512_224withRSA.configure("Cipher.RSA/1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
            sHA512_224withRSA.configure("Cipher.RSA/2", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
            sHA512_224withRSA.configure("Cipher.RSA/OAEP", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            sHA512_224withRSA.init("Cipher", KeyAgreementSpi.DHUwithSHA224CKDF.onValidated, "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            sHA512_224withRSA.configure("Cipher.RSA/ISO9796-1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.RSA//RAW", "RSA");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
            sHA512_224withRSA.configure("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
            sHA512_224withRSA.configure("KeyFactory.RSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            sHA512_224withRSA.configure("KeyPairGenerator.RSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            init(sHA512_224withRSA, KeyAgreementSpi.DHUwithSHA224CKDF.configure, "RSA", keyFactorySpi);
            init(sHA512_224withRSA, DSASigner.noneDSA.d_, "RSA", keyFactorySpi);
            init(sHA512_224withRSA, KeyAgreementSpi.DHUwithSHA224CKDF.onValidated, "RSA", keyFactorySpi);
            init(sHA512_224withRSA, KeyAgreementSpi.DHUwithSHA224CKDF.getSDKVersion, "RSA", keyFactorySpi);
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(KeyAgreementSpi.DHUwithSHA224CKDF.configure)), "RSA");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(DSASigner.noneDSA.d_)), "RSA");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(KeyAgreementSpi.DHUwithSHA224CKDF.onValidated)), "OAEP");
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(KeyAgreementSpi.DHUwithSHA224CKDF.getSDKVersion)), "PSS");
            sHA512_224withRSA.configure("Signature.RSASSA-PSS", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            sHA512_224withRSA.configure(new StringBuilder("Signature.").append(KeyAgreementSpi.DHUwithSHA224CKDF.getSDKVersion).toString(), "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            sHA512_224withRSA.configure(new StringBuilder("Signature.OID.").append(KeyAgreementSpi.DHUwithSHA224CKDF.getSDKVersion).toString(), "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            sHA512_224withRSA.configure("Signature.RSA", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
            sHA512_224withRSA.configure("Signature.RAWRSASSA-PSS", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
            sHA512_224withRSA.configure("Alg.Alias.Signature.RAWRSA", "RSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.NONEWITHRSA", "RSA");
            sHA512_224withRSA.configure("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
            sHA512_224withRSA.configure("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
            sHA512_224withRSA.configure("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
            sHA512_224withRSA.configure("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
            sHA512_224withRSA.configure("Alg.Alias.Signature.RSAPSS", "RSASSA-PSS");
            configure(sHA512_224withRSA, "SHA224", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
            configure(sHA512_224withRSA, "SHA256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
            configure(sHA512_224withRSA, "SHA384", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
            configure(sHA512_224withRSA, "SHA512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
            configure(sHA512_224withRSA, "SHA512(224)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
            configure(sHA512_224withRSA, "SHA512(256)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
            configure(sHA512_224withRSA, "SHA3-224", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
            configure(sHA512_224withRSA, "SHA3-256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
            configure(sHA512_224withRSA, "SHA3-384", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
            configure(sHA512_224withRSA, "SHA3-512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
            if (sHA512_224withRSA.Cardinal("MessageDigest", "MD2")) {
                cca_continue(sHA512_224withRSA, "MD2", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", KeyAgreementSpi.DHUwithSHA224CKDF.getInstance);
            }
            if (sHA512_224withRSA.Cardinal("MessageDigest", "MD4")) {
                cca_continue(sHA512_224withRSA, "MD4", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", KeyAgreementSpi.DHUwithSHA224CKDF.Cardinal);
            }
            if (sHA512_224withRSA.Cardinal("MessageDigest", "MD5")) {
                cca_continue(sHA512_224withRSA, "MD5", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", KeyAgreementSpi.DHUwithSHA224CKDF.init);
                getInstance(sHA512_224withRSA, "MD5", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            }
            if (sHA512_224withRSA.Cardinal("MessageDigest", "SHA1")) {
                sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
                sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
                configure(sHA512_224withRSA, "SHA1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
                cca_continue(sHA512_224withRSA, "SHA1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", KeyAgreementSpi.DHUwithSHA224CKDF.cleanup);
                getInstance(sHA512_224withRSA, "SHA1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
                sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.").append(KeyAgreementSpi.DHUwithSHA1KDF.getWarnings).toString(), "SHA1WITHRSA");
                sHA512_224withRSA.configure(new StringBuilder("Alg.Alias.Signature.OID.").append(KeyAgreementSpi.DHUwithSHA1KDF.getWarnings).toString(), "SHA1WITHRSA");
                Cardinal(sHA512_224withRSA, "SHA1", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
            }
            cca_continue(sHA512_224withRSA, "SHA224", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", KeyAgreementSpi.DHUwithSHA224CKDF.CardinalRenderType);
            cca_continue(sHA512_224withRSA, "SHA256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", KeyAgreementSpi.DHUwithSHA224CKDF.values);
            cca_continue(sHA512_224withRSA, "SHA384", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", KeyAgreementSpi.DHUwithSHA224CKDF.valueOf);
            cca_continue(sHA512_224withRSA, "SHA512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", KeyAgreementSpi.DHUwithSHA224CKDF.CardinalError);
            cca_continue(sHA512_224withRSA, "SHA512(224)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", KeyAgreementSpi.DHUwithSHA224CKDF.CardinalEnvironment);
            cca_continue(sHA512_224withRSA, "SHA512(256)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", KeyAgreementSpi.DHUwithSHA224CKDF.CardinalUiType);
            cca_continue(sHA512_224withRSA, "SHA3-224", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", IESCipher.IESwithDESedeCBC.getEciFlag);
            cca_continue(sHA512_224withRSA, "SHA3-256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", IESCipher.IESwithDESedeCBC.isEnabledPaypal);
            cca_continue(sHA512_224withRSA, "SHA3-384", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", IESCipher.IESwithDESedeCBC.isEnabledDiscover);
            cca_continue(sHA512_224withRSA, "SHA3-512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", IESCipher.IESwithDESedeCBC.Payload);
            getInstance(sHA512_224withRSA, "SHA224", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
            getInstance(sHA512_224withRSA, "SHA256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
            getInstance(sHA512_224withRSA, "SHA384", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
            getInstance(sHA512_224withRSA, "SHA512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
            getInstance(sHA512_224withRSA, "SHA512(224)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
            getInstance(sHA512_224withRSA, "SHA512(256)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
            Cardinal(sHA512_224withRSA, "SHA224", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
            Cardinal(sHA512_224withRSA, "SHA256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
            Cardinal(sHA512_224withRSA, "SHA384", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
            Cardinal(sHA512_224withRSA, "SHA512", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
            Cardinal(sHA512_224withRSA, "SHA512(224)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
            Cardinal(sHA512_224withRSA, "SHA512(256)", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
            if (sHA512_224withRSA.Cardinal("MessageDigest", "RIPEMD128")) {
                cca_continue(sHA512_224withRSA, "RIPEMD128", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", KeyAgreementSpi.DHwithSHA384KDF.getSDKVersion);
                cca_continue(sHA512_224withRSA, "RMD128", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", (ASN1ObjectIdentifier) null);
                Cardinal(sHA512_224withRSA, "RMD128", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
                Cardinal(sHA512_224withRSA, "RIPEMD128", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            }
            if (sHA512_224withRSA.Cardinal("MessageDigest", "RIPEMD160")) {
                cca_continue(sHA512_224withRSA, "RIPEMD160", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", KeyAgreementSpi.DHwithSHA384KDF.onCReqSuccess);
                cca_continue(sHA512_224withRSA, "RMD160", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", (ASN1ObjectIdentifier) null);
                sHA512_224withRSA.configure("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
                sHA512_224withRSA.configure("Signature.RIPEMD160withRSA/ISO9796-2", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
                Cardinal(sHA512_224withRSA, "RMD160", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
                Cardinal(sHA512_224withRSA, "RIPEMD160", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            }
            if (sHA512_224withRSA.Cardinal("MessageDigest", "RIPEMD256")) {
                cca_continue(sHA512_224withRSA, "RIPEMD256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", KeyAgreementSpi.DHwithSHA384KDF.cleanup);
                cca_continue(sHA512_224withRSA, "RMD256", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", (ASN1ObjectIdentifier) null);
            }
            if (sHA512_224withRSA.Cardinal("MessageDigest", "WHIRLPOOL")) {
                getInstance(sHA512_224withRSA, "Whirlpool", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                getInstance(sHA512_224withRSA, "WHIRLPOOL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                Cardinal(sHA512_224withRSA, "Whirlpool", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
                Cardinal(sHA512_224withRSA, "WHIRLPOOL", "com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            }
        }
    }
}
