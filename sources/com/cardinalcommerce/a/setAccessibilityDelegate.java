package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

public final class setAccessibilityDelegate {
    public static Mac init(SecretKey secretKey, Provider provider) throws JOSEException {
        Mac mac;
        if (provider != null) {
            try {
                mac = Mac.getInstance(secretKey.getAlgorithm(), provider);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(new StringBuilder("Unsupported HMAC algorithm: ").append(e.getMessage()).toString(), e);
            } catch (InvalidKeyException e2) {
                throw new JOSEException(new StringBuilder("Invalid HMAC key: ").append(e2.getMessage()).toString(), e2);
            }
        } else {
            mac = Mac.getInstance(secretKey.getAlgorithm());
        }
        mac.init(secretKey);
        return mac;
    }
}
