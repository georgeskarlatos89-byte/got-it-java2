package com.cardinalcommerce.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class getJSON extends CardinalUiType {
    public getJSON(int i, getBackgroundColor getbackgroundcolor) {
        super(true, i, init(getbackgroundcolor));
    }

    private static byte[] init(getBackgroundColor getbackgroundcolor) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != getbackgroundcolor.getInstance.size()) {
            try {
                byteArrayOutputStream.write(((setRenderType) ((CardinalConfigurationParameters) getbackgroundcolor.getInstance.elementAt(i))).configure("BER"));
                i++;
            } catch (IOException e) {
                throw new isEnableDFSync("malformed object: ".concat(String.valueOf(e)), e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getrendertype.Cardinal(this.cca_continue ? 96 : 64, this.init);
        getrendertype.getInstance(128);
        getrendertype.configure.write(this.configure);
        getrendertype.getInstance(0);
        getrendertype.getInstance(0);
    }
}
