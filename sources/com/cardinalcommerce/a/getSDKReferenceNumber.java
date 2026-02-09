package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class getSDKReferenceNumber extends setRenderType {
    public final int cca_continue;
    public final int getInstance;
    public final getCause init;

    public getSDKReferenceNumber(int i, int i2, getCause getcause) {
        this.getInstance = i;
        this.cca_continue = i2;
        this.init = new getCause(getcause);
    }

    public getSDKReferenceNumber(isEnableLogging isenablelogging) {
        this.getInstance = new BigInteger(((setEnvironment) isenablelogging.init(0)).getInstance).intValue();
        this.cca_continue = new BigInteger(((setEnvironment) isenablelogging.init(1)).getInstance).intValue();
        this.init = new getCause(((setUICustomization) isenablelogging.init(2)).getInstance());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.getInstance));
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.cca_continue));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.init.getInstance()));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
