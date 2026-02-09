package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;
import java.math.BigInteger;

public final class setRequestTimeout extends getThreeDSRequestorAppURL {
    private static setRequestTimeout[] cca_continue = new setRequestTimeout[12];
    public final byte[] Cardinal;

    public setRequestTimeout(int i) {
        this.Cardinal = BigInteger.valueOf((long) i).toByteArray();
    }

    public static setRequestTimeout cca_continue(Object obj) {
        if (obj == null || (obj instanceof setRequestTimeout)) {
            return (setRequestTimeout) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (setRequestTimeout) Cardinal((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(new StringBuilder("encoding error in getInstance: ").append(e.toString()).toString());
            }
        } else {
            throw new IllegalArgumentException(new StringBuilder("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.Cardinal.length) + 1 + this.Cardinal.length;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof setRequestTimeout)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.Cardinal, ((setRequestTimeout) getthreedsrequestorappurl).Cardinal);
    }

    public final int hashCode() {
        return getBackgroundColor.init(this.Cardinal);
    }

    private setRequestTimeout(byte[] bArr) {
        byte[] bArr2;
        if (getTextColor.getInstance("com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.allow_unsafe_integer") || !setEnvironment.getInstance(bArr)) {
            if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.Cardinal = bArr2;
            return;
        }
        throw new IllegalArgumentException("malformed enumerated");
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr = this.Cardinal;
        getrendertype.getInstance(10);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }

    static setRequestTimeout cca_continue(byte[] bArr) {
        if (bArr.length > 1) {
            return new setRequestTimeout(bArr);
        }
        if (bArr.length != 0) {
            byte b = bArr[0] & 255;
            setRequestTimeout[] setrequesttimeoutArr = cca_continue;
            byte[] bArr2 = null;
            if (b >= setrequesttimeoutArr.length) {
                if (bArr != null) {
                    bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
                return new setRequestTimeout(bArr2);
            }
            setRequestTimeout setrequesttimeout = setrequesttimeoutArr[b];
            if (setrequesttimeout == null) {
                if (bArr != null) {
                    bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
                setrequesttimeout = new setRequestTimeout(bArr2);
                setrequesttimeoutArr[b] = setrequesttimeout;
            }
            return setrequesttimeout;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }
}
