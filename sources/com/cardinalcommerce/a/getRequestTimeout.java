package com.cardinalcommerce.a;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public abstract class getRequestTimeout extends getThreeDSRequestorAppURL implements isLocationDataConsentGiven {
    private static final char[] Cardinal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] getInstance;
    protected final int init;

    static getRequestTimeout init(int i, InputStream inputStream) throws IOException {
        if (i > 0) {
            int read = inputStream.read();
            int i2 = i - 1;
            byte[] bArr = new byte[i2];
            if (i2 != 0) {
                if (setHeadingTextFontSize.init(inputStream, bArr) != i2) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                } else if (read > 0 && read < 8) {
                    byte b = bArr[i2 - 1];
                    if (b != ((byte) ((255 << read) & b))) {
                        return new PrivateKeyInfo(bArr, read);
                    }
                }
            }
            return new getDeviceFingerprint(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    public final String cca_continue() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new getRenderType(byteArrayOutputStream).getInstance((CardinalConfigurationParameters) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = Cardinal;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & Ascii.SI]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new isEnableDFSync(new StringBuilder("Internal error encoding BitString: ").append(e.getMessage()).toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof getRequestTimeout)) {
            return false;
        }
        getRequestTimeout getrequesttimeout = (getRequestTimeout) getthreedsrequestorappurl;
        return this.init == getrequesttimeout.init && getBackgroundColor.Cardinal(getInstance(), getrequesttimeout.getInstance());
    }

    /* access modifiers changed from: package-private */
    public abstract void getInstance(getRenderType getrendertype) throws IOException;

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getSDKVersion() {
        return new PrivateKeyInfo(this.getInstance, this.init);
    }

    /* access modifiers changed from: package-private */
    public final getThreeDSRequestorAppURL getWarnings() {
        return new getDeviceFingerprint(this.getInstance, this.init);
    }

    public int hashCode() {
        return this.init ^ getBackgroundColor.init(getInstance());
    }

    public final int onValidated() {
        return this.init;
    }

    public String toString() {
        return cca_continue();
    }

    public getRequestTimeout(byte[] bArr, int i) {
        byte[] bArr2;
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            if (bArr == null) {
                bArr2 = null;
            } else {
                byte[] bArr3 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                bArr2 = bArr3;
            }
            this.getInstance = bArr2;
            this.init = i;
        }
    }

    public final byte[] init() {
        if (this.init == 0) {
            byte[] bArr = this.getInstance;
            if (bArr == null) {
                return null;
            }
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public final byte[] getInstance() {
        byte[] bArr;
        byte[] bArr2 = this.getInstance;
        int i = this.init;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        if (i > 0) {
            int length = bArr2.length - 1;
            bArr[length] = (byte) ((255 << i) & bArr[length]);
        }
        return bArr;
    }
}
