package org.apache.http.impl.auth;

import androidx.autofill.HintConstants;
import com.facebook.internal.ServerProtocol;
import com.google.common.base.Ascii;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.params.AuthParams;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private static final int QOP_UNKNOWN = -1;
    private String a1;
    private String a2;
    private String cnonce;
    private boolean complete = false;
    private String lastNonce;
    private long nounceCount;

    public String getSchemeName() {
        return "digest";
    }

    public boolean isConnectionBased() {
        return false;
    }

    public void processChallenge(Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        if (getParameter("realm") == null) {
            throw new MalformedChallengeException("missing realm in challenge");
        } else if (getParameter("nonce") != null) {
            this.complete = true;
        } else {
            throw new MalformedChallengeException("missing nonce in challenge");
        }
    }

    public boolean isComplete() {
        if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.complete;
    }

    public void overrideParamter(String str, String str2) {
        getParameters().put(str, str2);
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (httpRequest != null) {
            getParameters().put("methodname", httpRequest.getRequestLine().getMethod());
            getParameters().put("uri", httpRequest.getRequestLine().getUri());
            if (getParameter("charset") == null) {
                getParameters().put("charset", AuthParams.getCredentialCharset(httpRequest.getParams()));
            }
            return createDigestHeader(credentials);
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    private static MessageDigest createMessageDigest(String str) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new UnsupportedDigestAlgorithmException("Unsupported algorithm in HTTP Digest authentication: " + str);
        }
    }

    private Header createDigestHeader(Credentials credentials) throws AuthenticationException {
        String str;
        char c;
        MessageDigest messageDigest;
        String str2;
        String str3;
        MessageDigest messageDigest2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("methodname");
        String parameter6 = getParameter("algorithm");
        if (parameter == null) {
            throw new IllegalStateException("URI may not be null");
        } else if (parameter2 == null) {
            throw new IllegalStateException("Realm may not be null");
        } else if (parameter3 != null) {
            String parameter7 = getParameter("qop");
            if (parameter7 != null) {
                str = "opaque";
                StringTokenizer stringTokenizer = new StringTokenizer(parameter7, ",");
                while (true) {
                    if (stringTokenizer.hasMoreTokens()) {
                        if (stringTokenizer.nextToken().trim().equals("auth")) {
                            c = 2;
                            break;
                        }
                    } else {
                        c = 65535;
                        break;
                    }
                }
            } else {
                str = "opaque";
                c = 0;
            }
            if (c != 65535) {
                if (parameter6 == null) {
                    parameter6 = "MD5";
                }
                String parameter8 = getParameter("charset");
                if (parameter8 == null) {
                    parameter8 = "ISO-8859-1";
                }
                String str9 = "MD5";
                if (!parameter6.equalsIgnoreCase("MD5-sess")) {
                    str9 = parameter6;
                }
                String str10 = "auth";
                try {
                    MessageDigest createMessageDigest = createMessageDigest(str9);
                    String str11 = parameter4;
                    String name = credentials.getUserPrincipal().getName();
                    String str12 = "algorithm";
                    String password = credentials.getPassword();
                    String str13 = "qop";
                    String str14 = "uri";
                    String str15 = parameter;
                    if (parameter3.equals(this.lastNonce)) {
                        messageDigest = createMessageDigest;
                        str2 = parameter8;
                        this.nounceCount++;
                    } else {
                        messageDigest = createMessageDigest;
                        str2 = parameter8;
                        this.nounceCount = 1;
                        this.cnonce = null;
                        this.lastNonce = parameter3;
                    }
                    StringBuilder sb = new StringBuilder(256);
                    String str16 = "nonce";
                    String str17 = parameter3;
                    new Formatter(sb, Locale.US).format("%08x", new Object[]{Long.valueOf(this.nounceCount)});
                    String sb2 = sb.toString();
                    if (this.cnonce == null) {
                        this.cnonce = createCnonce();
                    }
                    this.a1 = null;
                    this.a2 = null;
                    if (parameter6.equalsIgnoreCase("MD5-sess")) {
                        sb.setLength(0);
                        sb.append(name).append(':').append(parameter2).append(':').append(password);
                        messageDigest2 = messageDigest;
                        String encode = encode(messageDigest2.digest(EncodingUtils.getBytes(sb.toString(), str2)));
                        sb.setLength(0);
                        str3 = str17;
                        sb.append(encode).append(':').append(str3).append(':').append(this.cnonce);
                        this.a1 = sb.toString();
                    } else {
                        messageDigest2 = messageDigest;
                        str3 = str17;
                        sb.setLength(0);
                        sb.append(name).append(':').append(parameter2).append(':').append(password);
                        this.a1 = sb.toString();
                    }
                    String encode2 = encode(messageDigest2.digest(EncodingUtils.getBytes(this.a1, str2)));
                    if (c == 2) {
                        str4 = str15;
                        this.a2 = parameter5 + ':' + str4;
                    } else {
                        str4 = str15;
                        if (c != 1) {
                            this.a2 = parameter5 + ':' + str4;
                        } else {
                            throw new AuthenticationException("qop-int method is not suppported");
                        }
                    }
                    String encode3 = encode(messageDigest2.digest(EncodingUtils.getBytes(this.a2, str2)));
                    if (c == 0) {
                        sb.setLength(0);
                        sb.append(encode2).append(':').append(str3).append(':').append(encode3);
                        str5 = sb.toString();
                    } else {
                        sb.setLength(0);
                        StringBuilder append = sb.append(encode2).append(':').append(str3).append(':').append(sb2).append(':').append(this.cnonce).append(':');
                        if (c == 1) {
                            str8 = "auth-int";
                        } else {
                            str8 = str10;
                        }
                        append.append(str8).append(':').append(encode3);
                        str5 = sb.toString();
                    }
                    String encode4 = encode(messageDigest2.digest(EncodingUtils.getAsciiBytes(str5)));
                    CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
                    if (isProxy()) {
                        charArrayBuffer.append("Proxy-Authorization");
                    } else {
                        charArrayBuffer.append("Authorization");
                    }
                    charArrayBuffer.append(": Digest ");
                    ArrayList arrayList = new ArrayList(20);
                    arrayList.add(new BasicNameValuePair(HintConstants.AUTOFILL_HINT_USERNAME, name));
                    arrayList.add(new BasicNameValuePair("realm", parameter2));
                    arrayList.add(new BasicNameValuePair(str16, str3));
                    arrayList.add(new BasicNameValuePair(str14, str4));
                    arrayList.add(new BasicNameValuePair("response", encode4));
                    if (c != 0) {
                        if (c == 1) {
                            str7 = "auth-int";
                        } else {
                            str7 = str10;
                        }
                        str6 = str13;
                        arrayList.add(new BasicNameValuePair(str6, str7));
                        arrayList.add(new BasicNameValuePair("nc", sb2));
                        arrayList.add(new BasicNameValuePair("cnonce", this.cnonce));
                    } else {
                        str6 = str13;
                    }
                    if (parameter6 != null) {
                        arrayList.add(new BasicNameValuePair(str12, parameter6));
                    }
                    if (str11 != null) {
                        arrayList.add(new BasicNameValuePair(str, str11));
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        BasicNameValuePair basicNameValuePair = (BasicNameValuePair) arrayList.get(i);
                        if (i > 0) {
                            charArrayBuffer.append(", ");
                        }
                        BasicHeaderValueFormatter.DEFAULT.formatNameValuePair(charArrayBuffer, (NameValuePair) basicNameValuePair, !("nc".equals(basicNameValuePair.getName()) || str6.equals(basicNameValuePair.getName())));
                    }
                    return new BufferedHeader(charArrayBuffer);
                } catch (UnsupportedDigestAlgorithmException unused) {
                    throw new AuthenticationException("Unsuppported digest algorithm: " + str9);
                }
            } else {
                throw new AuthenticationException("None of the qop methods is supported: " + parameter7);
            }
        } else {
            throw new IllegalStateException("Nonce may not be null");
        }
    }

    /* access modifiers changed from: package-private */
    public String getCnonce() {
        return this.cnonce;
    }

    /* access modifiers changed from: package-private */
    public String getA1() {
        return this.a1;
    }

    /* access modifiers changed from: package-private */
    public String getA2() {
        return this.a2;
    }

    private static String encode(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            byte b2 = b & Ascii.SI;
            int i2 = i * 2;
            char[] cArr2 = HEXADECIMAL;
            cArr[i2] = cArr2[(b & 240) >> 4];
            cArr[i2 + 1] = cArr2[b2];
        }
        return new String(cArr);
    }

    public static String createCnonce() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return encode(bArr);
    }
}
