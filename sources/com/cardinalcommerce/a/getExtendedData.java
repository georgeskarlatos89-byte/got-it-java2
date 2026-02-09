package com.cardinalcommerce.a;

import java.io.IOException;
import java.io.OutputStream;

public final class getExtendedData extends getRenderType {
    public getExtendedData(OutputStream outputStream) {
        super(outputStream);
    }

    /* access modifiers changed from: package-private */
    public final getRenderType cca_continue() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final getRenderType configure() {
        return this;
    }

    public final void getInstance(CardinalConfigurationParameters cardinalConfigurationParameters) throws IOException {
        if (cardinalConfigurationParameters != null) {
            cardinalConfigurationParameters.onCReqSuccess().getWarnings().getInstance(this);
            return;
        }
        throw new IOException("null object detected");
    }
}
