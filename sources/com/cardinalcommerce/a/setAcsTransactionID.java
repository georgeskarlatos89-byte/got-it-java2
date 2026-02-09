package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class setAcsTransactionID extends setRenderType {
    public final int Cardinal;
    public final byte[] cca_continue;
    public final byte[] configure;
    public final byte[] getInstance;
    public final byte[] getWarnings;
    public final byte[] init;

    public setAcsTransactionID(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        this.Cardinal = i;
        byte[] bArr10 = null;
        if (bArr == null) {
            bArr6 = null;
        } else {
            bArr6 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        }
        this.configure = bArr6;
        if (bArr2 == null) {
            bArr7 = null;
        } else {
            bArr7 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr7, 0, bArr2.length);
        }
        this.getInstance = bArr7;
        if (bArr3 == null) {
            bArr8 = null;
        } else {
            bArr8 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr8, 0, bArr3.length);
        }
        this.cca_continue = bArr8;
        if (bArr4 == null) {
            bArr9 = null;
        } else {
            bArr9 = new byte[bArr4.length];
            System.arraycopy(bArr4, 0, bArr9, 0, bArr4.length);
        }
        this.init = bArr9;
        if (bArr5 != null) {
            bArr10 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr10, 0, bArr5.length);
        }
        this.getWarnings = bArr10;
    }

    public setAcsTransactionID(isEnableLogging isenablelogging) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        if (!new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(0)).getInstance).equals(BigInteger.valueOf(0))) {
            throw new IllegalArgumentException("unknown version of sequence");
        } else if (isenablelogging.cca_continue() == 2 || isenablelogging.cca_continue() == 3) {
            isEnableLogging instance = isEnableLogging.getInstance((Object) isenablelogging.init(1));
            this.Cardinal = new BigInteger(setEnvironment.getInstance((Object) instance.init(0)).getInstance).intValue();
            byte[] instance2 = setEnabledVisaCheckout.init(instance.init(1)).getInstance();
            byte[] bArr5 = null;
            if (instance2 == null) {
                bArr = null;
            } else {
                bArr = new byte[instance2.length];
                System.arraycopy(instance2, 0, bArr, 0, instance2.length);
            }
            this.configure = bArr;
            byte[] instance3 = setEnabledVisaCheckout.init(instance.init(2)).getInstance();
            if (instance3 == null) {
                bArr2 = null;
            } else {
                bArr2 = new byte[instance3.length];
                System.arraycopy(instance3, 0, bArr2, 0, instance3.length);
            }
            this.getInstance = bArr2;
            byte[] instance4 = setEnabledVisaCheckout.init(instance.init(3)).getInstance();
            if (instance4 == null) {
                bArr3 = null;
            } else {
                bArr3 = new byte[instance4.length];
                System.arraycopy(instance4, 0, bArr3, 0, instance4.length);
            }
            this.cca_continue = bArr3;
            byte[] instance5 = setEnabledVisaCheckout.init(instance.init(4)).getInstance();
            if (instance5 == null) {
                bArr4 = null;
            } else {
                bArr4 = new byte[instance5.length];
                System.arraycopy(instance5, 0, bArr4, 0, instance5.length);
            }
            this.init = bArr4;
            if (isenablelogging.cca_continue() == 3) {
                byte[] instance6 = setEnabledVisaCheckout.init(setEnableLogging.cca_continue(isenablelogging.init(2)), true).getInstance();
                if (instance6 != null) {
                    bArr5 = new byte[instance6.length];
                    System.arraycopy(instance6, 0, bArr5, 0, instance6.length);
                }
                this.getWarnings = bArr5;
                return;
            }
            this.getWarnings = null;
        } else {
            throw new IllegalArgumentException("key sequence wrong size");
        }
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment(0));
        getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
        getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) this.Cardinal));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.configure));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.getInstance));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.cca_continue));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.init));
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
        getbackgroundcolor.getInstance.addElement(new getPayment(true, 0, new setEnabledVisaCheckout(this.getWarnings)));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
