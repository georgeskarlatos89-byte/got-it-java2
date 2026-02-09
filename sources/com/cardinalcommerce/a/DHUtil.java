package com.cardinalcommerce.a;

import androidx.exifinterface.media.ExifInterface;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface DHUtil {
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
    public static final ASN1ObjectIdentifier onCReqSuccess = new ASN1ObjectIdentifier("1.3.6.1.4.1.188.7.1.1.2");
    public static final ASN1ObjectIdentifier onValidated;
    public static final ASN1ObjectIdentifier values;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.16.840.1.113730.1");
        cca_continue = aSN1ObjectIdentifier;
        configure = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2");
        init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ExifInterface.GPS_MEASUREMENT_3D);
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "7");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "8");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "12");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "13");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("2.16.840.1.113733.1");
        Cardinal = aSN1ObjectIdentifier2;
        getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6.9");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6.11");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6.13");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "6.15");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "8.1");
        new ASN1ObjectIdentifier(new ASN1ObjectIdentifier("2.16.840.1.113719"), "1.9.4.1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier("1.2.840.113533.7");
        getSDKVersion = aSN1ObjectIdentifier3;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "65.0");
        getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "66.10");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(new ASN1ObjectIdentifier("1.3.6.1.4.1.3029"), "1");
        onValidated = aSN1ObjectIdentifier4;
        cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1.1");
        CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1.2");
        values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1.3");
        CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1.4");
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier("1.3.6.1.4.1.1722.12.2");
        CardinalRenderType = aSN1ObjectIdentifier5;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1.5");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1.8");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1.12");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1.16");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2.4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2.5");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2.7");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2.8");
        new ASN1ObjectIdentifier("1.3.6.1.4.1.11591.4.11");
    }
}
