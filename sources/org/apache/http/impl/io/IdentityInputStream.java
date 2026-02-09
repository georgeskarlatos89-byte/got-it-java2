package org.apache.http.impl.io;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.io.BufferInfo;
import org.apache.http.io.SessionInputBuffer;

public class IdentityInputStream extends InputStream {
    private boolean closed = false;

    /* renamed from: in  reason: collision with root package name */
    private final SessionInputBuffer f17in;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        if (sessionInputBuffer != null) {
            this.f17in = sessionInputBuffer;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f17in;
        if (sessionInputBuffer instanceof BufferInfo) {
            return ((BufferInfo) sessionInputBuffer).length();
        }
        return 0;
    }

    public void close() throws IOException {
        this.closed = true;
    }

    public int read() throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f17in.read();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f17in.read(bArr, i, i2);
    }
}
