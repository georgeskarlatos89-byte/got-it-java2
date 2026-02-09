package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public final class getSeverity implements GMCipherSpi.SM2withRMD {
    public KeyAgreementSpi.X25519withSHA256KDF cca_continue;
    public KeyAgreementSpi.X25519UwithSHA256CKDF configure;
    public KeyAgreementSpi.X25519UwithSHA256CKDF getInstance;

    public getSeverity() {
    }

    public static byte[] configure(BCDSAPrivateKey bCDSAPrivateKey, CardinalConfigurationParameters cardinalConfigurationParameters) {
        try {
            return init(new SubjectPublicKeyInfo(bCDSAPrivateKey, cardinalConfigurationParameters));
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] init(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return subjectPublicKeyInfo.configure("DER");
        } catch (Exception unused) {
            return null;
        }
    }

    public getSeverity(KeyAgreementSpi.X25519UwithSHA256CKDF x25519UwithSHA256CKDF, KeyAgreementSpi.X25519UwithSHA256CKDF x25519UwithSHA256CKDF2) {
        this(x25519UwithSHA256CKDF, x25519UwithSHA256CKDF2, (KeyAgreementSpi.X25519withSHA256KDF) null);
    }

    public getSeverity(KeyAgreementSpi.X25519UwithSHA256CKDF x25519UwithSHA256CKDF, KeyAgreementSpi.X25519UwithSHA256CKDF x25519UwithSHA256CKDF2, KeyAgreementSpi.X25519withSHA256KDF x25519withSHA256KDF) {
        if (x25519UwithSHA256CKDF == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        } else if (x25519UwithSHA256CKDF2 != null) {
            KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = x25519UwithSHA256CKDF.Cardinal;
            if (x25519withSHA256CKDF.equals(x25519UwithSHA256CKDF2.Cardinal)) {
                if (x25519withSHA256KDF == null) {
                    x25519withSHA256KDF = new KeyAgreementSpi.X25519withSHA256KDF(x25519withSHA256CKDF.init.multiply(x25519UwithSHA256CKDF2.configure), x25519withSHA256CKDF);
                } else if (!x25519withSHA256CKDF.equals(x25519withSHA256KDF.Cardinal)) {
                    throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
                }
                this.configure = x25519UwithSHA256CKDF;
                this.getInstance = x25519UwithSHA256CKDF2;
                this.cca_continue = x25519withSHA256KDF;
                return;
            }
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        } else {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
    }
}
