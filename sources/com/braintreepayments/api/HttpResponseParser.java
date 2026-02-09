package com.braintreepayments.api;

import java.net.HttpURLConnection;

interface HttpResponseParser {
    String parse(int i, HttpURLConnection httpURLConnection) throws Exception;
}
