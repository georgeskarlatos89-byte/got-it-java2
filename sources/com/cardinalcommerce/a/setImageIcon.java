package com.cardinalcommerce.a;

import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import java.io.IOException;
import java.security.PrivateKey;

public final class setImageIcon implements PrivateKey {
    private addParam cca_continue;

    public setImageIcon(addParam addparam) {
        this.cca_continue = addparam;
    }

    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof setImageIcon)) {
            setImageIcon setimageicon = (setImageIcon) obj;
            if (this.cca_continue.init != setimageicon.cca_continue.init || this.cca_continue.getInstance != setimageicon.cca_continue.getInstance || !this.cca_continue.cca_continue.equals(setimageicon.cca_continue.cca_continue) || !this.cca_continue.configure.equals(setimageicon.cca_continue.configure) || !this.cca_continue.getWarnings.equals(setimageicon.cca_continue.getWarnings) || !this.cca_continue.onValidated.equals(setimageicon.cca_continue.onValidated)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.cca_continue.getInstance * 37) + this.cca_continue.init) * 37) + this.cca_continue.cca_continue.hashCode()) * 37) + this.cca_continue.configure.hashCode()) * 37) + this.cca_continue.getWarnings.hashCode()) * 37) + this.cca_continue.onValidated.hashCode();
    }

    public final byte[] getEncoded() {
        try {
            return new PrivateKeyInfo(new BCDSAPrivateKey(PQCObjectIdentifiers.getInstance), new getSDKEphemeralPublicKey(this.cca_continue.init, this.cca_continue.getInstance, this.cca_continue.cca_continue, this.cca_continue.configure, this.cca_continue.getWarnings, setCCAImageUri.Cardinal(this.cca_continue.Cardinal))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }
}
