package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;

public final class setEnabledPaypal extends getThreeDSRequestorAppURL implements isLocationDataConsentGiven {
    private final char[] getInstance;

    setEnabledPaypal(char[] cArr) {
        this.getInstance = cArr;
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.getInstance.length << 1) + 1 + (this.getInstance.length << 1);
    }

    public final String cca_continue() {
        return new String(this.getInstance);
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        getrendertype.getInstance(30);
        getrendertype.configure(this.getInstance.length << 1);
        int i = 0;
        while (true) {
            char[] cArr = this.getInstance;
            if (i != cArr.length) {
                char c = cArr[i];
                getrendertype.getInstance((int) (byte) (c >> 8));
                getrendertype.getInstance((int) (byte) c);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return cca_continue();
    }

    public final int hashCode() {
        char[] cArr = this.getInstance;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* access modifiers changed from: protected */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof setEnabledPaypal)) {
            return false;
        }
        char[] cArr = this.getInstance;
        char[] cArr2 = ((setEnabledPaypal) getthreedsrequestorappurl).getInstance;
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
            return false;
        }
        for (int i = 0; i != cArr.length; i++) {
            if (cArr[i] != cArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
