package com.cardinalcommerce.a;

import androidx.exifinterface.media.ExifInterface;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;

public final class ElGamal {
    private static BCECPublicKey cca_continue = new BCECPublicKey() {
        public final GMCipherSpi getInstance() {
            BigInteger configure = ElGamal.configure("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger configure2 = ElGamal.configure("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger configure3 = ElGamal.configure("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger configure4 = ElGamal.configure("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1);
            toJSONString configure5 = ElGamal.configure((toJSONString) new toJSONString.getInstance(configure, configure2, configure3, configure4, valueOf));
            return new GMCipherSpi(configure5, new ECUtils(configure5, getHeadingTextFontName.init("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), configure4, valueOf, (byte[]) null);
        }
    };
    private static Hashtable configure = new Hashtable();
    private static Hashtable getInstance = new Hashtable();
    private static Hashtable init = new Hashtable();

    public static GMCipherSpi Cardinal(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        BCECPublicKey bCECPublicKey = (BCECPublicKey) init.get(aSN1ObjectIdentifier);
        if (bCECPublicKey == null) {
            return null;
        }
        return bCECPublicKey.Cardinal();
    }

    static /* synthetic */ toJSONString configure(toJSONString tojsonstring) {
        return tojsonstring;
    }

    public static String configure(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) configure.get(aSN1ObjectIdentifier);
    }

    public static Enumeration configure() {
        return configure.elements();
    }

    public static ASN1ObjectIdentifier init(String str) {
        return (ASN1ObjectIdentifier) getInstance.get(getTextFontSize.Cardinal(str));
    }

    public interface Mappings {
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
        public static final ASN1ObjectIdentifier getEnvironment;
        public static final ASN1ObjectIdentifier getInstance;
        public static final ASN1ObjectIdentifier getProxyAddress;
        public static final ASN1ObjectIdentifier getRenderType;
        public static final ASN1ObjectIdentifier getRequestTimeout;
        public static final ASN1ObjectIdentifier getSDKVersion;
        public static final ASN1ObjectIdentifier getString;
        public static final ASN1ObjectIdentifier getUICustomization;
        public static final ASN1ObjectIdentifier getUiType;
        public static final ASN1ObjectIdentifier getWarnings;
        public static final ASN1ObjectIdentifier init;
        public static final ASN1ObjectIdentifier isEnableDFSync;
        public static final ASN1ObjectIdentifier onCReqSuccess;
        public static final ASN1ObjectIdentifier onValidated;
        public static final ASN1ObjectIdentifier setChallengeTimeout;
        public static final ASN1ObjectIdentifier setEnvironment;
        public static final ASN1ObjectIdentifier setProxyAddress;
        public static final ASN1ObjectIdentifier setRenderType;
        public static final ASN1ObjectIdentifier setRequestTimeout;
        public static final ASN1ObjectIdentifier setUICustomization;
        public static final ASN1ObjectIdentifier setUiType;
        public static final ASN1ObjectIdentifier valueOf;
        public static final ASN1ObjectIdentifier values;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.4.1.22554");
            Cardinal = aSN1ObjectIdentifier;
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
            cca_continue = aSN1ObjectIdentifier2;
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
            configure = aSN1ObjectIdentifier3;
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.1");
            getInstance = aSN1ObjectIdentifier4;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.3");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.4");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
            init = aSN1ObjectIdentifier5;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "2");
            getWarnings = aSN1ObjectIdentifier6;
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1.22");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1.42");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "1.2");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "1.22");
            new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "1.42");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2");
            onCReqSuccess = aSN1ObjectIdentifier7;
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "1");
            getSDKVersion = aSN1ObjectIdentifier8;
            cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "1");
            onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, "2");
            CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier8, ExifInterface.GPS_MEASUREMENT_3D);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "2");
            CardinalRenderType = aSN1ObjectIdentifier9;
            values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "1");
            CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "2");
            valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, ExifInterface.GPS_MEASUREMENT_3D);
            getString = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "4");
            CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "5");
            CardinalActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "6");
            CardinalChallengeObserver = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "7");
            getActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier9, "8");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, ExifInterface.GPS_MEASUREMENT_3D);
            getChallengeTimeout = aSN1ObjectIdentifier10;
            getRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "1");
            setRequestTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "2");
            setChallengeTimeout = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, ExifInterface.GPS_MEASUREMENT_3D);
            CardinalConfigurationParameters = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "4");
            getUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "5");
            setProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "6");
            getProxyAddress = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "7");
            setEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier10, "8");
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier7, "4");
            getEnvironment = aSN1ObjectIdentifier11;
            setUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "1");
            getUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "2");
            getRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, ExifInterface.GPS_MEASUREMENT_3D);
            setUICustomization = new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "4");
            setRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier11, "5");
            isEnableDFSync = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ExifInterface.GPS_MEASUREMENT_3D), "1");
            new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4"), "1");
        }
    }

    public static GMCipherSpi getInstance(String str) {
        BCECPublicKey bCECPublicKey;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) getInstance.get(getTextFontSize.Cardinal(str));
        if (aSN1ObjectIdentifier == null || (bCECPublicKey = (BCECPublicKey) init.get(aSN1ObjectIdentifier)) == null) {
            return null;
        }
        return bCECPublicKey.Cardinal();
    }

    static /* synthetic */ BigInteger configure(String str) {
        return new BigInteger(1, getHeadingTextFontName.init(str));
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = GM.configure;
        BCECPublicKey bCECPublicKey = cca_continue;
        getInstance.put(getTextFontSize.Cardinal("FRP256v1"), aSN1ObjectIdentifier);
        configure.put(aSN1ObjectIdentifier, "FRP256v1");
        init.put(aSN1ObjectIdentifier, bCECPublicKey);
    }
}
