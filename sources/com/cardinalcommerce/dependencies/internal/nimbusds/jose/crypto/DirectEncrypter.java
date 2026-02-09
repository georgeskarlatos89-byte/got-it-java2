package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto;

import com.cardinalcommerce.a.setContentCaptureSession;
import com.cardinalcommerce.a.setImportantForContentCapture;
import com.cardinalcommerce.a.setOnHoverListener;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl.AlgorithmSupportMessage;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.ByteUtils;
import java.util.Collection;
import javax.crypto.SecretKey;

public class DirectEncrypter extends setImportantForContentCapture implements setOnHoverListener {
    public DirectEncrypter(SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
    }

    public JWECryptoParts getInstance(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        JWEAlgorithm init = jWEHeader.init();
        if (init.equals(JWEAlgorithm.getWarnings)) {
            EncryptionMethod encryptionMethod = jWEHeader.Cardinal;
            if (encryptionMethod.getInstance == ByteUtils.getInstance(configure().getEncoded())) {
                return setContentCaptureSession.configure(jWEHeader, bArr, configure(), (Base64URL) null, init());
            }
            throw new KeyLengthException(encryptionMethod.getInstance, encryptionMethod);
        }
        throw new JOSEException(AlgorithmSupportMessage.init(init, (Collection<JWEAlgorithm>) cca_continue));
    }
}
