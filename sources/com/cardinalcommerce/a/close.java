package com.cardinalcommerce.a;

import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.SignatureSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.util.HashMap;
import java.util.Map;

public final class close {
    private static BCDSAPrivateKey Cardinal = new BCDSAPrivateKey(PQCObjectIdentifiers.CardinalError);
    private static Map CardinalError;
    private static BCDSAPrivateKey cca_continue = new BCDSAPrivateKey(PQCObjectIdentifiers.values);
    private static BCDSAPrivateKey cleanup = new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.getWarnings);
    private static BCDSAPrivateKey configure = new BCDSAPrivateKey(PQCObjectIdentifiers.onCReqSuccess);
    private static BCDSAPrivateKey getInstance = new BCDSAPrivateKey(PQCObjectIdentifiers.getWarnings);
    private static BCDSAPrivateKey getSDKVersion = new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.cca_continue);
    private static BCDSAPrivateKey getWarnings = new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.valueOf);
    private static BCDSAPrivateKey init = new BCDSAPrivateKey(PQCObjectIdentifiers.valueOf);
    private static BCDSAPrivateKey onCReqSuccess = new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.getInstance);
    private static BCDSAPrivateKey onValidated = new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.onCReqSuccess);
    private static BCDSAPrivateKey values = new BCDSAPrivateKey(IESCipher.IESwithDESedeCBC.CardinalRenderType);

    close() {
    }

    public static BCDSAPrivateKey Cardinal(int i) {
        if (i == 0) {
            return getInstance;
        }
        if (i == 1) {
            return configure;
        }
        if (i == 2) {
            return Cardinal;
        }
        if (i == 3) {
            return init;
        }
        if (i == 4) {
            return cca_continue;
        }
        throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(i)));
    }

    static IESCipher.ECIESwithAESCBC cca_continue(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
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

    public static BCDSAPrivateKey getInstance(String str) {
        if (str.equals("SHA3-256")) {
            return cleanup;
        }
        if (str.equals("SHA-512/256")) {
            return onValidated;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(String.valueOf(str)));
    }

    public static BCDSAPrivateKey init(String str) {
        if (str.equals("SHA-256")) {
            return getSDKVersion;
        }
        if (str.equals("SHA-512")) {
            return onCReqSuccess;
        }
        if (str.equals("SHAKE128")) {
            return getWarnings;
        }
        if (str.equals("SHAKE256")) {
            return values;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(String.valueOf(str)));
    }

    static int cca_continue(BCDSAPrivateKey bCDSAPrivateKey) {
        return ((Integer) CardinalError.get(bCDSAPrivateKey.cca_continue)).intValue();
    }

    static String configure(ChallengeParameters challengeParameters) {
        BCDSAPrivateKey bCDSAPrivateKey = challengeParameters.configure;
        if (bCDSAPrivateKey.cca_continue.equals(cleanup.cca_continue)) {
            return "SHA3-256";
        }
        if (bCDSAPrivateKey.cca_continue.equals(onValidated.cca_continue)) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException(new StringBuilder("unknown tree digest: ").append(bCDSAPrivateKey.cca_continue).toString());
    }

    static {
        HashMap hashMap = new HashMap();
        CardinalError = hashMap;
        hashMap.put(PQCObjectIdentifiers.getWarnings, 0);
        CardinalError.put(PQCObjectIdentifiers.onCReqSuccess, 1);
        CardinalError.put(PQCObjectIdentifiers.CardinalError, 2);
        CardinalError.put(PQCObjectIdentifiers.valueOf, 3);
        CardinalError.put(PQCObjectIdentifiers.values, 4);
    }
}
