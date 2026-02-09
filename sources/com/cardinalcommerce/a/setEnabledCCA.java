package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;

public final class setEnabledCCA extends getThreeDSRequestorAppURL implements isLocationDataConsentGiven {
    private final byte[] Cardinal;

    setEnabledCCA(byte[] bArr) {
        this.Cardinal = bArr;
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.Cardinal.length) + 1 + this.Cardinal.length;
    }

    public final String cca_continue() {
        return getTextFontSize.getInstance(this.Cardinal);
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof setEnabledCCA)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.Cardinal, ((setEnabledCCA) getthreedsrequestorappurl).Cardinal);
    }

    public final int hashCode() {
        return getBackgroundColor.init(this.Cardinal);
    }

    public final String toString() {
        return cca_continue();
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr = this.Cardinal;
        getrendertype.getInstance(18);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }
}
