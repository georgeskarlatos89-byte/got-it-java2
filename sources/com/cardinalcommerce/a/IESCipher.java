package com.cardinalcommerce.a;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomMasterTable;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;

public interface IESCipher {
    public static final ASN1ObjectIdentifier Cardinal;
    public static final ASN1ObjectIdentifier cca_continue;
    public static final ASN1ObjectIdentifier configure;
    public static final ASN1ObjectIdentifier getInstance;
    public static final ASN1ObjectIdentifier init;

    /* renamed from: com.cardinalcommerce.a.IESCipher$1  reason: invalid class name */
    public interface AnonymousClass1 {
        public static final ASN1ObjectIdentifier Cardinal = new ASN1ObjectIdentifier("1.2.392.200011.61.1.1.3.2");
        public static final ASN1ObjectIdentifier cca_continue = new ASN1ObjectIdentifier("1.2.392.200011.61.1.1.1.4");
        public static final ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("1.2.392.200011.61.1.1.1.2");
        public static final ASN1ObjectIdentifier getInstance = new ASN1ObjectIdentifier("1.2.392.200011.61.1.1.1.3");
        public static final ASN1ObjectIdentifier init = new ASN1ObjectIdentifier("1.2.392.200011.61.1.1.3.3");
        public static final ASN1ObjectIdentifier onValidated = new ASN1ObjectIdentifier("1.2.392.200011.61.1.1.3.4");
    }

    public interface ECIES {
        byte[] init(setCCAImageUri setccaimageuri);
    }

    public interface ECIESwithAESCBC {
        void cca_continue(byte b);

        String configure();

        int getInstance();

        int init(byte[] bArr, int i);

        void init();

        void init(byte[] bArr, int i, int i2);
    }

    public interface ECIESwithCipher {
        setCCAImageUri getInstance(InputStream inputStream) throws IOException;
    }

    public interface ECIESwithDESedeCBC extends ECIESwithAESCBC {
        int cca_continue();
    }

    public final class IESwithAESCBC extends isEnabledHostedFields {
        public IESwithAESCBC(isEnabledHostedFields isenabledhostedfields) {
            super(isenabledhostedfields.cca_continue());
        }

        public final String toString() {
            return new StringBuilder("VerisignCzagExtension: ").append(cca_continue()).toString();
        }
    }

    public final class IES {
        private static Hashtable Cardinal = new Hashtable();
        private static Hashtable init = new Hashtable();

        public static ASN1ObjectIdentifier cca_continue(String str) {
            return (ASN1ObjectIdentifier) init.get(getTextFontSize.cca_continue(str));
        }

        public static String getInstance(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            return (String) Cardinal.get(aSN1ObjectIdentifier);
        }

        public static Enumeration init() {
            return init.keys();
        }

