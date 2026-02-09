package com.cardinalcommerce.a;

public final class ConfigParameters extends setRenderType {
    private final byte[] getInstance;
    private final byte[] init;

    public ConfigParameters(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        this.init = bArr3;
        byte[] bArr4 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr4, 0, bArr2.length);
        this.getInstance = bArr4;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment(0));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.init));
        getbackgroundcolor.getInstance.addElement(new setEnabledVisaCheckout(this.getInstance));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
