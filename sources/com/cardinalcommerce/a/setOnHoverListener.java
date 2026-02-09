package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWECryptoParts;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;

public interface setOnHoverListener extends setOnDragListener {
    JWECryptoParts getInstance(JWEHeader jWEHeader, byte[] bArr) throws JOSEException;
}