        public static GMCipherSpi configure(String str) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) init.get(getTextFontSize.cca_continue(str));
            if (aSN1ObjectIdentifier != null) {
                return KeyAgreementSpi.DHwithSHA224KDF.configure(aSN1ObjectIdentifier);
            }
            return null;
        }

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = KeyAgreementSpi.DHwithRFC2631KDF.setUiType;
            init.put("B-571", aSN1ObjectIdentifier);
            Cardinal.put(aSN1ObjectIdentifier, "B-571");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = KeyAgreementSpi.DHwithRFC2631KDF.setEnvironment;
            init.put("B-409", aSN1ObjectIdentifier2);
            Cardinal.put(aSN1ObjectIdentifier2, "B-409");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = KeyAgreementSpi.DHwithRFC2631KDF.values;
            init.put("B-283", aSN1ObjectIdentifier3);
            Cardinal.put(aSN1ObjectIdentifier3, "B-283");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = KeyAgreementSpi.DHwithRFC2631KDF.CardinalActionCode;
            init.put("B-233", aSN1ObjectIdentifier4);
            Cardinal.put(aSN1ObjectIdentifier4, "B-233");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = KeyAgreementSpi.DHwithRFC2631KDF.valueOf;
            init.put("B-163", aSN1ObjectIdentifier5);
            Cardinal.put(aSN1ObjectIdentifier5, "B-163");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = KeyAgreementSpi.DHwithRFC2631KDF.getRenderType;
            init.put("K-571", aSN1ObjectIdentifier6);
            Cardinal.put(aSN1ObjectIdentifier6, "K-571");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = KeyAgreementSpi.DHwithRFC2631KDF.getEnvironment;
            init.put("K-409", aSN1ObjectIdentifier7);
            Cardinal.put(aSN1ObjectIdentifier7, "K-409");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = KeyAgreementSpi.DHwithRFC2631KDF.CardinalEnvironment;
            init.put("K-283", aSN1ObjectIdentifier8);
            Cardinal.put(aSN1ObjectIdentifier8, "K-283");
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = KeyAgreementSpi.DHwithRFC2631KDF.CardinalChallengeObserver;
            init.put("K-233", aSN1ObjectIdentifier9);
            Cardinal.put(aSN1ObjectIdentifier9, "K-233");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = KeyAgreementSpi.DHwithRFC2631KDF.init;
            init.put("K-163", aSN1ObjectIdentifier10);
            Cardinal.put(aSN1ObjectIdentifier10, "K-163");
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = KeyAgreementSpi.DHwithRFC2631KDF.getUiType;
            init.put("P-521", aSN1ObjectIdentifier11);
            Cardinal.put(aSN1ObjectIdentifier11, "P-521");
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = KeyAgreementSpi.DHwithRFC2631KDF.setProxyAddress;
            init.put("P-384", aSN1ObjectIdentifier12);
            Cardinal.put(aSN1ObjectIdentifier12, "P-384");
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = KeyAgreementSpi.DHwithRFC2631KDF.setRenderType;
            init.put("P-256", aSN1ObjectIdentifier13);
            Cardinal.put(aSN1ObjectIdentifier13, "P-256");
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = KeyAgreementSpi.DHwithRFC2631KDF.getProxyAddress;
            init.put("P-224", aSN1ObjectIdentifier14);
            Cardinal.put(aSN1ObjectIdentifier14, "P-224");
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = KeyAgreementSpi.DHwithRFC2631KDF.setUICustomization;
            init.put("P-192", aSN1ObjectIdentifier15);
            Cardinal.put(aSN1ObjectIdentifier15, "P-192");
        }
    }

    public interface IESwithDESedeCBC {
        public static final ASN1ObjectIdentifier Cardinal;
        public static final ASN1ObjectIdentifier CardinalActionCode;
        public static final ASN1ObjectIdentifier CardinalChallengeObserver;
        public static final ASN1ObjectIdentifier CardinalConfigurationParameters;
        public static final ASN1ObjectIdentifier CardinalEnvironment;
        public static final ASN1ObjectIdentifier CardinalError;
        public static final ASN1ObjectIdentifier CardinalRenderType;
        public static final ASN1ObjectIdentifier CardinalUiType;
        public static final ASN1ObjectIdentifier ExtendedData;
        public static final ASN1ObjectIdentifier Payload;
        public static final ASN1ObjectIdentifier cca_continue;
        public static final ASN1ObjectIdentifier cleanup;
        public static final ASN1ObjectIdentifier configure;
        public static final ASN1ObjectIdentifier getActionCode;
        public static final ASN1ObjectIdentifier getCavv;
        public static final ASN1ObjectIdentifier getChallengeTimeout;
        public static final ASN1ObjectIdentifier getEciFlag;
        public static final ASN1ObjectIdentifier getEnrolled;
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
        public static final ASN1ObjectIdentifier getXid;
        public static final ASN1ObjectIdentifier init;
        public static final ASN1ObjectIdentifier isEnableDFSync;
        public static final ASN1ObjectIdentifier isEnableLogging;
        public static final ASN1ObjectIdentifier isEnabledDiscover;
        public static final ASN1ObjectIdentifier isEnabledPaypal;
        public static final ASN1ObjectIdentifier isLocationDataConsentGiven;
        public static final ASN1ObjectIdentifier onCReqSuccess;
        public static final ASN1ObjectIdentifier onValidated;
        public static final ASN1ObjectIdentifier setChallengeTimeout;
        public static final ASN1ObjectIdentifier setEnableDFSync;
        public static final ASN1ObjectIdentifier setEnableLogging;
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
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.16.840.1.101.3.4");
            configure = aSN1ObjectIdentifier;
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2");
            init = aSN1ObjectIdentifier2;
            cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
            Cardinal = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2");
            getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, ExifInterface.GPS_MEASUREMENT_3D);
            onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "4");
            cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "5");
            onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6");
            getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "7");
            getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "8");
            CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "9");
            CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "10");
            valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "11");
            CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "12");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "13");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "14");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "15");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "16");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
            values = aSN1ObjectIdentifier3;
            CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1");
            getActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
            getString = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, ExifInterface.GPS_MEASUREMENT_3D);
            CardinalActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "4");
            CardinalChallengeObserver = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "5");
            CardinalConfigurationParameters = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "6");
            getRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "7");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "8");
            getChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "21");
            setChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "22");
            setRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "23");
            setEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "24");
            getUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "25");
            setProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "26");
            getEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "27");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "28");
            getProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "41");
            setUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, RoomMasterTable.DEFAULT_ID);
            setUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "43");
            getRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "44");
            setRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "45");
            getUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "46");
            isEnableLogging = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "47");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "48");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ExifInterface.GPS_MEASUREMENT_3D);
            isEnableDFSync = aSN1ObjectIdentifier4;
            getThreeDSRequestorAppURL = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
            setThreeDSRequestorAppURL = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "2");
            setEnableDFSync = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, ExifInterface.GPS_MEASUREMENT_3D);
            setLocationDataConsentGiven = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "4");
            setEnableLogging = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "5");
            ExtendedData = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "6");
            isLocationDataConsentGiven = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "7");
            getJSON = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "8");
            getCavv = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "9");
            getXid = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "10");
            getPaResStatus = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "11");
            getEnrolled = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "12");
            getEciFlag = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "13");
            isEnabledPaypal = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "14");
            isEnabledDiscover = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "15");
            Payload = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "16");
        }
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier("1.0.10118"), "3.0");
        Cardinal = aSN1ObjectIdentifier;
        configure = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "49");
        getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "50");
        cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "55");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("1.0.18033.2");
        init = aSN1ObjectIdentifier2;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.4");
    }
}
