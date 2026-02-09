package com.braintreepayments.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpStatus;

class BaseHttpResponseParser implements HttpResponseParser {
    private static final int HTTP_TOO_MANY_REQUESTS = 429;
    private static final int HTTP_UNPROCESSABLE_ENTITY = 422;
    private static final int HTTP_UPGRADE_REQUIRED = 426;

    BaseHttpResponseParser() {
    }

    public String parse(int i, HttpURLConnection httpURLConnection) throws Exception {
        String parseBody = parseBody(i, httpURLConnection);
        if (i != 400) {
            if (i == 401) {
                throw new AuthenticationException(parseBody);
            } else if (i == 403) {
                throw new AuthorizationException(parseBody);
            } else if (i != 422) {
                if (i == HTTP_UPGRADE_REQUIRED) {
                    throw new UpgradeRequiredException(parseBody);
                } else if (i == HTTP_TOO_MANY_REQUESTS) {
                    throw new RateLimitException("You are being rate-limited. Please try again in a few minutes.");
                } else if (i == 500) {
                    throw new ServerException(parseBody);
                } else if (i != 503) {
                    switch (i) {
                        case 200:
                        case HttpStatus.SC_CREATED /*201*/:
                        case HttpStatus.SC_ACCEPTED /*202*/:
                            return parseBody;
                        default:
                            throw new UnexpectedException(parseBody);
                    }
                } else {
                    throw new ServiceUnavailableException(parseBody);
                }
            }
        }
        throw new UnprocessableEntityException(parseBody);
    }

    private String parseBody(int i, HttpURLConnection httpURLConnection) throws IOException {
        boolean equals = "gzip".equals(httpURLConnection.getContentEncoding());
        if (i == HTTP_TOO_MANY_REQUESTS) {
            return null;
        }
        switch (i) {
            case 200:
            case HttpStatus.SC_CREATED /*201*/:
            case HttpStatus.SC_ACCEPTED /*202*/:
                return readStream(httpURLConnection.getInputStream(), equals);
            default:
                return readStream(httpURLConnection.getErrorStream(), equals);
        }
    }

    private String readStream(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
        return str;
    }
}
