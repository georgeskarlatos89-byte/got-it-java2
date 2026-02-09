package com.cardinalcommerce.a;

import androidx.exifinterface.media.ExifInterface;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface GOST {
    public static final ASN1ObjectIdentifier Cardinal;
    public static final ASN1ObjectIdentifier CardinalActionCode;
    public static final ASN1ObjectIdentifier CardinalChallengeObserver;
    public static final ASN1ObjectIdentifier CardinalEnvironment;
    public static final ASN1ObjectIdentifier CardinalError;
    public static final ASN1ObjectIdentifier CardinalRenderType;
    public static final ASN1ObjectIdentifier CardinalUiType;
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

    public final class Mappings {
        public static final ASN1ObjectIdentifier Cardinal = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(new ASN1ObjectIdentifier("1.3.6.1.4.1.3029"), "1"), "5"), "1");
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("0.4.0.127.0.7");
        Cardinal = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1.1");
        getInstance = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "4.1");
        cca_continue = aSN1ObjectIdentifier3;
        configure = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1");
        init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
        cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, ExifInterface.GPS_MEASUREMENT_3D);
        getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "4");
        onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "5");
        getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "6");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "5.1");
        onValidated = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
        CardinalError = aSN1ObjectIdentifier5;
        CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1");
        CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2");
        values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, ExifInterface.GPS_MEASUREMENT_3D);
        valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "4");
        CardinalActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "5");
        CardinalUiType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "6");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "2");
        CardinalChallengeObserver = aSN1ObjectIdentifier6;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, ExifInterface.GPS_MEASUREMENT_3D);
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "4");
    }
}
