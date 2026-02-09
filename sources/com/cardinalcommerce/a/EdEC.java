package com.cardinalcommerce.a;

import com.cardinalcommerce.a.ECGOST;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public interface EdEC {

    public final class Mappings extends ECGOST.Mappings {
        private static final byte[] cca_continue = new byte[0];
        int configure;
        private final int init;

        public Mappings(InputStream inputStream, int i) {
            super(inputStream, i);
            if (i >= 0) {
                this.init = i;
                this.configure = i;
                if (i == 0) {
                    cca_continue();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("negative lengths not allowed");
        }

        public final byte[] configure() throws IOException {
            int i = this.configure;
            if (i == 0) {
                return cca_continue;
            }
            byte[] bArr = new byte[i];
            int init2 = i - setHeadingTextFontSize.init(this.Cardinal, bArr);
            this.configure = init2;
            if (init2 == 0) {
                cca_continue();
                return bArr;
            }
            throw new EOFException(new StringBuilder("DEF length ").append(this.init).append(" object truncated by ").append(this.configure).toString());
        }

        /* access modifiers changed from: package-private */
        public final int getInstance() {
            return this.configure;
        }

        public final int read() throws IOException {
            if (this.configure == 0) {
                return -1;
            }
            int read = this.Cardinal.read();
            if (read >= 0) {
                int i = this.configure - 1;
                this.configure = i;
                if (i == 0) {
                    cca_continue();
                }
                return read;
            }
            throw new EOFException(new StringBuilder("DEF length ").append(this.init).append(" object truncated by ").append(this.configure).toString());
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.configure;
            if (i3 == 0) {
                return -1;
            }
            int read = this.Cardinal.read(bArr, i, Math.min(i2, i3));
            if (read >= 0) {
                int i4 = this.configure - read;
                this.configure = i4;
                if (i4 == 0) {
                    cca_continue();
                }
                return read;
            }
            throw new EOFException(new StringBuilder("DEF length ").append(this.init).append(" object truncated by ").append(this.configure).toString());
        }
    }

    getThreeDSRequestorAppURL init() throws IOException;
}
