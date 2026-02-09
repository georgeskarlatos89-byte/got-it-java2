package com.braintreepayments.api;

import com.braintreepayments.api.GraphQLConstants;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braintreepayments/api/BraintreeGraphQLResponseParser;", "Lcom/braintreepayments/api/HttpResponseParser;", "()V", "baseParser", "(Lcom/braintreepayments/api/HttpResponseParser;)V", "parse", "", "responseCode", "", "connection", "Ljava/net/HttpURLConnection;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* compiled from: BraintreeGraphQLResponseParser.kt */
public final class BraintreeGraphQLResponseParser implements HttpResponseParser {
    private final HttpResponseParser baseParser;

    public BraintreeGraphQLResponseParser(HttpResponseParser httpResponseParser) {
        Intrinsics.checkNotNullParameter(httpResponseParser, "baseParser");
        this.baseParser = httpResponseParser;
    }

    public BraintreeGraphQLResponseParser() {
        this(new BaseHttpResponseParser());
    }

    public String parse(int i, HttpURLConnection httpURLConnection) throws Exception {
        Intrinsics.checkNotNullParameter(httpURLConnection, "connection");
        String parse = this.baseParser.parse(i, httpURLConnection);
        JSONArray optJSONArray = new JSONObject(parse).optJSONArray(GraphQLConstants.Keys.ERRORS);
        if (optJSONArray == null) {
            Intrinsics.checkNotNullExpressionValue(parse, "response");
            return parse;
        }
        int length = optJSONArray.length();
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject = optJSONArray.getJSONObject(i2);
            JSONObject optJSONObject = jSONObject.optJSONObject(GraphQLConstants.Keys.EXTENSIONS);
            String optString = Json.optString(jSONObject, "message", "An Unexpected Exception Occurred");
            if (optJSONObject != null) {
                String optString2 = Json.optString(optJSONObject, GraphQLConstants.Keys.LEGACY_CODE, "");
                String optString3 = Json.optString(optJSONObject, GraphQLConstants.Keys.ERROR_TYPE, "");
                if (Intrinsics.areEqual((Object) optString2, (Object) GraphQLConstants.LegacyErrorCodes.VALIDATION_NOT_ALLOWED)) {
                    throw new AuthorizationException(jSONObject.getString("message"));
                } else if (Intrinsics.areEqual((Object) optString3, (Object) GraphQLConstants.ErrorTypes.USER)) {
                    i2++;
                } else {
                    throw new UnexpectedException(optString);
                }
            } else {
                throw new UnexpectedException(optString);
            }
        }
        throw ErrorWithResponse.Companion.fromGraphQLJson$BraintreeCore_release(parse);
    }
}
