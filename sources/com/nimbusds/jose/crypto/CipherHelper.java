package com.nimbusds.jose.crypto;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
class CipherHelper {
    CipherHelper() {
    }

    public static Cipher getInstance(String str, Provider provider) throws NoSuchAlgorithmException, NoSuchPaddingException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
