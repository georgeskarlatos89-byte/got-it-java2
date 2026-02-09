package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;
import java.util.Enumeration;

public final class getProcessorTransactionId extends isEnableLogging {
    private int getInstance = -1;

    public getProcessorTransactionId() {
    }

    public getProcessorTransactionId(getBackgroundColor getbackgroundcolor) {
        super(getbackgroundcolor);
    }

    public getProcessorTransactionId(CardinalConfigurationParameters[] cardinalConfigurationParametersArr) {
        super(cardinalConfigurationParametersArr);
    }

    private int cleanup() throws IOException {
        if (this.getInstance < 0) {
            Enumeration init = init();
            int i = 0;
            while (init.hasMoreElements()) {
                i += ((CardinalConfigurationParameters) init.nextElement()).onCReqSuccess().getWarnings().Cardinal();
            }
            this.getInstance = i;
        }
        return this.getInstance;
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        int cleanup = cleanup();
        return GM.Mappings.Cardinal(cleanup) + 1 + cleanup;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getRenderType configure = getrendertype.configure();
        int cleanup = cleanup();
        getrendertype.getInstance(48);
        getrendertype.configure(cleanup);
        Enumeration init = init();
        while (init.hasMoreElements()) {
            configure.getInstance((CardinalConfigurationParameters) init.nextElement());
        }
    }
}
