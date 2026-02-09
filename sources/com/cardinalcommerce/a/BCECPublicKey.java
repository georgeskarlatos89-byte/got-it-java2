package com.cardinalcommerce.a;

public abstract class BCECPublicKey {
    private GMCipherSpi cca_continue;

    public final synchronized GMCipherSpi Cardinal() {
        if (this.cca_continue == null) {
            this.cca_continue = getInstance();
        }
        return this.cca_continue;
    }

    /* access modifiers changed from: protected */
    public abstract GMCipherSpi getInstance();
}
