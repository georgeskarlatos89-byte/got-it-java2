package com.cardinalcommerce.a;

import androidx.exifinterface.media.ExifInterface;
import com.cardinalcommerce.a.GMSignatureSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.math.BigInteger;
import java.security.Key;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;

public class GMCipherSpi extends setRenderType implements SM2withMD5 {
    private static final BigInteger isEnabledPaypal = BigInteger.valueOf(1);
    public byte[] Cardinal;
    public BigInteger cca_continue;
    public BigInteger configure;
    private SM2withBlake2s getErrorNumber;
    public ECUtils getInstance;
    public toJSONString init;

    public final class ErasableOutputStream {
        public static byte[] cca_continue(BigInteger bigInteger, int i) {
            byte[] byteArray = bigInteger.toByteArray();
            if (i < byteArray.length) {
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
                return bArr;
            } else if (i <= byteArray.length) {
                return byteArray;
            } else {
                byte[] bArr2 = new byte[i];
                System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
                return bArr2;
            }
        }
    }

    public interface SM2 {
        void getInstance(appendElement appendelement);

        PSSSignatureSpi.SHA256withRSA init();
    }

    public interface SM2withBlake2b {
        byte[] Cardinal(byte[] bArr, int i, int i2) throws KeyAgreementSpi.AnonymousClass1;

        int getInstance();

        void getInstance(boolean z, SM2withRMD sM2withRMD);

        int init();
    }

    public interface SM2withRMD extends setImageResource, Iterable, Key, PublicKey {
    }

    public class SM2withSha224 extends Exception {
        private Throwable configure;

        public SM2withSha224() {
        }

        public SM2withSha224(String str) {
            super(str);
        }

        public SM2withSha224(String str, Throwable th) {
            super(str);
            this.configure = th;
        }

        public Throwable getCause() {
            return this.configure;
        }
    }

    public interface SM2withSha256 {
        int Cardinal(byte[] bArr, int i, byte[] bArr2, int i2) throws GMSignatureSpi, IllegalStateException;

        void Cardinal();

        String cca_continue();

        int getInstance();

        void getInstance(boolean z, SM2withRMD sM2withRMD) throws IllegalArgumentException;
    }

    public interface SM2withSha384 {
        int Cardinal();

        void cca_continue(SM2withRMD sM2withRMD);

        BigInteger getInstance(SM2withRMD sM2withRMD);
    }

    public interface SM2withSha512 {
        int cca_continue(byte[] bArr, int i, int i2) throws GMSignatureSpi, IllegalArgumentException;

        void getInstance(SM2withRMD sM2withRMD);
    }

    public GMCipherSpi(toJSONString tojsonstring, ECUtils eCUtils, BigInteger bigInteger, BigInteger bigInteger2) {
        this(tojsonstring, eCUtils, bigInteger, bigInteger2, (byte[]) null);
    }

    public GMCipherSpi(toJSONString tojsonstring, JSONNavi jSONNavi, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this(tojsonstring, new ECUtils(jSONNavi), bigInteger, bigInteger2, bArr);
    }

    public static GMCipherSpi cca_continue(Object obj) {
        if (obj != null) {
            return new GMCipherSpi(isEnableLogging.getInstance(obj));
        }
        return null;
    }

    public final class SM2withBlake2s extends setRenderType implements SM2withMD5 {
        getThreeDSRequestorAppURL Cardinal;
        ASN1ObjectIdentifier init;

        public SM2withBlake2s(int i, int i2) {
            this(i, i2, 0, 0);
        }

        SM2withBlake2s(isEnableLogging isenablelogging) {
            this.init = ASN1ObjectIdentifier.cca_continue((Object) isenablelogging.init(0));
            this.Cardinal = isenablelogging.init(1).onCReqSuccess();
        }

        public SM2withBlake2s(BigInteger bigInteger) {
            this.init = getWarnings;
            this.Cardinal = new setEnvironment(bigInteger);
        }

