package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

abstract class DecompressingEntity extends HttpEntityWrapper {
    private static final int BUFFER_SIZE = 2048;
    private InputStream content;

    /* access modifiers changed from: package-private */
    public abstract InputStream getDecompressingInputStream(InputStream inputStream) throws IOException;

    public DecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity);
    }

    public InputStream getContent() throws IOException {
        if (!this.wrappedEntity.isStreaming()) {
            return getDecompressingInputStream(this.wrappedEntity.getContent());
        }
        if (this.content == null) {
            this.content = getDecompressingInputStream(this.wrappedEntity.getContent());
        }
        return this.content;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            InputStream content2 = getContent();
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = content2.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        return;
                    }
                }
            } finally {
                content2.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }
}
