package org.apache.http.client.entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class GzipDecompressingEntity extends DecompressingEntity {
    public Header getContentEncoding() {
        return null;
    }

    public long getContentLength() {
        return -1;
    }

    public GzipDecompressingEntity(HttpEntity httpEntity) {
        super(httpEntity);
    }

    /* access modifiers changed from: package-private */
    public InputStream getDecompressingInputStream(InputStream inputStream) throws IOException {
        return new GZIPInputStream(inputStream);
    }
}
