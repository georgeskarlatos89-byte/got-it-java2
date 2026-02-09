package com.nimbusds.jose.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class DefaultResourceRetriever extends AbstractRestrictedResourceRetriever implements RestrictedResourceRetriever {
    public DefaultResourceRetriever() {
        this(0, 0);
    }

    public DefaultResourceRetriever(int i, int i2) {
        this(i, i2, 0);
    }

    public DefaultResourceRetriever(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    /* JADX INFO: finally extract failed */
    public Resource retrieveResource(URL url) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(getConnectTimeout());
            httpURLConnection.setReadTimeout(getReadTimeout());
            InputStream inputStream = httpURLConnection.getInputStream();
            if (getSizeLimit() > 0) {
                inputStream = new BoundedInputStream(inputStream, (long) getSizeLimit());
            }
            try {
                String readInputStreamToString = IOUtils.readInputStreamToString(inputStream, Charset.forName("UTF-8"));
                inputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                if (responseCode <= 299 && responseCode >= 200) {
                    return new Resource(readInputStreamToString, httpURLConnection.getContentType());
                }
                throw new IOException("HTTP " + responseCode + ": " + responseMessage);
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        } catch (ClassCastException e) {
            throw new IOException("Couldn't open HTTP(S) connection: " + e.getMessage(), e);
        }
    }
}
