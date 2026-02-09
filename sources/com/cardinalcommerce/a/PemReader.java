package com.cardinalcommerce.a;

import com.google.common.base.Ascii;
import java.security.spec.EncodedKeySpec;

public class PemReader extends EncodedKeySpec {
    private static final String[] getInstance = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};
    private final String cca_continue;

    public PemReader(byte[] bArr) {
        super(bArr);
        int i = 0;
        int i2 = (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i2 < bArr.length) {
            String instance = getTextFontSize.getInstance(getBackgroundColor.cca_continue(bArr, 4, i2));
            this.cca_continue = instance;
            if (!instance.startsWith("ecdsa")) {
                while (true) {
                    String[] strArr = getInstance;
                    if (i >= strArr.length) {
                        throw new IllegalArgumentException(new StringBuilder("unrecognised public key type ").append(this.cca_continue).toString());
                    } else if (!strArr[i].equals(this.cca_continue)) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
    }

    public String getFormat() {
        return "OpenSSH";
    }
}
