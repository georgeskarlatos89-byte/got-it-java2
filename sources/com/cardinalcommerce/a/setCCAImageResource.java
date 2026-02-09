package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public final class setCCAImageResource implements PrivateKey {
    private transient ChallengeStatusReceiver cca_continue;
    private transient setEnableDFSync init;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final byte[] getEncoded() {
        try {
            return KeyAgreementSpi.MQVwithSHA1KDF.configure((setCCAImageUri) this.cca_continue, this.init).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public setCCAImageResource(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.init = privateKeyInfo.getInstance;
        this.cca_continue = (ChallengeStatusReceiver) getProgressView.getInstance(privateKeyInfo);
    }

    public final String getAlgorithm() {
        return KeyAgreementSpi.MQVwithSHA1KDF.Cardinal(this.cca_continue.getInstance);
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof setCCAImageResource) {
            setCCAImageResource setccaimageresource = (setCCAImageResource) obj;
            if (this.cca_continue.getInstance == setccaimageresource.cca_continue.getInstance) {
                byte[] bArr2 = this.cca_continue.cca_continue;
                byte[] bArr3 = null;
                if (bArr2 == null) {
                    bArr = null;
                } else {
                    bArr = new byte[bArr2.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                }
                byte[] bArr4 = setccaimageresource.cca_continue.cca_continue;
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
        int i = this.cca_continue.getInstance;
        byte[] bArr2 = this.cca_continue.cca_continue;
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
        PrivateKeyInfo cca_continue2 = PrivateKeyInfo.cca_continue((byte[]) objectInputStream.readObject());
        this.init = cca_continue2.getInstance;
        this.cca_continue = (ChallengeStatusReceiver) getProgressView.getInstance(cca_continue2);
    }
}
