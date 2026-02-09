package com.braintreepayments.api;

import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpResponseParser;", "Lcom/braintreepayments/api/HttpResponseParser;", "baseParser", "(Lcom/braintreepayments/api/HttpResponseParser;)V", "parse", "", "responseCode", "", "connection", "Ljava/net/HttpURLConnection;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeHttpResponseParser.kt */
public final class BraintreeHttpResponseParser implements HttpResponseParser {
    private static final int AUTH_ERROR_CODE = 403;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int UNPROCESSABLE_ENTITY_ERROR_CODE = 422;
    private final HttpResponseParser baseParser;

    public BraintreeHttpResponseParser() {
        this((HttpResponseParser) null, 1, (DefaultConstructorMarker) null);
    }

    public BraintreeHttpResponseParser(HttpResponseParser httpResponseParser) {
        Intrinsics.checkNotNullParameter(httpResponseParser, "baseParser");
        this.baseParser = httpResponseParser;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BraintreeHttpResponseParser(HttpResponseParser httpResponseParser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BaseHttpResponseParser() : httpResponseParser);
    }

    public String parse(int i, HttpURLConnection httpURLConnection) throws Exception {
        Intrinsics.checkNotNullParameter(httpURLConnection, "connection");
        try {
            String parse = this.baseParser.parse(i, httpURLConnection);
            Intrinsics.checkNotNullExpressionValue(parse, "{\n        baseParser.par…seCode, connection)\n    }");
            return parse;
        } catch (AuthorizationException e) {
            throw new AuthorizationException(new ErrorWithResponse(403, e.getMessage()).getMessage());
        } catch (UnprocessableEntityException e2) {
            throw new ErrorWithResponse(422, e2.getMessage());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpResponseParser$Companion;", "", "()V", "AUTH_ERROR_CODE", "", "UNPROCESSABLE_ENTITY_ERROR_CODE", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* compiled from: BraintreeHttpResponseParser.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
