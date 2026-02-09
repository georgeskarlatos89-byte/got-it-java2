package com.cardinalcommerce.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public abstract class setRenderType implements CardinalConfigurationParameters {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardinalConfigurationParameters)) {
            return false;
        }
        return onCReqSuccess().equals(((CardinalConfigurationParameters) obj).onCReqSuccess());
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new getRenderType(byteArrayOutputStream).getInstance((CardinalConfigurationParameters) this);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return onCReqSuccess().hashCode();
    }

    public abstract getThreeDSRequestorAppURL onCReqSuccess();

    public final byte[] configure(String str) throws IOException {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            onCReqSuccess().getWarnings().getInstance(new getExtendedData(byteArrayOutputStream));
            return byteArrayOutputStream.toByteArray();
        } else if (!str.equals("DL")) {
            return getEncoded();
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            onCReqSuccess().getSDKVersion().getInstance(new EC(byteArrayOutputStream2));
            return byteArrayOutputStream2.toByteArray();
        }
    }
}
