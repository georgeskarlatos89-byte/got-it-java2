package com.cardinalcommerce.a;

import java.io.IOException;

public abstract class getThreeDSRequestorAppURL extends setRenderType {
    public static getThreeDSRequestorAppURL Cardinal(byte[] bArr) throws IOException {
        getProxyAddress getproxyaddress = new getProxyAddress(bArr);
        try {
            getThreeDSRequestorAppURL configure = getproxyaddress.configure();
            if (getproxyaddress.available() == 0) {
                return configure;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* access modifiers changed from: protected */
    public abstract int Cardinal() throws IOException;

    /* access modifiers changed from: protected */
    public abstract boolean configure();

    /* access modifiers changed from: protected */
    public abstract boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardinalConfigurationParameters) && configure(((CardinalConfigurationParameters) obj).onCReqSuccess());
    }

    /* access modifiers changed from: protected */
    public abstract void getInstance(getRenderType getrendertype) throws IOException;

    /* access modifiers changed from: package-private */
    public getThreeDSRequestorAppURL getSDKVersion() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public getThreeDSRequestorAppURL getWarnings() {
        return this;
    }

    public final getThreeDSRequestorAppURL onCReqSuccess() {
        return this;
    }
}
