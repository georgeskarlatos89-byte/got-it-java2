package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public final class ThreeDSStrings implements PublicKey {
    private transient cancelled cca_continue;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final byte[] getEncoded() {
        try {
            return KeyAgreementSpi.MQVwithSHA1KDF.cca_continue((setCCAImageUri) this.cca_continue).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public ThreeDSStrings(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.cca_continue = (cancelled) ChallengeHTMLView.init(subjectPublicKeyInfo);
    }

    public final String getAlgorithm() {
        return KeyAgreementSpi.MQVwithSHA1KDF.Cardinal(this.cca_continue.configure);
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ThreeDSStrings) {
            ThreeDSStrings threeDSStrings = (ThreeDSStrings) obj;
            if (this.cca_continue.configure == threeDSStrings.cca_continue.configure) {
                byte[] bArr2 = this.cca_continue.Cardinal;
                byte[] bArr3 = null;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                byte[] bArr4 = threeDSStrings.cca_continue.Cardinal;
                if (bArr4 != null) {
                    bArr3 = new byte[bArr4.length];
                    System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
                }
                if (getBackgroundColor.Cardinal(bArr, bArr3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr;
        int i = this.cca_continue.configure;
        byte[] bArr2 = this.cca_continue.Cardinal;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        return i + (getBackgroundColor.init(bArr) * 37);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.cca_continue = (cancelled) ChallengeHTMLView.init(SubjectPublicKeyInfo.configure((byte[]) objectInputStream.readObject()));
    }
}
