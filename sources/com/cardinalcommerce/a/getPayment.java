package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import com.cardinalcommerce.a.getRenderType;
import java.io.IOException;
import org.objectweb.asm.Opcodes;

public final class getPayment extends setEnableLogging {
    public getPayment(CardinalConfigurationParameters cardinalConfigurationParameters) {
        super(true, 0, cardinalConfigurationParameters);
    }

    public getPayment(boolean z, int i, CardinalConfigurationParameters cardinalConfigurationParameters) {
        super(z, i, cardinalConfigurationParameters);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() throws IOException {
        int init;
        boolean z = this.init;
        int Cardinal = this.configure.onCReqSuccess().getWarnings().Cardinal();
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
        boolean z = this.init;
        getThreeDSRequestorAppURL warnings = this.configure.onCReqSuccess().getWarnings();
        boolean z2 = this.cca_continue;
        int i = Opcodes.IF_ICMPNE;
        if (z2) {
            getrendertype.Cardinal(Opcodes.IF_ICMPNE, this.Cardinal);
            getrendertype.configure(warnings.Cardinal());
            getrendertype.getInstance((CardinalConfigurationParameters) warnings);
            return;
        }
        if (!warnings.configure()) {
            i = 128;
        }
        getrendertype.Cardinal(i, this.Cardinal);
        if (warnings != null) {
            warnings.getInstance(new getRenderType.getInstance(getrendertype.configure));
            return;
        }
        throw new IOException("null object detected");
    }
}
