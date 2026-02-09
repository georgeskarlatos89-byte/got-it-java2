package com.braintreepayments.api;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;

class SynchronousHttpClient {
    private final HttpResponseParser parser;
    private SSLSocketFactory socketFactory;

    SynchronousHttpClient(SSLSocketFactory sSLSocketFactory, HttpResponseParser httpResponseParser) {
        this.parser = httpResponseParser;
        if (sSLSocketFactory != null) {
            this.socketFactory = sSLSocketFactory;
            return;
        }
        try {
            this.socketFactory = TLSSocketFactory.newInstance();
        } catch (SSLException unused) {
            this.socketFactory = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.socketFactory = sSLSocketFactory;
    }

    /* access modifiers changed from: package-private */
    public String request(HttpRequest httpRequest) throws Exception {
        if (httpRequest.getPath() != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) httpRequest.getURL().openConnection();
            if (httpURLConnection instanceof HttpsURLConnection) {
                SSLSocketFactory sSLSocketFactory = this.socketFactory;
                if (sSLSocketFactory != null) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                } else {
                    throw new SSLException("SSLSocketFactory was not set or failed to initialize");
                }
            }
            String method = httpRequest.getMethod();
            httpURLConnection.setRequestMethod(method);
            httpURLConnection.setReadTimeout(httpRequest.getReadTimeout());
            httpURLConnection.setConnectTimeout(httpRequest.getConnectTimeout());
            for (Map.Entry next : httpRequest.getHeaders().entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            if (method != null && method.equals("POST")) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(httpRequest.getData());
                outputStream.flush();
                outputStream.close();
                httpRequest.dispose();
            }
            try {
                return this.parser.parse(httpURLConnection.getResponseCode(), httpURLConnection);
            } finally {
                httpURLConnection.disconnect();
            }
        } else {
            throw new IllegalArgumentException("Path cannot be null");
        }
    }
}
