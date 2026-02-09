package com.cardinalcommerce.a;

public final class ECUtils extends setRenderType {
    private toJSONString Cardinal;
    private JSONNavi cca_continue;
    private final setUICustomization init;

    public ECUtils(JSONNavi jSONNavi) {
        this(jSONNavi, false);
    }

    public ECUtils(JSONNavi jSONNavi, boolean z) {
        this.cca_continue = jSONNavi.CardinalRenderType();
        this.init = new setEnabledVisaCheckout(jSONNavi.Cardinal(z));
    }

    public ECUtils(toJSONString tojsonstring, setUICustomization setuicustomization) {
        this(tojsonstring, setuicustomization.getInstance());
    }

    public final synchronized JSONNavi cca_continue() {
        if (this.cca_continue == null) {
            this.cca_continue = this.Cardinal.cca_continue(this.init.getInstance()).CardinalRenderType();
        }
        return this.cca_continue;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        return this.init;
    }

    public ECUtils(toJSONString tojsonstring, byte[] bArr) {
        byte[] bArr2;
        this.Cardinal = tojsonstring;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.init = new setEnabledVisaCheckout(bArr2);
    }
}
