package com.cardinalcommerce.dependencies.internal.nimbusds.jwt;

import com.cardinalcommerce.a.setHandwritingDelegatorCallback;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEHeader;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.Payload;

public class EncryptedJWT extends JWEObject implements setHandwritingDelegatorCallback {
    public EncryptedJWT(JWEHeader jWEHeader, JWTClaimsSet jWTClaimsSet) {
        super(jWEHeader, new Payload(jWTClaimsSet.getInstance()));
    }
}
