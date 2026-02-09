package com.braintreepayments.api;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class HttpRequest {
    private static final int THIRTY_SECONDS_MS = 30000;
    private final Map<String, String> additionalHeaders = new HashMap();
    private String baseUrl = "";
    private final int connectTimeout = 30000;
    private byte[] data;
    private Map<String, String> headers = null;
    private String method;
    private String path;
    private final int readTimeout = 30000;

    static HttpRequest newInstance() {
        return new HttpRequest();
    }

    HttpRequest() {
    }

    /* access modifiers changed from: package-private */
    public HttpRequest path(String str) {
        this.path = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public HttpRequest baseUrl(String str) {
        this.baseUrl = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public HttpRequest data(String str) {
        this.data = str.getBytes(StandardCharsets.UTF_8);
        return this;
    }

    /* access modifiers changed from: package-private */
    public HttpRequest method(String str) {
        this.method = str;
        return this;
    }

    /* access modifiers changed from: package-private */
    public HttpRequest addHeader(String str, String str2) {
        this.additionalHeaders.put(str, str2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public String getPath() {
        return this.path;
    }

    /* access modifiers changed from: package-private */
    public byte[] getData() {
        return this.data;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        byte[] bArr = this.data;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    /* access modifiers changed from: package-private */
    public String getMethod() {
        return this.method;
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> getHeaders() {
        if (this.headers == null) {
            HashMap hashMap = new HashMap();
            this.headers = hashMap;
            hashMap.put("Accept-Encoding", "gzip");
            this.headers.put("Accept-Language", Locale.getDefault().getLanguage());
            this.headers.putAll(this.additionalHeaders);
        }
        return Collections.unmodifiableMap(this.headers);
    }

    /* access modifiers changed from: package-private */
    public int getReadTimeout() {
        return this.readTimeout;
    }

    /* access modifiers changed from: package-private */
    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* access modifiers changed from: package-private */
    public URL getURL() throws MalformedURLException, URISyntaxException {
        if (this.path.startsWith("http")) {
            return new URL(this.path);
        }
        URI uri = new URL(this.baseUrl).toURI();
        return uri.resolve(join(uri.getPath(), this.path)).normalize().toURL();
    }

    private static String join(String str, String str2) {
        return new File(new File(str), str2).getPath();
    }
}
