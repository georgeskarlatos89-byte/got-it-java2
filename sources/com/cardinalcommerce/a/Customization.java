package com.cardinalcommerce.a;

import com.cardinalcommerce.a.SignatureSpi;
import com.facebook.internal.security.CertificateUtil;
import com.google.common.base.Ascii;
import org.objectweb.asm.Opcodes;

public final class Customization {
    private static char[] getInstance = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] Cardinal;

    public Customization(byte[] bArr) {
        this(bArr, Opcodes.IF_ICMPNE);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Customization) {
            return getBackgroundColor.Cardinal(((Customization) obj).Cardinal, this.Cardinal);
        }
        return false;
    }

    public final int hashCode() {
        return getBackgroundColor.init(this.Cardinal);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.Cardinal.length; i++) {
            if (i > 0) {
                stringBuffer.append(CertificateUtil.DELIMITER);
            }
            stringBuffer.append(getInstance[(this.Cardinal[i] >>> 4) & 15]);
            stringBuffer.append(getInstance[this.Cardinal[i] & Ascii.SI]);
        }
        return stringBuffer.toString();
    }

    public Customization(byte[] bArr, int i) {
        if (i % 8 == 0) {
            SignatureSpi.ecCVCDSA512 eccvcdsa512 = new SignatureSpi.ecCVCDSA512(256);
            eccvcdsa512.init(bArr, 0, bArr.length);
            int i2 = i / 8;
            byte[] bArr2 = new byte[i2];
            eccvcdsa512.getInstance(bArr2, 0, i2);
            this.Cardinal = bArr2;
            return;
        }
        throw new IllegalArgumentException("bitLength must be a multiple of 8");
    }
}
