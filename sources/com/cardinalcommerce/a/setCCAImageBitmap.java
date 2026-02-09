package com.cardinalcommerce.a;

import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class setCCAImageBitmap implements GMCipherSpi.SM2withRMD {
    private transient completed configure;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public final byte[] getEncoded() {
        try {
            return KeyAgreementSpi.MQVwithSHA1KDF.cca_continue((setCCAImageUri) this.configure).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public setCCAImageBitmap(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        this.configure = (completed) ChallengeHTMLView.init(subjectPublicKeyInfo);
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == null || !(obj instanceof setCCAImageBitmap)) {
            return false;
        }
        setCCAImageBitmap setccaimagebitmap = (setCCAImageBitmap) obj;
        byte[] bArr2 = this.configure.cca_continue;
        byte[] bArr3 = null;
        if (bArr2 == null) {
            bArr = null;
        } else {
            bArr = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        byte[] bArr4 = setccaimagebitmap.configure.cca_continue;
        if (bArr4 != null) {
            bArr3 = new byte[bArr4.length];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return getBackgroundColor.Cardinal(bArr, bArr3);
    }

    public final int hashCode() {
        byte[] bArr;
        byte[] bArr2 = this.configure.cca_continue;
        if (bArr2 == null) {
            bArr = null;
        } else {
            byte[] bArr3 = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            bArr = bArr3;
        }
        return getBackgroundColor.init(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.configure = (completed) ChallengeHTMLView.init(SubjectPublicKeyInfo.configure((byte[]) objectInputStream.readObject()));
    }
}
