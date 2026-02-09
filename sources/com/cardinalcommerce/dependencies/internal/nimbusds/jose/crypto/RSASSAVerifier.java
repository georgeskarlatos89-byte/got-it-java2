package com.cardinalcommerce.dependencies.internal.nimbusds.jose.crypto;

import com.cardinalcommerce.a.setAccessibilityTraversalBefore;
import com.cardinalcommerce.a.setContentDescription;
import com.cardinalcommerce.a.setLabelFor;
import com.cardinalcommerce.a.setOnKeyListener;
import com.cardinalcommerce.a.setPreferKeepClear;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JOSEException;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSVerifier;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.Set;

public class RSASSAVerifier extends setLabelFor implements JWSVerifier {
    private final setAccessibilityTraversalBefore Cardinal;
    private final RSAPublicKey getInstance;

    public RSASSAVerifier(RSAPublicKey rSAPublicKey) {
        this(rSAPublicKey, (Set<String>) null);
    }

    private RSASSAVerifier(RSAPublicKey rSAPublicKey, Set<String> set) {
        setAccessibilityTraversalBefore setaccessibilitytraversalbefore = new setAccessibilityTraversalBefore();
        this.Cardinal = setaccessibilitytraversalbefore;
        if (rSAPublicKey != null) {
            this.getInstance = rSAPublicKey;
            if (set == null) {
                setaccessibilitytraversalbefore.getInstance = Collections.emptySet();
            } else {
                setaccessibilitytraversalbefore.getInstance = set;
            }
        } else {
            throw new IllegalArgumentException("The public RSA key must not be null");
        }
    }

    public final boolean cca_continue(setOnKeyListener setonkeylistener, byte[] bArr, Base64URL base64URL) throws JOSEException {
        if (!this.Cardinal.init(setonkeylistener)) {
            return false;
        }
        Signature Cardinal2 = setContentDescription.Cardinal(setonkeylistener.init(), getInstance().cca_continue);
        try {
            Cardinal2.initVerify(this.getInstance);
            try {
                Cardinal2.update(bArr);
                return Cardinal2.verify(setPreferKeepClear.cca_continue(base64URL.cca_continue));
            } catch (SignatureException unused) {
                return false;
            }
        } catch (InvalidKeyException e) {
            throw new JOSEException(new StringBuilder("Invalid public RSA key: ").append(e.getMessage()).toString(), e);
        }
    }
}
