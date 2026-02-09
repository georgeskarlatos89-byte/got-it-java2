package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setOnContextClickListener;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;

public class DeflateHelper {
    public static byte[] Cardinal(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        setOnContextClickListener setoncontextclicklistener = jWEHeader.configure;
        if (setoncontextclicklistener == null) {
            return bArr;
        }
        if (setoncontextclicklistener.equals(setOnContextClickListener.init)) {
            try {
                return setAccessibilityPaneTitle.configure(bArr);
            } catch (Exception e) {
                throw new JOSEException(new StringBuilder("Couldn't compress plain text: ").append(e.getMessage()).toString(), e);
            }
        } else {
            throw new JOSEException("Unsupported compression algorithm: ".concat(String.valueOf(setoncontextclicklistener)));
        }
    }

    public static byte[] getInstance(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        setOnContextClickListener setoncontextclicklistener = jWEHeader.configure;
        if (setoncontextclicklistener == null) {
            return bArr;
        }
        if (setoncontextclicklistener.equals(setOnContextClickListener.init)) {
            try {
                return setAccessibilityPaneTitle.init(bArr);
            } catch (Exception e) {
                throw new JOSEException(new StringBuilder("Couldn't decompress plain text: ").append(e.getMessage()).toString(), e);
            }
        } else {
            throw new JOSEException("Unsupported compression algorithm: ".concat(String.valueOf(setoncontextclicklistener)));
        }
    }
}
