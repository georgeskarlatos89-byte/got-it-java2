package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.math.BigInteger;

public final class getDeviceData extends setRenderType {
    public int Cardinal;
    public int cca_continue;
    public byte[] configure;
    public byte[] getInstance;
    public byte[] getWarnings;
    public byte[] init;
    public byte[] onCReqSuccess;

    public getDeviceData(int i, int i2, DirectoryServerID directoryServerID, SDKRuntimeException sDKRuntimeException, ButtonCustomization buttonCustomization, ButtonCustomization buttonCustomization2, getCause getcause) {
        this.cca_continue = i;
        this.Cardinal = i2;
        this.configure = KeyAgreementSpi.MQVwithSHA1KDF.getInstance(directoryServerID.getInstance);
        this.getInstance = sDKRuntimeException.Cardinal();
        this.init = getcause.getInstance();
        this.getWarnings = buttonCustomization.init();
        this.onCReqSuccess = buttonCustomization2.init();
    }

    public getDeviceData(isEnableLogging isenablelogging) {
        this.cca_continue = new BigInteger(((setEnvironment) isenablelogging.init(0)).getInstance).intValue();
        this.Cardinal = new BigInteger(((setEnvironment) isenablelogging.init(1)).getInstance).intValue();
        this.configure = ((setUICustomization) isenablelogging.init(2)).getInstance();
        this.getInstance = ((setUICustomization) isenablelogging.init(3)).getInstance();
        this.getWarnings = ((setUICustomization) isenablelogging.init(4)).getInstance();
        this.onCReqSuccess = ((setUICustomization) isenablelogging.init(5)).getInstance();
        this.init = ((setUICustomization) isenablelogging.init(6)).getInstance();
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.cca_continue));
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.Cardinal));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.configure));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.getInstance));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.getWarnings));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.onCReqSuccess));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.init));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
