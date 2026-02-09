package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
class RSA_OAEP_256 {
    public static byte[] encryptCEK(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            AlgorithmParameters instance = AlgorithmParametersHelper.getInstance("OAEP", provider);
            instance.init(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            Cipher instance2 = CipherHelper.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", provider);
            instance2.init(1, rSAPublicKey, instance);
            return instance2.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    public static SecretKey decryptCEK(PrivateKey privateKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            AlgorithmParameters instance = AlgorithmParametersHelper.getInstance("OAEP", provider);
            instance.init(new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            Cipher instance2 = CipherHelper.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", provider);
            instance2.init(2, privateKey, instance);
            return new SecretKeySpec(instance2.doFinal(bArr), "AES");
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    private RSA_OAEP_256() {
    }
}
