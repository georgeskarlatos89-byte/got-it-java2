package com.cardinalcommerce.a;

import java.io.IOException;
import java.util.Enumeration;

public final class setEnabledDiscover extends setEnableDFSync {
    public setEnabledDiscover() {
    }

    public setEnabledDiscover(CardinalConfigurationParameters cardinalConfigurationParameters) {
        super(cardinalConfigurationParameters);
    }

    public setEnabledDiscover(getBackgroundColor getbackgroundcolor) {
        super(getbackgroundcolor, false);
    }

    public setEnabledDiscover(CardinalConfigurationParameters[] cardinalConfigurationParametersArr) {
        super(cardinalConfigurationParametersArr);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        Enumeration elements = this.cca_continue.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            i += ((CardinalConfigurationParameters) elements.nextElement()).onCReqSuccess().Cardinal();
        }
        return i + 2 + 2;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getrendertype.getInstance(49);
        getrendertype.getInstance(128);
        Enumeration elements = this.cca_continue.elements();
        while (elements.hasMoreElements()) {
            getrendertype.getInstance((CardinalConfigurationParameters) elements.nextElement());
        }
        getrendertype.getInstance(0);
        getrendertype.getInstance(0);
    }
}
