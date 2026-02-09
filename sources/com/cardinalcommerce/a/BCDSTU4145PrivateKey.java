package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyFactorySpi;
import java.math.BigInteger;
import java.util.Enumeration;

public final class BCDSTU4145PrivateKey extends setRenderType {
    public final setEnvironment Cardinal;
    public final setEnvironment cca_continue;
    public final KeyFactorySpi.AnonymousClass1 configure;
    public final setEnvironment getInstance;
    public final setEnvironment init;

    public BCDSTU4145PrivateKey(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, KeyFactorySpi.AnonymousClass1 r6) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        } else if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        } else if (bigInteger3 != null) {
            this.getInstance = new setEnvironment(bigInteger);
            this.cca_continue = new setEnvironment(bigInteger2);
            this.Cardinal = new setEnvironment(bigInteger3);
            this.init = bigInteger4 != null ? new setEnvironment(bigInteger4) : null;
            this.configure = r6;
        } else {
            throw new IllegalArgumentException("'q' cannot be null");
        }
    }

    public BCDSTU4145PrivateKey(isEnableLogging isenablelogging) {
        if (isenablelogging.cca_continue() < 3 || isenablelogging.cca_continue() > 5) {
            throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
        }
        Enumeration init2 = isenablelogging.init();
        this.getInstance = setEnvironment.getInstance(init2.nextElement());
        this.cca_continue = setEnvironment.getInstance(init2.nextElement());
        this.Cardinal = setEnvironment.getInstance(init2.nextElement());
        KeyFactorySpi.AnonymousClass1 r1 = null;
        CardinalConfigurationParameters cardinalConfigurationParameters = init2.hasMoreElements() ? (CardinalConfigurationParameters) init2.nextElement() : null;
        if (cardinalConfigurationParameters == null || !(cardinalConfigurationParameters instanceof setEnvironment)) {
            this.init = null;
        } else {
            this.init = setEnvironment.getInstance((Object) cardinalConfigurationParameters);
            cardinalConfigurationParameters = init2.hasMoreElements() ? (CardinalConfigurationParameters) init2.nextElement() : null;
        }
        if (cardinalConfigurationParameters != null) {
            getThreeDSRequestorAppURL onCReqSuccess = cardinalConfigurationParameters.onCReqSuccess();
            this.configure = onCReqSuccess != null ? new KeyFactorySpi.AnonymousClass1(isEnableLogging.getInstance((Object) onCReqSuccess)) : r1;
            return;
        }
        this.configure = null;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.getInstance);
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        getbackgroundcolor.getInstance.addElement(this.Cardinal);
        setEnvironment setenvironment = this.init;
        if (setenvironment != null) {
            getbackgroundcolor.getInstance.addElement(setenvironment);
        }
        KeyFactorySpi.AnonymousClass1 r1 = this.configure;
        if (r1 != null) {
            getbackgroundcolor.getInstance.addElement(r1);
        }
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
