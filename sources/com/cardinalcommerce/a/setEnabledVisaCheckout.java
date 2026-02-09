package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;

public final class setEnabledVisaCheckout extends setUICustomization {
    public setEnabledVisaCheckout(CardinalConfigurationParameters cardinalConfigurationParameters) throws IOException {
        super(cardinalConfigurationParameters.onCReqSuccess().configure("DER"));
    }

    public setEnabledVisaCheckout(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.getInstance.length) + 1 + this.getInstance.length;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr = this.getInstance;
        getrendertype.getInstance(4);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }
}
