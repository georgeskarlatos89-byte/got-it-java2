package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setAllowedHandwritingDelegatePackage;
import com.cardinalcommerce.a.setNextFocusUpId;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.a.setScrollContainer;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ConcatKDF implements setScrollContainer<setNextFocusUpId> {
    private final setNextFocusUpId getInstance = new setNextFocusUpId();
    private final String init;

    public static byte[] cca_continue() {
        return new byte[0];
    }

    public ConcatKDF(String str) {
        this.init = str;
    }

    public final setNextFocusUpId getInstance() {
        return this.getInstance;
    }

    public final SecretKey getInstance(SecretKey secretKey, int i, byte[] bArr) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        MessageDigest configure = configure();
        int i2 = 1;
        while (true) {
            int configure2 = ByteUtils.configure(configure.getDigestLength());
            if (i2 > ((configure2 + 256) - 1) / configure2) {
                break;
            }
            configure.update(setAccessibilityPaneTitle.getInstance(i2));
            configure.update(secretKey.getEncoded());
            if (bArr != null) {
                configure.update(bArr);
            }
            try {
                byteArrayOutputStream.write(configure.digest());
                i2++;
            } catch (IOException e) {
                throw new JOSEException(new StringBuilder("Couldn't write derived key: ").append(e.getMessage()).toString(), e);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int Cardinal = ByteUtils.Cardinal(256);
        if (byteArray.length == Cardinal) {
            return new SecretKeySpec(byteArray, "AES");
        }
        return new SecretKeySpec(ByteUtils.configure(byteArray, 0, Cardinal), "AES");
    }

    public static byte[] Cardinal() {
        return setAccessibilityPaneTitle.getInstance(256);
    }

    public static byte[] configure(String str) {
        return Cardinal(str != null ? str.getBytes(setAllowedHandwritingDelegatePackage.configure) : null);
    }

    private static byte[] Cardinal(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return ByteUtils.cca_continue(setAccessibilityPaneTitle.getInstance(bArr.length), bArr);
    }

    private MessageDigest configure() throws JOSEException {
        Provider provider = this.getInstance.cca_continue;
        if (provider != null) {
            return MessageDigest.getInstance(this.init, provider);
        }
        try {
            return MessageDigest.getInstance(this.init);
        } catch (NoSuchAlgorithmException e) {
            throw new JOSEException(new StringBuilder("Couldn't get message digest for KDF: ").append(e.getMessage()).toString(), e);
        }
    }

    public static byte[] Cardinal(Base64URL base64URL) {
        return Cardinal(base64URL != null ? setPreferKeepClear.cca_continue(base64URL.cca_continue) : null);
    }
}
