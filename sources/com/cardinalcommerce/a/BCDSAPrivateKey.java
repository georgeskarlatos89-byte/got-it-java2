package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.ASN1ObjectIdentifier;

public final class BCDSAPrivateKey extends setRenderType {
    public CardinalConfigurationParameters Cardinal;
    public ASN1ObjectIdentifier cca_continue;

    public BCDSAPrivateKey(isEnableLogging isenablelogging) {
        if (isenablelogging.cca_continue() <= 0 || isenablelogging.cca_continue() > 2) {
            throw new IllegalArgumentException(new StringBuilder("Bad sequence size: ").append(isenablelogging.cca_continue()).toString());
        }
        this.cca_continue = ASN1ObjectIdentifier.cca_continue((Object) isenablelogging.init(0));
        this.Cardinal = isenablelogging.cca_continue() == 2 ? isenablelogging.init(1) : null;
    }

    public BCDSAPrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.cca_continue = aSN1ObjectIdentifier;
    }

    public BCDSAPrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, CardinalConfigurationParameters cardinalConfigurationParameters) {
        this.cca_continue = aSN1ObjectIdentifier;
        this.Cardinal = cardinalConfigurationParameters;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(this.cca_continue);
        CardinalConfigurationParameters cardinalConfigurationParameters = this.Cardinal;
        if (cardinalConfigurationParameters != null) {
            getbackgroundcolor.getInstance.addElement(cardinalConfigurationParameters);
        }
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
