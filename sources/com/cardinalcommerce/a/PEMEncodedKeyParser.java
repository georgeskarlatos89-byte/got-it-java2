package com.cardinalcommerce.a;

import java.math.BigInteger;

final class PEMEncodedKeyParser implements CompletionEvent {
    private JWTClaimsSet Cardinal;
    private Base64 getInstance;

    PEMEncodedKeyParser(Base64 base64, JWTClaimsSet jWTClaimsSet) {
        this.getInstance = base64;
        this.Cardinal = jWTClaimsSet;
    }

    public final int Cardinal() {
        return this.getInstance.Cardinal() * this.Cardinal.cca_continue();
    }

    public final JWTClaimsSet cca_continue() {
        return this.Cardinal;
    }

    public final BigInteger configure() {
        return this.getInstance.configure();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PEMEncodedKeyParser)) {
            return false;
        }
        PEMEncodedKeyParser pEMEncodedKeyParser = (PEMEncodedKeyParser) obj;
        return this.getInstance.equals(pEMEncodedKeyParser.getInstance) && this.Cardinal.equals(pEMEncodedKeyParser.Cardinal);
    }

    public final int hashCode() {
        return this.getInstance.hashCode() ^ Integer.rotateLeft(this.Cardinal.hashCode(), 16);
    }
}
