package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.toJSONString;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;
import java.math.BigInteger;

public final class BCECPrivateKey extends setRenderType implements GMCipherSpi.SM2withMD5 {
    byte[] Cardinal;
    private ASN1ObjectIdentifier cca_continue = null;
    toJSONString configure;

    public BCECPrivateKey(toJSONString tojsonstring, byte[] bArr) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        byte[] bArr2 = null;
        this.configure = tojsonstring;
        boolean z = false;
        if (bArr != null) {
            bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.Cardinal = bArr2;
        if (this.configure.cca_continue.Cardinal() == 1 ? true : z) {
            aSN1ObjectIdentifier = getWarnings;
        } else if (appendElement.cca_continue(this.configure.cca_continue)) {
            aSN1ObjectIdentifier = getSDKVersion;
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.cca_continue = aSN1ObjectIdentifier;
    }

    public BCECPrivateKey(GMCipherSpi.SM2withBlake2s sM2withBlake2s, BigInteger bigInteger, BigInteger bigInteger2, isEnableLogging isenablelogging) {
        int i;
        int i2;
        int i3;
        GMCipherSpi.SM2withBlake2s sM2withBlake2s2 = sM2withBlake2s;
        isEnableLogging isenablelogging2 = isenablelogging;
        byte[] bArr = null;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = sM2withBlake2s2.init;
        this.cca_continue = aSN1ObjectIdentifier;
        if (aSN1ObjectIdentifier.equals(getWarnings)) {
            this.configure = new toJSONString.getInstance(new BigInteger(((setEnvironment) sM2withBlake2s2.Cardinal).getInstance), new BigInteger(1, setUICustomization.init(isenablelogging2.init(0)).getInstance()), new BigInteger(1, setUICustomization.init(isenablelogging2.init(1)).getInstance()), bigInteger, bigInteger2);
        } else if (this.cca_continue.equals(getSDKVersion)) {
            isEnableLogging instance = isEnableLogging.getInstance((Object) sM2withBlake2s2.Cardinal);
            int intValue = new BigInteger(((setEnvironment) instance.init(0)).getInstance).intValue();
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) instance.init(1);
            if (aSN1ObjectIdentifier2.equals(cleanup)) {
                i3 = new BigInteger(setEnvironment.getInstance((Object) instance.init(2)).getInstance).intValue();
                i2 = 0;
                i = 0;
            } else if (aSN1ObjectIdentifier2.equals(CardinalRenderType)) {
                isEnableLogging instance2 = isEnableLogging.getInstance((Object) instance.init(2));
                int intValue2 = new BigInteger(setEnvironment.getInstance((Object) instance2.init(0)).getInstance).intValue();
                int intValue3 = new BigInteger(setEnvironment.getInstance((Object) instance2.init(1)).getInstance).intValue();
                i = new BigInteger(setEnvironment.getInstance((Object) instance2.init(2)).getInstance).intValue();
                i3 = intValue2;
                i2 = intValue3;
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            this.configure = new toJSONString.init(intValue, i3, i2, i, new BigInteger(1, setUICustomization.init(isenablelogging2.init(0)).getInstance()), new BigInteger(1, setUICustomization.init(isenablelogging2.init(1)).getInstance()), bigInteger, bigInteger2);
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        if (isenablelogging.cca_continue() == 3) {
            byte[] instance3 = ((getDeviceFingerprint) isenablelogging2.init(2)).getInstance();
            if (instance3 != null) {
                bArr = new byte[instance3.length];
                System.arraycopy(instance3, 0, bArr, 0, instance3.length);
            }
            this.Cardinal = bArr;
        }
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        if (this.cca_continue.equals(getWarnings)) {
            getbackgroundcolor.getInstance.addElement(new SignatureSpiLe(this.configure.getSDKVersion()).onCReqSuccess());
            getbackgroundcolor.getInstance.addElement(new SignatureSpiLe(this.configure.cleanup()).onCReqSuccess());
        } else if (this.cca_continue.equals(getSDKVersion)) {
            getbackgroundcolor.getInstance.addElement(new SignatureSpiLe(this.configure.getSDKVersion()).onCReqSuccess());
            getbackgroundcolor.getInstance.addElement(new SignatureSpiLe(this.configure.cleanup()).onCReqSuccess());
        }
        if (this.Cardinal != null) {
            getbackgroundcolor.getInstance.addElement(new getDeviceFingerprint(this.Cardinal));
        }
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
