package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.cardinalcommerce.shared.cs.utils.ThreeDSStrings;

public interface AlgorithmParametersSpi {
    public static final ASN1ObjectIdentifier Cardinal;
    public static final ASN1ObjectIdentifier CardinalChallengeObserver;
    public static final ASN1ObjectIdentifier CardinalEnvironment;
    public static final ASN1ObjectIdentifier CardinalError;
    public static final ASN1ObjectIdentifier CardinalRenderType;
    public static final ASN1ObjectIdentifier CardinalUiType;
    public static final ASN1ObjectIdentifier cca_continue;
    public static final ASN1ObjectIdentifier cleanup;
    public static final ASN1ObjectIdentifier configure;
    public static final ASN1ObjectIdentifier getActionCode;
    public static final ASN1ObjectIdentifier getInstance;
    public static final ASN1ObjectIdentifier getSDKVersion;
    public static final ASN1ObjectIdentifier getWarnings;
    public static final ASN1ObjectIdentifier init;
    public static final ASN1ObjectIdentifier onCReqSuccess;
    public static final ASN1ObjectIdentifier onValidated;
    public static final ASN1ObjectIdentifier valueOf;
    public static final ASN1ObjectIdentifier values;

    public final class OAEP extends PSS {
        public int configure;

        public OAEP(byte[] bArr, byte[] bArr2, int i, int i2) {
            super(bArr, bArr2, i);
            this.configure = i2;
        }
    }

    public class PSS implements GMCipherSpi.SM2withRMD {
        public byte[] Cardinal;
        public int cca_continue;
        public byte[] getInstance;

        public PSS(byte[] bArr, byte[] bArr2, int i) {
            byte[] bArr3;
            byte[] bArr4 = null;
            if (bArr == null) {
                bArr3 = null;
            } else {
                bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            }
            this.Cardinal = bArr3;
            if (bArr2 != null) {
                bArr4 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
            }
            this.getInstance = bArr4;
            this.cca_continue = i;
        }
    }

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.156.10197.1");
        configure = aSN1ObjectIdentifier;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "101.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "101.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "101.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "101.4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "102.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "102.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "102.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "102.4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "102.5");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "102.6");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "103.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "103.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "103.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "103.4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "103.5");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "103.6");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.3");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.4");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.5");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.6");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.7");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.8");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.9");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.10");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.11");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.12");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "104.100");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, ThreeDSStrings.REQUIRED_DATA_MISSING_ERROR_CODE);
        getInstance = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "301");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "301.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "301.2");
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "301.3");
        Cardinal = aSN1ObjectIdentifier2;
        cca_continue = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "301.101");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2");
        init = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.1");
        getSDKVersion = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.2");
        cleanup = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.3");
        getWarnings = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.4");
        onValidated = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.5");
        onCReqSuccess = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.6");
        CardinalError = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.7");
        CardinalEnvironment = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.8");
        valueOf = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.9");
        CardinalRenderType = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.10");
        values = new ASN1ObjectIdentifier(aSN1ObjectIdentifier2, "2.11");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "302");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "302.1");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "302.2");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "302.3");
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "401");
        CardinalUiType = aSN1ObjectIdentifier3;
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier3, "2");
        getActionCode = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "501");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "502");
        CardinalChallengeObserver = new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "503");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "504");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "505");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "506");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "507");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "520");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "521");
        new ASN1ObjectIdentifier(aSN1ObjectIdentifier, "522");
    }
}
