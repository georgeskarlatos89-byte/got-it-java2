package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public final class getAcsRefNumber extends setRenderType {
    private setEnvironment Cardinal;
    public setEnvironment cca_continue;
    private byte[] cleanup;
    private byte[][] configure;
    private ASN1ObjectIdentifier getInstance;
    private byte[][] init;

    public getAcsRefNumber(isEnableLogging isenablelogging) {
        if (isenablelogging.init(0) instanceof setEnvironment) {
            this.Cardinal = setEnvironment.getInstance((Object) isenablelogging.init(0));
        } else {
            this.getInstance = ASN1ObjectIdentifier.cca_continue((Object) isenablelogging.init(0));
        }
        this.cca_continue = setEnvironment.getInstance((Object) isenablelogging.init(1));
        isEnableLogging instance = isEnableLogging.getInstance((Object) isenablelogging.init(2));
        this.configure = new byte[instance.cca_continue()][];
        for (int i = 0; i < instance.cca_continue(); i++) {
            this.configure[i] = setUICustomization.init(instance.init(i)).getInstance();
        }
        isEnableLogging isenablelogging2 = (isEnableLogging) isenablelogging.init(3);
        this.init = new byte[isenablelogging2.cca_continue()][];
        for (int i2 = 0; i2 < isenablelogging2.cca_continue(); i2++) {
            this.init[i2] = setUICustomization.init(isenablelogging2.init(i2)).getInstance();
        }
        this.cleanup = setUICustomization.init(((isEnableLogging) isenablelogging.init(4)).init(0)).getInstance();
    }

    public final short[][] cca_continue() {
        return protocolError.init(this.init);
    }

    public final short[][] init() {
        return protocolError.init(this.configure);
    }

    public getAcsRefNumber(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.Cardinal = new setEnvironment(0);
        this.cca_continue = new setEnvironment((long) i);
        this.configure = protocolError.cca_continue(sArr);
        this.init = protocolError.cca_continue(sArr2);
        byte[] bArr = new byte[sArr3.length];
        for (int i2 = 0; i2 < sArr3.length; i2++) {
            bArr[i2] = (byte) sArr3[i2];
        }
        this.cleanup = bArr;
    }

    public final short[] configure() {
        byte[] bArr = this.cleanup;
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        setEnvironment setenvironment = this.Cardinal;
        if (setenvironment != null) {
            getbackgroundcolor.getInstance.addElement(setenvironment);
        } else {
            getbackgroundcolor.getInstance.addElement(this.getInstance);
        }
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
        for (byte[] setenabledvisacheckout : this.configure) {
            getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(setenabledvisacheckout));
        }
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
        getBackgroundColor getbackgroundcolor3 = new getBackgroundColor();
        for (byte[] setenabledvisacheckout2 : this.init) {
            getbackgroundcolor3.getInstance.addElement(new setEnabledVisaCheckout(setenabledvisacheckout2));
        }
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor3));
        getBackgroundColor getbackgroundcolor4 = new getBackgroundColor();
        getbackgroundcolor4.getInstance.addElement(new setEnabledVisaCheckout(this.cleanup));
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor4));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
