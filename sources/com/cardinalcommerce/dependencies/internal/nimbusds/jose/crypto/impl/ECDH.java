package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto.impl;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ECDH {
    public static SecretKey Cardinal(ECPublicKey eCPublicKey, PrivateKey privateKey, Provider provider) throws JOSEException {
        KeyAgreement keyAgreement;
        if (provider != null) {
            try {
                keyAgreement = KeyAgreement.getInstance("ECDH", provider);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(new StringBuilder("Couldn't get an ECDH key agreement instance: ").append(e.getMessage()).toString(), e);
            }
        } else {
            keyAgreement = KeyAgreement.getInstance("ECDH");
        }
        try {
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(eCPublicKey, true);
            return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
        } catch (InvalidKeyException e2) {
            throw new JOSEException(new StringBuilder("Invalid key for ECDH key agreement: ").append(e2.getMessage()).toString(), e2);
        }
    }

    private ECDH() {
    }
}
