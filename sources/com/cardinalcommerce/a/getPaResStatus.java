package com.cardinalcommerce.a;

import java.io.IOException;
import java.util.Enumeration;

public final class getPaResStatus extends isEnableLogging {
    public getPaResStatus() {
    }

    public getPaResStatus(CardinalConfigurationParameters cardinalConfigurationParameters) {
        super(cardinalConfigurationParameters);
    }

    public getPaResStatus(getBackgroundColor getbackgroundcolor) {
        super(getbackgroundcolor);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        Enumeration init = init();
        int i = 0;
        while (init.hasMoreElements()) {
            i += ((CardinalConfigurationParameters) init.nextElement()).onCReqSuccess().Cardinal();
        }
        return i + 2 + 2;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getrendertype.getInstance(48);
        getrendertype.getInstance(128);
        Enumeration init = init();
        while (init.hasMoreElements()) {
            getrendertype.getInstance((CardinalConfigurationParameters) init.nextElement());
        }
        getrendertype.getInstance(0);
        getrendertype.getInstance(0);
    }
}
