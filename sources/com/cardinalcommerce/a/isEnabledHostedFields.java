package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;

public class isEnabledHostedFields extends getThreeDSRequestorAppURL implements isLocationDataConsentGiven {
    private final byte[] getInstance;

    public isEnabledHostedFields(String str) {
        this(str, (byte) 0);
    }

    private isEnabledHostedFields(String str, byte b) {
        if (str != null) {
            this.getInstance = getTextFontSize.configure(str);
            return;
        }
        throw new NullPointerException("string cannot be null");
    }

    isEnabledHostedFields(byte[] bArr) {
        this.getInstance = bArr;
    }

    public static isEnabledHostedFields cca_continue(Object obj) {
        if (obj == null || (obj instanceof isEnabledHostedFields)) {
            return (isEnabledHostedFields) obj;
        }
        throw new IllegalArgumentException(new StringBuilder("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.getInstance.length) + 1 + this.getInstance.length;
    }

    public final String cca_continue() {
        return getTextFontSize.getInstance(this.getInstance);
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof isEnabledHostedFields)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.getInstance, ((isEnabledHostedFields) getthreedsrequestorappurl).getInstance);
    }

    public int hashCode() {
        return getBackgroundColor.init(this.getInstance);
    }

    public String toString() {
        return cca_continue();
    }

    public static isEnabledHostedFields getInstance(setEnableLogging setenablelogging) {
        getThreeDSRequestorAppURL onCReqSuccess = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
        return onCReqSuccess instanceof isEnabledHostedFields ? cca_continue(onCReqSuccess) : new isEnabledHostedFields(((setUICustomization) onCReqSuccess).getInstance());
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr = this.getInstance;
        getrendertype.getInstance(22);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }
}
