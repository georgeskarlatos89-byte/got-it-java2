package com.facebook.react.common;

import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

public class StandardCharsets {
    public static final Charset UTF_16 = Charset.forName(HTTP.UTF_16);
    public static final Charset UTF_16BE = Charset.forName("UTF-16BE");
    public static final Charset UTF_16LE = Charset.forName("UTF-16LE");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
}
