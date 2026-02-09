package com.cardinalcommerce.a;

import com.cardinalcommerce.a.IES;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.DHParameterSpec;

public abstract class X931SignatureSpi extends AlgorithmParametersSpi {

    public abstract class RIPEMD160WithRSAEncryption extends AlgorithmProvider {
        protected static void cca_continue(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            String obj = new StringBuilder().append(str).append("WITH").append(str2).toString();
            String obj2 = new StringBuilder().append(str).append("with").append(str2).toString();
            String obj3 = new StringBuilder().append(str).append("With").append(str2).toString();
            String obj4 = new StringBuilder().append(str).append("/").append(str2).toString();
            sHA512_224withRSA.configure("Signature.".concat(String.valueOf(obj)), str3);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj2)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj3)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(obj4)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.".concat(String.valueOf(aSN1ObjectIdentifier)), obj);
            sHA512_224withRSA.configure("Alg.Alias.Signature.OID.".concat(String.valueOf(aSN1ObjectIdentifier)), obj);
        }

        protected static void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameterGenerator.".concat(String.valueOf(aSN1ObjectIdentifier)), str);
            sHA512_224withRSA.configure("Alg.Alias.AlgorithmParameters.".concat(String.valueOf(aSN1ObjectIdentifier)), str);
        }

        protected static void init(PSSSignatureSpi.SHA512_224withRSA sHA512_224withRSA, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
            sHA512_224withRSA.configure("Alg.Alias.KeyFactory.".concat(String.valueOf(aSN1ObjectIdentifier)), str);
            sHA512_224withRSA.configure("Alg.Alias.KeyPairGenerator.".concat(String.valueOf(aSN1ObjectIdentifier)), str);
            sHA512_224withRSA.cca_continue(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    public final class SHA1WithRSAEncryption extends BadPaddingException {
        private final Throwable getInstance;

        public SHA1WithRSAEncryption(String str, Throwable th) {
            super(str);
            this.getInstance = th;
        }

        public final Throwable getCause() {
            return this.getInstance;
        }
    }

    public class SHA256WithRSAEncryption implements AlgorithmParameterSpec {
        public final PublicKey Cardinal;
        public final byte[] cca_continue;
        public final PublicKey configure;
        public final PrivateKey init;
    }

    public final class SHA384WithRSAEncryption extends ECParameterSpec {
        public final byte[] Cardinal;
        private final KeyFactorySpi.EDDSA init;

        public final boolean equals(Object obj) {
            if (obj instanceof SHA384WithRSAEncryption) {
                return this.init.equals(((SHA384WithRSAEncryption) obj).init);
            }
            return false;
        }

        public final int hashCode() {
            return this.init.hashCode();
        }
    }

    public final class SHA512_224WithRSAEncryption implements AlgorithmParameterSpec {
        public final String getInstance;
    }

    public final class SHA512_256WithRSAEncryption implements AlgorithmParameterSpec {
        public byte[] configure;
    }

    public final class WhirlpoolWithRSAEncryption extends DSABase {
        private static volatile Provider getInstance;

        public WhirlpoolWithRSAEncryption() {
            super(getInstance());
        }

        private static synchronized Provider getInstance() {
            synchronized (WhirlpoolWithRSAEncryption.class) {
                if (Security.getProvider("BC") != null) {
                    Provider provider = Security.getProvider("BC");
                    return provider;
                } else if (getInstance != null) {
                    Provider provider2 = getInstance;
                    return provider2;
                } else {
                    KeyFactory keyFactory = new KeyFactory();
                    getInstance = keyFactory;
                    return keyFactory;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract AlgorithmParameterSpec cca_continue(Class cls) throws InvalidParameterSpecException;

    /* access modifiers changed from: protected */
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return cca_continue(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    public final class RIPEMD128WithRSAEncryption {
        private static Set Cardinal = new HashSet();
        private static Set CardinalEnvironment = new HashSet();
        private static Map CardinalError = new HashMap();
        private static Set cca_continue = new HashSet();
        private static Set cleanup = new HashSet();
        private static Set configure = new HashSet();
        private static Set getInstance = new HashSet();
        private static Set getSDKVersion = new HashSet();
        private static Set getWarnings = new HashSet();
        private static Set init = new HashSet();
        private static Set onCReqSuccess = new HashSet();
        private static Set onValidated = new HashSet();
        private static Set valueOf = new HashSet();

        public static boolean Cardinal(String str, String str2) {
            if (configure.contains(str) && configure.contains(str2)) {
                return true;
            }
            if (getInstance.contains(str) && getInstance.contains(str2)) {
                return true;
            }
            if (init.contains(str) && init.contains(str2)) {
                return true;
            }
            if (cca_continue.contains(str) && cca_continue.contains(str2)) {
                return true;
            }
            if (getWarnings.contains(str) && getWarnings.contains(str2)) {
                return true;
            }
            if (cleanup.contains(str) && cleanup.contains(str2)) {
                return true;
            }
            if (getSDKVersion.contains(str) && getSDKVersion.contains(str2)) {
                return true;
            }
            if (onCReqSuccess.contains(str) && onCReqSuccess.contains(str2)) {
                return true;
            }
            if (onValidated.contains(str) && onValidated.contains(str2)) {
                return true;
            }
            if (CardinalEnvironment.contains(str) && CardinalEnvironment.contains(str2)) {
                return true;
            }
            if (!valueOf.contains(str) || !valueOf.contains(str2)) {
                return Cardinal.contains(str) && Cardinal.contains(str2);
            }
            return true;
        }

        public static ASN1ObjectIdentifier getInstance(String str) {
            return (ASN1ObjectIdentifier) CardinalError.get(str);
        }

        public static IESCipher.ECIESwithAESCBC configure(String str) {
            String cca_continue2 = getTextFontSize.cca_continue(str);
            if (configure.contains(cca_continue2)) {
                return new KeyFactorySpi.ECMQV();
            }
            if (Cardinal.contains(cca_continue2)) {
                return new KeyFactorySpi.ECDH();
            }
            if (getInstance.contains(cca_continue2)) {
                return new KeyPairGeneratorSpi.ECDHC();
            }
            if (init.contains(cca_continue2)) {
                return new SignatureSpi.ecCVCDSA224();
            }
            if (cca_continue.contains(cca_continue2)) {
                return new SignatureSpi.ecCVCDSA();
            }
            if (getWarnings.contains(cca_continue2)) {
                return new KeyPairGeneratorSpi.ECMQV();
            }
            if (cleanup.contains(cca_continue2)) {
                return new SignatureSpi.ecCVCDSA256(224);
            }
            if (getSDKVersion.contains(cca_continue2)) {
                return new SignatureSpi.ecCVCDSA256(256);
            }
            if (onCReqSuccess.contains(cca_continue2)) {
                return new KeyPairGeneratorSpi.ECDSA(224);
            }
            if (onValidated.contains(cca_continue2)) {
                return new KeyPairGeneratorSpi.ECDSA(256);
            }
            if (CardinalEnvironment.contains(cca_continue2)) {
                return new KeyPairGeneratorSpi.ECDSA(BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            }
            if (valueOf.contains(cca_continue2)) {
                return new KeyPairGeneratorSpi.ECDSA(512);
            }
            return null;
        }

        static {
            Cardinal.add("MD5");
            Cardinal.add(KeyAgreementSpi.DHUwithSHA224CKDF.setChallengeTimeout.init);
            configure.add("SHA1");
            configure.add("SHA-1");
            configure.add(KeyAgreementSpi.DHUwithSHA1KDF.onValidated.init);
            getInstance.add("SHA224");
            getInstance.add("SHA-224");
            getInstance.add(IESCipher.IESwithDESedeCBC.onValidated.init);
            init.add("SHA256");
            init.add("SHA-256");
            init.add(IESCipher.IESwithDESedeCBC.cca_continue.init);
            cca_continue.add("SHA384");
            cca_continue.add("SHA-384");
            cca_continue.add(IESCipher.IESwithDESedeCBC.Cardinal.init);
            getWarnings.add("SHA512");
            getWarnings.add("SHA-512");
            getWarnings.add(IESCipher.IESwithDESedeCBC.getInstance.init);
            cleanup.add("SHA512(224)");
            cleanup.add("SHA-512(224)");
            cleanup.add(IESCipher.IESwithDESedeCBC.cleanup.init);
            getSDKVersion.add("SHA512(256)");
            getSDKVersion.add("SHA-512(256)");
            getSDKVersion.add(IESCipher.IESwithDESedeCBC.onCReqSuccess.init);
            onCReqSuccess.add("SHA3-224");
            onCReqSuccess.add(IESCipher.IESwithDESedeCBC.getSDKVersion.init);
            onValidated.add("SHA3-256");
            onValidated.add(IESCipher.IESwithDESedeCBC.getWarnings.init);
            CardinalEnvironment.add("SHA3-384");
            CardinalEnvironment.add(IESCipher.IESwithDESedeCBC.CardinalError.init);
            valueOf.add("SHA3-512");
            valueOf.add(IESCipher.IESwithDESedeCBC.CardinalEnvironment.init);
            CardinalError.put("MD5", KeyAgreementSpi.DHUwithSHA224CKDF.setChallengeTimeout);
            CardinalError.put(KeyAgreementSpi.DHUwithSHA224CKDF.setChallengeTimeout.init, KeyAgreementSpi.DHUwithSHA224CKDF.setChallengeTimeout);
            CardinalError.put("SHA1", KeyAgreementSpi.DHUwithSHA1KDF.onValidated);
            CardinalError.put("SHA-1", KeyAgreementSpi.DHUwithSHA1KDF.onValidated);
            CardinalError.put(KeyAgreementSpi.DHUwithSHA1KDF.onValidated.init, KeyAgreementSpi.DHUwithSHA1KDF.onValidated);
            CardinalError.put("SHA224", IESCipher.IESwithDESedeCBC.onValidated);
            CardinalError.put("SHA-224", IESCipher.IESwithDESedeCBC.onValidated);
            CardinalError.put(IESCipher.IESwithDESedeCBC.onValidated.init, IESCipher.IESwithDESedeCBC.onValidated);
            CardinalError.put("SHA256", IESCipher.IESwithDESedeCBC.cca_continue);
            CardinalError.put("SHA-256", IESCipher.IESwithDESedeCBC.cca_continue);
            CardinalError.put(IESCipher.IESwithDESedeCBC.cca_continue.init, IESCipher.IESwithDESedeCBC.cca_continue);
            CardinalError.put("SHA384", IESCipher.IESwithDESedeCBC.Cardinal);
            CardinalError.put("SHA-384", IESCipher.IESwithDESedeCBC.Cardinal);
            CardinalError.put(IESCipher.IESwithDESedeCBC.Cardinal.init, IESCipher.IESwithDESedeCBC.Cardinal);
            CardinalError.put("SHA512", IESCipher.IESwithDESedeCBC.getInstance);
            CardinalError.put("SHA-512", IESCipher.IESwithDESedeCBC.getInstance);
            CardinalError.put(IESCipher.IESwithDESedeCBC.getInstance.init, IESCipher.IESwithDESedeCBC.getInstance);
            CardinalError.put("SHA512(224)", IESCipher.IESwithDESedeCBC.cleanup);
            CardinalError.put("SHA-512(224)", IESCipher.IESwithDESedeCBC.cleanup);
            CardinalError.put(IESCipher.IESwithDESedeCBC.cleanup.init, IESCipher.IESwithDESedeCBC.cleanup);
            CardinalError.put("SHA512(256)", IESCipher.IESwithDESedeCBC.onCReqSuccess);
            CardinalError.put("SHA-512(256)", IESCipher.IESwithDESedeCBC.onCReqSuccess);
            CardinalError.put(IESCipher.IESwithDESedeCBC.onCReqSuccess.init, IESCipher.IESwithDESedeCBC.onCReqSuccess);
            CardinalError.put("SHA3-224", IESCipher.IESwithDESedeCBC.getSDKVersion);
            CardinalError.put(IESCipher.IESwithDESedeCBC.getSDKVersion.init, IESCipher.IESwithDESedeCBC.getSDKVersion);
            CardinalError.put("SHA3-256", IESCipher.IESwithDESedeCBC.getWarnings);
            CardinalError.put(IESCipher.IESwithDESedeCBC.getWarnings.init, IESCipher.IESwithDESedeCBC.getWarnings);
            CardinalError.put("SHA3-384", IESCipher.IESwithDESedeCBC.CardinalError);
            CardinalError.put(IESCipher.IESwithDESedeCBC.CardinalError.init, IESCipher.IESwithDESedeCBC.CardinalError);
            CardinalError.put("SHA3-512", IESCipher.IESwithDESedeCBC.CardinalEnvironment);
            CardinalError.put(IESCipher.IESwithDESedeCBC.CardinalEnvironment.init, IESCipher.IESwithDESedeCBC.CardinalEnvironment);
        }
    }

    public final class SHA224WithRSAEncryption implements AlgorithmParameterSpec {
        public final ASN1ObjectIdentifier Cardinal;
        public final ASN1ObjectIdentifier configure;
        public final ASN1ObjectIdentifier getInstance;

        private SHA224WithRSAEncryption(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
            this.configure = aSN1ObjectIdentifier;
            this.getInstance = aSN1ObjectIdentifier2;
            this.Cardinal = aSN1ObjectIdentifier3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public SHA224WithRSAEncryption(String str) {
            this(IES.Mappings.init(str), str.indexOf("12-512") > 0 ? KeyAgreementSpi.DHwithSHA224CKDF.init : str.indexOf("12-256") > 0 ? KeyAgreementSpi.DHwithSHA224CKDF.cca_continue : IES.getWarnings, (ASN1ObjectIdentifier) null);
        }
    }

    public final class SHA512WithRSAEncryption extends DHParameterSpec {
        public final BigInteger Cardinal;
        private final BigInteger cca_continue;
        private KeyAgreementSpi.X448UwithSHA512CKDF getInstance;
        private final int init;

        public SHA512WithRSAEncryption(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, 0);
        }

        private SHA512WithRSAEncryption(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2) {
            super(bigInteger, bigInteger3, i2);
            this.Cardinal = bigInteger2;
            this.cca_continue = bigInteger4;
            this.init = i;
        }

        public final KeyAgreementSpi.X25519withSHA256CKDF init() {
            return new KeyAgreementSpi.X25519withSHA256CKDF(getP(), getG(), this.Cardinal, this.init, getL(), this.cca_continue, this.getInstance);
        }

        public SHA512WithRSAEncryption(KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF) {
            this(x25519withSHA256CKDF.Cardinal, x25519withSHA256CKDF.getInstance, x25519withSHA256CKDF.init, x25519withSHA256CKDF.configure, x25519withSHA256CKDF.cca_continue, x25519withSHA256CKDF.getWarnings);
            this.getInstance = x25519withSHA256CKDF.onValidated;
        }
    }
}
