package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class getMessageVersion extends setRenderType {
    public final int Cardinal;
    public final int cca_continue;
    public final BCDSAPrivateKey configure;
    public final getCause init;

    public getMessageVersion(int i, int i2, getCause getcause, BCDSAPrivateKey bCDSAPrivateKey) {
        this.Cardinal = i;
        this.cca_continue = i2;
        this.init = new getCause(getcause.getInstance());
        this.configure = bCDSAPrivateKey;
    }

    public getMessageVersion(isEnableLogging isenablelogging) {
        this.Cardinal = new BigInteger(((setEnvironment) isenablelogging.init(0)).getInstance).intValue();
        this.cca_continue = new BigInteger(((setEnvironment) isenablelogging.init(1)).getInstance).intValue();
        this.init = new getCause(((setUICustomization) isenablelogging.init(2)).getInstance());
        CardinalConfigurationParameters init2 = isenablelogging.init(3);
        this.configure = init2 instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) init2 : init2 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init2)) : null;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.Cardinal));
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.cca_continue));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.init.getInstance()));
        getbackgroundcolor.getInstance.addElement(this.configure);
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
