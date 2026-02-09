package com.android.volley.cronet;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.AuthFailureError;
import com.android.volley.Header;
import com.android.volley.Request;
import com.android.volley.RequestTask;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.AsyncHttpStack;
import com.android.volley.toolbox.ByteArrayPool;
import com.android.volley.toolbox.HttpClientStack;
import com.android.volley.toolbox.HttpResponse;
import com.android.volley.toolbox.PoolingByteArrayOutputStream;
import com.android.volley.toolbox.UrlRewriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

public class CronetHttpStack extends AsyncHttpStack {
    private final CronetEngine mCronetEngine;
    /* access modifiers changed from: private */
    public final CurlCommandLogger mCurlCommandLogger;
    /* access modifiers changed from: private */
    public final boolean mCurlLoggingEnabled;
    private final boolean mLogAuthTokensInCurlCommands;
    /* access modifiers changed from: private */
    public final ByteArrayPool mPool;
    /* access modifiers changed from: private */
    public final RequestListener mRequestListener;
    private final UrlRewriter mUrlRewriter;

    public interface CurlCommandLogger {
        void logCurlCommand(String str);
    }

    private CronetHttpStack(CronetEngine cronetEngine, ByteArrayPool byteArrayPool, UrlRewriter urlRewriter, RequestListener requestListener, boolean z, CurlCommandLogger curlCommandLogger, boolean z2) {
        this.mCronetEngine = cronetEngine;
        this.mPool = byteArrayPool;
        this.mUrlRewriter = urlRewriter;
        this.mRequestListener = requestListener;
        this.mCurlLoggingEnabled = z;
        this.mCurlCommandLogger = curlCommandLogger;
        this.mLogAuthTokensInCurlCommands = z2;
        requestListener.initialize(this);
    }

    public void executeRequest(Request<?> request, Map<String, String> map, final AsyncHttpStack.OnRequestComplete onRequestComplete) {
        if (getBlockingExecutor() == null || getNonBlockingExecutor() == null) {
            throw new IllegalStateException("Must set blocking and non-blocking executors");
        }
        AnonymousClass1 r0 = new UrlRequest.Callback() {
            PoolingByteArrayOutputStream bytesReceived = null;
            WritableByteChannel receiveChannel = null;

            public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
                urlRequest.followRedirect();
            }

            public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(CronetHttpStack.this.mPool, CronetHttpStack.this.getContentLength(urlResponseInfo));
                this.bytesReceived = poolingByteArrayOutputStream;
                this.receiveChannel = Channels.newChannel(poolingByteArrayOutputStream);
                urlRequest.read(ByteBuffer.allocateDirect(1024));
            }

