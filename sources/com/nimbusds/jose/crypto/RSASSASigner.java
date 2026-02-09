package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Set;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class RSASSASigner extends RSASSAProvider implements JWSSigner {
    private final PrivateKey privateKey;

    public /* bridge */ /* synthetic */ JCAContext getJCAContext() {
        return super.getJCAContext();
    }

    public /* bridge */ /* synthetic */ Set supportedJWSAlgorithms() {
        return super.supportedJWSAlgorithms();
    }

    public RSASSASigner(PrivateKey privateKey2) {
        if ("RSA".equalsIgnoreCase(privateKey2.getAlgorithm())) {
            this.privateKey = privateKey2;
            return;
        }
        throw new IllegalArgumentException("The private key algorithm must be RSA");
    }

    public RSASSASigner(RSAKey rSAKey) throws JOSEException {
        if (rSAKey.isPrivate()) {
            this.privateKey = rSAKey.toPrivateKey();
            return;
        }
        throw new JOSEException("The RSA JWK doesn't contain a private part");
    }

    public PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public Base64URL sign(JWSHeader jWSHeader, byte[] bArr) throws JOSEException {
        Signature signerAndVerifier = RSASSA.getSignerAndVerifier(jWSHeader.getAlgorithm(), getJCAContext().getProvider());
        try {
            signerAndVerifier.initSign(this.privateKey);
            signerAndVerifier.update(bArr);
            return Base64URL.encode(signerAndVerifier.sign());
        } catch (InvalidKeyException e) {
            throw new JOSEException("Invalid private RSA key: " + e.getMessage(), e);
        } catch (SignatureException e2) {
            throw new JOSEException("RSA signature exception: " + e2.getMessage(), e2);
        }
    }
}
