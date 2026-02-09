package com.nimbusds.jose.jwk;

import com.nimbusds.jose.JOSEException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public interface AssymetricJWK {
    KeyPair toKeyPair() throws JOSEException;

    PrivateKey toPrivateKey() throws JOSEException;

    PublicKey toPublicKey() throws JOSEException;
}
