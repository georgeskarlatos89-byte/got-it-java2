package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.io.IOException;
import java.security.PublicKey;

public final class setCCAImageIcon implements PublicKey {
    private createTransaction init;

    public setCCAImageIcon(createTransaction createtransaction) {
        this.init = createtransaction;
    }

    public final String getAlgorithm() {
        return "McEliece";
    }

    public final String getFormat() {
        return "X.509";
    }

    public final String toString() {
        return new StringBuilder().append(new StringBuilder().append(new StringBuilder("McEliecePublicKey:\n length of the code         : ").append(this.init.getInstance).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).toString()).append(" error correction capability: ").append(this.init.configure).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).toString()).append(" generator matrix           : ").append(this.init.cca_continue).toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setCCAImageIcon) {
            setCCAImageIcon setccaimageicon = (setCCAImageIcon) obj;
            if (this.init.getInstance == setccaimageicon.init.getInstance && this.init.configure == setccaimageicon.init.configure && this.init.cca_continue.equals(setccaimageicon.init.cca_continue)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.init.getInstance + (this.init.configure * 37)) * 37) + this.init.cca_continue.hashCode();
    }

    public final byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new BCDSAPrivateKey(PQCObjectIdentifiers.Cardinal), (CardinalConfigurationParameters) new getSDKReferenceNumber(this.init.getInstance, this.init.configure, this.init.cca_continue)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }
}
