package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto;

import com.cardinalcommerce.a.setAccessibilityTraversalBefore;
import com.cardinalcommerce.a.setContentCaptureSession;
import com.cardinalcommerce.a.setImportantForContentCapture;
import com.cardinalcommerce.a.setOnCreateContextMenuListener;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.util.Collection;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class DirectDecrypter extends setImportantForContentCapture implements setOnCreateContextMenuListener {
    private final boolean Cardinal;
    private final setAccessibilityTraversalBefore init;

    private DirectDecrypter(SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
        this.init = new setAccessibilityTraversalBefore();
        this.Cardinal = false;
    }

    public DirectDecrypter(byte[] bArr) throws KeyLengthException {
        this((SecretKey) new SecretKeySpec(bArr, "AES"));
    }

    public final byte[] Cardinal(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException {
        JWEAlgorithm init2 = jWEHeader.init();
        if (!init2.equals(JWEAlgorithm.getWarnings)) {
            throw new JOSEException(AlgorithmSupportMessage.init(init2, (Collection<JWEAlgorithm>) cca_continue));
        } else if (base64URL != null) {
            throw new JOSEException("Unexpected present JWE encrypted key");
        } else if (base64URL2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        } else if (base64URL4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        } else if (this.init.init(jWEHeader)) {
            return setContentCaptureSession.cca_continue(jWEHeader, (Base64URL) null, base64URL2, base64URL3, base64URL4, configure(), init());
        } else {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
    }
}
