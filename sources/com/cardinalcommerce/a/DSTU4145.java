package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;
import java.util.Enumeration;

public final class DSTU4145 extends setEnableDFSync {
    private int init = -1;

    public final class Mappings extends isEnableLogging {
        private int Cardinal = -1;

        public Mappings() {
        }

        public Mappings(CardinalConfigurationParameters cardinalConfigurationParameters) {
            super(cardinalConfigurationParameters);
        }

        public Mappings(getBackgroundColor getbackgroundcolor) {
            super(getbackgroundcolor);
        }

        private int onValidated() throws IOException {
            if (this.Cardinal < 0) {
                Enumeration init = init();
                int i = 0;
                while (init.hasMoreElements()) {
                    i += ((CardinalConfigurationParameters) init.nextElement()).onCReqSuccess().getSDKVersion().Cardinal();
                }
                this.Cardinal = i;
            }
            return this.Cardinal;
        }

        /* access modifiers changed from: package-private */
        public final int Cardinal() throws IOException {
            int onValidated = onValidated();
            return GM.Mappings.Cardinal(onValidated) + 1 + onValidated;
        }

        /* access modifiers changed from: package-private */
        public final void getInstance(getRenderType getrendertype) throws IOException {
            getRenderType cca_continue = getrendertype.cca_continue();
            int onValidated = onValidated();
            getrendertype.getInstance(48);
            getrendertype.configure(onValidated);
            Enumeration init = init();
            while (init.hasMoreElements()) {
                cca_continue.getInstance((CardinalConfigurationParameters) init.nextElement());
            }
        }
    }

    public DSTU4145() {
    }

    public DSTU4145(CardinalConfigurationParameters cardinalConfigurationParameters) {
        super(cardinalConfigurationParameters);
    }

    public DSTU4145(getBackgroundColor getbackgroundcolor) {
        super(getbackgroundcolor, false);
    }

    public DSTU4145(CardinalConfigurationParameters[] cardinalConfigurationParametersArr) {
        super(cardinalConfigurationParametersArr);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        int init2 = init();
        return GM.Mappings.Cardinal(init2) + 1 + init2;
    }

    private int init() throws IOException {
        if (this.init < 0) {
            Enumeration elements = this.cca_continue.elements();
            int i = 0;
            while (elements.hasMoreElements()) {
                i += ((CardinalConfigurationParameters) elements.nextElement()).onCReqSuccess().getSDKVersion().Cardinal();
            }
            this.init = i;
        }
        return this.init;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getRenderType cca_continue = getrendertype.cca_continue();
        int init2 = init();
        getrendertype.getInstance(49);
        getrendertype.configure(init2);
        Enumeration elements = this.cca_continue.elements();
        while (elements.hasMoreElements()) {
            cca_continue.getInstance((CardinalConfigurationParameters) elements.nextElement());
        }
    }
}
