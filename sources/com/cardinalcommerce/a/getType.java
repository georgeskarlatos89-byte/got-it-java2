package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;
import java.util.Enumeration;

public final class getType extends setEnableDFSync {
    private int init = -1;

    public getType() {
    }

    public getType(getBackgroundColor getbackgroundcolor) {
        super(getbackgroundcolor, true);
    }

    getType(getBackgroundColor getbackgroundcolor, byte b) {
        super(getbackgroundcolor, false);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        int cca_continue = cca_continue();
        return GM.Mappings.Cardinal(cca_continue) + 1 + cca_continue;
    }

    private int cca_continue() throws IOException {
        if (this.init < 0) {
            Enumeration elements = this.cca_continue.elements();
            int i = 0;
            while (elements.hasMoreElements()) {
                i += ((CardinalConfigurationParameters) elements.nextElement()).onCReqSuccess().getWarnings().Cardinal();
            }
            this.init = i;
        }
        return this.init;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getRenderType configure = getrendertype.configure();
        int cca_continue = cca_continue();
        getrendertype.getInstance(49);
        getrendertype.configure(cca_continue);
        Enumeration elements = this.cca_continue.elements();
        while (elements.hasMoreElements()) {
            configure.getInstance((CardinalConfigurationParameters) elements.nextElement());
        }
    }
}
