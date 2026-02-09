package com.cardinalcommerce.a;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.DH;
import com.cardinalcommerce.a.DSASigner;
import com.cardinalcommerce.a.DSTU4145;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.EdEC;
import com.cardinalcommerce.a.GM;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyFactorySpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import com.facebook.appevents.UserDataStore;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

public final class KeyAgreementSpi extends isEnabledHostedFields {

    /* renamed from: com.cardinalcommerce.a.KeyAgreementSpi$1  reason: invalid class name */
    public final class AnonymousClass1 extends GMCipherSpi.SM2withSha224 {
        public AnonymousClass1() {
        }

        public AnonymousClass1(String str) {
            super(str);
        }

        public AnonymousClass1(String str, Throwable th) {
            super(str, th);
        }
    }

    public class CDHwithSHA1KDFAndSharedInfo extends RuntimeException {
        public CDHwithSHA1KDFAndSharedInfo() {
        }

        public CDHwithSHA1KDFAndSharedInfo(String str) {
            super(str);
        }
    }

    public final class CDHwithSHA224KDFAndSharedInfo extends GMSignatureSpi {
        public CDHwithSHA224KDFAndSharedInfo(String str) {
            super(str);
        }
    }

    public interface CDHwithSHA256KDFAndSharedInfo {
        void cca_continue(boolean z, GMCipherSpi.SM2withRMD sM2withRMD);

        void cca_continue(byte[] bArr, int i, int i2);

        void init(byte b);

        boolean init(byte[] bArr);

        byte[] init() throws GMCipherSpi.SM2withSha224, GMSignatureSpi;
    }

    public interface CDHwithSHA384KDFAndSharedInfo {
        void configure(GMCipherSpi.SM2withRMD sM2withRMD) throws IllegalArgumentException;

        int getInstance();

        int getInstance(byte[] bArr) throws GMSignatureSpi, IllegalStateException;

        void getInstance(byte[] bArr, int i, int i2) throws GMSignatureSpi, IllegalStateException;
    }

    public interface CDHwithSHA512KDFAndSharedInfo {
        int getInstance();

        void init(GMCipherSpi.SM2withRMD sM2withRMD);

        void init(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr, int i);
    }

    public interface DH extends IESCipher.ECIESwithDESedeCBC {
        int getInstance(byte[] bArr, int i, int i2);
    }

    public interface DHC {
        byte[] Cardinal();

        byte[] getInstance() throws AnonymousClass1;
    }

    public interface DHUwithSHA1KDF {
        public static final ASN1ObjectIdentifier Cardinal = new ASN1ObjectIdentifier("1.3.14.3.2.7");
        public static final ASN1ObjectIdentifier cca_continue = new ASN1ObjectIdentifier("1.3.14.3.2.17");
        public static final ASN1ObjectIdentifier cleanup = new ASN1ObjectIdentifier("1.3.14.7.2.1.1");
        public static final ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("1.3.14.3.2.6");
        public static final ASN1ObjectIdentifier getInstance = new ASN1ObjectIdentifier("1.3.14.3.2.8");
        public static final ASN1ObjectIdentifier getWarnings = new ASN1ObjectIdentifier("1.3.14.3.2.29");
        public static final ASN1ObjectIdentifier init = new ASN1ObjectIdentifier("1.3.14.3.2.9");
        public static final ASN1ObjectIdentifier onCReqSuccess = new ASN1ObjectIdentifier("1.3.14.3.2.27");
        public static final ASN1ObjectIdentifier onValidated = new ASN1ObjectIdentifier("1.3.14.3.2.26");

        static {
            new ASN1ObjectIdentifier("1.3.14.3.2.2");
            new ASN1ObjectIdentifier("1.3.14.3.2.3");
            new ASN1ObjectIdentifier("1.3.14.3.2.4");
        }
    }

    public final class DHwithSHA1KDFAndSharedInfo {
        public X25519withSHA384CKDF Cardinal;
    }

    public final class DHwithSHA512KDFAndSharedInfo {
        public KeyFactorySpi.X25519 cca_continue;
    }

    public final class MQVwithSHA1KDFAndSharedInfo extends MQVwithSHA384KDFAndSharedInfo {
        private static final byte[] Cardinal = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        public MQVwithSHA1KDFAndSharedInfo() {
            super(Cardinal);
        }

        private MQVwithSHA1KDFAndSharedInfo(MQVwithSHA1KDFAndSharedInfo mQVwithSHA1KDFAndSharedInfo) {
            super(Cardinal);
            cca_continue((setBackgroundColor) mQVwithSHA1KDFAndSharedInfo);
        }

        public final setBackgroundColor Cardinal() {
            return new MQVwithSHA1KDFAndSharedInfo(this);
        }

        public final String configure() {
            return "GOST3411-2012-256";
        }

        public final int getInstance() {
            return 32;
        }

        public final int init(byte[] bArr, int i) {
            byte[] bArr2 = new byte[64];
            super.init(bArr2, 0);
            System.arraycopy(bArr2, 32, bArr, i, 32);
            return 32;
        }
    }

    public final class MQVwithSHA224KDFAndSharedInfo extends MQVwithSHA384KDFAndSharedInfo {
        private static final byte[] getInstance = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        public MQVwithSHA224KDFAndSharedInfo() {
            super(getInstance);
        }

        private MQVwithSHA224KDFAndSharedInfo(MQVwithSHA224KDFAndSharedInfo mQVwithSHA224KDFAndSharedInfo) {
            super(getInstance);
            cca_continue((setBackgroundColor) mQVwithSHA224KDFAndSharedInfo);
        }

        public final setBackgroundColor Cardinal() {
            return new MQVwithSHA224KDFAndSharedInfo(this);
        }

        public final String configure() {
            return "GOST3411-2012-512";
        }

        public final int getInstance() {
            return 64;
        }
    }

    public interface MQVwithSHA256KDF {
        boolean Cardinal(MQVwithSHA384KDF mQVwithSHA384KDF, MQVwithSHA384KDF mQVwithSHA384KDF2);

        String cca_continue(MQVwithSHA384KDF mQVwithSHA384KDF);

        int init(MQVwithSHA384KDF mQVwithSHA384KDF);
    }

    public abstract class MQVwithSHA512KDFAndSharedInfo implements IESCipher.ECIESwithDESedeCBC, setBackgroundColor {
        private int cca_continue;
        private long getInstance;
        private final byte[] init;

        protected MQVwithSHA512KDFAndSharedInfo() {
            this.init = new byte[4];
            this.cca_continue = 0;
        }

        protected MQVwithSHA512KDFAndSharedInfo(MQVwithSHA512KDFAndSharedInfo mQVwithSHA512KDFAndSharedInfo) {
            this.init = new byte[4];
            init(mQVwithSHA512KDFAndSharedInfo);
        }

        public final int cca_continue() {
            return 64;
        }

        public final void cca_continue(byte b) {
            byte[] bArr = this.init;
            int i = this.cca_continue;
            int i2 = i + 1;
            this.cca_continue = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                getInstance(bArr, 0);
                this.cca_continue = 0;
            }
            this.getInstance++;
        }

        /* access modifiers changed from: protected */
        public abstract void cleanup();

        /* access modifiers changed from: protected */
        public abstract void configure(long j);

        /* access modifiers changed from: protected */
        public abstract void getInstance(byte[] bArr, int i);

        public final void getSDKVersion() {
            long j = this.getInstance << 3;
            byte b = Byte.MIN_VALUE;
            while (true) {
                cca_continue(b);
                if (this.cca_continue != 0) {
                    b = 0;
                } else {
                    configure(j);
                    cleanup();
                    return;
                }
            }
        }

        public void init() {
            this.getInstance = 0;
            this.cca_continue = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.init;
                if (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void init(MQVwithSHA512KDFAndSharedInfo mQVwithSHA512KDFAndSharedInfo) {
            byte[] bArr = mQVwithSHA512KDFAndSharedInfo.init;
            System.arraycopy(bArr, 0, this.init, 0, bArr.length);
            this.cca_continue = mQVwithSHA512KDFAndSharedInfo.cca_continue;
            this.getInstance = mQVwithSHA512KDFAndSharedInfo.getInstance;
        }

        public final void init(byte[] bArr, int i, int i2) {
            int i3 = 0;
            int max = Math.max(0, i2);
            if (this.cca_continue != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= max) {
                        i3 = i4;
                        break;
                    }
                    byte[] bArr2 = this.init;
                    int i5 = this.cca_continue;
                    int i6 = i5 + 1;
                    this.cca_continue = i6;
                    int i7 = i4 + 1;
                    bArr2[i5] = bArr[i4 + i];
                    if (i6 == 4) {
                        getInstance(bArr2, 0);
                        this.cca_continue = 0;
                        i3 = i7;
                        break;
                    }
                    i4 = i7;
                }
            }
            int i8 = ((max - i3) & -4) + i3;
            while (i3 < i8) {
                getInstance(bArr, i + i3);
                i3 += 4;
            }
            while (i3 < max) {
                byte[] bArr3 = this.init;
                int i9 = this.cca_continue;
                this.cca_continue = i9 + 1;
                bArr3[i9] = bArr[i3 + i];
                i3++;
            }
            this.getInstance += (long) max;
        }
    }

    public final class X448UwithSHA512KDF extends X448withSHA512KDF {
        public BigInteger Cardinal;

        public X448UwithSHA512KDF(BigInteger bigInteger, X448withSHA256CKDF x448withSHA256CKDF) {
            super(true, x448withSHA256CKDF);
            this.Cardinal = bigInteger;
        }
    }

    public final class X448withSHA384CKDF {
        public final int Cardinal;
        public final int cca_continue;
        public final SecureRandom configure;
        public final int getInstance;
        public final int init;

        public X448withSHA384CKDF(int i, int i2, int i3, SecureRandom secureRandom) {
            this(i, i2, i3, secureRandom, (byte) 0);
        }

        private X448withSHA384CKDF(int i, int i2, int i3, SecureRandom secureRandom, byte b) {
            this.getInstance = i;
            this.cca_continue = i2;
            this.Cardinal = i3;
            this.init = -1;
            this.configure = secureRandom;
        }
    }

    public class X448withSHA512KDF extends setCCAImageUri {
        public X448withSHA256CKDF configure;

        public X448withSHA512KDF(boolean z, X448withSHA256CKDF x448withSHA256CKDF) {
            super(z);
            this.configure = x448withSHA256CKDF;
        }
    }

    public KeyAgreementSpi(isEnabledHostedFields isenabledhostedfields) {
        super(isenabledhostedfields.cca_continue());
    }

    public final String toString() {
        return new StringBuilder("NetscapeRevocationURL: ").append(cca_continue()).toString();
    }

    public final class DHUC implements GMCipherSpi.SM2withSha384 {
        private KeyPairGeneratorSpi.EdDSA cca_continue;

        public final void cca_continue(GMCipherSpi.SM2withRMD sM2withRMD) {
            this.cca_continue = (KeyPairGeneratorSpi.EdDSA) sM2withRMD;
        }

        public final int Cardinal() {
            return (this.cca_continue.Cardinal.cca_continue.getInstance() + 7) / 8;
        }

        public final BigInteger getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
            KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) sM2withRMD;
            KeyFactorySpi.EDDSA eddsa = this.cca_continue.Cardinal;
            if (eddsa.equals(xdh.Cardinal)) {
                BigInteger bigInteger = this.cca_continue.init;
                JSONNavi init = appendElement.init(eddsa.cca_continue, xdh.configure);
                if (!init.getString()) {
                    BigInteger bigInteger2 = eddsa.Cardinal;
                    if (!bigInteger2.equals(writeJSONString.CardinalRenderType)) {
                        bigInteger = eddsa.init().multiply(bigInteger).mod(eddsa.getInstance);
                        init = appendElement.cca_continue(init, bigInteger2);
                    }
                    JSONNavi CardinalRenderType = init.Cardinal(bigInteger).CardinalRenderType();
                    if (!CardinalRenderType.getString()) {
                        return CardinalRenderType.onCReqSuccess().cca_continue();
                    }
                    throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
                }
                throw new IllegalStateException("Infinity is not a valid public key for ECDH");
            }
            throw new IllegalStateException("ECDH public key has wrong domain parameters");
        }
    }

    public final class DHUwithSHA1CKDF extends setRenderType {
        public setEnvironment Cardinal;
        public setEnvironment configure;
        public setEnvironment getInstance;

        public DHUwithSHA1CKDF(isEnableLogging isenablelogging) {
            Enumeration init = isenablelogging.init();
            this.Cardinal = setEnvironment.getInstance(init.nextElement());
            this.configure = setEnvironment.getInstance(init.nextElement());
            this.getInstance = init.hasMoreElements() ? (setEnvironment) init.nextElement() : null;
        }

        public DHUwithSHA1CKDF(BigInteger bigInteger, BigInteger bigInteger2, int i) {
            this.Cardinal = new setEnvironment(bigInteger);
            this.configure = new setEnvironment(bigInteger2);
            this.getInstance = i != 0 ? new setEnvironment((long) i) : null;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            BigInteger bigInteger;
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.Cardinal);
            getbackgroundcolor.getInstance.addElement(this.configure);
            setEnvironment setenvironment = this.getInstance;
            if (setenvironment == null) {
                bigInteger = null;
            } else {
                bigInteger = new BigInteger(1, setenvironment.getInstance);
            }
            if (bigInteger != null) {
                getbackgroundcolor.getInstance.addElement(this.getInstance);
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public interface DHUwithSHA224CKDF {
        public static final ASN1ObjectIdentifier Cardinal;
        public static final ASN1ObjectIdentifier CardinalActionCode;
        public static final ASN1ObjectIdentifier CardinalChallengeObserver;
        public static final ASN1ObjectIdentifier CardinalConfigurationParameters;
        public static final ASN1ObjectIdentifier CardinalEnvironment;
        public static final ASN1ObjectIdentifier CardinalError;
        public static final ASN1ObjectIdentifier CardinalRenderType;
        public static final ASN1ObjectIdentifier CardinalUiType;
        public static final ASN1ObjectIdentifier ExtendedData;
        public static final ASN1ObjectIdentifier cca_continue;
        public static final ASN1ObjectIdentifier cleanup;
        public static final ASN1ObjectIdentifier configure;
        public static final ASN1ObjectIdentifier getActionCode = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier("1.2.840.113549.1.3"), "1");
        public static final ASN1ObjectIdentifier getCavv = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.10");
        public static final ASN1ObjectIdentifier getChallengeTimeout;
        public static final ASN1ObjectIdentifier getEnvironment;
        public static final ASN1ObjectIdentifier getInstance;
        public static final ASN1ObjectIdentifier getJSON;
        public static final ASN1ObjectIdentifier getPaResStatus = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.7");
        public static final ASN1ObjectIdentifier getProxyAddress;
        public static final ASN1ObjectIdentifier getRenderType;
        public static final ASN1ObjectIdentifier getRequestTimeout;
        public static final ASN1ObjectIdentifier getSDKVersion;
        public static final ASN1ObjectIdentifier getString;
        public static final ASN1ObjectIdentifier getThreeDSRequestorAppURL;
        public static final ASN1ObjectIdentifier getUICustomization;
        public static final ASN1ObjectIdentifier getUiType = new ASN1ObjectIdentifier("1.2.840.113549.1.7.1").getInstance();
        public static final ASN1ObjectIdentifier getWarnings;
        public static final ASN1ObjectIdentifier getXid = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.5");
        public static final ASN1ObjectIdentifier init;
        public static final ASN1ObjectIdentifier isEnableDFSync;
        public static final ASN1ObjectIdentifier isEnableLogging;
        public static final ASN1ObjectIdentifier isLocationDataConsentGiven;
        public static final ASN1ObjectIdentifier onCReqSuccess;
        public static final ASN1ObjectIdentifier onValidated;
        public static final ASN1ObjectIdentifier setChallengeTimeout;
        public static final ASN1ObjectIdentifier setEnableDFSync;
        public static final ASN1ObjectIdentifier setEnableLogging;
        public static final ASN1ObjectIdentifier setEnvironment;
        public static final ASN1ObjectIdentifier setLocationDataConsentGiven = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.6");
        public static final ASN1ObjectIdentifier setProxyAddress;
        public static final ASN1ObjectIdentifier setRenderType;
        public static final ASN1ObjectIdentifier setRequestTimeout;
        public static final ASN1ObjectIdentifier setThreeDSRequestorAppURL;
        public static final ASN1ObjectIdentifier setUICustomization;
        public static final ASN1ObjectIdentifier setUiType = new ASN1ObjectIdentifier("1.2.840.113549.1.7.2").getInstance();
        public static final ASN1ObjectIdentifier valueOf;
        public static final ASN1ObjectIdentifier values;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.840.113549.1.1");
            cca_continue = aSN1ObjectIdentifier;
            configure = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
            getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2");
            Cardinal = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ExifInterface.GPS_MEASUREMENT_3D);
            init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4");
            cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "5");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "6");
            onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "7");
            onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "8");
            getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "9");
            getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "10");
            values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "11");
            valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "12");
            CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "13");
            CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "14");
            CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "15");
            String str = "15";
            CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "16");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("1.2.840.113549.1.5");
            CardinalActionCode = aSN1ObjectIdentifier2;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, ExifInterface.GPS_MEASUREMENT_3D);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "10");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "11");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "13");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "12");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier("1.2.840.113549.3");
            CardinalChallengeObserver = aSN1ObjectIdentifier3;
            getString = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "7");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "4");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier("1.2.840.113549.2");
            CardinalConfigurationParameters = aSN1ObjectIdentifier4;
            getRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "2");
            getChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "4");
            setChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "5");
            setRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "7").getInstance();
            setEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "8").getInstance();
            getEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "9").getInstance();
            setProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "10").getInstance();
            getProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "11").getInstance();
            new ASN1ObjectIdentifier("1.2.840.113549.1.7").getInstance();
            new ASN1ObjectIdentifier("1.2.840.113549.1.7.3").getInstance();
            new ASN1ObjectIdentifier("1.2.840.113549.1.7.4").getInstance();
            new ASN1ObjectIdentifier("1.2.840.113549.1.7.5").getInstance();
            new ASN1ObjectIdentifier("1.2.840.113549.1.7.6").getInstance();
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier("1.2.840.113549.1.9");
            getRenderType = aSN1ObjectIdentifier5;
            setRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1").getInstance();
            getUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, ExifInterface.GPS_MEASUREMENT_3D).getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "4").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "5").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "6").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "7").getInstance();
            setUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "8").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "9").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "13").getInstance();
            String str2 = "14";
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, str2).getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, str).getInstance();
            ASN1ObjectIdentifier instance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "16").getInstance();
            setThreeDSRequestorAppURL = instance;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "20").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "21").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "22.1");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "22");
            setEnableDFSync = aSN1ObjectIdentifier6;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "1").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "2").getInstance();
            new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "23"), "1").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "52").getInstance();
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "15.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "15.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "15.3");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.1");
            isEnableLogging = aSN1ObjectIdentifier7;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "9");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "23");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "31");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier(instance, ExifInterface.GPS_MEASUREMENT_3D);
            isEnableDFSync = aSN1ObjectIdentifier8;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "9");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, str2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.6");
            getThreeDSRequestorAppURL = aSN1ObjectIdentifier9;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, ExifInterface.GPS_MEASUREMENT_3D);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "5");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "6");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.2");
            isLocationDataConsentGiven = aSN1ObjectIdentifier10;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "5");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "10");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "11");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "12");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "47");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "7");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, str2);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, str);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "16");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "17");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "18");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "19");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "20");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "21");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "22");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "23");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "24");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "25");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "26");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "27");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "37");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "38");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "54");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "43");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "40");
            new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.5.1");
            new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.5.2");
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("1.2.840.113549.1.12");
            getJSON = aSN1ObjectIdentifier11;
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "10.1");
            ExtendedData = aSN1ObjectIdentifier12;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, "1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, "2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, ExifInterface.GPS_MEASUREMENT_3D);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, "4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, "5");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier12, "6");
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "1");
            setEnableLogging = aSN1ObjectIdentifier13;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier13, "1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier13, "2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier13, ExifInterface.GPS_MEASUREMENT_3D);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier13, "4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier13, "5");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier13, "6");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier13, "6");
        }
    }

    public final class DHUwithSHA224KDF extends setRenderType {
        public setEnvironment cca_continue;
        public setEnvironment getInstance;

        public DHUwithSHA224KDF(isEnableLogging isenablelogging) {
            Enumeration init = isenablelogging.init();
            this.cca_continue = (setEnvironment) init.nextElement();
            this.getInstance = (setEnvironment) init.nextElement();
        }

        public DHUwithSHA224KDF(BigInteger bigInteger, BigInteger bigInteger2) {
            this.cca_continue = new setEnvironment(bigInteger);
            this.getInstance = new setEnvironment(bigInteger2);
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.cca_continue);
            getbackgroundcolor.getInstance.addElement(this.getInstance);
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class DHUwithSHA256CKDF extends setRenderType implements DHUwithSHA224CKDF {
        private boolean Payload = true;
        private ASN1ObjectIdentifier getEciFlag;
        private CardinalConfigurationParameters getEnrolled;

        public DHUwithSHA256CKDF(ASN1ObjectIdentifier aSN1ObjectIdentifier, CardinalConfigurationParameters cardinalConfigurationParameters) {
            this.getEciFlag = aSN1ObjectIdentifier;
            this.getEnrolled = cardinalConfigurationParameters;
        }

        DHUwithSHA256CKDF(isEnableLogging isenablelogging) {
            Enumeration init = isenablelogging.init();
            this.getEciFlag = (ASN1ObjectIdentifier) init.nextElement();
            if (init.hasMoreElements()) {
                setEnableLogging setenablelogging = (setEnableLogging) init.nextElement();
                this.getEnrolled = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
            }
            this.Payload = isenablelogging instanceof getPaResStatus;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.getEciFlag);
            if (this.getEnrolled != null) {
                getbackgroundcolor.getInstance.addElement(new Payload(true, 0, this.getEnrolled));
            }
            return this.Payload ? new getPaResStatus(getbackgroundcolor) : new DSTU4145.Mappings(getbackgroundcolor);
        }
    }

    public final class DHUwithSHA256KDF extends setRenderType {
        public BigInteger cca_continue;
        public BigInteger init;

        public DHUwithSHA256KDF(BigInteger bigInteger, BigInteger bigInteger2) {
            this.init = bigInteger;
            this.cca_continue = bigInteger2;
        }

        public DHUwithSHA256KDF(isEnableLogging isenablelogging) {
            if (isenablelogging.cca_continue() == 2) {
                Enumeration init2 = isenablelogging.init();
                this.init = new BigInteger(1, setEnvironment.getInstance(init2.nextElement()).getInstance);
                this.cca_continue = new BigInteger(1, setEnvironment.getInstance(init2.nextElement()).getInstance);
                return;
            }
            throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.init));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.cca_continue));
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class DHUwithSHA384CKDF extends setRenderType implements DHUwithSHA224CKDF {
        private setEnvironment Payload;
        public setEnableDFSync getEciFlag;
        public setEnableDFSync getEnrolled;
        private setEnableDFSync getSignatureVerification;
        private setEnableDFSync isEnabledDiscover;
        private DHUwithSHA256CKDF isEnabledPaypal;

        public DHUwithSHA384CKDF(setEnvironment setenvironment, setEnableDFSync setenabledfsync, DHUwithSHA256CKDF dHUwithSHA256CKDF, setEnableDFSync setenabledfsync2, setEnableDFSync setenabledfsync3, setEnableDFSync setenabledfsync4) {
            this.Payload = setenvironment;
            this.getSignatureVerification = setenabledfsync;
            this.isEnabledPaypal = dHUwithSHA256CKDF;
            this.getEciFlag = setenabledfsync2;
            this.getEnrolled = setenabledfsync3;
            this.isEnabledDiscover = setenabledfsync4;
        }

        public static DHUwithSHA384CKDF cca_continue(Object obj) {
            if (obj != null) {
                return new DHUwithSHA384CKDF(isEnableLogging.getInstance(obj));
            }
            return null;
        }

        private DHUwithSHA384CKDF(isEnableLogging isenablelogging) {
            Enumeration init = isenablelogging.init();
            this.Payload = (setEnvironment) init.nextElement();
            this.getSignatureVerification = (setEnableDFSync) init.nextElement();
            Object nextElement = init.nextElement();
            this.isEnabledPaypal = nextElement instanceof DHUwithSHA256CKDF ? (DHUwithSHA256CKDF) nextElement : nextElement != null ? new DHUwithSHA256CKDF(isEnableLogging.getInstance(nextElement)) : null;
            while (init.hasMoreElements()) {
                getThreeDSRequestorAppURL getthreedsrequestorappurl = (getThreeDSRequestorAppURL) init.nextElement();
                if (getthreedsrequestorappurl instanceof setEnableLogging) {
                    setEnableLogging setenablelogging = (setEnableLogging) getthreedsrequestorappurl;
                    int i = setenablelogging.Cardinal;
                    if (i == 0) {
                        this.getEciFlag = setEnableDFSync.init(setenablelogging);
                    } else if (i == 1) {
                        this.getEnrolled = setEnableDFSync.init(setenablelogging);
                    } else {
                        throw new IllegalArgumentException(new StringBuilder("unknown tag value ").append(setenablelogging.Cardinal).toString());
                    }
                } else {
                    this.isEnabledDiscover = (setEnableDFSync) getthreedsrequestorappurl;
                }
            }
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.Payload);
            getbackgroundcolor.getInstance.addElement(this.getSignatureVerification);
            getbackgroundcolor.getInstance.addElement(this.isEnabledPaypal);
            if (this.getEciFlag != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(false, 0, this.getEciFlag));
            }
            if (this.getEnrolled != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(false, 1, this.getEnrolled));
            }
            getbackgroundcolor.getInstance.addElement(this.isEnabledDiscover);
            return new getPaResStatus(getbackgroundcolor);
        }
    }

    public final class DHUwithSHA384KDF extends setRenderType {
        private static BCDSAPrivateKey cleanup = new BCDSAPrivateKey(DHUwithSHA224CKDF.onCReqSuccess, init);
        private static BCDSAPrivateKey init = new BCDSAPrivateKey(DHUwithSHA1KDF.onValidated, isEnabledVisaCheckout.configure);
        private static setEnvironment onCReqSuccess = new setEnvironment(20);
        private static setEnvironment onValidated = new setEnvironment(1);
        public setEnvironment Cardinal;
        public BCDSAPrivateKey cca_continue;
        public setEnvironment configure;
        public BCDSAPrivateKey getInstance;

        public DHUwithSHA384KDF() {
            this.getInstance = init;
            this.cca_continue = cleanup;
            this.Cardinal = onCReqSuccess;
            this.configure = onValidated;
        }

        public DHUwithSHA384KDF(BCDSAPrivateKey bCDSAPrivateKey, BCDSAPrivateKey bCDSAPrivateKey2, setEnvironment setenvironment, setEnvironment setenvironment2) {
            this.getInstance = bCDSAPrivateKey;
            this.cca_continue = bCDSAPrivateKey2;
            this.Cardinal = setenvironment;
            this.configure = setenvironment2;
        }

        public static DHUwithSHA384KDF configure(Object obj) {
            if (obj instanceof DHUwithSHA384KDF) {
                return (DHUwithSHA384KDF) obj;
            }
            if (obj != null) {
                return new DHUwithSHA384KDF(isEnableLogging.getInstance(obj));
            }
            return null;
        }

        /* JADX WARNING: type inference failed for: r3v6, types: [com.cardinalcommerce.a.getThreeDSRequestorAppURL] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.cardinalcommerce.a.getThreeDSRequestorAppURL] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private DHUwithSHA384KDF(com.cardinalcommerce.a.isEnableLogging r6) {
            /*
                r5 = this;
                r5.<init>()
                com.cardinalcommerce.a.BCDSAPrivateKey r0 = init
                r5.getInstance = r0
                com.cardinalcommerce.a.BCDSAPrivateKey r0 = cleanup
                r5.cca_continue = r0
                com.cardinalcommerce.a.setEnvironment r0 = onCReqSuccess
                r5.Cardinal = r0
                com.cardinalcommerce.a.setEnvironment r0 = onValidated
                r5.configure = r0
                r0 = 0
            L_0x0014:
                int r1 = r6.cca_continue()
                if (r0 == r1) goto L_0x007e
                com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r6.init(r0)
                com.cardinalcommerce.a.setEnableLogging r1 = (com.cardinalcommerce.a.setEnableLogging) r1
                int r2 = r1.Cardinal
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x006a
                if (r2 == r4) goto L_0x0058
                r4 = 2
                if (r2 == r4) goto L_0x0047
                r4 = 3
                if (r2 != r4) goto L_0x003f
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r1.configure
                if (r2 == 0) goto L_0x0038
                com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r1.configure
                com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r1.onCReqSuccess()
            L_0x0038:
                com.cardinalcommerce.a.setEnvironment r1 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r3)
                r5.configure = r1
                goto L_0x007b
            L_0x003f:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "unknown tag"
                r6.<init>(r0)
                throw r6
            L_0x0047:
                com.cardinalcommerce.a.CardinalConfigurationParameters r2 = r1.configure
                if (r2 == 0) goto L_0x0051
                com.cardinalcommerce.a.CardinalConfigurationParameters r1 = r1.configure
                com.cardinalcommerce.a.getThreeDSRequestorAppURL r3 = r1.onCReqSuccess()
            L_0x0051:
                com.cardinalcommerce.a.setEnvironment r1 = com.cardinalcommerce.a.setEnvironment.getInstance((java.lang.Object) r3)
                r5.Cardinal = r1
                goto L_0x007b
            L_0x0058:
                com.cardinalcommerce.a.isEnableLogging r1 = com.cardinalcommerce.a.isEnableLogging.configure(r1, r4)
                if (r1 == 0) goto L_0x0067
                com.cardinalcommerce.a.BCDSAPrivateKey r3 = new com.cardinalcommerce.a.BCDSAPrivateKey
                com.cardinalcommerce.a.isEnableLogging r1 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r1)
                r3.<init>((com.cardinalcommerce.a.isEnableLogging) r1)
            L_0x0067:
                r5.cca_continue = r3
                goto L_0x007b
            L_0x006a:
                com.cardinalcommerce.a.isEnableLogging r1 = com.cardinalcommerce.a.isEnableLogging.configure(r1, r4)
                if (r1 == 0) goto L_0x0079
                com.cardinalcommerce.a.BCDSAPrivateKey r3 = new com.cardinalcommerce.a.BCDSAPrivateKey
                com.cardinalcommerce.a.isEnableLogging r1 = com.cardinalcommerce.a.isEnableLogging.getInstance((java.lang.Object) r1)
                r3.<init>((com.cardinalcommerce.a.isEnableLogging) r1)
            L_0x0079:
                r5.getInstance = r3
            L_0x007b:
                int r0 = r0 + 1
                goto L_0x0014
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.DHUwithSHA384KDF.<init>(com.cardinalcommerce.a.isEnableLogging):void");
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            if (!this.getInstance.equals(init)) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 0, this.getInstance));
            }
            if (!this.cca_continue.equals(cleanup)) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 1, this.cca_continue));
            }
            if (!this.Cardinal.equals(onCReqSuccess)) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 2, this.Cardinal));
            }
            if (!this.configure.equals(onValidated)) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 3, this.configure));
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class DHUwithSHA512CKDF extends setRenderType {
        public BigInteger Cardinal;
        public BigInteger cca_continue;
        private BigInteger cleanup;
        public BigInteger configure;
        public BigInteger getInstance;
        public BigInteger getSDKVersion;
        public BigInteger getWarnings;
        public BigInteger init;
        public BigInteger onCReqSuccess;
        private isEnableLogging onValidated;

        public DHUwithSHA512CKDF(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
            this.onValidated = null;
            this.cleanup = BigInteger.valueOf(0);
            this.getInstance = bigInteger;
            this.configure = bigInteger2;
            this.Cardinal = bigInteger3;
            this.init = bigInteger4;
            this.cca_continue = bigInteger5;
            this.getSDKVersion = bigInteger6;
            this.getWarnings = bigInteger7;
            this.onCReqSuccess = bigInteger8;
        }

        public DHUwithSHA512CKDF(isEnableLogging isenablelogging) {
            this.onValidated = null;
            Enumeration init2 = isenablelogging.init();
            BigInteger bigInteger = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
            if (bigInteger.intValue() == 0 || bigInteger.intValue() == 1) {
                this.cleanup = bigInteger;
                this.getInstance = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                this.configure = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                this.Cardinal = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                this.init = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                this.cca_continue = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                this.getSDKVersion = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                this.getWarnings = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                this.onCReqSuccess = new BigInteger(((setEnvironment) init2.nextElement()).getInstance);
                if (init2.hasMoreElements()) {
                    this.onValidated = (isEnableLogging) init2.nextElement();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("wrong version for RSA private key");
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.cleanup));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.getInstance));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.configure));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.Cardinal));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.init));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.cca_continue));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.getSDKVersion));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.getWarnings));
            getbackgroundcolor.getInstance.addElement(new setEnvironment(this.onCReqSuccess));
            isEnableLogging isenablelogging = this.onValidated;
            if (isenablelogging != null) {
                getbackgroundcolor.getInstance.addElement(isenablelogging);
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class DHUwithSHA512KDF extends setRenderType {
        private static BCDSAPrivateKey Cardinal = new BCDSAPrivateKey(DHUwithSHA224CKDF.onCReqSuccess, configure);
        private static BCDSAPrivateKey configure = new BCDSAPrivateKey(DHUwithSHA1KDF.onValidated, isEnabledVisaCheckout.configure);
        private static BCDSAPrivateKey getSDKVersion = new BCDSAPrivateKey(DHUwithSHA224CKDF.getWarnings, new setEnabledVisaCheckout(new byte[0]));
        public BCDSAPrivateKey cca_continue;
        public BCDSAPrivateKey getInstance;
        public BCDSAPrivateKey init;

        public DHUwithSHA512KDF() {
            this.getInstance = configure;
            this.cca_continue = Cardinal;
            this.init = getSDKVersion;
        }

        public DHUwithSHA512KDF(BCDSAPrivateKey bCDSAPrivateKey, BCDSAPrivateKey bCDSAPrivateKey2, BCDSAPrivateKey bCDSAPrivateKey3) {
            this.getInstance = bCDSAPrivateKey;
            this.cca_continue = bCDSAPrivateKey2;
            this.init = bCDSAPrivateKey3;
        }

        public static DHUwithSHA512KDF init(Object obj) {
            if (obj != null) {
                return new DHUwithSHA512KDF(isEnableLogging.getInstance(obj));
            }
            return null;
        }

        private DHUwithSHA512KDF(isEnableLogging isenablelogging) {
            this.getInstance = configure;
            this.cca_continue = Cardinal;
            this.init = getSDKVersion;
            for (int i = 0; i != isenablelogging.cca_continue(); i++) {
                setEnableLogging setenablelogging = (setEnableLogging) isenablelogging.init(i);
                int i2 = setenablelogging.Cardinal;
                BCDSAPrivateKey bCDSAPrivateKey = null;
                if (i2 == 0) {
                    isEnableLogging configure2 = isEnableLogging.configure(setenablelogging, true);
                    this.getInstance = configure2 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) configure2)) : bCDSAPrivateKey;
                } else if (i2 == 1) {
                    isEnableLogging configure3 = isEnableLogging.configure(setenablelogging, true);
                    this.cca_continue = configure3 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) configure3)) : bCDSAPrivateKey;
                } else if (i2 == 2) {
                    isEnableLogging configure4 = isEnableLogging.configure(setenablelogging, true);
                    this.init = configure4 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) configure4)) : bCDSAPrivateKey;
                } else {
                    throw new IllegalArgumentException("unknown tag");
                }
            }
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            if (!this.getInstance.equals(configure)) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 0, this.getInstance));
            }
            if (!this.cca_continue.equals(Cardinal)) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 1, this.cca_continue));
            }
            if (!this.init.equals(getSDKVersion)) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 2, this.init));
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public interface DHwithRFC2631KDF {
        public static final ASN1ObjectIdentifier Cardinal;
        public static final ASN1ObjectIdentifier CardinalActionCode;
        public static final ASN1ObjectIdentifier CardinalChallengeObserver;
        public static final ASN1ObjectIdentifier CardinalConfigurationParameters;
        public static final ASN1ObjectIdentifier CardinalEnvironment;
        public static final ASN1ObjectIdentifier CardinalError;
        public static final ASN1ObjectIdentifier CardinalRenderType;
        public static final ASN1ObjectIdentifier CardinalUiType;
        public static final ASN1ObjectIdentifier ExtendedData;
        public static final ASN1ObjectIdentifier cca_continue;
        public static final ASN1ObjectIdentifier cleanup;
        public static final ASN1ObjectIdentifier configure;
        public static final ASN1ObjectIdentifier getActionCode;
        public static final ASN1ObjectIdentifier getChallengeTimeout;
        public static final ASN1ObjectIdentifier getEciFlag;
        public static final ASN1ObjectIdentifier getEnvironment;
        public static final ASN1ObjectIdentifier getInstance;
        public static final ASN1ObjectIdentifier getJSON;
        public static final ASN1ObjectIdentifier getPaResStatus;
        public static final ASN1ObjectIdentifier getProxyAddress;
        public static final ASN1ObjectIdentifier getRenderType;
        public static final ASN1ObjectIdentifier getRequestTimeout;
        public static final ASN1ObjectIdentifier getSDKVersion;
        public static final ASN1ObjectIdentifier getString;
        public static final ASN1ObjectIdentifier getThreeDSRequestorAppURL;
        public static final ASN1ObjectIdentifier getUICustomization;
        public static final ASN1ObjectIdentifier getUiType;
        public static final ASN1ObjectIdentifier getWarnings;
        public static final ASN1ObjectIdentifier init;
        public static final ASN1ObjectIdentifier isEnableDFSync;
        public static final ASN1ObjectIdentifier isEnableLogging;
        public static final ASN1ObjectIdentifier isLocationDataConsentGiven;
        public static final ASN1ObjectIdentifier onCReqSuccess;
        public static final ASN1ObjectIdentifier onValidated;
        public static final ASN1ObjectIdentifier setChallengeTimeout;
        public static final ASN1ObjectIdentifier setEnableDFSync;
        public static final ASN1ObjectIdentifier setEnableLogging;
        public static final ASN1ObjectIdentifier setEnvironment;
        public static final ASN1ObjectIdentifier setLocationDataConsentGiven;
        public static final ASN1ObjectIdentifier setProxyAddress;
        public static final ASN1ObjectIdentifier setRenderType = GMCipherSpi.SM2withMD5.isLocationDataConsentGiven;
        public static final ASN1ObjectIdentifier setRequestTimeout;
        public static final ASN1ObjectIdentifier setThreeDSRequestorAppURL;
        public static final ASN1ObjectIdentifier setUICustomization = GMCipherSpi.SM2withMD5.isEnableDFSync;
        public static final ASN1ObjectIdentifier setUiType;
        public static final ASN1ObjectIdentifier valueOf;
        public static final ASN1ObjectIdentifier values;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.132.0");
            Cardinal = aSN1ObjectIdentifier;
            init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
            getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2");
            configure = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ExifInterface.GPS_MEASUREMENT_3D);
            cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4");
            getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "5");
            onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "6");
            onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "7");
            getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "8");
            cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "9");
            CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "10");
            valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "15");
            CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "16");
            values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "17");
            CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "22");
            getActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "23");
            getString = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "24");
            CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "25");
            CardinalChallengeObserver = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "26");
            CardinalActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "27");
            setRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "28");
            getChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "29");
            getRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "30");
            CardinalConfigurationParameters = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "31");
            setChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "32");
            getProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "33");
            setProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "34");
            getUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "35");
            getEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "36");
            setEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "37");
            getRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "38");
            setUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "39");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("1.3.132.1");
            getUICustomization = aSN1ObjectIdentifier2;
            getThreeDSRequestorAppURL = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "11.0");
            setThreeDSRequestorAppURL = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "11.1");
            setEnableDFSync = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "11.2");
            isEnableLogging = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "11.3");
            isEnableDFSync = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "14.0");
            ExtendedData = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "14.1");
            setEnableLogging = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "14.2");
            isLocationDataConsentGiven = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "14.3");
            getJSON = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "15.0");
            setLocationDataConsentGiven = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "15.1");
            getEciFlag = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "15.2");
            getPaResStatus = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "15.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "16.0");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "16.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "16.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "16.3");
        }
    }

    public final class DHwithSHA1CKDF extends setRenderType {
        public isEnableLogging getInstance;

        public DHwithSHA1CKDF(int i, BigInteger bigInteger, CardinalConfigurationParameters cardinalConfigurationParameters) {
            this(i, bigInteger, (getDeviceFingerprint) null, cardinalConfigurationParameters);
        }

        public DHwithSHA1CKDF(isEnableLogging isenablelogging) {
            this.getInstance = isenablelogging;
        }

        public final getThreeDSRequestorAppURL Cardinal() {
            return Cardinal(0);
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.getInstance;
        }

        public DHwithSHA1CKDF(int i, BigInteger bigInteger, getDeviceFingerprint getdevicefingerprint, CardinalConfigurationParameters cardinalConfigurationParameters) {
            byte[] instance = setCornerRadius.getInstance((i + 7) / 8, bigInteger);
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(new setEnvironment(1));
            getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(instance));
            if (cardinalConfigurationParameters != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 0, cardinalConfigurationParameters));
            }
            if (getdevicefingerprint != null) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 1, getdevicefingerprint));
            }
            this.getInstance = new getProcessorTransactionId(getbackgroundcolor);
        }

        public final getThreeDSRequestorAppURL Cardinal(int i) {
            Enumeration init = this.getInstance.init();
            while (true) {
                getThreeDSRequestorAppURL getthreedsrequestorappurl = null;
                if (!init.hasMoreElements()) {
                    return null;
                }
                CardinalConfigurationParameters cardinalConfigurationParameters = (CardinalConfigurationParameters) init.nextElement();
                if (cardinalConfigurationParameters instanceof setEnableLogging) {
                    setEnableLogging setenablelogging = (setEnableLogging) cardinalConfigurationParameters;
                    if (setenablelogging.Cardinal == i) {
                        if (setenablelogging.configure != null) {
                            getthreedsrequestorappurl = setenablelogging.configure.onCReqSuccess();
                        }
                        return getthreedsrequestorappurl.onCReqSuccess();
                    }
                }
            }
        }
    }

    public final class DHwithSHA1KDF {
        private static BCECPublicKey Cardinal = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297", 16), new BigInteger("6A91174076B1E0E19C39C031FE8685C1CAE040E5C69A28EF", 16), new BigInteger("469A28EF7C28CCA3DC721D044F4496BCCA7EF4146FBF25C9", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04C0A0647EAAB6A48753B033C56CB0F0900A2F5C4853375FD614B690866ABD5BB88B5F4828C1490002E6773FA2FA299B8F")), bigInteger, bigInteger2);
            }
        };
        private static Hashtable CardinalChallengeObserver = new Hashtable();
        private static BCECPublicKey CardinalEnvironment = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA70330870553E5C414CA92619418661197FAC10471DB1D381085DDADDB58796829CA90069", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F3", 16), new BigInteger("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F0", 16), new BigInteger("7CBBBCF9441CFAB76E1890E46884EAE321F70C0BCB4981527897504BEC3E36A62BCDFA2304976540F6450085F2DAE145C22553B465763689180EA2571867423E", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04640ECE5C12788717B9C1BA06CBC2A6FEBA85842458C56DDE9DB1758D39C0313D82BA51735CDB3EA499AA77A7D6943A64F7A3F25FE26F06B51BAA2696FA9035DA5B534BD595F5AF0FA2C892376C84ACE1BB4E3019B71634C01131159CAE03CEE9D9932184BEEF216BD71DF2DADF86A627306ECFF96DBB8BACE198B61E00F8B332")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey CardinalError = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53", 16), new BigInteger("7BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826", 16), new BigInteger("4A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C11", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("041D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C5315")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey CardinalRenderType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA70330870553E5C414CA92619418661197FAC10471DB1D381085DDADDB58796829CA90069", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F3", 16), new BigInteger("7830A3318B603B89E2327145AC234CC594CBDD8D3DF91610A83441CAEA9863BC2DED5D5AA8253AA10A2EF1C98B9AC8B57F1117A72BF2C7B9E7C1AC4D77FC94CA", 16), new BigInteger("3DF91610A83441CAEA9863BC2DED5D5AA8253AA10A2EF1C98B9AC8B57F1117A72BF2C7B9E7C1AC4D77FC94CADC083E67984050B75EBAE5DD2809BD638016F723", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0481AEE4BDD82ED9645A21322E9C4C6A9385ED9F70B5D916C1B43B62EEF4D0098EFF3B1F78E2D0D48D50D1687B93B97D5F7C6D5047406A5E688B352209BCB9F8227DDE385D566332ECC0EABFA9CF7822FDF209F70024A57B1AA000C55B881F8111B2DCDE494A5F485E5BCA4BD88A2763AED1CA2B2FA8F0540678CD1E0F3AD80892")), bigInteger, bigInteger2);
            }
        };
        private static Hashtable CardinalUiType = new Hashtable();
        private static BCECPublicKey cca_continue = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("E95E4A5F737059DC60DF5991D45029409E60FC09", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620F", 16), new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620C", 16), new BigInteger("7A556B6DAE535B7B51ED2C4D7DAA7A0B5C55F380", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04B199B13B9B34EFC1397E64BAEB05ACC265FF2378ADD6718B7C7C1961F0991B842443772152C9E0AD")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey cleanup = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377", 16), new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5374", 16), new BigInteger("662C61C430D84EA4FE66A7733D0B76B7BF93EBC4AF2F49256AE58101FEE92B04", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04A3E8EB3CC1CFE7B7732213B23A656149AFA142C47AAFBC2B79A191562E1305F42D996C823439C56D7F7B22E14644417E69BCB6DE39D027001DABE8F35B25C9BE")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey configure = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297", 16), new BigInteger("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86294", 16), new BigInteger("13D56FFAEC78681E68F9DEB43B35BEC2FB68542E27897B79", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("043AE9E58C82F63C30282E1FE7BBF43FA72C446AF6F4618129097E2C5667C2223A902AB5CA449D0084B7E5B3DE7CCC01C9")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey getInstance = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("E95E4A5F737059DC60DF5991D45029409E60FC09", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620F", 16), new BigInteger("340E7BE2A280EB74E2BE61BADA745D97E8F7C300", 16), new BigInteger("1E589A8595423412134FAA2DBDEC95C8D8675E58", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04BED5AF16EA3F6A4F62938C4631EB5AF7BDBCDBC31667CB477A1A8EC338F94741669C976316DA6321")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey getSDKVersion = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF", 16), new BigInteger("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FC", 16), new BigInteger("4B337D934104CD7BEF271BF60CED1ED20DA14C08B3BB64F18A60888D", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("046AB1E344CE25FF3896424E7FFE14762ECB49F8928AC0C76029B4D5800374E9F5143E568CD23F3F4D7C0D4B1E41C8CC0D1C6ABD5F1A46DB4C")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey getWarnings = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA5B68F12A32D482EC7EE8658E98691555B44C59311", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E27", 16), new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E24", 16), new BigInteger("A7F561E038EB1ED560B3D147DB782013064C19F27ED27C6780AAF77FB8A547CEB5B4FEF422340353", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04925BE9FB01AFC6FB4D3E7D4990010F813408AB106C4F09CB7EE07868CC136FFF3357F624A21BED5263BA3A7A27483EBF6671DBEF7ABB30EBEE084E58A0B077AD42A5A0989D1EE71B1B9BC0455FB0D2C3")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey init = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF", 16), new BigInteger("68A5E62CA9CE6C1C299803A6C1530B514E182AD8B0042A59CAD29F43", 16), new BigInteger("2580F63CCFE44138870713B1A92369E33E2135D266DBB372386C400B", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("040D9029AD2C7E5CF4340823B2A87DC68C9E4CE3174C1E6EFDEE12C07D58AA56F772C0726F24C6B89E4ECDAC24354B9E99CAA3F6D3761402CD")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey onCReqSuccess = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377", 16), new BigInteger("7D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9", 16), new BigInteger("26DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B6", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F046997")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey onValidated = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA5B68F12A32D482EC7EE8658E98691555B44C59311", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E27", 16), new BigInteger("3EE30B568FBAB0F883CCEBD46D3F3BB8A2A73513F5EB79DA66190EB085FFA9F492F375A97D860EB4", 16), new BigInteger("520883949DFDBC42D3AD198640688A6FE13F41349554B49ACC31DCCD884539816F5EB4AC8FB1F1A6", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0443BD7E9AFB53D8B85289BCC48EE5BFE6F20137D10A087EB6E7871E2A10A599C710AF8D0D39E2061114FDD05545EC1CC8AB4093247F77275E0743FFED117182EAA9C77877AAAC6AC7D35245D1692E8EE1")), bigInteger, bigInteger2);
            }
        };
        private static BCECPublicKey valueOf = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = new BigInteger("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565", 16);
                BigInteger bigInteger2 = new BigInteger("01", 16);
                toJSONString configure = DHwithSHA1KDF.configure((toJSONString) new toJSONString.getInstance(new BigInteger("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53", 16), new BigInteger("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC50", 16), new BigInteger("7F519EADA7BDA81BD826DBA647910F8C4B9346ED8CCDC64E4B1ABD11756DCE1D2074AA263B88805CED70355A33B471EE", 16), bigInteger, bigInteger2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0418DE98B02DB9A306F2AFCD7235F72A819B80AB12EBD653172476FECD462AABFFC4FF191B946A5F54D8D0AA2F418808CC25AB056962D30651A114AFD2755AD336747F93475B7A1FCA3B88F2B6A208CCFE469408584DC2B2912675BF5B9E582928")), bigInteger, bigInteger2);
            }
        };
        private static Hashtable values = new Hashtable();

        public static Enumeration Cardinal() {
            return CardinalUiType.elements();
        }

        public static GMCipherSpi configure(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            BCECPublicKey bCECPublicKey = (BCECPublicKey) CardinalChallengeObserver.get(aSN1ObjectIdentifier);
            if (bCECPublicKey != null) {
                return bCECPublicKey.Cardinal();
            }
            return null;
        }

        static /* synthetic */ toJSONString configure(toJSONString tojsonstring) {
            return tojsonstring;
        }

        public static ASN1ObjectIdentifier configure(String str) {
            return (ASN1ObjectIdentifier) values.get(getTextFontSize.Cardinal(str));
        }

        public static String getInstance(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            return (String) CardinalUiType.get(aSN1ObjectIdentifier);
        }

        public static GMCipherSpi getInstance(String str) {
            BCECPublicKey bCECPublicKey;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) values.get(getTextFontSize.Cardinal(str));
            if (aSN1ObjectIdentifier == null || (bCECPublicKey = (BCECPublicKey) CardinalChallengeObserver.get(aSN1ObjectIdentifier)) == null) {
                return null;
            }
            return bCECPublicKey.Cardinal();
        }

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = DHwithSHA384KDF.valueOf;
            BCECPublicKey bCECPublicKey = getInstance;
            values.put(getTextFontSize.Cardinal("brainpoolP160r1"), aSN1ObjectIdentifier);
            CardinalUiType.put(aSN1ObjectIdentifier, "brainpoolP160r1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier, bCECPublicKey);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = DHwithSHA384KDF.CardinalRenderType;
            BCECPublicKey bCECPublicKey2 = cca_continue;
            values.put(getTextFontSize.Cardinal("brainpoolP160t1"), aSN1ObjectIdentifier2);
            CardinalUiType.put(aSN1ObjectIdentifier2, "brainpoolP160t1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier2, bCECPublicKey2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = DHwithSHA384KDF.CardinalError;
            BCECPublicKey bCECPublicKey3 = Cardinal;
            values.put(getTextFontSize.Cardinal("brainpoolP192r1"), aSN1ObjectIdentifier3);
            CardinalUiType.put(aSN1ObjectIdentifier3, "brainpoolP192r1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier3, bCECPublicKey3);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = DHwithSHA384KDF.CardinalChallengeObserver;
            BCECPublicKey bCECPublicKey4 = configure;
            values.put(getTextFontSize.Cardinal("brainpoolP192t1"), aSN1ObjectIdentifier4);
            CardinalUiType.put(aSN1ObjectIdentifier4, "brainpoolP192t1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier4, bCECPublicKey4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = DHwithSHA384KDF.CardinalActionCode;
            BCECPublicKey bCECPublicKey5 = init;
            values.put(getTextFontSize.Cardinal("brainpoolP224r1"), aSN1ObjectIdentifier5);
            CardinalUiType.put(aSN1ObjectIdentifier5, "brainpoolP224r1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier5, bCECPublicKey5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = DHwithSHA384KDF.getActionCode;
            BCECPublicKey bCECPublicKey6 = getSDKVersion;
            values.put(getTextFontSize.Cardinal("brainpoolP224t1"), aSN1ObjectIdentifier6);
            CardinalUiType.put(aSN1ObjectIdentifier6, "brainpoolP224t1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier6, bCECPublicKey6);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = DHwithSHA384KDF.CardinalUiType;
            BCECPublicKey bCECPublicKey7 = onCReqSuccess;
            values.put(getTextFontSize.Cardinal("brainpoolP256r1"), aSN1ObjectIdentifier7);
            CardinalUiType.put(aSN1ObjectIdentifier7, "brainpoolP256r1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier7, bCECPublicKey7);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = DHwithSHA384KDF.getString;
            BCECPublicKey bCECPublicKey8 = cleanup;
            values.put(getTextFontSize.Cardinal("brainpoolP256t1"), aSN1ObjectIdentifier8);
            CardinalUiType.put(aSN1ObjectIdentifier8, "brainpoolP256t1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier8, bCECPublicKey8);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = DHwithSHA384KDF.getChallengeTimeout;
            BCECPublicKey bCECPublicKey9 = onValidated;
            values.put(getTextFontSize.Cardinal("brainpoolP320r1"), aSN1ObjectIdentifier9);
            CardinalUiType.put(aSN1ObjectIdentifier9, "brainpoolP320r1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier9, bCECPublicKey9);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = DHwithSHA384KDF.getRequestTimeout;
            BCECPublicKey bCECPublicKey10 = getWarnings;
            values.put(getTextFontSize.Cardinal("brainpoolP320t1"), aSN1ObjectIdentifier10);
            CardinalUiType.put(aSN1ObjectIdentifier10, "brainpoolP320t1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier10, bCECPublicKey10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = DHwithSHA384KDF.CardinalConfigurationParameters;
            BCECPublicKey bCECPublicKey11 = CardinalError;
            values.put(getTextFontSize.Cardinal("brainpoolP384r1"), aSN1ObjectIdentifier11);
            CardinalUiType.put(aSN1ObjectIdentifier11, "brainpoolP384r1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier11, bCECPublicKey11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = DHwithSHA384KDF.setRequestTimeout;
            BCECPublicKey bCECPublicKey12 = valueOf;
            values.put(getTextFontSize.Cardinal("brainpoolP384t1"), aSN1ObjectIdentifier12);
            CardinalUiType.put(aSN1ObjectIdentifier12, "brainpoolP384t1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier12, bCECPublicKey12);
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = DHwithSHA384KDF.setChallengeTimeout;
            BCECPublicKey bCECPublicKey13 = CardinalRenderType;
            values.put(getTextFontSize.Cardinal("brainpoolP512r1"), aSN1ObjectIdentifier13);
            CardinalUiType.put(aSN1ObjectIdentifier13, "brainpoolP512r1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier13, bCECPublicKey13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = DHwithSHA384KDF.setProxyAddress;
            BCECPublicKey bCECPublicKey14 = CardinalEnvironment;
            values.put(getTextFontSize.Cardinal("brainpoolP512t1"), aSN1ObjectIdentifier14);
            CardinalUiType.put(aSN1ObjectIdentifier14, "brainpoolP512t1");
            CardinalChallengeObserver.put(aSN1ObjectIdentifier14, bCECPublicKey14);
        }
    }

    public interface DHwithSHA224CKDF {
        public static final ASN1ObjectIdentifier Cardinal;
        public static final ASN1ObjectIdentifier CardinalEnvironment;
        public static final ASN1ObjectIdentifier CardinalError;
        public static final ASN1ObjectIdentifier CardinalRenderType;
        public static final ASN1ObjectIdentifier cca_continue;
        public static final ASN1ObjectIdentifier cleanup;
        public static final ASN1ObjectIdentifier configure;
        public static final ASN1ObjectIdentifier getInstance;
        public static final ASN1ObjectIdentifier getSDKVersion;
        public static final ASN1ObjectIdentifier getWarnings;
        public static final ASN1ObjectIdentifier init;
        public static final ASN1ObjectIdentifier onCReqSuccess;
        public static final ASN1ObjectIdentifier onValidated;
        public static final ASN1ObjectIdentifier valueOf;
        public static final ASN1ObjectIdentifier values;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier("1.2.643.7"), "1");
            configure = aSN1ObjectIdentifier;
            cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.2");
            init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.4.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.4.2");
            Cardinal = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.1");
            getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.2");
            getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.3.2");
            cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.3.3");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.6");
            onCReqSuccess = aSN1ObjectIdentifier2;
            onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
            getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2");
            values = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.1.1"), "1");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.1.2");
            CardinalRenderType = aSN1ObjectIdentifier3;
            valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1");
            CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
            CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, ExifInterface.GPS_MEASUREMENT_3D);
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.5.1.1");
        }
    }

    public final class DHwithSHA224KDF {
        private static BCECPublicKey Cardinal = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("DB7C2ABF62E35E668076BEAD208B");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("6127C24C05F38A0AAAF65C0EF02C");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("51DEF1815DB5ED74FCC34C85D709");
                byte[] init = getHeadingTextFontName.init("002757A1114D696E6768756151755316C05E0BD4");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("36DF0AAFD8B8D7597CA10520D04B");
                BigInteger valueOf = BigInteger.valueOf(4);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("044BA30AB5E892B4E1649DD0928643ADCD46F5882E3747DEF36E956E97")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey CardinalActionCode = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("00689918DBEC7E5A0DD6DFC0AA55C7");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("0095E9A9EC9B297BD4BF36E059184F");
                byte[] init = getHeadingTextFontName.init("10C0FB15760860DEF1EEF4D696E676875615175D");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("010000000000000108789B2496AF93");
                BigInteger valueOf = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(113, 9, instance, instance2, instance3, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0401A57A6A7B26CA5EF52FCDB816479700B3ADC94ED1FE674C06E695BABA1D")), instance3, valueOf, init);
            }
        };
        private static BCECPublicKey CardinalChallengeObserver = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("07A11B09A76B562144418FF3FF8C2570B8");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("0217C05610884B63B9C6C7291678F9D341");
                byte[] init = getHeadingTextFontName.init("4D696E676875615175985BD3ADBADA21B43A97E2");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("0400000000000000023123953A9464B54D");
                BigInteger valueOf = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init((int) Opcodes.LXOR, 2, 3, 8, instance, instance2, instance3, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("040081BAF91FDF9833C40F9C181343638399078C6E7EA38C001F73C8134B1B4EF9E150")), instance3, valueOf, init);
            }
        };
        private static BCECPublicKey CardinalConfigurationParameters = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF");
                BigInteger valueOf2 = BigInteger.valueOf(4);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(233, 74, bigInteger, valueOf, instance, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD612601DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3")), instance, valueOf2, (byte[]) null);
            }
        };
        private static BCECPublicKey CardinalEnvironment = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF");
                byte[] init = getHeadingTextFontName.init("A335926AA319A27A1D00896A6773A4827ACDAC73");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB73617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey CardinalError = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4");
                byte[] init = getHeadingTextFontName.init("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey CardinalRenderType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B");
                byte[] init = getHeadingTextFontName.init("C49D360886E704936A6678E1139D26B7819F7E90");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("046B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C2964FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey CardinalUiType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("003088250CA6E7C7FE649CE85820F7");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("00E8BEE4D3E2260744188BE0E9C723");
                byte[] init = getHeadingTextFontName.init("10E723AB14D696E6768756151756FEBF8FCB49A9");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("0100000000000000D9CCEC8A39E56F");
                BigInteger valueOf = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(113, 9, instance, instance2, instance3, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04009D73616F35F4AB1407D73562C10F00A52830277958EE84D1315ED31886")), instance3, valueOf, init);
            }
        };
        private static BCECPublicKey cca_continue = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("DB7C2ABF62E35E668076BEAD208B");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("DB7C2ABF62E35E668076BEAD2088");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("659EF8BA043916EEDE8911702B22");
                byte[] init = getHeadingTextFontName.init("00F50B028E4D696E676875615175290472783FB1");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("DB7C2ABF62E35E7628DFAC6561C5");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0409487239995A5EE76B55F9C2F098A89CE5AF8724C0A23E0E0FF77500")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey cleanup = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1");
                byte[] init = getHeadingTextFontName.init("3045AE6FC8422F64ED579528D38120EAE12196D5");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF101207192B95FFC8DA78631011ED6B24CDD573F977A11E794811")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey configure = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("D6031998D1B3BBFEBF59CC9BBFF9AEE1");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("5EEEFCA380D02919DC2C6558BB6D8A5D");
                byte[] init = getHeadingTextFontName.init("004D696E67687561517512D8F03431FCE63B88F4");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("3FFFFFFF7FFFFFFFBE0024720613B5A3");
                BigInteger valueOf = BigInteger.valueOf(4);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("047B6AA5D85E572983E6FB32A7CDEBC14027B6916A894D3AEE7106FE805FC34B44")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey getActionCode = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger valueOf2 = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("04000000000000000000020108A2E0CC0D99F8A5EF");
                BigInteger valueOf3 = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init((int) Opcodes.IF_ICMPGT, 3, 6, 7, valueOf, valueOf2, instance, valueOf3));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0402FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE80289070FB05D38FF58321F2E800536D538CCDAA3D9")), instance, valueOf3, (byte[]) null);
            }
        };
        private static BCECPublicKey getChallengeTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("020A601907B8C953CA1481EB10512F78744A3205FD");
                byte[] init = getHeadingTextFontName.init("85E25BFE5C86226CDB12016F7553F9D0E693A268");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("040000000000000000000292FE77E70C12A4234C33");
                BigInteger valueOf2 = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init((int) Opcodes.IF_ICMPGT, 3, 6, 7, valueOf, instance, instance2, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0403F0EBA16286A2D57EA0991168D4994637E8343E3600D51FBC6C71A0094FA2CDD545B11C5C0C797324F1")), instance2, valueOf2, init);
            }
        };
        private static BCECPublicKey getEnvironment = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61");
                BigInteger valueOf2 = BigInteger.valueOf(4);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(283, 5, 7, 12, bigInteger, valueOf, instance, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("040503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC245849283601CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259")), instance, valueOf2, (byte[]) null);
            }
        };
        private static BCECPublicKey getInstance = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("E87579C11079F43DD824993C2CEE5ED3");
                byte[] init = getHeadingTextFontName.init("000E0D4D696E6768756151750CC03A4473D03679");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("FFFFFFFE0000000075A30D1B9038A115");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04161FF7528B899B2D0C28607CA52C5B86CF5AC8395BAFEB13C02DA292DDED7A83")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey getProxyAddress = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF");
                BigInteger valueOf2 = BigInteger.valueOf(4);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(409, 87, bigInteger, valueOf, instance, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("040060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE902374601E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B")), instance, valueOf2, (byte[]) null);
            }
        };
        private static BCECPublicKey getRenderType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A");
                byte[] init = getHeadingTextFontName.init("2AA058F73A0E33AB486B0F610410C53A7F132310");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47");
                BigInteger valueOf2 = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(571, 2, 5, 10, valueOf, instance, instance2, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("040303001D34B856296C16C0D40D3CD7750A93D1D2955FA80AA5F40FC8DB7B2ABDBDE53950F4C0D293CDD711A35B67FB1499AE60038614F1394ABFA3B4C850D927E1E7769C8EEC2D19037BF27342DA639B6DCCFFFEB73D69D78C6C27A6009CBBCA1980F8533921E8A684423E43BAB08A576291AF8F461BB2A8B3531D2F0485C19B16E2F1516E23DD3C1A4827AF1B8AC15B")), instance2, valueOf2, init);
            }
        };
        private static BCECPublicKey getRequestTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9");
                byte[] init = getHeadingTextFontName.init("24B7B137C8A14D696E6768756151756FD0DA2E5C");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B");
                BigInteger valueOf = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init((int) Opcodes.IF_ICMPGT, 3, 6, 7, instance, instance2, instance3, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("040369979697AB43897789566789567F787A7876A65400435EDB42EFAFB2989D51FEFCE3C80988F41FF883")), instance3, valueOf, init);
            }
        };
        private static BCECPublicKey getSDKVersion = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D");
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(5);
                BigInteger instance2 = DHwithSHA224KDF.getInstance("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7");
                BigInteger valueOf2 = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure(new toJSONString.getInstance(instance, bigInteger, valueOf, instance2, valueOf2), new ECDH(new BigInteger("fe0e87005b4e83761908c5131d552a850b3f58b749c37cf5b84d6768", 16), new BigInteger("60dcd2104c4cbc0be6eeefc2bdd610739ec34e317f9b33046c9e4788", 16), new BigInteger[]{new BigInteger("6b8cf07d4ca75c88957d9d670591", 16), new BigInteger("-b8adf1378a6eb73409fa6c9c637d", 16)}, new BigInteger[]{new BigInteger("1243ae1b4d71613bc9f780a03690e", 16), new BigInteger("6b8cf07d4ca75c88957d9d670591", 16)}, new BigInteger("6b8cf07d4ca75c88957d9d67059037a4", 16), new BigInteger("b8adf1378a6eb73409fa6c9c637ba7f5", 16), 240));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5")), instance2, valueOf2, (byte[]) null);
            }
        };
        private static BCECPublicKey getString = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("03E5A88919D7CAFCBF415F07C2176573B2");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("04B8266A46C55657AC734CE38F018F2192");
                byte[] init = getHeadingTextFontName.init("985BD3ADBAD4D696E676875615175A21B43A97E3");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("0400000000000000016954A233049BA98F");
                BigInteger valueOf = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init((int) Opcodes.LXOR, 2, 3, 8, instance, instance2, instance3, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("040356DCD8F2F95031AD652D23951BB366A80648F06D867940A5366D9E265DE9EB240F")), instance3, valueOf, init);
            }
        };
        private static BCECPublicKey getUICustomization = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001");
                BigInteger valueOf2 = BigInteger.valueOf(4);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(571, 2, 5, 10, bigInteger, valueOf, instance, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C89720349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3")), instance, valueOf2, (byte[]) null);
            }
        };
        private static BCECPublicKey getUiType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD");
                byte[] init = getHeadingTextFontName.init("74D59FF07F6B413D0EA14B344B20A2DB049B50C3");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7");
                BigInteger valueOf2 = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(233, 74, valueOf, instance, instance2, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0400FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052")), instance2, valueOf2, init);
            }
        };
        private static BCECPublicKey getWarnings = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37");
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(3);
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D");
                BigInteger valueOf2 = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure(new toJSONString.getInstance(instance, bigInteger, valueOf, instance2, valueOf2), new ECDH(new BigInteger("bb85691939b869c1d087f601554b96b80cb4f55b35f433c2", 16), new BigInteger("3d84f26c12238d7b4f3d516613c1759033b1a5800175d0b1", 16), new BigInteger[]{new BigInteger("71169be7330b3038edb025f1", 16), new BigInteger("-b3fb3400dec5c4adceb8655c", 16)}, new BigInteger[]{new BigInteger("12511cfe811d0f4e6bc688b4d", 16), new BigInteger("71169be7330b3038edb025f1", 16)}, new BigInteger("71169be7330b3038edb025f1d0f9", 16), new BigInteger("b3fb3400dec5c4adceb8655d4c94", 16), JfifUtil.MARKER_RST0));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D")), instance2, valueOf2, (byte[]) null);
            }
        };
        private static BCECPublicKey init = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(7);
                BigInteger instance2 = DHwithSHA224KDF.getInstance("0100000000000000000001B8FA16DFAB9ACA16B6B3");
                BigInteger valueOf2 = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure(new toJSONString.getInstance(instance, bigInteger, valueOf, instance2, valueOf2), new ECDH(new BigInteger("9ba48cba5ebcb9b6bd33b92830b2a2e0e192f10a", 16), new BigInteger("c39c6c3b3a36d7701b9c71a1f5804ae5d0003f4", 16), new BigInteger[]{new BigInteger("9162fbe73984472a0a9e", 16), new BigInteger("-96341f1138933bc2f505", 16)}, new BigInteger[]{new BigInteger("127971af8721782ecffa3", 16), new BigInteger("9162fbe73984472a0a9e", 16)}, new BigInteger("9162fbe73984472a0a9d0590", 16), new BigInteger("96341f1138933bc2f503fd44", 16), Opcodes.ARETURN));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("043B4C382CE37AA192A4019E763036F4F5DD4D7EBB938CF935318FDCED6BC28286531733C3F03C4FEE")), instance2, valueOf2, (byte[]) null);
            }
        };
        private static Hashtable isEnableDFSync = new Hashtable();
        private static BCECPublicKey onCReqSuccess = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45");
                byte[] init = getHeadingTextFontName.init("1053CDE42C14D696E67687561517533BF3F83345");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("0100000000000000000001F4C8F927AED3CA752257");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("044A96B5688EF573284664698968C38BB913CBFC8223A628553168947D59DCC912042351377AC5FB32")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey onValidated = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("B4E134D3FB59EB8BAB57274904664D5AF50388BA");
                byte[] init = getHeadingTextFontName.init("B99B99B099B323E02709A4D696E6768756151751");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("0100000000000000000000351EE786A818F3A1A16B");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0452DCB034293A117E1F4FF11B30F7199D3144CE6DFEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey setChallengeTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814");
                byte[] init = getHeadingTextFontName.init("103FAEC74D696E676875615175777FC5B191EF30");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("01000000000000000000000000C7F34A778F443ACC920EBA49");
                BigInteger valueOf = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init((int) Opcodes.INSTANCEOF, 15, instance, instance2, instance3, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05")), instance3, valueOf, init);
            }
        };
        private static BCECPublicKey setEnvironment = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5");
                byte[] init = getHeadingTextFontName.init("77E2B07370EB0F832A6DD5B62DFC88CD06BB84BE");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307");
                BigInteger valueOf2 = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(283, 5, 7, 12, valueOf, instance, instance2, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0405F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B1205303676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4")), instance2, valueOf2, init);
            }
        };
        private static BCECPublicKey setProxyAddress = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5");
                BigInteger valueOf2 = BigInteger.valueOf(4);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(239, (int) Opcodes.IFLE, bigInteger, valueOf, instance, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0429A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA")), instance, valueOf2, (byte[]) null);
            }
        };
        private static BCECPublicKey setRenderType = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger valueOf = BigInteger.valueOf(1);
                BigInteger instance = DHwithSHA224KDF.getInstance("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F");
                byte[] init = getHeadingTextFontName.init("4099B5A457F9D69F79213D094C4BCD4D4262210B");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173");
                BigInteger valueOf2 = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init(409, 87, valueOf, instance, instance2, valueOf2));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("04015D4860D088DDB3496B0C6064756260441CDE4AF1771D4DB01FFE5B34E59703DC255A868A1180515603AEAB60794E54BB7996A70061B1CFAB6BE5F32BBFA78324ED106A7636B9C5A7BD198D0158AA4F5488D08F38514F1FDF4B4F40D2181B3681C364BA0273C706")), instance2, valueOf2, init);
            }
        };
        private static BCECPublicKey setRequestTimeout = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE");
                byte[] init = getHeadingTextFontName.init("10B7B4D696E676875615175137C8A16FD0DA2211");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("010000000000000000000000015AAB561B005413CCD4EE99D5");
                BigInteger valueOf = BigInteger.valueOf(2);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.init((int) Opcodes.INSTANCEOF, 15, instance, instance2, instance3, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0400D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C")), instance3, valueOf, init);
            }
        };
        private static Hashtable setUICustomization = new Hashtable();
        private static Hashtable setUiType = new Hashtable();
        private static BCECPublicKey valueOf = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
                BigInteger instance2 = DHwithSHA224KDF.getInstance("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC");
                BigInteger instance3 = DHwithSHA224KDF.getInstance("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00");
                byte[] init = getHeadingTextFontName.init("D09E8800291CB85396CC6717393284AAA0DA64BA");
                BigInteger instance4 = DHwithSHA224KDF.getInstance("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409");
                BigInteger valueOf = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure((toJSONString) new toJSONString.getInstance(instance, instance2, instance3, instance4, valueOf));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0400C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650")), instance4, valueOf, init);
            }
        };
        private static BCECPublicKey values = new BCECPublicKey() {
            public final GMCipherSpi getInstance() {
                BigInteger instance = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F");
                BigInteger bigInteger = writeJSONString.getSDKVersion;
                BigInteger valueOf = BigInteger.valueOf(7);
                BigInteger instance2 = DHwithSHA224KDF.getInstance("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141");
                BigInteger valueOf2 = BigInteger.valueOf(1);
                toJSONString configure = DHwithSHA224KDF.configure(new toJSONString.getInstance(instance, bigInteger, valueOf, instance2, valueOf2), new ECDH(new BigInteger("7ae96a2b657c07106e64479eac3434e99cf0497512f58995c1396c28719501ee", 16), new BigInteger("5363ad4cc05c30e0a5261c028812645a122e22ea20816678df02967c1b23bd72", 16), new BigInteger[]{new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16), new BigInteger("-e4437ed6010e88286f547fa90abfe4c3", 16)}, new BigInteger[]{new BigInteger("114ca50f7a8e2f3f657c1108d9d44cfd8", 16), new BigInteger("3086d221a7d46bcde86c90e49284eb15", 16)}, new BigInteger("3086d221a7d46bcde86c90e49284eb153dab", 16), new BigInteger("e4437ed6010e88286f547fa90abfe4c42212", 16), 272));
                return new GMCipherSpi(configure, new ECUtils(configure, getHeadingTextFontName.init("0479BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8")), instance2, valueOf2, (byte[]) null);
            }
        };

        public static GMCipherSpi configure(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            BCECPublicKey bCECPublicKey = (BCECPublicKey) setUICustomization.get(aSN1ObjectIdentifier);
            if (bCECPublicKey == null) {
                return null;
            }
            return bCECPublicKey.Cardinal();
        }

        static /* synthetic */ toJSONString configure(toJSONString tojsonstring) {
            return tojsonstring;
        }

        public static String getInstance(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            return (String) isEnableDFSync.get(aSN1ObjectIdentifier);
        }

        public static Enumeration getInstance() {
            return isEnableDFSync.elements();
        }

        public static ASN1ObjectIdentifier init(String str) {
            return (ASN1ObjectIdentifier) setUiType.get(getTextFontSize.Cardinal(str));
        }

        public static GMCipherSpi Cardinal(String str) {
            BCECPublicKey bCECPublicKey;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) setUiType.get(getTextFontSize.Cardinal(str));
            if (aSN1ObjectIdentifier == null || (bCECPublicKey = (BCECPublicKey) setUICustomization.get(aSN1ObjectIdentifier)) == null) {
                return null;
            }
            return bCECPublicKey.Cardinal();
        }

        static /* synthetic */ BigInteger getInstance(String str) {
            return new BigInteger(1, getHeadingTextFontName.init(str));
        }

        static /* synthetic */ toJSONString configure(toJSONString tojsonstring, ECDH ecdh) {
            toJSONString.configure configure2 = tojsonstring.configure();
            configure2.Cardinal = new AlgorithmSupportMessage(tojsonstring, ecdh);
            return configure2.cca_continue();
        }

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = DHwithRFC2631KDF.onValidated;
            BCECPublicKey bCECPublicKey = cca_continue;
            setUiType.put("secp112r1", aSN1ObjectIdentifier);
            isEnableDFSync.put(aSN1ObjectIdentifier, "secp112r1");
            setUICustomization.put(aSN1ObjectIdentifier, bCECPublicKey);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = DHwithRFC2631KDF.onCReqSuccess;
            BCECPublicKey bCECPublicKey2 = Cardinal;
            setUiType.put("secp112r2", aSN1ObjectIdentifier2);
            isEnableDFSync.put(aSN1ObjectIdentifier2, "secp112r2");
            setUICustomization.put(aSN1ObjectIdentifier2, bCECPublicKey2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = DHwithRFC2631KDF.setRequestTimeout;
            BCECPublicKey bCECPublicKey3 = getInstance;
            setUiType.put("secp128r1", aSN1ObjectIdentifier3);
            isEnableDFSync.put(aSN1ObjectIdentifier3, "secp128r1");
            setUICustomization.put(aSN1ObjectIdentifier3, bCECPublicKey3);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = DHwithRFC2631KDF.getChallengeTimeout;
            BCECPublicKey bCECPublicKey4 = configure;
            setUiType.put("secp128r2", aSN1ObjectIdentifier4);
            isEnableDFSync.put(aSN1ObjectIdentifier4, "secp128r2");
            setUICustomization.put(aSN1ObjectIdentifier4, bCECPublicKey4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = DHwithRFC2631KDF.cleanup;
            BCECPublicKey bCECPublicKey5 = init;
            setUiType.put("secp160k1", aSN1ObjectIdentifier5);
            isEnableDFSync.put(aSN1ObjectIdentifier5, "secp160k1");
            setUICustomization.put(aSN1ObjectIdentifier5, bCECPublicKey5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = DHwithRFC2631KDF.getSDKVersion;
            BCECPublicKey bCECPublicKey6 = onCReqSuccess;
            setUiType.put("secp160r1", aSN1ObjectIdentifier6);
            isEnableDFSync.put(aSN1ObjectIdentifier6, "secp160r1");
            setUICustomization.put(aSN1ObjectIdentifier6, bCECPublicKey6);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = DHwithRFC2631KDF.getRequestTimeout;
            BCECPublicKey bCECPublicKey7 = onValidated;
            setUiType.put("secp160r2", aSN1ObjectIdentifier7);
            isEnableDFSync.put(aSN1ObjectIdentifier7, "secp160r2");
            setUICustomization.put(aSN1ObjectIdentifier7, bCECPublicKey7);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = DHwithRFC2631KDF.CardinalConfigurationParameters;
            BCECPublicKey bCECPublicKey8 = getWarnings;
            setUiType.put("secp192k1", aSN1ObjectIdentifier8);
            isEnableDFSync.put(aSN1ObjectIdentifier8, "secp192k1");
            setUICustomization.put(aSN1ObjectIdentifier8, bCECPublicKey8);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = DHwithRFC2631KDF.setUICustomization;
            BCECPublicKey bCECPublicKey9 = cleanup;
            setUiType.put("secp192r1", aSN1ObjectIdentifier9);
            isEnableDFSync.put(aSN1ObjectIdentifier9, "secp192r1");
            setUICustomization.put(aSN1ObjectIdentifier9, bCECPublicKey9);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = DHwithRFC2631KDF.setChallengeTimeout;
            BCECPublicKey bCECPublicKey10 = getSDKVersion;
            setUiType.put("secp224k1", aSN1ObjectIdentifier10);
            isEnableDFSync.put(aSN1ObjectIdentifier10, "secp224k1");
            setUICustomization.put(aSN1ObjectIdentifier10, bCECPublicKey10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = DHwithRFC2631KDF.getProxyAddress;
            BCECPublicKey bCECPublicKey11 = CardinalError;
            setUiType.put("secp224r1", aSN1ObjectIdentifier11);
            isEnableDFSync.put(aSN1ObjectIdentifier11, "secp224r1");
            setUICustomization.put(aSN1ObjectIdentifier11, bCECPublicKey11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = DHwithRFC2631KDF.CardinalError;
            BCECPublicKey bCECPublicKey12 = values;
            setUiType.put("secp256k1", aSN1ObjectIdentifier12);
            isEnableDFSync.put(aSN1ObjectIdentifier12, "secp256k1");
            setUICustomization.put(aSN1ObjectIdentifier12, bCECPublicKey12);
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = DHwithRFC2631KDF.setRenderType;
            BCECPublicKey bCECPublicKey13 = CardinalRenderType;
            setUiType.put("secp256r1", aSN1ObjectIdentifier13);
            isEnableDFSync.put(aSN1ObjectIdentifier13, "secp256r1");
            setUICustomization.put(aSN1ObjectIdentifier13, bCECPublicKey13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = DHwithRFC2631KDF.setProxyAddress;
            BCECPublicKey bCECPublicKey14 = CardinalEnvironment;
            setUiType.put("secp384r1", aSN1ObjectIdentifier14);
            isEnableDFSync.put(aSN1ObjectIdentifier14, "secp384r1");
            setUICustomization.put(aSN1ObjectIdentifier14, bCECPublicKey14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = DHwithRFC2631KDF.getUiType;
            BCECPublicKey bCECPublicKey15 = valueOf;
            setUiType.put("secp521r1", aSN1ObjectIdentifier15);
            isEnableDFSync.put(aSN1ObjectIdentifier15, "secp521r1");
            setUICustomization.put(aSN1ObjectIdentifier15, bCECPublicKey15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = DHwithRFC2631KDF.cca_continue;
            BCECPublicKey bCECPublicKey16 = CardinalUiType;
            setUiType.put("sect113r1", aSN1ObjectIdentifier16);
            isEnableDFSync.put(aSN1ObjectIdentifier16, "sect113r1");
            setUICustomization.put(aSN1ObjectIdentifier16, bCECPublicKey16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = DHwithRFC2631KDF.getWarnings;
            BCECPublicKey bCECPublicKey17 = CardinalActionCode;
            setUiType.put("sect113r2", aSN1ObjectIdentifier17);
            isEnableDFSync.put(aSN1ObjectIdentifier17, "sect113r2");
            setUICustomization.put(aSN1ObjectIdentifier17, bCECPublicKey17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = DHwithRFC2631KDF.CardinalRenderType;
            BCECPublicKey bCECPublicKey18 = CardinalChallengeObserver;
            setUiType.put("sect131r1", aSN1ObjectIdentifier18);
            isEnableDFSync.put(aSN1ObjectIdentifier18, "sect131r1");
            setUICustomization.put(aSN1ObjectIdentifier18, bCECPublicKey18);
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = DHwithRFC2631KDF.getActionCode;
            BCECPublicKey bCECPublicKey19 = getString;
            setUiType.put("sect131r2", aSN1ObjectIdentifier19);
            isEnableDFSync.put(aSN1ObjectIdentifier19, "sect131r2");
            setUICustomization.put(aSN1ObjectIdentifier19, bCECPublicKey19);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = DHwithRFC2631KDF.init;
            BCECPublicKey bCECPublicKey20 = getActionCode;
            setUiType.put("sect163k1", aSN1ObjectIdentifier20);
            isEnableDFSync.put(aSN1ObjectIdentifier20, "sect163k1");
            setUICustomization.put(aSN1ObjectIdentifier20, bCECPublicKey20);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = DHwithRFC2631KDF.getInstance;
            BCECPublicKey bCECPublicKey21 = getRequestTimeout;
            setUiType.put("sect163r1", aSN1ObjectIdentifier21);
            isEnableDFSync.put(aSN1ObjectIdentifier21, "sect163r1");
            setUICustomization.put(aSN1ObjectIdentifier21, bCECPublicKey21);
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = DHwithRFC2631KDF.valueOf;
            BCECPublicKey bCECPublicKey22 = getChallengeTimeout;
            setUiType.put("sect163r2", aSN1ObjectIdentifier22);
            isEnableDFSync.put(aSN1ObjectIdentifier22, "sect163r2");
            setUICustomization.put(aSN1ObjectIdentifier22, bCECPublicKey22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = DHwithRFC2631KDF.getString;
            BCECPublicKey bCECPublicKey23 = setChallengeTimeout;
            setUiType.put("sect193r1", aSN1ObjectIdentifier23);
            isEnableDFSync.put(aSN1ObjectIdentifier23, "sect193r1");
            setUICustomization.put(aSN1ObjectIdentifier23, bCECPublicKey23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = DHwithRFC2631KDF.CardinalUiType;
            BCECPublicKey bCECPublicKey24 = setRequestTimeout;
            setUiType.put("sect193r2", aSN1ObjectIdentifier24);
            isEnableDFSync.put(aSN1ObjectIdentifier24, "sect193r2");
            setUICustomization.put(aSN1ObjectIdentifier24, bCECPublicKey24);
            ASN1ObjectIdentifier aSN1ObjectIdentifier25 = DHwithRFC2631KDF.CardinalChallengeObserver;
            BCECPublicKey bCECPublicKey25 = CardinalConfigurationParameters;
            setUiType.put("sect233k1", aSN1ObjectIdentifier25);
            isEnableDFSync.put(aSN1ObjectIdentifier25, "sect233k1");
            setUICustomization.put(aSN1ObjectIdentifier25, bCECPublicKey25);
            ASN1ObjectIdentifier aSN1ObjectIdentifier26 = DHwithRFC2631KDF.CardinalActionCode;
            BCECPublicKey bCECPublicKey26 = getUiType;
            setUiType.put("sect233r1", aSN1ObjectIdentifier26);
            isEnableDFSync.put(aSN1ObjectIdentifier26, "sect233r1");
            setUICustomization.put(aSN1ObjectIdentifier26, bCECPublicKey26);
            ASN1ObjectIdentifier aSN1ObjectIdentifier27 = DHwithRFC2631KDF.configure;
            BCECPublicKey bCECPublicKey27 = setProxyAddress;
            setUiType.put("sect239k1", aSN1ObjectIdentifier27);
            isEnableDFSync.put(aSN1ObjectIdentifier27, "sect239k1");
            setUICustomization.put(aSN1ObjectIdentifier27, bCECPublicKey27);
            ASN1ObjectIdentifier aSN1ObjectIdentifier28 = DHwithRFC2631KDF.CardinalEnvironment;
            BCECPublicKey bCECPublicKey28 = getEnvironment;
            setUiType.put("sect283k1", aSN1ObjectIdentifier28);
            isEnableDFSync.put(aSN1ObjectIdentifier28, "sect283k1");
            setUICustomization.put(aSN1ObjectIdentifier28, bCECPublicKey28);
            ASN1ObjectIdentifier aSN1ObjectIdentifier29 = DHwithRFC2631KDF.values;
            BCECPublicKey bCECPublicKey29 = setEnvironment;
            setUiType.put("sect283r1", aSN1ObjectIdentifier29);
            isEnableDFSync.put(aSN1ObjectIdentifier29, "sect283r1");
            setUICustomization.put(aSN1ObjectIdentifier29, bCECPublicKey29);
            ASN1ObjectIdentifier aSN1ObjectIdentifier30 = DHwithRFC2631KDF.getEnvironment;
            BCECPublicKey bCECPublicKey30 = getProxyAddress;
            setUiType.put("sect409k1", aSN1ObjectIdentifier30);
            isEnableDFSync.put(aSN1ObjectIdentifier30, "sect409k1");
            setUICustomization.put(aSN1ObjectIdentifier30, bCECPublicKey30);
            ASN1ObjectIdentifier aSN1ObjectIdentifier31 = DHwithRFC2631KDF.setEnvironment;
            BCECPublicKey bCECPublicKey31 = setRenderType;
            setUiType.put("sect409r1", aSN1ObjectIdentifier31);
            isEnableDFSync.put(aSN1ObjectIdentifier31, "sect409r1");
            setUICustomization.put(aSN1ObjectIdentifier31, bCECPublicKey31);
            ASN1ObjectIdentifier aSN1ObjectIdentifier32 = DHwithRFC2631KDF.getRenderType;
            BCECPublicKey bCECPublicKey32 = getUICustomization;
            setUiType.put("sect571k1", aSN1ObjectIdentifier32);
            isEnableDFSync.put(aSN1ObjectIdentifier32, "sect571k1");
            setUICustomization.put(aSN1ObjectIdentifier32, bCECPublicKey32);
            ASN1ObjectIdentifier aSN1ObjectIdentifier33 = DHwithRFC2631KDF.setUiType;
            BCECPublicKey bCECPublicKey33 = getRenderType;
            setUiType.put("sect571r1", aSN1ObjectIdentifier33);
            isEnableDFSync.put(aSN1ObjectIdentifier33, "sect571r1");
            setUICustomization.put(aSN1ObjectIdentifier33, bCECPublicKey33);
        }
    }

    public final class DHwithSHA224KDFAndSharedInfo implements GMCipherSpi.SM2withSha384 {
        private static final BigInteger init = BigInteger.valueOf(1);
        private X25519UwithSHA256CKDF cca_continue;
        private X25519withSHA256CKDF configure;

        public final void cca_continue(GMCipherSpi.SM2withRMD sM2withRMD) {
            if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                sM2withRMD = ((DigestSignatureSpi.RIPEMD128) sM2withRMD).cca_continue;
            }
            setCCAImageUri setccaimageuri = (setCCAImageUri) sM2withRMD;
            if (setccaimageuri instanceof X25519UwithSHA256CKDF) {
                X25519UwithSHA256CKDF x25519UwithSHA256CKDF = (X25519UwithSHA256CKDF) setccaimageuri;
                this.cca_continue = x25519UwithSHA256CKDF;
                this.configure = x25519UwithSHA256CKDF.Cardinal;
                return;
            }
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }

        public final int Cardinal() {
            return (this.cca_continue.Cardinal.Cardinal.bitLength() + 7) / 8;
        }

        public final BigInteger getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
            X25519withSHA256KDF x25519withSHA256KDF = (X25519withSHA256KDF) sM2withRMD;
            if (x25519withSHA256KDF.Cardinal.equals(this.configure)) {
                BigInteger bigInteger = this.configure.Cardinal;
                BigInteger bigInteger2 = x25519withSHA256KDF.init;
                if (bigInteger2 != null) {
                    BigInteger bigInteger3 = init;
                    if (bigInteger2.compareTo(bigInteger3) > 0 && bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) < 0) {
                        BigInteger modPow = bigInteger2.modPow(this.cca_continue.configure, bigInteger);
                        if (!modPow.equals(bigInteger3)) {
                            return modPow;
                        }
                        throw new IllegalStateException("Shared key can't be 1");
                    }
                }
                throw new IllegalArgumentException("Diffie-Hellman public key is weak");
            }
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
    }

    public final class DHwithSHA256CKDF extends setRenderType {
        private static final byte[] Cardinal = {-87, -42, -21, 69, -15, 60, 112, -126, Byte.MIN_VALUE, -60, -106, 123, 35, Ascii.US, 94, -83, -10, 88, -21, -92, -64, 55, 41, Ascii.GS, 56, -39, 107, -16, 37, -54, 78, Ascii.ETB, -8, -23, 114, Ascii.CR, -58, Ascii.NAK, -76, 58, 40, -105, 95, Ascii.VT, -63, -34, -93, 100, 56, -75, 100, -22, 44, Ascii.ETB, -97, -48, Ascii.DC2, 62, 109, -72, -6, -59, 121, 4};
        public ASN1ObjectIdentifier configure;
        public byte[] getInstance = Cardinal;
        public DHwithSHA512CKDF init;

        private DHwithSHA256CKDF(DHwithSHA512CKDF dHwithSHA512CKDF) {
            this.init = dHwithSHA512CKDF;
        }

        public DHwithSHA256CKDF(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            this.configure = aSN1ObjectIdentifier;
        }

        public static byte[] cca_continue() {
            byte[] bArr = Cardinal;
            if (bArr == null) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public static DHwithSHA256CKDF init(Object obj) {
            DHwithSHA256CKDF dHwithSHA256CKDF;
            if (obj != null) {
                isEnableLogging instance = isEnableLogging.getInstance(obj);
                if (instance.init(0) instanceof ASN1ObjectIdentifier) {
                    dHwithSHA256CKDF = new DHwithSHA256CKDF(ASN1ObjectIdentifier.cca_continue((Object) instance.init(0)));
                } else {
                    CardinalConfigurationParameters init2 = instance.init(0);
                    dHwithSHA256CKDF = new DHwithSHA256CKDF(init2 instanceof DHwithSHA512CKDF ? (DHwithSHA512CKDF) init2 : init2 != null ? new DHwithSHA512CKDF(isEnableLogging.getInstance((Object) init2)) : null);
                }
                if (instance.cca_continue() == 2) {
                    byte[] instance2 = setUICustomization.init(instance.init(1)).getInstance();
                    dHwithSHA256CKDF.getInstance = instance2;
                    if (instance2.length != Cardinal.length) {
                        throw new IllegalArgumentException("object parse error");
                    }
                }
                return dHwithSHA256CKDF;
            }
            throw new IllegalArgumentException("object parse error");
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = this.configure;
            if (aSN1ObjectIdentifier != null) {
                getbackgroundcolor.getInstance.addElement(aSN1ObjectIdentifier);
            } else {
                getbackgroundcolor.getInstance.addElement(this.init);
            }
            if (!getBackgroundColor.Cardinal(this.getInstance, Cardinal)) {
                getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.getInstance));
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class DHwithSHA256KDF extends setRenderType {
        public int Cardinal;
        public int cca_continue;
        public int configure;
        public int getInstance;

        DHwithSHA256KDF(isEnableLogging isenablelogging) {
            this.Cardinal = new BigInteger(1, setEnvironment.getInstance((Object) isenablelogging.init(0)).getInstance).intValue();
            if (isenablelogging.init(1) instanceof setEnvironment) {
                this.getInstance = new BigInteger(1, ((setEnvironment) isenablelogging.init(1)).getInstance).intValue();
            } else if (isenablelogging.init(1) instanceof isEnableLogging) {
                isEnableLogging instance = isEnableLogging.getInstance((Object) isenablelogging.init(1));
                this.getInstance = new BigInteger(1, setEnvironment.getInstance((Object) instance.init(0)).getInstance).intValue();
                this.cca_continue = new BigInteger(1, setEnvironment.getInstance((Object) instance.init(1)).getInstance).intValue();
                this.configure = new BigInteger(1, setEnvironment.getInstance((Object) instance.init(2)).getInstance).intValue();
            } else {
                throw new IllegalArgumentException("object parse error");
            }
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.Cardinal));
            if (this.cca_continue == 0) {
                getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.getInstance));
            } else {
                getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
                getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) this.getInstance));
                getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) this.cca_continue));
                getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) this.configure));
                getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
            }
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class DHwithSHA256KDFAndSharedInfo implements GMCipherSpi.SM2withSha384 {
        private static final BigInteger configure = BigInteger.valueOf(1);
        private getSeverity Cardinal;

        public final void cca_continue(GMCipherSpi.SM2withRMD sM2withRMD) {
            this.Cardinal = (getSeverity) sM2withRMD;
        }

        public final int Cardinal() {
            return (this.Cardinal.configure.Cardinal.Cardinal.bitLength() + 7) / 8;
        }

        public final BigInteger getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
            getTextFontName gettextfontname = (getTextFontName) sM2withRMD;
            X25519UwithSHA256CKDF x25519UwithSHA256CKDF = this.Cardinal.configure;
            if (!this.Cardinal.configure.Cardinal.equals(gettextfontname.getInstance.Cardinal)) {
                throw new IllegalStateException("MQV public key components have wrong domain parameters");
            } else if (this.Cardinal.configure.Cardinal.getInstance != null) {
                X25519withSHA256CKDF x25519withSHA256CKDF = x25519UwithSHA256CKDF.Cardinal;
                X25519withSHA256KDF x25519withSHA256KDF = gettextfontname.getInstance;
                X25519UwithSHA256CKDF x25519UwithSHA256CKDF2 = this.Cardinal.getInstance;
                X25519withSHA256KDF x25519withSHA256KDF2 = this.Cardinal.cca_continue;
                X25519withSHA256KDF x25519withSHA256KDF3 = gettextfontname.cca_continue;
                BigInteger bigInteger = x25519withSHA256CKDF.getInstance;
                BigInteger pow = BigInteger.valueOf(2).pow((bigInteger.bitLength() + 1) / 2);
                BigInteger modPow = x25519withSHA256KDF3.init.multiply(x25519withSHA256KDF.init.modPow(x25519withSHA256KDF3.init.mod(pow).add(pow), x25519withSHA256CKDF.Cardinal)).modPow(x25519UwithSHA256CKDF2.configure.add(x25519withSHA256KDF2.init.mod(pow).add(pow).multiply(x25519UwithSHA256CKDF.configure)).mod(bigInteger), x25519withSHA256CKDF.Cardinal);
                if (!modPow.equals(configure)) {
                    return modPow;
                }
                throw new IllegalStateException("1 is not a valid agreement value for MQV");
            } else {
                throw new IllegalStateException("MQV key domain parameters do not have Q set");
            }
        }
    }

    public final class DHwithSHA384CKDF {
        private static ASN1ObjectIdentifier[] Cardinal = new ASN1ObjectIdentifier[10];
        private static String cca_continue = new StringBuilder().append(DHwithSHA512KDF.Cardinal.init).append(".2.").toString();
        private static KeyFactorySpi.EDDSA[] configure = new KeyFactorySpi.EDDSA[10];
        private static final BigInteger getInstance;
        private static final BigInteger init;

        public static KeyFactorySpi.EDDSA getInstance(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            int parseInt;
            String str = aSN1ObjectIdentifier.init;
            if (str.startsWith(cca_continue) && (parseInt = Integer.parseInt(str.substring(str.lastIndexOf(46) + 1))) >= 0) {
                KeyFactorySpi.EDDSA[] eddsaArr = configure;
                if (parseInt < eddsaArr.length) {
                    return eddsaArr[parseInt];
                }
            }
            return null;
        }

        static {
            BigInteger valueOf = BigInteger.valueOf(0);
            getInstance = valueOf;
            BigInteger valueOf2 = BigInteger.valueOf(1);
            init = valueOf2;
            int i = 0;
            BigInteger[] bigIntegerArr = {new BigInteger("400000000000000000002BEC12BE2262D39BCF14D", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFB12EBCC7D7F29FF7701F", 16), new BigInteger("800000000000000000000189B4E67606E3825BB2831", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFB981960435FE5AB64236EF", 16), new BigInteger("40000000000000000000000069A779CAC1DABC6788F7474F", 16), new BigInteger("1000000000000000000000000000013E974E72F8A6922031D2603CFE0D7", 16), new BigInteger("800000000000000000000000000000006759213AF182E987D3E17714907D470D", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC079C2F3825DA70D390FBBA588D4604022B7B7", 16), new BigInteger("40000000000000000000000000000000000000000000009C300B75A3FA824F22428FD28CE8812245EF44049B2D49", 16), new BigInteger("3FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFBA3175458009A8C0A724F02F81AA8A1FCBAF80D90C7A95110504CF", 16)};
            BigInteger[] bigIntegerArr2 = {BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(4), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(4), BigInteger.valueOf(2), BigInteger.valueOf(2), BigInteger.valueOf(2)};
            BigInteger[] bigIntegerArr3 = bigIntegerArr2;
            toJSONString.init[] initArr = {new toJSONString.init((int) Opcodes.IF_ICMPGT, 3, 6, 7, valueOf2, new BigInteger("5FF6108462A2DC8210AB403925E638A19C1455D21", 16), bigIntegerArr[0], bigIntegerArr2[0]), new toJSONString.init((int) Opcodes.GOTO, 6, valueOf2, new BigInteger("6EE3CEEB230811759F20518A0930F1A4315A827DAC", 16), bigIntegerArr[1], bigIntegerArr2[1]), new toJSONString.init((int) Opcodes.LRETURN, 1, 2, 10, valueOf, new BigInteger("108576C80499DB2FC16EDDF6853BBB278F6B6FB437D9", 16), bigIntegerArr[2], bigIntegerArr2[2]), new toJSONString.init((int) Opcodes.PUTSTATIC, 1, 2, 4, valueOf2, new BigInteger("4A6E0856526436F2F88DD07A341E32D04184572BEB710", 16), bigIntegerArr[3], bigIntegerArr3[3]), new toJSONString.init((int) Opcodes.ATHROW, 9, valueOf2, new BigInteger("7BC86E2102902EC4D5890E8B6B4981ff27E0482750FEFC03", 16), bigIntegerArr[4], bigIntegerArr3[4]), new toJSONString.init(233, 1, 4, 9, valueOf2, new BigInteger("06973B15095675534C7CF7E64A21BD54EF5DD3B8A0326AA936ECE454D2C", 16), bigIntegerArr[5], bigIntegerArr3[5]), new toJSONString.init(257, 12, valueOf, new BigInteger("1CEF494720115657E18F938D7A7942394FF9425C1458C57861F9EEA6ADBE3BE10", 16), bigIntegerArr[6], bigIntegerArr3[6]), new toJSONString.init(307, 2, 4, 8, valueOf2, new BigInteger("393C7F7D53666B5054B5E6C6D3DE94F4296C0C599E2E2E241050DF18B6090BDC90186904968BB", 16), bigIntegerArr[7], bigIntegerArr3[7]), new toJSONString.init(367, 21, valueOf2, new BigInteger("43FC8AD242B0B7A6F3D1627AD5654447556B47BF6AA4A64B0C2AFE42CADAB8F93D92394C79A79755437B56995136", 16), bigIntegerArr[8], bigIntegerArr3[8]), new toJSONString.init(431, 1, 3, 5, valueOf2, new BigInteger("03CE10490F6A708FC26DFE8C3D27C4F94E690134D5BFF988D8D28AAEAEDE975936C66BAC536B18AE2DC312CA493117DAA469C640CAF3", 16), bigIntegerArr[9], bigIntegerArr3[9])};
            JSONNavi[] jSONNaviArr = {initArr[0].configure(new BigInteger("2E2F85F5DD74CE983A5C4237229DAF8A3F35823BE", 16), new BigInteger("3826F008A8C51D7B95284D9D03FF0E00CE2CD723A", 16), false), initArr[1].configure(new BigInteger("7A1F6653786A68192803910A3D30B2A2018B21CD54", 16), new BigInteger("5F49EB26781C0EC6B8909156D98ED435E45FD59918", 16), false), initArr[2].configure(new BigInteger("4D41A619BCC6EADF0448FA22FAD567A9181D37389CA", 16), new BigInteger("10B51CC12849B234C75E6DD2028BF7FF5C1CE0D991A1", 16), false), initArr[3].configure(new BigInteger("6BA06FE51464B2BD26DC57F48819BA9954667022C7D03", 16), new BigInteger("25FBC363582DCEC065080CA8287AAFF09788A66DC3A9E", 16), false), initArr[4].configure(new BigInteger("714114B762F2FF4A7912A6D2AC58B9B5C2FCFE76DAEB7129", 16), new BigInteger("29C41E568B77C617EFE5902F11DB96FA9613CD8D03DB08DA", 16), false), initArr[5].configure(new BigInteger("3FCDA526B6CDF83BA1118DF35B3C31761D3545F32728D003EEB25EFE96", 16), new BigInteger("9CA8B57A934C54DEEDA9E54A7BBAD95E3B2E91C54D32BE0B9DF96D8D35", 16), false), initArr[6].configure(new BigInteger("02A29EF207D0E9B6C55CD260B306C7E007AC491CA1B10C62334A9E8DCD8D20FB7", 16), new BigInteger("10686D41FF744D4449FCCF6D8EEA03102E6812C93A9D60B978B702CF156D814EF", 16), false), initArr[7].configure(new BigInteger("216EE8B189D291A0224984C1E92F1D16BF75CCD825A087A239B276D3167743C52C02D6E7232AA", 16), new BigInteger("5D9306BACD22B7FAEB09D2E049C6E2866C5D1677762A8F2F2DC9A11C7F7BE8340AB2237C7F2A0", 16), false), initArr[8].configure(new BigInteger("324A6EDDD512F08C49A99AE0D3F961197A76413E7BE81A400CA681E09639B5FE12E59A109F78BF4A373541B3B9A1", 16), new BigInteger("1AB597A5B4477F59E39539007C7F977D1A567B92B043A49C6B61984C3FE3481AAF454CD41BA1F051626442B3C10", 16), false), initArr[9].configure(new BigInteger("1A62BA79D98133A16BBAE7ED9A8E03C32E0824D57AEF72F88986874E5AAE49C27BED49A2A95058068426C2171E99FD3B43C5947C857D", 16), new BigInteger("70B5E1E14031C1F70BBEFE96BDDE66F451754B4CA5F48DA241F331AA396B8D1839A855C1769B1EA14BA53308B5E2723724E090E02DB9", 16), false)};
            int i2 = 0;
            while (true) {
                KeyFactorySpi.EDDSA[] eddsaArr = configure;
                if (i2 >= eddsaArr.length) {
                    break;
                }
                eddsaArr[i2] = new KeyFactorySpi.EDDSA(initArr[i2], jSONNaviArr[i2], bigIntegerArr[i2], bigIntegerArr3[i2]);
                i2++;
            }
            while (true) {
                ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = Cardinal;
                if (i < aSN1ObjectIdentifierArr.length) {
                    aSN1ObjectIdentifierArr[i] = new ASN1ObjectIdentifier(new StringBuilder().append(cca_continue).append(i).toString());
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public interface DHwithSHA384KDF {
        public static final ASN1ObjectIdentifier Cardinal;
        public static final ASN1ObjectIdentifier CardinalActionCode;
        public static final ASN1ObjectIdentifier CardinalChallengeObserver;
        public static final ASN1ObjectIdentifier CardinalConfigurationParameters;
        public static final ASN1ObjectIdentifier CardinalEnvironment;
        public static final ASN1ObjectIdentifier CardinalError;
        public static final ASN1ObjectIdentifier CardinalRenderType;
        public static final ASN1ObjectIdentifier CardinalUiType;
        public static final ASN1ObjectIdentifier cca_continue;
        public static final ASN1ObjectIdentifier cleanup;
        public static final ASN1ObjectIdentifier configure;
        public static final ASN1ObjectIdentifier getActionCode;
        public static final ASN1ObjectIdentifier getChallengeTimeout;
        public static final ASN1ObjectIdentifier getInstance;
        public static final ASN1ObjectIdentifier getRequestTimeout;
        public static final ASN1ObjectIdentifier getSDKVersion;
        public static final ASN1ObjectIdentifier getString;
        public static final ASN1ObjectIdentifier getWarnings;
        public static final ASN1ObjectIdentifier init;
        public static final ASN1ObjectIdentifier onCReqSuccess;
        public static final ASN1ObjectIdentifier onValidated;
        public static final ASN1ObjectIdentifier setChallengeTimeout;
        public static final ASN1ObjectIdentifier setProxyAddress;
        public static final ASN1ObjectIdentifier setRequestTimeout;
        public static final ASN1ObjectIdentifier valueOf;
        public static final ASN1ObjectIdentifier values;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.36.3");
            Cardinal = aSN1ObjectIdentifier;
            cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.1");
            init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.2");
            configure = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.3");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "3.1");
            getInstance = aSN1ObjectIdentifier2;
            onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2");
            getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, ExifInterface.GPS_MEASUREMENT_3D);
            cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "4");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "3.2");
            onValidated = aSN1ObjectIdentifier3;
            getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1");
            values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "3.2.8"), "1"), "1");
            CardinalEnvironment = aSN1ObjectIdentifier4;
            valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
            CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "2");
            CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, ExifInterface.GPS_MEASUREMENT_3D);
            CardinalChallengeObserver = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "4");
            CardinalActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "5");
            getActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "6");
            CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "7");
            getString = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "8");
            getChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "9");
            getRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "10");
            CardinalConfigurationParameters = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "11");
            setRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "12");
            setChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "13");
            setProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "14");
        }
    }

    public final class DHwithSHA384KDFAndSharedInfo implements GMCipherSpi.SM2withSha384 {
        public CipherSpi.PKCS1v1_5Padding_PrivateOnly Cardinal;

        public final void cca_continue(GMCipherSpi.SM2withRMD sM2withRMD) {
            this.Cardinal = (CipherSpi.PKCS1v1_5Padding_PrivateOnly) sM2withRMD;
        }

        public final int Cardinal() {
            return (this.Cardinal.configure.Cardinal.cca_continue.getInstance() + 7) / 8;
        }

        public final BigInteger getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
            if (!getTextColor.getInstance("com.cardinalcommerce.dependencies.internal.bouncycastle.ec.disable_mqv")) {
                BCRSAPublicKey bCRSAPublicKey = (BCRSAPublicKey) sM2withRMD;
                KeyPairGeneratorSpi.EdDSA edDSA = this.Cardinal.configure;
                KeyFactorySpi.EDDSA eddsa = edDSA.Cardinal;
                if (eddsa.equals(bCRSAPublicKey.configure.Cardinal)) {
                    KeyPairGeneratorSpi.EdDSA edDSA2 = this.Cardinal.cca_continue;
                    KeyPairGeneratorSpi.XDH xdh = this.Cardinal.Cardinal;
                    KeyPairGeneratorSpi.XDH xdh2 = bCRSAPublicKey.configure;
                    KeyPairGeneratorSpi.XDH xdh3 = bCRSAPublicKey.getInstance;
                    BigInteger bigInteger = eddsa.getInstance;
                    int bitLength = (bigInteger.bitLength() + 1) / 2;
                    BigInteger shiftLeft = writeJSONString.CardinalRenderType.shiftLeft(bitLength);
                    toJSONString tojsonstring = eddsa.cca_continue;
                    JSONNavi init = appendElement.init(tojsonstring, xdh.configure);
                    JSONNavi init2 = appendElement.init(tojsonstring, xdh2.configure);
                    JSONNavi init3 = appendElement.init(tojsonstring, xdh3.configure);
                    BigInteger mod = edDSA.init.multiply(init.onCReqSuccess().cca_continue().mod(shiftLeft).setBit(bitLength)).add(edDSA2.init).mod(bigInteger);
                    BigInteger bit = init3.onCReqSuccess().cca_continue().mod(shiftLeft).setBit(bitLength);
                    BigInteger mod2 = eddsa.Cardinal.multiply(mod).mod(bigInteger);
                    JSONNavi CardinalRenderType = appendElement.cca_continue(init2, bit.multiply(mod2).mod(bigInteger), init3, mod2).CardinalRenderType();
                    if (!CardinalRenderType.getString()) {
                        return CardinalRenderType.onCReqSuccess().cca_continue();
                    }
                    throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
                }
                throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
            }
            throw new IllegalStateException("ECMQV explicitly disabled");
        }
    }

    public final class DHwithSHA512CKDF extends setRenderType {
        public setEnvironment Cardinal;
        public DHwithSHA256KDF cca_continue;
        private BigInteger cleanup = BigInteger.valueOf(0);
        public setEnvironment configure;
        public setUICustomization getInstance;
        public setUICustomization init;

        DHwithSHA512CKDF(isEnableLogging isenablelogging) {
            int i = 0;
            if (isenablelogging.init(0) instanceof setEnableLogging) {
                setEnableLogging setenablelogging = (setEnableLogging) isenablelogging.init(0);
                if (!setenablelogging.cca_continue || setenablelogging.Cardinal != 0) {
                    throw new IllegalArgumentException("object parse error");
                }
                this.cleanup = new BigInteger(setEnvironment.getInstance((Object) setenablelogging.init()).getInstance);
                i = 1;
            }
            CardinalConfigurationParameters init2 = isenablelogging.init(i);
            this.cca_continue = init2 instanceof DHwithSHA256KDF ? (DHwithSHA256KDF) init2 : init2 != null ? new DHwithSHA256KDF(isEnableLogging.getInstance((Object) init2)) : null;
            int i2 = i + 1;
            this.Cardinal = setEnvironment.getInstance((Object) isenablelogging.init(i2));
            int i3 = i2 + 1;
            this.init = setUICustomization.init(isenablelogging.init(i3));
            int i4 = i3 + 1;
            this.configure = setEnvironment.getInstance((Object) isenablelogging.init(i4));
            this.getInstance = setUICustomization.init(isenablelogging.init(i4 + 1));
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            if (this.cleanup.compareTo(BigInteger.valueOf(0)) != 0) {
                getbackgroundcolor.getInstance.addElement(new getPayment(true, 0, new setEnvironment(this.cleanup)));
            }
            getbackgroundcolor.getInstance.addElement(this.cca_continue);
            getbackgroundcolor.getInstance.addElement(this.Cardinal);
            getbackgroundcolor.getInstance.addElement(this.init);
            getbackgroundcolor.getInstance.addElement(this.configure);
            getbackgroundcolor.getInstance.addElement(this.getInstance);
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public interface DHwithSHA512KDF {
        public static final ASN1ObjectIdentifier Cardinal;
        public static final ASN1ObjectIdentifier cca_continue;
        public static final ASN1ObjectIdentifier init;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.804.2.1.1.1");
            init = aSN1ObjectIdentifier;
            Cardinal = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.3.1.1");
            cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.3.1.1.1.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.2.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.2.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.2.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.2.4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.2.5");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.2.2.6");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.1.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.1.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.1.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.2.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.2.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.2.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.3.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.3.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.3.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.4.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.4.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.4.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.5.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.5.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.5.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.6.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.6.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.6.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.7.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.7.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.7.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.8.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.8.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.8.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.9.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.9.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.9.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.10.1");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.10.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1.3.10.3");
        }
    }

    public final class ECKAEGwithSHA1KDF implements GMCipherSpi.SM2withSha384 {
        public KeyPairGeneratorSpi.EdDSA Cardinal;

        public final void cca_continue(GMCipherSpi.SM2withRMD sM2withRMD) {
            this.Cardinal = (KeyPairGeneratorSpi.EdDSA) sM2withRMD;
        }

        public final int Cardinal() {
            return (this.Cardinal.Cardinal.cca_continue.getInstance() + 7) / 8;
        }

        public final BigInteger getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
            KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) sM2withRMD;
            KeyFactorySpi.EDDSA eddsa = this.Cardinal.Cardinal;
            if (eddsa.equals(xdh.Cardinal)) {
                BigInteger mod = eddsa.Cardinal.multiply(this.Cardinal.init).mod(eddsa.getInstance);
                JSONNavi init = appendElement.init(eddsa.cca_continue, xdh.configure);
                if (!init.getString()) {
                    JSONNavi CardinalRenderType = init.Cardinal(mod).CardinalRenderType();
                    if (!CardinalRenderType.getString()) {
                        return CardinalRenderType.onCReqSuccess().cca_continue();
                    }
                    throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
                }
                throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
            }
            throw new IllegalStateException("ECDHC public key has wrong domain parameters");
        }
    }

    public final class ECKAEGwithSHA256KDF implements IESCipher.ECIESwithDESedeCBC, setBackgroundColor {
        private static final byte[] CardinalActionCode = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
        private byte[] Cardinal;
        private byte[] CardinalChallengeObserver;
        private byte[] CardinalEnvironment;
        private byte[] CardinalError;
        private byte[] CardinalRenderType;
        private byte[] cca_continue;
        private byte[] cleanup;
        private byte[][] configure;
        private byte[] getActionCode;
        private byte[] getInstance;
        private byte[] getSDKVersion;
        private byte[] getString;
        private long getWarnings;
        private byte[] init;
        private int onCReqSuccess;
        private GMCipherSpi.SM2withSha256 onValidated;
        private short[] valueOf;
        private short[] values;

        public ECKAEGwithSHA256KDF() {
            this.cca_continue = new byte[32];
            this.getInstance = new byte[32];
            this.Cardinal = new byte[32];
            this.init = new byte[32];
            this.configure = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{4, 32});
            this.getSDKVersion = new byte[32];
            this.onValidated = new SignatureSpi.ecDSASha3_512();
            this.CardinalError = new byte[32];
            this.CardinalRenderType = new byte[8];
            this.valueOf = new short[16];
            this.values = new short[16];
            this.CardinalEnvironment = new byte[32];
            this.CardinalChallengeObserver = new byte[32];
            this.getActionCode = new byte[32];
            this.getString = new byte[32];
            this.cleanup = SignatureSpi.ecDSASha3_512.Cardinal("D-A");
            this.onValidated.getInstance(true, new DigestSignatureSpi((GMCipherSpi.SM2withRMD) null, this.cleanup));
            init();
        }

        private ECKAEGwithSHA256KDF(ECKAEGwithSHA256KDF eCKAEGwithSHA256KDF) {
            this.cca_continue = new byte[32];
            this.getInstance = new byte[32];
            this.Cardinal = new byte[32];
            this.init = new byte[32];
            this.configure = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{4, 32});
            this.getSDKVersion = new byte[32];
            this.onValidated = new SignatureSpi.ecDSASha3_512();
            this.CardinalError = new byte[32];
            this.CardinalRenderType = new byte[8];
            this.valueOf = new short[16];
            this.values = new short[16];
            this.CardinalEnvironment = new byte[32];
            this.CardinalChallengeObserver = new byte[32];
            this.getActionCode = new byte[32];
            this.getString = new byte[32];
            cca_continue((setBackgroundColor) eCKAEGwithSHA256KDF);
        }

        private byte[] Cardinal(byte[] bArr) {
            for (int i = 0; i < 8; i++) {
                byte[] bArr2 = this.CardinalError;
                int i2 = i * 4;
                bArr2[i2] = bArr[i];
                bArr2[i2 + 1] = bArr[i + 8];
                bArr2[i2 + 2] = bArr[i + 16];
                bArr2[i2 + 3] = bArr[i + 24];
            }
            return this.CardinalError;
        }

        private byte[] cca_continue(byte[] bArr) {
            for (int i = 0; i < 8; i++) {
                this.CardinalRenderType[i] = (byte) (bArr[i] ^ bArr[i + 8]);
            }
            System.arraycopy(bArr, 8, bArr, 0, 24);
            System.arraycopy(this.CardinalRenderType, 0, bArr, 24, 8);
            return bArr;
        }

        private void configure(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            while (true) {
                byte[] bArr2 = this.init;
                if (i != bArr2.length) {
                    int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
                    bArr2[i] = (byte) i3;
                    i2 = i3 >>> 8;
                    i++;
                } else {
                    return;
                }
            }
        }

        private void configure(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
            this.onValidated.getInstance(true, new CipherSpi.ISO9796d1Padding(bArr));
            this.onValidated.Cardinal(bArr3, i2, bArr2, i);
        }

        private void getInstance(byte[] bArr) {
            System.arraycopy(bArr, 0, this.Cardinal, 0, 32);
            System.arraycopy(this.cca_continue, 0, this.CardinalChallengeObserver, 0, 32);
            System.arraycopy(this.Cardinal, 0, this.getActionCode, 0, 32);
            for (int i = 0; i < 32; i++) {
                this.getString[i] = (byte) (this.CardinalChallengeObserver[i] ^ this.getActionCode[i]);
            }
            configure(Cardinal(this.getString), this.CardinalEnvironment, 0, this.cca_continue, 0);
            for (int i2 = 1; i2 < 4; i2++) {
                byte[] cca_continue2 = cca_continue(this.CardinalChallengeObserver);
                for (int i3 = 0; i3 < 32; i3++) {
                    this.CardinalChallengeObserver[i3] = (byte) (cca_continue2[i3] ^ this.configure[i2][i3]);
                }
                this.getActionCode = cca_continue(cca_continue(this.getActionCode));
                for (int i4 = 0; i4 < 32; i4++) {
                    this.getString[i4] = (byte) (this.CardinalChallengeObserver[i4] ^ this.getActionCode[i4]);
                }
                int i5 = i2 << 3;
                configure(Cardinal(this.getString), this.CardinalEnvironment, i5, this.cca_continue, i5);
            }
            for (int i6 = 0; i6 < 12; i6++) {
                init(this.CardinalEnvironment);
            }
            for (int i7 = 0; i7 < 32; i7++) {
                byte[] bArr2 = this.CardinalEnvironment;
                bArr2[i7] = (byte) (bArr2[i7] ^ this.Cardinal[i7]);
            }
            init(this.CardinalEnvironment);
            for (int i8 = 0; i8 < 32; i8++) {
                byte[] bArr3 = this.CardinalEnvironment;
                bArr3[i8] = (byte) (this.cca_continue[i8] ^ bArr3[i8]);
            }
            for (int i9 = 0; i9 < 61; i9++) {
                init(this.CardinalEnvironment);
            }
            byte[] bArr4 = this.CardinalEnvironment;
            byte[] bArr5 = this.cca_continue;
            System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
        }

        public final setBackgroundColor Cardinal() {
            return new ECKAEGwithSHA256KDF(this);
        }

        public final int cca_continue() {
            return 32;
        }

        public final void cca_continue(byte b) {
            byte[] bArr = this.getSDKVersion;
            int i = this.onCReqSuccess;
            int i2 = i + 1;
            this.onCReqSuccess = i2;
            bArr[i] = b;
            if (i2 == bArr.length) {
                configure(bArr);
                getInstance(this.getSDKVersion);
                this.onCReqSuccess = 0;
            }
            this.getWarnings++;
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            ECKAEGwithSHA256KDF eCKAEGwithSHA256KDF = (ECKAEGwithSHA256KDF) setbackgroundcolor;
            this.cleanup = eCKAEGwithSHA256KDF.cleanup;
            this.onValidated.getInstance(true, new DigestSignatureSpi((GMCipherSpi.SM2withRMD) null, this.cleanup));
            init();
            byte[] bArr = eCKAEGwithSHA256KDF.cca_continue;
            System.arraycopy(bArr, 0, this.cca_continue, 0, bArr.length);
            byte[] bArr2 = eCKAEGwithSHA256KDF.getInstance;
            System.arraycopy(bArr2, 0, this.getInstance, 0, bArr2.length);
            byte[] bArr3 = eCKAEGwithSHA256KDF.Cardinal;
            System.arraycopy(bArr3, 0, this.Cardinal, 0, bArr3.length);
            byte[] bArr4 = eCKAEGwithSHA256KDF.init;
            System.arraycopy(bArr4, 0, this.init, 0, bArr4.length);
            byte[] bArr5 = eCKAEGwithSHA256KDF.configure[1];
            System.arraycopy(bArr5, 0, this.configure[1], 0, bArr5.length);
            byte[] bArr6 = eCKAEGwithSHA256KDF.configure[2];
            System.arraycopy(bArr6, 0, this.configure[2], 0, bArr6.length);
            byte[] bArr7 = eCKAEGwithSHA256KDF.configure[3];
            System.arraycopy(bArr7, 0, this.configure[3], 0, bArr7.length);
            byte[] bArr8 = eCKAEGwithSHA256KDF.getSDKVersion;
            System.arraycopy(bArr8, 0, this.getSDKVersion, 0, bArr8.length);
            this.onCReqSuccess = eCKAEGwithSHA256KDF.onCReqSuccess;
            this.getWarnings = eCKAEGwithSHA256KDF.getWarnings;
        }

        public final String configure() {
            return "GOST3411";
        }

        public final int getInstance() {
            return 32;
        }

        public final void init() {
            this.getWarnings = 0;
            this.onCReqSuccess = 0;
            int i = 0;
            while (true) {
                byte[] bArr = this.cca_continue;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
            int i2 = 0;
            while (true) {
                byte[] bArr2 = this.getInstance;
                if (i2 >= bArr2.length) {
                    break;
                }
                bArr2[i2] = 0;
                i2++;
            }
            int i3 = 0;
            while (true) {
                byte[] bArr3 = this.Cardinal;
                if (i3 >= bArr3.length) {
                    break;
                }
                bArr3[i3] = 0;
                i3++;
            }
            int i4 = 0;
            while (true) {
                byte[] bArr4 = this.configure[1];
                if (i4 >= bArr4.length) {
                    break;
                }
                bArr4[i4] = 0;
                i4++;
            }
            int i5 = 0;
            while (true) {
                byte[] bArr5 = this.configure[3];
                if (i5 >= bArr5.length) {
                    break;
                }
                bArr5[i5] = 0;
                i5++;
            }
            int i6 = 0;
            while (true) {
                byte[] bArr6 = this.init;
                if (i6 >= bArr6.length) {
                    break;
                }
                bArr6[i6] = 0;
                i6++;
            }
            int i7 = 0;
            while (true) {
                byte[] bArr7 = this.getSDKVersion;
                if (i7 < bArr7.length) {
                    bArr7[i7] = 0;
                    i7++;
                } else {
                    byte[] bArr8 = CardinalActionCode;
                    System.arraycopy(bArr8, 0, this.configure[2], 0, bArr8.length);
                    return;
                }
            }
        }

        public final void init(byte[] bArr, int i, int i2) {
            while (this.onCReqSuccess != 0 && i2 > 0) {
                cca_continue(bArr[i]);
                i++;
                i2--;
            }
            while (true) {
                byte[] bArr2 = this.getSDKVersion;
                if (i2 <= bArr2.length) {
                    break;
                }
                System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
                configure(this.getSDKVersion);
                getInstance(this.getSDKVersion);
                byte[] bArr3 = this.getSDKVersion;
                i += bArr3.length;
                i2 -= bArr3.length;
                this.getWarnings += (long) bArr3.length;
            }
            while (i2 > 0) {
                cca_continue(bArr[i]);
                i++;
                i2--;
            }
        }

        public ECKAEGwithSHA256KDF(byte[] bArr) {
            byte[] bArr2;
            this.cca_continue = new byte[32];
            this.getInstance = new byte[32];
            this.Cardinal = new byte[32];
            this.init = new byte[32];
            this.configure = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{4, 32});
            this.getSDKVersion = new byte[32];
            this.onValidated = new SignatureSpi.ecDSASha3_512();
            this.CardinalError = new byte[32];
            this.CardinalRenderType = new byte[8];
            this.valueOf = new short[16];
            this.values = new short[16];
            this.CardinalEnvironment = new byte[32];
            this.CardinalChallengeObserver = new byte[32];
            this.getActionCode = new byte[32];
            this.getString = new byte[32];
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            this.cleanup = bArr2;
            this.onValidated.getInstance(true, new DigestSignatureSpi((GMCipherSpi.SM2withRMD) null, this.cleanup));
            init();
        }

        private void init(byte[] bArr) {
            short[] sArr = this.valueOf;
            for (int i = 0; i < bArr.length / 2; i++) {
                int i2 = i << 1;
                sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
            }
            short[] sArr2 = this.values;
            short[] sArr3 = this.valueOf;
            sArr2[15] = (short) (((((sArr3[0] ^ sArr3[1]) ^ sArr3[2]) ^ sArr3[3]) ^ sArr3[12]) ^ sArr3[15]);
            System.arraycopy(sArr3, 1, sArr2, 0, 15);
            short[] sArr4 = this.values;
            for (int i3 = 0; i3 < bArr.length / 2; i3++) {
                int i4 = i3 << 1;
                short s = sArr4[i3];
                bArr[i4 + 1] = (byte) (s >> 8);
                bArr[i4] = (byte) s;
            }
        }

        public final int init(byte[] bArr, int i) {
            long j = this.getWarnings << 3;
            byte[] bArr2 = this.getInstance;
            setTextFontSize.getInstance((int) j, bArr2, 0);
            setTextFontSize.getInstance((int) (j >>> 32), bArr2, 4);
            while (this.onCReqSuccess != 0) {
                cca_continue((byte) 0);
            }
            getInstance(this.getInstance);
            getInstance(this.init);
            byte[] bArr3 = this.cca_continue;
            System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
            init();
            return 32;
        }
    }

    public final class ECKAEGwithSHA384KDF implements GMCipherSpi.SM2withSha512 {
        private byte[] Cardinal;
        private byte[] cca_continue;
        private ASN1ObjectIdentifier configure;
        private int getInstance;
        private final IESCipher.ECIESwithAESCBC init;

        public ECKAEGwithSHA384KDF(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
            this.init = eCIESwithAESCBC;
        }

        public final void getInstance(GMCipherSpi.SM2withRMD sM2withRMD) {
            isSpecialOpen isspecialopen = (isSpecialOpen) sM2withRMD;
            this.configure = isspecialopen.configure;
            this.getInstance = isspecialopen.getInstance;
            this.Cardinal = isspecialopen.init;
            this.cca_continue = isspecialopen.cca_continue;
        }

        public final int cca_continue(byte[] bArr, int i, int i2) throws GMSignatureSpi, IllegalArgumentException {
            byte[] bArr2 = bArr;
            int i3 = i2;
            if (bArr2.length - i3 >= 0) {
                long j = (long) i3;
                int instance = this.init.getInstance();
                if (j <= 8589934591L) {
                    long j2 = (long) instance;
                    int i4 = (int) (((j + j2) - 1) / j2);
                    byte[] bArr3 = new byte[this.init.getInstance()];
                    int i5 = i3;
                    int i6 = 0;
                    int i7 = 1;
                    int i8 = i;
                    while (i6 < i4) {
                        IESCipher.ECIESwithAESCBC eCIESwithAESCBC = this.init;
                        byte[] bArr4 = this.Cardinal;
                        eCIESwithAESCBC.init(bArr4, 0, bArr4.length);
                        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
                        getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
                        getbackgroundcolor2.getInstance.addElement(this.configure);
                        int i9 = i4;
                        byte[] bArr5 = new byte[4];
                        setTextFontSize.init(i7, bArr5, 0);
                        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(bArr5));
                        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
                        if (this.cca_continue != null) {
                            getbackgroundcolor.getInstance.addElement(new getPayment(true, 0, new setEnabledVisaCheckout(this.cca_continue)));
                        }
                        byte[] bArr6 = new byte[4];
                        setTextFontSize.init(this.getInstance, bArr6, 0);
                        getbackgroundcolor.getInstance.addElement(new getPayment(true, 2, new setEnabledVisaCheckout(bArr6)));
                        try {
                            byte[] configure2 = new getProcessorTransactionId(getbackgroundcolor).configure("DER");
                            this.init.init(configure2, 0, configure2.length);
                            this.init.init(bArr3, 0);
                            if (i5 > instance) {
                                System.arraycopy(bArr3, 0, bArr2, i8, instance);
                                i8 += instance;
                                i5 -= instance;
                            } else {
                                System.arraycopy(bArr3, 0, bArr2, i8, i5);
                            }
                            i7++;
                            i6++;
                            i4 = i9;
                        } catch (IOException e) {
                            throw new IllegalArgumentException(new StringBuilder("unable to encode parameter info: ").append(e.getMessage()).toString());
                        }
                    }
                    this.init.init();
                    return (int) j;
                }
                throw new IllegalArgumentException("Output length too large");
            }
            throw new CDHwithSHA224KDFAndSharedInfo("output buffer too small");
        }
    }

    public final class ECKAEGwithSHA512KDF implements IESCipher.ECIESwithDESedeCBC {
        private static final long[] cca_continue = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};
        private static int configure = 12;
        private static final byte[][] getInstance = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI}, new byte[]{Ascii.SO, 10, 4, 8, 9, Ascii.SI, Ascii.CR, 6, 1, Ascii.FF, 0, 2, Ascii.VT, 7, 5, 3}, new byte[]{Ascii.VT, 8, Ascii.FF, 0, 5, 2, Ascii.SI, Ascii.CR, 10, Ascii.SO, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, Ascii.CR, Ascii.FF, Ascii.VT, Ascii.SO, 2, 6, 5, 10, 4, 0, Ascii.SI, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, Ascii.SI, Ascii.SO, 1, Ascii.VT, Ascii.FF, 6, 8, 3, Ascii.CR}, new byte[]{2, Ascii.FF, 6, 10, 0, Ascii.VT, 8, 3, 4, Ascii.CR, 7, 5, Ascii.SI, Ascii.SO, 1, 9}, new byte[]{Ascii.FF, 5, 1, Ascii.SI, Ascii.SO, Ascii.CR, 4, 10, 0, 7, 6, 3, 9, 2, 8, Ascii.VT}, new byte[]{Ascii.CR, Ascii.VT, 7, Ascii.SO, Ascii.FF, 1, 3, 9, 5, 0, Ascii.SI, 4, 8, 6, 2, 10}, new byte[]{6, Ascii.SI, Ascii.SO, 9, Ascii.VT, 3, 0, 8, Ascii.FF, 2, Ascii.CR, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, Ascii.SI, Ascii.VT, 9, Ascii.SO, 3, Ascii.FF, Ascii.CR, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI}, new byte[]{Ascii.SO, 10, 4, 8, 9, Ascii.SI, Ascii.CR, 6, 1, Ascii.FF, 0, 2, Ascii.VT, 7, 5, 3}};
        private int Cardinal;
        private long[] CardinalEnvironment;
        private long CardinalError;
        private long CardinalRenderType;
        private byte[] cleanup;
        private byte[] getSDKVersion;
        private byte[] getWarnings;
        private int init;
        private int onCReqSuccess;
        private byte[] onValidated;
        private long[] valueOf;
        private long values;

        public ECKAEGwithSHA512KDF() {
            this((byte) 0);
        }

        public ECKAEGwithSHA512KDF(byte b) {
            this.onValidated = null;
            this.getWarnings = null;
            this.cleanup = null;
            this.onCReqSuccess = 0;
            this.CardinalEnvironment = new long[16];
            this.valueOf = null;
            this.values = 0;
            this.CardinalError = 0;
            this.CardinalRenderType = 0;
            this.getSDKVersion = new byte[128];
            this.Cardinal = 0;
            this.init = 64;
            Cardinal();
        }

        private void onValidated() {
            long[] jArr = this.valueOf;
            System.arraycopy(jArr, 0, this.CardinalEnvironment, 0, jArr.length);
            long[] jArr2 = cca_continue;
            System.arraycopy(jArr2, 0, this.CardinalEnvironment, this.valueOf.length, 4);
            long[] jArr3 = this.CardinalEnvironment;
            jArr3[12] = this.values ^ jArr2[4];
            jArr3[13] = this.CardinalError ^ jArr2[5];
            jArr3[14] = this.CardinalRenderType ^ jArr2[6];
            jArr3[15] = jArr2[7];
        }

        public final int cca_continue() {
            return 128;
        }

        public final String configure() {
            return "BLAKE2b";
        }

        public final int getInstance() {
            return this.init;
        }

        private void Cardinal() {
            if (this.valueOf == null) {
                long[] jArr = new long[8];
                this.valueOf = jArr;
                long[] jArr2 = cca_continue;
                jArr[0] = jArr2[0] ^ ((long) (this.init | 16842752));
                jArr[1] = jArr2[1];
                jArr[2] = jArr2[2];
                jArr[3] = jArr2[3];
                long j = jArr2[4];
                jArr[4] = j;
                jArr[5] = jArr2[5];
                byte[] bArr = this.onValidated;
                if (bArr != null) {
                    jArr[4] = j ^ (((((long) setTextFontSize.cca_continue(bArr, 4)) & 4294967295L) << 32) | (((long) setTextFontSize.cca_continue(bArr, 0)) & 4294967295L));
                    long[] jArr3 = this.valueOf;
                    long j2 = jArr3[5];
                    byte[] bArr2 = this.onValidated;
                    jArr3[5] = j2 ^ ((((long) setTextFontSize.cca_continue(bArr2, 8)) & 4294967295L) | ((((long) setTextFontSize.cca_continue(bArr2, 12)) & 4294967295L) << 32));
                }
                long[] jArr4 = this.valueOf;
                long j3 = jArr2[6];
                jArr4[6] = j3;
                jArr4[7] = jArr2[7];
                byte[] bArr3 = this.getWarnings;
                if (bArr3 != null) {
                    jArr4[6] = ((((long) setTextFontSize.cca_continue(bArr3, 0)) & 4294967295L) | ((((long) setTextFontSize.cca_continue(bArr3, 4)) & 4294967295L) << 32)) ^ j3;
                    long[] jArr5 = this.valueOf;
                    long j4 = jArr5[7];
                    byte[] bArr4 = this.getWarnings;
                    jArr5[7] = j4 ^ (((((long) setTextFontSize.cca_continue(bArr4, 12)) & 4294967295L) << 32) | (((long) setTextFontSize.cca_continue(bArr4, 8)) & 4294967295L));
                }
            }
        }

        public final void cca_continue(byte b) {
            int i = this.onCReqSuccess;
            if (128 - i == 0) {
                long j = this.values + 128;
                this.values = j;
                if (j == 0) {
                    this.CardinalError++;
                }
                Cardinal(this.getSDKVersion, 0);
                byte[] bArr = this.getSDKVersion;
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr[i2] = 0;
                }
                this.getSDKVersion[0] = b;
                this.onCReqSuccess = 1;
                return;
            }
            this.getSDKVersion[i] = b;
            this.onCReqSuccess = i + 1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void init(byte[] r12, int r13, int r14) {
            /*
                r11 = this;
                if (r12 == 0) goto L_0x0066
                if (r14 != 0) goto L_0x0005
                goto L_0x0066
            L_0x0005:
                int r0 = r11.onCReqSuccess
                r1 = 1
                r3 = 0
                r5 = 128(0x80, double:6.32E-322)
                r7 = 0
                if (r0 == 0) goto L_0x0044
                int r8 = 128 - r0
                if (r8 >= r14) goto L_0x0039
                byte[] r9 = r11.getSDKVersion
                java.lang.System.arraycopy(r12, r13, r9, r0, r8)
                long r9 = r11.values
                long r9 = r9 + r5
                r11.values = r9
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x0027
                long r9 = r11.CardinalError
                long r9 = r9 + r1
                r11.CardinalError = r9
            L_0x0027:
                byte[] r0 = r11.getSDKVersion
                r11.Cardinal(r0, r7)
                r11.onCReqSuccess = r7
                byte[] r0 = r11.getSDKVersion
                r9 = r7
            L_0x0031:
                int r10 = r0.length
                if (r9 >= r10) goto L_0x0045
                r0[r9] = r7
                int r9 = r9 + 1
                goto L_0x0031
            L_0x0039:
                byte[] r1 = r11.getSDKVersion
                java.lang.System.arraycopy(r12, r13, r1, r0, r14)
            L_0x003e:
                int r12 = r11.onCReqSuccess
                int r12 = r12 + r14
                r11.onCReqSuccess = r12
                return
            L_0x0044:
                r8 = r7
            L_0x0045:
                int r14 = r14 + r13
                int r0 = r14 + -128
                int r13 = r13 + r8
            L_0x0049:
                if (r13 >= r0) goto L_0x005f
                long r8 = r11.values
                long r8 = r8 + r5
                r11.values = r8
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 != 0) goto L_0x0059
                long r8 = r11.CardinalError
                long r8 = r8 + r1
                r11.CardinalError = r8
            L_0x0059:
                r11.Cardinal(r12, r13)
                int r13 = r13 + 128
                goto L_0x0049
            L_0x005f:
                byte[] r0 = r11.getSDKVersion
                int r14 = r14 - r13
                java.lang.System.arraycopy(r12, r13, r0, r7, r14)
                goto L_0x003e
            L_0x0066:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.ECKAEGwithSHA512KDF.init(byte[], int, int):void");
        }

        public final int init(byte[] bArr, int i) {
            long[] jArr;
            int i2;
            this.CardinalRenderType = -1;
            long j = this.values;
            int i3 = this.onCReqSuccess;
            long j2 = j + ((long) i3);
            this.values = j2;
            if (i3 > 0 && j2 == 0) {
                this.CardinalError++;
            }
            Cardinal(this.getSDKVersion, 0);
            byte[] bArr2 = this.getSDKVersion;
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                bArr2[i4] = 0;
            }
            long[] jArr2 = this.CardinalEnvironment;
            for (int i5 = 0; i5 < jArr2.length; i5++) {
                jArr2[i5] = 0;
            }
            int i6 = 0;
            while (true) {
                jArr = this.valueOf;
                if (i6 < jArr.length && (i2 = i6 << 3) < this.init) {
                    long j3 = jArr[i6];
                    byte[] bArr3 = new byte[8];
                    setTextFontSize.getInstance((int) j3, bArr3, 0);
                    setTextFontSize.getInstance((int) (j3 >>> 32), bArr3, 4);
                    int i7 = this.init;
                    if (i2 < i7 - 8) {
                        System.arraycopy(bArr3, 0, bArr, i2 + i, 8);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i + i2, i7 - i2);
                    }
                    i6++;
                }
            }
            for (int i8 = 0; i8 < jArr.length; i8++) {
                jArr[i8] = 0;
            }
            init();
            return this.init;
        }

        public final void init() {
            this.onCReqSuccess = 0;
            this.CardinalRenderType = 0;
            this.values = 0;
            this.CardinalError = 0;
            this.valueOf = null;
            byte[] bArr = this.getSDKVersion;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = 0;
            }
            byte[] bArr2 = this.cleanup;
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, this.getSDKVersion, 0, bArr2.length);
                this.onCReqSuccess = 128;
            }
            Cardinal();
        }

        private void Cardinal(byte[] bArr, int i) {
            byte[] bArr2 = bArr;
            onValidated();
            long[] jArr = new long[16];
            int i2 = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = i + (i3 << 3);
                jArr[i3] = (((long) setTextFontSize.cca_continue(bArr2, i4)) & 4294967295L) | ((((long) setTextFontSize.cca_continue(bArr2, i4 + 4)) & 4294967295L) << 32);
            }
            for (int i5 = 0; i5 < configure; i5++) {
                byte[][] bArr3 = getInstance;
                byte[] bArr4 = bArr3[i5];
                configure(jArr[bArr4[0]], jArr[bArr4[1]], 0, 4, 8, 12);
                byte[] bArr5 = bArr3[i5];
                configure(jArr[bArr5[2]], jArr[bArr5[3]], 1, 5, 9, 13);
                byte[] bArr6 = bArr3[i5];
                configure(jArr[bArr6[4]], jArr[bArr6[5]], 2, 6, 10, 14);
                byte[] bArr7 = bArr3[i5];
                configure(jArr[bArr7[6]], jArr[bArr7[7]], 3, 7, 11, 15);
                byte[] bArr8 = bArr3[i5];
                configure(jArr[bArr8[8]], jArr[bArr8[9]], 0, 5, 10, 15);
                byte[] bArr9 = bArr3[i5];
                configure(jArr[bArr9[10]], jArr[bArr9[11]], 1, 6, 11, 12);
                byte[] bArr10 = bArr3[i5];
                configure(jArr[bArr10[12]], jArr[bArr10[13]], 2, 7, 8, 13);
                byte[] bArr11 = bArr3[i5];
                configure(jArr[bArr11[14]], jArr[bArr11[15]], 3, 4, 9, 14);
            }
            while (true) {
                long[] jArr2 = this.valueOf;
                if (i2 < jArr2.length) {
                    long j = jArr2[i2];
                    long[] jArr3 = this.CardinalEnvironment;
                    jArr2[i2] = (j ^ jArr3[i2]) ^ jArr3[i2 + 8];
                    i2++;
                } else {
                    return;
                }
            }
        }

        private void configure(long j, long j2, int i, int i2, int i3, int i4) {
            long[] jArr = this.CardinalEnvironment;
            long j3 = jArr[i] + jArr[i2] + j;
            jArr[i] = j3;
            long j4 = jArr[i4] ^ j3;
            long j5 = (j4 << 32) | (j4 >>> 32);
            jArr[i4] = j5;
            long j6 = jArr[i3] + j5;
            jArr[i3] = j6;
            long j7 = jArr[i2] ^ j6;
            long j8 = (j7 << 40) | (j7 >>> 24);
            jArr[i2] = j8;
            long j9 = jArr[i] + j8 + j2;
            jArr[i] = j9;
            long j10 = jArr[i4] ^ j9;
            long j11 = (j10 << 48) | (j10 >>> 16);
            jArr[i4] = j11;
            long j12 = jArr[i3] + j11;
            jArr[i3] = j12;
            long j13 = jArr[i2] ^ j12;
            jArr[i2] = (j13 << 1) | (j13 >>> 63);
        }
    }

    public final class ECVKO implements GMCipherSpi.SM2 {
        private SecureRandom Cardinal;

        public final void getInstance(appendElement appendelement) {
            this.Cardinal = appendelement.configure;
        }

        public final PSSSignatureSpi.SHA256withRSA init() {
            DigestSignatureSpi.SHA3_384 sha3_384 = new DigestSignatureSpi.SHA3_384(this.Cardinal);
            byte[] bArr = new byte[56];
            ConcatKDF.cca_continue(sha3_384.cca_continue, 0, bArr, 0);
            return new PSSSignatureSpi.SHA256withRSA(new DigestSignatureSpi.SHA3_512(bArr, 0), sha3_384);
        }
    }

    public final class ECVKO256 implements BCEdDSAPublicKey {
        private byte[] cca_continue;
        private long[][] configure;

        public final void Cardinal(byte[] bArr) {
            byte[] bArr2;
            byte[] bArr3 = bArr;
            if (this.configure == null) {
                this.configure = (long[][]) Array.newInstance(Long.TYPE, new int[]{256, 2});
            } else if (getBackgroundColor.Cardinal(this.cca_continue, bArr3)) {
                return;
            }
            if (bArr3 == null) {
                bArr2 = null;
            } else {
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                bArr2 = bArr4;
            }
            this.cca_continue = bArr2;
            long[] jArr = this.configure[1];
            int i = 0;
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = (((long) setTextFontSize.getInstance(bArr2, i + 4)) & 4294967295L) | ((((long) setTextFontSize.getInstance(bArr2, i)) & 4294967295L) << 32);
                i += 8;
            }
            long[] jArr2 = this.configure[1];
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = j2 << 57;
            jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
            jArr2[1] = (j << 57) | (j2 >>> 7);
            for (int i3 = 2; i3 < 256; i3 += 2) {
                long[][] jArr3 = this.configure;
                long[] jArr4 = jArr3[i3 >> 1];
                long[] jArr5 = jArr3[i3];
                long j4 = jArr4[0];
                long j5 = jArr4[1];
                long j6 = j4 >> 63;
                long j7 = ((j4 ^ (-2233785415175766016L & j6)) << 1) | (j5 >>> 63);
                jArr5[0] = j7;
                long j8 = (j5 << 1) | (-j6);
                jArr5[1] = j8;
                long[] jArr6 = jArr3[1];
                long[] jArr7 = jArr3[i3 + 1];
                jArr7[0] = j7 ^ jArr6[0];
                jArr7[1] = jArr6[1] ^ j8;
            }
        }

        public final void getInstance(byte[] bArr) {
            byte[] bArr2 = bArr;
            long[] jArr = this.configure[bArr2[15] & 255];
            long j = jArr[0];
            long j2 = jArr[1];
            for (int i = 14; i >= 0; i--) {
                long[] jArr2 = this.configure[bArr2[i] & 255];
                long j3 = j2 << 56;
                j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
                j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
            }
            setTextFontSize.init((int) (j >>> 32), bArr2, 0);
            setTextFontSize.init((int) j, bArr2, 4);
            setTextFontSize.init((int) (j2 >>> 32), bArr2, 8);
            setTextFontSize.init((int) j2, bArr2, 12);
        }
    }

    public final class MQV implements IESCipher.ECIESwithDESedeCBC {
        private static final int[] cca_continue = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};
        private static final byte[][] configure = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI}, new byte[]{Ascii.SO, 10, 4, 8, 9, Ascii.SI, Ascii.CR, 6, 1, Ascii.FF, 0, 2, Ascii.VT, 7, 5, 3}, new byte[]{Ascii.VT, 8, Ascii.FF, 0, 5, 2, Ascii.SI, Ascii.CR, 10, Ascii.SO, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, Ascii.CR, Ascii.FF, Ascii.VT, Ascii.SO, 2, 6, 5, 10, 4, 0, Ascii.SI, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, Ascii.SI, Ascii.SO, 1, Ascii.VT, Ascii.FF, 6, 8, 3, Ascii.CR}, new byte[]{2, Ascii.FF, 6, 10, 0, Ascii.VT, 8, 3, 4, Ascii.CR, 7, 5, Ascii.SI, Ascii.SO, 1, 9}, new byte[]{Ascii.FF, 5, 1, Ascii.SI, Ascii.SO, Ascii.CR, 4, 10, 0, 7, 6, 3, 9, 2, 8, Ascii.VT}, new byte[]{Ascii.CR, Ascii.VT, 7, Ascii.SO, Ascii.FF, 1, 3, 9, 5, 0, Ascii.SI, 4, 8, 6, 2, 10}, new byte[]{6, Ascii.SI, Ascii.SO, 9, Ascii.VT, 3, 0, 8, Ascii.FF, 2, Ascii.CR, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, Ascii.SI, Ascii.VT, 9, Ascii.SO, 3, Ascii.FF, Ascii.CR, 0}};
        private int Cardinal;
        private int CardinalActionCode;
        private int CardinalChallengeObserver;
        private int CardinalEnvironment;
        private int CardinalError;
        private long CardinalRenderType;
        private int CardinalUiType;
        private byte[] cleanup;
        private int[] getActionCode;
        private byte[] getInstance;
        private int getSDKVersion;
        private int[] getString;
        private byte[] getWarnings;
        private int init;
        private int onCReqSuccess;
        private int onValidated;
        private byte[] valueOf;
        private int values;

        public MQV() {
            this((byte) 0);
        }

        public MQV(byte b) {
            this.init = 0;
            this.getInstance = null;
            this.getWarnings = null;
            this.cleanup = null;
            this.onCReqSuccess = 1;
            this.getSDKVersion = 1;
            this.onValidated = 0;
            this.CardinalRenderType = 0;
            this.values = 0;
            this.CardinalError = 0;
            this.valueOf = null;
            this.CardinalEnvironment = 0;
            this.getActionCode = new int[16];
            this.getString = null;
            this.CardinalActionCode = 0;
            this.CardinalChallengeObserver = 0;
            this.CardinalUiType = 0;
            this.Cardinal = 32;
            cca_continue((byte[]) null, (byte[]) null, (byte[]) null);
        }

        private void Cardinal() {
            int[] iArr = this.getString;
            System.arraycopy(iArr, 0, this.getActionCode, 0, iArr.length);
            int[] iArr2 = cca_continue;
            System.arraycopy(iArr2, 0, this.getActionCode, this.getString.length, 4);
            int[] iArr3 = this.getActionCode;
            iArr3[12] = this.CardinalActionCode ^ iArr2[4];
            iArr3[13] = this.CardinalChallengeObserver ^ iArr2[5];
            iArr3[14] = this.CardinalUiType ^ iArr2[6];
            iArr3[15] = iArr2[7];
        }

        private void cca_continue(byte[] bArr, int i) {
            Cardinal();
            int[] iArr = new int[16];
            int i2 = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                iArr[i3] = setTextFontSize.cca_continue(bArr, (i3 << 2) + i);
            }
            for (int i4 = 0; i4 < 10; i4++) {
                byte[][] bArr2 = configure;
                byte[] bArr3 = bArr2[i4];
                cca_continue(iArr[bArr3[0]], iArr[bArr3[1]], 0, 4, 8, 12);
                byte[] bArr4 = bArr2[i4];
                cca_continue(iArr[bArr4[2]], iArr[bArr4[3]], 1, 5, 9, 13);
                byte[] bArr5 = bArr2[i4];
                cca_continue(iArr[bArr5[4]], iArr[bArr5[5]], 2, 6, 10, 14);
                byte[] bArr6 = bArr2[i4];
                cca_continue(iArr[bArr6[6]], iArr[bArr6[7]], 3, 7, 11, 15);
                byte[] bArr7 = bArr2[i4];
                cca_continue(iArr[bArr7[8]], iArr[bArr7[9]], 0, 5, 10, 15);
                byte[] bArr8 = bArr2[i4];
                cca_continue(iArr[bArr8[10]], iArr[bArr8[11]], 1, 6, 11, 12);
                byte[] bArr9 = bArr2[i4];
                cca_continue(iArr[bArr9[12]], iArr[bArr9[13]], 2, 7, 8, 13);
                byte[] bArr10 = bArr2[i4];
                cca_continue(iArr[bArr10[14]], iArr[bArr10[15]], 3, 4, 9, 14);
            }
            while (true) {
                int[] iArr2 = this.getString;
                if (i2 < iArr2.length) {
                    int i5 = iArr2[i2];
                    int[] iArr3 = this.getActionCode;
                    iArr2[i2] = (i5 ^ iArr3[i2]) ^ iArr3[i2 + 8];
                    i2++;
                } else {
                    return;
                }
            }
        }

        private void cca_continue(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.valueOf = new byte[64];
            if (bArr3 != null && bArr3.length > 0) {
                if (bArr3.length <= 32) {
                    byte[] bArr4 = new byte[bArr3.length];
                    this.cleanup = bArr4;
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    this.init = bArr3.length;
                    System.arraycopy(bArr3, 0, this.valueOf, 0, bArr3.length);
                    this.CardinalEnvironment = 64;
                } else {
                    throw new IllegalArgumentException("Keys > 32 bytes are not supported");
                }
            }
            if (this.getString == null) {
                int[] iArr = new int[8];
                this.getString = iArr;
                int[] iArr2 = cca_continue;
                iArr[0] = iArr2[0] ^ ((this.Cardinal | (this.init << 8)) | ((this.onCReqSuccess << 16) | (this.getSDKVersion << 24)));
                iArr[1] = iArr2[1] ^ this.onValidated;
                iArr[2] = iArr2[2];
                iArr[3] = iArr2[3];
                iArr[4] = iArr2[4];
                iArr[5] = iArr2[5];
                if (bArr != null) {
                    if (bArr.length == 8) {
                        byte[] bArr5 = new byte[8];
                        this.getInstance = bArr5;
                        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                        int[] iArr3 = this.getString;
                        iArr3[4] = iArr3[4] ^ setTextFontSize.cca_continue(bArr, 0);
                        int[] iArr4 = this.getString;
                        iArr4[5] = setTextFontSize.cca_continue(bArr, 4) ^ iArr4[5];
                    } else {
                        throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                    }
                }
                int[] iArr5 = this.getString;
                iArr5[6] = iArr2[6];
                iArr5[7] = iArr2[7];
                if (bArr2 == null) {
                    return;
                }
                if (bArr2.length == 8) {
                    byte[] bArr6 = new byte[8];
                    this.getWarnings = bArr6;
                    System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                    int[] iArr6 = this.getString;
                    iArr6[6] = iArr6[6] ^ setTextFontSize.cca_continue(bArr2, 0);
                    int[] iArr7 = this.getString;
                    iArr7[7] = setTextFontSize.cca_continue(bArr2, 4) ^ iArr7[7];
                    return;
                }
                throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
            }
        }

        public final int cca_continue() {
            return 64;
        }

        public final String configure() {
            return "BLAKE2s";
        }

        public final int getInstance() {
            return this.Cardinal;
        }

        public final void cca_continue(byte b) {
            int i = this.CardinalEnvironment;
            if (64 - i == 0) {
                int i2 = this.CardinalActionCode + 64;
                this.CardinalActionCode = i2;
                if (i2 == 0) {
                    this.CardinalChallengeObserver++;
                }
                cca_continue(this.valueOf, 0);
                byte[] bArr = this.valueOf;
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = 0;
                }
                this.valueOf[0] = b;
                this.CardinalEnvironment = 1;
                return;
            }
            this.valueOf[i] = b;
            this.CardinalEnvironment = i + 1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void init(byte[] r6, int r7, int r8) {
            /*
                r5 = this;
                if (r6 == 0) goto L_0x0060
                if (r8 != 0) goto L_0x0005
                goto L_0x0060
            L_0x0005:
                int r0 = r5.CardinalEnvironment
                r1 = 0
                if (r0 == 0) goto L_0x003e
                int r2 = 64 - r0
                if (r2 >= r8) goto L_0x0033
                byte[] r3 = r5.valueOf
                java.lang.System.arraycopy(r6, r7, r3, r0, r2)
                int r0 = r5.CardinalActionCode
                int r0 = r0 + 64
                r5.CardinalActionCode = r0
                if (r0 != 0) goto L_0x0021
                int r0 = r5.CardinalChallengeObserver
                int r0 = r0 + 1
                r5.CardinalChallengeObserver = r0
            L_0x0021:
                byte[] r0 = r5.valueOf
                r5.cca_continue(r0, r1)
                r5.CardinalEnvironment = r1
                byte[] r0 = r5.valueOf
                r3 = r1
            L_0x002b:
                int r4 = r0.length
                if (r3 >= r4) goto L_0x003f
                r0[r3] = r1
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0033:
                byte[] r1 = r5.valueOf
                java.lang.System.arraycopy(r6, r7, r1, r0, r8)
            L_0x0038:
                int r6 = r5.CardinalEnvironment
                int r6 = r6 + r8
                r5.CardinalEnvironment = r6
                return
            L_0x003e:
                r2 = r1
            L_0x003f:
                int r8 = r8 + r7
                int r0 = r8 + -64
                int r7 = r7 + r2
            L_0x0043:
                if (r7 >= r0) goto L_0x0059
                int r2 = r5.CardinalActionCode
                int r2 = r2 + 64
                r5.CardinalActionCode = r2
                if (r2 != 0) goto L_0x0053
                int r2 = r5.CardinalChallengeObserver
                int r2 = r2 + 1
                r5.CardinalChallengeObserver = r2
            L_0x0053:
                r5.cca_continue(r6, r7)
                int r7 = r7 + 64
                goto L_0x0043
            L_0x0059:
                byte[] r0 = r5.valueOf
                int r8 = r8 - r7
                java.lang.System.arraycopy(r6, r7, r0, r1, r8)
                goto L_0x0038
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.MQV.init(byte[], int, int):void");
        }

        public final int init(byte[] bArr, int i) {
            int[] iArr;
            int i2;
            this.CardinalUiType = -1;
            int i3 = this.CardinalActionCode;
            int i4 = this.CardinalEnvironment;
            int i5 = i3 + i4;
            this.CardinalActionCode = i5;
            if (i5 < 0 && i4 > (-i5)) {
                this.CardinalChallengeObserver++;
            }
            cca_continue(this.valueOf, 0);
            byte[] bArr2 = this.valueOf;
            for (int i6 = 0; i6 < bArr2.length; i6++) {
                bArr2[i6] = 0;
            }
            int[] iArr2 = this.getActionCode;
            for (int i7 = 0; i7 < iArr2.length; i7++) {
                iArr2[i7] = 0;
            }
            int i8 = 0;
            while (true) {
                iArr = this.getString;
                if (i8 >= iArr.length || (i2 = i8 << 2) >= this.Cardinal) {
                } else {
                    byte[] bArr3 = new byte[4];
                    setTextFontSize.getInstance(iArr[i8], bArr3, 0);
                    int i9 = this.Cardinal;
                    if (i2 < i9 - 4) {
                        System.arraycopy(bArr3, 0, bArr, i2 + i, 4);
                    } else {
                        System.arraycopy(bArr3, 0, bArr, i + i2, i9 - i2);
                    }
                    i8++;
                }
            }
            for (int i10 = 0; i10 < iArr.length; i10++) {
                iArr[i10] = 0;
            }
            init();
            return this.Cardinal;
        }

        public final void init() {
            this.CardinalEnvironment = 0;
            this.CardinalUiType = 0;
            this.CardinalActionCode = 0;
            this.CardinalChallengeObserver = 0;
            this.getString = null;
            byte[] bArr = this.valueOf;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = 0;
            }
            byte[] bArr2 = this.cleanup;
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, this.valueOf, 0, bArr2.length);
                this.CardinalEnvironment = 64;
            }
            cca_continue(this.getInstance, this.getWarnings, this.cleanup);
        }

        private void cca_continue(int i, int i2, int i3, int i4, int i5, int i6) {
            int[] iArr = this.getActionCode;
            int i7 = iArr[i3] + iArr[i4] + i;
            iArr[i3] = i7;
            int i8 = iArr[i6] ^ i7;
            int i9 = (i8 << 16) | (i8 >>> 16);
            iArr[i6] = i9;
            int i10 = iArr[i5] + i9;
            iArr[i5] = i10;
            int i11 = iArr[i4] ^ i10;
            int i12 = (i11 << 20) | (i11 >>> 12);
            iArr[i4] = i12;
            int i13 = iArr[i3] + i12 + i2;
            iArr[i3] = i13;
            int i14 = iArr[i6] ^ i13;
            int i15 = (i14 << 24) | (i14 >>> 8);
            iArr[i6] = i15;
            int i16 = iArr[i5] + i15;
            iArr[i5] = i16;
            int i17 = iArr[i4] ^ i16;
            iArr[i4] = (i17 << 25) | (i17 >>> 7);
        }
    }

    public final class MQVwithSHA1CKDF extends setRenderType {
        public setEnableDFSync init;

        MQVwithSHA1CKDF(setEnableDFSync setenabledfsync) {
            this.init = setenabledfsync;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return this.init;
        }

        public final MQVwithSHA224KDF getInstance() {
            if (this.init.cca_continue.size() == 0) {
                return null;
            }
            return MQVwithSHA224KDF.Cardinal((CardinalConfigurationParameters) this.init.cca_continue.elementAt(0));
        }

        public final MQVwithSHA224KDF[] Cardinal() {
            int size = this.init.cca_continue.size();
            MQVwithSHA224KDF[] mQVwithSHA224KDFArr = new MQVwithSHA224KDF[size];
            for (int i = 0; i != size; i++) {
                mQVwithSHA224KDFArr[i] = MQVwithSHA224KDF.Cardinal((CardinalConfigurationParameters) this.init.cca_continue.elementAt(i));
            }
            return mQVwithSHA224KDFArr;
        }
    }

    public final class MQVwithSHA1KDF {
        private final int cca_continue;
        private final byte[][] getInstance;
        private final InputStream init;

        public MQVwithSHA1KDF() {
        }

        private static String configure(String str, byte[] bArr) {
            String configure;
            String instance = getTextFontSize.getInstance();
            StringBuffer stringBuffer = new StringBuffer();
            String obj = new StringBuilder().append(str).append("    ").toString();
            stringBuffer.append(instance);
            for (int i = 0; i < bArr.length; i += 32) {
                int length = bArr.length - i;
                stringBuffer.append(obj);
                if (length > 32) {
                    stringBuffer.append(getTextFontSize.getInstance(getHeadingTextFontName.cca_continue(bArr, i, 32)));
                    stringBuffer.append("    ");
                    configure = configure(bArr, i, 32);
                } else {
                    stringBuffer.append(getTextFontSize.getInstance(getHeadingTextFontName.cca_continue(bArr, i, bArr.length - i)));
                    for (int length2 = bArr.length - i; length2 != 32; length2++) {
                        stringBuffer.append("  ");
                    }
                    stringBuffer.append("    ");
                    configure = configure(bArr, i, bArr.length - i);
                }
                stringBuffer.append(configure);
                stringBuffer.append(instance);
            }
            return stringBuffer.toString();
        }

        private static String configure(byte[] bArr, int i, int i2) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i3 = i; i3 != i + i2; i3++) {
                byte b = bArr[i3];
                if (b >= 32 && b <= 126) {
                    stringBuffer.append((char) b);
                }
            }
            return stringBuffer.toString();
        }

        public static byte[] getInstance(int i) {
            return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
        }

        private static void configure(String str, boolean z, getThreeDSRequestorAppURL getthreedsrequestorappurl, StringBuffer stringBuffer) {
            StringBuilder sb;
            int i;
            while (true) {
                String instance = getTextFontSize.getInstance();
                if (getthreedsrequestorappurl instanceof isEnableLogging) {
                    Enumeration init2 = ((isEnableLogging) getthreedsrequestorappurl).init();
                    String obj = new StringBuilder().append(str).append("    ").toString();
                    stringBuffer.append(str);
                    stringBuffer.append(getthreedsrequestorappurl instanceof getPaResStatus ? "BER Sequence" : getthreedsrequestorappurl instanceof getProcessorTransactionId ? "DER Sequence" : "Sequence");
                    while (true) {
                        stringBuffer.append(instance);
                        while (init2.hasMoreElements()) {
                            Object nextElement = init2.nextElement();
                            if (nextElement == null || nextElement.equals(isEnabledVisaCheckout.configure)) {
                                stringBuffer.append(obj);
                                stringBuffer.append("NULL");
                            } else {
                                configure(obj, z, nextElement instanceof getThreeDSRequestorAppURL ? (getThreeDSRequestorAppURL) nextElement : ((CardinalConfigurationParameters) nextElement).onCReqSuccess(), stringBuffer);
                            }
                        }
                        return;
                    }
                } else if (getthreedsrequestorappurl instanceof setEnableLogging) {
                    String obj2 = new StringBuilder().append(str).append("    ").toString();
                    stringBuffer.append(str);
                    stringBuffer.append(getthreedsrequestorappurl instanceof Payload ? "BER Tagged [" : "Tagged [");
                    setEnableLogging setenablelogging = (setEnableLogging) getthreedsrequestorappurl;
                    stringBuffer.append(Integer.toString(setenablelogging.Cardinal));
                    stringBuffer.append(']');
                    if (!setenablelogging.cca_continue) {
                        stringBuffer.append(" IMPLICIT ");
                    }
                    stringBuffer.append(instance);
                    boolean z2 = setenablelogging.init;
                    getthreedsrequestorappurl = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
                    str = obj2;
                } else if (getthreedsrequestorappurl instanceof setEnableDFSync) {
                    Enumeration elements = ((setEnableDFSync) getthreedsrequestorappurl).cca_continue.elements();
                    String obj3 = new StringBuilder().append(str).append("    ").toString();
                    stringBuffer.append(str);
                    stringBuffer.append(getthreedsrequestorappurl instanceof setEnabledDiscover ? "BER Set" : getthreedsrequestorappurl instanceof getType ? "DER Set" : "Set");
                    while (true) {
                        stringBuffer.append(instance);
                        while (elements.hasMoreElements()) {
                            Object nextElement2 = elements.nextElement();
                            if (nextElement2 == null) {
                                stringBuffer.append(obj3);
                                stringBuffer.append("NULL");
                            } else {
                                configure(obj3, z, nextElement2 instanceof getThreeDSRequestorAppURL ? (getThreeDSRequestorAppURL) nextElement2 : ((CardinalConfigurationParameters) nextElement2).onCReqSuccess(), stringBuffer);
                            }
                        }
                        return;
                    }
                } else if (getthreedsrequestorappurl instanceof setUICustomization) {
                    setUICustomization setuicustomization = (setUICustomization) getthreedsrequestorappurl;
                    if (getthreedsrequestorappurl instanceof getEciFlag) {
                        sb = new StringBuilder().append(str).append("BER Constructed Octet String[");
                        i = setuicustomization.getInstance().length;
                    } else {
                        sb = new StringBuilder().append(str).append("DER Octet String[");
                        i = setuicustomization.getInstance().length;
                    }
                    stringBuffer.append(sb.append(i).append("] ").toString());
                    if (z) {
                        stringBuffer.append(configure(str, setuicustomization.getInstance()));
                        return;
                    } else {
                        stringBuffer.append(instance);
                        return;
                    }
                } else if (getthreedsrequestorappurl instanceof ASN1ObjectIdentifier) {
                    stringBuffer.append(new StringBuilder().append(str).append("ObjectIdentifier(").append(((ASN1ObjectIdentifier) getthreedsrequestorappurl).init).append(")").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof setChallengeTimeout) {
                    StringBuilder append = new StringBuilder().append(str).append("Boolean(");
                    byte[] bArr = ((setChallengeTimeout) getthreedsrequestorappurl).init;
                    boolean z3 = false;
                    if (bArr[0] != 0) {
                        z3 = true;
                    }
                    stringBuffer.append(append.append(z3).append(")").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof setEnvironment) {
                    stringBuffer.append(new StringBuilder().append(str).append("Integer(").append(new BigInteger(((setEnvironment) getthreedsrequestorappurl).getInstance)).append(")").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof getDeviceFingerprint) {
                    getDeviceFingerprint getdevicefingerprint = (getDeviceFingerprint) getthreedsrequestorappurl;
                    stringBuffer.append(new StringBuilder().append(str).append("DER Bit String[").append(getdevicefingerprint.getInstance().length).append(", ").append(getdevicefingerprint.onValidated()).append("] ").toString());
                    if (z) {
                        stringBuffer.append(configure(str, getdevicefingerprint.getInstance()));
                        return;
                    } else {
                        stringBuffer.append(instance);
                        return;
                    }
                } else if (getthreedsrequestorappurl instanceof isEnabledHostedFields) {
                    stringBuffer.append(new StringBuilder().append(str).append("IA5String(").append(((isEnabledHostedFields) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof isValidated) {
                    stringBuffer.append(new StringBuilder().append(str).append("UTF8String(").append(((isValidated) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof ValidateResponse) {
                    stringBuffer.append(new StringBuilder().append(str).append("PrintableString(").append(((ValidateResponse) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof SubjectPublicKeyInfo) {
                    stringBuffer.append(new StringBuilder().append(str).append("VisibleString(").append(((SubjectPublicKeyInfo) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof setEnabledPaypal) {
                    stringBuffer.append(new StringBuilder().append(str).append("BMPString(").append(((setEnabledPaypal) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof onSetupCompleted) {
                    stringBuffer.append(new StringBuilder().append(str).append("T61String(").append(((onSetupCompleted) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof getErrorDescription) {
                    stringBuffer.append(new StringBuilder().append(str).append("GraphicString(").append(((getErrorDescription) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof DH.Mappings) {
                    stringBuffer.append(new StringBuilder().append(str).append("VideotexString(").append(((DH.Mappings) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof ExtendedData) {
                    stringBuffer.append(new StringBuilder().append(str).append("UTCTime(").append(((ExtendedData) getthreedsrequestorappurl).init()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof getUiType) {
                    stringBuffer.append(new StringBuilder().append(str).append("GeneralizedTime(").append(((getUiType) getthreedsrequestorappurl).cca_continue()).append(") ").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof getJSON) {
                    stringBuffer.append(configure("BER", str, z, getthreedsrequestorappurl, instance));
                    return;
                } else if (getthreedsrequestorappurl instanceof setDeviceFingerprint) {
                    stringBuffer.append(configure("DER", str, z, getthreedsrequestorappurl, instance));
                    return;
                } else if (getthreedsrequestorappurl instanceof ASN1ObjectIdentifier) {
                    stringBuffer.append(configure("", str, z, getthreedsrequestorappurl, instance));
                    return;
                } else if (getthreedsrequestorappurl instanceof setRequestTimeout) {
                    stringBuffer.append(new StringBuilder().append(str).append("DER Enumerated(").append(new BigInteger(((setRequestTimeout) getthreedsrequestorappurl).Cardinal)).append(")").append(instance).toString());
                    return;
                } else if (getthreedsrequestorappurl instanceof getEnvironment) {
                    getEnvironment getenvironment = (getEnvironment) getthreedsrequestorappurl;
                    stringBuffer.append(new StringBuilder().append(str).append("External ").append(instance).toString());
                    str = new StringBuilder().append(str).append("    ").toString();
                    if (getenvironment.cca_continue() != null) {
                        stringBuffer.append(new StringBuilder().append(str).append("Direct Reference: ").append(getenvironment.cca_continue().init).append(instance).toString());
                    }
                    if (getenvironment.cleanup() != null) {
                        stringBuffer.append(new StringBuilder().append(str).append("Indirect Reference: ").append(getenvironment.cleanup().toString()).append(instance).toString());
                    }
                    if (getenvironment.init() != null) {
                        configure(str, z, getenvironment.init(), stringBuffer);
                    }
                    stringBuffer.append(new StringBuilder().append(str).append("Encoding: ").append(getenvironment.getInstance()).append(instance).toString());
                    getthreedsrequestorappurl = getenvironment.onValidated();
                } else {
                    stringBuffer.append(new StringBuilder().append(str).append(getthreedsrequestorappurl.toString()).append(instance).toString());
                    return;
                }
            }
        }

        private static String configure(String str, String str2, boolean z, getThreeDSRequestorAppURL getthreedsrequestorappurl, String str3) {
            int i;
            if (getthreedsrequestorappurl == null || (getthreedsrequestorappurl instanceof CardinalUiType)) {
                CardinalUiType cardinalUiType = (CardinalUiType) getthreedsrequestorappurl;
                StringBuffer stringBuffer = new StringBuffer();
                if (!cardinalUiType.configure()) {
                    return new StringBuilder().append(str2).append(str).append(" ApplicationSpecific[").append(cardinalUiType.cca_continue()).append("] (").append(getTextFontSize.getInstance(getHeadingTextFontName.init(cardinalUiType.getInstance()))).append(")").append(str3).toString();
                }
                try {
                    byte[] encoded = cardinalUiType.getEncoded();
                    if ((encoded[0] & Ascii.US) == 31) {
                        byte b = encoded[1] & 255;
                        if ((b & Byte.MAX_VALUE) != 0) {
                            i = 2;
                            while ((b & 128) != 0) {
                                byte b2 = encoded[i] & 255;
                                i++;
                                b = b2;
                            }
                        } else {
                            throw new IOException("corrupted stream - invalid high tag number found");
                        }
                    } else {
                        i = 1;
                    }
                    int length = (encoded.length - i) + 1;
                    byte[] bArr = new byte[length];
                    System.arraycopy(encoded, i, bArr, 1, length - 1);
                    bArr[0] = Ascii.DLE;
                    if ((encoded[0] & 32) != 0) {
                        bArr[0] = (byte) (16 | 32);
                    }
                    isEnableLogging instance = isEnableLogging.getInstance((Object) getThreeDSRequestorAppURL.Cardinal(bArr));
                    stringBuffer.append(new StringBuilder().append(str2).append(str).append(" ApplicationSpecific[").append(cardinalUiType.cca_continue()).append("]").append(str3).toString());
                    Enumeration init2 = instance.init();
                    while (init2.hasMoreElements()) {
                        configure(new StringBuilder().append(str2).append("    ").toString(), z, (getThreeDSRequestorAppURL) init2.nextElement(), stringBuffer);
                    }
                } catch (IOException e) {
                    stringBuffer.append(e);
                }
                return stringBuffer.toString();
            }
            throw new IllegalArgumentException(new StringBuilder("unknown object in getInstance: ").append(getthreedsrequestorappurl.getClass().getName()).toString());
        }

        public static String configure(Object obj) {
            getThreeDSRequestorAppURL onCReqSuccess;
            StringBuffer stringBuffer = new StringBuffer();
            if (obj instanceof getThreeDSRequestorAppURL) {
                onCReqSuccess = (getThreeDSRequestorAppURL) obj;
            } else if (!(obj instanceof CardinalConfigurationParameters)) {
                return new StringBuilder("unknown object type ").append(obj.toString()).toString();
            } else {
                onCReqSuccess = ((CardinalConfigurationParameters) obj).onCReqSuccess();
            }
            configure("", false, onCReqSuccess, stringBuffer);
            return stringBuffer.toString();
        }

        public MQVwithSHA1KDF(InputStream inputStream) {
            this(inputStream, GM.Mappings.Cardinal(inputStream));
        }

        public MQVwithSHA1KDF(InputStream inputStream, int i) {
            this.init = inputStream;
            this.cca_continue = i;
            this.getInstance = new byte[11][];
        }

        public final getThreeDSRequestorAppURL Cardinal(boolean z, int i) throws IOException {
            if (!z) {
                return new getPayment(false, i, new setEnabledVisaCheckout(((EdEC.Mappings) this.init).configure()));
            }
            getBackgroundColor init2 = init();
            if (!(this.init instanceof ECGOST)) {
                return init2.getInstance.size() == 1 ? new getPayment(true, i, (CardinalConfigurationParameters) init2.getInstance.elementAt(0)) : new getPayment(false, i, isEnabledCCA.getInstance(init2));
            }
            if (init2.getInstance.size() == 1) {
                return new Payload(true, i, (CardinalConfigurationParameters) init2.getInstance.elementAt(0));
            }
            return new Payload(false, i, getXid.init(init2));
        }

        public final CardinalConfigurationParameters cca_continue() throws IOException {
            int read = this.init.read();
            if (read == -1) {
                return null;
            }
            InputStream inputStream = this.init;
            boolean z = false;
            if (inputStream instanceof ECGOST) {
                ((ECGOST) inputStream).configure(false);
            }
            int cca_continue2 = getProxyAddress.cca_continue(this.init, read);
            if ((read & 32) != 0) {
                z = true;
            }
            int instance = getProxyAddress.getInstance(this.init, this.cca_continue);
            if (instance >= 0) {
                EdEC.Mappings mappings = new EdEC.Mappings(this.init, instance);
                if ((read & 64) != 0) {
                    return new ASN1ObjectIdentifier(z, cca_continue2, mappings.configure());
                }
                if ((read & 128) != 0) {
                    return new isEnabledDiscover(z, cca_continue2, new MQVwithSHA1KDF(mappings));
                }
                if (z) {
                    if (cca_continue2 == 4) {
                        return new getCavv(new MQVwithSHA1KDF(mappings));
                    }
                    if (cca_continue2 == 8) {
                        return new setDeviceFingerprintUrl(new MQVwithSHA1KDF(mappings));
                    }
                    if (cca_continue2 == 16) {
                        return new Payment(new MQVwithSHA1KDF(mappings));
                    }
                    if (cca_continue2 == 17) {
                        return new CardinalInitService(new MQVwithSHA1KDF(mappings));
                    }
                    throw new IOException(new StringBuilder("unknown tag ").append(cca_continue2).append(" encountered").toString());
                } else if (cca_continue2 == 4) {
                    return new setEnabledHostedFields(mappings);
                } else {
                    try {
                        return getProxyAddress.configure(cca_continue2, mappings, this.getInstance);
                    } catch (IllegalArgumentException e) {
                        throw new setProxyAddress("corrupted stream detected", e);
                    }
                }
            } else if (z) {
                MQVwithSHA1KDF mQVwithSHA1KDF = new MQVwithSHA1KDF(new ECGOST(this.init, this.cca_continue), this.cca_continue);
                if ((read & 64) != 0) {
                    return new getEnrolled(cca_continue2, mQVwithSHA1KDF);
                }
                if ((read & 128) != 0) {
                    return new isEnabledDiscover(true, cca_continue2, mQVwithSHA1KDF);
                }
                if (cca_continue2 == 4) {
                    return new getCavv(mQVwithSHA1KDF);
                }
                if (cca_continue2 == 8) {
                    return new setDeviceFingerprintUrl(mQVwithSHA1KDF);
                }
                if (cca_continue2 == 16) {
                    return new isEnabledPaypal(mQVwithSHA1KDF);
                }
                if (cca_continue2 == 17) {
                    return new getSignatureVerification(mQVwithSHA1KDF);
                }
                throw new setProxyAddress(new StringBuilder("unknown BER object encountered: 0x").append(Integer.toHexString(cca_continue2)).toString());
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        }

        public final getBackgroundColor init() throws IOException {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            while (true) {
                CardinalConfigurationParameters cca_continue2 = cca_continue();
                if (cca_continue2 == null) {
                    return getbackgroundcolor;
                }
                if (cca_continue2 instanceof EdEC) {
                    getbackgroundcolor.getInstance.addElement(((EdEC) cca_continue2).init());
                } else {
                    getbackgroundcolor.getInstance.addElement(cca_continue2.onCReqSuccess());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$SHA256} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$SHA256} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$SHA256} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA512CKDF} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.cardinalcommerce.a.KeyPairGeneratorSpi$X25519} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$SHA256} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: com.cardinalcommerce.a.DigestSignatureSpi$SHA256} */
        /* JADX WARNING: type inference failed for: r4v6, types: [byte[], java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.cardinalcommerce.a.setCCAImageUri configure(byte[] r13) {
            /*
                com.cardinalcommerce.a.PSSSignatureSpi$SHA512withRSA r0 = new com.cardinalcommerce.a.PSSSignatureSpi$SHA512withRSA
                r0.<init>(r13)
                byte[] r13 = r0.getInstance()
                java.lang.String r13 = com.cardinalcommerce.a.getTextFontSize.getInstance(r13)
                java.lang.String r1 = "ssh-rsa"
                boolean r1 = r1.equals(r13)
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0026
                java.math.BigInteger r13 = r0.Cardinal()
                java.math.BigInteger r1 = r0.Cardinal()
                com.cardinalcommerce.a.DigestSignatureSpi$SHA256 r4 = new com.cardinalcommerce.a.DigestSignatureSpi$SHA256
                r4.<init>(r3, r1, r13)
                goto L_0x00ec
            L_0x0026:
                java.lang.String r1 = "ssh-dss"
                boolean r1 = r1.equals(r13)
                if (r1 == 0) goto L_0x004b
                java.math.BigInteger r13 = r0.Cardinal()
                java.math.BigInteger r1 = r0.Cardinal()
                java.math.BigInteger r4 = r0.Cardinal()
                java.math.BigInteger r5 = r0.Cardinal()
                com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA512CKDF r6 = new com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA512CKDF
                com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA256CKDF r7 = new com.cardinalcommerce.a.KeyAgreementSpi$X448withSHA256CKDF
                r7.<init>(r13, r1, r4)
                r6.<init>(r5, r7)
                r4 = r6
                goto L_0x00ec
            L_0x004b:
                java.lang.String r1 = "ecdsa"
                boolean r1 = r13.startsWith(r1)
                r4 = 0
                if (r1 == 0) goto L_0x00db
                byte[] r1 = r0.getInstance()
                java.lang.String r1 = com.cardinalcommerce.a.getTextFontSize.getInstance(r1)
                java.lang.String r5 = "nist"
                boolean r5 = r1.startsWith(r5)
                if (r5 == 0) goto L_0x0088
                r5 = 4
                java.lang.String r1 = r1.substring(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = r1.substring(r3, r2)
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r6 = "-"
                java.lang.StringBuilder r5 = r5.append(r6)
                java.lang.String r1 = r1.substring(r2)
                java.lang.StringBuilder r1 = r5.append(r1)
                java.lang.String r1 = r1.toString()
            L_0x0088:
                com.cardinalcommerce.a.GMCipherSpi r5 = com.cardinalcommerce.a.SignatureSpi.cca_continue((java.lang.String) r1)
                if (r5 == 0) goto L_0x00bc
                com.cardinalcommerce.a.toJSONString r7 = r5.init
                byte[] r13 = r0.getInstance()
                com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH r1 = new com.cardinalcommerce.a.KeyPairGeneratorSpi$XDH
                com.cardinalcommerce.a.JSONNavi r13 = r7.cca_continue((byte[]) r13)
                com.cardinalcommerce.a.KeyFactorySpi$EDDSA r12 = new com.cardinalcommerce.a.KeyFactorySpi$EDDSA
                com.cardinalcommerce.a.ECUtils r6 = r5.getInstance
                com.cardinalcommerce.a.JSONNavi r8 = r6.cca_continue()
                java.math.BigInteger r9 = r5.cca_continue
                java.math.BigInteger r10 = r5.configure
                byte[] r5 = r5.Cardinal
                if (r5 != 0) goto L_0x00ab
                goto L_0x00b2
            L_0x00ab:
                int r4 = r5.length
                byte[] r4 = new byte[r4]
                int r6 = r5.length
                java.lang.System.arraycopy(r5, r3, r4, r3, r6)
            L_0x00b2:
                r11 = r4
                r6 = r12
                r6.<init>(r7, r8, r9, r10, r11)
                r1.<init>(r13, r12)
                r4 = r1
                goto L_0x00ec
            L_0x00bc:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "unable to find curve for "
                r2.<init>(r3)
                java.lang.StringBuilder r13 = r2.append(r13)
                java.lang.String r2 = " using curve name "
                java.lang.StringBuilder r13 = r13.append(r2)
                java.lang.StringBuilder r13 = r13.append(r1)
                java.lang.String r13 = r13.toString()
                r0.<init>(r13)
                throw r0
            L_0x00db:
                java.lang.String r1 = "ssh-ed25519"
                boolean r13 = r13.startsWith(r1)
                if (r13 == 0) goto L_0x00ec
                com.cardinalcommerce.a.KeyPairGeneratorSpi$X25519 r4 = new com.cardinalcommerce.a.KeyPairGeneratorSpi$X25519
                byte[] r13 = r0.getInstance()
                r4.<init>(r13, r3)
            L_0x00ec:
                if (r4 == 0) goto L_0x0102
                int r13 = r0.cca_continue
                byte[] r0 = r0.init
                int r0 = r0.length
                if (r13 >= r0) goto L_0x00f6
                goto L_0x00f7
            L_0x00f6:
                r2 = r3
            L_0x00f7:
                if (r2 != 0) goto L_0x00fa
                return r4
            L_0x00fa:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "uncoded key has trailing data"
                r13.<init>(r0)
                throw r13
            L_0x0102:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "unable to parse key"
                r13.<init>(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA1KDF.configure(byte[]):com.cardinalcommerce.a.setCCAImageUri");
        }

        public static byte[] getInstance(setCCAImageUri setccaimageuri) throws IOException {
            byte[] bArr;
            if (setccaimageuri instanceof DigestSignatureSpi.SHA256) {
                if (!setccaimageuri.getSDKVersion) {
                    DigestSignatureSpi.SHA256 sha256 = (DigestSignatureSpi.SHA256) setccaimageuri;
                    BigInteger bigInteger = sha256.cca_continue;
                    BigInteger bigInteger2 = sha256.getInstance;
                    PSSSignatureSpi.SHA3_512withRSA sHA3_512withRSA = new PSSSignatureSpi.SHA3_512withRSA();
                    byte[] configure = getTextFontSize.configure("ssh-rsa");
                    sHA3_512withRSA.configure((long) configure.length);
                    try {
                        sHA3_512withRSA.configure.write(configure);
                        byte[] byteArray = bigInteger.toByteArray();
                        sHA3_512withRSA.configure((long) byteArray.length);
                        try {
                            sHA3_512withRSA.configure.write(byteArray);
                            byte[] byteArray2 = bigInteger2.toByteArray();
                            sHA3_512withRSA.configure((long) byteArray2.length);
                            try {
                                sHA3_512withRSA.configure.write(byteArray2);
                                return sHA3_512withRSA.configure.toByteArray();
                            } catch (IOException e) {
                                throw new IllegalStateException(e.getMessage(), e);
                            }
                        } catch (IOException e2) {
                            throw new IllegalStateException(e2.getMessage(), e2);
                        }
                    } catch (IOException e3) {
                        throw new IllegalStateException(e3.getMessage(), e3);
                    }
                } else {
                    throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
                }
            } else if (setccaimageuri instanceof KeyPairGeneratorSpi.XDH) {
                PSSSignatureSpi.SHA3_512withRSA sHA3_512withRSA2 = new PSSSignatureSpi.SHA3_512withRSA();
                KeyPairGeneratorSpi.XDH xdh = (KeyPairGeneratorSpi.XDH) setccaimageuri;
                if (xdh.Cardinal.cca_continue instanceof objectFirstStart) {
                    byte[] configure2 = getTextFontSize.configure("ecdsa-sha2-".concat("nistp256"));
                    sHA3_512withRSA2.configure((long) configure2.length);
                    try {
                        sHA3_512withRSA2.configure.write(configure2);
                        byte[] configure3 = getTextFontSize.configure("nistp256");
                        sHA3_512withRSA2.configure((long) configure3.length);
                        try {
                            sHA3_512withRSA2.configure.write(configure3);
                            byte[] Cardinal = xdh.configure.Cardinal(false);
                            sHA3_512withRSA2.configure((long) Cardinal.length);
                            try {
                                sHA3_512withRSA2.configure.write(Cardinal);
                                return sHA3_512withRSA2.configure.toByteArray();
                            } catch (IOException e4) {
                                throw new IllegalStateException(e4.getMessage(), e4);
                            }
                        } catch (IOException e5) {
                            throw new IllegalStateException(e5.getMessage(), e5);
                        }
                    } catch (IOException e6) {
                        throw new IllegalStateException(e6.getMessage(), e6);
                    }
                } else {
                    throw new IllegalArgumentException(new StringBuilder("unable to derive ssh curve name for ").append(xdh.Cardinal.cca_continue.getClass().getName()).toString());
                }
            } else if (setccaimageuri instanceof X448withSHA512CKDF) {
                PSSSignatureSpi.SHA3_512withRSA sHA3_512withRSA3 = new PSSSignatureSpi.SHA3_512withRSA();
                byte[] configure4 = getTextFontSize.configure("ssh-dss");
                sHA3_512withRSA3.configure((long) configure4.length);
                try {
                    sHA3_512withRSA3.configure.write(configure4);
                    X448withSHA512CKDF x448withSHA512CKDF = (X448withSHA512CKDF) setccaimageuri;
                    byte[] byteArray3 = x448withSHA512CKDF.configure.configure.toByteArray();
                    sHA3_512withRSA3.configure((long) byteArray3.length);
                    try {
                        sHA3_512withRSA3.configure.write(byteArray3);
                        byte[] byteArray4 = x448withSHA512CKDF.configure.init.toByteArray();
                        sHA3_512withRSA3.configure((long) byteArray4.length);
                        try {
                            sHA3_512withRSA3.configure.write(byteArray4);
                            byte[] byteArray5 = x448withSHA512CKDF.configure.Cardinal.toByteArray();
                            sHA3_512withRSA3.configure((long) byteArray5.length);
                            try {
                                sHA3_512withRSA3.configure.write(byteArray5);
                                byte[] byteArray6 = x448withSHA512CKDF.init.toByteArray();
                                sHA3_512withRSA3.configure((long) byteArray6.length);
                                try {
                                    sHA3_512withRSA3.configure.write(byteArray6);
                                    return sHA3_512withRSA3.configure.toByteArray();
                                } catch (IOException e7) {
                                    throw new IllegalStateException(e7.getMessage(), e7);
                                }
                            } catch (IOException e8) {
                                throw new IllegalStateException(e8.getMessage(), e8);
                            }
                        } catch (IOException e9) {
                            throw new IllegalStateException(e9.getMessage(), e9);
                        }
                    } catch (IOException e10) {
                        throw new IllegalStateException(e10.getMessage(), e10);
                    }
                } catch (IOException e11) {
                    throw new IllegalStateException(e11.getMessage(), e11);
                }
            } else if (setccaimageuri instanceof KeyPairGeneratorSpi.X25519) {
                PSSSignatureSpi.SHA3_512withRSA sHA3_512withRSA4 = new PSSSignatureSpi.SHA3_512withRSA();
                byte[] configure5 = getTextFontSize.configure("ssh-ed25519");
                sHA3_512withRSA4.configure((long) configure5.length);
                try {
                    sHA3_512withRSA4.configure.write(configure5);
                    byte[] bArr2 = ((KeyPairGeneratorSpi.X25519) setccaimageuri).getInstance;
                    if (bArr2 == null) {
                        bArr = null;
                    } else {
                        byte[] bArr3 = new byte[bArr2.length];
                        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                        bArr = bArr3;
                    }
                    sHA3_512withRSA4.configure((long) bArr.length);
                    try {
                        sHA3_512withRSA4.configure.write(bArr);
                        return sHA3_512withRSA4.configure.toByteArray();
                    } catch (IOException e12) {
                        throw new IllegalStateException(e12.getMessage(), e12);
                    }
                } catch (IOException e13) {
                    throw new IllegalStateException(e13.getMessage(), e13);
                }
            } else {
                throw new IllegalArgumentException(new StringBuilder("unable to convert ").append(setccaimageuri.getClass().getName()).append(" to private key").toString());
            }
        }

        public static String Cardinal(int i) {
            if (i == 0) {
                return "qTESLA-I";
            }
            if (i == 1) {
                return "qTESLA-III-size";
            }
            if (i == 2) {
                return "qTESLA-III-speed";
            }
            if (i == 3) {
                return "qTESLA-p-I";
            }
            if (i == 4) {
                return "qTESLA-p-III";
            }
            throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r2v14 */
        /* JADX WARNING: type inference failed for: r2v15 */
        /* JADX WARNING: type inference failed for: r2v16 */
        /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=?, for r2v4, types: [short[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo configure(com.cardinalcommerce.a.setCCAImageUri r23, com.cardinalcommerce.a.setEnableDFSync r24) throws java.io.IOException {
            /*
                r0 = r23
                boolean r1 = r0 instanceof com.cardinalcommerce.a.ChallengeStatusReceiver
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0029
                com.cardinalcommerce.a.ChallengeStatusReceiver r0 = (com.cardinalcommerce.a.ChallengeStatusReceiver) r0
                int r1 = r0.getInstance
                com.cardinalcommerce.a.BCDSAPrivateKey r1 = com.cardinalcommerce.a.close.Cardinal(r1)
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r4 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo
                com.cardinalcommerce.a.setEnabledVisaCheckout r5 = new com.cardinalcommerce.a.setEnabledVisaCheckout
                byte[] r0 = r0.cca_continue
                if (r0 != 0) goto L_0x0019
                goto L_0x0020
            L_0x0019:
                int r2 = r0.length
                byte[] r2 = new byte[r2]
                int r6 = r0.length
                java.lang.System.arraycopy(r0, r3, r2, r3, r6)
            L_0x0020:
                r5.<init>((byte[]) r2)
                r0 = r24
                r4.<init>(r1, r5, r0)
                return r4
            L_0x0029:
                boolean r1 = r0 instanceof com.cardinalcommerce.a.getAuthenticationRequestParameters
                if (r1 == 0) goto L_0x0058
                com.cardinalcommerce.a.getAuthenticationRequestParameters r0 = (com.cardinalcommerce.a.getAuthenticationRequestParameters) r0
                com.cardinalcommerce.a.BCDSAPrivateKey r1 = new com.cardinalcommerce.a.BCDSAPrivateKey
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r4 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers.configure
                com.cardinalcommerce.a.ChallengeParameters r5 = new com.cardinalcommerce.a.ChallengeParameters
                java.lang.String r6 = r0.getInstance
                com.cardinalcommerce.a.BCDSAPrivateKey r6 = com.cardinalcommerce.a.close.getInstance(r6)
                r5.<init>((com.cardinalcommerce.a.BCDSAPrivateKey) r6)
                r1.<init>(r4, r5)
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r4 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo
                com.cardinalcommerce.a.setEnabledVisaCheckout r5 = new com.cardinalcommerce.a.setEnabledVisaCheckout
                byte[] r0 = r0.cca_continue
                if (r0 != 0) goto L_0x004a
                goto L_0x0051
            L_0x004a:
                int r2 = r0.length
                byte[] r2 = new byte[r2]
                int r6 = r0.length
                java.lang.System.arraycopy(r0, r3, r2, r3, r6)
            L_0x0051:
                r5.<init>((byte[]) r2)
                r4.<init>(r1, r5)
                return r4
            L_0x0058:
                boolean r1 = r0 instanceof com.cardinalcommerce.a.timedout
                r4 = 1
                if (r1 == 0) goto L_0x0094
                com.cardinalcommerce.a.timedout r0 = (com.cardinalcommerce.a.timedout) r0
                com.cardinalcommerce.a.BCDSAPrivateKey r1 = new com.cardinalcommerce.a.BCDSAPrivateKey
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r5 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers.onValidated
                r1.<init>((com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier) r5)
                short[] r0 = r0.cca_continue
                if (r0 != 0) goto L_0x006b
                goto L_0x0072
            L_0x006b:
                int r2 = r0.length
                short[] r2 = new short[r2]
                int r5 = r0.length
                java.lang.System.arraycopy(r0, r3, r2, r3, r5)
            L_0x0072:
                int r0 = r2.length
                int r0 = r0 << r4
                byte[] r0 = new byte[r0]
            L_0x0076:
                int r5 = r2.length
                if (r3 == r5) goto L_0x0089
                short r5 = r2[r3]
                int r6 = r3 << 1
                byte r7 = (byte) r5
                r0[r6] = r7
                int r6 = r6 + r4
                int r5 = r5 >>> 8
                byte r5 = (byte) r5
                r0[r6] = r5
                int r3 = r3 + 1
                goto L_0x0076
            L_0x0089:
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r2 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo
                com.cardinalcommerce.a.setEnabledVisaCheckout r3 = new com.cardinalcommerce.a.setEnabledVisaCheckout
                r3.<init>((byte[]) r0)
                r2.<init>(r1, r3)
                return r2
            L_0x0094:
                boolean r1 = r0 instanceof com.cardinalcommerce.a.setImageDrawable
                java.lang.String r2 = "index out of bounds"
                java.lang.String r5 = "index must not be negative"
                r6 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0114
                com.cardinalcommerce.a.setImageDrawable r0 = (com.cardinalcommerce.a.setImageDrawable) r0
                com.cardinalcommerce.a.BCDSAPrivateKey r1 = new com.cardinalcommerce.a.BCDSAPrivateKey
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r10 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers.getSDKVersion
                com.cardinalcommerce.a.get3DSServerTransactionID r11 = new com.cardinalcommerce.a.get3DSServerTransactionID
                com.cardinalcommerce.a.setFocusableInTouchMode r12 = r0.Cardinal
                int r12 = r12.cca_continue
                java.lang.String r13 = r0.init
                com.cardinalcommerce.a.BCDSAPrivateKey r13 = com.cardinalcommerce.a.close.init(r13)
                r11.<init>(r12, r13)
                r1.<init>(r10, r11)
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r10 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo
                byte[] r11 = r0.Cardinal()
                com.cardinalcommerce.a.setFocusableInTouchMode r12 = r0.Cardinal
                com.cardinalcommerce.a.setVisibility r12 = r12.getInstance
                com.cardinalcommerce.a.setCheckState r12 = r12.configure
                int r12 = r12.getInstance
                com.cardinalcommerce.a.setFocusableInTouchMode r0 = r0.Cardinal
                int r0 = r0.cca_continue
                r13 = 4
                long r14 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.cca_continue((byte[]) r11, (int) r13)
                int r14 = (int) r14
                long r3 = (long) r14
                int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r8 < 0) goto L_0x010e
                long r5 = r6 << r0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00dd
                r3 = 1
                goto L_0x00de
            L_0x00dd:
                r3 = 0
            L_0x00de:
                if (r3 == 0) goto L_0x0108
                byte[] r18 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r11, r13, r12)
                int r0 = r12 + 4
                byte[] r19 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r11, r0, r12)
                int r0 = r0 + r12
                byte[] r20 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r11, r0, r12)
                int r0 = r0 + r12
                byte[] r21 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r11, r0, r12)
                int r0 = r0 + r12
                int r2 = r11.length
                int r2 = r2 - r0
                byte[] r22 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r11, r0, r2)
                com.cardinalcommerce.a.setAcsTransactionID r0 = new com.cardinalcommerce.a.setAcsTransactionID
                r16 = r0
                r17 = r14
                r16.<init>(r17, r18, r19, r20, r21, r22)
                r10.<init>(r1, r0)
                return r10
            L_0x0108:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r2)
                throw r0
            L_0x010e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r5)
                throw r0
            L_0x0114:
                boolean r1 = r0 instanceof com.cardinalcommerce.a.setButtonDrawable
                if (r1 == 0) goto L_0x0194
                com.cardinalcommerce.a.setButtonDrawable r0 = (com.cardinalcommerce.a.setButtonDrawable) r0
                com.cardinalcommerce.a.BCDSAPrivateKey r1 = new com.cardinalcommerce.a.BCDSAPrivateKey
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r3 = com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers.cleanup
                com.cardinalcommerce.a.getAcsTransactionID r4 = new com.cardinalcommerce.a.getAcsTransactionID
                com.cardinalcommerce.a.setCCAId r10 = r0.Cardinal
                int r10 = r10.configure
                com.cardinalcommerce.a.setCCAId r11 = r0.Cardinal
                int r11 = r11.getInstance
                java.lang.String r12 = r0.getInstance
                com.cardinalcommerce.a.BCDSAPrivateKey r12 = com.cardinalcommerce.a.close.init(r12)
                r4.<init>(r10, r11, r12)
                r1.<init>(r3, r4)
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo r3 = new com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo
                byte[] r4 = r0.getInstance()
                com.cardinalcommerce.a.setCCAId r10 = r0.Cardinal
                com.cardinalcommerce.a.setFocusableInTouchMode r10 = r10.Cardinal
                com.cardinalcommerce.a.setVisibility r10 = r10.getInstance
                com.cardinalcommerce.a.setCheckState r10 = r10.configure
                int r10 = r10.getInstance
                com.cardinalcommerce.a.setCCAId r0 = r0.Cardinal
                int r0 = r0.configure
                int r11 = r0 + 7
                int r11 = r11 / 8
                long r12 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.cca_continue((byte[]) r4, (int) r11)
                int r12 = (int) r12
                long r13 = (long) r12
                int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r8 < 0) goto L_0x018e
                long r5 = r6 << r0
                int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x015e
                r15 = 1
                goto L_0x015f
            L_0x015e:
                r15 = 0
            L_0x015f:
                if (r15 == 0) goto L_0x0188
                byte[] r18 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r4, r11, r10)
                int r11 = r11 + r10
                byte[] r19 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r4, r11, r10)
                int r11 = r11 + r10
                byte[] r20 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r4, r11, r10)
                int r11 = r11 + r10
                byte[] r21 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r4, r11, r10)
                int r11 = r11 + r10
                int r0 = r4.length
                int r0 = r0 - r11
                byte[] r22 = com.cardinalcommerce.a.setCCAFocusableInTouchMode.configure(r4, r11, r0)
                com.cardinalcommerce.a.setAcsRefNumber r0 = new com.cardinalcommerce.a.setAcsRefNumber
                r16 = r0
                r17 = r12
                r16.<init>(r17, r18, r19, r20, r21, r22)
                r3.<init>(r1, r0)
                return r3
            L_0x0188:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r2)
                throw r0
            L_0x018e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r5)
                throw r0
            L_0x0194:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "key parameters not recognized"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA1KDF.configure(com.cardinalcommerce.a.setCCAImageUri, com.cardinalcommerce.a.setEnableDFSync):com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo");
        }

        public static SubjectPublicKeyInfo cca_continue(setCCAImageUri setccaimageuri) throws IOException {
            byte[] bArr = null;
            if (setccaimageuri instanceof cancelled) {
                cancelled cancelled = (cancelled) setccaimageuri;
                BCDSAPrivateKey Cardinal = close.Cardinal(cancelled.configure);
                byte[] bArr2 = cancelled.Cardinal;
                if (bArr2 != null) {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                return new SubjectPublicKeyInfo(Cardinal, bArr);
            } else if (setccaimageuri instanceof ThreeDS2Service) {
                ThreeDS2Service threeDS2Service = (ThreeDS2Service) setccaimageuri;
                BCDSAPrivateKey bCDSAPrivateKey = new BCDSAPrivateKey(PQCObjectIdentifiers.configure, new ChallengeParameters(close.getInstance(threeDS2Service.getInstance)));
                byte[] bArr3 = threeDS2Service.configure;
                if (bArr3 != null) {
                    bArr = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
                }
                return new SubjectPublicKeyInfo(bCDSAPrivateKey, bArr);
            } else if (setccaimageuri instanceof completed) {
                BCDSAPrivateKey bCDSAPrivateKey2 = new BCDSAPrivateKey(PQCObjectIdentifiers.onValidated);
                byte[] bArr4 = ((completed) setccaimageuri).cca_continue;
                if (bArr4 != null) {
                    bArr = new byte[bArr4.length];
                    System.arraycopy(bArr4, 0, bArr, 0, bArr4.length);
                }
                return new SubjectPublicKeyInfo(bCDSAPrivateKey2, bArr);
            } else if (setccaimageuri instanceof setCCAOnCheckedChangeListener) {
                setCCAOnCheckedChangeListener setccaoncheckedchangelistener = (setCCAOnCheckedChangeListener) setccaimageuri;
                BCDSAPrivateKey bCDSAPrivateKey3 = new BCDSAPrivateKey(PQCObjectIdentifiers.getSDKVersion, new get3DSServerTransactionID(setccaoncheckedchangelistener.configure.cca_continue, close.init(setccaoncheckedchangelistener.init)));
                byte[] bArr5 = setccaoncheckedchangelistener.Cardinal;
                if (bArr5 != null) {
                    byte[] bArr6 = new byte[bArr5.length];
                    System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                    byte[] bArr7 = setccaoncheckedchangelistener.getInstance;
                    if (bArr7 != null) {
                        byte[] bArr8 = new byte[bArr7.length];
                        System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
                        return new SubjectPublicKeyInfo(bCDSAPrivateKey3, (CardinalConfigurationParameters) new set3DSServerTransactionID(bArr6, bArr8));
                    }
                    throw new NullPointerException("in == null");
                }
                throw new NullPointerException("in == null");
            } else if (setccaimageuri instanceof setOnCheckedChangeListener) {
                setOnCheckedChangeListener setoncheckedchangelistener = (setOnCheckedChangeListener) setccaimageuri;
                BCDSAPrivateKey bCDSAPrivateKey4 = new BCDSAPrivateKey(PQCObjectIdentifiers.cleanup, new getAcsTransactionID(setoncheckedchangelistener.cca_continue.configure, setoncheckedchangelistener.cca_continue.getInstance, close.init(setoncheckedchangelistener.getInstance)));
                byte[] bArr9 = setoncheckedchangelistener.configure;
                if (bArr9 != null) {
                    byte[] bArr10 = new byte[bArr9.length];
                    System.arraycopy(bArr9, 0, bArr10, 0, bArr9.length);
                    byte[] bArr11 = setoncheckedchangelistener.init;
                    if (bArr11 != null) {
                        byte[] bArr12 = new byte[bArr11.length];
                        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                        return new SubjectPublicKeyInfo(bCDSAPrivateKey4, (CardinalConfigurationParameters) new ConfigParameters(bArr10, bArr12));
                    }
                    throw new NullPointerException("in == null");
                }
                throw new NullPointerException("in == null");
            } else {
                throw new IOException("key parameters not recognized");
            }
        }

        public static getCause configure(DirectoryServerID directoryServerID, SDKRuntimeException sDKRuntimeException) {
            DirectoryServerID directoryServerID2 = directoryServerID;
            SDKRuntimeException sDKRuntimeException2 = sDKRuntimeException;
            int i = directoryServerID2.Cardinal;
            int i2 = 1 << i;
            int length = sDKRuntimeException2.cca_continue.length - 1;
            if (sDKRuntimeException2.cca_continue[length] == 0) {
                length = -1;
            }
            int[] iArr = new int[2];
            iArr[1] = i2;
            int i3 = 0;
            iArr[0] = length;
            int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
            int[] iArr3 = new int[2];
            iArr3[1] = i2;
            iArr3[0] = length;
            int[][] iArr4 = (int[][]) Array.newInstance(Integer.TYPE, iArr3);
            for (int i4 = 0; i4 < i2; i4++) {
                int[] iArr5 = iArr4[0];
                int i5 = sDKRuntimeException2.cca_continue[sDKRuntimeException2.init];
                for (int i6 = sDKRuntimeException2.init - 1; i6 >= 0; i6--) {
                    i5 = getInstance(i5, i4, sDKRuntimeException2.getInstance.getInstance) ^ sDKRuntimeException2.cca_continue[i6];
                }
                iArr5[i4] = directoryServerID2.getInstance(i5, (1 << directoryServerID2.Cardinal) - 2);
            }
            for (int i7 = 1; i7 < length; i7++) {
                for (int i8 = 0; i8 < i2; i8++) {
                    iArr4[i7][i8] = getInstance(iArr4[i7 - 1][i8], i8, directoryServerID2.getInstance);
                }
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = i3;
                while (i10 < i2) {
                    for (int i11 = i3; i11 <= i9; i11++) {
                        int[] iArr6 = iArr2[i9];
                        int i12 = (length + i11) - i9;
                        iArr6[i10] = getInstance(iArr4[i11][i10], (i12 < 0 || i12 > sDKRuntimeException2.init) ? 0 : sDKRuntimeException2.cca_continue[i12], directoryServerID2.getInstance) ^ iArr6[i10];
                    }
                    i10++;
                    i3 = 0;
                }
                i9++;
                i3 = 0;
            }
            int[] iArr7 = new int[2];
            iArr7[1] = (i2 + 31) >>> 5;
            iArr7[0] = length * i;
            int[][] iArr8 = (int[][]) Array.newInstance(Integer.TYPE, iArr7);
            for (int i13 = 0; i13 < i2; i13++) {
                int i14 = i13 >>> 5;
                int i15 = 1 << (i13 & 31);
                for (int i16 = 0; i16 < length; i16++) {
                    int i17 = iArr2[i16][i13];
                    for (int i18 = 0; i18 < i; i18++) {
                        if (((i17 >>> i18) & 1) != 0) {
                            int[] iArr9 = iArr8[(((i16 + 1) * i) - i18) - 1];
                            iArr9[i14] = iArr9[i14] ^ i15;
                        }
                    }
                }
            }
            return new getCause(i2, iArr8);
        }

        public static boolean init(int[] iArr, int[] iArr2) {
            if (iArr.length != iArr2.length) {
                return false;
            }
            boolean z = true;
            for (int length = iArr.length - 1; length >= 0; length--) {
                z &= iArr[length] == iArr2[length];
            }
            return z;
        }

        public static int cca_continue(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
            return ((bArr[i3 + 1] & 255) << Ascii.CAN) | b | ((bArr[i3] & 255) << Ascii.DLE);
        }

        public static void configure(int i, byte[] bArr, int i2) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i >>> 8);
            bArr[i4] = (byte) (i >>> 16);
            bArr[i4 + 1] = (byte) (i >>> 24);
        }

        public static int getInstance(int i, int i2, int i3) {
            int configure = configure(i, i3);
            int configure2 = configure(i2, i3);
            int i4 = 0;
            if (configure2 != 0) {
                int i5 = -1;
                for (int i6 = i3; i6 != 0; i6 >>>= 1) {
                    i5++;
                }
                int i7 = 1 << i5;
                while (configure != 0) {
                    if (((byte) (configure & 1)) == 1) {
                        i4 ^= configure2;
                    }
                    configure >>>= 1;
                    configure2 <<= 1;
                    if (configure2 >= i7) {
                        configure2 ^= i3;
                    }
                }
            }
            return i4;
        }

        private static int configure(int i, int i2) {
            if (i2 == 0) {
                System.err.println("Error: to be divided by 0");
                return 0;
            }
            while (true) {
                int i3 = -1;
                int i4 = -1;
                for (int i5 = i; i5 != 0; i5 >>>= 1) {
                    i4++;
                }
                int i6 = -1;
                for (int i7 = i2; i7 != 0; i7 >>>= 1) {
                    i6++;
                }
                if (i4 < i6) {
                    return i;
                }
                int i8 = -1;
                for (int i9 = i; i9 != 0; i9 >>>= 1) {
                    i8++;
                }
                for (int i10 = i2; i10 != 0; i10 >>>= 1) {
                    i3++;
                }
                i ^= i2 << (i8 - i3);
            }
        }

        public static boolean cca_continue(int i) {
            if (i == 0) {
                return false;
            }
            int i2 = -1;
            for (int i3 = i; i3 != 0; i3 >>>= 1) {
                i2++;
            }
            int i4 = i2 >>> 1;
            int i5 = 2;
            for (int i6 = 0; i6 < i4; i6++) {
                i5 = getInstance(i5, i5, i);
                int i7 = i5 ^ 2;
                int i8 = i;
                while (i8 != 0) {
                    int configure = configure(i7, i8);
                    i7 = i8;
                    i8 = configure;
                }
                if (i7 != 1) {
                    return false;
                }
            }
            return true;
        }
    }

    public abstract class MQVwithSHA224CKDF {
        public static JSONNavi cca_continue(toJSONString tojsonstring, byte[] bArr) {
            merge merge;
            merge init = tojsonstring.init(BigInteger.valueOf((long) (bArr[bArr.length - 1] & 1)));
            merge init2 = tojsonstring.init(new BigInteger(1, bArr));
            merge merge2 = init2;
            for (int i = 1; i < init2.Cardinal(); i++) {
                merge2 = merge2.getInstance().cca_continue(init2);
            }
            if (!merge2.equals(tojsonstring.getSDKVersion())) {
                init2 = init2.configure();
            }
            if (init2.onCReqSuccess()) {
                merge = tojsonstring.cleanup().getWarnings();
            } else {
                merge cca_continue = init2.getInstance().onValidated().init(tojsonstring.cleanup()).cca_continue(tojsonstring.getSDKVersion()).cca_continue(init2);
                if (!cca_continue.onCReqSuccess()) {
                    merge init3 = tojsonstring.init(writeJSONString.getSDKVersion);
                    Random random = new Random();
                    int Cardinal = cca_continue.Cardinal();
                    while (true) {
                        merge init4 = tojsonstring.init(new BigInteger(Cardinal, random));
                        merge merge3 = cca_continue;
                        merge merge4 = init3;
                        for (int i2 = 1; i2 <= Cardinal - 1; i2++) {
                            merge instance = merge3.getInstance();
                            merge4 = merge4.getInstance().cca_continue(instance.init(init4));
                            merge3 = instance.cca_continue(cca_continue);
                        }
                        if (merge3.onCReqSuccess()) {
                            if (!merge4.getInstance().cca_continue(merge4).onCReqSuccess()) {
                                cca_continue = merge4;
                                break;
                            }
                        } else {
                            cca_continue = null;
                            break;
                        }
                    }
                }
                if (cca_continue != null) {
                    merge merge5 = cca_continue;
                    for (int i3 = 1; i3 < cca_continue.Cardinal(); i3++) {
                        merge5 = merge5.getInstance().cca_continue(cca_continue);
                    }
                    if (!merge5.equals(init)) {
                        cca_continue = cca_continue.configure();
                    }
                    merge = init2.init(cca_continue);
                } else {
                    merge = null;
                }
            }
            if (merge != null) {
                JSONNavi configure = tojsonstring.configure(init2.cca_continue(), merge.cca_continue(), false);
                if (configure.init(false, true)) {
                    return configure;
                }
                throw new IllegalArgumentException("Invalid point coordinates");
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public static void getInstance(int[] iArr) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            int i5 = iArr[4];
            int i6 = iArr[5];
            int i7 = iArr[6];
            int i8 = iArr[7];
            int i9 = iArr[8];
            int i10 = iArr[9];
            int i11 = iArr[10];
            int i12 = iArr[11];
            int i13 = iArr[12];
            int i14 = iArr[13];
            int i15 = i3 + (i2 >>> 28);
            int i16 = i7 + (i6 >>> 28);
            int i17 = i11 + (i10 >>> 28);
            int i18 = iArr[14] + (i14 >>> 28);
            int i19 = i4 + (i15 >>> 28);
            int i20 = i8 + (i16 >>> 28);
            int i21 = i12 + (i17 >>> 28);
            int i22 = iArr[15] + (i18 >>> 28);
            int i23 = i22 >>> 28;
            int i24 = i + i23;
            int i25 = i5 + (i19 >>> 28);
            int i26 = i9 + i23 + (i20 >>> 28);
            int i27 = i13 + (i21 >>> 28);
            iArr[0] = i24 & 268435455;
            iArr[1] = (i2 & 268435455) + (i24 >>> 28);
            iArr[2] = i15 & 268435455;
            iArr[3] = i19 & 268435455;
            iArr[4] = i25 & 268435455;
            iArr[5] = (i6 & 268435455) + (i25 >>> 28);
            iArr[6] = i16 & 268435455;
            iArr[7] = i20 & 268435455;
            iArr[8] = i26 & 268435455;
            iArr[9] = (i10 & 268435455) + (i26 >>> 28);
            iArr[10] = i17 & 268435455;
            iArr[11] = i21 & 268435455;
            iArr[12] = i27 & 268435455;
            iArr[13] = (i14 & 268435455) + (i27 >>> 28);
            iArr[14] = i18 & 268435455;
            iArr[15] = i22 & 268435455;
        }

        public static void init(int i, int[] iArr, int[] iArr2) {
            int i2 = 0 - i;
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = iArr[i3];
                int i5 = iArr2[i3];
                int i6 = (i4 ^ i5) & i2;
                iArr[i3] = i4 ^ i6;
                iArr2[i3] = i5 ^ i6;
            }
        }

        public static void Cardinal(byte[] bArr, int i, int[] iArr) {
            Cardinal(bArr, 0, iArr, 0);
            Cardinal(bArr, 7, iArr, 2);
            Cardinal(bArr, 14, iArr, 4);
            Cardinal(bArr, 21, iArr, 6);
            Cardinal(bArr, 28, iArr, 8);
            Cardinal(bArr, 35, iArr, 10);
            Cardinal(bArr, 42, iArr, 12);
            Cardinal(bArr, 49, iArr, 14);
        }

        private static int init(byte[] bArr, int i) {
            int i2 = i + 1;
            return ((bArr[i2 + 1] & 255) << Ascii.DLE) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        }

        private static int cca_continue(byte[] bArr, int i) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            return (bArr[i3 + 1] << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << Ascii.DLE);
        }

        private static void Cardinal(byte[] bArr, int i, int[] iArr, int i2) {
            int cca_continue = cca_continue(bArr, i);
            int init = init(bArr, i + 4);
            iArr[i2] = 268435455 & cca_continue;
            iArr[i2 + 1] = (init << 4) | (cca_continue >>> 28);
        }

        public static void cca_continue(int[] iArr, byte[] bArr, int i) {
            Cardinal(iArr, 0, bArr, i);
            Cardinal(iArr, 2, bArr, i + 7);
            Cardinal(iArr, 4, bArr, i + 14);
            Cardinal(iArr, 6, bArr, i + 21);
            Cardinal(iArr, 8, bArr, i + 28);
            Cardinal(iArr, 10, bArr, i + 35);
            Cardinal(iArr, 12, bArr, i + 42);
            Cardinal(iArr, 14, bArr, i + 49);
        }

        private static void init(int i, byte[] bArr, int i2) {
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            bArr[i3] = (byte) (i >>> 8);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (i >>> 16);
            bArr[i4 + 1] = (byte) (i >>> 24);
        }

        private static void Cardinal(int[] iArr, int i, byte[] bArr, int i2) {
            int i3 = iArr[i];
            int i4 = iArr[i + 1];
            init((i4 << 28) | i3, bArr, i2);
            int i5 = i4 >>> 4;
            int i6 = i2 + 4;
            bArr[i6] = (byte) i5;
            int i7 = i6 + 1;
            bArr[i7] = (byte) (i5 >>> 8);
            bArr[i7 + 1] = (byte) (i5 >>> 16);
        }

        public static void init(int[] iArr, int[] iArr2) {
            int[] iArr3 = new int[16];
            Cardinal(iArr, iArr3);
            configure(iArr3, iArr3);
            int i = 2;
            while (true) {
                i--;
                if (i > 0) {
                    configure(iArr3, iArr3);
                } else {
                    Cardinal(iArr3, iArr, iArr2);
                    return;
                }
            }
        }

        public static void configure(int[] iArr, int i, int[] iArr2) {
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            int i6 = iArr[4];
            int i7 = iArr[5];
            int i8 = iArr[6];
            int i9 = iArr[7];
            int i10 = iArr[8];
            int i11 = iArr[9];
            int i12 = iArr[10];
            int i13 = iArr[11];
            int i14 = iArr[12];
            int i15 = iArr[13];
            int i16 = iArr[14];
            int i17 = i6;
            long j = (long) i3;
            long j2 = (long) i;
            long j3 = j * j2;
            int i18 = i2;
            int i19 = i14;
            long j4 = ((long) i7) * j2;
            int i20 = ((int) j3) & 268435455;
            long j5 = ((long) i11) * j2;
            int i21 = ((int) j4) & 268435455;
            long j6 = ((long) i15) * j2;
            int i22 = ((int) j5) & 268435455;
            long j7 = (j3 >>> 28) + (((long) i4) * j2);
            iArr2[2] = ((int) j7) & 268435455;
            long j8 = j7 >>> 28;
            long j9 = (j4 >>> 28) + (((long) i8) * j2);
            iArr2[6] = ((int) j9) & 268435455;
            long j10 = (j5 >>> 28) + (((long) i12) * j2);
            iArr2[10] = ((int) j10) & 268435455;
            long j11 = (j6 >>> 28) + (((long) i16) * j2);
            iArr2[14] = ((int) j11) & 268435455;
            long j12 = j8 + (((long) i5) * j2);
            iArr2[3] = ((int) j12) & 268435455;
            long j13 = (j9 >>> 28) + (((long) i9) * j2);
            iArr2[7] = ((int) j13) & 268435455;
            long j14 = (j10 >>> 28) + (((long) i13) * j2);
            iArr2[11] = ((int) j14) & 268435455;
            long j15 = (j11 >>> 28) + (((long) iArr[15]) * j2);
            iArr2[15] = ((int) j15) & 268435455;
            long j16 = j15 >>> 28;
            long j17 = (j12 >>> 28) + (((long) i17) * j2);
            iArr2[4] = ((int) j17) & 268435455;
            long j18 = (j13 >>> 28) + j16 + (((long) i10) * j2);
            iArr2[8] = ((int) j18) & 268435455;
            long j19 = (j14 >>> 28) + (((long) i19) * j2);
            iArr2[12] = ((int) j19) & 268435455;
            long j20 = j16 + (((long) i18) * j2);
            iArr2[0] = ((int) j20) & 268435455;
            iArr2[1] = i20 + ((int) (j20 >>> 28));
            iArr2[5] = i21 + ((int) (j17 >>> 28));
            iArr2[9] = i22 + ((int) (j18 >>> 28));
            iArr2[13] = (((int) j6) & 268435455) + ((int) (j19 >>> 28));
        }

        public static void Cardinal(int[] iArr, int[] iArr2, int[] iArr3) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            int i5 = iArr[4];
            int i6 = iArr[5];
            int i7 = iArr[6];
            int i8 = iArr[7];
            int i9 = iArr[8];
            int i10 = iArr[9];
            int i11 = iArr[10];
            int i12 = iArr[11];
            int i13 = iArr[12];
            int i14 = iArr[13];
            int i15 = iArr[14];
            int i16 = i8;
            int i17 = iArr[15];
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            int i20 = iArr2[2];
            int i21 = iArr2[3];
            int i22 = iArr2[4];
            int i23 = iArr2[5];
            int i24 = iArr2[6];
            int i25 = iArr2[7];
            int i26 = iArr2[8];
            int i27 = iArr2[9];
            int i28 = iArr2[10];
            int i29 = iArr2[11];
            int i30 = iArr2[12];
            int i31 = iArr2[13];
            int i32 = iArr2[14];
            int i33 = iArr2[15];
            int i34 = i + i9;
            int i35 = i2 + i10;
            int i36 = i3 + i11;
            int i37 = i4 + i12;
            int i38 = i5 + i13;
            int i39 = i6 + i14;
            int i40 = i7 + i15;
            int i41 = i16 + i17;
            int i42 = i19 + i27;
            int i43 = i21 + i29;
            int i44 = i23 + i31;
            int i45 = i25 + i33;
            long j = (long) i;
            int i46 = i9;
            long j2 = (long) i18;
            long j3 = j * j2;
            long j4 = j;
            long j5 = (long) i16;
            long j6 = j2;
            long j7 = (long) i19;
            long j8 = j5 * j7;
            long j9 = j5;
            long j10 = (long) i7;
            long j11 = j7;
            long j12 = (long) i20;
            long j13 = j8 + (j10 * j12);
            long j14 = j10;
            long j15 = (long) i6;
            long j16 = j12;
            long j17 = (long) i21;
            long j18 = j13 + (j15 * j17);
            long j19 = j15;
            long j20 = (long) i5;
            long j21 = j17;
            long j22 = (long) i22;
            long j23 = j18 + (j20 * j22);
            long j24 = j20;
            long j25 = (long) i4;
            long j26 = j22;
            long j27 = (long) i23;
            long j28 = j23 + (j25 * j27);
            long j29 = j25;
            long j30 = (long) i3;
            long j31 = j27;
            long j32 = (long) i24;
            long j33 = j28 + (j30 * j32);
            long j34 = j30;
            long j35 = (long) i2;
            long j36 = j32;
            long j37 = (long) i25;
            long j38 = j33 + (j35 * j37);
            long j39 = j37;
            long j40 = (long) i46;
            long j41 = j35;
            long j42 = (long) i26;
            long j43 = j40 * j42;
            long j44 = j40;
            long j45 = (long) i17;
            long j46 = j42;
            long j47 = (long) i27;
            long j48 = j45 * j47;
            long j49 = (long) i15;
            long j50 = j45;
            long j51 = (long) i28;
            long j52 = j48 + (j49 * j51);
            long j53 = (long) i14;
            long j54 = j49;
            long j55 = (long) i29;
            long j56 = (long) i13;
            long j57 = j53;
            long j58 = (long) i30;
            long j59 = j52 + (j53 * j55) + (j56 * j58);
            long j60 = (long) i12;
            long j61 = j56;
            long j62 = (long) i31;
            long j63 = (long) i11;
            long j64 = j60;
            long j65 = (long) i32;
            long j66 = j59 + (j60 * j62) + (j63 * j65);
            long j67 = j63;
            long j68 = (long) i10;
            long j69 = j65;
            long j70 = (long) i33;
            long j71 = j66 + (j68 * j70);
            long j72 = j70;
            long j73 = (long) i34;
            long j74 = j62;
            long j75 = (long) (i18 + i26);
            long j76 = j73 * j75;
            int i47 = i41;
            long j77 = j73;
            long j78 = (long) i47;
            long j79 = j75;
            long j80 = (long) i42;
            long j81 = j78 * j80;
            long j82 = j78;
            long j83 = (long) i40;
            long j84 = j80;
            long j85 = (long) (i20 + i28);
            long j86 = j81 + (j83 * j85);
            int i48 = i39;
            long j87 = j83;
            long j88 = (long) i48;
            long j89 = j85;
            long j90 = (long) i43;
            long j91 = j86 + (j88 * j90);
            long j92 = j88;
            long j93 = (long) i38;
            long j94 = j90;
            long j95 = (long) (i22 + i30);
            long j96 = j91 + (j93 * j95);
            int i49 = i37;
            long j97 = j93;
            long j98 = (long) i49;
            long j99 = j95;
            long j100 = (long) i44;
            long j101 = j96 + (j98 * j100);
            long j102 = j98;
            long j103 = (long) i36;
            long j104 = j100;
            long j105 = (long) (i24 + i32);
            long j106 = j103;
            long j107 = (long) i35;
            int i50 = i45;
            long j108 = j105;
            long j109 = (long) i50;
            long j110 = j101 + (j103 * j105) + (j107 * j109);
            long j111 = j109;
            long j112 = ((j3 + j43) + j110) - j38;
            long j113 = (j71 + j76) - j3;
            long j114 = j112 >>> 28;
            long j115 = j113 + j110;
            int i51 = ((int) j112) & 268435455;
            long j116 = (j41 * j6) + (j4 * j11);
            long j117 = j69;
            long j118 = (j107 * j79) + (j77 * j84);
            long j119 = (j82 * j89) + (j87 * j94) + (j92 * j99) + (j97 * j104) + (j102 * j108) + (j106 * j111);
            long j120 = ((j116 + ((j68 * j46) + (j44 * j47))) + j119) - ((((((j9 * j16) + (j14 * j21)) + (j19 * j26)) + (j24 * j31)) + (j29 * j36)) + (j34 * j39));
            long j121 = j107;
            long j122 = j114 + j120;
            int i52 = ((int) j115) & 268435455;
            long j123 = (j115 >>> 28) + ((((((((j50 * j51) + (j54 * j55)) + (j57 * j58)) + (j61 * j74)) + (j64 * j117)) + (j67 * j72)) + j118) - j116) + j119;
            int i53 = ((int) j122) & 268435455;
            long j124 = (j34 * j6) + (j41 * j11) + (j4 * j16);
            long j125 = (j82 * j94) + (j87 * j99) + (j92 * j104) + (j97 * j108) + (j102 * j111);
            long j126 = (j122 >>> 28) + (((j124 + (((j67 * j46) + (j68 * j47)) + (j44 * j51))) + j125) - (((((j9 * j21) + (j14 * j26)) + (j19 * j31)) + (j24 * j36)) + (j29 * j39)));
            int i54 = ((int) j123) & 268435455;
            long j127 = (j123 >>> 28) + (((((((j50 * j55) + (j54 * j58)) + (j57 * j74)) + (j61 * j117)) + (j64 * j72)) + (((j106 * j79) + (j121 * j84)) + (j77 * j89))) - j124) + j125;
            int i55 = ((int) j126) & 268435455;
            long j128 = (j29 * j6) + (j34 * j11) + (j41 * j16) + (j4 * j21);
            long j129 = (j82 * j99) + (j87 * j104) + (j92 * j108) + (j97 * j111);
            long j130 = (j126 >>> 28) + (((j128 + ((((j64 * j46) + (j67 * j47)) + (j68 * j51)) + (j44 * j55))) + j129) - ((((j9 * j26) + (j14 * j31)) + (j19 * j36)) + (j24 * j39)));
            int i56 = ((int) j127) & 268435455;
            long j131 = (j127 >>> 28) + ((((((j50 * j58) + (j54 * j74)) + (j57 * j117)) + (j61 * j72)) + ((((j102 * j79) + (j106 * j84)) + (j121 * j89)) + (j77 * j94))) - j128) + j129;
            int i57 = ((int) j130) & 268435455;
            long j132 = (j24 * j6) + (j29 * j11) + (j34 * j16) + (j41 * j21) + (j4 * j26);
            long j133 = (j82 * j104) + (j87 * j108) + (j92 * j111);
            long j134 = (j130 >>> 28) + (((j132 + (((((j61 * j46) + (j64 * j47)) + (j67 * j51)) + (j68 * j55)) + (j44 * j58))) + j133) - (((j9 * j31) + (j14 * j36)) + (j19 * j39)));
            int i58 = ((int) j131) & 268435455;
            long j135 = (j131 >>> 28) + (((((j50 * j74) + (j54 * j117)) + (j57 * j72)) + (((((j97 * j79) + (j102 * j84)) + (j106 * j89)) + (j121 * j94)) + (j77 * j99))) - j132) + j133;
            int i59 = ((int) j134) & 268435455;
            long j136 = (j19 * j6) + (j24 * j11) + (j29 * j16) + (j34 * j21) + (j41 * j26) + (j4 * j31);
            long j137 = (j82 * j108) + (j87 * j111);
            long j138 = (j134 >>> 28) + (((j136 + ((((((j57 * j46) + (j61 * j47)) + (j64 * j51)) + (j67 * j55)) + (j68 * j58)) + (j44 * j74))) + j137) - ((j9 * j36) + (j14 * j39)));
            int i60 = ((int) j135) & 268435455;
            long j139 = (j135 >>> 28) + ((((j50 * j117) + (j54 * j72)) + ((((((j92 * j79) + (j97 * j84)) + (j102 * j89)) + (j106 * j94)) + (j121 * j99)) + (j77 * j104))) - j136) + j137;
            int i61 = ((int) j138) & 268435455;
            long j140 = (j14 * j6) + (j19 * j11) + (j24 * j16) + (j29 * j21) + (j34 * j26) + (j41 * j31) + (j4 * j36);
            long j141 = j82 * j111;
            long j142 = (j138 >>> 28) + (((j140 + (((((((j54 * j46) + (j57 * j47)) + (j61 * j51)) + (j64 * j55)) + (j67 * j58)) + (j68 * j74)) + (j44 * j117))) + j141) - (j9 * j39));
            int i62 = ((int) j139) & 268435455;
            long j143 = (j139 >>> 28) + (((j50 * j72) + (((((((j87 * j79) + (j92 * j84)) + (j97 * j89)) + (j102 * j94)) + (j106 * j99)) + (j121 * j104)) + (j77 * j108))) - j140) + j141;
            int i63 = ((int) j142) & 268435455;
            long j144 = (j6 * j9) + (j11 * j14) + (j19 * j16) + (j24 * j21) + (j29 * j26) + (j34 * j31) + (j41 * j36) + (j4 * j39);
            long j145 = (j142 >>> 28) + j144 + (j50 * j46) + (j47 * j54) + (j57 * j51) + (j61 * j55) + (j64 * j58) + (j67 * j74) + (j68 * j117) + (j44 * j72);
            long j146 = (j143 >>> 28) + (((((((((j82 * j79) + (j87 * j84)) + (j92 * j89)) + (j97 * j94)) + (j102 * j99)) + (j106 * j104)) + (j121 * j108)) + (j77 * j111)) - j144);
            long j147 = j146 >>> 28;
            long j148 = (j145 >>> 28) + j147 + ((long) i52);
            long j149 = j147 + ((long) i51);
            iArr3[0] = ((int) j149) & 268435455;
            iArr3[1] = i53 + ((int) (j149 >>> 28));
            iArr3[2] = i55;
            iArr3[3] = i57;
            iArr3[4] = i59;
            iArr3[5] = i61;
            iArr3[6] = i63;
            iArr3[7] = ((int) j145) & 268435455;
            iArr3[8] = ((int) j148) & 268435455;
            iArr3[9] = i54 + ((int) (j148 >>> 28));
            iArr3[10] = i56;
            iArr3[11] = i58;
            iArr3[12] = i60;
            iArr3[13] = i62;
            iArr3[14] = ((int) j143) & 268435455;
            iArr3[15] = ((int) j146) & 268435455;
        }

        public static void Cardinal(int[] iArr, int[] iArr2) {
            int[] iArr3 = new int[16];
            configure(iArr, iArr3);
            Cardinal(iArr, iArr3, iArr3);
            int[] iArr4 = new int[16];
            configure(iArr3, iArr4);
            Cardinal(iArr, iArr4, iArr4);
            int[] iArr5 = new int[16];
            configure(iArr4, iArr5);
            int i = 3;
            int i2 = 3;
            while (true) {
                i2--;
                if (i2 <= 0) {
                    break;
                }
                configure(iArr5, iArr5);
            }
            Cardinal(iArr4, iArr5, iArr5);
            int[] iArr6 = new int[16];
            configure(iArr5, iArr6);
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                configure(iArr6, iArr6);
            }
            Cardinal(iArr4, iArr6, iArr6);
            int[] iArr7 = new int[16];
            configure(iArr6, iArr7);
            int i3 = 9;
            while (true) {
                i3--;
                if (i3 <= 0) {
                    break;
                }
                configure(iArr7, iArr7);
            }
            Cardinal(iArr6, iArr7, iArr7);
            int[] iArr8 = new int[16];
            configure(iArr7, iArr8);
            Cardinal(iArr, iArr8, iArr8);
            int[] iArr9 = new int[16];
            configure(iArr8, iArr9);
            int i4 = 18;
            while (true) {
                i4--;
                if (i4 <= 0) {
                    break;
                }
                configure(iArr9, iArr9);
            }
            Cardinal(iArr7, iArr9, iArr9);
            int[] iArr10 = new int[16];
            configure(iArr9, iArr10);
            int i5 = 37;
            int i6 = 37;
            while (true) {
                i6--;
                if (i6 <= 0) {
                    break;
                }
                configure(iArr10, iArr10);
            }
            Cardinal(iArr9, iArr10, iArr10);
            int[] iArr11 = new int[16];
            configure(iArr10, iArr11);
            while (true) {
                i5--;
                if (i5 <= 0) {
                    break;
                }
                configure(iArr11, iArr11);
            }
            Cardinal(iArr9, iArr11, iArr11);
            int[] iArr12 = new int[16];
            configure(iArr11, iArr12);
            int i7 = 111;
            while (true) {
                i7--;
                if (i7 <= 0) {
                    break;
                }
                configure(iArr12, iArr12);
            }
            Cardinal(iArr11, iArr12, iArr12);
            int[] iArr13 = new int[16];
            configure(iArr12, iArr13);
            Cardinal(iArr, iArr13, iArr13);
            int[] iArr14 = new int[16];
            configure(iArr13, iArr14);
            int i8 = 223;
            while (true) {
                i8--;
                if (i8 > 0) {
                    configure(iArr14, iArr14);
                } else {
                    Cardinal(iArr14, iArr12, iArr2);
                    return;
                }
            }
        }

        public static void cca_continue(int[] iArr, int i) {
            int i2 = iArr[15];
            int i3 = i2 & 268435455;
            int i4 = (i2 >> 28) + i;
            iArr[8] = iArr[8] + i4;
            for (int i5 = 0; i5 < 15; i5++) {
                int i6 = i4 + iArr[i5];
                iArr[i5] = i6 & 268435455;
                i4 = i6 >> 28;
            }
            iArr[15] = i3 + i4;
        }

        public static void configure(int[] iArr, int[] iArr2) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            int i5 = iArr[4];
            int i6 = iArr[5];
            int i7 = iArr[6];
            int i8 = iArr[7];
            int i9 = iArr[8];
            int i10 = iArr[9];
            int i11 = iArr[10];
            int i12 = iArr[11];
            int i13 = iArr[12];
            int i14 = iArr[13];
            int i15 = iArr[14];
            int i16 = iArr[15];
            int i17 = i << 1;
            int i18 = i2 << 1;
            int i19 = i3 << 1;
            int i20 = i4 << 1;
            int i21 = i5 << 1;
            int i22 = i6 << 1;
            int i23 = i7 << 1;
            int i24 = i9 << 1;
            int i25 = i10 << 1;
            int i26 = i11 << 1;
            int i27 = i12 << 1;
            int i28 = i13 << 1;
            int i29 = i14 << 1;
            int i30 = i15 << 1;
            int i31 = i + i9;
            int i32 = i9;
            int i33 = i2 + i10;
            int i34 = i10;
            int i35 = i3 + i11;
            int i36 = i11;
            int i37 = i4 + i12;
            int i38 = i12;
            int i39 = i5 + i13;
            int i40 = i4;
            int i41 = i6 + i14;
            int i42 = i3;
            int i43 = i7 + i15;
            int i44 = i2;
            int i45 = i31 << 1;
            int i46 = i33 << 1;
            int i47 = i33;
            int i48 = i35 << 1;
            int i49 = i35;
            int i50 = i37 << 1;
            int i51 = i37;
            int i52 = i39 << 1;
            int i53 = i41 << 1;
            int i54 = i41;
            int i55 = i39;
            long j = (long) i;
            long j2 = j * j;
            long j3 = (long) i8;
            int i56 = i18;
            int i57 = i48;
            long j4 = (long) i56;
            long j5 = j3 * j4;
            long j6 = j4;
            long j7 = (long) i7;
            long j8 = j3;
            long j9 = (long) i19;
            long j10 = (long) i6;
            long j11 = j7;
            long j12 = (long) i20;
            long j13 = j10;
            long j14 = (long) i5;
            long j15 = j5 + (j7 * j9) + (j10 * j12) + (j14 * j14);
            long j16 = j14;
            long j17 = (long) i32;
            long j18 = j12;
            long j19 = (long) i16;
            long j20 = j9;
            long j21 = (long) i25;
            long j22 = j19 * j21;
            int i58 = i43 << 1;
            long j23 = (long) i15;
            long j24 = j21;
            long j25 = (long) i26;
            long j26 = j22 + (j23 * j25);
            long j27 = j23;
            long j28 = (long) i14;
            long j29 = j25;
            long j30 = (long) i27;
            long j31 = j26 + (j28 * j30);
            long j32 = j28;
            long j33 = (long) i13;
            long j34 = j33;
            long j35 = (long) i31;
            long j36 = j30;
            long j37 = (long) (i8 + i16);
            long j38 = (long) i46;
            long j39 = j37 * j38;
            long j40 = (long) i43;
            long j41 = j38;
            long j42 = (long) i57;
            long j43 = j39 + (j40 * j42);
            long j44 = j40;
            long j45 = (long) i54;
            int i59 = i58;
            long j46 = (long) i50;
            int i60 = i55;
            long j47 = j45;
            long j48 = (long) i60;
            long j49 = j43 + (j45 * j46) + (j48 * j48);
            long j50 = ((j2 + (j17 * j17)) + j49) - j15;
            long j51 = (((j31 + (j33 * j33)) + (j35 * j35)) - j2) + j49;
            int i61 = ((int) j50) & 268435455;
            int i62 = ((int) j51) & 268435455;
            int i63 = i44;
            long j52 = j48;
            long j53 = (long) i63;
            long j54 = j51 >>> 28;
            long j55 = (long) i17;
            long j56 = j53 * j55;
            long j57 = j53;
            long j58 = (long) i21;
            long j59 = (j8 * j20) + (j11 * j18) + (j13 * j58);
            long j60 = j58;
            long j61 = (long) i34;
            long j62 = j55;
            long j63 = (long) i24;
            long j64 = j61 * j63;
            long j65 = (j19 * j29) + (j27 * j36);
            long j66 = j19;
            long j67 = (long) i28;
            long j68 = j65 + (j32 * j67);
            long j69 = j67;
            long j70 = (long) i47;
            int i64 = i45;
            long j71 = j61;
            long j72 = (long) i64;
            long j73 = (j37 * j42) + (j44 * j46);
            long j74 = j42;
            long j75 = (long) i52;
            long j76 = j73 + (j47 * j75);
            long j77 = (j50 >>> 28) + (((j56 + j64) + j76) - j59);
            int i65 = i59;
            long j78 = j54 + ((j68 + (j70 * j72)) - j56) + j76;
            long j79 = j78 >>> 28;
            int i66 = ((int) j77) & 268435455;
            long j80 = (long) i42;
            long j81 = (j80 * j62) + (j57 * j57);
            long j82 = j80;
            long j83 = (long) i36;
            long j84 = (j83 * j63) + (j71 * j71);
            long j85 = j83;
            long j86 = (long) i49;
            long j87 = (j86 * j72) + (j70 * j70);
            long j88 = (j37 * j46) + (j44 * j75) + (j47 * j47);
            long j89 = ((j81 + j84) + j88) - (((j8 * j18) + (j11 * j60)) + (j13 * j13));
            long j90 = (j77 >>> 28) + j89;
            long j91 = j79 + (((((j66 * j36) + (j27 * j69)) + (j32 * j32)) + j87) - j81) + j88;
            int i67 = ((int) j90) & 268435455;
            int i68 = ((int) j91) & 268435455;
            int i69 = i40;
            int i70 = ((int) j78) & 268435455;
            long j92 = (long) i69;
            long j93 = (j92 * j62) + (j82 * j6);
            long j94 = j92;
            long j95 = (long) i22;
            long j96 = (j8 * j60) + (j11 * j95);
            long j97 = j95;
            long j98 = (long) i38;
            long j99 = (j98 * j63) + (j85 * j24);
            long j100 = j66 * j69;
            long j101 = j98;
            long j102 = (long) i29;
            long j103 = j100 + (j27 * j102);
            long j104 = j102;
            long j105 = (long) i51;
            long j106 = j75 * j37;
            long j107 = j37;
            long j108 = (long) i53;
            long j109 = j106 + (j44 * j108);
            long j110 = (j90 >>> 28) + (((j93 + j99) + j109) - j96);
            long j111 = (j91 >>> 28) + ((j103 + ((j105 * j72) + (j86 * j41))) - j93) + j109;
            long j112 = (j16 * j62) + (j94 * j6) + (j82 * j82);
            long j113 = (j52 * j72) + (j105 * j41) + (j86 * j86);
            long j114 = (j107 * j108) + (j44 * j44);
            long j115 = (j110 >>> 28) + (((j112 + (((j34 * j63) + (j101 * j24)) + (j85 * j85))) + j114) - ((j8 * j97) + (j11 * j11)));
            int i71 = ((int) j111) & 268435455;
            long j116 = (j111 >>> 28) + ((((j66 * j104) + (j27 * j27)) + j113) - j112) + j114;
            long j117 = (j13 * j62) + (j16 * j6) + (j94 * j20);
            int i72 = i23;
            int i73 = ((int) j116) & 268435455;
            int i74 = ((int) j115) & 268435455;
            int i75 = i30;
            int i76 = ((int) j110) & 268435455;
            long j118 = (j47 * j72) + (j52 * j41) + (j105 * j74);
            long j119 = j105;
            long j120 = ((long) i65) * j107;
            long j121 = (j115 >>> 28) + (((j117 + (((j32 * j63) + (j34 * j24)) + (j101 * j29))) + j120) - (((long) i72) * j8));
            long j122 = (j116 >>> 28) + (((((long) i75) * j66) + j118) - j117) + j120;
            long j123 = (j11 * j62) + (j13 * j6) + (j16 * j20) + (j94 * j94);
            long j124 = (j44 * j72) + (j47 * j41) + (j52 * j74) + (j119 * j119);
            long j125 = j107 * j107;
            long j126 = (j121 >>> 28) + (((j123 + ((((j27 * j63) + (j32 * j24)) + (j34 * j29)) + (j101 * j101))) + j125) - (j8 * j8));
            long j127 = (j122 >>> 28) + (((j66 * j66) + j124) - j123) + j125;
            long j128 = (j8 * j62) + (j11 * j6) + (j13 * j20) + (j16 * j18);
            long j129 = (j126 >>> 28) + (j63 * j66) + (j27 * j24) + (j32 * j29) + (j34 * j36) + j128;
            long j130 = (j127 >>> 28) + (((((j72 * j107) + (j44 * j41)) + (j47 * j74)) + (j52 * j46)) - j128);
            long j131 = j130 >>> 28;
            long j132 = (j129 >>> 28) + j131 + ((long) i62);
            long j133 = j131 + ((long) i61);
            iArr2[0] = ((int) j133) & 268435455;
            iArr2[1] = i66 + ((int) (j133 >>> 28));
            iArr2[2] = i67;
            iArr2[3] = i76;
            iArr2[4] = i74;
            iArr2[5] = ((int) j121) & 268435455;
            iArr2[6] = ((int) j126) & 268435455;
            iArr2[7] = ((int) j129) & 268435455;
            iArr2[8] = ((int) j132) & 268435455;
            iArr2[9] = i70 + ((int) (j132 >>> 28));
            iArr2[10] = i68;
            iArr2[11] = i71;
            iArr2[12] = i73;
            iArr2[13] = ((int) j122) & 268435455;
            iArr2[14] = ((int) j127) & 268435455;
            iArr2[15] = ((int) j130) & 268435455;
        }

        public static void cca_continue(int[] iArr, int[] iArr2, int[] iArr3) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            int i5 = iArr[4];
            int i6 = iArr[5];
            int i7 = iArr[6];
            int i8 = iArr[7];
            int i9 = iArr[8];
            int i10 = iArr[9];
            int i11 = iArr[10];
            int i12 = iArr[11];
            int i13 = iArr[12];
            int i14 = iArr[13];
            int i15 = iArr[14];
            int i16 = iArr[15];
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            int i19 = iArr2[2];
            int i20 = iArr2[3];
            int i21 = iArr2[4];
            int i22 = iArr2[5];
            int i23 = iArr2[6];
            int i24 = iArr2[7];
            int i25 = iArr2[8];
            int i26 = iArr2[9];
            int i27 = iArr2[10];
            int i28 = iArr2[11];
            int i29 = iArr2[12];
            int i30 = iArr2[13];
            int i31 = (i2 + 536870910) - i18;
            int i32 = (i6 + 536870910) - i22;
            int i33 = (i10 + 536870910) - i26;
            int i34 = (i14 + 536870910) - i30;
            int i35 = ((i3 + 536870910) - i19) + (i31 >>> 28);
            int i36 = ((i7 + 536870910) - i23) + (i32 >>> 28);
            int i37 = ((i11 + 536870910) - i27) + (i33 >>> 28);
            int i38 = ((i15 + 536870910) - iArr2[14]) + (i34 >>> 28);
            int i39 = ((i4 + 536870910) - i20) + (i35 >>> 28);
            int i40 = ((i8 + 536870910) - i24) + (i36 >>> 28);
            int i41 = ((i12 + 536870910) - i28) + (i37 >>> 28);
            int i42 = ((i16 + 536870910) - iArr2[15]) + (i38 >>> 28);
            int i43 = i42 >>> 28;
            int i44 = ((i + 536870910) - i17) + i43;
            int i45 = ((i5 + 536870910) - i21) + (i39 >>> 28);
            int i46 = ((i9 + 536870908) - i25) + i43 + (i40 >>> 28);
            int i47 = ((i13 + 536870910) - i29) + (i41 >>> 28);
            iArr3[0] = i44 & 268435455;
            iArr3[1] = (i31 & 268435455) + (i44 >>> 28);
            iArr3[2] = i35 & 268435455;
            iArr3[3] = i39 & 268435455;
            iArr3[4] = i45 & 268435455;
            iArr3[5] = (i32 & 268435455) + (i45 >>> 28);
            iArr3[6] = i36 & 268435455;
            iArr3[7] = i40 & 268435455;
            iArr3[8] = i46 & 268435455;
            iArr3[9] = (i33 & 268435455) + (i46 >>> 28);
            iArr3[10] = i37 & 268435455;
            iArr3[11] = i41 & 268435455;
            iArr3[12] = i47 & 268435455;
            iArr3[13] = (i34 & 268435455) + (i47 >>> 28);
            iArr3[14] = i38 & 268435455;
            iArr3[15] = i42 & 268435455;
        }
    }

    public final class MQVwithSHA224KDF extends setRenderType {
        public ASN1ObjectIdentifier getInstance;
        public CardinalConfigurationParameters init;

        private MQVwithSHA224KDF(isEnableLogging isenablelogging) {
            this.getInstance = (ASN1ObjectIdentifier) isenablelogging.init(0);
            this.init = isenablelogging.init(1);
        }

        public static MQVwithSHA224KDF Cardinal(Object obj) {
            if (obj instanceof MQVwithSHA224KDF) {
                return (MQVwithSHA224KDF) obj;
            }
            if (obj != null) {
                return new MQVwithSHA224KDF(isEnableLogging.getInstance(obj));
            }
            throw new IllegalArgumentException("null value in getInstance()");
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            getBackgroundColor getbackgroundcolor = new getBackgroundColor();
            getbackgroundcolor.getInstance.addElement(this.getInstance);
            getbackgroundcolor.getInstance.addElement(this.init);
            return new getProcessorTransactionId(getbackgroundcolor);
        }
    }

    public final class MQVwithSHA256CKDF extends MQVwithSHA512CKDF {
        private static ASN1ObjectIdentifier Cardinal = new ASN1ObjectIdentifier("2.5.4.11").getInstance();
        private static ASN1ObjectIdentifier CardinalActionCode = new ASN1ObjectIdentifier("2.5.4.17").getInstance();
        private static ASN1ObjectIdentifier CardinalChallengeObserver = new ASN1ObjectIdentifier("2.5.4.15").getInstance();
        private static ASN1ObjectIdentifier CardinalConfigurationParameters = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3").getInstance();
        private static ASN1ObjectIdentifier CardinalEnvironment = new ASN1ObjectIdentifier("2.5.4.45").getInstance();
        private static ASN1ObjectIdentifier CardinalError = new ASN1ObjectIdentifier("2.5.4.44").getInstance();
        private static ASN1ObjectIdentifier CardinalRenderType = new ASN1ObjectIdentifier("2.5.4.43").getInstance();
        private static ASN1ObjectIdentifier CardinalUiType = new ASN1ObjectIdentifier("2.5.4.46").getInstance();
        private static ASN1ObjectIdentifier cca_continue = new ASN1ObjectIdentifier("2.5.4.10").getInstance();
        private static ASN1ObjectIdentifier cleanup = new ASN1ObjectIdentifier("2.5.4.8").getInstance();
        private static ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("2.5.4.6").getInstance();
        private static ASN1ObjectIdentifier getActionCode = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1").getInstance();
        private static ASN1ObjectIdentifier getChallengeTimeout = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5").getInstance();
        private static ASN1ObjectIdentifier getEnvironment = new ASN1ObjectIdentifier("2.5.4.16").getInstance();
        public static final MQVwithSHA256KDF getInstance = new MQVwithSHA256CKDF();
        private static ASN1ObjectIdentifier getProxyAddress = DSASigner.noneDSA.b_;
        private static ASN1ObjectIdentifier getRenderType = DHUwithSHA224CKDF.getUICustomization;
        private static ASN1ObjectIdentifier getRequestTimeout = new ASN1ObjectIdentifier("1.3.36.8.3.14").getInstance();
        private static ASN1ObjectIdentifier getSDKVersion = new ASN1ObjectIdentifier("2.5.4.9").getInstance();
        private static ASN1ObjectIdentifier getString = new ASN1ObjectIdentifier("2.5.4.65").getInstance();
        private static ASN1ObjectIdentifier getUICustomization = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        private static ASN1ObjectIdentifier getUiType = DSASigner.noneDSA.c_;
        private static ASN1ObjectIdentifier getWarnings = new ASN1ObjectIdentifier("2.5.4.7").getInstance();
        private static ASN1ObjectIdentifier init = new ASN1ObjectIdentifier("2.5.4.12").getInstance();
        private static final Hashtable isEnableDFSync;
        private static ASN1ObjectIdentifier onCReqSuccess = new ASN1ObjectIdentifier("2.5.4.5").getInstance();
        private static ASN1ObjectIdentifier onValidated = new ASN1ObjectIdentifier("2.5.4.3").getInstance();
        private static ASN1ObjectIdentifier setChallengeTimeout = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4").getInstance();
        private static final Hashtable setEnableDFSync;
        private static ASN1ObjectIdentifier setEnvironment = DHUwithSHA224CKDF.setRenderType;
        private static ASN1ObjectIdentifier setProxyAddress = DSASigner.noneDSA.a_;
        private static ASN1ObjectIdentifier setRenderType = setEnvironment;
        private static ASN1ObjectIdentifier setRequestTimeout = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2").getInstance();
        private static ASN1ObjectIdentifier setUICustomization = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        private static ASN1ObjectIdentifier setUiType = DHUwithSHA224CKDF.setUICustomization;
        private static ASN1ObjectIdentifier valueOf = new ASN1ObjectIdentifier("2.5.4.42").getInstance();
        private static ASN1ObjectIdentifier values = new ASN1ObjectIdentifier("2.5.4.4").getInstance();
        private Hashtable isEnableLogging = configure(isEnableDFSync);
        private Hashtable setThreeDSRequestorAppURL = configure(setEnableDFSync);

        static {
            new ASN1ObjectIdentifier("2.5.4.54").getInstance();
            Hashtable hashtable = new Hashtable();
            isEnableDFSync = hashtable;
            Hashtable hashtable2 = new Hashtable();
            setEnableDFSync = hashtable2;
            hashtable.put(configure, "C");
            hashtable.put(cca_continue, "O");
            hashtable.put(init, ExifInterface.GPS_DIRECTION_TRUE);
            hashtable.put(Cardinal, "OU");
            hashtable.put(onValidated, "CN");
            hashtable.put(getWarnings, "L");
            hashtable.put(cleanup, "ST");
            hashtable.put(onCReqSuccess, "SERIALNUMBER");
            hashtable.put(setEnvironment, ExifInterface.LONGITUDE_EAST);
            hashtable.put(getUICustomization, "DC");
            hashtable.put(setUICustomization, "UID");
            hashtable.put(getSDKVersion, "STREET");
            hashtable.put(values, "SURNAME");
            hashtable.put(valueOf, "GIVENNAME");
            hashtable.put(CardinalRenderType, "INITIALS");
            hashtable.put(CardinalError, "GENERATION");
            hashtable.put(setUiType, "unstructuredAddress");
            hashtable.put(getRenderType, "unstructuredName");
            hashtable.put(CardinalEnvironment, "UniqueIdentifier");
            hashtable.put(CardinalUiType, "DN");
            hashtable.put(getString, "Pseudonym");
            hashtable.put(getEnvironment, "PostalAddress");
            hashtable.put(getRequestTimeout, "NameAtBirth");
            hashtable.put(setChallengeTimeout, "CountryOfCitizenship");
            hashtable.put(getChallengeTimeout, "CountryOfResidence");
            hashtable.put(CardinalConfigurationParameters, "Gender");
            hashtable.put(setRequestTimeout, "PlaceOfBirth");
            hashtable.put(getActionCode, "DateOfBirth");
            hashtable.put(CardinalActionCode, "PostalCode");
            hashtable.put(CardinalChallengeObserver, "BusinessCategory");
            hashtable.put(setProxyAddress, "TelephoneNumber");
            hashtable.put(getProxyAddress, "Name");
            hashtable.put(getUiType, "organizationIdentifier");
            hashtable2.put("c", configure);
            hashtable2.put("o", cca_continue);
            hashtable2.put("t", init);
            hashtable2.put("ou", Cardinal);
            hashtable2.put("cn", onValidated);
            hashtable2.put("l", getWarnings);
            hashtable2.put(UserDataStore.STATE, cleanup);
            hashtable2.put("sn", onCReqSuccess);
            hashtable2.put("serialnumber", onCReqSuccess);
            hashtable2.put("street", getSDKVersion);
            hashtable2.put("emailaddress", setRenderType);
            hashtable2.put("dc", getUICustomization);
            hashtable2.put("e", setRenderType);
            hashtable2.put("uid", setUICustomization);
            hashtable2.put("surname", values);
            hashtable2.put("givenname", valueOf);
            hashtable2.put("initials", CardinalRenderType);
            hashtable2.put("generation", CardinalError);
            hashtable2.put("unstructuredaddress", setUiType);
            hashtable2.put("unstructuredname", getRenderType);
            hashtable2.put("uniqueidentifier", CardinalEnvironment);
            hashtable2.put("dn", CardinalUiType);
            hashtable2.put("pseudonym", getString);
            hashtable2.put("postaladdress", getEnvironment);
            hashtable2.put("nameofbirth", getRequestTimeout);
            hashtable2.put("countryofcitizenship", setChallengeTimeout);
            hashtable2.put("countryofresidence", getChallengeTimeout);
            hashtable2.put(HintConstants.AUTOFILL_HINT_GENDER, CardinalConfigurationParameters);
            hashtable2.put("placeofbirth", setRequestTimeout);
            hashtable2.put("dateofbirth", getActionCode);
            hashtable2.put("postalcode", CardinalActionCode);
            hashtable2.put("businesscategory", CardinalChallengeObserver);
            hashtable2.put("telephonenumber", setProxyAddress);
            hashtable2.put("name", getProxyAddress);
            hashtable2.put("organizationidentifier", getUiType);
        }

        protected MQVwithSHA256CKDF() {
        }

        public final String cca_continue(MQVwithSHA384KDF mQVwithSHA384KDF) {
            StringBuffer stringBuffer = new StringBuffer();
            int length = mQVwithSHA384KDF.cca_continue.length;
            MQVwithSHA1CKDF[] mQVwithSHA1CKDFArr = new MQVwithSHA1CKDF[length];
            System.arraycopy(mQVwithSHA384KDF.cca_continue, 0, mQVwithSHA1CKDFArr, 0, length);
            boolean z = true;
            for (int i = 0; i < length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(',');
                }
                MQVwithSHA384CKDF.configure(stringBuffer, mQVwithSHA1CKDFArr[i], this.isEnableLogging);
            }
            return stringBuffer.toString();
        }
    }

    public class MQVwithSHA256KDFAndSharedInfo implements IESCipher.ECIESwithDESedeCBC {
        private static long[] Cardinal = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        private byte[] cca_continue;
        protected boolean configure;
        private long[] getInstance;
        private int getSDKVersion;
        protected int init;
        private int onValidated;

        public MQVwithSHA256KDFAndSharedInfo() {
            this(288);
        }

        public MQVwithSHA256KDFAndSharedInfo(int i) {
            this.getInstance = new long[25];
            this.cca_continue = new byte[192];
            init(i);
        }

        private void cca_continue(byte[] bArr, int i, int i2) {
            int i3;
            int i4 = this.onValidated;
            if (i4 % 8 != 0) {
                throw new IllegalStateException("attempt to absorb with odd length queue");
            } else if (!this.configure) {
                int i5 = i4 >> 3;
                int i6 = this.getSDKVersion >> 3;
                int i7 = 0;
                while (i7 < i2) {
                    if (i5 != 0 || i7 > (i3 = i2 - i6)) {
                        int min = Math.min(i6 - i5, i2 - i7);
                        System.arraycopy(bArr, i + i7, this.cca_continue, i5, min);
                        i5 += min;
                        i7 += min;
                        if (i5 == i6) {
                            cca_continue(this.cca_continue, 0);
                            i5 = 0;
                        }
                    } else {
                        do {
                            cca_continue(bArr, i + i7);
                            i7 += i6;
                        } while (i7 <= i3);
                    }
                }
                this.onValidated = i5 << 3;
            } else {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
        }

        private void init(int i) {
            if (i == 128 || i == 224 || i == 256 || i == 288 || i == 384 || i == 512) {
                configure(1600 - (i << 1));
                return;
            }
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }

        private void onCReqSuccess() {
            long[] jArr = this.getInstance;
            int i = 0;
            long j = jArr[0];
            boolean z = true;
            long j2 = jArr[1];
            long j3 = jArr[2];
            char c = 3;
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            long j17 = jArr[16];
            long j18 = jArr[17];
            long j19 = jArr[18];
            long j20 = jArr[19];
            long j21 = jArr[20];
            long j22 = jArr[21];
            long j23 = jArr[22];
            long j24 = jArr[23];
            int i2 = 24;
            long j25 = jArr[24];
            while (i < i2) {
                long j26 = (((j ^ j6) ^ j11) ^ j16) ^ j21;
                long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
                long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
                long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
                long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
                long j31 = ((j27 << (z ? 1 : 0)) | (j27 >>> -1)) ^ j30;
                long j32 = ((j28 << z) | (j28 >>> -1)) ^ j26;
                long j33 = ((j29 << z) | (j29 >>> -1)) ^ j27;
                long j34 = ((j30 << z) | (j30 >>> -1)) ^ j28;
                long j35 = ((j26 << z) | (j26 >>> -1)) ^ j29;
                long j36 = j ^ j31;
                long j37 = j6 ^ j31;
                long j38 = j11 ^ j31;
                long j39 = j16 ^ j31;
                long j40 = j21 ^ j31;
                long j41 = j2 ^ j32;
                long j42 = j7 ^ j32;
                long j43 = j12 ^ j32;
                long j44 = j17 ^ j32;
                long j45 = j22 ^ j32;
                long j46 = j8 ^ j33;
                long j47 = j13 ^ j33;
                long j48 = j18 ^ j33;
                long j49 = j23 ^ j33;
                long j50 = j9 ^ j34;
                long j51 = j14 ^ j34;
                long j52 = j19 ^ j34;
                long j53 = j24 ^ j34;
                long j54 = j10 ^ j35;
                long j55 = j15 ^ j35;
                long j56 = j20 ^ j35;
                long j57 = j25 ^ j35;
                long j58 = (j41 << z) | (j41 >>> 63);
                long j59 = (j42 << 44) | (j42 >>> 20);
                long j60 = j5 ^ j35;
                long j61 = (j54 << 20) | (j54 >>> 44);
                long j62 = j49 << 61;
                long j63 = j49 >>> c;
                long j64 = j4 ^ j34;
                long j65 = j62 | j63;
                long j66 = j3 ^ j33;
                long j67 = (j55 << 39) | (j55 >>> 25);
                long j68 = (j47 << 43) | (j47 >>> 21);
                long j69 = (j66 << 62) | (j66 >>> 2);
                long j70 = (j51 << 25) | (j51 >>> 39);
                long j71 = (j40 << 18) | (j40 >>> 46);
                long j72 = (j56 << 8) | (j56 >>> 56);
                long j73 = j39 << 41;
                long j74 = j39 >>> 23;
                long j75 = (j53 << 56) | (j53 >>> 8);
                long j76 = j73 | j74;
                long j77 = (j60 << 27) | (j60 >>> 37);
                long j78 = (j57 << 14) | (j57 >>> 50);
                long j79 = j45 << 2;
                long j80 = j45 >>> 62;
                long j81 = j70;
                long j82 = j79 | j80;
                long j83 = (j50 << 55) | (j50 >>> 9);
                long j84 = j44 << 45;
                long j85 = j44 >>> 19;
                long j86 = j83;
                long j87 = j84 | j85;
                long j88 = j65;
                long j89 = (j37 << 36) | (j37 >>> 28);
                long j90 = j64 << 28;
                long j91 = j64 >>> 36;
                long j92 = j89;
                long j93 = j90 | j91;
                long j94 = j52 << 21;
                long j95 = j52 >>> 43;
                long j96 = j87;
                long j97 = j94 | j95;
                long j98 = j48 << 15;
                long j99 = j48 >>> 49;
                long j100 = j93;
                long j101 = j98 | j99;
                long j102 = j43 << 10;
                long j103 = j43 >>> 54;
                long j104 = j101;
                long j105 = j102 | j103;
                long j106 = j46 << 6;
                long j107 = j46 >>> 58;
                long j108 = j105;
                long j109 = j106 | j107;
                long j110 = j38 << 3;
                long j111 = j38 >>> 61;
                long j112 = j110 | j111;
                long j113 = ((~j59) & j68) ^ j36;
                long j114 = ((~j68) & j97) ^ j59;
                j3 = j68 ^ ((~j97) & j78);
                j4 = j97 ^ ((~j78) & j36);
                long j115 = j78 ^ ((~j36) & j59);
                long j116 = j112;
                long j117 = ((~j116) & j96) ^ j61;
                long j118 = j115;
                long j119 = j96;
                long j120 = j100 ^ ((~j61) & j112);
                long j121 = ((~j119) & j88) ^ j116;
                long j122 = j88;
                long j123 = j121;
                long j124 = j119 ^ ((~j122) & j100);
                long j125 = ((~j100) & j61) ^ j122;
                long j126 = j109;
                j11 = j58 ^ ((~j126) & j81);
                long j127 = j124;
                long j128 = j81;
                long j129 = ((~j128) & j72) ^ j126;
                long j130 = j72;
                long j131 = j125;
                long j132 = ((~j130) & j71) ^ j128;
                long j133 = j71;
                long j134 = j132;
                long j135 = j130 ^ ((~j133) & j58);
                long j136 = ((~j58) & j126) ^ j133;
                long j137 = j92;
                long j138 = j77 ^ ((~j137) & j108);
                long j139 = j135;
                long j140 = j108;
                long j141 = j136;
                long j142 = ((~j140) & j104) ^ j137;
                long j143 = j104;
                long j144 = j117;
                long j145 = j75;
                long j146 = j140 ^ ((~j143) & j75);
                long j147 = ((~j145) & j77) ^ j143;
                long j148 = ((~j77) & j137) ^ j145;
                long j149 = j86;
                long j150 = j147;
                long j151 = j67;
                long j152 = j148;
                long j153 = ((~j151) & j76) ^ j149;
                long j154 = j76;
                j21 = j69 ^ ((~j149) & j67);
                long j155 = j82;
                long j156 = j151 ^ ((~j154) & j82);
                long j157 = ((~j155) & j69) ^ j154;
                long j158 = j113 ^ Cardinal[i];
                i++;
                j7 = j144;
                j13 = j134;
                j12 = j129;
                j14 = j139;
                j22 = j153;
                c = 3;
                j24 = j157;
                j23 = j156;
                j10 = j131;
                jArr = jArr;
                j20 = j152;
                j15 = j141;
                j8 = j123;
                j9 = j127;
                j18 = j146;
                j16 = j138;
                j5 = j118;
                j6 = j120;
                i2 = 24;
                j19 = j150;
                j17 = j142;
                long j159 = j158;
                z = true;
                j2 = j114;
                j25 = ((~j69) & j149) ^ j155;
                j = j159;
            }
            long[] jArr2 = jArr;
            jArr2[0] = j;
            jArr2[1] = j2;
            jArr2[2] = j3;
            jArr2[3] = j4;
            jArr2[4] = j5;
            jArr2[5] = j6;
            jArr2[6] = j7;
            jArr2[7] = j8;
            jArr2[8] = j9;
            jArr2[9] = j10;
            jArr2[10] = j11;
            jArr2[11] = j12;
            jArr2[12] = j13;
            jArr2[13] = j14;
            jArr2[14] = j15;
            jArr2[15] = j16;
            jArr2[16] = j17;
            jArr2[17] = j18;
            jArr2[18] = j19;
            jArr2[19] = j20;
            jArr2[20] = j21;
            jArr2[21] = j22;
            jArr2[22] = j23;
            jArr2[23] = j24;
            jArr2[24] = j25;
        }

        public final int cca_continue() {
            return this.getSDKVersion / 8;
        }

        public final void cca_continue(byte b) {
            cca_continue(new byte[]{b}, 0, 1);
        }

        public String configure() {
            return new StringBuilder("Keccak-").append(this.init).toString();
        }

        public final int getInstance() {
            return this.init / 8;
        }

        /* access modifiers changed from: protected */
        public final void getInstance(int i, int i2) {
            if (i2 <= 0 || i2 > 7) {
                throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
            }
            int i3 = this.onValidated;
            if (i3 % 8 != 0) {
                throw new IllegalStateException("attempt to absorb with odd length queue");
            } else if (!this.configure) {
                this.cca_continue[i3 >> 3] = (byte) (i & ((1 << i2) - 1));
                this.onValidated = i3 + i2;
            } else {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
        }

        public final void init() {
            init(this.init);
        }

        public final void init(byte[] bArr, int i, int i2) {
            cca_continue(bArr, i, i2);
        }

        public int init(byte[] bArr, int i) {
            Cardinal(bArr, i, (long) this.init);
            init(this.init);
            return this.init / 8;
        }

        private void configure(int i) {
            if (i <= 0 || i >= 1600 || i % 64 != 0) {
                throw new IllegalStateException("invalid rate value");
            }
            this.getSDKVersion = i;
            int i2 = 0;
            while (true) {
                long[] jArr = this.getInstance;
                if (i2 >= jArr.length) {
                    break;
                }
                jArr[i2] = 0;
                i2++;
            }
            byte[] bArr = this.cca_continue;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                bArr[i3] = 0;
            }
            this.onValidated = 0;
            this.configure = false;
            this.init = (1600 - i) / 2;
        }

        private void Cardinal() {
            byte[] bArr = this.cca_continue;
            int i = this.onValidated;
            int i2 = i >> 3;
            bArr[i2] = (byte) (bArr[i2] | ((byte) ((int) (1 << (i & 7)))));
            int i3 = i + 1;
            this.onValidated = i3;
            if (i3 == this.getSDKVersion) {
                cca_continue(bArr, 0);
                this.onValidated = 0;
            }
            int i4 = this.onValidated;
            int i5 = i4 >> 6;
            int i6 = i4 & 63;
            int i7 = 0;
            int i8 = 0;
            while (i7 < i5) {
                long[] jArr = this.getInstance;
                long j = jArr[i7];
                byte[] bArr2 = this.cca_continue;
                int cca_continue2 = setTextFontSize.cca_continue(bArr2, i8);
                jArr[i7] = ((((long) cca_continue2) & 4294967295L) | ((((long) setTextFontSize.cca_continue(bArr2, i8 + 4)) & 4294967295L) << 32)) ^ j;
                i8 += 8;
                i7++;
                i5 = i5;
            }
            int i9 = i5;
            if (i6 > 0) {
                long[] jArr2 = this.getInstance;
                long j2 = jArr2[i9];
                byte[] bArr3 = this.cca_continue;
                jArr2[i9] = j2 ^ (((1 << i6) - 1) & ((((long) setTextFontSize.cca_continue(bArr3, i8)) & 4294967295L) | ((((long) setTextFontSize.cca_continue(bArr3, i8 + 4)) & 4294967295L) << 32)));
            }
            long[] jArr3 = this.getInstance;
            int i10 = (this.getSDKVersion - 1) >> 6;
            jArr3[i10] = jArr3[i10] ^ Long.MIN_VALUE;
            onCReqSuccess();
            long[] jArr4 = this.getInstance;
            int i11 = this.getSDKVersion >> 6;
            byte[] bArr4 = this.cca_continue;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                long j3 = jArr4[i13];
                setTextFontSize.getInstance((int) j3, bArr4, i12);
                setTextFontSize.getInstance((int) (j3 >>> 32), bArr4, i12 + 4);
                i12 += 8;
            }
            this.onValidated = this.getSDKVersion;
            this.configure = true;
        }

        /* access modifiers changed from: protected */
        public final void Cardinal(byte[] bArr, int i, long j) {
            if (!this.configure) {
                Cardinal();
            }
            long j2 = 0;
            if (j % 8 == 0) {
                while (j2 < j) {
                    if (this.onValidated == 0) {
                        onCReqSuccess();
                        long[] jArr = this.getInstance;
                        int i2 = this.getSDKVersion >> 6;
                        byte[] bArr2 = this.cca_continue;
                        int i3 = 0;
                        for (int i4 = 0; i4 < i2; i4++) {
                            long j3 = jArr[i4];
                            setTextFontSize.getInstance((int) j3, bArr2, i3);
                            setTextFontSize.getInstance((int) (j3 >>> 32), bArr2, i3 + 4);
                            i3 += 8;
                        }
                        this.onValidated = this.getSDKVersion;
                    }
                    int min = (int) Math.min((long) this.onValidated, j - j2);
                    byte[] bArr3 = bArr;
                    System.arraycopy(this.cca_continue, (this.getSDKVersion - this.onValidated) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
                    this.onValidated -= min;
                    j2 += (long) min;
                }
                return;
            }
            throw new IllegalStateException("outputLength not a multiple of 8");
        }

        private void cca_continue(byte[] bArr, int i) {
            int i2 = this.getSDKVersion >> 6;
            for (int i3 = 0; i3 < i2; i3++) {
                long[] jArr = this.getInstance;
                jArr[i3] = jArr[i3] ^ (((((long) setTextFontSize.cca_continue(bArr, i + 4)) & 4294967295L) << 32) | (4294967295L & ((long) setTextFontSize.cca_continue(bArr, i))));
                i += 8;
            }
            onCReqSuccess();
        }
    }

    public final class MQVwithSHA384CKDF implements Enumeration {
        private getProxyAddress Cardinal;
        private Object configure;

        public MQVwithSHA384CKDF() {
        }

        private static getThreeDSRequestorAppURL cca_continue(String str) {
            try {
                return getThreeDSRequestorAppURL.Cardinal(getHeadingTextFontName.init(str.substring(1)));
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e)));
            }
        }

        public static String init(CardinalConfigurationParameters cardinalConfigurationParameters) {
            int i;
            StringBuffer stringBuffer = new StringBuffer();
            int i2 = 0;
            if (!(cardinalConfigurationParameters instanceof isLocationDataConsentGiven) || (cardinalConfigurationParameters instanceof CardinalValidateReceiver)) {
                try {
                    stringBuffer.append('#');
                    stringBuffer.append(getHeadingTextFontName.configure(cardinalConfigurationParameters.onCReqSuccess().configure("DER")));
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Other value has no encoded form");
                }
            } else {
                String cca_continue = ((isLocationDataConsentGiven) cardinalConfigurationParameters).cca_continue();
                if (cca_continue.length() > 0 && cca_continue.charAt(0) == '#') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(cca_continue);
            }
            int length = stringBuffer.length();
            int i3 = 2;
            if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
                i3 = 0;
            }
            while (i != length) {
                char charAt = stringBuffer.charAt(i);
                if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                    switch (charAt) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            i++;
                            continue;
                    }
                }
                stringBuffer.insert(i, "\\");
                i += 2;
                length++;
            }
            if (stringBuffer.length() > 0) {
                while (stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' ') {
                    stringBuffer.insert(i2, "\\");
                    i2 += 2;
                }
            }
            int length2 = stringBuffer.length() - 1;
            while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
                length2--;
            }
            return stringBuffer.toString();
        }

        public static void configure(StringBuffer stringBuffer, MQVwithSHA1CKDF mQVwithSHA1CKDF, Hashtable hashtable) {
            boolean z = true;
            if (mQVwithSHA1CKDF.init.cca_continue.size() > 1) {
                MQVwithSHA224KDF[] Cardinal2 = mQVwithSHA1CKDF.Cardinal();
                for (int i = 0; i != Cardinal2.length; i++) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuffer.append(SignatureVisitor.EXTENDS);
                    }
                    cca_continue(stringBuffer, Cardinal2[i], hashtable);
                }
            } else if (mQVwithSHA1CKDF.getInstance() != null) {
                cca_continue(stringBuffer, mQVwithSHA1CKDF.getInstance(), hashtable);
            }
        }

        private static void cca_continue(StringBuffer stringBuffer, MQVwithSHA224KDF mQVwithSHA224KDF, Hashtable hashtable) {
            String str = (String) hashtable.get(mQVwithSHA224KDF.getInstance);
            if (str != null) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(mQVwithSHA224KDF.getInstance.init);
            }
            stringBuffer.append(SignatureVisitor.INSTANCEOF);
            stringBuffer.append(init(mQVwithSHA224KDF.init));
        }

        public static String configure(String str) {
            String Cardinal2 = getTextFontSize.Cardinal(str);
            if (Cardinal2.length() > 0 && Cardinal2.charAt(0) == '#') {
                getThreeDSRequestorAppURL cca_continue = cca_continue(Cardinal2);
                if (cca_continue instanceof isLocationDataConsentGiven) {
                    Cardinal2 = getTextFontSize.Cardinal(((isLocationDataConsentGiven) cca_continue).cca_continue());
                }
            }
            if (Cardinal2.length() > 1) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i2 < Cardinal2.length() && Cardinal2.charAt(i) == '\\' && Cardinal2.charAt(i2) == ' ') {
                        i += 2;
                    } else {
                        int length = Cardinal2.length() - 1;
                    }
                }
                int length2 = Cardinal2.length() - 1;
                while (true) {
                    int i3 = length2 - 1;
                    if (i3 > 0 && Cardinal2.charAt(i3) == '\\' && Cardinal2.charAt(length2) == ' ') {
                        length2 -= 2;
                    } else if (i > 0 || length2 < Cardinal2.length() - 1) {
                        Cardinal2 = Cardinal2.substring(i, length2 + 1);
                    }
                }
                Cardinal2 = Cardinal2.substring(i, length2 + 1);
            }
            if (Cardinal2.indexOf("  ") < 0) {
                return Cardinal2;
            }
            StringBuffer stringBuffer = new StringBuffer();
            char charAt = Cardinal2.charAt(0);
            stringBuffer.append(charAt);
            for (int i4 = 1; i4 < Cardinal2.length(); i4++) {
                char charAt2 = Cardinal2.charAt(i4);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                    charAt = charAt2;
                }
            }
            return stringBuffer.toString();
        }

        public static boolean Cardinal(MQVwithSHA1CKDF mQVwithSHA1CKDF, MQVwithSHA1CKDF mQVwithSHA1CKDF2) {
            boolean z = mQVwithSHA1CKDF.init.cca_continue.size() > 1;
            if ((mQVwithSHA1CKDF2.init.cca_continue.size() > 1) != z) {
                return false;
            }
            if (!z) {
                return init(mQVwithSHA1CKDF.getInstance(), mQVwithSHA1CKDF2.getInstance());
            }
            if (mQVwithSHA1CKDF.init.cca_continue.size() != mQVwithSHA1CKDF2.init.cca_continue.size()) {
                return false;
            }
            MQVwithSHA224KDF[] Cardinal2 = mQVwithSHA1CKDF.Cardinal();
            MQVwithSHA224KDF[] Cardinal3 = mQVwithSHA1CKDF2.Cardinal();
            if (Cardinal2.length != Cardinal3.length) {
                return false;
            }
            for (int i = 0; i != Cardinal2.length; i++) {
                if (!init(Cardinal2[i], Cardinal3[i])) {
                    return false;
                }
            }
            return true;
        }

        private static boolean init(MQVwithSHA224KDF mQVwithSHA224KDF, MQVwithSHA224KDF mQVwithSHA224KDF2) {
            if (mQVwithSHA224KDF == mQVwithSHA224KDF2) {
                return true;
            }
            return mQVwithSHA224KDF != null && mQVwithSHA224KDF2 != null && mQVwithSHA224KDF.getInstance.equals(mQVwithSHA224KDF2.getInstance) && configure(init(mQVwithSHA224KDF.init)).equals(configure(init(mQVwithSHA224KDF2.init)));
        }

        public MQVwithSHA384CKDF(byte[] bArr) {
            this.Cardinal = new getProxyAddress(bArr, (byte) 0);
            this.configure = getInstance();
        }

        public final boolean hasMoreElements() {
            return this.configure != null;
        }

        public final Object nextElement() {
            Object obj = this.configure;
            this.configure = getInstance();
            return obj;
        }

        private Object getInstance() {
            try {
                return this.Cardinal.configure();
            } catch (IOException e) {
                throw new isEnableDFSync("malformed DER construction: ".concat(String.valueOf(e)), e);
            }
        }
    }

    public final class MQVwithSHA384KDF extends setRenderType implements getChallengeTimeout {
        private static MQVwithSHA256KDF configure = MQVwithSHA256CKDF.getInstance;
        private int Cardinal;
        public MQVwithSHA1CKDF[] cca_continue;
        private MQVwithSHA256KDF getInstance;
        private boolean init;

        private MQVwithSHA384KDF(MQVwithSHA256KDF mQVwithSHA256KDF, MQVwithSHA384KDF mQVwithSHA384KDF) {
            this.cca_continue = mQVwithSHA384KDF.cca_continue;
            this.getInstance = mQVwithSHA256KDF;
        }

        private MQVwithSHA384KDF(isEnableLogging isenablelogging) {
            this(configure, isenablelogging);
        }

        public static MQVwithSHA384KDF Cardinal(MQVwithSHA256KDF mQVwithSHA256KDF, Object obj) {
            if (obj instanceof MQVwithSHA384KDF) {
                return new MQVwithSHA384KDF(mQVwithSHA256KDF, (MQVwithSHA384KDF) obj);
            }
            if (obj != null) {
                return new MQVwithSHA384KDF(mQVwithSHA256KDF, isEnableLogging.getInstance(obj));
            }
            return null;
        }

        public static MQVwithSHA384KDF init(Object obj) {
            if (obj instanceof MQVwithSHA384KDF) {
                return (MQVwithSHA384KDF) obj;
            }
            if (obj != null) {
                return new MQVwithSHA384KDF(isEnableLogging.getInstance(obj));
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MQVwithSHA384KDF) && !(obj instanceof isEnableLogging)) {
                return false;
            }
            if (onCReqSuccess().equals(((CardinalConfigurationParameters) obj).onCReqSuccess())) {
                return true;
            }
            try {
                return this.getInstance.Cardinal(this, new MQVwithSHA384KDF(isEnableLogging.getInstance((Object) ((CardinalConfigurationParameters) obj).onCReqSuccess())));
            } catch (Exception unused) {
                return false;
            }
        }

        public final int hashCode() {
            if (this.init) {
                return this.Cardinal;
            }
            this.init = true;
            int init2 = this.getInstance.init(this);
            this.Cardinal = init2;
            return init2;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return new getProcessorTransactionId((CardinalConfigurationParameters[]) this.cca_continue);
        }

        public final String toString() {
            return this.getInstance.cca_continue(this);
        }

        public static MQVwithSHA384KDF Cardinal(setEnableLogging setenablelogging) {
            isEnableLogging configure2 = isEnableLogging.configure(setenablelogging, true);
            if (configure2 != null) {
                return new MQVwithSHA384KDF(isEnableLogging.getInstance((Object) configure2));
            }
            return null;
        }

        private MQVwithSHA384KDF(MQVwithSHA256KDF mQVwithSHA256KDF, isEnableLogging isenablelogging) {
            this.getInstance = mQVwithSHA256KDF;
            this.cca_continue = new MQVwithSHA1CKDF[isenablelogging.cca_continue()];
            Enumeration init2 = isenablelogging.init();
            int i = 0;
            while (init2.hasMoreElements()) {
                MQVwithSHA1CKDF[] mQVwithSHA1CKDFArr = this.cca_continue;
                int i2 = i + 1;
                Object nextElement = init2.nextElement();
                mQVwithSHA1CKDFArr[i] = nextElement instanceof MQVwithSHA1CKDF ? (MQVwithSHA1CKDF) nextElement : nextElement != null ? new MQVwithSHA1CKDF(setEnableDFSync.cca_continue(nextElement)) : null;
                i = i2;
            }
        }
    }

    public abstract class MQVwithSHA384KDFAndSharedInfo implements IESCipher.ECIESwithDESedeCBC, setBackgroundColor {
        private static final long[][] CardinalRenderType = {new long[]{-1803552715625652272L, 2703135593145367062L, -4014430758819158872L, 6577092334268629354L, 806964168861892974L, -6063472769050256282L, -713936367173212554L, -730696462206134965L, 5215999108449717233L, -46053480858810939L, -3782322580877781099L, 7409386412115095689L, 3849627103271945136L, 8988319201874450849L, 3938119337751376013L, -7010230157848027178L, -8423426398366749129L, -7147294794814685941L, -4896405975937806502L, -1930949658557223699L, -3548053845353340974L, -1407348811753517218L, -5094482946371975395L, -8349570678062906195L, 8519831221648263471L, 6380786457702773335L, 4606327678483665726L, 1135139788101916873L, -1296744055254569597L, 1220450159802546598L, 6759235690777098768L, 5340123591806085420L, 6034809048673841977L, -5407401691594998519L, 6896344311240562893L, -1690488634981198087L, 9184934662348565148L, -4183792988264456516L, -6457042926775703950L, 3364644269219363704L, 989048157634869780L, -9056160079784030844L, 3387584785362250392L, 6665082552186727408L, 8806730920978768603L, -8943992543361557404L, -3499218176542634446L, -8832779848047991010L, -5384180315986760471L, -5116578973163071747L, 2007762480278943944L, 7071029175581714734L, -245446995445778696L, -7098459127742649109L, 5517131305049330262L, 2524355749569298796L, 3276936053954857029L, -833575805165058901L, -4774104785891107142L, 4227838725751020409L, -1108816769305830132L, 2880731531503622347L, -8547577275558851350L, 1904883134495025448L, -8015005427386181889L, 4850405589464713887L, -602049820529576042L, 2081972218582700626L, 1379356218675464859L, -6509842815274707633L, 3166351970529817407L, -2925410023548009017L, -6354163580723349614L, -2675396450584002605L, -8745932894798146525L, 4095269026725968292L, 7284836791436182452L, 178206167350026973L, -8587687698711814902L, -7849942517349325374L, 5686309239594266763L, 3626867272058218794L, 4695292606739097666L, -5584978786571663757L, 7805587275216445447L, 6553870956925915274L, 2247080073069027695L, -4360880972299377210L, 4136504802722867268L, 2992705483290644962L, 4655464135170259362L, -1641371007467190503L, 867873424238963700L, 6139766898342725699L, 5048711494641582808L, 2360957084007330385L, 7917754814463914471L, -6851982712723858168L, 8900603062938514235L, 4819584321579539327L, -2835569523292644082L, -4162535888497939071L, 2409792751347803057L, 7449496838093054313L, 2608138101170875382L, -3089532541034338534L, 6775169570724432173L, 2898833334747545602L, -8076149933667584112L, 1717647244194337596L, -2273374492424215382L, 8669102231478190086L, 7938185699155198682L, -8713704321949088317L, 3969222566346957165L, -5988784469396818180L, 9134972545477524348L, -4561983676892834053L, -443809933158089025L, 8321595681021526376L, 3740161260836255946L, -6223083854011302213L, -1981192628965753587L, -8189443922177186192L, 5892660270079857124L, 2502541675832561804L, -2804466300730962706L, 3575476887658224151L, -3200685872914850720L, 669897467106812851L, -7208553650918336623L, -3694119084499141361L, 3809516679850545744L, 5718256960103440747L, -2332953186743126124L, 2758712437335984427L, -4627477833875620761L, -2457079737070004919L, 4334551115747581955L, -7965043308780665057L, 7539375937215052192L, -5292836362296451116L, 1449546416188301313L, -7476662035618257748L, 7253733569142936148L, -4410843088901983194L, 4494160142329627358L, 5797380680492875780L, 5033684639528710629L, 6942380200648117235L, -311213848885666718L, -6820034994775438104L, 5452010138718157004L, 646676091767009875L, -4539043153625528549L, -6988416084379726282L, 471514214048988026L, -1312069221898101058L, 8614828720478738639L, 3471190102295415799L, -8245283892968532659L, -547814629229383841L, -1516815754241838044L, -6167477462292361850L, -7381664543912200884L, 0, -1067861853971886868L, 8143953700710785973L, -5825391166404688447L, -7494732077575095195L, 1847633384726895125L, -7672935903076573512L, -2570373723287288663L, -7766808051888107688L, -9211246677606207655L, -4304686731880476836L, -424225740051214974L, -944158789619597359L, 7698943044753169277L, 5558086220651709366L, 273485755470967613L, -2437239977867205004L, 3045458228384031455L, 8041346034719003450L, -3121761119376230662L, -4956810279513479744L, -7615625819989316219L, -1494719728652540476L, 378507382706538567L, -6621729356152879953L, -2037663147516029033L, -9108086336008503623L, -5865219631939627999L, -912211069378859471L, 7175315966437357774L, 5161723385538695992L, -6691429997208146379L, 8789995975362646502L, 122301190315135456L, 1339527752872090491L, 8500289773969701394L, -2635286024337609165L, 2206125151973814415L, 5912507865751560921L, -2158837887763724681L, -76874749012421595L, -3877320079976692107L, 7055674186596964883L, -1780331338551374288L, 3226973935617776037L, 1613642550683796188L, -6336095750669684901L, 2113919936262685618L, -5242593384495067596L, -3431887019008757923L, -205618523608504552L, 6290905146667117214L, 520631834711206554L, 6090649271097153955L, 6268809121346255742L, -4722757421728125561L, 9011259725410191425L, 4260067298331642521L, 7571604515825379392L, -5957963198686648548L, -5641402047464721074L, 4929679943725850629L, 1562558313115120097L, 8378270681804975090L, 6431029428379739063L, -1174442872063853469L, 7740178818457750173L, 4437711457076851171L, -6732384918571794475L, 1735746844117158901L, 1251271430781151302L, -5005927899907263456L, -3319719480029724995L, -5762576781129063250L, -8874015624313325826L, 8122139634094273109L, 1040986648309745961L, 356411355647007143L, 756721191328944270L, 5318878451677075985L, -8454529626693894185L, -3672305017614193425L, -3892411666385996472L, -7872883033760648158L, -4068663746806629279L, -2179221354102278838L, -3303846208210219648L, -7330572744817539471L, -5490825646511057005L, 8272760012479254664L, -2966645796984155097L}, new long[]{-4030255449738619426L, 7346976492199675417L, -626116132630139325L, -8818858909562055882L, 6533467991705271684L, -448178970784563971L, -6764453224091262193L, -3624289984018954899L, -9205540189538630779L, -5585462176368193220L, -7429905405277353951L, -4656326962959550440L, 1151735774811599048L, -6151769618714846568L, 6942284815962019498L, -703557647758734283L, 3304311495801540674L, -4831136898697919614L, 7559468737934159677L, -6359765666358135876L, 2957424603572281991L, -5197658860964970097L, -2809702287761406565L, -2956007109283531437L, -3067203235521704247L, -1571434816639601324L, 8085181091649676441L, -3591952015147155721L, -209953567916339656L, 7642183762405766865L, 6618156441656008690L, -3821456694203446222L, -5721068125790025520L, 6768646983239759067L, 1229560361235927109L, 2545497942825370364L, -4247812575351915270L, 8332055718082846467L, 9018811952317763005L, 4566156016530439069L, -8867871107904474816L, 4447555131281990257L, 1889868047608435272L, 9132310989383824935L, 8423405394594584156L, 1791576812070341540L, 895921998879640402L, -4136132749925103776L, 8686043850126826766L, -259527717632742322L, 3505479608743889749L, 3164974344323824491L, -2463388277714864290L, -7381315281960506793L, 1491256427646959862L, -4922222727044511011L, 5832729293860314623L, -1668591102639493960L, 5588041959860897512L, -4477392520457318849L, 8960651507453538251L, 3404044757246527918L, 7427396029290209269L, 1567782000193888896L, 2125332809319160599L, -2696297740110004735L, -8684132036093703462L, -3781732998293770684L, 405965478745608371L, 1334608620921465823L, -8162931759184195269L, 6009835698019100261L, 6362838478626120808L, -2915579863370524891L, -6253885823018934014L, -8424766350955232888L, -3400959220014064006L, 5388605995385671607L, 4789436484882904608L, 8273825248612433269L, 6807803589745610561L, -803141104343149095L, -8044273462534131274L, -8959238411213129697L, -4562432827018040247L, -6847432110282425629L, -6617847203449567194L, -5916573000348838969L, -5876878730644248483L, -4287606846705721716L, -5388300036355532701L, 447961557886364457L, -6806372268832745323L, 7989344413684106260L, 7745519667033183399L, -3162377592575071041L, -1888435642254047844L, -6670898553424985735L, 5873227033075236745L, -4286789270562860L, -7115147458626955118L, 2021362311995275617L, -1046827325327899286L, -7348342965477568051L, 4652678544566382540L, 1850721214614677970L, 3779734978877634960L, -2226104194499971239L, -5091849455076895951L, -7985129142130994240L, 1609153642657618202L, 4480481336861891051L, -8473849124741782530L, -8335690430216009513L, 4986581067319345023L, 209097870346312172L, -2276381894218689233L, -4447261871345863259L, 7798271984477724152L, 7243570012128126063L, -3333018702976353268L, -5544050972775074998L, -9018030957147481495L, -7191672837363402012L, -409121388910540953L, -7001735332191755512L, -5177453641450868409L, -7244442712347462725L, -4041310443283782378L, 1180970181547717171L, 5176105366933055123L, 7188535108749356336L, 3071419591516346653L, 8871593212975408788L, 7377047836268559747L, 745784333737205883L, 523712867556149599L, 3218003841565405748L, 2276692251301888763L, 4042724623974101698L, 6062869490421444410L, 1668368207247227756L, -107200675243772510L, 2916365256580759793L, -744980879059175505L, -8610870969725437422L, 6147487227497352524L, -2362538166529167694L, 347243151226876613L, 6999741710823961820L, 2806071973676585551L, -8788735839226091348L, -1183493220983118361L, 3821216675772636134L, -1789001426630173584L, -3217716098546522656L, -2430408108131136316L, -7873943064266053542L, -1149811373353720036L, -4750585183628141970L, -892221251657868154L, 5286400504730760237L, 7609746906341231947L, -2548006234371058392L, 944934528471361828L, 0, 6430778939292435998L, 3336736409998420952L, 7875361642996334478L, -1846528539907703290L, 8821948844834997474L, -6010057508961455695L, 706136312374746081L, -8506197141978474396L, 8606606803205598662L, 6252543065422558934L, 258180561991695258L, 3932361041049477244L, 2228031909561065613L, 3591083712976693539L, 8046871333151188578L, 4829160237163942998L, -6065391445415380754L, -5835889602077783509L, 4380598834454315015L, -7797487710135793108L, -4378688104862656557L, 5548248045526197406L, -5626880067174045018L, 4026619618737144330L, 8789027980293848952L, 5914590821894013971L, 5201360692628199003L, 1438508405363181993L, 1047132165489660606L, 5627682402975382898L, -3692934325936855269L, 1966322907280535614L, 2694302999865518549L, 2361664381868374374L, -4989108504807806805L, -941866114256437520L, -9129718635683421709L, -7638464970933853947L, 6673472819996841645L, -7559179876038510359L, -4789654982222634508L, 4917937056650714377L, -1335952497386210293L, 8472979738121466922L, -5455256526993655275L, -7607840574798439777L, -1233841633585051759L, 3621785006072287929L, -6321264663560567948L, -525690647958430069L, 2600818822502173603L, -350890450751740655L, 5457179844010077633L, 104674322205155958L, 2459119713154539658L, -8087180229934124211L, -1965524969523353622L, 8162692825194907375L, 2847061296053530681L, -1439358620438684035L, 2429042753721621264L, -2601053358443111305L, -6942520436352876162L, -3506841683981296511L, -2850200109117495315L, 4291817720210491736L, 4250406047929019182L, -1611134702235742514L, 6848231166907919671L, 5722504929196957444L, -5283333209384213511L, -8276968459716351327L, -3935503167711873112L, -2018290618604048715L, 804576823300162061L, -1494415651414517982L, -7742435248677485709L, 9209752147493311569L, -6531539192194323888L, 630314289831180695L, 5090994841956713701L, -3302404079808903274L, 6320413364043601056L, 4136912626218684596L, 3688671278293774543L, -2121626579602862909L, 7111516025665441606L, -6427073794025991734L, 4747430357904739770L, 8503693248481660848L}, new long[]{5022191610516858060L, -5800904701749453560L, 325196729119310435L, -7902632335432024366L, -1275020129832272985L, 1619663718359036237L, -355156193309366908L, 5335828035754758151L, -7067565944566412775L, -3798526433470663894L, -5359911709110765600L, -2532208113978446666L, 1287844858498292800L, -2071692252756128045L, -6862984376374597181L, 550964732710513933L, 8585995564513096669L, -2760271765158838268L, -5121668511014600044L, -816004031260028593L, 8916962000159598712L, -4254160368123066399L, 8560921352511315212L, 7426955371667046732L, 7096434795747339774L, 2543027200294554449L, -8026787735162470547L, 5721517685081291957L, 1937338776563641064L, -4710672869224480440L, -1339811264550726455L, 4899378514713126672L, -3673650654185164554L, -1748370356318745424L, 3710095511616993728L, 7340570904524980467L, 5918098101825092432L, -7642223448383253537L, -8716653984131915535L, 4697601972911171247L, -7966292763585932868L, 5151346661287437683L, 3331340938598661669L, -9051540132384224189L, -7204664438506969912L, 2915854855682031097L, 1492126639482712306L, 6290138385502410722L, -8595407305453562822L, 1856873279258002822L, 5831708560246045423L, 9075623880903535524L, 8815370023405405865L, -5279349609657657202L, 4378109956818586891L, -3439845308874787053L, -1139502944774581460L, 2668061343609997453L, -2889519392695838178L, 6825682518352077045L, -8922186867811676257L, 8172884461239939073L, -6254526210459476268L, 4603827798664618597L, 2867088101655710002L, 8332998285759836606L, -7775381576435942130L, 4672530790940461182L, 1134559637999613131L, 3897488771451098482L, -8137000561907140297L, -772950844530606178L, -1728738397008545669L, 7221495326637043234L, -1849396657442790815L, -9174585730886234628L, 7909827430729881909L, -2444081354433843959L, -4163290364782213538L, -7577480709912625999L, -2101268725598167038L, 137665338910158545L, -5931204152994046793L, -7457759296736876885L, 6746265954835287963L, -189638032760625576L, -1024927361995588099L, -1527455564586976828L, -1177935295216069258L, 5838760703968564286L, -4415126550633053123L, 780392312595241081L, -110204031714277066L, -5604537100301722899L, -4790021541885448666L, 7015947325939974800L, 3645098545556231953L, -561819241209197846L, -934053641427354558L, 2066784160966486324L, -5034171952356883669L, 2661572689932379740L, 1033530071105264154L, -5489401038314458052L, -4578618083660511870L, 3121291101747188375L, 6662680657495023946L, 4471231211228269748L, -3022117047982312241L, -5866468419329903655L, 4219404094166535895L, 4762278602948970945L, -8967953485935648110L, -8547850243595879701L, -3473479388290731703L, 453876631214605276L, 4407685011702703066L, 6616899736578362439L, -5443495875284215503L, -6027728514849410458L, 7990341289637279323L, -4004030578970043324L, -7230942222439593531L, -5114619702887027643L, 1373724075619900927L, -4663118841695326311L, -3086804419763741791L, -5694935987874440366L, 6083572248920684684L, 3484333688484746926L, -3924950286951517547L, -6508957907156220559L, 9139255992929895626L, -8224492325301274488L, -6190959931998490182L, 2189202321390233739L, 716843780901418775L, 8359149623152811187L, 2415494092048157422L, 5243176795453837752L, -236631585242642295L, 4154687863979303353L, 2272222198031926874L, 8690072078618429206L, 202427615156584895L, -8807048875170750130L, -31120709530589209L, 8942462418363155829L, 907753262429150117L, -6636063805428332883L, 7665181140788048952L, -7548467744294317472L, 3239326427400699802L, 6868174095610514980L, 3808219771792118989L, 7543278091629671815L, 9168270020997671451L, -6053858953487310997L, 968811775037617524L, -2306417983241649192L, 584245825585813958L, -2630487407999745605L, -4915095507370037766L, 8750568181363911111L, 1698743779072106396L, 0, -1502945925515520235L, 8236472591980224367L, -5236861298165303713L, 4035151075898375075L, -8144050755230148634L, -1591076393697569110L, 1948891778265760825L, -8727645643825394144L, -7392198592007632774L, -361643978915034283L, 390196158411648178L, 6501762612143760022L, 2496032298569901440L, 6037175610368660865L, -5683947345327655549L, -4242608233385727696L, -2298557723295997507L, -1404809561562629608L, 4925668384127994397L, -6279600722624450555L, 6410254435445760809L, -3116382805945223824L, -3593119323321426024L, 6421246412478107128L, -8389988771804185772L, -692478471504998160L, -2857359617058050347L, 3832728561082858012L, 1367237356757087022L, -3275211779544041812L, 5272189459801538409L, 3250881896629883211L, 8001331881476413578L, 6968391399550921793L, -3214151934877001603L, 809969847888836264L, -7004002273151654537L, -6769223851252275076L, -1974066071074724898L, -6610549085535179872L, -2695487635533189270L, -3680135972265730521L, 3078237133952334918L, -6978929124704531546L, -4495596308024530093L, -6384798519481826098L, 3445914570843754740L, 6242581091097786675L, -1913008689637290737L, 1539119056502398499L, 7794692769390540772L, 1168206872894059153L, -2507695994495548825L, 226938317788999534L, 7419906245093191581L, -8343571233385605543L, 3581420404919564415L, -7801043624446046205L, 7585766634561542998L, 2998877762491110184L, 7174951347083690799L, 8107322624236560080L, -4868539441222958857L, 5494625981129708507L, 8496251452686250594L, 5596216022932782346L, 5661024595188978276L, 2747447103066187747L, -2165963102470172820L, -3338817622691620414L, -4048717794990741361L, -8468508584617454203L, 5085786205181774754L, 4053661314365738856L, 2109836211124176869L, 2336412667751326783L, -6833968380723247342L, -9132096051380542675L, -945607710981729645L, 1742301027778505559L, -3845518068317741573L, 7748764524654516969L, -442177925414869957L, 5468987013722291926L, 6162091280534394461L, 4280460676255686662L, -6445294871958312417L, -609455332283285983L, -4372075848610567444L, -7327464649345800428L}, new long[]{412778415529865760L, 3577342882794069583L, -5641231359968545580L, -8360354891303721342L, -8815395659090061125L, -7417517676636177975L, -6818951615660906963L, 8540370589362648094L, -520997537338351428L, -4727129576760171852L, 7380585705851070183L, 5532990722829248072L, -7691855626550785470L, 2363770411641709807L, 4799219136276863089L, 886827555711267723L, -3685573774419866413L, -7576141180696842327L, -4392773903311365453L, -3287291658763706349L, 152494743391849906L, -3649364066632473462L, -6378955412281134618L, 3618765265895209892L, -1716595120412069307L, 6638666397703976113L, 6746862217775881448L, -6012164977874911745L, 6325409020385589416L, -6565038336846621683L, 4058193356686090212L, 7086287341885701278L, -2771917532509164534L, -7963598493027905477L, -6718493157917047866L, -1989525455461826098L, -642177714062068004L, -8668117067627047671L, -5832910844866177004L, -5472952995583047948L, 3891946276334412253L, -3179016605330421686L, -484727283259111195L, 8437586805018431989L, -7825470045915439735L, -7014338722660612517L, 5716202677831336867L, 3243582143937888061L, -2579911156235362774L, -1571570467631317001L, 2399609570378190006L, 7345426154655236876L, 7619693495944769671L, -2623928864797007432L, -3315748747819219464L, -9075084495080790231L, 7194324827586368711L, 4309013456660281871L, -8196421247265975134L, 4166240605864818621L, 1366177816882650955L, -6109201961362406803L, 6217414342487101681L, 7783606731388437159L, -1326567251088752539L, 9037712741102696455L, -1434402495440951236L, -2328508569491276863L, 8304362858347251262L, 8707177795482651175L, -3423592723977556575L, -5061374920767775450L, -2142416718843079163L, -8088294678366913285L, -371319742740009714L, -6682230743172060257L, -7272631905926302597L, -7308630489489105886L, 1945973140213898976L, 4200834197375652438L, 5435457027409418714L, 7756135292223372597L, -1729698296506932187L, 2508515451320396125L, -8923459624282869534L, -4128744637691189101L, 609168629503044082L, 3755788431048666223L, -1294151922135947890L, 5399380291345002883L, -6145392908131276236L, -6257184306882179105L, 8884253657276313548L, 7648167075477099884L, 1809525021741863762L, 6185017703168619802L, -3936060424307441933L, 2064551487375270258L, -2436564695348784232L, 3469367101608228374L, 1536322983539794137L, 5796100959046534970L, 1773386847580617483L, 108346540153546841L, 9001722862285623390L, 2544785687349641476L, -1185903330127508009L, 551619354788593554L, -1881618742578288233L, 6486896028513362810L, -5327214006029481146L, 717443701121057195L, 2214371934970162368L, -5219386590255766753L, 1140410460104840800L, 7488913346602372798L, -5017208032223676211L, -2034369453084459428L, 994812197283306450L, -8332306493105563376L, 2804228341285155620L, 260410206251574763L, -6978049983912956414L, -6292961768551667834L, 4835367340339408936L, -3510802620212598472L, 6348897592219414216L, -4866111242788671738L, -7999675210372286366L, 2250650893928301721L, 7511575676904462558L, -7453665862510849648L, -2879832976648862637L, 443413779826989003L, -1463594670408230994L, -1838018357033071492L, 1500526641193339008L, 8152292870049500044L, -8468208622468673829L, -6854800545328525708L, -5976114712830143066L, 858245894210178073L, -8224311796882886327L, -4619232891496756499L, -3000621152483837334L, 8743440194190385790L, 1218336215312585465L, 1032276353674575417L, -3546598980344807071L, -44273616367427794L, -7539923910483671056L, 5903954706119241571L, 3395223664118723215L, 5940852870679710344L, -5868829237233520563L, 4685830293981560218L, -5500138837814560410L, -9217998094083183973L, -6528916603821540268L, -1066837721018687209L, 9183300283681142197L, 4649831692234020291L, 9147178532201324012L, -3150721088639387688L, -960114386881264388L, 0, 6898510060154343770L, 1643589765241144626L, -5749199594764804979L, 1402114711967872786L, -4909020925620612972L, -8509612328854475984L, 4353588900056941981L, -4274472907005860575L, 5292673456375059560L, -3819786587920884968L, -2732275386223179295L, -8617879545117768855L, 3999781539141355908L, -7154578025966711831L, -2892636494603496909L, -6414945272642414145L, -7118720227070778448L, 6049120102845506257L, 7933416458737094421L, 4461908978498334148L, 6790446112744143107L, 3726873057198478333L, 7237529453753559893L, 3864037041512891446L, 7046626506133690741L, 304722305440127609L, -180302004885450084L, -4238193929723523720L, 2934657069911674141L, 6076891152586415427L, -3783717699158133951L, 4953135073593642938L, 5569207977274658321L, 4501008218251986991L, 4608914949056012406L, -4428912061564865814L, 4989423796032989155L, -7727641956932165093L, 3207522108247185252L, -924344479047095131L, 3108845752482162934L, -5608256674910105281L, 5256746322603637809L, 3359313093287303894L, 1679799455245938027L, 5680416363222969338L, -7861397160959494704L, 5089304188877242888L, 5125161971465923153L, 2663698829192085142L, -1103038706126747314L, -80402905395234953L, 2840208181611518845L, -4757783617672493217L, 6456820608799639185L, 7891434163331525374L, 8401668394735843756L, -2280687896300332105L, 3072644785963581615L, -789462627719562386L, -8967161494941511824L, -4569866251420565672L, 8268585413250313831L, 1254405120516291232L, 1909966976157497017L, 8848404743649085333L, -4092879008052510518L, -8776312905484698288L, -678237734114500987L, -1608487313068402148L, 8116101939860513749L, 750401899863958592L, -5169412425057929857L, 6938439418119057708L, 6595232530173053731L, -2172508620443159570L, 2970426959157404996L, -3971997302950668630L, -5364694639978582355L, -9109661608865496382L, -3042586965901860991L, -216281829035099451L, 8576420872327912519L, 2100417098697099563L, -335480565948299945L, -2471705565500754317L, 2699828134389257935L, 8041674830518265676L, -4533860103266674943L, -825373182915865801L}, new long[]{4535860555263248921L, -1593883792362675665L, 6140263643322089338L, -6967817572884739277L, -9068728722506311860L, -5119179363064467534L, -3726516434561966253L, 3976828915743059002L, -7597780219754517232L, 1674533312481288529L, -5886538279117927405L, -194983811068225421L, 1971238590622152549L, 3457832774275448914L, -2295860740536826868L, -6652315346019870505L, 4727861667757458726L, -360640838872845927L, 258683541723454221L, -4212320325738251920L, -4700056087296932696L, 2233564259985426290L, 1378062126584976310L, 595850907021173971L, 1148729542089166137L, 7220711707371485274L, 4275768676387371534L, 3496324401055548880L, 5165544922527804988L, -956350612060285622L, 8412095690608439521L, -3467835190780509090L, -1868861577046741226L, 8847930418030264104L, 3309372870217980335L, -6026061361088047634L, -3133105345988201669L, 4387469920445666276L, -3377435183918791892L, 7765336488733668707L, 7626271911434349726L, -7284186450594579676L, -3896518737231810748L, -2984469520196638010L, -4320040328300053632L, 4089712366057758979L, 2084822880951770767L, -3228798250034046255L, -2818438179677494001L, -5677050606033188463L, 8115270375799669254L, 5758785072471788271L, -1421612514850123208L, 6401431119593581502L, 2607396063788253068L, 149165799264492029L, -8017447770816002550L, -7703331937915472355L, -6791485476041195222L, 3161051439931945653L, 2862129545546507393L, -5714533272975881375L, 1786865009825524840L, -3262866899008497631L, 3531814185980970784L, 1489042636343605852L, 7953372014297400692L, 4127379132466308083L, 703148615521134115L, 3051392466055327813L, 8884721462095101400L, -7563314075847069728L, 8288941250235652363L, -82120263218953346L, 2902931453887900088L, 8254758264932555771L, 446716860198103834L, 6435790520947517774L, -4979585920924371377L, -3856260413246245815L, 9043176952977856194L, 5945702658036389520L, 5618980515518141202L, -7981861276107848454L, -2502052263308094184L, 4424111993825693972L, -4449788790258986854L, -2948734028505389002L, -3412032698246774308L, 2457938976092230806L, -1165748696601507531L, 1042563110803492809L, -3747776250095536455L, 1000057432295396548L, 298081034413880039L, -474645568105829740L, 9182311907627011903L, 4237995257073580286L, 7360269973856297383L, -5295414172587761541L, -6373502291430987216L, -4063613031681449843L, 6575665438039683251L, 6873491385755763284L, 5461089107914913800L, -3577775055518873938L, -8086901795456695416L, -9208569554887962959L, -919672336669616198L, -4944387025271606081L, -3097896520644005429L, -7107622129831046450L, -8928832832669205418L, -8475347371214605409L, 4759102407226695211L, -1068097064803381689L, 8551269127753525532L, 3200854107087625055L, -230332776909038973L, 2268055074172700034L, -1104598319098278729L, -2187201184074365188L, 7467557820838912855L, 5842407176390331805L, -4665450842291730856L, -6901417610102864934L, 406460662087397399L, -6198315592433244679L, 2713878548564622716L, -2632949749941649918L, -5537491248627724180L, -1759061912934011418L, -5083451602578264766L, -2353380153490207515L, -1273221880008422459L, 1340149631943889222L, -509101851032934300L, -5259045396831739253L, -4598494993368938137L, -7842091911972561657L, 8063408691889325956L, 2565552841162102374L, 4619087852284151766L, 5214791045043151621L, -6621485381509140163L, 8447401294454977041L, -7386369256688836567L, 2118998135578172543L, -46523907001319026L, 1638138058256147361L, -6512991288666475571L, -7423992098470976807L, 7923814141646626425L, 8745197289204327461L, -8195571213428113032L, 110046607829271280L, -1445494248467825710L, -4839123971720012459L, -5919462946550491362L, 852275931467612126L, -6166501560576966924L, 6838009262779170980L, -788230540367692640L, 1935925255570044309L, -1551942601407268574L, 0, -8822376749060931930L, 5055648419791580364L, 744521925918424366L, 8708792173461317333L, 3012835619118082888L, 2417128113004220315L, 1525826018450700460L, -8961158816430844484L, -4343200236693384598L, -7004328756879980093L, 555623154201897450L, 9144795202799799759L, 3942477176883605194L, -8788888637889305173L, -326429747316083863L, 5511376580148613602L, -2782077065878689793L, 2755821882842654321L, 7814304129864883337L, 5354596692910111480L, -2669767160806458126L, 6280103384783087239L, 1191443428809820347L, -8615256373451920798L, 3349066620751495842L, 7030425627006208077L, -6305639805172127991L, -2540001088809363480L, -1314034877561220920L, -6482311944371394368L, -4492292368662033513L, 4572398174778067177L, -6761929720943764953L, -6058791419533034492L, -826038134467559856L, 6698133237560285529L, 6924249334748056253L, 4915877947555788081L, -8335447238620784507L, -5398145166680982666L, 893432504920462900L, -5434972439063135866L, -7144308136435675074L, 3644679859973545005L, 1822496103478537880L, 4867631031866531035L, -7246386587163018796L, -9101106301180867519L, -2390870482918994411L, 5651355959728424991L, 6102500154237255050L, 5321106438415311349L, -5780327991925453085L, -677612315386943571L, 6541340121823556163L, -8226814104810431883L, -8505466570320058222L, -3616892129401250397L, 5982354661116236896L, 7656949129855104915L, 6733579076392590249L, -2147505281628267023L, 6242444349043369079L, -4170944906378075523L, -1907416263749389285L, -7737550691966192403L, 7063352394543305536L, 7169984984404332976L, -8365591653203775121L, 5805861825662078829L, -1700225492413652769L, 9005272120822338610L, -4005320658966647372L, 8149771120223764726L, -2017179644254701845L, -7877433215864021001L, -5575430213156515172L, 2309691269046898027L, 3794159109699761975L, -2038879809766744319L, 5025527060452063169L, -639979543376370339L, 7517355687739125358L, 7328458050963454634L, 8586890291714583532L, -8682537007609370789L, 1228969994608986699L, 3680135560314805981L, -4805045392508215387L, 3828474564935022023L}, new long[]{-8453070235243615635L, 4884127456122942266L, 633234397777501925L, 4175331866391974078L, -4485881859065591886L, 3179702086296496554L, -1512837584588167014L, -7752573287164883235L, 2821567796802171918L, -8429518127726092206L, 8620367719189969058L, -6534403333025349498L, 2483193514877514189L, -2626196862965158658L, 6709821147687032714L, 1033155461149792359L, -1270162888182207143L, -5769827404365637859L, 7895548116537857006L, -731649153213821910L, -713343999045677205L, -7647763973851249438L, -1429157854399929305L, -3576825843976268310L, -4260165995353210255L, 5087312367917758201L, 4403136284925796162L, -7001683542362597050L, 3775805186400799640L, 7039684027147830007L, -4097783045094489808L, -8749424154144572556L, -8707936849463168693L, -3223332091657620965L, 7393281011622612554L, -3839783834919855594L, -6564596451137123655L, 4010248068099147993L, 1391157335655481238L, -9045169530825444216L, 4570854599768479292L, -8189094146226821743L, 6677411409753660853L, 1869614486838700045L, 2692552123250949488L, 5803321545042218156L, 2939237684151739990L, -5883521838890148574L, 979419644422445862L, 3673082354135452954L, -6913296576561183419L, -415785719237910926L, -834198937845742059L, 8160101394646269472L, 8665997893524695802L, -4821127355493817676L, -211357278447627569L, 5384800866856167392L, -5530020817350821165L, -4854011018389182325L, 1572125733959825684L, -2126792025060737984L, 5756880660441440803L, 9141459606454807672L, 5643134515567552540L, -1831053266724195396L, 3878345071173861799L, -9219713781305836042L, 2223083610095396016L, 7793025783231257041L, 270525564056519489L, -599737493290351276L, -3630580481258694997L, -3980128841890065560L, -3372763326975378587L, 2096675571659106289L, -2722105626296801599L, -6792565267702591622L, -7982779848137766114L, 3546709370140069467L, -2740375726023973504L, 177299642257213822L, 5128824965654363334L, 3284371762775499669L, -5027102895479968247L, -1791810028540380797L, -43630025795953743L, -3929600256180692649L, -4338348378199077172L, -6738813919702414277L, -7350213990308637189L, 1469770529583346475L, -2180581718931620095L, 8788550027033796805L, 7435101501630170229L, -4431564408731826957L, 7273261710249789236L, -1324515669982335464L, -320272809040341939L, 4054715969654905473L, 7599903567200476178L, 5246485543787097758L, 2066061333143563726L, 8899911909190592955L, -7128040995085149689L, 6203347905963379246L, -5167386234789582985L, 8982737327710905606L, -5677756788191890515L, 4733860583378205252L, 8385890890472733667L, -8870358421544177142L, 1983784429268132211L, 1144615724587504216L, -8949243203173892425L, 874653248460230937L, 8806272569836118916L, -5323464818055102704L, 8490507753801150940L, 4996983704035276216L, -2547329411460620221L, -8242880533652363568L, 3101674511553930519L, 8063548039483480720L, 2782314667368316465L, 7188904195392064393L, -5211864924090600145L, 9015613289737121593L, -6285131514020389984L, 6918945025995344072L, -8075373294475235410L, 6314684983379722257L, -241532845093005072L, 516733887222336701L, 5295035016025023649L, 4372970618206377341L, 1367579971541251497L, -1675255866329961509L, 4788193436127426821L, -8033431620036738783L, -1920834373681827587L, 8286510523341552993L, 4528946180991933443L, -1115059448466290199L, 354332099228667900L, 1703685653761847402L, -2033127364819077505L, -554171441618135284L, 1749306493112033842L, 6593587578816598280L, -3139112079942074714L, 3696774096474081061L, 6359145787360465481L, -4695297660307955211L, 7551609152712119853L, -3421199581619080870L, -85565928058662514L, 5408360666650553823L, 1887903149406137164L, -6643353753801603580L, 1193308391354416343L, -6122745256225810207L, 7714012032021747052L, -940295458348941161L, 3338705706857455828L, 0, -3818308703608942551L, -1953665223426671934L, 8307846011238545246L, 7949845912698622127L, 123000737600621119L, -3465393072583450667L, 3896669045897085670L, 1241734746156300008L, 3450192318869875435L, -1624472154218651164L, 773588076271081371L, -5446358391519529362L, 4966387029739569031L, -6444585804073991225L, 9180589562619618887L, -7518677962122949220L, -2516687689508984196L, -4227713340001105842L, -8591376611877854445L, 5589364474795928413L, -5728452502948824686L, -5341733827254846383L, -9099519005106489399L, -5551364006150524692L, 795073098915667364L, -1066649621789244458L, -5937835998867923357L, 7690267545386164051L, 2659693781377578831L, -5044808816750465720L, -7856985207392810913L, 6500344023943830327L, -2390298213912958659L, -4608855104520647283L, -4933455855289899978L, 1589851584549665365L, 2429422383846896268L, 6482023338771290230L, -3036729392062401383L, 6185590308720085359L, -6236844791758827105L, -8839769439558879179L, 6080806279852835664L, 2576885667214146546L, -6962009294672981127L, 6001208834408615917L, 6836195239104500939L, -6040333039102815140L, -2905178410103177753L, 3080356643708727080L, -2860693619659558977L, 2306958247692105907L, -6402773006393882120L, 477155333442143874L, -3735336985853682540L, 386794645880882627L, 7093418736453091766L, 4288595764497750464L, -3246936939308599260L, 5979776620583929298L, -4137334106762671345L, -2303035963802815170L, 7303480121366170891L, -7473099242571571260L, -1534127960405515611L, -7331909943831013702L, -7160476017532022728L, 5486956530453307746L, -2348898833569914110L, -4656142419646682166L, -7835527709155294624L, 683790475565323482L, -8345280785751675665L, 8109430964352234527L, 4193092754259694591L, 4613640514157211771L, 6875861785975561972L, 2264473090495966863L, -433528061428458189L, 3498327026982732900L, -8542852432728676052L, -3019022379190732840L, -1158686167486945434L, -7630022740424964189L, -6146464449756130594L, 8508793109654811293L, 5853965616021964435L, -916593816117900632L, -7238641104478299003L, 2990031287613762665L}, new long[]{9094991057681989827L, 8606138803235823195L, -2286200986180536915L, -8724216130027185838L, -1649148858432656587L, 4026406244121087995L, -7635863337866995078L, 793466831469952157L, -875870498908510964L, 7069806061322532341L, 9025437343642800970L, 7902240744518357090L, -6962787910639909662L, -1403860579092282445L, 169507756355412485L, -6287132366789145831L, -396162960508142700L, -5352074804142321757L, 8708198706664012748L, -2075344634876451292L, -4084819757827458690L, 1669125631761648043L, -4407130716549885448L, 6740073072435942682L, -8819606099442431269L, 2010954567078870965L, -702210179433312886L, -3237789452609264804L, 734067863229058321L, -1715852844487206215L, -6780347474255882879L, -1234467515678383690L, -939753275567238016L, 919214179616323102L, -4836479128919502533L, 3253262042600145346L, 8178958160323126612L, 3337947751052939851L, -434695500023977955L, -7029504953396562578L, -3596390815882237978L, 1052577896389186587L, 2193586592470914867L, 2442179127876909020L, -3778948349093605536L, -8171637376153569722L, 5137708932055784227L, -6227768720359261547L, -8303875261599624125L, 4815958689639822245L, 84753878177706380L, 6315843737766598667L, -64743613097569518L, 3871579785502944766L, -3903411312947434139L, 5793075969118851720L, 249718177605522313L, -8430187655510548800L, -514890802992621167L, 5498396982908774334L, -5688626311019391319L, 7667703386526505697L, -1763570622529142994L, -9138337821371313199L, -311433546468111848L, 1929022448056995385L, 1586665506641377319L, -6475019125594218750L, 8445678447034858590L, 7274058453835599610L, 2629305166521655130L, -2637746980779504568L, 8787833086900898368L, 1545819354008644526L, 3789645467455986802L, 5856993792710681348L, -1103552092532705659L, 2091361543251510458L, 7459518732372467059L, 7397325080452181247L, -3111338451506714145L, 4059487177496226412L, 559362848516098691L, 3155811880282733261L, 339015512710764810L, 499436355210984207L, 4260721118560188901L, 673503137787469464L, -3365532740684676775L, 4141949501641595872L, -8664854682622924578L, -5969827484503727201L, 5626135598191838651L, -3026606838441060269L, -6860593217317067763L, -3647879656817937297L, -8883511003774190761L, -2378568021286198066L, 5444143179324534077L, -7294069234986242972L, 609631631123197716L, -5523727707549764436L, 5576337977799677490L, -1321411723963813313L, -618078659199583226L, -4151521544861120270L, 4387173184941765478L, -5082267926572090947L, -4572121610279439363L, 5708620050009289783L, 6430542613299891216L, -2988006129208833062L, 1851664366124113328L, -5434569976195760593L, -9054144591182708648L, -8004677230250270347L, -1044133607961229559L, -7755831154581784449L, 4978440652618840358L, 4581695294717042927L, -5164165273538705359L, 3091344129077791553L, 7147744857192531065L, 4652093626960253344L, -1156491198976405446L, -3430015610173165355L, -8613457947268510391L, -6533824529218007925L, -2204279587396795359L, -857080412230766705L, 1346746777927262509L, -2717416407949558332L, 2259738658050909887L, 6111753265489546114L, -5801516065654160998L, -1555388365253904196L, -1883419760710312661L, -5585908440206867168L, 7729369582102031213L, 8912221009216268357L, 4519477316101755235L, 1281193087194051236L, -3297738211024334128L, -8091393832113813558L, 8118974354974954712L, -8549025517874578235L, 8521442237103337431L, 8066035438451585639L, 4453855455643222762L, 5377403871458974897L, 6345848246193028508L, 6845086483143640723L, 7988624098924168171L, 8365446172989525458L, 1467823520972380706L, 2935396374752471364L, 2813067799104965843L, -7553963791875298314L, 403485462937118854L, 2688701935736925910L, -2483016523405101241L, -4245213868322808965L, 3468874151188153720L, -5196122377024721498L, 1132260792577222039L, 0, 3535028415789053172L, 2491459977799754837L, 1003369614229768082L, 6675627174024062102L, 2029743588748113206L, 4729507165508558892L, 3637180897245407101L, -4494147492598365583L, 1413426849607831713L, -5885706822078681066L, -2876680564085760063L, -6049474784002780653L, 2575613213387593177L, 5320806183970131768L, -7132290993934539033L, 3422699430205023175L, -6593786619212038905L, -7371988033351401491L, 5071567999032830639L, -2319147337689098942L, -2546901499085257013L, -5755341154755156187L, -5039803533475599820L, -1949596290422182745L, -4307443116932011273L, -7809662711198584068L, -8219159179136522801L, 3173053820371464270L, -2907808627218761130L, 2362498430710285904L, 4897844766612488745L, 6236211556551125383L, -9222526378770226595L, -777413184082125309L, 1774266358176803900L, -7678395900680418829L, -4962370478595122248L, 8283899003267266269L, 4916772258018216106L, -2152722576735774808L, -197091380988415721L, -3845122679784571156L, -129224283564645730L, -8974499490705067564L, -3514471616123578774L, -6132310581227493092L, 2749198491462122847L, -7943022304666578695L, 8966051432100897478L, 9158911080295248207L, -3965042186711950103L, -6410584497178874226L, 6195919557778536974L, 5258610333024763572L, 7340795562680270710L, 7820356866570772974L, -3725255399656372765L, -4703049166709492930L, 1218977307603845928L, -5274083438005724118L, -4770362110272610121L, 5926479337025089677L, -7449951293353308575L, -7211571863907705368L, -8490147546478973108L, -6648039220059424892L, -1493156917619619536L, -4324684060446515084L, -7194473925616724117L, 7508364738339027172L, 6905068089466205983L, -257037940377878373L, 3949006037152890487L, 2995320669031979208L, -6732757501548149240L, 5985863049541370113L, 4182723086503020649L, 7574503472341076328L, 8348347100700559185L, 8828052517901670857L, 6506238233651847065L, 6937453620375099376L, -1825203695318757726L, 3698801050773903089L, -2792546844826423731L, 7019935873167451772L, -7875781928866380944L, -6068403477874304880L, -4641396440150900046L, 6586468308675751445L}, new long[]{-3444757183192547354L, 1637721477308921125L, -6297248449898319672L, 7646921253694161755L, 7930897700415732235L, 7354091399752226219L, 8517004666874317814L, 5453187778286554101L, -1043976743468927160L, -4194833387358178817L, -7708955174336155445L, -8563204505528125338L, -5712286124442861259L, -6823037065440364932L, -8275920727835279050L, -2974881390760536930L, 3965582442916511115L, 818990539008627868L, 6511022660614307004L, -1320077589205483547L, -3262719323413484082L, 6797246517703968236L, 2154964243676750265L, -5954292490194018164L, 3398770582681996406L, 6305239209379988312L, 4529647259392179007L, -3901986219323627761L, -8953700191097190930L, -6484135588680797168L, 1169952615461543517L, 3200289132027606858L, 4147956921301236051L, 708224122457687732L, -3614636676010189217L, -459997231093475096L, -7147120204223564161L, -4852545587358263355L, 8231768351619019430L, 8694883466081947438L, 1455760652066973453L, -8866994048856881278L, -7431164614507622609L, -1132130964538483108L, -2635626018905855110L, 7243836256093423491L, 3660620939660078543L, 2208053939432577669L, -1611933249001666891L, -174895080934727240L, -4029722790011892197L, 3377712478417560930L, -551951845368008196L, -1501670271861746531L, 6217894297849621068L, 7825436358742779939L, 4987043392780078893L, -6063885576440067084L, -5030923433844245315L, 8746199649574856250L, 869662533239166704L, -3796286352345451225L, -1521602510851146359L, 2911244210510417434L, -64431099335674992L, -6948146172091560637L, -7618076501429580809L, 5928147536793457436L, -7233802500807019501L, 5738424067781505701L, 4545920254677684779L, -4088906883540786217L, -7905997789725412697L, -3210311977975446310L, 2538748850867346054L, -6590450082657491400L, -5425002303774099355L, -2455945396081426430L, 763205940277591432L, -4430134953212300397L, -8385457009380595122L, 3093811003563252786L, 4790004205042634049L, 8356374131917757362L, 525807322001048172L, -8472943208417328294L, 8060006530596508447L, -4140047660305118525L, 4971791225320957497L, -2090548950504402391L, -6769791891600257728L, 1866917567049488617L, -844781378265929972L, 4878334347704591445L, -2869059261100175290L, 5838476093026002976L, -1785299366336707987L, 585131888633540512L, 4258502335484898171L, 9216164226481474882L, 1051613531605566680L, -9135643629782968378L, -5660125035251783647L, 7592012931346331751L, -662303645644098268L, 1921896258116084693L, 3288584640079142494L, 182885720694182440L, -8015847144335122289L, 4347442274373970199L, -6191868403371105568L, 470303682846092152L, -2691269845522873746L, -4373505448783357305L, 7877737635941138743L, -263331292381624148L, 8981595325954651774L, -354518366482511168L, -4617554474609824519L, 7536474657577537907L, -3847708088685798349L, -4907725647172659799L, 998525038457700324L, 8121292137418072206L, -1983208384017991343L, -8292017801529169886L, -1230246063685679911L, 1689003026191473713L, 6955846591918243539L, -5477907817628009975L, -7995247020750796389L, 1104161065046732236L, 5822238831865856308L, 7770259743761115727L, -7724066638932354593L, 3109098905151763750L, 7477148998953467071L, 5270373732550072797L, 235152363269307196L, 2264823631868769169L, -6879983194860478616L, -3152901566336629066L, 129144564315678996L, -6010956629246162536L, 6107963510664673380L, 2809900646717377218L, -2402152012640863426L, 292565944326076752L, -1895757919103578043L, -933739123822025376L, 7062097245496290555L, -1699102754331938911L, -3738854843827800245L, 6021262719684655624L, 1972895747902540481L, 3945791491441759391L, 8801111098641915142L, -4746241057700133395L, -3503934099848459145L, -646875556056753104L, 5560617129282953357L, 6890080809738628344L, 2627701227983280362L, -8756221997843360342L, 5539875718724946329L, 0, -1412735959647742223L, -5369322743027527311L, -4483453897402251089L, 7299656588959035031L, 1583357035284794905L, -5141091716070003051L, -6246073038520247844L, 6400302286636641940L, 6420058603497817984L, 6691528990365472708L, -9046393196149773062L, -3316034865972881678L, 9038681643377794922L, -5314466647222146483L, 4440522822651396099L, 8411535559894538718L, -2350026657572040150L, 4238992274866487919L, -369665565213580332L, -4607954124316941893L, -8847097543996772714L, -4322851948414609173L, 5169063728564034821L, -5775964245203979612L, -7526087252531780893L, -5085131195746564223L, 2428230993188407470L, 3570877924549138163L, -3560844495143377565L, 4060646644394037319L, 3855408526229221283L, -1804949614949815431L, -2272807811582181375L, 8928671747737777170L, 1348049825574685813L, 3677174894530839771L, -8093047239747710178L, -2745544849441605294L, 8644847306339132130L, 2719514554751545854L, 8462570783810646218L, 1405101508380157281L, 3478079366649118695L, -6538992612182536404L, -2584948672878155498L, 6598086612559222184L, -5606876459814153443L, 3768380308409468599L, 6708048310613262032L, 1739040292966674941L, -7036336127295658921L, -7325510790119301881L, -6645608358396189612L, 9091840505278506070L, -8669017857895383874L, 4700331558701315709L, -7415771159533754821L, 4679309188558905193L, 2030323828767328429L, 5649811934742993841L, 415940168518455364L, -2179868550282598123L, -954655941116998540L, -5190986870181543079L, 7190925116101314031L, -7126238021551530133L, -2074417242192479427L, -3029668045542985822L, -753108823078777320L, 5077496726762238993L, 2339654594279481786L, -4800103607302455599L, -5900428737983865936L, -85066957045458300L, 6127437837148246384L, 3002776577694476046L, -6356433652615537404L, -8186022235176912374L, 1294312070793836361L, -2918955505047487094L, -1213832296285327923L, 5255402455948538057L, 2517972805691405202L, 7008429859484506055L, 5361338717396067041L, -9152021663061328174L, 8178097563976550810L, -7817526943664710733L, -8582820119530581646L, 2824906557929530326L}};
        private static final byte[][] getWarnings = {new byte[]{-79, 8, 91, -38, Ascii.RS, -54, -38, -23, -21, -53, 47, -127, -64, 101, 124, Ascii.US, 47, 106, 118, 67, 46, 69, -48, Ascii.SYN, 113, 78, -72, -115, 117, -123, -60, -4, 75, 124, -32, -111, -110, 103, 105, 1, -94, 66, 42, 8, -92, 96, -45, Ascii.NAK, 5, 118, 116, 54, -52, 116, 77, 35, -35, Byte.MIN_VALUE, 101, 89, -14, -90, 69, 7}, new byte[]{111, -93, -75, -118, -87, -99, 47, 26, 79, -29, -99, 70, Ascii.SI, 112, -75, -41, -13, -2, -22, 114, 10, 35, 43, -104, 97, -43, 94, Ascii.SI, Ascii.SYN, -75, 1, 49, -102, -75, Ascii.ETB, 107, Ascii.DC2, -42, -103, 88, 92, -75, 97, -62, -37, 10, -89, -54, 85, -35, -94, Ascii.ESC, -41, -53, -51, 86, -26, 121, 4, 112, 33, -79, -101, -73}, new byte[]{-11, 116, -36, -84, 43, -50, 47, -57, 10, 57, -4, 40, 106, Base64.padSymbol, -124, 53, 6, -15, 94, 95, 82, -100, Ascii.US, -117, -14, -22, 117, Ascii.DC4, -79, 41, 123, 123, -45, -30, Ascii.SI, -28, -112, 53, -98, -79, -63, -55, 58, 55, 96, 98, -37, 9, -62, -74, -12, 67, -122, 122, -37, 49, -103, Ascii.RS, -106, -11, 10, -70, 10, -78}, new byte[]{-17, Ascii.US, -33, -77, -24, Ascii.NAK, 102, -46, -7, 72, -31, -96, 93, 113, -28, -35, 72, -114, -123, 126, 51, 92, 60, 125, -99, 114, Ascii.FS, -83, 104, 94, 53, Utf8.REPLACEMENT_BYTE, -87, -41, 44, -126, -19, 3, -42, 117, -40, -73, 19, 51, -109, 82, 3, -66, 52, 83, -22, -95, -109, -24, 55, -15, 34, Ascii.FF, -66, -68, -124, -29, -47, 46}, new byte[]{75, -22, 107, -84, -83, 71, 71, -103, -102, Utf8.REPLACEMENT_BYTE, 65, Ascii.FF, 108, -87, 35, 99, Byte.MAX_VALUE, Ascii.NAK, Ascii.FS, Ascii.US, Ascii.SYN, -122, Ascii.DLE, 74, 53, -98, 53, -41, Byte.MIN_VALUE, Ascii.SI, -1, -67, -65, -51, Ascii.ETB, 71, 37, 58, -11, -93, -33, -1, 0, -73, 35, 39, 26, Ascii.SYN, 122, 86, -94, 126, -87, -22, 99, -11, 96, Ascii.ETB, 88, -3, 124, 108, -2, 87}, new byte[]{-82, 79, -82, -82, Ascii.GS, 58, -45, -39, 111, -92, -61, 59, 122, 48, 57, -64, 45, 102, -60, -7, 81, 66, -92, 108, Ascii.CAN, Byte.MAX_VALUE, -102, -76, -102, -16, -114, -58, -49, -6, -90, -73, Ascii.FS, -102, -73, -76, 10, -14, Ascii.US, 102, -62, -66, -58, -74, -65, 113, -59, 114, 54, -112, 79, 53, -6, 104, SignedBytes.MAX_POWER_OF_TWO, 122, 70, 100, 125, 110}, new byte[]{-12, -57, Ascii.SO, Ascii.SYN, -18, -86, -59, -20, 81, -84, -122, -2, -65, 36, 9, 84, 57, -98, -58, -57, -26, -65, -121, -55, -45, 71, 62, 51, Ascii.EM, 122, -109, -55, 9, -110, -85, -59, 45, -126, 44, 55, 6, 71, 105, -125, 40, 74, 5, 4, 53, Ascii.ETB, 69, 76, -94, 60, 74, -13, -120, -122, 86, 77, 58, Ascii.DC4, -44, -109}, new byte[]{-101, Ascii.US, 91, 66, 77, -109, -55, -89, 3, -25, -86, 2, Ascii.FF, 110, 65, 65, 78, -73, -8, 113, -100, 54, -34, Ascii.RS, -119, -76, 68, 59, 77, -37, -60, -102, -12, -119, 43, -53, -110, -101, 6, -112, 105, -47, -115, 43, -47, -91, -60, 47, 54, -84, -62, 53, 89, 81, -88, -39, -92, Byte.MAX_VALUE, Ascii.CR, -44, -65, 2, -25, Ascii.RS}, new byte[]{55, -113, 90, 84, Ascii.SYN, 49, 34, -101, -108, 76, -102, -40, -20, Ascii.SYN, 95, -34, 58, 125, 58, Ascii.ESC, 37, -119, 66, 36, 60, -39, 85, -73, -32, Ascii.CR, 9, -124, Byte.MIN_VALUE, 10, 68, Ascii.VT, -37, -78, -50, -79, 123, 43, -118, -102, -90, 7, -100, 84, Ascii.SO, 56, -36, -110, -53, Ascii.US, 42, 96, 114, 97, 68, 81, -125, 35, 90, -37}, new byte[]{-85, -66, -34, -90, Byte.MIN_VALUE, 5, 111, 82, 56, 42, -27, 72, -78, -28, -13, -13, -119, 65, -25, Ascii.FS, -1, -118, 120, -37, Ascii.US, -1, -31, -118, Ascii.ESC, 51, 97, 3, -97, -25, 103, 2, -81, 105, 51, 75, 122, Ascii.RS, 108, 48, 59, 118, 82, -12, 54, -104, -6, -47, Ascii.NAK, 59, -74, -61, 116, -76, -57, -5, -104, 69, -100, -19}, new byte[]{123, -51, -98, -48, -17, -56, -119, -5, 48, 2, -58, -51, 99, 90, -2, -108, -40, -6, 107, -69, -21, -85, 7, 97, 32, 1, Byte.MIN_VALUE, 33, Ascii.DC4, -124, 102, 121, -118, Ascii.GS, 113, -17, -22, 72, -71, -54, -17, -70, -51, Ascii.GS, 125, 71, 110, -104, -34, -94, 89, 74, -64, 111, -40, 93, 107, -54, -92, -51, -127, -13, 45, Ascii.ESC}, new byte[]{55, -114, -25, 103, -15, Ascii.SYN, 49, -70, -46, 19, Byte.MIN_VALUE, -80, 4, 73, -79, 122, -51, -92, 60, 50, -68, -33, Ascii.GS, 119, -8, 32, Ascii.DC2, -44, 48, 33, -97, -101, 93, Byte.MIN_VALUE, -17, -99, Ascii.CAN, -111, -52, -122, -25, Ascii.GS, -92, -86, -120, -31, 40, 82, -6, -12, Ascii.ETB, -43, -39, -78, Ascii.ESC, -103, 72, -68, -110, 74, -15, Ascii.ESC, -41, 32}};
        private static final byte[] valueOf = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        private final byte[] Cardinal;
        private final byte[] cca_continue = new byte[64];
        private int cleanup;
        private final byte[] configure = new byte[64];
        private final byte[] getInstance = new byte[64];
        private final byte[] getSDKVersion;
        private final byte[] init = new byte[64];
        private final byte[] onCReqSuccess;
        private final byte[] onValidated;

        public MQVwithSHA384KDFAndSharedInfo(byte[] bArr) {
            byte[] bArr2 = new byte[64];
            this.Cardinal = bArr2;
            byte[] bArr3 = new byte[64];
            this.onValidated = bArr3;
            this.getSDKVersion = new byte[64];
            this.onCReqSuccess = new byte[64];
            this.cleanup = 64;
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            System.arraycopy(bArr, 0, bArr3, 0, 64);
        }

        private static void Cardinal(byte[] bArr) {
            long[][] jArr = CardinalRenderType;
            long[] jArr2 = jArr[0];
            long[] jArr3 = jArr[1];
            long[] jArr4 = jArr[2];
            long[] jArr5 = jArr[3];
            long j = (((jArr2[bArr[56] & 255] ^ 0) ^ jArr3[bArr[48] & 255]) ^ jArr4[bArr[40] & 255]) ^ jArr5[bArr[32] & 255];
            long[] jArr6 = jArr[4];
            long j2 = j ^ jArr6[bArr[24] & 255];
            long[] jArr7 = jArr[5];
            long j3 = j2 ^ jArr7[bArr[16] & 255];
            long[] jArr8 = jArr[6];
            long[] jArr9 = jArr[7];
            long j4 = (j3 ^ jArr8[bArr[8] & 255]) ^ jArr9[bArr[0] & 255];
            long j5 = (((((((jArr2[bArr[57] & 255] ^ 0) ^ jArr3[bArr[49] & 255]) ^ jArr4[bArr[41] & 255]) ^ jArr5[bArr[33] & 255]) ^ jArr6[bArr[25] & 255]) ^ jArr7[bArr[17] & 255]) ^ jArr8[bArr[9] & 255]) ^ jArr9[bArr[1] & 255];
            long j6 = (((((((jArr2[bArr[58] & 255] ^ 0) ^ jArr3[bArr[50] & 255]) ^ jArr4[bArr[42] & 255]) ^ jArr5[bArr[34] & 255]) ^ jArr6[bArr[26] & 255]) ^ jArr7[bArr[18] & 255]) ^ jArr8[bArr[10] & 255]) ^ jArr9[bArr[2] & 255];
            long[] jArr10 = jArr3;
            long j7 = (((((((jArr2[bArr[59] & 255] ^ 0) ^ jArr3[bArr[51] & 255]) ^ jArr4[bArr[43] & 255]) ^ jArr5[bArr[35] & 255]) ^ jArr6[bArr[27] & 255]) ^ jArr7[bArr[19] & 255]) ^ jArr8[bArr[11] & 255]) ^ jArr9[bArr[3] & 255];
            long j8 = (((((((jArr2[bArr[60] & 255] ^ 0) ^ jArr10[bArr[52] & 255]) ^ jArr4[bArr[44] & 255]) ^ jArr5[bArr[36] & 255]) ^ jArr6[bArr[28] & 255]) ^ jArr7[bArr[20] & 255]) ^ jArr8[bArr[12] & 255]) ^ jArr9[bArr[4] & 255];
            long j9 = (((((((jArr2[bArr[61] & 255] ^ 0) ^ jArr10[bArr[53] & 255]) ^ jArr4[bArr[45] & 255]) ^ jArr5[bArr[37] & 255]) ^ jArr6[bArr[29] & 255]) ^ jArr7[bArr[21] & 255]) ^ jArr8[bArr[13] & 255]) ^ jArr9[bArr[5] & 255];
            long j10 = (((((((jArr2[bArr[62] & 255] ^ 0) ^ jArr10[bArr[54] & 255]) ^ jArr4[bArr[46] & 255]) ^ jArr5[bArr[38] & 255]) ^ jArr6[bArr[30] & 255]) ^ jArr7[bArr[22] & 255]) ^ jArr8[bArr[14] & 255]) ^ jArr9[bArr[6] & 255];
            long j11 = (((((((jArr2[bArr[63] & 255] ^ 0) ^ jArr10[bArr[55] & 255]) ^ jArr4[bArr[47] & 255]) ^ jArr5[bArr[39] & 255]) ^ jArr6[bArr[31] & 255]) ^ jArr7[bArr[23] & 255]) ^ jArr8[bArr[15] & 255]) ^ jArr9[bArr[7] & 255];
            long j12 = j7;
            bArr[7] = (byte) ((int) (j4 >> 56));
            bArr[6] = (byte) ((int) (j4 >> 48));
            bArr[5] = (byte) ((int) (j4 >> 40));
            bArr[4] = (byte) ((int) (j4 >> 32));
            bArr[3] = (byte) ((int) (j4 >> 24));
            bArr[2] = (byte) ((int) (j4 >> 16));
            bArr[1] = (byte) ((int) (j4 >> 8));
            bArr[0] = (byte) ((int) j4);
            bArr[15] = (byte) ((int) (j5 >> 56));
            bArr[14] = (byte) ((int) (j5 >> 48));
            bArr[13] = (byte) ((int) (j5 >> 40));
            bArr[12] = (byte) ((int) (j5 >> 32));
            bArr[11] = (byte) ((int) (j5 >> 24));
            bArr[10] = (byte) ((int) (j5 >> 16));
            bArr[9] = (byte) ((int) (j5 >> 8));
            bArr[8] = (byte) ((int) j5);
            bArr[23] = (byte) ((int) (j6 >> 56));
            bArr[22] = (byte) ((int) (j6 >> 48));
            bArr[21] = (byte) ((int) (j6 >> 40));
            bArr[20] = (byte) ((int) (j6 >> 32));
            bArr[19] = (byte) ((int) (j6 >> 24));
            bArr[18] = (byte) ((int) (j6 >> 16));
            bArr[17] = (byte) ((int) (j6 >> 8));
            bArr[16] = (byte) ((int) j6);
            bArr[31] = (byte) ((int) (j12 >> 56));
            bArr[30] = (byte) ((int) (j12 >> 48));
            bArr[29] = (byte) ((int) (j12 >> 40));
            bArr[28] = (byte) ((int) (j12 >> 32));
            bArr[27] = (byte) ((int) (j12 >> 24));
            bArr[26] = (byte) ((int) (j12 >> 16));
            bArr[25] = (byte) ((int) (j12 >> 8));
            bArr[24] = (byte) ((int) j12);
            bArr[39] = (byte) ((int) (j8 >> 56));
            bArr[38] = (byte) ((int) (j8 >> 48));
            bArr[37] = (byte) ((int) (j8 >> 40));
            bArr[36] = (byte) ((int) (j8 >> 32));
            bArr[35] = (byte) ((int) (j8 >> 24));
            bArr[34] = (byte) ((int) (j8 >> 16));
            bArr[33] = (byte) ((int) (j8 >> 8));
            bArr[32] = (byte) ((int) j8);
            bArr[47] = (byte) ((int) (j9 >> 56));
            bArr[46] = (byte) ((int) (j9 >> 48));
            bArr[45] = (byte) ((int) (j9 >> 40));
            bArr[44] = (byte) ((int) (j9 >> 32));
            bArr[43] = (byte) ((int) (j9 >> 24));
            bArr[42] = (byte) ((int) (j9 >> 16));
            bArr[41] = (byte) ((int) (j9 >> 8));
            bArr[40] = (byte) ((int) j9);
            bArr[55] = (byte) ((int) (j10 >> 56));
            bArr[54] = (byte) ((int) (j10 >> 48));
            bArr[53] = (byte) ((int) (j10 >> 40));
            bArr[52] = (byte) ((int) (j10 >> 32));
            bArr[51] = (byte) ((int) (j10 >> 24));
            bArr[50] = (byte) ((int) (j10 >> 16));
            bArr[49] = (byte) ((int) (j10 >> 8));
            bArr[48] = (byte) ((int) j10);
            bArr[63] = (byte) ((int) (j11 >> 56));
            bArr[62] = (byte) ((int) (j11 >> 48));
            bArr[61] = (byte) ((int) (j11 >> 40));
            bArr[60] = (byte) ((int) (j11 >> 32));
            bArr[59] = (byte) ((int) (j11 >> 24));
            bArr[58] = (byte) ((int) (j11 >> 16));
            bArr[57] = (byte) ((int) (j11 >> 8));
            bArr[56] = (byte) ((int) j11);
        }

        private static void cca_continue(byte[] bArr, int i) {
            int i2 = (bArr[63] & 255) + (i & 255);
            bArr[63] = (byte) i2;
            int i3 = (bArr[62] & 255) + ((i >> 8) & 255) + (i2 >> 8);
            bArr[62] = (byte) i3;
            for (int i4 = 61; i4 >= 0 && i3 > 0; i4--) {
                i3 = (bArr[i4] & 255) + (i3 >> 8);
                bArr[i4] = (byte) i3;
            }
        }

        private static void init(byte[] bArr, byte[] bArr2) {
            int i = 0;
            for (int i2 = 63; i2 >= 0; i2--) {
                i = (i >> 8) + (bArr[i2] & 255) + (bArr2[i2] & 255);
                bArr[i2] = (byte) i;
            }
        }

        public final int cca_continue() {
            return 64;
        }

        public final void cca_continue(byte b) {
            byte[] bArr = this.onCReqSuccess;
            int i = this.cleanup - 1;
            this.cleanup = i;
            bArr[i] = b;
            if (i == 0) {
                Cardinal(this.onValidated, this.cca_continue, bArr);
                cca_continue(this.cca_continue, 512);
                init(this.getInstance, this.onCReqSuccess);
                this.cleanup = 64;
            }
        }

        public final void cca_continue(setBackgroundColor setbackgroundcolor) {
            MQVwithSHA384KDFAndSharedInfo mQVwithSHA384KDFAndSharedInfo = (MQVwithSHA384KDFAndSharedInfo) setbackgroundcolor;
            System.arraycopy(mQVwithSHA384KDFAndSharedInfo.Cardinal, 0, this.Cardinal, 0, 64);
            System.arraycopy(mQVwithSHA384KDFAndSharedInfo.cca_continue, 0, this.cca_continue, 0, 64);
            System.arraycopy(mQVwithSHA384KDFAndSharedInfo.getInstance, 0, this.getInstance, 0, 64);
            System.arraycopy(mQVwithSHA384KDFAndSharedInfo.configure, 0, this.configure, 0, 64);
            System.arraycopy(mQVwithSHA384KDFAndSharedInfo.init, 0, this.init, 0, 64);
            System.arraycopy(mQVwithSHA384KDFAndSharedInfo.onValidated, 0, this.onValidated, 0, 64);
            System.arraycopy(mQVwithSHA384KDFAndSharedInfo.onCReqSuccess, 0, this.onCReqSuccess, 0, 64);
            this.cleanup = mQVwithSHA384KDFAndSharedInfo.cleanup;
        }

        public final void init(byte[] bArr, int i, int i2) {
            while (this.cleanup != 64 && i2 > 0) {
                cca_continue(bArr[i]);
                i2--;
                i++;
            }
            while (i2 >= 64) {
                System.arraycopy(bArr, i, this.getSDKVersion, 0, 64);
                byte[] bArr2 = this.getSDKVersion;
                byte[] bArr3 = this.onCReqSuccess;
                int length = bArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    bArr3[(length - 1) - i3] = bArr2[i3];
                }
                Cardinal(this.onValidated, this.cca_continue, this.onCReqSuccess);
                cca_continue(this.cca_continue, 512);
                init(this.getInstance, this.onCReqSuccess);
                i2 -= 64;
                i += 64;
            }
            while (i2 > 0) {
                cca_continue(bArr[i]);
                i2--;
                i++;
            }
        }

        public int init(byte[] bArr, int i) {
            int i2;
            int i3 = 64 - this.cleanup;
            int i4 = 0;
            while (true) {
                i2 = 64 - i3;
                if (i4 == i2) {
                    break;
                }
                this.init[i4] = 0;
                i4++;
            }
            byte[] bArr2 = this.init;
            bArr2[63 - i3] = 1;
            int i5 = this.cleanup;
            if (i5 != 64) {
                System.arraycopy(this.onCReqSuccess, i5, bArr2, i2, i3);
            }
            Cardinal(this.onValidated, this.cca_continue, this.init);
            cca_continue(this.cca_continue, i3 << 3);
            init(this.getInstance, this.init);
            byte[] bArr3 = this.onValidated;
            byte[] bArr4 = valueOf;
            Cardinal(bArr3, bArr4, this.cca_continue);
            Cardinal(this.onValidated, bArr4, this.getInstance);
            byte[] bArr5 = this.onValidated;
            byte[] bArr6 = this.getSDKVersion;
            int length = bArr5.length;
            for (int i6 = 0; i6 < length; i6++) {
                bArr6[(length - 1) - i6] = bArr5[i6];
            }
            System.arraycopy(this.getSDKVersion, 0, bArr, i, 64);
            init();
            return 64;
        }

        public final void init() {
            this.cleanup = 64;
            byte[] bArr = this.cca_continue;
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = 0;
            }
            byte[] bArr2 = this.getInstance;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr2[i2] = 0;
            }
            System.arraycopy(this.Cardinal, 0, this.onValidated, 0, 64);
            byte[] bArr3 = this.onCReqSuccess;
            for (int i3 = 0; i3 < bArr3.length; i3++) {
                bArr3[i3] = 0;
            }
        }

        private void getInstance(byte[] bArr, byte[] bArr2) {
            System.arraycopy(bArr, 0, this.configure, 0, 64);
            for (int i = 0; i < 64; i++) {
                bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            Cardinal(bArr);
            for (int i2 = 0; i2 < 11; i2++) {
                byte[] bArr3 = this.configure;
                byte[] bArr4 = getWarnings[i2];
                for (int i3 = 0; i3 < 64; i3++) {
                    bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i3]);
                }
                Cardinal(this.configure);
                byte[] bArr5 = this.configure;
                for (int i4 = 0; i4 < 64; i4++) {
                    bArr[i4] = (byte) (bArr[i4] ^ bArr5[i4]);
                }
                Cardinal(bArr);
            }
            byte[] bArr6 = this.configure;
            byte[] bArr7 = getWarnings[11];
            for (int i5 = 0; i5 < 64; i5++) {
                bArr6[i5] = (byte) (bArr6[i5] ^ bArr7[i5]);
            }
            Cardinal(this.configure);
            byte[] bArr8 = this.configure;
            for (int i6 = 0; i6 < 64; i6++) {
                bArr[i6] = (byte) (bArr[i6] ^ bArr8[i6]);
            }
        }

        private void Cardinal(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            System.arraycopy(bArr, 0, this.getSDKVersion, 0, 64);
            for (int i = 0; i < 64; i++) {
                bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            Cardinal(bArr);
            getInstance(bArr, bArr3);
            byte[] bArr4 = this.getSDKVersion;
            for (int i2 = 0; i2 < 64; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr4[i2]);
            }
            for (int i3 = 0; i3 < 64; i3++) {
                bArr[i3] = (byte) (bArr[i3] ^ bArr3[i3]);
            }
        }
    }

    public abstract class MQVwithSHA512CKDF implements MQVwithSHA256KDF {
        public static Hashtable configure(Hashtable hashtable) {
            Hashtable hashtable2 = new Hashtable();
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                Object nextElement = keys.nextElement();
                hashtable2.put(nextElement, hashtable.get(nextElement));
            }
            return hashtable2;
        }

        public final int init(MQVwithSHA384KDF mQVwithSHA384KDF) {
            int length = mQVwithSHA384KDF.cca_continue.length;
            MQVwithSHA1CKDF[] mQVwithSHA1CKDFArr = new MQVwithSHA1CKDF[length];
            System.arraycopy(mQVwithSHA384KDF.cca_continue, 0, mQVwithSHA1CKDFArr, 0, length);
            int i = 0;
            for (int i2 = 0; i2 != length; i2++) {
                boolean z = true;
                if (mQVwithSHA1CKDFArr[i2].init.cca_continue.size() <= 1) {
                    z = false;
                }
                if (z) {
                    MQVwithSHA224KDF[] Cardinal = mQVwithSHA1CKDFArr[i2].Cardinal();
                    for (int i3 = 0; i3 != Cardinal.length; i3++) {
                        i = (i ^ Cardinal[i3].getInstance.hashCode()) ^ MQVwithSHA384CKDF.configure(MQVwithSHA384CKDF.init(Cardinal[i3].init)).hashCode();
                    }
                } else {
                    i = (i ^ mQVwithSHA1CKDFArr[i2].getInstance().getInstance.hashCode()) ^ MQVwithSHA384CKDF.configure(MQVwithSHA384CKDF.init(mQVwithSHA1CKDFArr[i2].getInstance().init)).hashCode();
                }
            }
            return i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0074 A[LOOP:0: B:10:0x0041->B:33:0x0074, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0073 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean Cardinal(com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA384KDF r11, com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA384KDF r12) {
            /*
                r10 = this;
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1CKDF[] r0 = r11.cca_continue
                int r0 = r0.length
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1CKDF[] r1 = new com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA1CKDF[r0]
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1CKDF[] r11 = r11.cca_continue
                r2 = 0
                java.lang.System.arraycopy(r11, r2, r1, r2, r0)
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1CKDF[] r11 = r12.cca_continue
                int r11 = r11.length
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1CKDF[] r3 = new com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA1CKDF[r11]
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA1CKDF[] r12 = r12.cca_continue
                java.lang.System.arraycopy(r12, r2, r3, r2, r11)
                if (r0 == r11) goto L_0x0018
                return r2
            L_0x0018:
                r12 = r1[r2]
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA224KDF r12 = r12.getInstance()
                r4 = 1
                if (r12 == 0) goto L_0x003f
                r12 = r3[r2]
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA224KDF r12 = r12.getInstance()
                if (r12 == 0) goto L_0x003f
                r12 = r1[r2]
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA224KDF r12 = r12.getInstance()
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r12 = r12.getInstance
                r5 = r3[r2]
                com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA224KDF r5 = r5.getInstance()
                com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier r5 = r5.getInstance
                boolean r12 = r12.equals(r5)
                r12 = r12 ^ r4
                goto L_0x0040
            L_0x003f:
                r12 = r2
            L_0x0040:
                r5 = r2
            L_0x0041:
                if (r5 == r0) goto L_0x0077
                r6 = r1[r5]
                r7 = 0
                if (r12 == 0) goto L_0x005c
                int r8 = r11 + -1
            L_0x004a:
                if (r8 < 0) goto L_0x0070
                r9 = r3[r8]
                if (r9 == 0) goto L_0x0059
                boolean r9 = com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA384CKDF.Cardinal(r6, r9)
                if (r9 == 0) goto L_0x0059
                r3[r8] = r7
                goto L_0x006b
            L_0x0059:
                int r8 = r8 + -1
                goto L_0x004a
            L_0x005c:
                r8 = r2
            L_0x005d:
                if (r8 == r11) goto L_0x0070
                r9 = r3[r8]
                if (r9 == 0) goto L_0x006d
                boolean r9 = com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA384CKDF.Cardinal(r6, r9)
                if (r9 == 0) goto L_0x006d
                r3[r8] = r7
            L_0x006b:
                r6 = r4
                goto L_0x0071
            L_0x006d:
                int r8 = r8 + 1
                goto L_0x005d
            L_0x0070:
                r6 = r2
            L_0x0071:
                if (r6 != 0) goto L_0x0074
                return r2
            L_0x0074:
                int r5 = r5 + 1
                goto L_0x0041
            L_0x0077:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.MQVwithSHA512CKDF.Cardinal(com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA384KDF, com.cardinalcommerce.a.KeyAgreementSpi$MQVwithSHA384KDF):boolean");
        }
    }

    public final class MQVwithSHA512KDF extends setRenderType {
        private BigInteger cca_continue;

        public MQVwithSHA512KDF(BigInteger bigInteger) {
            this.cca_continue = bigInteger;
        }

        public final getThreeDSRequestorAppURL onCReqSuccess() {
            return new setEnvironment(this.cca_continue);
        }

        public final String toString() {
            return new StringBuilder("CRLNumber: ").append(this.cca_continue).toString();
        }
    }

    public final class X25519 extends GMCipherSpi.SM2withSha1 {
        private BCXDHPrivateKey getInstance;

        public X25519(GMCipherSpi.SM2withSha256 sM2withSha256) {
            this(sM2withSha256, new BCEdDSAPrivateKey());
        }

        private X25519(GMCipherSpi.SM2withSha256 sM2withSha256, BCXDHPrivateKey bCXDHPrivateKey) {
            this.init = sM2withSha256;
            this.getInstance = bCXDHPrivateKey;
            this.cca_continue = new byte[sM2withSha256.getInstance()];
            this.Cardinal = 0;
        }

        public final int cca_continue(int i) {
            int i2 = i + this.Cardinal;
            int length = i2 % this.cca_continue.length;
            return length == 0 ? Math.max(0, i2 - this.cca_continue.length) : i2 - length;
        }

        public final int configure(byte[] bArr, int i) throws GMSignatureSpi, IllegalStateException, AnonymousClass1 {
            int init;
            int i2;
            int instance = this.init.getInstance();
            if (this.configure) {
                if (this.Cardinal != instance) {
                    i2 = 0;
                } else if ((instance * 2) + i <= bArr.length) {
                    i2 = this.init.Cardinal(this.cca_continue, 0, bArr, i);
                    this.Cardinal = 0;
                } else {
                    getInstance();
                    throw new CDHwithSHA224KDFAndSharedInfo("output buffer too short");
                }
                this.getInstance.Cardinal(this.cca_continue, this.Cardinal);
                init = i2 + this.init.Cardinal(this.cca_continue, 0, bArr, i + i2);
            } else if (this.Cardinal == instance) {
                int Cardinal = this.init.Cardinal(this.cca_continue, 0, this.cca_continue, 0);
                this.Cardinal = 0;
                try {
                    init = Cardinal - this.getInstance.init(this.cca_continue);
                    System.arraycopy(this.cca_continue, 0, bArr, i, init);
                } catch (Throwable th) {
                    getInstance();
                    throw th;
                }
            } else {
                getInstance();
                throw new GMSignatureSpi("last block incomplete in decryption");
            }
            getInstance();
            return init;
        }

        public final int init(int i) {
            int length;
            int i2 = i + this.Cardinal;
            int length2 = i2 % this.cca_continue.length;
            if (length2 != 0) {
                i2 -= length2;
                length = this.cca_continue.length;
            } else if (!this.configure) {
                return i2;
            } else {
                length = this.cca_continue.length;
            }
            return i2 + length;
        }

        public final int init(byte[] bArr, int i, int i2, byte[] bArr2) throws GMSignatureSpi, IllegalStateException {
            if (i2 >= 0) {
                int Cardinal = Cardinal();
                int cca_continue = cca_continue(i2);
                if (cca_continue <= 0 || cca_continue <= bArr2.length) {
                    int length = this.cca_continue.length - this.Cardinal;
                    int i3 = 0;
                    if (i2 > length) {
                        System.arraycopy(bArr, i, this.cca_continue, this.Cardinal, length);
                        this.Cardinal = 0;
                        i2 -= length;
                        i += length;
                        i3 = this.init.Cardinal(this.cca_continue, 0, bArr2, 0) + 0;
                        while (i2 > this.cca_continue.length) {
                            i3 += this.init.Cardinal(bArr, i, bArr2, i3);
                            i2 -= Cardinal;
                            i += Cardinal;
                        }
                    }
                    System.arraycopy(bArr, i, this.cca_continue, this.Cardinal, i2);
                    this.Cardinal += i2;
                    return i3;
                }
                throw new CDHwithSHA224KDFAndSharedInfo("output buffer too short");
            }
            throw new IllegalArgumentException("Can't have a negative input length!");
        }

        public final void getInstance(boolean z, GMCipherSpi.SM2withRMD sM2withRMD) throws IllegalArgumentException {
            GMCipherSpi.SM2withSha256 sM2withSha256;
            this.configure = z;
            getInstance();
            if (sM2withRMD instanceof DigestSignatureSpi.RIPEMD128) {
                DigestSignatureSpi.RIPEMD128 ripemd128 = (DigestSignatureSpi.RIPEMD128) sM2withRMD;
                SecureRandom secureRandom = ripemd128.Cardinal;
                sM2withSha256 = this.init;
                sM2withRMD = ripemd128.cca_continue;
            } else {
                sM2withSha256 = this.init;
            }
            sM2withSha256.getInstance(z, sM2withRMD);
        }
    }

    public final class X25519UwithSHA256CKDF extends BCXDHPublicKey {
        public BigInteger configure;

        public X25519UwithSHA256CKDF(BigInteger bigInteger, X25519withSHA256CKDF x25519withSHA256CKDF) {
            super(true, x25519withSHA256CKDF);
            this.configure = bigInteger;
        }

        public final int hashCode() {
            return this.configure.hashCode() ^ super.hashCode();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof X25519UwithSHA256CKDF) && ((X25519UwithSHA256CKDF) obj).configure.equals(this.configure) && super.equals(obj);
        }
    }

    public class X25519withSHA256CKDF implements GMCipherSpi.SM2withRMD {
        public BigInteger Cardinal;
        public int cca_continue;
        public BigInteger configure;
        public BigInteger getInstance;
        public int getWarnings;
        public BigInteger init;
        public X448UwithSHA512CKDF onValidated;

        public X25519withSHA256CKDF(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, bigInteger2, (BigInteger) null, 0);
        }

        public X25519withSHA256CKDF(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, X448UwithSHA512CKDF x448UwithSHA512CKDF) {
            if (i2 != 0) {
                if (i2 > bigInteger.bitLength()) {
                    throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
                } else if (i2 < i) {
                    throw new IllegalArgumentException("when l value specified, it may not be less than m value");
                }
            }
            if (i <= bigInteger.bitLength()) {
                this.init = bigInteger2;
                this.Cardinal = bigInteger;
                this.getInstance = bigInteger3;
                this.cca_continue = i;
                this.getWarnings = i2;
                this.configure = bigInteger4;
                this.onValidated = x448UwithSHA512CKDF;
                return;
            }
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }

        public X25519withSHA256CKDF(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, X448UwithSHA512CKDF x448UwithSHA512CKDF) {
            this(bigInteger, bigInteger2, bigInteger3, Opcodes.IF_ICMPNE, 0, bigInteger4, x448UwithSHA512CKDF);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public X25519withSHA256CKDF(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
            this(bigInteger, bigInteger2, bigInteger3, (i == 0 || i >= 160) ? 160 : i, i, (BigInteger) null, (X448UwithSHA512CKDF) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof X25519withSHA256CKDF)) {
                return false;
            }
            X25519withSHA256CKDF x25519withSHA256CKDF = (X25519withSHA256CKDF) obj;
            BigInteger bigInteger = this.getInstance;
            if (bigInteger != null) {
                if (!bigInteger.equals(x25519withSHA256CKDF.getInstance)) {
                    return false;
                }
            } else if (x25519withSHA256CKDF.getInstance != null) {
                return false;
            }
            if (!x25519withSHA256CKDF.Cardinal.equals(this.Cardinal) || !x25519withSHA256CKDF.init.equals(this.init)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.Cardinal.hashCode() ^ this.init.hashCode();
            BigInteger bigInteger = this.getInstance;
            return hashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
        }
    }

    public final class X25519withSHA256KDF extends BCXDHPublicKey {
        private static final BigInteger configure = BigInteger.valueOf(2);
        private static final BigInteger getInstance = BigInteger.valueOf(1);
        public BigInteger init;

        public final int hashCode() {
            return this.init.hashCode() ^ super.hashCode();
        }

        public X25519withSHA256KDF(BigInteger bigInteger, X25519withSHA256CKDF x25519withSHA256CKDF) {
            super(false, x25519withSHA256CKDF);
            if (bigInteger != null) {
                BigInteger bigInteger2 = configure;
                if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(x25519withSHA256CKDF.Cardinal.subtract(bigInteger2)) > 0) {
                    throw new IllegalArgumentException("invalid DH public key");
                } else if (x25519withSHA256CKDF.getInstance == null || getInstance.equals(bigInteger.modPow(x25519withSHA256CKDF.getInstance, x25519withSHA256CKDF.Cardinal))) {
                    this.init = bigInteger;
                } else {
                    throw new IllegalArgumentException("Y value does not appear to be in correct group");
                }
            } else {
                throw new NullPointerException("y value cannot be null");
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof X25519withSHA256KDF) && ((X25519withSHA256KDF) obj).init.equals(this.init) && super.equals(obj);
        }
    }

    public final class X25519withSHA384CKDF implements GMCipherSpi.SM2withRMD {
        private X25519withSHA256KDF Cardinal;
        public X25519UwithSHA256CKDF configure;
        public X25519UwithSHA256CKDF init;

        public X25519withSHA384CKDF(X25519UwithSHA256CKDF x25519UwithSHA256CKDF, X25519UwithSHA256CKDF x25519UwithSHA256CKDF2) {
            this(x25519UwithSHA256CKDF, x25519UwithSHA256CKDF2, (X25519withSHA256KDF) null);
        }

        public X25519withSHA384CKDF(X25519UwithSHA256CKDF x25519UwithSHA256CKDF, X25519UwithSHA256CKDF x25519UwithSHA256CKDF2, X25519withSHA256KDF x25519withSHA256KDF) {
            if (x25519UwithSHA256CKDF == null) {
                throw new NullPointerException("staticPrivateKey cannot be null");
            } else if (x25519UwithSHA256CKDF2 != null) {
                X25519withSHA256CKDF x25519withSHA256CKDF = x25519UwithSHA256CKDF.Cardinal;
                if (x25519withSHA256CKDF.equals(x25519UwithSHA256CKDF2.Cardinal)) {
                    if (x25519withSHA256KDF == null) {
                        x25519withSHA256KDF = new X25519withSHA256KDF(x25519withSHA256CKDF.init.modPow(x25519UwithSHA256CKDF2.configure, x25519withSHA256CKDF.Cardinal), x25519withSHA256CKDF);
                    } else if (!x25519withSHA256CKDF.equals(x25519withSHA256KDF.Cardinal)) {
                        throw new IllegalArgumentException("ephemeral public key has different domain parameters");
                    }
                    this.init = x25519UwithSHA256CKDF;
                    this.configure = x25519UwithSHA256CKDF2;
                    this.Cardinal = x25519withSHA256KDF;
                    return;
                }
                throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
            } else {
                throw new NullPointerException("ephemeralPrivateKey cannot be null");
            }
        }
    }

    public final class X25519withSHA512CKDF extends appendElement {
        public X448withSHA256CKDF cca_continue;

        public X25519withSHA512CKDF(SecureRandom secureRandom, X448withSHA256CKDF x448withSHA256CKDF) {
            super(secureRandom, x448withSHA256CKDF.configure.bitLength() - 1);
            this.cca_continue = x448withSHA256CKDF;
        }
    }

    public final class X448 implements GMCipherSpi.SM2withRMD {
        public X25519withSHA256KDF configure;
        public X25519withSHA256KDF init;

        public X448(X25519withSHA256KDF x25519withSHA256KDF, X25519withSHA256KDF x25519withSHA256KDF2) {
            if (x25519withSHA256KDF == null) {
                throw new NullPointerException("staticPublicKey cannot be null");
            } else if (x25519withSHA256KDF2 == null) {
                throw new NullPointerException("ephemeralPublicKey cannot be null");
            } else if (x25519withSHA256KDF.Cardinal.equals(x25519withSHA256KDF2.Cardinal)) {
                this.init = x25519withSHA256KDF;
                this.configure = x25519withSHA256KDF2;
            } else {
                throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
            }
        }
    }

    public final class X448UwithSHA512CKDF {
        public int configure;
        public byte[] init;

        public final boolean equals(Object obj) {
            if (!(obj instanceof X448UwithSHA512CKDF)) {
                return false;
            }
            X448UwithSHA512CKDF x448UwithSHA512CKDF = (X448UwithSHA512CKDF) obj;
            if (x448UwithSHA512CKDF.configure != this.configure) {
                return false;
            }
            return getBackgroundColor.Cardinal(this.init, x448UwithSHA512CKDF.init);
        }

        public final int hashCode() {
            return this.configure ^ getBackgroundColor.init(this.init);
        }

        public X448UwithSHA512CKDF(byte[] bArr, int i) {
            byte[] bArr2;
            if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.init = bArr2;
            this.configure = i;
        }
    }

    public class X448withSHA256CKDF implements GMCipherSpi.SM2withRMD {
        public BigInteger Cardinal;
        public KeyFactorySpi.ED25519 cca_continue;
        public BigInteger configure;
        public BigInteger init;

        public X448withSHA256CKDF(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.Cardinal = bigInteger3;
            this.configure = bigInteger;
            this.init = bigInteger2;
        }

        public X448withSHA256CKDF(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, KeyFactorySpi.ED25519 ed25519) {
            this.Cardinal = bigInteger3;
            this.configure = bigInteger;
            this.init = bigInteger2;
            this.cca_continue = ed25519;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof X448withSHA256CKDF)) {
                return false;
            }
            X448withSHA256CKDF x448withSHA256CKDF = (X448withSHA256CKDF) obj;
            if (!x448withSHA256CKDF.configure.equals(this.configure) || !x448withSHA256CKDF.init.equals(this.init) || !x448withSHA256CKDF.Cardinal.equals(this.Cardinal)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.configure.hashCode() ^ this.init.hashCode()) ^ this.Cardinal.hashCode();
        }
    }

    public final class X448withSHA512CKDF extends X448withSHA512KDF {
        private static final BigInteger Cardinal = BigInteger.valueOf(1);
        private static final BigInteger getInstance = BigInteger.valueOf(2);
        public BigInteger init;

        public X448withSHA512CKDF(BigInteger bigInteger, X448withSHA256CKDF x448withSHA256CKDF) {
            super(false, x448withSHA256CKDF);
            if (x448withSHA256CKDF != null) {
                BigInteger bigInteger2 = getInstance;
                if (bigInteger2.compareTo(bigInteger) > 0 || x448withSHA256CKDF.configure.subtract(bigInteger2).compareTo(bigInteger) < 0 || !Cardinal.equals(bigInteger.modPow(x448withSHA256CKDF.init, x448withSHA256CKDF.configure))) {
                    throw new IllegalArgumentException("y value does not appear to be in correct group");
                }
            }
            this.init = bigInteger;
        }
    }

    public final class XDH extends KeyFactorySpi.EDDSA {
        private final byte[] onCReqSuccess;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public XDH(com.cardinalcommerce.a.KeyFactorySpi.EDDSA r9, byte[] r10) {
            /*
                r8 = this;
                com.cardinalcommerce.a.toJSONString r1 = r9.cca_continue
                com.cardinalcommerce.a.JSONNavi r2 = r9.init
                java.math.BigInteger r3 = r9.getInstance
                java.math.BigInteger r4 = r9.Cardinal
                byte[] r9 = r9.configure
                r6 = 0
                r7 = 0
                if (r9 != 0) goto L_0x0010
                r5 = r6
                goto L_0x0018
            L_0x0010:
                int r0 = r9.length
                byte[] r0 = new byte[r0]
                int r5 = r9.length
                java.lang.System.arraycopy(r9, r7, r0, r7, r5)
                r5 = r0
            L_0x0018:
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                if (r10 != 0) goto L_0x001f
                goto L_0x0026
            L_0x001f:
                int r9 = r10.length
                byte[] r6 = new byte[r9]
                int r9 = r10.length
                java.lang.System.arraycopy(r10, r7, r6, r7, r9)
            L_0x0026:
                r8.onCReqSuccess = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.XDH.<init>(com.cardinalcommerce.a.KeyFactorySpi$EDDSA, byte[]):void");
        }
    }

    public final class ECKAEGwithRIPEMD160KDF implements CDHwithSHA512KDFAndSharedInfo {
        private DigestSignatureSpi.RIPEMD160 Cardinal;

        public final int getInstance() {
            return 32;
        }

        public final void init(GMCipherSpi.SM2withRMD sM2withRMD) {
            this.Cardinal = (DigestSignatureSpi.RIPEMD160) sM2withRMD;
        }

        public final void init(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr, int i) {
            byte[] bArr2 = bArr;
            int i2 = i;
            DigestSignatureSpi.RIPEMD160 ripemd160 = this.Cardinal;
            byte[] bArr3 = new byte[32];
            System.arraycopy(((DigestSignatureSpi.SHA3_224) sM2withRMD).getInstance, 0, bArr3, 0, 32);
            byte[] bArr4 = ripemd160.getInstance;
            int[] iArr = new int[8];
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = (i3 << 2) + 0;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                iArr[i3] = (bArr4[i6 + 1] << Ascii.CAN) | (bArr4[i4] & 255) | ((bArr4[i5] & 255) << 8) | ((bArr4[i6] & 255) << Ascii.DLE);
            }
            iArr[0] = iArr[0] & -8;
            int i7 = iArr[7] & Integer.MAX_VALUE;
            iArr[7] = i7;
            iArr[7] = i7 | 1073741824;
            int[] configure = DeflateHelper.configure();
            DeflateHelper.cca_continue(bArr3, 0, configure);
            int[] configure2 = DeflateHelper.configure();
            DeflateHelper.init(configure, configure2, 0);
            int[] configure3 = DeflateHelper.configure();
            configure3[0] = 1;
            int[] configure4 = DeflateHelper.configure();
            configure4[0] = 1;
            int[] configure5 = DeflateHelper.configure();
            int[] configure6 = DeflateHelper.configure();
            int[] configure7 = DeflateHelper.configure();
            int i8 = 254;
            int i9 = 1;
            while (true) {
                DeflateHelper.init(configure4, configure5, configure6, configure4);
                DeflateHelper.init(configure2, configure3, configure5, configure2);
                DeflateHelper.getInstance(configure6, configure2, configure6);
                DeflateHelper.getInstance(configure4, configure5, configure4);
                DeflateHelper.Cardinal(configure5, configure5);
                DeflateHelper.Cardinal(configure2, configure2);
                DeflateHelper.configure(configure5, configure2, configure7);
                DeflateHelper.getInstance(configure7, configure3);
                DeflateHelper.cca_continue(configure3, configure2, configure3);
                DeflateHelper.getInstance(configure3, configure7, configure3);
                DeflateHelper.getInstance(configure2, configure5, configure2);
                DeflateHelper.init(configure6, configure4, configure4, configure5);
                DeflateHelper.Cardinal(configure4, configure4);
                DeflateHelper.Cardinal(configure5, configure5);
                DeflateHelper.getInstance(configure5, configure, configure5);
                i8--;
                int i10 = (iArr[i8 >>> 5] >>> (i8 & 31)) & 1;
                int i11 = i9 ^ i10;
                DeflateHelper.Cardinal(i11, configure2, configure4);
                DeflateHelper.Cardinal(i11, configure3, configure5);
                if (i8 < 3) {
                    break;
                }
                i9 = i10;
            }
            for (int i12 = 0; i12 < 3; i12++) {
                int[] configure8 = DeflateHelper.configure();
                int[] configure9 = DeflateHelper.configure();
                DeflateHelper.init(configure2, configure3, configure8, configure9);
                DeflateHelper.Cardinal(configure8, configure8);
                DeflateHelper.Cardinal(configure9, configure9);
                DeflateHelper.getInstance(configure8, configure9, configure2);
                DeflateHelper.configure(configure8, configure9, configure8);
                DeflateHelper.getInstance(configure8, configure3);
                DeflateHelper.cca_continue(configure3, configure9, configure3);
                DeflateHelper.getInstance(configure3, configure8, configure3);
            }
            DeflateHelper.cca_continue(configure3, configure3);
            DeflateHelper.getInstance(configure2, configure3, configure2);
            DeflateHelper.configure(configure2);
            DeflateHelper.init(configure2, bArr2, i2);
            if (!(!getBackgroundColor.configure(bArr2, i2, 32))) {
                throw new IllegalStateException("X25519 agreement failed");
            }
        }
    }

    public final class ECKAEGwithSHA224KDF implements CDHwithSHA512KDFAndSharedInfo {
        private DigestSignatureSpi.SHA3_384 init;

        public final int getInstance() {
            return 56;
        }

        public final void init(GMCipherSpi.SM2withRMD sM2withRMD) {
            this.init = (DigestSignatureSpi.SHA3_384) sM2withRMD;
        }

        public final void init(GMCipherSpi.SM2withRMD sM2withRMD, byte[] bArr, int i) {
            byte[] bArr2 = bArr;
            int i2 = i;
            DigestSignatureSpi.SHA3_384 sha3_384 = this.init;
            byte[] bArr3 = new byte[56];
            int i3 = 0;
            System.arraycopy(((DigestSignatureSpi.SHA3_512) sM2withRMD).Cardinal, 0, bArr3, 0, 56);
            byte[] bArr4 = sha3_384.cca_continue;
            int[] iArr = new int[14];
            for (int i4 = 0; i4 < 14; i4++) {
                int i5 = (i4 << 2) + 0;
                int i6 = i5 + 1;
                byte b = (bArr4[i5] & 255) | ((bArr4[i6] & 255) << 8);
                int i7 = i6 + 1;
                iArr[i4] = ((bArr4[i7] & 255) << Ascii.DLE) | b | (bArr4[i7 + 1] << Ascii.CAN);
            }
            iArr[0] = iArr[0] & -4;
            iArr[13] = iArr[13] | Integer.MIN_VALUE;
            int[] iArr2 = new int[16];
            MQVwithSHA224CKDF.Cardinal(bArr3, 0, iArr2);
            int[] iArr3 = new int[16];
            for (int i8 = 0; i8 < 16; i8++) {
                iArr3[i8 + 0] = iArr2[i8];
            }
            int[] iArr4 = new int[16];
            iArr4[0] = 1;
            int[] iArr5 = new int[16];
            iArr5[0] = 1;
            int[] iArr6 = new int[16];
            int[] iArr7 = new int[16];
            int[] iArr8 = new int[16];
            int i9 = 447;
            int i10 = 1;
            while (true) {
                if (i3 < 16) {
                    iArr7[i3] = iArr5[i3] + iArr6[i3];
                    i3++;
                } else {
                    MQVwithSHA224CKDF.cca_continue(iArr5, iArr6, iArr5);
                    for (int i11 = 0; i11 < 16; i11++) {
                        iArr6[i11] = iArr3[i11] + iArr4[i11];
                    }
                    MQVwithSHA224CKDF.cca_continue(iArr3, iArr4, iArr3);
                    MQVwithSHA224CKDF.Cardinal(iArr7, iArr3, iArr7);
                    MQVwithSHA224CKDF.Cardinal(iArr5, iArr6, iArr5);
                    MQVwithSHA224CKDF.configure(iArr6, iArr6);
                    MQVwithSHA224CKDF.configure(iArr3, iArr3);
                    MQVwithSHA224CKDF.cca_continue(iArr6, iArr3, iArr8);
                    MQVwithSHA224CKDF.configure(iArr8, 39082, iArr4);
                    for (int i12 = 0; i12 < 16; i12++) {
                        iArr4[i12] = iArr4[i12] + iArr3[i12];
                    }
                    MQVwithSHA224CKDF.Cardinal(iArr4, iArr8, iArr4);
                    MQVwithSHA224CKDF.Cardinal(iArr3, iArr6, iArr3);
                    MQVwithSHA224CKDF.cca_continue(iArr7, iArr5, iArr6);
                    for (int i13 = 0; i13 < 16; i13++) {
                        iArr5[i13] = iArr7[i13] + iArr5[i13];
                    }
                    MQVwithSHA224CKDF.configure(iArr5, iArr5);
                    MQVwithSHA224CKDF.configure(iArr6, iArr6);
                    MQVwithSHA224CKDF.Cardinal(iArr6, iArr2, iArr6);
                    i9--;
                    int i14 = (iArr[i9 >>> 5] >>> (i9 & 31)) & 1;
                    int i15 = i10 ^ i14;
                    MQVwithSHA224CKDF.init(i15, iArr3, iArr5);
                    MQVwithSHA224CKDF.init(i15, iArr4, iArr6);
                    if (i9 < 2) {
                        break;
                    }
                    i10 = i14;
                    i3 = 0;
                }
            }
            for (int i16 = 0; i16 < 2; i16++) {
                int[] iArr9 = new int[16];
                int[] iArr10 = new int[16];
                for (int i17 = 0; i17 < 16; i17++) {
                    iArr9[i17] = iArr3[i17] + iArr4[i17];
                }
                MQVwithSHA224CKDF.cca_continue(iArr3, iArr4, iArr10);
                MQVwithSHA224CKDF.configure(iArr9, iArr9);
                MQVwithSHA224CKDF.configure(iArr10, iArr10);
                MQVwithSHA224CKDF.Cardinal(iArr9, iArr10, iArr3);
                MQVwithSHA224CKDF.cca_continue(iArr9, iArr10, iArr9);
                MQVwithSHA224CKDF.configure(iArr9, 39082, iArr4);
                for (int i18 = 0; i18 < 16; i18++) {
                    iArr4[i18] = iArr4[i18] + iArr10[i18];
                }
                MQVwithSHA224CKDF.Cardinal(iArr4, iArr9, iArr4);
            }
            MQVwithSHA224CKDF.init(iArr4, iArr4);
            MQVwithSHA224CKDF.Cardinal(iArr3, iArr4, iArr3);
            MQVwithSHA224CKDF.cca_continue(iArr3, 1);
            MQVwithSHA224CKDF.cca_continue(iArr3, -1);
            MQVwithSHA224CKDF.cca_continue(iArr3, bArr2, i2);
            if (!(!getBackgroundColor.configure(bArr2, i2, 56))) {
                throw new IllegalStateException("X448 agreement failed");
            }
        }
    }

    public abstract class ECVKO512 {
        public static void Cardinal(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
            int i3 = 0;
            do {
                bArr3[i2 + i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
                int i4 = i3 + 1;
                bArr3[i2 + i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
                int i5 = i4 + 1;
                bArr3[i2 + i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
                int i6 = i5 + 1;
                bArr3[i2 + i6] = (byte) (bArr[i6] ^ bArr2[i + i6]);
                i3 = i6 + 1;
            } while (i3 < 16);
        }

        public static void cca_continue(byte[] bArr, byte[] bArr2) {
            int i = 0;
            do {
                bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
                int i2 = i + 1;
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
                int i3 = i2 + 1;
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
                int i4 = i3 + 1;
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
                i = i4 + 1;
            } while (i < 16);
        }

        public static void configure(long[] jArr, long[] jArr2) {
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr2[0];
            long j4 = jArr2[1];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            for (int i = 0; i < 64; i++) {
                long j8 = j >> 63;
                j <<= 1;
                j5 ^= j3 & j8;
                long j9 = j7 ^ (j4 & j8);
                long j10 = j2 >> 63;
                j2 <<= 1;
                j7 = j9 ^ (j3 & j10);
                j6 ^= j4 & j10;
                j4 = (j4 >>> 1) | (j3 << 63);
                j3 = (j3 >>> 1) ^ (((j4 << 63) >> 8) & -2233785415175766016L);
            }
            jArr[0] = ((((j6 >>> 1) ^ j6) ^ (j6 >>> 2)) ^ (j6 >>> 7)) ^ j5;
            jArr[1] = (((j6 << 63) ^ (j6 << 62)) ^ (j6 << 57)) ^ j7;
        }

        public static void init(byte[] bArr, byte[] bArr2, int i) {
            int i2 = 0;
            do {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
                int i3 = i2 + 1;
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
                int i4 = i3 + 1;
                bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
                int i5 = i4 + 1;
                bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
                i2 = i5 + 1;
            } while (i2 < 16);
        }

        public static long[] init(byte[] bArr) {
            long[] jArr = new long[2];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                jArr[i2] = (((long) setTextFontSize.getInstance(bArr, i + 4)) & 4294967295L) | ((((long) setTextFontSize.getInstance(bArr, i)) & 4294967295L) << 32);
                i += 8;
            }
            return jArr;
        }
    }

    public final class X25519UwithSHA256KDF extends appendElement {
        public X25519withSHA256CKDF getInstance;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public X25519UwithSHA256KDF(java.security.SecureRandom r2, com.cardinalcommerce.a.KeyAgreementSpi.X25519withSHA256CKDF r3) {
            /*
                r1 = this;
                int r0 = r3.getWarnings
                if (r0 == 0) goto L_0x0007
                int r0 = r3.getWarnings
                goto L_0x000d
            L_0x0007:
                java.math.BigInteger r0 = r3.Cardinal
                int r0 = r0.bitLength()
            L_0x000d:
                r1.<init>(r2, r0)
                r1.getInstance = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.a.KeyAgreementSpi.X25519UwithSHA256KDF.<init>(java.security.SecureRandom, com.cardinalcommerce.a.KeyAgreementSpi$X25519withSHA256CKDF):void");
        }
    }
}
