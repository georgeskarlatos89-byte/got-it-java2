package com.cardinalcommerce.a;

import androidx.exifinterface.media.ExifInterface;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface BCDHPrivateKey {
    public static final ASN1ObjectIdentifier Cardinal;
    public static final ASN1ObjectIdentifier cca_continue;
    public static final ASN1ObjectIdentifier cleanup;
    public static final ASN1ObjectIdentifier configure;
    public static final ASN1ObjectIdentifier getInstance;
    public static final ASN1ObjectIdentifier getSDKVersion;
    public static final ASN1ObjectIdentifier getWarnings;
    public static final ASN1ObjectIdentifier init;
    public static final ASN1ObjectIdentifier onCReqSuccess;
    public static final ASN1ObjectIdentifier onValidated;
    public static final ASN1ObjectIdentifier values;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("0.4.0.127.0.7");
        configure = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.2.1");
        cca_continue = aSN1ObjectIdentifier2;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.2.3");
        Cardinal = aSN1ObjectIdentifier3;
        new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "1"), "1");
        new ASN1ObjectIdentifier(new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2"), "1");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "2.2.2");
        getInstance = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "1");
        init = aSN1ObjectIdentifier5;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, ExifInterface.GPS_MEASUREMENT_3D);
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "5");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier5, "6");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier4, "2");
        getSDKVersion = aSN1ObjectIdentifier6;
        cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "1");
        onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "2");
        getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, ExifInterface.GPS_MEASUREMENT_3D);
        onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "4");
        values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier6, "5");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "3.1.2.1");
    }
}
