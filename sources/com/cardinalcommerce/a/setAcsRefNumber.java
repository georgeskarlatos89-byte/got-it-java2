package com.cardinalcommerce.a;

public final class setAcsRefNumber extends setRenderType {
    private final byte[] Cardinal;
    private final byte[] cca_continue;
    private final int configure;
    private final byte[] getInstance;
    private final byte[] getWarnings;
    private final byte[] init;

    public setAcsRefNumber(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        this.configure = i;
        byte[] bArr10 = null;
        if (bArr == null) {
            bArr6 = null;
        } else {
            bArr6 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        }
        this.Cardinal = bArr6;
        if (bArr2 == null) {
            bArr7 = null;
        } else {
            bArr7 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr7, 0, bArr2.length);
        }
        this.cca_continue = bArr7;
        if (bArr3 == null) {
            bArr8 = null;
        } else {
            bArr8 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr8, 0, bArr3.length);
        }
        this.getInstance = bArr8;
        if (bArr4 == null) {
            bArr9 = null;
        } else {
            bArr9 = new byte[bArr4.length];
            System.arraycopy(bArr4, 0, bArr9, 0, bArr4.length);
        }
        this.init = bArr9;
        if (bArr5 != null) {
            bArr10 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr10, 0, bArr5.length);
        }
        this.getWarnings = bArr10;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        getBackgroundColor getbackgroundcolor = new getBackgroundColor();
        getbackgroundcolor.getInstance.addElement(new setEnvironment(0));
        getBackgroundColor getbackgroundcolor2 = new getBackgroundColor();
        getbackgroundcolor2.getInstance.addElement(new setEnvironment((long) this.configure));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.Cardinal));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.cca_continue));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.getInstance));
        getbackgroundcolor2.getInstance.addElement(new setEnabledVisaCheckout(this.init));
        getbackgroundcolor.getInstance.addElement(new getProcessorTransactionId(getbackgroundcolor2));
        getbackgroundcolor.getInstance.addElement(new getPayment(true, 0, new setEnabledVisaCheckout(this.getWarnings)));
        return new getProcessorTransactionId(getbackgroundcolor);
    }
}
