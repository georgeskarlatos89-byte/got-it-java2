package com.cardinalcommerce.a;

import com.cardinalcommerce.a.KeyAgreementSpi;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class setCCAPadding implements setImageBitmap {
    private transient setEnableDFSync cca_continue;
    private transient timedout configure;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public final byte[] getEncoded() {
        try {
            return KeyAgreementSpi.MQVwithSHA1KDF.configure((setCCAImageUri) this.configure, this.cca_continue).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public setCCAPadding(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.cca_continue = privateKeyInfo.getInstance;
        this.configure = (timedout) getProgressView.getInstance(privateKeyInfo);
    }

    public final boolean equals(Object obj) {
        short[] sArr;
        if (!(obj instanceof setCCAPadding)) {
            return false;
        }
        setCCAPadding setccapadding = (setCCAPadding) obj;
        short[] sArr2 = this.configure.cca_continue;
        short[] sArr3 = null;
        if (sArr2 == null) {
            sArr = null;
        } else {
            sArr = new short[sArr2.length];
            System.arraycopy(sArr2, 0, sArr, 0, sArr2.length);
        }
        short[] sArr4 = setccapadding.configure.cca_continue;
        if (sArr4 != null) {
            sArr3 = new short[sArr4.length];
            System.arraycopy(sArr4, 0, sArr3, 0, sArr4.length);
        }
        if (sArr == sArr3) {
            return true;
        }
        if (sArr == null || sArr3 == null || sArr.length != sArr3.length) {
            return false;
        }
        for (int i = 0; i != sArr.length; i++) {
            if (sArr[i] != sArr3[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        short[] sArr;
        short[] sArr2 = this.configure.cca_continue;
        if (sArr2 == null) {
            sArr = null;
        } else {
            short[] sArr3 = new short[sArr2.length];
            System.arraycopy(sArr2, 0, sArr3, 0, sArr2.length);
            sArr = sArr3;
        }
        return getBackgroundColor.getInstance(sArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        PrivateKeyInfo cca_continue2 = PrivateKeyInfo.cca_continue((byte[]) objectInputStream.readObject());
        this.cca_continue = cca_continue2.getInstance;
        this.configure = (timedout) getProgressView.getInstance(cca_continue2);
    }
}
