package com.cardinalcommerce.a;

import java.io.IOException;

public final class setChallengeTimeout extends getThreeDSRequestorAppURL {
    private static final byte[] Cardinal = {0};
    private static setChallengeTimeout cca_continue = new setChallengeTimeout(true);
    private static final byte[] configure = {-1};
    private static setChallengeTimeout getInstance = new setChallengeTimeout(false);
    public final byte[] init;

    private setChallengeTimeout(boolean z) {
        this.init = z ? configure : Cardinal;
    }

    public static setChallengeTimeout getInstance(Object obj) {
        if (obj == null || (obj instanceof setChallengeTimeout)) {
            return (setChallengeTimeout) obj;
        }
        throw new IllegalArgumentException(new StringBuilder("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    public static setChallengeTimeout init(boolean z) {
        return z ? cca_continue : getInstance;
    }

    static setChallengeTimeout init(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            return b == 0 ? getInstance : (b & 255) == 255 ? cca_continue : new setChallengeTimeout(bArr);
        }
        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        return (getthreedsrequestorappurl instanceof setChallengeTimeout) && this.init[0] == ((setChallengeTimeout) getthreedsrequestorappurl).init[0];
    }

    public final int hashCode() {
        return this.init[0];
    }

    public final String toString() {
        return this.init[0] != 0 ? "TRUE" : "FALSE";
    }

    public static setChallengeTimeout Cardinal(setEnableLogging setenablelogging) {
        getThreeDSRequestorAppURL onCReqSuccess = setenablelogging.configure != null ? setenablelogging.configure.onCReqSuccess() : null;
        return onCReqSuccess instanceof setChallengeTimeout ? getInstance((Object) onCReqSuccess) : init(((setUICustomization) onCReqSuccess).getInstance());
    }

    private setChallengeTimeout(byte[] bArr) {
        byte[] bArr2;
        if (bArr.length == 1) {
            byte b = bArr[0];
            if (b == 0) {
                bArr2 = Cardinal;
            } else if ((b & 255) == 255) {
                bArr2 = configure;
            } else if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.init = bArr2;
            return;
        }
        throw new IllegalArgumentException("byte value should have 1 byte in it");
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr = this.init;
        getrendertype.getInstance(1);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }
}
