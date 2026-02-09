package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.ConcatKDF;
import com.cardinalcommerce.a.DigestSignatureSpi;
import com.cardinalcommerce.a.ECKey;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.PSSSignatureSpi;
import com.cardinalcommerce.a.X509;
import com.cardinalcommerce.a.getBackgroundColor;
import com.cardinalcommerce.a.getThreeDSRequestorAppURL;
import com.cardinalcommerce.a.setCCAImageUri;
import com.cardinalcommerce.a.setEnableDFSync;
import com.cardinalcommerce.a.setUICustomization;
import com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class BCXDHPrivateKey implements GMCipherSpi.SM2withRMD, PrivateKey {
    private final byte[] Cardinal;
    private final boolean cca_continue;
    transient setCCAImageUri getInstance;

    BCXDHPrivateKey(setCCAImageUri setccaimageuri) {
        this.cca_continue = true;
        this.Cardinal = null;
        this.getInstance = setccaimageuri;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Cardinal(PrivateKeyInfo.cca_continue((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCXDHPrivateKey)) {
            return false;
        }
        return getBackgroundColor.Cardinal(((BCXDHPrivateKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.getInstance instanceof DigestSignatureSpi.SHA3_384 ? "X448" : "X25519";
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return getBackgroundColor.init(getEncoded());
    }

    BCXDHPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.cca_continue = privateKeyInfo.configure != null;
        this.Cardinal = privateKeyInfo.getInstance != null ? privateKeyInfo.getInstance.getEncoded() : null;
        Cardinal(privateKeyInfo);
    }

    private void Cardinal(PrivateKeyInfo privateKeyInfo) throws IOException {
        getThreeDSRequestorAppURL Cardinal2 = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance());
        this.getInstance = X509.Mappings.configure.equals(privateKeyInfo.cca_continue.cca_continue) ? new DigestSignatureSpi.SHA3_384(setUICustomization.init(Cardinal2).getInstance()) : new DigestSignatureSpi.RIPEMD160(setUICustomization.init(Cardinal2).getInstance());
    }

    public byte[] getEncoded() {
        try {
            setEnableDFSync cca_continue2 = setEnableDFSync.cca_continue(this.Cardinal);
            PrivateKeyInfo instance = PSSSignatureSpi.nonePSS.getInstance(this.getInstance, cca_continue2);
            if (this.cca_continue) {
                return instance.getEncoded();
            }
            return new PrivateKeyInfo(instance.cca_continue, getThreeDSRequestorAppURL.Cardinal(instance.Cardinal.getInstance()), cca_continue2).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String toString() {
        setCCAImageUri setccaimageuri;
        setCCAImageUri setccaimageuri2 = this.getInstance;
        if (setccaimageuri2 instanceof DigestSignatureSpi.SHA3_384) {
            byte[] bArr = new byte[56];
            ConcatKDF.cca_continue(((DigestSignatureSpi.SHA3_384) setccaimageuri2).cca_continue, 0, bArr, 0);
            setccaimageuri = new DigestSignatureSpi.SHA3_512(bArr, 0);
        } else {
            byte[] bArr2 = new byte[32];
            ECKey.Cardinal(((DigestSignatureSpi.RIPEMD160) setccaimageuri2).getInstance, 0, bArr2, 0);
            setccaimageuri = new DigestSignatureSpi.SHA3_224(bArr2, 0);
        }
        return Utils.Cardinal("Private Key", getAlgorithm(), setccaimageuri);
    }
}
