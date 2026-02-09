package com.cardinalcommerce.a;

import java.math.BigInteger;

public final class get3DSServerTransactionID extends setRenderType {
    private final setEnvironment cca_continue;
    public final int configure;
    public final BCDSAPrivateKey getInstance;

    public get3DSServerTransactionID(int i, BCDSAPrivateKey bCDSAPrivateKey) {
        this.cca_continue = new setEnvironment(0);
        this.configure = i;
        this.getInstance = bCDSAPrivateKey;
    }

    public get3DSServerTransactionID(isEnableLogging isenablelogging) {
        this.cca_continue = setEnvironment.getInstance((Object) isenablelogging.init(0));
        this.configure = new BigInteger(setEnvironment.getInstance((Object) isenablelogging.init(1)).getInstance).intValue();
        CardinalConfigurationParameters init = isenablelogging.init(2);
        this.getInstance = init instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) init : init != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init)) : null;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.configure));
        getbackgroundcolor.getInstance.addElement(this.getInstance);
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
