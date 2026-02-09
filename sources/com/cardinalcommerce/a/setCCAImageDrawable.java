package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.io.IOException;
import java.security.PublicKey;

public final class setCCAImageDrawable implements GMCipherSpi.SM2withRMD, PublicKey {
    private CardinalThreeDS2ServiceImpl getInstance;

    public setCCAImageDrawable(CardinalThreeDS2ServiceImpl cardinalThreeDS2ServiceImpl) {
        this.getInstance = cardinalThreeDS2ServiceImpl;
    }

    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public final String getFormat() {
        return "X.509";
    }

    public final String toString() {
        return new StringBuilder().append(new StringBuilder().append(new StringBuilder("McEliecePublicKey:\n length of the code         : ").append(this.getInstance.configure).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).toString()).append(" error correction capability: ").append(this.getInstance.init).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).toString()).append(" generator matrix           : ").append(this.getInstance.cca_continue.toString()).toString();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof setCCAImageDrawable)) {
            setCCAImageDrawable setccaimagedrawable = (setCCAImageDrawable) obj;
            if (this.getInstance.configure == setccaimagedrawable.getInstance.configure && this.getInstance.init == setccaimagedrawable.getInstance.init && this.getInstance.cca_continue.equals(setccaimagedrawable.getInstance.cca_continue)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.getInstance.configure + (this.getInstance.init * 37)) * 37) + this.getInstance.cca_continue.hashCode();
    }

    public final byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new BCDSAPrivateKey(PQCObjectIdentifiers.getInstance), (CardinalConfigurationParameters) new getMessageVersion(this.getInstance.configure, this.getInstance.init, this.getInstance.cca_continue, setCCAImageUri.Cardinal(this.getInstance.Cardinal))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }
}
