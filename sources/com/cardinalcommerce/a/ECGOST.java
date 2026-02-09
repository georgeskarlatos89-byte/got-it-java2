package com.cardinalcommerce.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class ECGOST extends Mappings {
    private boolean cca_continue = true;
    private int configure;
    private int getInstance;
    private boolean init = false;

    abstract class Mappings extends InputStream {
        protected final InputStream Cardinal;
        private int cca_continue;

        Mappings(InputStream inputStream, int i) {
            this.Cardinal = inputStream;
            this.cca_continue = i;
        }

        /* access modifiers changed from: protected */
        public final void cca_continue() {
            InputStream inputStream = this.Cardinal;
            if (inputStream instanceof ECGOST) {
                ((ECGOST) inputStream).configure(true);
            }
        }

        /* access modifiers changed from: package-private */
        public int getInstance() {
            return this.cca_continue;
        }
    }

    public ECGOST(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.getInstance = inputStream.read();
        int read = inputStream.read();
        this.configure = read;
        if (read >= 0) {
            configure();
            return;
        }
        throw new EOFException();
    }

    private boolean configure() {
        if (!this.init && this.cca_continue && this.getInstance == 0 && this.configure == 0) {
            this.init = true;
            cca_continue();
        }
        return this.init;
    }

    public final void configure(boolean z) {
        this.cca_continue = z;
        configure();
    }

    public final int read() throws IOException {
        if (configure()) {
            return -1;
        }
        int read = this.Cardinal.read();
        if (read >= 0) {
            int i = this.getInstance;
            this.getInstance = this.configure;
            this.configure = read;
            return i;
        }
        throw new EOFException();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.cca_continue || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.init) {
            return -1;
        }
        int read = this.Cardinal.read(bArr, i + 2, i2 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.getInstance;
            bArr[i + 1] = (byte) this.configure;
            this.getInstance = this.Cardinal.read();
            int read2 = this.Cardinal.read();
            this.configure = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
