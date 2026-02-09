package com.cardinalcommerce.a;

import com.cardinalcommerce.a.EdEC;
import java.io.IOException;
import java.io.InputStream;

public final class setEnabledHostedFields implements getUICustomization {
    private EdEC.Mappings getInstance;

    public setEnabledHostedFields(EdEC.Mappings mappings) {
        this.getInstance = mappings;
    }

    public final InputStream cca_continue() {
        return this.getInstance;
    }

    public final getThreeDSRequestorAppURL init() throws IOException {
        return new setEnabledVisaCheckout(this.getInstance.configure());
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        try {
            return init();
        } catch (IOException e) {
            throw new isEnableDFSync(new StringBuilder("IOException converting stream to byte array: ").append(e.getMessage()).toString(), e);
        }
    }
}
