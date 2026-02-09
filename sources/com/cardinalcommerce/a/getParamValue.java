package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.IESCipher;
import com.cardinalcommerce.a.KeyAgreementSpi;

public final class getParamValue implements GMCipherSpi.SM2withRMD {
    private int Cardinal;
    private IESCipher.ECIESwithAESCBC cca_continue;
    private int configure;
    private int getInstance;
    private int init;

    public getParamValue() {
        this((byte) 0);
    }

    private getParamValue(byte b) {
        this(11, 50, (IESCipher.ECIESwithAESCBC) null);
    }

    private getParamValue(int i, int i2, IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        this.configure = 11;
        this.getInstance = 2048;
        this.init = 50;
        int i3 = 2049;
        while (true) {
            if (i3 >= 4096) {
                i3 = 0;
                break;
            } else if (KeyAgreementSpi.MQVwithSHA1KDF.cca_continue(i3)) {
                break;
            } else {
                i3 += 2;
            }
        }
        this.Cardinal = i3;
        this.cca_continue = eCIESwithAESCBC;
    }
}
