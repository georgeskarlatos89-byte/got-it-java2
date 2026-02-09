package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.edec;

import com.cardinalcommerce.a.BCElGamalPublicKey;
import com.cardinalcommerce.a.Base64URL;
import com.cardinalcommerce.a.CipherSpi;
import com.cardinalcommerce.a.Curve;
import com.cardinalcommerce.a.GMCipherSpi;
import com.cardinalcommerce.a.KeyPairGeneratorSpi;
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

public class BCEdDSAPrivateKey implements GMCipherSpi.SM2withRMD, PrivateKey {
    private final byte[] configure;
    private final boolean getInstance;
    transient setCCAImageUri init;

    BCEdDSAPrivateKey(setCCAImageUri setccaimageuri) {
        this.getInstance = true;
        this.configure = null;
        this.init = setccaimageuri;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        cca_continue(PrivateKeyInfo.cca_continue((byte[]) objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCEdDSAPrivateKey)) {
            return false;
        }
        return getBackgroundColor.Cardinal(((BCEdDSAPrivateKey) obj).getEncoded(), getEncoded());
    }

    public String getAlgorithm() {
        return this.init instanceof CipherSpi ? "Ed448" : "Ed25519";
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return getBackgroundColor.init(getEncoded());
    }

    BCEdDSAPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.getInstance = privateKeyInfo.configure != null;
        this.configure = privateKeyInfo.getInstance != null ? privateKeyInfo.getInstance.getEncoded() : null;
        cca_continue(privateKeyInfo);
    }

    private void cca_continue(PrivateKeyInfo privateKeyInfo) throws IOException {
        getThreeDSRequestorAppURL Cardinal = getThreeDSRequestorAppURL.Cardinal(privateKeyInfo.Cardinal.getInstance());
        this.init = X509.Mappings.init.equals(privateKeyInfo.cca_continue.cca_continue) ? new CipherSpi(setUICustomization.init(Cardinal).getInstance()) : new KeyPairGeneratorSpi.X448(setUICustomization.init(Cardinal).getInstance());
    }

    public byte[] getEncoded() {
        try {
            setEnableDFSync cca_continue = setEnableDFSync.cca_continue(this.configure);
            PrivateKeyInfo instance = PSSSignatureSpi.nonePSS.getInstance(this.init, cca_continue);
            if (this.getInstance) {
                return instance.getEncoded();
            }
            return new PrivateKeyInfo(instance.cca_continue, getThreeDSRequestorAppURL.Cardinal(instance.Cardinal.getInstance()), cca_continue).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public String toString() {
        setCCAImageUri setccaimageuri;
        setCCAImageUri setccaimageuri2 = this.init;
        if (setccaimageuri2 instanceof CipherSpi) {
            byte[] bArr = new byte[57];
            Base64URL.configure(((CipherSpi) setccaimageuri2).Cardinal, bArr);
            setccaimageuri = new BCElGamalPublicKey(bArr, 0);
        } else {
            byte[] bArr2 = new byte[32];
            Curve.configure(((KeyPairGeneratorSpi.X448) setccaimageuri2).getInstance, bArr2);
            setccaimageuri = new KeyPairGeneratorSpi.X25519(bArr2, 0);
        }
        return Utils.Cardinal("Private Key", getAlgorithm(), setccaimageuri);
    }
}
