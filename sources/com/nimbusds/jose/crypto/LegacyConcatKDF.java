package com.nimbusds.jose.crypto;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.util.IntegerUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

class LegacyConcatKDF {
    private static final byte[] ENCRYPTION_BYTES = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};
    private static final byte[] INTEGRITY_BYTES = {73, 110, 116, 101, 103, 114, 105, 116, 121};
    private static final byte[] ONE_BYTES;
    private static final byte[] ZERO_BYTES = new byte[4];

    static {
        byte[] bArr = new byte[4];
        bArr[3] = 1;
        ONE_BYTES = bArr;
    }

    public static SecretKey generateCEK(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(ONE_BYTES);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(IntegerUtils.toBytes(length / 2));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes());
            if (bArr != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            byteArrayOutputStream.write(ENCRYPTION_BYTES);
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
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

    public static SecretKey generateCIK(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(ONE_BYTES);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(IntegerUtils.toBytes(length));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes());
            if (bArr != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(IntegerUtils.toBytes(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(ZERO_BYTES);
            }
            byteArrayOutputStream.write(INTEGRITY_BYTES);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    private LegacyConcatKDF() {
    }
}
