package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;
import java.util.Enumeration;
import org.objectweb.asm.Opcodes;

public final class Payload extends setEnableLogging {
    public Payload(boolean z, int i, CardinalConfigurationParameters cardinalConfigurationParameters) {
        super(z, i, cardinalConfigurationParameters);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        int init;
        boolean z = this.init;
        int Cardinal = this.configure.onCReqSuccess().Cardinal();
        if (this.cca_continue) {
            init = GM.Mappings.init(this.Cardinal) + GM.Mappings.Cardinal(Cardinal);
        } else {
            Cardinal--;
            init = GM.Mappings.init(this.Cardinal);
        }
        return init + Cardinal;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        boolean z = this.init;
        if (this.cca_continue) {
            return true;
        }
        return this.configure.onCReqSuccess().getWarnings().configure();
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        Enumeration enumeration;
        getrendertype.Cardinal(Opcodes.IF_ICMPNE, this.Cardinal);
        getrendertype.getInstance(128);
        boolean z = this.init;
        if (!this.cca_continue) {
            if (this.configure instanceof setUICustomization) {
                enumeration = this.configure instanceof getEciFlag ? ((getEciFlag) this.configure).cleanup() : new getEciFlag(((setUICustomization) this.configure).getInstance()).cleanup();
            } else if (this.configure instanceof isEnableLogging) {
                enumeration = ((isEnableLogging) this.configure).init();
            } else if (this.configure instanceof setEnableDFSync) {
                enumeration = ((setEnableDFSync) this.configure).cca_continue.elements();
            } else {
                throw new setProxyAddress(new StringBuilder("not implemented: ").append(this.configure.getClass().getName()).toString());
            }
            while (enumeration.hasMoreElements()) {
                getrendertype.getInstance((CardinalConfigurationParameters) enumeration.nextElement());
            }
        } else {
            getrendertype.getInstance(this.configure);
        }
        getrendertype.getInstance(0);
        getrendertype.getInstance(0);
    }
}