            public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
                byteBuffer.flip();
                try {
                    this.receiveChannel.write(byteBuffer);
                    byteBuffer.clear();
                    urlRequest.read(byteBuffer);
                } catch (IOException e) {
                    urlRequest.cancel();
                    onRequestComplete.onError(e);
                }
            }

            public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                onRequestComplete.onSuccess(new HttpResponse(urlResponseInfo.getHttpStatusCode(), CronetHttpStack.getHeaders(urlResponseInfo.getAllHeadersAsList()), this.bytesReceived.toByteArray()));
            }

            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                onRequestComplete.onError(cronetException);
            }
        };
        String url = request.getUrl();
        String rewriteUrl = this.mUrlRewriter.rewriteUrl(url);
        if (rewriteUrl == null) {
            onRequestComplete.onError(new IOException("URL blocked by rewriter: " + url));
            return;
        }
        getBlockingExecutor().execute(new SetUpRequestTask(request, rewriteUrl, this.mCronetEngine.newUrlRequestBuilder(rewriteUrl, r0, getNonBlockingExecutor()).allowDirectExecutor().disableCache().setPriority(getPriority(request)), map, onRequestComplete));
    }

    private class SetUpRequestTask<T> extends RequestTask<T> {
        Map<String, String> additionalHeaders;
        UrlRequest.Builder builder;
        AsyncHttpStack.OnRequestComplete callback;
        Request<T> request;
        String url;

        SetUpRequestTask(Request<T> request2, String str, UrlRequest.Builder builder2, Map<String, String> map, AsyncHttpStack.OnRequestComplete onRequestComplete) {
            super(request2);
            this.url = str;
            this.builder = builder2;
            this.additionalHeaders = map;
            this.callback = onRequestComplete;
            this.request = request2;
        }

        public void run() {
            try {
                CronetHttpStack.this.mRequestListener.onRequestPrepared(this.request, this.builder);
                CurlLoggedRequestParameters curlLoggedRequestParameters = new CurlLoggedRequestParameters();
                CronetHttpStack.this.setHttpMethod(curlLoggedRequestParameters, this.request);
                CronetHttpStack.this.setRequestHeaders(curlLoggedRequestParameters, this.request, this.additionalHeaders);
                curlLoggedRequestParameters.applyToRequest(this.builder, CronetHttpStack.this.getNonBlockingExecutor());
                UrlRequest build = this.builder.build();
                if (CronetHttpStack.this.mCurlLoggingEnabled) {
                    CronetHttpStack.this.mCurlCommandLogger.logCurlCommand(CronetHttpStack.this.generateCurlCommand(this.url, curlLoggedRequestParameters));
                }
                build.start();
            } catch (AuthFailureError e) {
                this.callback.onAuthError(e);
            }
        }
    }

    public static List<Header> getHeaders(List<Map.Entry<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : list) {
            arrayList.add(new Header((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void setHttpMethod(CurlLoggedRequestParameters curlLoggedRequestParameters, Request<?> request) throws AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    curlLoggedRequestParameters.setHttpMethod("POST");
                    addBodyIfExists(curlLoggedRequestParameters, request.getPostBodyContentType(), postBody);
                    return;
                }
                curlLoggedRequestParameters.setHttpMethod("GET");
                return;
            case 0:
                curlLoggedRequestParameters.setHttpMethod("GET");
                return;
            case 1:
                curlLoggedRequestParameters.setHttpMethod("POST");
                addBodyIfExists(curlLoggedRequestParameters, request.getBodyContentType(), request.getBody());
                return;
            case 2:
                curlLoggedRequestParameters.setHttpMethod(HttpPut.METHOD_NAME);
                addBodyIfExists(curlLoggedRequestParameters, request.getBodyContentType(), request.getBody());
                return;
            case 3:
                curlLoggedRequestParameters.setHttpMethod(HttpDelete.METHOD_NAME);
                return;
            case 4:
                curlLoggedRequestParameters.setHttpMethod(HttpHead.METHOD_NAME);
                return;
            case 5:
                curlLoggedRequestParameters.setHttpMethod(HttpOptions.METHOD_NAME);
                return;
            case 6:
                curlLoggedRequestParameters.setHttpMethod(HttpTrace.METHOD_NAME);
                return;
            case 7:
                curlLoggedRequestParameters.setHttpMethod(HttpClientStack.HttpPatch.METHOD_NAME);
                addBodyIfExists(curlLoggedRequestParameters, request.getBodyContentType(), request.getBody());
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* access modifiers changed from: private */
    public void setRequestHeaders(CurlLoggedRequestParameters curlLoggedRequestParameters, Request<?> request, Map<String, String> map) throws AuthFailureError {
        curlLoggedRequestParameters.putAllHeaders(map);
        curlLoggedRequestParameters.putAllHeaders(request.getHeaders());
    }

    private void addBodyIfExists(CurlLoggedRequestParameters curlLoggedRequestParameters, String str, byte[] bArr) {
        curlLoggedRequestParameters.setBody(str, bArr);
    }

    /* renamed from: com.android.volley.cronet.CronetHttpStack$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$android$volley$Request$Priority;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.android.volley.Request$Priority[] r0 = com.android.volley.Request.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$android$volley$Request$Priority = r0
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$android$volley$Request$Priority     // Catch:{ NoSuchFieldError -> 0x001d }
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.HIGH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$android$volley$Request$Priority     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$android$volley$Request$Priority     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.android.volley.Request$Priority r1 = com.android.volley.Request.Priority.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.cronet.CronetHttpStack.AnonymousClass2.<clinit>():void");
        }
    }

    private int getPriority(Request<?> request) {
        int i = AnonymousClass2.$SwitchMap$com$android$volley$Request$Priority[request.getPriority().ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3) ? 4 : 3;
        }
        return 2;
    }

    /* access modifiers changed from: private */
    public int getContentLength(UrlResponseInfo urlResponseInfo) {
        List list = (List) urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null) {
            return 1024;
        }
        return Integer.parseInt((String) list.get(0));
    }

    /* access modifiers changed from: private */
    public String generateCurlCommand(String str, CurlLoggedRequestParameters curlLoggedRequestParameters) {
        StringBuilder sb = new StringBuilder("curl ");
        sb.append("-X ").append(curlLoggedRequestParameters.getHttpMethod()).append(" ");
        for (Map.Entry next : curlLoggedRequestParameters.getHeaders().entrySet()) {
            sb.append("--header \"").append((String) next.getKey()).append(": ");
            if (this.mLogAuthTokensInCurlCommands || (!"Authorization".equals(next.getKey()) && !"Cookie".equals(next.getKey()))) {
                sb.append((String) next.getValue());
            } else {
                sb.append("[REDACTED]");
            }
            sb.append("\" ");
        }
        sb.append("\"").append(str).append("\"");
        if (curlLoggedRequestParameters.getBody() != null) {
            if (curlLoggedRequestParameters.getBody().length >= 1024) {
                sb.append(" [REQUEST BODY TOO LARGE TO INCLUDE]");
            } else if (isBinaryContentForLogging(curlLoggedRequestParameters)) {
                sb.insert(0, "echo '" + Base64.encodeToString(curlLoggedRequestParameters.getBody(), 2) + "' | base64 -d > /tmp/$$.bin; ").append(" --data-binary @/tmp/$$.bin");
            } else {
                try {
                    sb.append(" --data-ascii \"").append(new String(curlLoggedRequestParameters.getBody(), "UTF-8")).append("\"");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Could not encode to UTF-8", e);
                }
            }
        }
        return sb.toString();
    }

    private boolean isBinaryContentForLogging(CurlLoggedRequestParameters curlLoggedRequestParameters) {
        String str = curlLoggedRequestParameters.getHeaders().get("Content-Encoding");
        if (str != null) {
            for (String trim : TextUtils.split(str, ",")) {
                if ("gzip".equals(trim.trim())) {
                    return true;
                }
            }
        }
        String str2 = curlLoggedRequestParameters.getHeaders().get("Content-Type");
        if (str2 == null) {
            return true;
        }
        if (str2.startsWith("text/") || str2.startsWith("application/xml") || str2.startsWith("application/json")) {
            return false;
        }
        return true;
    }

    public static class Builder {
        private static final int DEFAULT_POOL_SIZE = 4096;
        private final Context context;
        private CronetEngine mCronetEngine;
        private CurlCommandLogger mCurlCommandLogger;
        private boolean mCurlLoggingEnabled;
        private boolean mLogAuthTokensInCurlCommands;
        private ByteArrayPool mPool;
        private RequestListener mRequestListener;
        private UrlRewriter mUrlRewriter;

        public Builder(Context context2) {
            this.context = context2;
        }

        public Builder setCronetEngine(CronetEngine cronetEngine) {
            this.mCronetEngine = cronetEngine;
            return this;
        }

        public Builder setPool(ByteArrayPool byteArrayPool) {
            this.mPool = byteArrayPool;
            return this;
        }

        public Builder setUrlRewriter(UrlRewriter urlRewriter) {
            this.mUrlRewriter = urlRewriter;
            return this;
        }

        public Builder setRequestListener(RequestListener requestListener) {
            this.mRequestListener = requestListener;
            return this;
        }

        public Builder setCurlLoggingEnabled(boolean z) {
            this.mCurlLoggingEnabled = z;
            return this;
        }

        public Builder setCurlCommandLogger(CurlCommandLogger curlCommandLogger) {
            this.mCurlCommandLogger = curlCommandLogger;
            return this;
        }

        public Builder setLogAuthTokensInCurlCommands(boolean z) {
            this.mLogAuthTokensInCurlCommands = z;
            return this;
        }

        public CronetHttpStack build() {
            if (this.mCronetEngine == null) {
                this.mCronetEngine = new CronetEngine.Builder(this.context).build();
            }
            if (this.mUrlRewriter == null) {
                this.mUrlRewriter = new UrlRewriter() {
                    public String rewriteUrl(String str) {
                        return str;
                    }
                };
            }
            if (this.mRequestListener == null) {
                this.mRequestListener = new RequestListener() {
                };
            }
            if (this.mPool == null) {
                this.mPool = new ByteArrayPool(4096);
            }
            if (this.mCurlCommandLogger == null) {
                this.mCurlCommandLogger = new CurlCommandLogger() {
                    public void logCurlCommand(String str) {
                        VolleyLog.v(str, new Object[0]);
                    }
                };
            }
            return new CronetHttpStack(this.mCronetEngine, this.mPool, this.mUrlRewriter, this.mRequestListener, this.mCurlLoggingEnabled, this.mCurlCommandLogger, this.mLogAuthTokensInCurlCommands);
        }
    }

    public static abstract class RequestListener {
        private CronetHttpStack mStack;

        public void onRequestPrepared(Request<?> request, UrlRequest.Builder builder) {
        }

        /* access modifiers changed from: package-private */
        public void initialize(CronetHttpStack cronetHttpStack) {
            this.mStack = cronetHttpStack;
        }

        /* access modifiers changed from: protected */
        public Executor getNonBlockingExecutor() {
            return this.mStack.getNonBlockingExecutor();
        }

        /* access modifiers changed from: protected */
        public Executor getBlockingExecutor() {
            return this.mStack.getBlockingExecutor();
        }
    }

    private static class CurlLoggedRequestParameters {
        private byte[] mBody;
        private final TreeMap<String, String> mHeaders;
        private String mHttpMethod;

        private CurlLoggedRequestParameters() {
            this.mHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        }

        /* access modifiers changed from: package-private */
        public TreeMap<String, String> getHeaders() {
            return this.mHeaders;
        }

        /* access modifiers changed from: package-private */
        public void putAllHeaders(Map<String, String> map) {
            this.mHeaders.putAll(map);
        }

        /* access modifiers changed from: package-private */
        public String getHttpMethod() {
            return this.mHttpMethod;
        }

        /* access modifiers changed from: package-private */
        public void setHttpMethod(String str) {
            this.mHttpMethod = str;
        }

        /* access modifiers changed from: package-private */
        public byte[] getBody() {
            return this.mBody;
        }

        /* access modifiers changed from: package-private */
        public void setBody(String str, byte[] bArr) {
            this.mBody = bArr;
            if (bArr != null && !this.mHeaders.containsKey("Content-Type")) {
                this.mHeaders.put("Content-Type", str);
            }
        }

        /* access modifiers changed from: package-private */
        public void applyToRequest(UrlRequest.Builder builder, ExecutorService executorService) {
            for (Map.Entry next : this.mHeaders.entrySet()) {
                builder.addHeader((String) next.getKey(), (String) next.getValue());
            }
            builder.setHttpMethod(this.mHttpMethod);
            byte[] bArr = this.mBody;
            if (bArr != null) {
                builder.setUploadDataProvider(UploadDataProviders.create(bArr), executorService);
            }
        }
    }
}
