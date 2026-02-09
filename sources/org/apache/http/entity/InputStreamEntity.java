package org.apache.http.entity;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEntity extends AbstractHttpEntity {
    private static final int BUFFER_SIZE = 2048;
    private final InputStream content;
    private final long length;

    public boolean isRepeatable() {
        return false;
    }

    public boolean isStreaming() {
        return true;
    }

    public InputStreamEntity(InputStream inputStream, long j) {
        if (inputStream != null) {
            this.content = inputStream;
            this.length = j;
            return;
        }
        throw new IllegalArgumentException("Source input stream may not be null");
    }

    public long getContentLength() {
        return this.length;
    }

    public InputStream getContent() throws IOException {
        return this.content;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            InputStream inputStream = this.content;
            try {
                byte[] bArr = new byte[2048];
                long j = this.length;
                if (j < 0) {
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                    }
                } else {
                    while (true) {
                        if (j <= 0) {
                            break;
                        }
                        int read2 = inputStream.read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, j));
                        if (read2 == -1) {
                            break;
                        }
                        outputStream.write(bArr, 0, read2);
                        j -= (long) read2;
                    }
                }
            } finally {
                inputStream.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }

    public void consumeContent() throws IOException {
        this.content.close();
    }
}
