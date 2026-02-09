package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto;

import com.cardinalcommerce.a.setAccessibilityPaneTitle;
import com.cardinalcommerce.a.setAccessibilityTraversalAfter;
import com.cardinalcommerce.a.setAccessibilityTraversalBefore;
import com.cardinalcommerce.a.setContentCaptureSession;
import com.cardinalcommerce.a.setContentDescription;
import com.cardinalcommerce.a.setNextFocusLeftId;
import com.cardinalcommerce.a.setOnHoverListener;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.Collection;
import javax.crypto.SecretKey;

public class RSAEncrypter extends setAccessibilityTraversalAfter implements setOnHoverListener {
    private final SecretKey cca_continue;
    private final RSAPublicKey getInstance;

    public RSAEncrypter(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, (SecretKey) null);
    }

    private RSAEncrypter(RSAPublicKey rSAPublicKey, SecretKey secretKey) {
        if (rSAPublicKey != null) {
            this.getInstance = rSAPublicKey;
            if (secretKey == null) {
                this.cca_continue = null;
            } else if (secretKey.getAlgorithm() == null || !secretKey.getAlgorithm().equals("AES")) {
                throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES");
            } else {
                this.cca_continue = secretKey;
            }
        } else {
            throw new IllegalArgumentException("The public RSA key must not be null");
        }
    }

    public final JWECryptoParts getInstance(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        Base64URL base64URL;
        JWEAlgorithm init = jWEHeader.init();
        EncryptionMethod encryptionMethod = jWEHeader.Cardinal;
        SecretKey secretKey = this.cca_continue;
        if (secretKey == null) {
            setNextFocusLeftId init2 = init();
            secretKey = setContentCaptureSession.cca_continue(encryptionMethod, init2.Cardinal != null ? init2.Cardinal : new SecureRandom());
        }
        if (init.equals(JWEAlgorithm.Cardinal)) {
            RSAPublicKey rSAPublicKey = this.getInstance;
            setNextFocusLeftId init3 = init();
            base64URL = Base64URL.init(setAccessibilityPaneTitle.cca_continue(rSAPublicKey, secretKey, init3.init != null ? init3.init : init3.cca_continue));
        } else if (init.equals(JWEAlgorithm.init)) {
            RSAPublicKey rSAPublicKey2 = this.getInstance;
            setNextFocusLeftId init4 = init();
            base64URL = Base64URL.init(setContentDescription.getInstance(rSAPublicKey2, secretKey, init4.init != null ? init4.init : init4.cca_continue));
        } else if (init.equals(JWEAlgorithm.getInstance)) {
            RSAPublicKey rSAPublicKey3 = this.getInstance;
            setNextFocusLeftId init5 = init();
            base64URL = Base64URL.init(setAccessibilityTraversalBefore.configure(rSAPublicKey3, secretKey, init5.init != null ? init5.init : init5.cca_continue));
        } else {
            throw new JOSEException(AlgorithmSupportMessage.init(init, (Collection<JWEAlgorithm>) Cardinal));
        }
        return setContentCaptureSession.configure(jWEHeader, bArr, secretKey, base64URL, init());
    }
}
