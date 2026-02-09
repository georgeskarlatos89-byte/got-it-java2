package com.cardinalcommerce.a;

import java.io.IOException;
import java.io.OutputStream;

public class getRenderType {
    public OutputStream configure;

    class getInstance extends getRenderType {
        private boolean cca_continue = true;

        public getInstance(OutputStream outputStream) {
            super(outputStream);
        }

        public final void getInstance(int i) throws IOException {
            if (this.cca_continue) {
                this.cca_continue = false;
            } else {
                getRenderType.super.getInstance(i);
            }
        }
    }

    public getRenderType(OutputStream outputStream) {
        this.configure = outputStream;
    }

    /* access modifiers changed from: package-private */
    public getRenderType cca_continue() {
        return new EC(this.configure);
    }

    /* access modifiers changed from: package-private */
    public getRenderType configure() {
        return new getExtendedData(this.configure);
    }

    public final void configure(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            getInstance((int) (byte) (i3 | 128));
            for (int i4 = (i3 - 1) << 3; i4 >= 0; i4 -= 8) {
                getInstance((int) (byte) (i >> i4));
            }
            return;
        }
        getInstance((int) (byte) i);
    }

    public void getInstance(int i) throws IOException {
        this.configure.write(i);
    }

    public void getInstance(CardinalConfigurationParameters cardinalConfigurationParameters) throws IOException {
        if (cardinalConfigurationParameters != null) {
            cardinalConfigurationParameters.onCReqSuccess().getInstance(this);
            return;
        }
        throw new IOException("null object detected");
    }

    /* access modifiers changed from: package-private */
    public final void Cardinal(int i, int i2) throws IOException {
        if (i2 < 31) {
            getInstance(i | i2);
            return;
        }
        getInstance(i | 31);
        if (i2 < 128) {
            getInstance(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        this.configure.write(bArr, i3, 5 - i3);
    }
}
