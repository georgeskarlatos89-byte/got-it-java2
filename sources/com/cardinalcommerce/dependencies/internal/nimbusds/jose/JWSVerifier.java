package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.a.setOnGenericMotionListener;
import com.cardinalcommerce.a.setOnKeyListener;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;

public interface JWSVerifier extends setOnGenericMotionListener {
    boolean cca_continue(setOnKeyListener setonkeylistener, byte[] bArr, Base64URL base64URL) throws JOSEException;
}
