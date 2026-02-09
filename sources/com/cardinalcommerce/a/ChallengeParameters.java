package com.cardinalcommerce.a;

public final class ChallengeParameters extends setRenderType {
    public final BCDSAPrivateKey configure;
    private final setEnvironment init;

    public ChallengeParameters(BCDSAPrivateKey bCDSAPrivateKey) {
        this.init = new setEnvironment(0);
        this.configure = bCDSAPrivateKey;
    }

    public ChallengeParameters(isEnableLogging isenablelogging) {
        this.init = setEnvironment.getInstance((Object) isenablelogging.init(0));
        CardinalConfigurationParameters init2 = isenablelogging.init(1);
        this.configure = init2 instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) init2 : init2 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init2)) : null;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.init);
        getbackgroundcolor.getInstance.addElement(this.configure);
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
