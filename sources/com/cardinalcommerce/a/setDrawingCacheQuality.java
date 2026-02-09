package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class setDrawingCacheQuality {
    private static final byte[] Cardinal = {73, 110, 116, 101, 103, 114, 105, 116, 121};
    private static final byte[] cca_continue = {0, 0, 0, 0};
    private static final byte[] getInstance = {0, 0, 0, 1};
    private static final byte[] init = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    public static SecretKey cca_continue(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(getInstance);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length << 3;
            byteArrayOutputStream.write(setAccessibilityPaneTitle.getInstance(length / 2));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(setAllowedHandwritingDelegatePackage.configure));
            if (bArr != null) {
                byteArrayOutputStream.write(setAccessibilityPaneTitle.getInstance(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(cca_continue);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(setAccessibilityPaneTitle.getInstance(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(cca_continue);
            }
            byteArrayOutputStream.write(init);
            try {
                byte[] digest = MessageDigest.getInstance("SHA-".concat(String.valueOf(length))).digest(byteArrayOutputStream.toByteArray());
                int length2 = digest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(digest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    public static SecretKey configure(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(getInstance);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length << 3;
            byteArrayOutputStream.write(setAccessibilityPaneTitle.getInstance(length));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(setAllowedHandwritingDelegatePackage.configure));
            if (bArr != null) {
                byteArrayOutputStream.write(setAccessibilityPaneTitle.getInstance(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(cca_continue);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(setAccessibilityPaneTitle.getInstance(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(cca_continue);
            }
            byteArrayOutputStream.write(Cardinal);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-".concat(String.valueOf(length))).digest(byteArrayOutputStream.toByteArray()), "HMACSHA".concat(String.valueOf(length)));
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
