package com.braintreepayments.api;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

class HttpClient {
    static final int MAX_RETRY_ATTEMPTS = 3;
    static final int NO_RETRY = 0;
    static final int RETRY_MAX_3_TIMES = 1;
    private final Map<URL, Integer> retryCountMap;
    private final Scheduler scheduler;
    /* access modifiers changed from: private */
    public final SynchronousHttpClient syncHttpClient;

    protected HttpClient(SSLSocketFactory sSLSocketFactory, HttpResponseParser httpResponseParser) {
        this(new SynchronousHttpClient(sSLSocketFactory, httpResponseParser), (Scheduler) new ThreadScheduler());
    }

    HttpClient(SynchronousHttpClient synchronousHttpClient, Scheduler scheduler2) {
        this.syncHttpClient = synchronousHttpClient;
        this.scheduler = scheduler2;
        this.retryCountMap = new HashMap();
    }

    /* access modifiers changed from: package-private */
    public String sendRequest(HttpRequest httpRequest) throws Exception {
        return this.syncHttpClient.request(httpRequest);
    }

    /* access modifiers changed from: package-private */
    public void sendRequest(HttpRequest httpRequest, HttpResponseCallback httpResponseCallback) {
        sendRequest(httpRequest, 0, httpResponseCallback);
    }

    /* access modifiers changed from: package-private */
    public void sendRequest(HttpRequest httpRequest, int i, HttpResponseCallback httpResponseCallback) {
        scheduleRequest(httpRequest, i, httpResponseCallback);
    }

    private void scheduleRequest(final HttpRequest httpRequest, final int i, final HttpResponseCallback httpResponseCallback) {
        resetRetryCount(httpRequest);
        this.scheduler.runOnBackground(new Runnable() {
            public void run() {
                try {
                    HttpClient.this.notifySuccessOnMainThread(httpResponseCallback, HttpClient.this.syncHttpClient.request(httpRequest));
                } catch (Exception e) {
                    int i = i;
                    if (i == 0) {
                        HttpClient.this.notifyErrorOnMainThread(httpResponseCallback, e);
                    } else if (i == 1) {
                        HttpClient.this.retryGet(httpRequest, i, httpResponseCallback);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void retryGet(HttpRequest httpRequest, int i, HttpResponseCallback httpResponseCallback) {
        URL url;
        try {
            url = httpRequest.getURL();
        } catch (MalformedURLException | URISyntaxException unused) {
            url = null;
        }
        if (url != null) {
            boolean z = true;
            int numRetriesSoFar = getNumRetriesSoFar(url) + 1;
            if (numRetriesSoFar >= 3) {
                z = false;
            }
            if (z) {
                scheduleRequest(httpRequest, i, httpResponseCallback);
                this.retryCountMap.put(url, Integer.valueOf(numRetriesSoFar));
                return;
            }
            notifyErrorOnMainThread(httpResponseCallback, new HttpClientException("Retry limit has been exceeded. Try again later."));
        }
    }

    private int getNumRetriesSoFar(URL url) {
        Integer num = this.retryCountMap.get(url);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private void resetRetryCount(HttpRequest httpRequest) {
        URL url;
        try {
            url = httpRequest.getURL();
        } catch (MalformedURLException | URISyntaxException unused) {
            url = null;
        }
        if (url != null) {
            this.retryCountMap.remove(url);
        }
    }

    /* access modifiers changed from: private */
    public void notifySuccessOnMainThread(final HttpResponseCallback httpResponseCallback, final String str) {
        if (httpResponseCallback != null) {
            this.scheduler.runOnMain(new Runnable() {
                public void run() {
                    httpResponseCallback.onResult(str, (Exception) null);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void notifyErrorOnMainThread(final HttpResponseCallback httpResponseCallback, final Exception exc) {
        if (httpResponseCallback != null) {
            this.scheduler.runOnMain(new Runnable() {
                public void run() {
                    httpResponseCallback.onResult((String) null, exc);
                }
            });
        }
    }
}
