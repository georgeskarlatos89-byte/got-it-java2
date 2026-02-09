package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Container;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESGCM {
    public static byte[] getInstance(SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    private static GCMParameterSpec cca_continue(Cipher cipher) throws JOSEException {
        AlgorithmParameters parameters = cipher.getParameters();
        if (parameters != null) {
            try {
                return (GCMParameterSpec) parameters.getParameterSpec(GCMParameterSpec.class);
            } catch (InvalidParameterSpecException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } else {
            throw new JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
        }
    }

    private AESGCM() {
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [byte[], T] */
    public static AuthenticatedCipherText cca_continue(SecretKey secretKey, Container<byte[]> container, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        SecretKeySpec secretKeySpec;
        Cipher cipher;
        if (secretKey == null) {
            secretKeySpec = null;
        } else {
            secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
        }
        byte[] bArr3 = (byte[]) container.init;
        if (provider != null) {
            try {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new JOSEException(new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ").append(e.getMessage()).toString(), e);
            } catch (NoClassDefFoundError unused) {
                return setAccessibilityPaneTitle.configure(secretKeySpec, bArr3, bArr, bArr2);
            }
        } else {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, bArr3));
        cipher.updateAAD(bArr2);
        try {
            byte[] doFinal = cipher.doFinal(bArr);
            int length = doFinal.length - ByteUtils.Cardinal(128);
            byte[] configure = ByteUtils.configure(doFinal, 0, length);
            byte[] configure2 = ByteUtils.configure(doFinal, length, ByteUtils.Cardinal(128));
            GCMParameterSpec cca_continue = cca_continue(cipher);
            ? iv = cca_continue.getIV();
            int tLen = cca_continue.getTLen();
            if (ByteUtils.getInstance(iv) != 96) {
                throw new JOSEException(String.format("IV length of %d bits is required, got %d", new Object[]{96, Integer.valueOf(ByteUtils.getInstance(iv))}));
            } else if (tLen == 128) {
                container.init = iv;
                return new AuthenticatedCipherText(configure, configure2);
            } else {
                throw new JOSEException(String.format("Authentication tag length of %d bits is required, got %d", new Object[]{128, Integer.valueOf(tLen)}));
            }
        } catch (BadPaddingException | IllegalBlockSizeException e2) {
            throw new JOSEException(new StringBuilder("Couldn't encrypt with AES/GCM/NoPadding: ").append(e2.getMessage()).toString(), e2);
        }
    }

    public static byte[] getInstance(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider) throws JOSEException {
        SecretKeySpec secretKeySpec;
        Cipher cipher;
        if (secretKey == null) {
            secretKeySpec = null;
        } else {
            secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
        }
        if (provider != null) {
            try {
                cipher = Cipher.getInstance("AES/GCM/NoPadding", provider);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new JOSEException(new StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ").append(e.getMessage()).toString(), e);
            } catch (NoClassDefFoundError unused) {
                return setAccessibilityPaneTitle.getInstance(secretKeySpec, bArr, bArr2, bArr3, bArr4);
            }
        } else {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
        }
        cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr));
        cipher.updateAAD(bArr3);
        try {
            return cipher.doFinal(ByteUtils.cca_continue(bArr2, bArr4));
        } catch (BadPaddingException | IllegalBlockSizeException e2) {
            throw new JOSEException(new StringBuilder("AES/GCM/NoPadding decryption failed: ").append(e2.getMessage()).toString(), e2);
        }
    }
}