        public SM2withBlake2s(int i, int i2, int i3, int i4) {
            this.init = getSDKVersion;
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(new setEnvironment((long) i));
            if (i3 == 0) {
                if (i4 == 0) {
                    getbackgroundcolor.getInstance.addElement(cleanup);
                    getbackgroundcolor.getInstance.addElement(new setEnvironment((long) i2));
                } else {
                    throw new IllegalArgumentException("inconsistent k values");
                }
            } else if (i3 <= i2 || i4 <= i3) {
                throw new IllegalArgumentException("inconsistent k values");
            } else {
                getbackgroundcolor.getInstance.addElement(CardinalRenderType);
                getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
                getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) i2));
                getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) i3));
                getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) i4));
                getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
            }
            this.Cardinal = new getProcessorTransactionId(getbackgroundcolor);
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.init);
            getbackgroundcolor.getInstance.addElement(this.Cardinal);
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public interface SM2withMD5 {
        public static final ASN1ObjectIdentifier CardinalActionCode;
        public static final ASN1ObjectIdentifier CardinalChallengeObserver;
        public static final ASN1ObjectIdentifier CardinalConfigurationParameters;
        public static final ASN1ObjectIdentifier CardinalEnvironment;
        public static final ASN1ObjectIdentifier CardinalError;
        public static final ASN1ObjectIdentifier CardinalRenderType;
        public static final ASN1ObjectIdentifier CardinalUiType;
        public static final ASN1ObjectIdentifier ExtendedData = new ASN1ObjectIdentifier("1.2.840.10040.4.1");
        public static final ASN1ObjectIdentifier Payload;
        public static final ASN1ObjectIdentifier cleanup;
        public static final ASN1ObjectIdentifier getActionCode;
        public static final ASN1ObjectIdentifier getCavv;
        public static final ASN1ObjectIdentifier getChallengeTimeout;
        public static final ASN1ObjectIdentifier getEciFlag;
        public static final ASN1ObjectIdentifier getEnrolled;
        public static final ASN1ObjectIdentifier getEnvironment;
        public static final ASN1ObjectIdentifier getJSON;
        public static final ASN1ObjectIdentifier getPaResStatus;
        public static final ASN1ObjectIdentifier getProxyAddress;
        public static final ASN1ObjectIdentifier getRenderType;
        public static final ASN1ObjectIdentifier getRequestTimeout;
        public static final ASN1ObjectIdentifier getSDKVersion;
        public static final ASN1ObjectIdentifier getSignatureVerification;
        public static final ASN1ObjectIdentifier getString;
        public static final ASN1ObjectIdentifier getThreeDSRequestorAppURL;
        public static final ASN1ObjectIdentifier getUICustomization;
        public static final ASN1ObjectIdentifier getUiType;
        public static final ASN1ObjectIdentifier getWarnings;
        public static final ASN1ObjectIdentifier getXid = new ASN1ObjectIdentifier("1.2.840.10040.4.3");
        public static final ASN1ObjectIdentifier isEnableDFSync;
        public static final ASN1ObjectIdentifier isEnableLogging;
        public static final ASN1ObjectIdentifier isEnabledDiscover;
        public static final ASN1ObjectIdentifier isLocationDataConsentGiven;
        public static final ASN1ObjectIdentifier onCReqSuccess;
        public static final ASN1ObjectIdentifier onValidated;
        public static final ASN1ObjectIdentifier setChallengeTimeout;
        public static final ASN1ObjectIdentifier setEnableDFSync;
        public static final ASN1ObjectIdentifier setEnableLogging;
        public static final ASN1ObjectIdentifier setEnabledDiscover;
        public static final ASN1ObjectIdentifier setEnvironment;
        public static final ASN1ObjectIdentifier setLocationDataConsentGiven;
        public static final ASN1ObjectIdentifier setProxyAddress;
        public static final ASN1ObjectIdentifier setRenderType;
        public static final ASN1ObjectIdentifier setRequestTimeout;
        public static final ASN1ObjectIdentifier setThreeDSRequestorAppURL;
        public static final ASN1ObjectIdentifier setUICustomization;
        public static final ASN1ObjectIdentifier setUiType;
        public static final ASN1ObjectIdentifier valueOf;
        public static final ASN1ObjectIdentifier values;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.840.10045");
            onCReqSuccess = aSN1ObjectIdentifier;
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
            onValidated = aSN1ObjectIdentifier2;
            getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2");
            getSDKVersion = aSN1ObjectIdentifier3;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "3.1");
            cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "3.2");
            CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "3.3");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4");
            CardinalEnvironment = aSN1ObjectIdentifier4;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
            CardinalError = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2"), "1");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, ExifInterface.GPS_MEASUREMENT_3D);
            values = aSN1ObjectIdentifier5;
            valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1");
            getString = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2");
            CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, ExifInterface.GPS_MEASUREMENT_3D);
            CardinalChallengeObserver = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "4");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ExifInterface.GPS_MEASUREMENT_3D);
            CardinalActionCode = aSN1ObjectIdentifier6;
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "0");
            getActionCode = aSN1ObjectIdentifier7;
            setRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "1");
            getChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "2");
            CardinalConfigurationParameters = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, ExifInterface.GPS_MEASUREMENT_3D);
            setChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "4");
            getRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "5");
            getProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "6");
            setEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "7");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "8");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "9");
            setProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "10");
            getUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "11");
            getEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "12");
            setUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "13");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "14");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "15");
            getRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "16");
            setUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "17");
            setRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "18");
            getUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "19");
            setEnableDFSync = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "20");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "1");
            getThreeDSRequestorAppURL = aSN1ObjectIdentifier8;
            isEnableDFSync = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "1");
            setThreeDSRequestorAppURL = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "2");
            isEnableLogging = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, ExifInterface.GPS_MEASUREMENT_3D);
            setEnableLogging = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "4");
            setLocationDataConsentGiven = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "5");
            getJSON = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "6");
            isLocationDataConsentGiven = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "7");
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("1.3.133.16.840.63.0");
            getEciFlag = aSN1ObjectIdentifier9;
            getEnrolled = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "2");
            getPaResStatus = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, ExifInterface.GPS_MEASUREMENT_3D);
            getCavv = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "16");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("1.2.840.10046");
            Payload = aSN1ObjectIdentifier10;
            getSignatureVerification = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "2.1");
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, ExifInterface.GPS_MEASUREMENT_3D);
            setEnabledDiscover = aSN1ObjectIdentifier11;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, ExifInterface.GPS_MEASUREMENT_3D);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "5");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "6");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "7");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "8");
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier("1.3.133.16.840.9.44"), "1");
            isEnabledDiscover = aSN1ObjectIdentifier12;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, "1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, "2");
        }
    }

    public class SM2withSha1 {
        public int Cardinal;
        public byte[] cca_continue;
        public boolean configure;
        private boolean getInstance;
        public SM2withSha256 init;
        private boolean onCReqSuccess;

        public final int Cardinal() {
            return this.init.getInstance();
        }

        public int cca_continue(int i) {
            int i2 = i + this.Cardinal;
            return i2 - (i2 % this.cca_continue.length);
        }

        public final SM2withSha256 cca_continue() {
            return this.init;
        }

        /* JADX INFO: finally extract failed */
        public int configure(byte[] bArr, int i) throws GMSignatureSpi, IllegalStateException, KeyAgreementSpi.AnonymousClass1 {
            try {
                int i2 = this.Cardinal;
                if (i + i2 > bArr.length) {
                    throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too short for doFinal()");
                } else if (i2 == 0) {
                    getInstance();
                    return 0;
                } else {
                    throw new GMSignatureSpi("data not block size aligned");
                }
            } catch (Throwable th) {
                getInstance();
                throw th;
            }
        }

        public final void getInstance() {
            int i = 0;
            while (true) {
                byte[] bArr = this.cca_continue;
                if (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                } else {
                    this.Cardinal = 0;
                    this.init.Cardinal();
                    return;
                }
            }
        }

        public void getInstance(boolean z, SM2withRMD sM2withRMD) throws IllegalArgumentException {
            this.configure = z;
            getInstance();
            this.init.getInstance(z, sM2withRMD);
        }

        public int init(int i) {
            return i + this.Cardinal;
        }

        public int init(byte[] bArr, int i, int i2, byte[] bArr2) throws GMSignatureSpi, IllegalStateException {
            int i3;
            if (i2 >= 0) {
                int instance = this.init.getInstance();
                int cca_continue2 = cca_continue(i2);
                if (cca_continue2 <= 0 || cca_continue2 <= bArr2.length) {
                    byte[] bArr3 = this.cca_continue;
                    int length = bArr3.length;
                    int i4 = this.Cardinal;
                    int i5 = length - i4;
                    if (i2 > i5) {
                        System.arraycopy(bArr, i, bArr3, i4, i5);
                        i3 = this.init.Cardinal(this.cca_continue, 0, bArr2, 0) + 0;
                        this.Cardinal = 0;
                        i2 -= i5;
                        i += i5;
                        while (i2 > this.cca_continue.length) {
                            i3 += this.init.Cardinal(bArr, i, bArr2, i3);
                            i2 -= instance;
                            i += instance;
                        }
                    } else {
                        i3 = 0;
                    }
                    System.arraycopy(bArr, i, this.cca_continue, this.Cardinal, i2);
                    int i6 = this.Cardinal + i2;
                    this.Cardinal = i6;
                    byte[] bArr4 = this.cca_continue;
                    if (i6 != bArr4.length) {
                        return i3;
                    }
                    int Cardinal2 = i3 + this.init.Cardinal(bArr4, 0, bArr2, i3);
                    this.Cardinal = 0;
                    return Cardinal2;
                }
                throw new KeyAgreementSpi.CDHwithSHA224KDFAndSharedInfo("output buffer too short");
            }
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
    }

    public final class SM2withWhirlpool {
        private static volatile SecureRandom Cardinal;
        private static final ThreadLocal<Map<String, Object[]>> configure = new ThreadLocal<>();
        private static final Map<String, Object[]> getInstance = Collections.synchronizedMap(new HashMap());

        public static final class init {
            public static final init Cardinal = new init("dhDefaultParams", KeyAgreementSpi.X25519withSHA256CKDF.class);
            public static final init init = new init("dsaDefaultParams", KeyAgreementSpi.X448withSHA256CKDF.class);
            /* access modifiers changed from: private */
            public final Class cca_continue;
            /* access modifiers changed from: private */
            public final String getInstance;

            static {
                new init("ecImplicitlyCA", GMCipherSpi.class);
            }

            private init(String str, Class cls) {
                this.getInstance = str;
                this.cca_continue = cls;
            }
        }

        static {
            new GMSignatureSpi.sm3WithSM2("globalConfig");
            new GMSignatureSpi.sm3WithSM2("threadLocalConfig");
            new GMSignatureSpi.sm3WithSM2("defaultRandomConfig");
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF = new KeyAgreementSpi.X448withSHA256CKDF(new BigInteger("fca682ce8e12caba26efccf7110e526db078b05edecbcd1eb4a208f3ae1617ae01f35b91a47e6df63413c5e12ed0899bcd132acd50d99151bdc43ee737592e17", 16), new BigInteger("962eddcc369cba8ebb260ee6b6a126d9346e38c5", 16), new BigInteger("678471b27a9cf44ee91a49c5147db1a9aaf244f05a434d6486931d2d14271b9e35030b71fd73da179069b32e2935630e1c2062354d0da20a6c416e50be794ca4", 16), new KeyFactorySpi.ED25519(getHeadingTextFontName.init("b869c82b35d70e1b1ff91b28e37a62ecdc34409b"), 123));
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF2 = new KeyAgreementSpi.X448withSHA256CKDF(new BigInteger("e9e642599d355f37c97ffd3567120b8e25c9cd43e927b3a9670fbec5d890141922d2c3b3ad2480093799869d1e846aab49fab0ad26d2ce6a22219d470bce7d777d4a21fbe9c270b57f607002f3cef8393694cf45ee3688c11a8c56ab127a3daf", 16), new BigInteger("9cdbd84c9f1ac2f38d0f80f42ab952e7338bf511", 16), new BigInteger("30470ad5a005fb14ce2d9dcd87e38bc7d1b1c5facbaecbe95f190aa7a31d23c4dbbcbe06174544401a5b2c020965d8c2bd2171d3668445771f74ba084d2029d83c1c158547f3a9f1a2715be23d51ae4d3e5a1f6a7064f316933a346d3f529252", 16), new KeyFactorySpi.ED25519(getHeadingTextFontName.init("77d0f8c4dad15eb8c4f2f8d6726cefd96d5bb399"), 263));
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF3 = new KeyAgreementSpi.X448withSHA256CKDF(new BigInteger("fd7f53811d75122952df4a9c2eece4e7f611b7523cef4400c31e3f80b6512669455d402251fb593d8d58fabfc5f5ba30f6cb9b556cd7813b801d346ff26660b76b9950a5a49f9fe8047b1022c24fbba9d7feb7c61bf83b57e7c6a8a6150f04fb83f6d3c51ec3023554135a169132f675f3ae2b61d72aeff22203199dd14801c7", 16), new BigInteger("9760508f15230bccb292b982a2eb840bf0581cf5", 16), new BigInteger("f7e1a085d69b3ddecbbcab5c36b857b97994afbbfa3aea82f9574c0b3d0782675159578ebad4594fe67107108180b449167123e84c281613b7cf09328cc8a6e13c167a8b547c8d28e0a3ae1e2bb3a675916ea37f0bfa213562f1fb627a01243bcca4f1bea8519089a883dfe15ae59f06928b665e807b552564014c3bfecf492a", 16), new KeyFactorySpi.ED25519(getHeadingTextFontName.init("8d5155894229d5e689ee01e6018a237e2cae64cd"), 92));
            KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF4 = new KeyAgreementSpi.X448withSHA256CKDF(new BigInteger("95475cf5d93e596c3fcd1d902add02f427f5f3c7210313bb45fb4d5bb2e5fe1cbd678cd4bbdd84c9836be1f31c0777725aeb6c2fc38b85f48076fa76bcd8146cc89a6fb2f706dd719898c2083dc8d896f84062e2c9c94d137b054a8d8096adb8d51952398eeca852a0af12df83e475aa65d4ec0c38a9560d5661186ff98b9fc9eb60eee8b030376b236bc73be3acdbd74fd61c1d2475fa3077b8f080467881ff7e1ca56fee066d79506ade51edbb5443a563927dbc4ba520086746175c8885925ebc64c6147906773496990cb714ec667304e261faee33b3cbdf008e0c3fa90650d97d3909c9275bf4ac86ffcb3d03e6dfc8ada5934242dd6d3bcca2a406cb0b", 16), new BigInteger("f8183668ba5fc5bb06b5981e6d8b795d30b8978d43ca0ec572e37e09939a9773", 16), new BigInteger("42debb9da5b3d88cc956e08787ec3f3a09bba5f48b889a74aaf53174aa0fbe7e3c5b8fcd7a53bef563b0e98560328960a9517f4014d3325fc7962bf1e049370d76d1314a76137e792f3f0db859d095e4a5b932024f079ecf2ef09c797452b0770e1350782ed57ddf794979dcef23cb96f183061965c4ebc93c9c71c56b925955a75f94cccf1449ac43d586d0beee43251b0b2287349d68de0d144403f13e802f4146d882e057af19b6f6275c6676c8fa0e3ca2713a3257fd1b27d0639f695e347d8d1cf9ac819a26ca9b04cb0eb9b7b035988d15bbac65212a55239cfc7e58fae38d7250ab9991ffbc97134025fe8ce04c4399ad96569be91a546f4978693c7a", 16), new KeyFactorySpi.ED25519(getHeadingTextFontName.init("b0b4417601b59cbc9d8ac8f935cadaec4f5fbb2f23785609ae466748d9b5a536"), 497));
            cca_continue(init.init, x448withSHA256CKDF, x448withSHA256CKDF2, x448withSHA256CKDF3, x448withSHA256CKDF4);
            cca_continue(init.Cardinal, init(x448withSHA256CKDF), init(x448withSHA256CKDF2), init(x448withSHA256CKDF3), init(x448withSHA256CKDF4));
        }

        public static SecureRandom configure() {
            return Cardinal == null ? new SecureRandom() : Cardinal;
        }

        public static <T> T init(init init2, int i) {
            Map<String, Object[]> map = configure.get();
            if (map == null || !map.containsKey(init2.getInstance)) {
                map = getInstance;
            }
            T[] tArr = (Object[]) map.get(init2.getInstance);
            if (tArr == null) {
                return null;
            }
            int i2 = 0;
            if (init2.cca_continue.isAssignableFrom(KeyAgreementSpi.X25519withSHA256CKDF.class)) {
                while (i2 != tArr.length) {
                    T t = (KeyAgreementSpi.X25519withSHA256CKDF) tArr[i2];
                    if (t.Cardinal.bitLength() == i) {
                        return t;
                    }
                    i2++;
                }
            } else if (init2.cca_continue.isAssignableFrom(KeyAgreementSpi.X448withSHA256CKDF.class)) {
                while (i2 != tArr.length) {
                    T t2 = (KeyAgreementSpi.X448withSHA256CKDF) tArr[i2];
                    if (t2.configure.bitLength() == i) {
                        return t2;
                    }
                    i2++;
                }
            }
            return null;
        }

        private static <T> void cca_continue(init init2, T... tArr) {
            if (init2.cca_continue.isAssignableFrom(tArr[0].getClass())) {
                ThreadLocal<Map<String, Object[]>> threadLocal = configure;
                Map map = threadLocal.get();
                if (map == null) {
                    map = new HashMap();
                    threadLocal.set(map);
                }
                map.put(init2.getInstance, tArr);
                getInstance.put(init2.getInstance, tArr);
                return;
            }
            throw new IllegalArgumentException("Bad property value passed");
        }

        private static KeyAgreementSpi.X25519withSHA256CKDF init(KeyAgreementSpi.X448withSHA256CKDF x448withSHA256CKDF) {
            byte[] bArr;
            int bitLength = x448withSHA256CKDF.configure.bitLength();
            int i = bitLength > 1024 ? bitLength <= 2048 ? 224 : bitLength <= 3072 ? 256 : bitLength <= 7680 ? BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT : 512 : Opcodes.IF_ICMPNE;
            BigInteger bigInteger = x448withSHA256CKDF.configure;
            BigInteger bigInteger2 = x448withSHA256CKDF.Cardinal;
            BigInteger bigInteger3 = x448withSHA256CKDF.init;
            byte[] bArr2 = x448withSHA256CKDF.cca_continue.cca_continue;
            if (bArr2 == null) {
                bArr = null;
            } else {
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                bArr = bArr3;
            }
            return new KeyAgreementSpi.X25519withSHA256CKDF(bigInteger, bigInteger2, bigInteger3, i, 0, (BigInteger) null, new KeyAgreementSpi.X448UwithSHA512CKDF(bArr, x448withSHA256CKDF.cca_continue.Cardinal));
        }
    }

    private GMCipherSpi(isEnableLogging isenablelogging) {
        if (!(isenablelogging.init(0) instanceof setEnvironment) || !new BigInteger(((setEnvironment) isenablelogging.init(0)).getInstance).equals(isEnabledPaypal)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.cca_continue = new BigInteger(((setEnvironment) isenablelogging.init(4)).getInstance);
        if (isenablelogging.cca_continue() == 6) {
            this.configure = new BigInteger(((setEnvironment) isenablelogging.init(5)).getInstance);
        }
        CardinalConfigurationParameters init2 = isenablelogging.init(1);
        byte[] bArr = null;
        BCECPrivateKey bCECPrivateKey = new BCECPrivateKey(init2 instanceof SM2withBlake2s ? (SM2withBlake2s) init2 : init2 != null ? new SM2withBlake2s(isEnableLogging.getInstance((Object) init2)) : null, this.cca_continue, this.configure, isEnableLogging.getInstance((Object) isenablelogging.init(2)));
        this.init = bCECPrivateKey.configure;
        CardinalConfigurationParameters init3 = isenablelogging.init(3);
        if (init3 instanceof ECUtils) {
            this.getInstance = (ECUtils) init3;
        } else {
            this.getInstance = new ECUtils(this.init, (setUICustomization) init3);
        }
        byte[] bArr2 = bCECPrivateKey.Cardinal;
        if (bArr2 != null) {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        this.Cardinal = bArr;
    }

    public GMCipherSpi(toJSONString tojsonstring, ECUtils eCUtils, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        byte[] bArr2;
        this.init = tojsonstring;
        this.getInstance = eCUtils;
        this.cca_continue = bigInteger;
        this.configure = bigInteger2;
        boolean z = false;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.Cardinal = bArr2;
        if (tojsonstring.cca_continue.Cardinal() == 1 ? true : z) {
            this.getErrorNumber = new SM2withBlake2s(tojsonstring.cca_continue.configure());
        } else if (appendElement.cca_continue(tojsonstring.cca_continue)) {
            int[] instance = ((CompletionEvent) tojsonstring.cca_continue).cca_continue().getInstance();
            if (instance.length == 3) {
                this.getErrorNumber = new SM2withBlake2s(instance[2], instance[1]);
            } else if (instance.length == 5) {
                this.getErrorNumber = new SM2withBlake2s(instance[4], instance[1], instance[2], instance[3]);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment(isEnabledPaypal));
        getbackgroundcolor.getInstance.addElement(this.getErrorNumber);
        getbackgroundcolor.getInstance.addElement(new BCECPrivateKey(this.init, this.Cardinal));
        getbackgroundcolor.getInstance.addElement(this.getInstance);
        getbackgroundcolor.getInstance.addElement(new setEnvironment(this.cca_continue));
        if (this.configure != null) {
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.configure));
        }
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
