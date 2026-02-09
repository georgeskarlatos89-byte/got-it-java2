package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

import com.cardinalcommerce.a.setHandwritingBoundsOffsets;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

public class AAD {
    public static byte[] init(byte[] bArr) throws setHandwritingBoundsOffsets {
        return ByteBuffer.allocate(8).putLong((long) ByteUtils.getInstance(bArr)).array();
    }

    public static byte[] configure(JWEHeader jWEHeader) {
        Base64URL base64URL;
        if (jWEHeader.cca_continue == null) {
            base64URL = Base64URL.Cardinal(jWEHeader.toString());
        } else {
            base64URL = jWEHeader.cca_continue;
        }
        return base64URL.toString().getBytes(Charset.forName(HTTP.ASCII));
    }
}
