package com.cardinalcommerce.a;

import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.util.HashMap;
import java.util.Map;

public final class ChallengeUtils {
    private static Map<String, ASN1ObjectIdentifier> cca_continue;

    static {
        HashMap hashMap = new HashMap();
        cca_continue = hashMap;
        hashMap.put("SHA-256", IESCipher.IESwithDESedeCBC.cca_continue);
        cca_continue.put("SHA-512", IESCipher.IESwithDESedeCBC.getInstance);
        cca_continue.put("SHAKE128", IESCipher.IESwithDESedeCBC.valueOf);
        cca_continue.put("SHAKE256", IESCipher.IESwithDESedeCBC.CardinalRenderType);
    }

    ChallengeUtils() {
    }

    public static IESCipher.ECIESwithAESCBC Cardinal(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals(IESCipher.IESwithDESedeCBC.cca_continue)) {
            return new SignatureSpi.ecCVCDSA224();
        }
        if (aSN1ObjectIdentifier.equals(IESCipher.IESwithDESedeCBC.getInstance)) {
            return new KeyPairGeneratorSpi.ECMQV();
        }
        if (aSN1ObjectIdentifier.equals(IESCipher.IESwithDESedeCBC.valueOf)) {
            return new SignatureSpi.ecCVCDSA512(128);
        }
        if (aSN1ObjectIdentifier.equals(IESCipher.IESwithDESedeCBC.CardinalRenderType)) {
            return new SignatureSpi.ecCVCDSA512(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(aSN1ObjectIdentifier)));
    }

    static ASN1ObjectIdentifier cca_continue(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = cca_continue.get(str);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException("unrecognized digest name: ".concat(String.valueOf(str)));
    }
}
