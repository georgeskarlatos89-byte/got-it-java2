package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import java.math.BigInteger;

public final class getSDKEphemeralPublicKey extends setRenderType {
    public byte[] Cardinal;
    public byte[] cca_continue;
    public int configure;
    public int getInstance;
    public BCDSAPrivateKey getSDKVersion;
    public byte[] init;

    public getSDKEphemeralPublicKey(int i, int i2, DirectoryServerID directoryServerID, SDKRuntimeException sDKRuntimeException, ButtonCustomization buttonCustomization, BCDSAPrivateKey bCDSAPrivateKey) {
        this.configure = i;
        this.getInstance = i2;
        this.Cardinal = KeyAgreementSpi.MQVwithSHA1KDF.getInstance(directoryServerID.getInstance);
        this.cca_continue = sDKRuntimeException.Cardinal();
        this.init = buttonCustomization.init();
        this.getSDKVersion = bCDSAPrivateKey;
    }

    public getSDKEphemeralPublicKey(isEnableLogging isenablelogging) {
        this.configure = new BigInteger(((setEnvironment) isenablelogging.init(0)).getInstance).intValue();
        this.getInstance = new BigInteger(((setEnvironment) isenablelogging.init(1)).getInstance).intValue();
        this.Cardinal = ((setUICustomization) isenablelogging.init(2)).getInstance();
        this.cca_continue = ((setUICustomization) isenablelogging.init(3)).getInstance();
        this.init = ((setUICustomization) isenablelogging.init(4)).getInstance();
        CardinalConfigurationParameters init2 = isenablelogging.init(5);
        this.getSDKVersion = init2 instanceof BCDSAPrivateKey ? (BCDSAPrivateKey) init2 : init2 != null ? new BCDSAPrivateKey(isEnableLogging.getInstance((Object) init2)) : null;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.configure));
        getbackgroundcolor.getInstance.addElement(new setEnvironment((long) this.getInstance));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.Cardinal));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.cca_continue));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.init));
        getbackgroundcolor.getInstance.addElement(this.getSDKVersion);
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
