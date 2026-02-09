package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;

public class BCXDHPublicKey extends setCCAImageUri {
    public KeyAgreementSpi.X25519withSHA256CKDF Cardinal;

    protected BCXDHPublicKey(boolean z, KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF) {
        super(z);
        this.Cardinal = x25519withSHA256CKDF;
    }

    public int hashCode() {
        boolean z = !configure();
        KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = this.Cardinal;
        return x25519withSHA256CKDF != null ? z ^ x25519withSHA256CKDF.hashCode() ? 1 : 0 : z ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCXDHPublicKey)) {
            return false;
        }
        BCXDHPublicKey bCXDHPublicKey = (BCXDHPublicKey) obj;
        KeyAgreementSpi.X25519withSHA256CKDF x25519withSHA256CKDF = this.Cardinal;
        if (x25519withSHA256CKDF != null) {
            return x25519withSHA256CKDF.equals(bCXDHPublicKey.Cardinal);
        }
        if (bCXDHPublicKey.Cardinal == null) {
            return true;
        }
        return false;
    }
}
