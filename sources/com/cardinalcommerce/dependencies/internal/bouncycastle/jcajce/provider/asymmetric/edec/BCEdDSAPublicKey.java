package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.BCElGamalPublicKey;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

public class BCEdDSAPublicKey implements GMCipherSpi.SM2withRMD, PublicKey {
    transient setCCAImageUri Cardinal;

    BCEdDSAPublicKey(setCCAImageUri setccaimageuri) {
        this.Cardinal = setccaimageuri;
    }

    BCEdDSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        configure(subjectPublicKeyInfo);
    }

    BCEdDSAPublicKey(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException {
        setCCAImageUri x25519;
        int length = bArr.length;
        if (Utils.configure(bArr, bArr2)) {
            if (bArr2.length - length == 57) {
                x25519 = new BCElGamalPublicKey(bArr2, length);
            } else if (bArr2.length - length == 32) {
                x25519 = new KeyPairGeneratorSpi.X25519(bArr2, length);
            } else {
                throw new InvalidKeySpecException("raw key data not recognised");
            }
            this.Cardinal = x25519;
            return;
        }
        throw new InvalidKeySpecException("raw key data not recognised");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        configure(SubjectPublicKeyInfo.configure((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCEdDSAPublicKey)) {
            return false;
        }
        return getBackgroundColor.Cardinal(((BCEdDSAPublicKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.Cardinal instanceof BCElGamalPublicKey ? "Ed448" : "Ed25519";
    }

    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return getBackgroundColor.init(getEncoded());
    }

    public String toString() {
        return Utils.Cardinal("Public Key", getAlgorithm(), this.Cardinal);
    }

    private void configure(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        if (X509.Mappings.init.equals(subjectPublicKeyInfo.cca_continue.cca_continue)) {
            this.Cardinal = new BCElGamalPublicKey(subjectPublicKeyInfo.Cardinal.init(), 0);
        } else {
            this.Cardinal = new KeyPairGeneratorSpi.X25519(subjectPublicKeyInfo.Cardinal.init(), 0);
        }
    }

    public byte[] getEncoded() {
        if (this.Cardinal instanceof BCElGamalPublicKey) {
            byte[] bArr = new byte[(KeyFactorySpi.Cardinal.length + 57)];
            System.arraycopy(KeyFactorySpi.Cardinal, 0, bArr, 0, KeyFactorySpi.Cardinal.length);
            System.arraycopy(((BCElGamalPublicKey) this.Cardinal).configure, 0, bArr, KeyFactorySpi.Cardinal.length, 57);
            return bArr;
        }
        byte[] bArr2 = new byte[(KeyFactorySpi.getInstance.length + 32)];
        System.arraycopy(KeyFactorySpi.getInstance, 0, bArr2, 0, KeyFactorySpi.getInstance.length);
        System.arraycopy(((KeyPairGeneratorSpi.X25519) this.Cardinal).getInstance, 0, bArr2, KeyFactorySpi.getInstance.length, 32);
        return bArr2;
    }
}
