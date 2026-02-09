package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.facebook.internal.security.OidcSecurityUtil;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;

public final class setContentDescription {
    public static Signature Cardinal(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        String str;
        Signature signature;
        PSSParameterSpec pSSParameterSpec;
        PSSParameterSpec pSSParameterSpec2 = null;
        if (jWSAlgorithm.equals(JWSAlgorithm.init)) {
            str = OidcSecurityUtil.SIGNATURE_ALGORITHM_SHA256;
        } else if (jWSAlgorithm.equals(JWSAlgorithm.getInstance)) {
            str = "SHA384withRSA";
        } else if (jWSAlgorithm.equals(JWSAlgorithm.Cardinal)) {
            str = "SHA512withRSA";
        } else {
            if (jWSAlgorithm.equals(JWSAlgorithm.getWarnings)) {
                pSSParameterSpec = new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
            } else if (jWSAlgorithm.equals(JWSAlgorithm.values)) {
                pSSParameterSpec = new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1);
            } else if (jWSAlgorithm.equals(JWSAlgorithm.CardinalRenderType)) {
                pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
            } else {
                throw new JOSEException(AlgorithmSupportMessage.Cardinal(jWSAlgorithm, setLabelFor.init));
            }
            pSSParameterSpec2 = pSSParameterSpec;
            str = "RSASSA-PSS";
        }
        if (provider != null) {
            try {
                signature = Signature.getInstance(str, provider);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(new StringBuilder("Unsupported RSASSA algorithm: ").append(e.getMessage()).toString(), e);
            }
        } else {
            signature = Signature.getInstance(str);
        }
        if (pSSParameterSpec2 != null) {
            try {
                signature.setParameter(pSSParameterSpec2);
            } catch (InvalidAlgorithmParameterException e2) {
                throw new JOSEException(new StringBuilder("Invalid RSASSA-PSS salt length parameter: ").append(e2.getMessage()).toString(), e2);
            }
        }
        return signature;
    }

    public static byte[] getInstance(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        Cipher cipher;
        if (provider == null) {
            try {
                cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            } catch (IllegalBlockSizeException e) {
                throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } else {
            cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
        }
        cipher.init(1, rSAPublicKey, new SecureRandom());
        return cipher.doFinal(secretKey.getEncoded());
    }
}
