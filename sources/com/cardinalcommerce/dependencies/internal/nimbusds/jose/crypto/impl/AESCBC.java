package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

import com.cardinalcommerce.a.setAccessibilityDelegate;
import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setAllowedHandwritingDelegatePackage;
import com.cardinalcommerce.a.setDrawingCacheQuality;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESCBC {
    public static byte[] init(SecureRandom secureRandom) {
        byte[] bArr = new byte[ByteUtils.Cardinal(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    private static byte[] init(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return getInstance(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static AuthenticatedCipherText init(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) throws JOSEException {
        setAccessibilityPaneTitle setaccessibilitypanetitle = new setAccessibilityPaneTitle(secretKey);
        byte[] init = init(setaccessibilitypanetitle.init, bArr, bArr2, provider);
        byte[] init2 = AAD.init(bArr3);
        byte[] array = ByteBuffer.allocate(bArr3.length + bArr.length + init.length + init2.length).put(bArr3).put(bArr).put(init).put(init2).array();
        Mac init3 = setAccessibilityDelegate.init(setaccessibilitypanetitle.configure, provider2);
        init3.update(array);
        return new AuthenticatedCipherText(init, Arrays.copyOf(init3.doFinal(), setaccessibilitypanetitle.getInstance));
    }

    private static byte[] configure(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return getInstance(secretKey, false, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] getInstance(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, Provider provider, Provider provider2) throws JOSEException {
        setAccessibilityPaneTitle setaccessibilitypanetitle = new setAccessibilityPaneTitle(secretKey);
        byte[] init = AAD.init(bArr3);
        byte[] array = ByteBuffer.allocate(bArr3.length + bArr.length + bArr2.length + init.length).put(bArr3).put(bArr).put(bArr2).put(init).array();
        Mac init2 = setAccessibilityDelegate.init(setaccessibilitypanetitle.configure, provider2);
        init2.update(array);
        if (setAccessibilityPaneTitle.getInstance(Arrays.copyOf(init2.doFinal(), setaccessibilitypanetitle.getInstance), bArr4)) {
            return configure(setaccessibilitypanetitle.init, bArr, bArr2, provider);
        }
        throw new JOSEException("MAC check failed");
    }

    private AESCBC() {
    }

    private static Cipher getInstance(SecretKey secretKey, boolean z, byte[] bArr, Provider provider) throws JOSEException {
        Cipher cipher;
        if (provider == null) {
            try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            } catch (Exception e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } else {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        if (z) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        return cipher;
    }

    public static AuthenticatedCipherText getInstance(JWEHeader jWEHeader, SecretKey secretKey, Base64URL base64URL, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) throws JOSEException {
        Base64URL base64URL2;
        byte[] bArr3 = null;
        byte[] cca_continue = jWEHeader.init.get("epu") instanceof String ? setPreferKeepClear.cca_continue(new Base64URL((String) jWEHeader.init.get("epu")).cca_continue) : null;
        if (jWEHeader.init.get("epv") instanceof String) {
            bArr3 = setPreferKeepClear.cca_continue(new Base64URL((String) jWEHeader.init.get("epv")).cca_continue);
        }
        byte[] init = init(setDrawingCacheQuality.cca_continue(secretKey, jWEHeader.Cardinal, cca_continue, bArr3), bArr, bArr2, provider);
        SecretKey configure = setDrawingCacheQuality.configure(secretKey, jWEHeader.Cardinal, cca_continue, bArr3);
        StringBuilder sb = new StringBuilder();
        if (jWEHeader.cca_continue == null) {
            base64URL2 = Base64URL.Cardinal(jWEHeader.toString());
        } else {
            base64URL2 = jWEHeader.cca_continue;
        }
        byte[] bytes = sb.append(base64URL2.toString()).append(".").append(base64URL.toString()).append(".").append(Base64URL.init(bArr).toString()).append(".").append(Base64URL.init(init)).toString().getBytes(setAllowedHandwritingDelegatePackage.configure);
        Mac init2 = setAccessibilityDelegate.init(configure, provider2);
        init2.update(bytes);
        return new AuthenticatedCipherText(init, init2.doFinal());
    }

    public static byte[] init(JWEHeader jWEHeader, SecretKey secretKey, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Provider provider, Provider provider2) throws JOSEException {
        Base64URL base64URL5;
        byte[] bArr = null;
        byte[] cca_continue = jWEHeader.init.get("epu") instanceof String ? setPreferKeepClear.cca_continue(new Base64URL((String) jWEHeader.init.get("epu")).cca_continue) : null;
        if (jWEHeader.init.get("epv") instanceof String) {
            bArr = setPreferKeepClear.cca_continue(new Base64URL((String) jWEHeader.init.get("epv")).cca_continue);
        }
        SecretKey configure = setDrawingCacheQuality.configure(secretKey, jWEHeader.Cardinal, cca_continue, bArr);
        StringBuilder sb = new StringBuilder();
        if (jWEHeader.cca_continue == null) {
            base64URL5 = Base64URL.Cardinal(jWEHeader.toString());
        } else {
            base64URL5 = jWEHeader.cca_continue;
        }
        byte[] bytes = sb.append(base64URL5.toString()).append(".").append(base64URL.toString()).append(".").append(base64URL2.toString()).append(".").append(base64URL3.toString()).toString().getBytes(setAllowedHandwritingDelegatePackage.configure);
        Mac init = setAccessibilityDelegate.init(configure, provider2);
        init.update(bytes);
        if (setAccessibilityPaneTitle.getInstance(setPreferKeepClear.cca_continue(base64URL4.cca_continue), init.doFinal())) {
            return configure(setDrawingCacheQuality.cca_continue(secretKey, jWEHeader.Cardinal, cca_continue, bArr), setPreferKeepClear.cca_continue(base64URL2.cca_continue), setPreferKeepClear.cca_continue(base64URL3.cca_continue), provider);
        }
        throw new JOSEException("MAC check failed");
    }
}
