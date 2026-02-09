package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

public class BCXDHPublicKey implements GMCipherSpi.SM2withRMD, PublicKey {
    transient setCCAImageUri cca_continue;

    BCXDHPublicKey(setCCAImageUri setccaimageuri) {
        this.cca_continue = setccaimageuri;
    }

    BCXDHPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        init(subjectPublicKeyInfo);
    }

    BCXDHPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        setCCAImageUri sha3_224;
        int length = bArr.length;
        if (Utils.configure(bArr, bArr2)) {
            if (bArr2.length - length == 56) {
                sha3_224 = new DigestSignatureSpi.SHA3_512(bArr2, length);
            } else if (bArr2.length - length == 32) {
                sha3_224 = new DigestSignatureSpi.SHA3_224(bArr2, length);
            } else {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.cca_continue = sha3_224;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        init(SubjectPublicKeyInfo.configure((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXDHPublicKey)) {
            return false;
        }
        return getBackgroundColor.Cardinal(((BCXDHPublicKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.cca_continue instanceof DigestSignatureSpi.SHA3_512 ? "X448" : "X25519";
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return getBackgroundColor.init(getEncoded());
    }

    public String toString() {
        return Utils.Cardinal("Public Key", getAlgorithm(), this.cca_continue);
    }

    private void init(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        if (X509.Mappings.configure.equals(subjectPublicKeyInfo.cca_continue.cca_continue)) {
            this.cca_continue = new DigestSignatureSpi.SHA3_512(subjectPublicKeyInfo.Cardinal.init(), 0);
        } else {
            this.cca_continue = new DigestSignatureSpi.SHA3_224(subjectPublicKeyInfo.Cardinal.init(), 0);
        }
    }

    public byte[] getEncoded() {
        if (this.cca_continue instanceof DigestSignatureSpi.SHA3_512) {
            byte[] bArr = new byte[(KeyFactorySpi.cca_continue.length + 56)];
            System.arraycopy(KeyFactorySpi.cca_continue, 0, bArr, 0, KeyFactorySpi.cca_continue.length);
            System.arraycopy(((DigestSignatureSpi.SHA3_512) this.cca_continue).Cardinal, 0, bArr, KeyFactorySpi.cca_continue.length, 56);
            return bArr;
        }
        byte[] bArr2 = new byte[(KeyFactorySpi.configure.length + 32)];
        System.arraycopy(KeyFactorySpi.configure, 0, bArr2, 0, KeyFactorySpi.configure.length);
        System.arraycopy(((DigestSignatureSpi.SHA3_224) this.cca_continue).getInstance, 0, bArr2, KeyFactorySpi.configure.length, 32);
        return bArr2;
    }
}
