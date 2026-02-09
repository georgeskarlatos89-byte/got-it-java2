package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.security.PublicKey;

public final class setCCAOnScrollChangeListener implements PublicKey {
    public short[] cca_continue;
    public int configure;
    public short[][] getInstance;
    private short[][] init;

    public setCCAOnScrollChangeListener(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.configure = i;
        this.getInstance = sArr;
        this.init = sArr2;
        this.cca_continue = sArr3;
    }

    public final String getAlgorithm() {
        return "Rainbow";
    }

    public final byte[] getEncoded() {
        return getSeverity.configure(new BCDSAPrivateKey(PQCObjectIdentifiers.cca_continue, isEnabledVisaCheckout.configure), new getAcsRefNumber(this.configure, this.getInstance, this.init, this.cca_continue));
    }

    public final String getFormat() {
        return "X.509";
    }

    public setCCAOnScrollChangeListener(ButtonType buttonType) {
        this(buttonType.init, buttonType.Cardinal, buttonType.getInstance, buttonType.cca_continue);
    }

    public final short[][] Cardinal() {
        short[] sArr;
        short[][] sArr2 = new short[this.init.length][];
        int i = 0;
        while (true) {
            short[][] sArr3 = this.init;
            if (i == sArr3.length) {
                return sArr2;
            }
            short[] sArr4 = sArr3[i];
            if (sArr4 == null) {
                sArr = null;
            } else {
                short[] sArr5 = new short[sArr4.length];
                System.arraycopy(sArr4, 0, sArr5, 0, sArr4.length);
                sArr = sArr5;
            }
            sArr2[i] = sArr;
            i++;
        }
    }

    public final boolean equals(Object obj) {
        short[] sArr;
        if (obj != null && (obj instanceof setCCAOnScrollChangeListener)) {
            setCCAOnScrollChangeListener setccaonscrollchangelistener = (setCCAOnScrollChangeListener) obj;
            if (this.configure == setccaonscrollchangelistener.configure && protocolError.Cardinal(this.getInstance, setccaonscrollchangelistener.getInstance) && protocolError.Cardinal(this.init, setccaonscrollchangelistener.Cardinal())) {
                short[] sArr2 = this.cca_continue;
                short[] sArr3 = setccaonscrollchangelistener.cca_continue;
                if (sArr3 == null) {
                    sArr = null;
                } else {
                    short[] sArr4 = new short[sArr3.length];
                    System.arraycopy(sArr3, 0, sArr4, 0, sArr3.length);
                    sArr = sArr4;
                }
                if (protocolError.getInstance(sArr2, sArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.configure * 37;
        short[][] sArr = this.getInstance;
        int i2 = 0;
        for (int i3 = 0; i3 != sArr.length; i3++) {
            i2 = (i2 * 257) + getBackgroundColor.getInstance(sArr[i3]);
        }
        int i4 = (i + i2) * 37;
        short[][] sArr2 = this.init;
        int i5 = 0;
        for (int i6 = 0; i6 != sArr2.length; i6++) {
            i5 = (i5 * 257) + getBackgroundColor.getInstance(sArr2[i6]);
        }
        return ((i4 + i5) * 37) + getBackgroundColor.getInstance(this.cca_continue);
    }
}
