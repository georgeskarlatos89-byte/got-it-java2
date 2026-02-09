package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class getAcsTransactionID extends setRenderType {
    public final int Cardinal;
    public final BCDSAPrivateKey cca_continue;
    private final setEnvironment configure;
    public final int getInstance;

    public getAcsTransactionID(int i, int i2, BCDSAPrivateKey bCDSAPrivateKey) {
        this.configure = new setEnvironment(0);
        this.getInstance = i;
        this.Cardinal = i2;
        this.cca_continue = bCDSAPrivateKey;
    }

    public getAcsTransactionID(isEnableLogging isenablelogging) {
        this.configure = setEnvironment.getInstance((Object) isenablelogging.init(0));
        this.getInstance = new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(1)).getInstance).intValue();
        this.Cardinal = new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(2)).getInstance).intValue();
        CardinalConfigurationParameters init = isenablelogging.init(3);
        this.cca_continue = init instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) init : init != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init)) : null;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.configure);
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.getInstance));
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.Cardinal));
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
