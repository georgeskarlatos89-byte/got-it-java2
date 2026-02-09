package com.cardinalcommerce.a;

import com.cardinalcommerce.a.IESCipher;

public final class setCheckState {
    final int Cardinal;
    final IESCipher.ECIESwithAESCBC cca_continue;
    private final int cleanup;
    final int configure;
    public final int getInstance;
    private final setCCAButtonDrawable init;
    private final int onValidated;

    protected setCheckState(IESCipher.ECIESwithAESCBC eCIESwithAESCBC) {
        if (eCIESwithAESCBC != null) {
            this.cca_continue = eCIESwithAESCBC;
            if (eCIESwithAESCBC != null) {
                String configure2 = eCIESwithAESCBC.configure();
                int instance = configure2.equals("SHAKE128") ? 32 : configure2.equals("SHAKE256") ? 64 : eCIESwithAESCBC.getInstance();
                this.getInstance = instance;
                int i = 16;
                this.Cardinal = 16;
                double d = (double) (instance * 8);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i >>= 1;
                    if (i == 0) {
                        break;
                    }
                    i3++;
                }
                int ceil = (int) Math.ceil(d / ((double) i3));
                this.onValidated = ceil;
                int i4 = ceil * (this.Cardinal - 1);
                int i5 = 0;
                while (true) {
                    i4 >>= 1;
                    if (i4 == 0) {
                        break;
                    }
                    i5++;
                }
                int i6 = this.Cardinal;
                while (true) {
                    i6 >>= 1;
                    if (i6 == 0) {
                        break;
                    }
                    i2++;
                }
                int i7 = (i5 / i2) + 1;
                this.cleanup = i7;
                int i8 = this.onValidated + i7;
                this.configure = i8;
                setOnFocusChangeListener instance2 = setOnFocusChangeListener.getInstance(eCIESwithAESCBC.configure(), this.getInstance, this.Cardinal, i8);
                this.init = instance2;
                if (instance2 == null) {
                    throw new IllegalArgumentException(new StringBuilder("cannot find OID for digest algorithm: ").append(eCIESwithAESCBC.configure()).toString());
                }
                return;
            }
            throw new NullPointerException("digest == null");
        }
        throw new NullPointerException("digest == null");
    }
}
