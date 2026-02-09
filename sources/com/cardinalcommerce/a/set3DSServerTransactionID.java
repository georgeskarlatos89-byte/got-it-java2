package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class set3DSServerTransactionID extends setRenderType {
    public final byte[] Cardinal;
    public final byte[] getInstance;

    public set3DSServerTransactionID(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        this.getInstance = bArr3;
        byte[] bArr4 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        this.Cardinal = bArr4;
    }

    public set3DSServerTransactionID(isEnableLogging isenablelogging) {
        byte[] bArr;
        if (new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(0)).getInstance).equals(BigInteger.valueOf(0))) {
            byte[] instance = setEnabledVisaCheckout.init(isenablelogging.init(1)).getInstance();
            byte[] bArr2 = null;
            if (instance == null) {
                bArr = null;
            } else {
                bArr = new byte[instance.length];
                System.arraycopy(instance, 0, bArr, 0, instance.length);
            }
            this.getInstance = bArr;
            byte[] instance2 = setEnabledVisaCheckout.init(isenablelogging.init(2)).getInstance();
            if (instance2 != null) {
                bArr2 = new byte[instance2.length];
                System.arraycopy(instance2, 0, bArr2, 0, instance2.length);
            }
            this.Cardinal = bArr2;
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment(0));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.getInstance));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.Cardinal));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
