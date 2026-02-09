package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface BCDHPublicKey {
    public static final ASN1ObjectIdentifier configure = new ASN1ObjectIdentifier("1.2.410.200004.1.4");
    public static final ASN1ObjectIdentifier getInstance = new ASN1ObjectIdentifier("1.2.410.200004.7.1.1.1");
    public static final ASN1ObjectIdentifier init = new ASN1ObjectIdentifier("1.2.410.200004.1.7");

    static {
        new ASN1ObjectIdentifier("1.2.410.200004.1.15");
        new ASN1ObjectIdentifier("1.2.840.113549.1.9.16.0.24");
    }
}
