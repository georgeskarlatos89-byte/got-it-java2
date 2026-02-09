package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GM;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class CardinalValidateReceiver extends getThreeDSRequestorAppURL implements isLocationDataConsentGiven {
    private static final char[] cca_continue = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final byte[] getInstance;

    /* access modifiers changed from: package-private */
    public final int Cardinal() {
        return GM.Mappings.Cardinal(this.getInstance.length) + 1 + this.getInstance.length;
    }

    public final String cca_continue() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new getRenderType(byteArrayOutputStream).getInstance((CardinalConfigurationParameters) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = cca_continue;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & Ascii.SI]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new isEnableDFSync("internal error encoding UniversalString");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean configure() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean configure(getThreeDSRequestorAppURL getthreedsrequestorappurl) {
        if (!(getthreedsrequestorappurl instanceof CardinalValidateReceiver)) {
            return false;
        }
        return getBackgroundColor.Cardinal(this.getInstance, ((CardinalValidateReceiver) getthreedsrequestorappurl).getInstance);
    }

    public final int hashCode() {
        return getBackgroundColor.init(this.getInstance);
    }

    public final String toString() {
        return cca_continue();
    }

    public CardinalValidateReceiver(byte[] bArr) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.getInstance = bArr2;
    }

    /* access modifiers changed from: package-private */
    public final void getInstance(getRenderType getrendertype) throws IOException {
        byte[] bArr;
        byte[] bArr2 = this.getInstance;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        getrendertype.getInstance(28);
        getrendertype.configure(bArr.length);
        getrendertype.configure.write(bArr);
    }
}
