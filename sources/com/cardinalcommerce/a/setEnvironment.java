package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import java.io.IOException;
import java.math.BigInteger;

public final class setEnvironment extends getThreeDSRequestorAppURL {
    public final byte[] getInstance;

    public setEnvironment(long j) {
        this.getInstance = BigInteger.valueOf(j).toByteArray();
    }

    public setEnvironment(BigInteger bigInteger) {
        this.getInstance = bigInteger.toByteArray();
    }

    public setEnvironment(byte[] bArr) {
        this(bArr, true);
    }

    public static setEnvironment getInstance(Object obj) {
        if (obj == null || (obj instanceof setEnvironment)) {
            return (setEnvironment) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (setEnvironment) Cardinal((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(new StringBuilder("encoding error in getInstance: ").append(e.toString()).toString());
            }
        } else {
            throw new IllegalArgumentException(new StringBuilder("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    static boolean getInstance(byte[] bArr) {
        if (bArr.length > 1) {
            byte b = bArr[0];
            if (b == 0 && (bArr[1] & 128) == 0) {
                return true;
            }
            return b == -1 && (bArr[1] & 128) != 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.getInstance.length) + 1 + this.getInstance.length;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof setEnvironment)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.getInstance, ((setEnvironment) getthreedsrequestorappurl).getInstance);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.getInstance;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    setEnvironment(byte[] bArr, boolean z) {
        if (getTextColor.getInstance("com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.allow_unsafe_integer") || !getInstance(bArr)) {
            if (z) {
                if (bArr == null) {
                    bArr = null;
                } else {
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    bArr = bArr2;
                }
            }
            this.getInstance = bArr;
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr = this.getInstance;
        getrendertype.getInstance(2);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }

    public final String toString() {
        return new BigInteger(this.getInstance).toString();
    }
}
